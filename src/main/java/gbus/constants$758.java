// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$758 {

    static final FunctionDescriptor g_volume_monitor_get_mount_for_uuid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_monitor_get_mount_for_uuid$MH = RuntimeHelper.downcallHandle(
        "g_volume_monitor_get_mount_for_uuid",
        constants$758.g_volume_monitor_get_mount_for_uuid$FUNC, false
    );
    static final FunctionDescriptor g_volume_monitor_adopt_orphan_mount$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_monitor_adopt_orphan_mount$MH = RuntimeHelper.downcallHandle(
        "g_volume_monitor_adopt_orphan_mount",
        constants$758.g_volume_monitor_adopt_orphan_mount$FUNC, false
    );
    static final FunctionDescriptor g_native_volume_monitor_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_native_volume_monitor_get_type$MH = RuntimeHelper.downcallHandle(
        "g_native_volume_monitor_get_type",
        constants$758.g_native_volume_monitor_get_type$FUNC, false
    );
    static final FunctionDescriptor g_network_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_network_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_network_address_get_type",
        constants$758.g_network_address_get_type$FUNC, false
    );
    static final FunctionDescriptor g_network_address_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_network_address_new$MH = RuntimeHelper.downcallHandle(
        "g_network_address_new",
        constants$758.g_network_address_new$FUNC, false
    );
    static final FunctionDescriptor g_network_address_new_loopback$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_network_address_new_loopback$MH = RuntimeHelper.downcallHandle(
        "g_network_address_new_loopback",
        constants$758.g_network_address_new_loopback$FUNC, false
    );
}


