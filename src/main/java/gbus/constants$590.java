// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$590 {

    static final FunctionDescriptor g_dbus_address_get_stream_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_address_get_stream_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_address_get_stream_finish",
        constants$590.g_dbus_address_get_stream_finish$FUNC, false
    );
    static final FunctionDescriptor g_dbus_address_get_stream_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_address_get_stream_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_address_get_stream_sync",
        constants$590.g_dbus_address_get_stream_sync$FUNC, false
    );
    static final FunctionDescriptor g_dbus_address_get_for_bus_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_address_get_for_bus_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_address_get_for_bus_sync",
        constants$590.g_dbus_address_get_for_bus_sync$FUNC, false
    );
    static final FunctionDescriptor g_dbus_auth_observer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_auth_observer_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_auth_observer_get_type",
        constants$590.g_dbus_auth_observer_get_type$FUNC, false
    );
    static final FunctionDescriptor g_dbus_auth_observer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_dbus_auth_observer_new$MH = RuntimeHelper.downcallHandle(
        "g_dbus_auth_observer_new",
        constants$590.g_dbus_auth_observer_new$FUNC, false
    );
    static final FunctionDescriptor g_dbus_auth_observer_authorize_authenticated_peer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_auth_observer_authorize_authenticated_peer$MH = RuntimeHelper.downcallHandle(
        "g_dbus_auth_observer_authorize_authenticated_peer",
        constants$590.g_dbus_auth_observer_authorize_authenticated_peer$FUNC, false
    );
}

