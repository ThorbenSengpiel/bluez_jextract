// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GValueArray {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("n_values"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("values"),
        Constants$root.C_INT$LAYOUT.withName("n_prealloced"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GValueArray");
    public static MemoryLayout $LAYOUT() {
        return _GValueArray.$struct$LAYOUT;
    }
    static final VarHandle n_values$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("n_values"));
    public static VarHandle n_values$VH() {
        return _GValueArray.n_values$VH;
    }
    public static int n_values$get(MemorySegment seg) {
        return (int)_GValueArray.n_values$VH.get(seg);
    }
    public static void n_values$set( MemorySegment seg, int x) {
        _GValueArray.n_values$VH.set(seg, x);
    }
    public static int n_values$get(MemorySegment seg, long index) {
        return (int)_GValueArray.n_values$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_values$set(MemorySegment seg, long index, int x) {
        _GValueArray.n_values$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle values$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("values"));
    public static VarHandle values$VH() {
        return _GValueArray.values$VH;
    }
    public static MemoryAddress values$get(MemorySegment seg) {
        return (MemoryAddress)_GValueArray.values$VH.get(seg);
    }
    public static void values$set( MemorySegment seg, MemoryAddress x) {
        _GValueArray.values$VH.set(seg, x);
    }
    public static MemoryAddress values$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GValueArray.values$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void values$set(MemorySegment seg, long index, MemoryAddress x) {
        _GValueArray.values$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n_prealloced$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("n_prealloced"));
    public static VarHandle n_prealloced$VH() {
        return _GValueArray.n_prealloced$VH;
    }
    public static int n_prealloced$get(MemorySegment seg) {
        return (int)_GValueArray.n_prealloced$VH.get(seg);
    }
    public static void n_prealloced$set( MemorySegment seg, int x) {
        _GValueArray.n_prealloced$VH.set(seg, x);
    }
    public static int n_prealloced$get(MemorySegment seg, long index) {
        return (int)_GValueArray.n_prealloced$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_prealloced$set(MemorySegment seg, long index, int x) {
        _GValueArray.n_prealloced$VH.set(seg.asSlice(index*sizeof()), x);
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


