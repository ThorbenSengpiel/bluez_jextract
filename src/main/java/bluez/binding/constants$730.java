// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$730 {

    static final FunctionDescriptor g_mount_shadow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_shadow$MH = RuntimeHelper.downcallHandle(
        "g_mount_shadow",
        constants$730.g_mount_shadow$FUNC, false
    );
    static final FunctionDescriptor g_mount_unshadow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unshadow$MH = RuntimeHelper.downcallHandle(
        "g_mount_unshadow",
        constants$730.g_mount_unshadow$FUNC, false
    );
    static final FunctionDescriptor g_mount_unmount_with_operation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unmount_with_operation$MH = RuntimeHelper.downcallHandle(
        "g_mount_unmount_with_operation",
        constants$730.g_mount_unmount_with_operation$FUNC, false
    );
    static final FunctionDescriptor g_mount_unmount_with_operation_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unmount_with_operation_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_unmount_with_operation_finish",
        constants$730.g_mount_unmount_with_operation_finish$FUNC, false
    );
    static final FunctionDescriptor g_mount_eject_with_operation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject_with_operation$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject_with_operation",
        constants$730.g_mount_eject_with_operation$FUNC, false
    );
    static final FunctionDescriptor g_mount_eject_with_operation_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject_with_operation_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject_with_operation_finish",
        constants$730.g_mount_eject_with_operation_finish$FUNC, false
    );
}


