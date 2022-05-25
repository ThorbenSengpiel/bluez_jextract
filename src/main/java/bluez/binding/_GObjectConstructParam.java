// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GObjectConstructParam {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pspec"),
        Constants$root.C_POINTER$LAYOUT.withName("value")
    ).withName("_GObjectConstructParam");
    public static MemoryLayout $LAYOUT() {
        return _GObjectConstructParam.$struct$LAYOUT;
    }
    static final VarHandle pspec$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pspec"));
    public static VarHandle pspec$VH() {
        return _GObjectConstructParam.pspec$VH;
    }
    public static MemoryAddress pspec$get(MemorySegment seg) {
        return (MemoryAddress)_GObjectConstructParam.pspec$VH.get(seg);
    }
    public static void pspec$set( MemorySegment seg, MemoryAddress x) {
        _GObjectConstructParam.pspec$VH.set(seg, x);
    }
    public static MemoryAddress pspec$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GObjectConstructParam.pspec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pspec$set(MemorySegment seg, long index, MemoryAddress x) {
        _GObjectConstructParam.pspec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _GObjectConstructParam.value$VH;
    }
    public static MemoryAddress value$get(MemorySegment seg) {
        return (MemoryAddress)_GObjectConstructParam.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, MemoryAddress x) {
        _GObjectConstructParam.value$VH.set(seg, x);
    }
    public static MemoryAddress value$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GObjectConstructParam.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, MemoryAddress x) {
        _GObjectConstructParam.value$VH.set(seg.asSlice(index*sizeof()), x);
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


