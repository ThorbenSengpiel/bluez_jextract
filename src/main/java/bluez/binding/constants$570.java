// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$570 {

    static final FunctionDescriptor g_dbus_action_group_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_action_group_get$MH = RuntimeHelper.downcallHandle(
        "g_dbus_action_group_get",
        constants$570.g_dbus_action_group_get$FUNC, false
    );
    static final FunctionDescriptor g_dbus_address_escape_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_address_escape_value$MH = RuntimeHelper.downcallHandle(
        "g_dbus_address_escape_value",
        constants$570.g_dbus_address_escape_value$FUNC, false
    );
    static final FunctionDescriptor g_dbus_is_address$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_is_address$MH = RuntimeHelper.downcallHandle(
        "g_dbus_is_address",
        constants$570.g_dbus_is_address$FUNC, false
    );
    static final FunctionDescriptor g_dbus_is_supported_address$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_is_supported_address$MH = RuntimeHelper.downcallHandle(
        "g_dbus_is_supported_address",
        constants$570.g_dbus_is_supported_address$FUNC, false
    );
    static final FunctionDescriptor g_dbus_address_get_stream$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_address_get_stream$MH = RuntimeHelper.downcallHandle(
        "g_dbus_address_get_stream",
        constants$570.g_dbus_address_get_stream$FUNC, false
    );
    static final FunctionDescriptor g_dbus_address_get_stream_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_address_get_stream_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_address_get_stream_finish",
        constants$570.g_dbus_address_get_stream_finish$FUNC, false
    );
}


