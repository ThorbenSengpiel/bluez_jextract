// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$600 {

    static final FunctionDescriptor g_dbus_message_set_signature$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_signature$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_signature",
        constants$600.g_dbus_message_set_signature$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_num_unix_fds$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_num_unix_fds$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_num_unix_fds",
        constants$600.g_dbus_message_get_num_unix_fds$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_set_num_unix_fds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_num_unix_fds$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_num_unix_fds",
        constants$600.g_dbus_message_set_num_unix_fds$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_arg0$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_arg0$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_arg0",
        constants$600.g_dbus_message_get_arg0$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_new_from_blob$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_new_from_blob$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_new_from_blob",
        constants$600.g_dbus_message_new_from_blob$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_bytes_needed$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_bytes_needed$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_bytes_needed",
        constants$600.g_dbus_message_bytes_needed$FUNC, false
    );
}


