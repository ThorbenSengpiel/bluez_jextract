// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GRecMutex {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("p"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("i")
    ).withName("_GRecMutex");
    public static MemoryLayout $LAYOUT() {
        return _GRecMutex.$struct$LAYOUT;
    }
    static final VarHandle p$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("p"));
    public static VarHandle p$VH() {
        return _GRecMutex.p$VH;
    }
    public static MemoryAddress p$get(MemorySegment seg) {
        return (MemoryAddress)_GRecMutex.p$VH.get(seg);
    }
    public static void p$set( MemorySegment seg, MemoryAddress x) {
        _GRecMutex.p$VH.set(seg, x);
    }
    public static MemoryAddress p$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GRecMutex.p$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void p$set(MemorySegment seg, long index, MemoryAddress x) {
        _GRecMutex.p$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment i$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
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


