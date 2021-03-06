// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GTypeInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("class_size"),
        MemoryLayout.paddingLayout(48),
        Constants$root.C_POINTER$LAYOUT.withName("base_init"),
        Constants$root.C_POINTER$LAYOUT.withName("base_finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("class_init"),
        Constants$root.C_POINTER$LAYOUT.withName("class_finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("class_data"),
        Constants$root.C_SHORT$LAYOUT.withName("instance_size"),
        Constants$root.C_SHORT$LAYOUT.withName("n_preallocs"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("instance_init"),
        Constants$root.C_POINTER$LAYOUT.withName("value_table")
    ).withName("_GTypeInfo");
    public static MemoryLayout $LAYOUT() {
        return _GTypeInfo.$struct$LAYOUT;
    }
    static final VarHandle class_size$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("class_size"));
    public static VarHandle class_size$VH() {
        return _GTypeInfo.class_size$VH;
    }
    public static short class_size$get(MemorySegment seg) {
        return (short)_GTypeInfo.class_size$VH.get(seg);
    }
    public static void class_size$set( MemorySegment seg, short x) {
        _GTypeInfo.class_size$VH.set(seg, x);
    }
    public static short class_size$get(MemorySegment seg, long index) {
        return (short)_GTypeInfo.class_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_size$set(MemorySegment seg, long index, short x) {
        _GTypeInfo.class_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle base_init$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("base_init"));
    public static VarHandle base_init$VH() {
        return _GTypeInfo.base_init$VH;
    }
    public static MemoryAddress base_init$get(MemorySegment seg) {
        return (MemoryAddress)_GTypeInfo.base_init$VH.get(seg);
    }
    public static void base_init$set( MemorySegment seg, MemoryAddress x) {
        _GTypeInfo.base_init$VH.set(seg, x);
    }
    public static MemoryAddress base_init$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypeInfo.base_init$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void base_init$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeInfo.base_init$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GBaseInitFunc base_init (MemorySegment segment, ResourceScope scope) {
        return GBaseInitFunc.ofAddress(base_init$get(segment), scope);
    }
    static final VarHandle base_finalize$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("base_finalize"));
    public static VarHandle base_finalize$VH() {
        return _GTypeInfo.base_finalize$VH;
    }
    public static MemoryAddress base_finalize$get(MemorySegment seg) {
        return (MemoryAddress)_GTypeInfo.base_finalize$VH.get(seg);
    }
    public static void base_finalize$set( MemorySegment seg, MemoryAddress x) {
        _GTypeInfo.base_finalize$VH.set(seg, x);
    }
    public static MemoryAddress base_finalize$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypeInfo.base_finalize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void base_finalize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeInfo.base_finalize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GBaseFinalizeFunc base_finalize (MemorySegment segment, ResourceScope scope) {
        return GBaseFinalizeFunc.ofAddress(base_finalize$get(segment), scope);
    }
    static final VarHandle class_init$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("class_init"));
    public static VarHandle class_init$VH() {
        return _GTypeInfo.class_init$VH;
    }
    public static MemoryAddress class_init$get(MemorySegment seg) {
        return (MemoryAddress)_GTypeInfo.class_init$VH.get(seg);
    }
    public static void class_init$set( MemorySegment seg, MemoryAddress x) {
        _GTypeInfo.class_init$VH.set(seg, x);
    }
    public static MemoryAddress class_init$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypeInfo.class_init$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_init$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeInfo.class_init$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GClassInitFunc class_init (MemorySegment segment, ResourceScope scope) {
        return GClassInitFunc.ofAddress(class_init$get(segment), scope);
    }
    static final VarHandle class_finalize$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("class_finalize"));
    public static VarHandle class_finalize$VH() {
        return _GTypeInfo.class_finalize$VH;
    }
    public static MemoryAddress class_finalize$get(MemorySegment seg) {
        return (MemoryAddress)_GTypeInfo.class_finalize$VH.get(seg);
    }
    public static void class_finalize$set( MemorySegment seg, MemoryAddress x) {
        _GTypeInfo.class_finalize$VH.set(seg, x);
    }
    public static MemoryAddress class_finalize$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypeInfo.class_finalize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_finalize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeInfo.class_finalize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GClassFinalizeFunc class_finalize (MemorySegment segment, ResourceScope scope) {
        return GClassFinalizeFunc.ofAddress(class_finalize$get(segment), scope);
    }
    static final VarHandle class_data$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("class_data"));
    public static VarHandle class_data$VH() {
        return _GTypeInfo.class_data$VH;
    }
    public static MemoryAddress class_data$get(MemorySegment seg) {
        return (MemoryAddress)_GTypeInfo.class_data$VH.get(seg);
    }
    public static void class_data$set( MemorySegment seg, MemoryAddress x) {
        _GTypeInfo.class_data$VH.set(seg, x);
    }
    public static MemoryAddress class_data$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypeInfo.class_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_data$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeInfo.class_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle instance_size$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("instance_size"));
    public static VarHandle instance_size$VH() {
        return _GTypeInfo.instance_size$VH;
    }
    public static short instance_size$get(MemorySegment seg) {
        return (short)_GTypeInfo.instance_size$VH.get(seg);
    }
    public static void instance_size$set( MemorySegment seg, short x) {
        _GTypeInfo.instance_size$VH.set(seg, x);
    }
    public static short instance_size$get(MemorySegment seg, long index) {
        return (short)_GTypeInfo.instance_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void instance_size$set(MemorySegment seg, long index, short x) {
        _GTypeInfo.instance_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n_preallocs$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("n_preallocs"));
    public static VarHandle n_preallocs$VH() {
        return _GTypeInfo.n_preallocs$VH;
    }
    public static short n_preallocs$get(MemorySegment seg) {
        return (short)_GTypeInfo.n_preallocs$VH.get(seg);
    }
    public static void n_preallocs$set( MemorySegment seg, short x) {
        _GTypeInfo.n_preallocs$VH.set(seg, x);
    }
    public static short n_preallocs$get(MemorySegment seg, long index) {
        return (short)_GTypeInfo.n_preallocs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_preallocs$set(MemorySegment seg, long index, short x) {
        _GTypeInfo.n_preallocs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle instance_init$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("instance_init"));
    public static VarHandle instance_init$VH() {
        return _GTypeInfo.instance_init$VH;
    }
    public static MemoryAddress instance_init$get(MemorySegment seg) {
        return (MemoryAddress)_GTypeInfo.instance_init$VH.get(seg);
    }
    public static void instance_init$set( MemorySegment seg, MemoryAddress x) {
        _GTypeInfo.instance_init$VH.set(seg, x);
    }
    public static MemoryAddress instance_init$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypeInfo.instance_init$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void instance_init$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeInfo.instance_init$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GInstanceInitFunc instance_init (MemorySegment segment, ResourceScope scope) {
        return GInstanceInitFunc.ofAddress(instance_init$get(segment), scope);
    }
    static final VarHandle value_table$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value_table"));
    public static VarHandle value_table$VH() {
        return _GTypeInfo.value_table$VH;
    }
    public static MemoryAddress value_table$get(MemorySegment seg) {
        return (MemoryAddress)_GTypeInfo.value_table$VH.get(seg);
    }
    public static void value_table$set( MemorySegment seg, MemoryAddress x) {
        _GTypeInfo.value_table$VH.set(seg, x);
    }
    public static MemoryAddress value_table$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypeInfo.value_table$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_table$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeInfo.value_table$VH.set(seg.asSlice(index*sizeof()), x);
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


