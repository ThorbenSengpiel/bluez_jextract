// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$854 {

    static final FunctionDescriptor g_tls_connection_set_advertised_protocols$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_advertised_protocols$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_advertised_protocols",
        constants$854.g_tls_connection_set_advertised_protocols$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_get_negotiated_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_negotiated_protocol$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_negotiated_protocol",
        constants$854.g_tls_connection_get_negotiated_protocol$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_get_channel_binding_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_channel_binding_data$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_channel_binding_data",
        constants$854.g_tls_connection_get_channel_binding_data$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_handshake$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_handshake$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_handshake",
        constants$854.g_tls_connection_handshake$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_handshake_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_handshake_async$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_handshake_async",
        constants$854.g_tls_connection_handshake_async$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_handshake_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_handshake_finish$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_handshake_finish",
        constants$854.g_tls_connection_handshake_finish$FUNC, false
    );
}


