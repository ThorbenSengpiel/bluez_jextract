// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GParamSpec {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("g_class")
        ).withName("g_type_instance"),
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("value_type"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("owner_type"),
        Constants$root.C_POINTER$LAYOUT.withName("_nick"),
        Constants$root.C_POINTER$LAYOUT.withName("_blurb"),
        Constants$root.C_POINTER$LAYOUT.withName("qdata"),
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        Constants$root.C_INT$LAYOUT.withName("param_id")
    ).withName("_GParamSpec");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpec.$struct$LAYOUT;
    }
    public static MemorySegment g_type_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GParamSpec.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpec.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpec.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpec.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpec.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _GParamSpec.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)_GParamSpec.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        _GParamSpec.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)_GParamSpec.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        _GParamSpec.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value_type"));
    public static VarHandle value_type$VH() {
        return _GParamSpec.value_type$VH;
    }
    public static long value_type$get(MemorySegment seg) {
        return (long)_GParamSpec.value_type$VH.get(seg);
    }
    public static void value_type$set( MemorySegment seg, long x) {
        _GParamSpec.value_type$VH.set(seg, x);
    }
    public static long value_type$get(MemorySegment seg, long index) {
        return (long)_GParamSpec.value_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_type$set(MemorySegment seg, long index, long x) {
        _GParamSpec.value_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle owner_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("owner_type"));
    public static VarHandle owner_type$VH() {
        return _GParamSpec.owner_type$VH;
    }
    public static long owner_type$get(MemorySegment seg) {
        return (long)_GParamSpec.owner_type$VH.get(seg);
    }
    public static void owner_type$set( MemorySegment seg, long x) {
        _GParamSpec.owner_type$VH.set(seg, x);
    }
    public static long owner_type$get(MemorySegment seg, long index) {
        return (long)_GParamSpec.owner_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void owner_type$set(MemorySegment seg, long index, long x) {
        _GParamSpec.owner_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _nick$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_nick"));
    public static VarHandle _nick$VH() {
        return _GParamSpec._nick$VH;
    }
    public static MemoryAddress _nick$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpec._nick$VH.get(seg);
    }
    public static void _nick$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpec._nick$VH.set(seg, x);
    }
    public static MemoryAddress _nick$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpec._nick$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _nick$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpec._nick$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _blurb$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_blurb"));
    public static VarHandle _blurb$VH() {
        return _GParamSpec._blurb$VH;
    }
    public static MemoryAddress _blurb$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpec._blurb$VH.get(seg);
    }
    public static void _blurb$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpec._blurb$VH.set(seg, x);
    }
    public static MemoryAddress _blurb$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpec._blurb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _blurb$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpec._blurb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle qdata$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("qdata"));
    public static VarHandle qdata$VH() {
        return _GParamSpec.qdata$VH;
    }
    public static MemoryAddress qdata$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpec.qdata$VH.get(seg);
    }
    public static void qdata$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpec.qdata$VH.set(seg, x);
    }
    public static MemoryAddress qdata$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpec.qdata$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void qdata$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpec.qdata$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GParamSpec.ref_count$VH;
    }
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GParamSpec.ref_count$VH.get(seg);
    }
    public static void ref_count$set( MemorySegment seg, int x) {
        _GParamSpec.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GParamSpec.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GParamSpec.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle param_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("param_id"));
    public static VarHandle param_id$VH() {
        return _GParamSpec.param_id$VH;
    }
    public static int param_id$get(MemorySegment seg) {
        return (int)_GParamSpec.param_id$VH.get(seg);
    }
    public static void param_id$set( MemorySegment seg, int x) {
        _GParamSpec.param_id$VH.set(seg, x);
    }
    public static int param_id$get(MemorySegment seg, long index) {
        return (int)_GParamSpec.param_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void param_id$set(MemorySegment seg, long index, int x) {
        _GParamSpec.param_id$VH.set(seg.asSlice(index*sizeof()), x);
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

