package de.pdbm;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import jdk.incubator.foreign.ValueLayout;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

/**
 * Simple example to call C from Java as well as Java from C
 * 
 * <p>
 * Based on https://github.com/openjdk/panama-foreign/blob/foreign-jextract/doc/panama_ffi.md
 * 
 * @author bernd
 *
 */
public class Quicksort {

	public static void main(String[] args) throws Throwable {
		qsort();
	}
	
    static class IntComparator {
    	
        static int compare(MemoryAddress addr1, MemoryAddress addr2) {
        	return addr1.get(ValueLayout.JAVA_INT, 0) - addr2.get(ValueLayout.JAVA_INT, 0);
        }

    }

    public static void qsort() throws Throwable {
    	
    	MethodHandle qsort = CLinker.systemCLinker().downcallHandle(
    	  	    CLinker.systemCLinker().lookup("qsort").get(),
        	    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        	);

        FunctionDescriptor compareDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        MethodHandle compareHandle = MethodHandles.lookup().findStatic(IntComparator.class,
                                                        "compare",
                                                        CLinker.upcallType(compareDescriptor));
        
        try (ResourceScope scope = ResourceScope.newConfinedScope()) {
        	Addressable comparFunc = CLinker.systemCLinker().upcallStub(compareHandle, compareDescriptor, scope);
        	MemorySegment array = SegmentAllocator.nativeAllocator(scope).allocateArray(ValueLayout.JAVA_INT, 
        			new int[] { 0, 9, 3, 4, 6, 5, 1, 8, 2, 7 });
        	qsort.invokeExact((Addressable)array.address(), 10L, 4L, comparFunc);
        	int[] sorted = array.toArray(ValueLayout.JAVA_INT); // [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ]
        	System.out.println(Arrays.toString(sorted));
        }
        
    }
	
}
