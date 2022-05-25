// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class itimerspec {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_nsec")
        ).withName("it_interval"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_nsec")
        ).withName("it_value")
    ).withName("itimerspec");
    public static MemoryLayout $LAYOUT() {
        return itimerspec.$struct$LAYOUT;
    }
    public static MemorySegment it_interval$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment it_value$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
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

