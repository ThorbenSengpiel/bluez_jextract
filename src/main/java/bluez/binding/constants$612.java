// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$612 {

    static final FunctionDescriptor g_dbus_object_manager_server_export_uniquely$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_server_export_uniquely$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_server_export_uniquely",
        constants$612.g_dbus_object_manager_server_export_uniquely$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_manager_server_is_exported$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_server_is_exported$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_server_is_exported",
        constants$612.g_dbus_object_manager_server_is_exported$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_manager_server_unexport$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_server_unexport$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_server_unexport",
        constants$612.g_dbus_object_manager_server_unexport$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_proxy_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_object_proxy_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_proxy_get_type",
        constants$612.g_dbus_object_proxy_get_type$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_proxy_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_proxy_new$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_proxy_new",
        constants$612.g_dbus_object_proxy_new$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_proxy_get_connection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_proxy_get_connection$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_proxy_get_connection",
        constants$612.g_dbus_object_proxy_get_connection$FUNC, false
    );
}


