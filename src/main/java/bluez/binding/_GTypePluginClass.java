// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GTypePluginClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("base_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("use_plugin"),
        Constants$root.C_POINTER$LAYOUT.withName("unuse_plugin"),
        Constants$root.C_POINTER$LAYOUT.withName("complete_type_info"),
        Constants$root.C_POINTER$LAYOUT.withName("complete_interface_info")
    ).withName("_GTypePluginClass");
    public static MemoryLayout $LAYOUT() {
        return _GTypePluginClass.$struct$LAYOUT;
    }
    public static MemorySegment base_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle use_plugin$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("use_plugin"));
    public static VarHandle use_plugin$VH() {
        return _GTypePluginClass.use_plugin$VH;
    }
    public static MemoryAddress use_plugin$get(MemorySegment seg) {
        return (MemoryAddress)_GTypePluginClass.use_plugin$VH.get(seg);
    }
    public static void use_plugin$set( MemorySegment seg, MemoryAddress x) {
        _GTypePluginClass.use_plugin$VH.set(seg, x);
    }
    public static MemoryAddress use_plugin$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypePluginClass.use_plugin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void use_plugin$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypePluginClass.use_plugin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GTypePluginUse use_plugin (MemorySegment segment, ResourceScope scope) {
        return GTypePluginUse.ofAddress(use_plugin$get(segment), scope);
    }
    static final VarHandle unuse_plugin$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("unuse_plugin"));
    public static VarHandle unuse_plugin$VH() {
        return _GTypePluginClass.unuse_plugin$VH;
    }
    public static MemoryAddress unuse_plugin$get(MemorySegment seg) {
        return (MemoryAddress)_GTypePluginClass.unuse_plugin$VH.get(seg);
    }
    public static void unuse_plugin$set( MemorySegment seg, MemoryAddress x) {
        _GTypePluginClass.unuse_plugin$VH.set(seg, x);
    }
    public static MemoryAddress unuse_plugin$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypePluginClass.unuse_plugin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unuse_plugin$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypePluginClass.unuse_plugin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GTypePluginUnuse unuse_plugin (MemorySegment segment, ResourceScope scope) {
        return GTypePluginUnuse.ofAddress(unuse_plugin$get(segment), scope);
    }
    static final VarHandle complete_type_info$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("complete_type_info"));
    public static VarHandle complete_type_info$VH() {
        return _GTypePluginClass.complete_type_info$VH;
    }
    public static MemoryAddress complete_type_info$get(MemorySegment seg) {
        return (MemoryAddress)_GTypePluginClass.complete_type_info$VH.get(seg);
    }
    public static void complete_type_info$set( MemorySegment seg, MemoryAddress x) {
        _GTypePluginClass.complete_type_info$VH.set(seg, x);
    }
    public static MemoryAddress complete_type_info$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypePluginClass.complete_type_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void complete_type_info$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypePluginClass.complete_type_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GTypePluginCompleteTypeInfo complete_type_info (MemorySegment segment, ResourceScope scope) {
        return GTypePluginCompleteTypeInfo.ofAddress(complete_type_info$get(segment), scope);
    }
    static final VarHandle complete_interface_info$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("complete_interface_info"));
    public static VarHandle complete_interface_info$VH() {
        return _GTypePluginClass.complete_interface_info$VH;
    }
    public static MemoryAddress complete_interface_info$get(MemorySegment seg) {
        return (MemoryAddress)_GTypePluginClass.complete_interface_info$VH.get(seg);
    }
    public static void complete_interface_info$set( MemorySegment seg, MemoryAddress x) {
        _GTypePluginClass.complete_interface_info$VH.set(seg, x);
    }
    public static MemoryAddress complete_interface_info$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTypePluginClass.complete_interface_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void complete_interface_info$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypePluginClass.complete_interface_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GTypePluginCompleteInterfaceInfo complete_interface_info (MemorySegment segment, ResourceScope scope) {
        return GTypePluginCompleteInterfaceInfo.ofAddress(complete_interface_info$get(segment), scope);
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

