// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$613 {

    static final FunctionDescriptor g_dbus_message_new_method_error$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_new_method_error$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_new_method_error",
        constants$613.g_dbus_message_new_method_error$FUNC, true
    );
    static final FunctionDescriptor g_dbus_message_new_method_error_valist$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_new_method_error_valist$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_new_method_error_valist",
        constants$613.g_dbus_message_new_method_error_valist$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_new_method_error_literal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_new_method_error_literal$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_new_method_error_literal",
        constants$613.g_dbus_message_new_method_error_literal$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_print$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_message_print$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_print",
        constants$613.g_dbus_message_print$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_locked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_locked$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_locked",
        constants$613.g_dbus_message_get_locked$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_lock$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_lock",
        constants$613.g_dbus_message_lock$FUNC, false
    );
}


