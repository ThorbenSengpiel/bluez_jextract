// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$601 {

    static final FunctionDescriptor GDBusMessageFilterFunction$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDBusMessageFilterFunction$MH = RuntimeHelper.downcallHandle(
        constants$601.GDBusMessageFilterFunction$FUNC, false
    );
    static final FunctionDescriptor g_dbus_connection_add_filter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_add_filter$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_add_filter",
        constants$601.g_dbus_connection_add_filter$FUNC, false
    );
    static final FunctionDescriptor g_dbus_connection_remove_filter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_connection_remove_filter$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_remove_filter",
        constants$601.g_dbus_connection_remove_filter$FUNC, false
    );
    static final FunctionDescriptor g_dbus_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_dbus_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_dbus_error_quark",
        constants$601.g_dbus_error_quark$FUNC, false
    );
    static final FunctionDescriptor g_dbus_error_is_remote_error$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_error_is_remote_error$MH = RuntimeHelper.downcallHandle(
        "g_dbus_error_is_remote_error",
        constants$601.g_dbus_error_is_remote_error$FUNC, false
    );
}


