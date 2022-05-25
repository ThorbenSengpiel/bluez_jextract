// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GPrivate {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("p"),
        Constants$root.C_POINTER$LAYOUT.withName("notify"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("future")
    ).withName("_GPrivate");
    public static MemoryLayout $LAYOUT() {
        return _GPrivate.$struct$LAYOUT;
    }
    static final VarHandle p$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("p"));
    public static VarHandle p$VH() {
        return _GPrivate.p$VH;
    }
    public static MemoryAddress p$get(MemorySegment seg) {
        return (MemoryAddress)_GPrivate.p$VH.get(seg);
    }
    public static void p$set( MemorySegment seg, MemoryAddress x) {
        _GPrivate.p$VH.set(seg, x);
    }
    public static MemoryAddress p$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GPrivate.p$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void p$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPrivate.p$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle notify$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("notify"));
    public static VarHandle notify$VH() {
        return _GPrivate.notify$VH;
    }
    public static MemoryAddress notify$get(MemorySegment seg) {
        return (MemoryAddress)_GPrivate.notify$VH.get(seg);
    }
    public static void notify$set( MemorySegment seg, MemoryAddress x) {
        _GPrivate.notify$VH.set(seg, x);
    }
    public static MemoryAddress notify$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GPrivate.notify$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void notify$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPrivate.notify$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDestroyNotify notify (MemorySegment segment, ResourceScope scope) {
        return GDestroyNotify.ofAddress(notify$get(segment), scope);
    }
    public static MemorySegment future$slice(MemorySegment seg) {
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

