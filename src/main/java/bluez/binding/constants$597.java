// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$597 {

    static final FunctionDescriptor g_dbus_message_set_body$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_body$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_body",
        constants$597.g_dbus_message_set_body$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_unix_fd_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_unix_fd_list$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_unix_fd_list",
        constants$597.g_dbus_message_get_unix_fd_list$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_set_unix_fd_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_unix_fd_list$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_unix_fd_list",
        constants$597.g_dbus_message_set_unix_fd_list$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_reply_serial$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_reply_serial$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_reply_serial",
        constants$597.g_dbus_message_get_reply_serial$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_set_reply_serial$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_reply_serial$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_reply_serial",
        constants$597.g_dbus_message_set_reply_serial$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_interface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_interface$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_interface",
        constants$597.g_dbus_message_get_interface$FUNC, false
    );
}

