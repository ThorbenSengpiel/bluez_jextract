// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$816 {

    static final FunctionDescriptor g_socket_client_get_socket_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_socket_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_socket_type",
        constants$816.g_socket_client_get_socket_type$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_set_socket_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_socket_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_socket_type",
        constants$816.g_socket_client_set_socket_type$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_get_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_protocol$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_protocol",
        constants$816.g_socket_client_get_protocol$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_set_protocol$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_protocol$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_protocol",
        constants$816.g_socket_client_set_protocol$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_get_local_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_local_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_local_address",
        constants$816.g_socket_client_get_local_address$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_set_local_address$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_set_local_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_local_address",
        constants$816.g_socket_client_set_local_address$FUNC, false
    );
}


