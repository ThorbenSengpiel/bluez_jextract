// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$809 {

    static final FunctionDescriptor g_socket_set_broadcast$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_broadcast$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_broadcast",
        constants$809.g_socket_set_broadcast$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_multicast_loopback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_multicast_loopback$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_multicast_loopback",
        constants$809.g_socket_get_multicast_loopback$FUNC, false
    );
    static final FunctionDescriptor g_socket_set_multicast_loopback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_multicast_loopback$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_multicast_loopback",
        constants$809.g_socket_set_multicast_loopback$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_multicast_ttl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_multicast_ttl$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_multicast_ttl",
        constants$809.g_socket_get_multicast_ttl$FUNC, false
    );
    static final FunctionDescriptor g_socket_set_multicast_ttl$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_multicast_ttl$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_multicast_ttl",
        constants$809.g_socket_set_multicast_ttl$FUNC, false
    );
    static final FunctionDescriptor g_socket_is_connected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_is_connected$MH = RuntimeHelper.downcallHandle(
        "g_socket_is_connected",
        constants$809.g_socket_is_connected$FUNC, false
    );
}


