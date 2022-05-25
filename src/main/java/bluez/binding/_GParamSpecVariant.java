// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GParamSpecVariant {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
        ).withName("parent_instance"),
        Constants$root.C_POINTER$LAYOUT.withName("type"),
        Constants$root.C_POINTER$LAYOUT.withName("default_value"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GParamSpecVariant");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecVariant.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GParamSpecVariant.type$VH;
    }
    public static MemoryAddress type$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecVariant.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecVariant.type$VH.set(seg, x);
    }
    public static MemoryAddress type$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecVariant.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecVariant.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle default_value$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("default_value"));
    public static VarHandle default_value$VH() {
        return _GParamSpecVariant.default_value$VH;
    }
    public static MemoryAddress default_value$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecVariant.default_value$VH.get(seg);
    }
    public static void default_value$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecVariant.default_value$VH.set(seg, x);
    }
    public static MemoryAddress default_value$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecVariant.default_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void default_value$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecVariant.default_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(88, 32);
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


