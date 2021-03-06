// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GSignalInvocationHint {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("signal_id"),
        Constants$root.C_INT$LAYOUT.withName("detail"),
        Constants$root.C_INT$LAYOUT.withName("run_type")
    ).withName("_GSignalInvocationHint");
    public static MemoryLayout $LAYOUT() {
        return _GSignalInvocationHint.$struct$LAYOUT;
    }
    static final VarHandle signal_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("signal_id"));
    public static VarHandle signal_id$VH() {
        return _GSignalInvocationHint.signal_id$VH;
    }
    public static int signal_id$get(MemorySegment seg) {
        return (int)_GSignalInvocationHint.signal_id$VH.get(seg);
    }
    public static void signal_id$set( MemorySegment seg, int x) {
        _GSignalInvocationHint.signal_id$VH.set(seg, x);
    }
    public static int signal_id$get(MemorySegment seg, long index) {
        return (int)_GSignalInvocationHint.signal_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signal_id$set(MemorySegment seg, long index, int x) {
        _GSignalInvocationHint.signal_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle detail$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("detail"));
    public static VarHandle detail$VH() {
        return _GSignalInvocationHint.detail$VH;
    }
    public static int detail$get(MemorySegment seg) {
        return (int)_GSignalInvocationHint.detail$VH.get(seg);
    }
    public static void detail$set( MemorySegment seg, int x) {
        _GSignalInvocationHint.detail$VH.set(seg, x);
    }
    public static int detail$get(MemorySegment seg, long index) {
        return (int)_GSignalInvocationHint.detail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void detail$set(MemorySegment seg, long index, int x) {
        _GSignalInvocationHint.detail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle run_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("run_type"));
    public static VarHandle run_type$VH() {
        return _GSignalInvocationHint.run_type$VH;
    }
    public static int run_type$get(MemorySegment seg) {
        return (int)_GSignalInvocationHint.run_type$VH.get(seg);
    }
    public static void run_type$set( MemorySegment seg, int x) {
        _GSignalInvocationHint.run_type$VH.set(seg, x);
    }
    public static int run_type$get(MemorySegment seg, long index) {
        return (int)_GSignalInvocationHint.run_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void run_type$set(MemorySegment seg, long index, int x) {
        _GSignalInvocationHint.run_type$VH.set(seg.asSlice(index*sizeof()), x);
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


