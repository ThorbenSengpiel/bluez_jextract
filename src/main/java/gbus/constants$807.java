// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$807 {

    static final FunctionDescriptor g_socket_get_remote_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_remote_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_remote_address",
        constants$807.g_socket_get_remote_address$FUNC, false
    );
    static final FunctionDescriptor g_socket_set_blocking$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_blocking$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_blocking",
        constants$807.g_socket_set_blocking$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_blocking$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_blocking$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_blocking",
        constants$807.g_socket_get_blocking$FUNC, false
    );
    static final FunctionDescriptor g_socket_set_keepalive$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_keepalive$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_keepalive",
        constants$807.g_socket_set_keepalive$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_keepalive$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_keepalive$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_keepalive",
        constants$807.g_socket_get_keepalive$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_listen_backlog$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_listen_backlog$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_listen_backlog",
        constants$807.g_socket_get_listen_backlog$FUNC, false
    );
}


