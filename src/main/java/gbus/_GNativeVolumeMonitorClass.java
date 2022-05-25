// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GNativeVolumeMonitorClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
                ).withName("g_type_class"),
                Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
                Constants$root.C_POINTER$LAYOUT.withName("constructor"),
                Constants$root.C_POINTER$LAYOUT.withName("set_property"),
                Constants$root.C_POINTER$LAYOUT.withName("get_property"),
                Constants$root.C_POINTER$LAYOUT.withName("dispose"),
                Constants$root.C_POINTER$LAYOUT.withName("finalize"),
                Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
                Constants$root.C_POINTER$LAYOUT.withName("notify"),
                Constants$root.C_POINTER$LAYOUT.withName("constructed"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
                MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("volume_added"),
            Constants$root.C_POINTER$LAYOUT.withName("volume_removed"),
            Constants$root.C_POINTER$LAYOUT.withName("volume_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("mount_added"),
            Constants$root.C_POINTER$LAYOUT.withName("mount_removed"),
            Constants$root.C_POINTER$LAYOUT.withName("mount_pre_unmount"),
            Constants$root.C_POINTER$LAYOUT.withName("mount_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("drive_connected"),
            Constants$root.C_POINTER$LAYOUT.withName("drive_disconnected"),
            Constants$root.C_POINTER$LAYOUT.withName("drive_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("is_supported"),
            Constants$root.C_POINTER$LAYOUT.withName("get_connected_drives"),
            Constants$root.C_POINTER$LAYOUT.withName("get_volumes"),
            Constants$root.C_POINTER$LAYOUT.withName("get_mounts"),
            Constants$root.C_POINTER$LAYOUT.withName("get_volume_for_uuid"),
            Constants$root.C_POINTER$LAYOUT.withName("get_mount_for_uuid"),
            Constants$root.C_POINTER$LAYOUT.withName("adopt_orphan_mount"),
            Constants$root.C_POINTER$LAYOUT.withName("drive_eject_button"),
            Constants$root.C_POINTER$LAYOUT.withName("drive_stop_button"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("get_mount_for_mount_path")
    ).withName("_GNativeVolumeMonitorClass");
    public static MemoryLayout $LAYOUT() {
        return _GNativeVolumeMonitorClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 336);
    }
    static final FunctionDescriptor get_mount_for_mount_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_mount_for_mount_path$MH = RuntimeHelper.downcallHandle(
        _GNativeVolumeMonitorClass.get_mount_for_mount_path$FUNC, false
    );
    public interface get_mount_for_mount_path {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static NativeSymbol allocate(get_mount_for_mount_path fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_mount_for_mount_path.class, fi, _GNativeVolumeMonitorClass.get_mount_for_mount_path$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_mount_for_mount_path ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_mount_for_mount_path::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GNativeVolumeMonitorClass.get_mount_for_mount_path$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_mount_for_mount_path$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_mount_path"));
    public static VarHandle get_mount_for_mount_path$VH() {
        return _GNativeVolumeMonitorClass.get_mount_for_mount_path$VH;
    }
    public static MemoryAddress get_mount_for_mount_path$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GNativeVolumeMonitorClass.get_mount_for_mount_path$VH.get(seg);
    }
    public static void get_mount_for_mount_path$set( MemorySegment seg, MemoryAddress x) {
        _GNativeVolumeMonitorClass.get_mount_for_mount_path$VH.set(seg, x);
    }
    public static MemoryAddress get_mount_for_mount_path$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GNativeVolumeMonitorClass.get_mount_for_mount_path$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_mount_for_mount_path$set(MemorySegment seg, long index, MemoryAddress x) {
        _GNativeVolumeMonitorClass.get_mount_for_mount_path$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_mount_for_mount_path get_mount_for_mount_path (MemorySegment segment, ResourceScope scope) {
        return get_mount_for_mount_path.ofAddress(get_mount_for_mount_path$get(segment), scope);
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


