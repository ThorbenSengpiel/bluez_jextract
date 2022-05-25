// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _libc_fpxreg {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("significand"),
        Constants$root.C_SHORT$LAYOUT.withName("exponent"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("__glibc_reserved1")
    ).withName("_libc_fpxreg");
    public static MemoryLayout $LAYOUT() {
        return _libc_fpxreg.$struct$LAYOUT;
    }
    public static MemorySegment significand$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle exponent$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("exponent"));
    public static VarHandle exponent$VH() {
        return _libc_fpxreg.exponent$VH;
    }
    public static short exponent$get(MemorySegment seg) {
        return (short)_libc_fpxreg.exponent$VH.get(seg);
    }
    public static void exponent$set( MemorySegment seg, short x) {
        _libc_fpxreg.exponent$VH.set(seg, x);
    }
    public static short exponent$get(MemorySegment seg, long index) {
        return (short)_libc_fpxreg.exponent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void exponent$set(MemorySegment seg, long index, short x) {
        _libc_fpxreg.exponent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __glibc_reserved1$slice(MemorySegment seg) {
        return seg.asSlice(10, 6);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


