// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$798 {

    static final FunctionDescriptor g_socket_connection_connect_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_connect_async$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_connect_async",
        constants$798.g_socket_connection_connect_async$FUNC, false
    );
    static final FunctionDescriptor g_socket_connection_connect_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_connect_finish$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_connect_finish",
        constants$798.g_socket_connection_connect_finish$FUNC, false
    );
    static final FunctionDescriptor g_socket_connection_get_socket$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_get_socket$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_get_socket",
        constants$798.g_socket_connection_get_socket$FUNC, false
    );
    static final FunctionDescriptor g_socket_connection_get_local_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_get_local_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_get_local_address",
        constants$798.g_socket_connection_get_local_address$FUNC, false
    );
    static final FunctionDescriptor g_socket_connection_get_remote_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_get_remote_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_get_remote_address",
        constants$798.g_socket_connection_get_remote_address$FUNC, false
    );
    static final FunctionDescriptor g_socket_connection_factory_register_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_register_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_register_type",
        constants$798.g_socket_connection_factory_register_type$FUNC, false
    );
}


