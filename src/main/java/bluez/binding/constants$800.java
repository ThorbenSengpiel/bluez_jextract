// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$800 {

    static final FunctionDescriptor g_socket_control_message_serialize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_serialize$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_serialize",
        constants$800.g_socket_control_message_serialize$FUNC, false
    );
    static final FunctionDescriptor g_socket_control_message_deserialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_deserialize$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_deserialize",
        constants$800.g_socket_control_message_deserialize$FUNC, false
    );
    static final FunctionDescriptor g_socket_listener_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_listener_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_get_type",
        constants$800.g_socket_listener_get_type$FUNC, false
    );
    static final FunctionDescriptor g_socket_listener_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_socket_listener_new$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_new",
        constants$800.g_socket_listener_new$FUNC, false
    );
    static final FunctionDescriptor g_socket_listener_set_backlog$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_listener_set_backlog$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_set_backlog",
        constants$800.g_socket_listener_set_backlog$FUNC, false
    );
    static final FunctionDescriptor g_socket_listener_add_socket$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_add_socket$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_add_socket",
        constants$800.g_socket_listener_add_socket$FUNC, false
    );
}


