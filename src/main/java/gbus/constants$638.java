// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$638 {

    static final FunctionDescriptor g_dbus_server_get_client_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_get_client_address$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_client_address",
        constants$638.g_dbus_server_get_client_address$FUNC, false
    );
    static final FunctionDescriptor g_dbus_server_get_guid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_get_guid$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_guid",
        constants$638.g_dbus_server_get_guid$FUNC, false
    );
    static final FunctionDescriptor g_dbus_server_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_flags",
        constants$638.g_dbus_server_get_flags$FUNC, false
    );
    static final FunctionDescriptor g_dbus_server_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_start$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_start",
        constants$638.g_dbus_server_start$FUNC, false
    );
    static final FunctionDescriptor g_dbus_server_stop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_stop$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_stop",
        constants$638.g_dbus_server_stop$FUNC, false
    );
    static final FunctionDescriptor g_dbus_server_is_active$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_is_active$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_is_active",
        constants$638.g_dbus_server_is_active$FUNC, false
    );
}


