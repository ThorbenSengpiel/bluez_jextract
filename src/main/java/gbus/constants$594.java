// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$594 {

    static final FunctionDescriptor g_dbus_connection_get_exit_on_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_get_exit_on_close$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_exit_on_close",
        constants$594.g_dbus_connection_get_exit_on_close$FUNC, false
    );
    static final FunctionDescriptor g_dbus_connection_set_exit_on_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_connection_set_exit_on_close$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_set_exit_on_close",
        constants$594.g_dbus_connection_set_exit_on_close$FUNC, false
    );
    static final FunctionDescriptor g_dbus_connection_get_capabilities$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_get_capabilities$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_capabilities",
        constants$594.g_dbus_connection_get_capabilities$FUNC, false
    );
    static final FunctionDescriptor g_dbus_connection_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_flags",
        constants$594.g_dbus_connection_get_flags$FUNC, false
    );
    static final FunctionDescriptor g_dbus_connection_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_close$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_close",
        constants$594.g_dbus_connection_close$FUNC, false
    );
    static final FunctionDescriptor g_dbus_connection_close_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_close_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_close_finish",
        constants$594.g_dbus_connection_close_finish$FUNC, false
    );
}

