// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$728 {

    static final FunctionDescriptor g_mount_can_unmount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_can_unmount$MH = RuntimeHelper.downcallHandle(
        "g_mount_can_unmount",
        constants$728.g_mount_can_unmount$FUNC, false
    );
    static final FunctionDescriptor g_mount_can_eject$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_can_eject$MH = RuntimeHelper.downcallHandle(
        "g_mount_can_eject",
        constants$728.g_mount_can_eject$FUNC, false
    );
    static final FunctionDescriptor g_mount_unmount$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unmount$MH = RuntimeHelper.downcallHandle(
        "g_mount_unmount",
        constants$728.g_mount_unmount$FUNC, false
    );
    static final FunctionDescriptor g_mount_unmount_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unmount_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_unmount_finish",
        constants$728.g_mount_unmount_finish$FUNC, false
    );
    static final FunctionDescriptor g_mount_eject$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject",
        constants$728.g_mount_eject$FUNC, false
    );
    static final FunctionDescriptor g_mount_eject_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject_finish",
        constants$728.g_mount_eject_finish$FUNC, false
    );
}


