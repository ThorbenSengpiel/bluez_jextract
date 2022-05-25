// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GSignalQuery {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("signal_id"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("signal_name"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("itype"),
        Constants$root.C_INT$LAYOUT.withName("signal_flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("return_type"),
        Constants$root.C_INT$LAYOUT.withName("n_params"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("param_types")
    ).withName("_GSignalQuery");
    public static MemoryLayout $LAYOUT() {
        return _GSignalQuery.$struct$LAYOUT;
    }
    static final VarHandle signal_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("signal_id"));
    public static VarHandle signal_id$VH() {
        return _GSignalQuery.signal_id$VH;
    }
    public static int signal_id$get(MemorySegment seg) {
        return (int)_GSignalQuery.signal_id$VH.get(seg);
    }
    public static void signal_id$set( MemorySegment seg, int x) {
        _GSignalQuery.signal_id$VH.set(seg, x);
    }
    public static int signal_id$get(MemorySegment seg, long index) {
        return (int)_GSignalQuery.signal_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signal_id$set(MemorySegment seg, long index, int x) {
        _GSignalQuery.signal_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle signal_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("signal_name"));
    public static VarHandle signal_name$VH() {
        return _GSignalQuery.signal_name$VH;
    }
    public static MemoryAddress signal_name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GSignalQuery.signal_name$VH.get(seg);
    }
    public static void signal_name$set( MemorySegment seg, MemoryAddress x) {
        _GSignalQuery.signal_name$VH.set(seg, x);
    }
    public static MemoryAddress signal_name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GSignalQuery.signal_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signal_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSignalQuery.signal_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itype"));
    public static VarHandle itype$VH() {
        return _GSignalQuery.itype$VH;
    }
    public static long itype$get(MemorySegment seg) {
        return (long)_GSignalQuery.itype$VH.get(seg);
    }
    public static void itype$set( MemorySegment seg, long x) {
        _GSignalQuery.itype$VH.set(seg, x);
    }
    public static long itype$get(MemorySegment seg, long index) {
        return (long)_GSignalQuery.itype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itype$set(MemorySegment seg, long index, long x) {
        _GSignalQuery.itype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle signal_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("signal_flags"));
    public static VarHandle signal_flags$VH() {
        return _GSignalQuery.signal_flags$VH;
    }
    public static int signal_flags$get(MemorySegment seg) {
        return (int)_GSignalQuery.signal_flags$VH.get(seg);
    }
    public static void signal_flags$set( MemorySegment seg, int x) {
        _GSignalQuery.signal_flags$VH.set(seg, x);
    }
    public static int signal_flags$get(MemorySegment seg, long index) {
        return (int)_GSignalQuery.signal_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signal_flags$set(MemorySegment seg, long index, int x) {
        _GSignalQuery.signal_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle return_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("return_type"));
    public static VarHandle return_type$VH() {
        return _GSignalQuery.return_type$VH;
    }
    public static long return_type$get(MemorySegment seg) {
        return (long)_GSignalQuery.return_type$VH.get(seg);
    }
    public static void return_type$set( MemorySegment seg, long x) {
        _GSignalQuery.return_type$VH.set(seg, x);
    }
    public static long return_type$get(MemorySegment seg, long index) {
        return (long)_GSignalQuery.return_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void return_type$set(MemorySegment seg, long index, long x) {
        _GSignalQuery.return_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n_params$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("n_params"));
    public static VarHandle n_params$VH() {
        return _GSignalQuery.n_params$VH;
    }
    public static int n_params$get(MemorySegment seg) {
        return (int)_GSignalQuery.n_params$VH.get(seg);
    }
    public static void n_params$set( MemorySegment seg, int x) {
        _GSignalQuery.n_params$VH.set(seg, x);
    }
    public static int n_params$get(MemorySegment seg, long index) {
        return (int)_GSignalQuery.n_params$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_params$set(MemorySegment seg, long index, int x) {
        _GSignalQuery.n_params$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle param_types$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("param_types"));
    public static VarHandle param_types$VH() {
        return _GSignalQuery.param_types$VH;
    }
    public static MemoryAddress param_types$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GSignalQuery.param_types$VH.get(seg);
    }
    public static void param_types$set( MemorySegment seg, MemoryAddress x) {
        _GSignalQuery.param_types$VH.set(seg, x);
    }
    public static MemoryAddress param_types$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GSignalQuery.param_types$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void param_types$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSignalQuery.param_types$VH.set(seg.asSlice(index*sizeof()), x);
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


