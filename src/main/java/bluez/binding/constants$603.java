// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$603 {

    static final FunctionDescriptor g_dbus_method_invocation_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_user_data$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_user_data",
        constants$603.g_dbus_method_invocation_get_user_data$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_value$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_value",
        constants$603.g_dbus_method_invocation_return_value$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_value_with_unix_fd_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_value_with_unix_fd_list$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_value_with_unix_fd_list",
        constants$603.g_dbus_method_invocation_return_value_with_unix_fd_list$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_error$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_error",
        constants$603.g_dbus_method_invocation_return_error$FUNC, true
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_error_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_error_valist$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_error_valist",
        constants$603.g_dbus_method_invocation_return_error_valist$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_error_literal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_error_literal$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_error_literal",
        constants$603.g_dbus_method_invocation_return_error_literal$FUNC, false
    );
}

