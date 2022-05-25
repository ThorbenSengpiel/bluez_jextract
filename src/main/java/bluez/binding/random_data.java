// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class random_data {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("fptr"),
        Constants$root.C_POINTER$LAYOUT.withName("rptr"),
        Constants$root.C_POINTER$LAYOUT.withName("state"),
        Constants$root.C_INT$LAYOUT.withName("rand_type"),
        Constants$root.C_INT$LAYOUT.withName("rand_deg"),
        Constants$root.C_INT$LAYOUT.withName("rand_sep"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("end_ptr")
    ).withName("random_data");
    public static MemoryLayout $LAYOUT() {
        return random_data.$struct$LAYOUT;
    }
    static final VarHandle fptr$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("fptr"));
    public static VarHandle fptr$VH() {
        return random_data.fptr$VH;
    }
    public static MemoryAddress fptr$get(MemorySegment seg) {
        return (MemoryAddress)random_data.fptr$VH.get(seg);
    }
    public static void fptr$set( MemorySegment seg, MemoryAddress x) {
        random_data.fptr$VH.set(seg, x);
    }
    public static MemoryAddress fptr$get(MemorySegment seg, long index) {
        return (MemoryAddress)random_data.fptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fptr$set(MemorySegment seg, long index, MemoryAddress x) {
        random_data.fptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rptr$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("rptr"));
    public static VarHandle rptr$VH() {
        return random_data.rptr$VH;
    }
    public static MemoryAddress rptr$get(MemorySegment seg) {
        return (MemoryAddress)random_data.rptr$VH.get(seg);
    }
    public static void rptr$set( MemorySegment seg, MemoryAddress x) {
        random_data.rptr$VH.set(seg, x);
    }
    public static MemoryAddress rptr$get(MemorySegment seg, long index) {
        return (MemoryAddress)random_data.rptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rptr$set(MemorySegment seg, long index, MemoryAddress x) {
        random_data.rptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return random_data.state$VH;
    }
    public static MemoryAddress state$get(MemorySegment seg) {
        return (MemoryAddress)random_data.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, MemoryAddress x) {
        random_data.state$VH.set(seg, x);
    }
    public static MemoryAddress state$get(MemorySegment seg, long index) {
        return (MemoryAddress)random_data.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, MemoryAddress x) {
        random_data.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rand_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("rand_type"));
    public static VarHandle rand_type$VH() {
        return random_data.rand_type$VH;
    }
    public static int rand_type$get(MemorySegment seg) {
        return (int)random_data.rand_type$VH.get(seg);
    }
    public static void rand_type$set( MemorySegment seg, int x) {
        random_data.rand_type$VH.set(seg, x);
    }
    public static int rand_type$get(MemorySegment seg, long index) {
        return (int)random_data.rand_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rand_type$set(MemorySegment seg, long index, int x) {
        random_data.rand_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rand_deg$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("rand_deg"));
    public static VarHandle rand_deg$VH() {
        return random_data.rand_deg$VH;
    }
    public static int rand_deg$get(MemorySegment seg) {
        return (int)random_data.rand_deg$VH.get(seg);
    }
    public static void rand_deg$set( MemorySegment seg, int x) {
        random_data.rand_deg$VH.set(seg, x);
    }
    public static int rand_deg$get(MemorySegment seg, long index) {
        return (int)random_data.rand_deg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rand_deg$set(MemorySegment seg, long index, int x) {
        random_data.rand_deg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rand_sep$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("rand_sep"));
    public static VarHandle rand_sep$VH() {
        return random_data.rand_sep$VH;
    }
    public static int rand_sep$get(MemorySegment seg) {
        return (int)random_data.rand_sep$VH.get(seg);
    }
    public static void rand_sep$set( MemorySegment seg, int x) {
        random_data.rand_sep$VH.set(seg, x);
    }
    public static int rand_sep$get(MemorySegment seg, long index) {
        return (int)random_data.rand_sep$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rand_sep$set(MemorySegment seg, long index, int x) {
        random_data.rand_sep$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle end_ptr$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("end_ptr"));
    public static VarHandle end_ptr$VH() {
        return random_data.end_ptr$VH;
    }
    public static MemoryAddress end_ptr$get(MemorySegment seg) {
        return (MemoryAddress)random_data.end_ptr$VH.get(seg);
    }
    public static void end_ptr$set( MemorySegment seg, MemoryAddress x) {
        random_data.end_ptr$VH.set(seg, x);
    }
    public static MemoryAddress end_ptr$get(MemorySegment seg, long index) {
        return (MemoryAddress)random_data.end_ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void end_ptr$set(MemorySegment seg, long index, MemoryAddress x) {
        random_data.end_ptr$VH.set(seg.asSlice(index*sizeof()), x);
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


