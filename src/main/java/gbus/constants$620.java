// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$620 {

    static final FunctionDescriptor g_dbus_message_bytes_needed$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_bytes_needed$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_bytes_needed",
        constants$620.g_dbus_message_bytes_needed$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_to_blob$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_to_blob$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_to_blob",
        constants$620.g_dbus_message_to_blob$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_to_gerror$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_to_gerror$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_to_gerror",
        constants$620.g_dbus_message_to_gerror$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_method_invocation_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_type",
        constants$620.g_dbus_method_invocation_get_type$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_sender$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_sender$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_sender",
        constants$620.g_dbus_method_invocation_get_sender$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_object_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_object_path$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_object_path",
        constants$620.g_dbus_method_invocation_get_object_path$FUNC, false
    );
}

