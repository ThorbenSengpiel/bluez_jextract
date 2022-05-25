// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GCClosure {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(15).withName("ref_count"),
                MemoryLayout.paddingLayout(1).withName("meta_marshal_nouse"),
                MemoryLayout.paddingLayout(1).withName("n_guards"),
                MemoryLayout.paddingLayout(2).withName("n_fnotifiers"),
                MemoryLayout.paddingLayout(8).withName("n_inotifiers"),
                MemoryLayout.paddingLayout(1).withName("in_inotify"),
                MemoryLayout.paddingLayout(1).withName("floating"),
                MemoryLayout.paddingLayout(1).withName("derivative_flag"),
                MemoryLayout.paddingLayout(1).withName("in_marshal"),
                MemoryLayout.paddingLayout(1).withName("is_invalid"),
                MemoryLayout.paddingLayout(32)
            ),
            Constants$root.C_POINTER$LAYOUT.withName("marshal"),
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_POINTER$LAYOUT.withName("notifiers")
        ).withName("closure"),
        Constants$root.C_POINTER$LAYOUT.withName("callback")
    ).withName("_GCClosure");
    public static MemoryLayout $LAYOUT() {
        return _GCClosure.$struct$LAYOUT;
    }
    public static MemorySegment closure$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle callback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callback"));
    public static VarHandle callback$VH() {
        return _GCClosure.callback$VH;
    }
    public static MemoryAddress callback$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GCClosure.callback$VH.get(seg);
    }
    public static void callback$set( MemorySegment seg, MemoryAddress x) {
        _GCClosure.callback$VH.set(seg, x);
    }
    public static MemoryAddress callback$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GCClosure.callback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callback$set(MemorySegment seg, long index, MemoryAddress x) {
        _GCClosure.callback$VH.set(seg.asSlice(index*sizeof()), x);
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


