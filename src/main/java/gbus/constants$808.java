// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$808 {

    static final FunctionDescriptor g_socket_set_listen_backlog$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_listen_backlog$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_listen_backlog",
        constants$808.g_socket_set_listen_backlog$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_timeout",
        constants$808.g_socket_get_timeout$FUNC, false
    );
    static final FunctionDescriptor g_socket_set_timeout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_timeout",
        constants$808.g_socket_set_timeout$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_ttl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_ttl$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_ttl",
        constants$808.g_socket_get_ttl$FUNC, false
    );
    static final FunctionDescriptor g_socket_set_ttl$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_ttl$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_ttl",
        constants$808.g_socket_set_ttl$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_broadcast$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_broadcast$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_broadcast",
        constants$808.g_socket_get_broadcast$FUNC, false
    );
}


