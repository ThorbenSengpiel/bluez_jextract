// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$793 {

    static final FunctionDescriptor g_socket_client_get_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_timeout",
        constants$793.g_socket_client_get_timeout$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_set_timeout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_timeout",
        constants$793.g_socket_client_set_timeout$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_get_enable_proxy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_enable_proxy$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_enable_proxy",
        constants$793.g_socket_client_get_enable_proxy$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_set_enable_proxy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_enable_proxy$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_enable_proxy",
        constants$793.g_socket_client_set_enable_proxy$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_get_tls$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_tls$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_tls",
        constants$793.g_socket_client_get_tls$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_set_tls$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_tls$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_tls",
        constants$793.g_socket_client_set_tls$FUNC, false
    );
}


