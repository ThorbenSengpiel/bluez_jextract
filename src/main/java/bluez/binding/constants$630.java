// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$630 {

    static final FunctionDescriptor g_dtls_connection_get_negotiated_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_get_negotiated_protocol$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_negotiated_protocol",
        constants$630.g_dtls_connection_get_negotiated_protocol$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dtls_client_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_type",
        constants$630.g_dtls_client_connection_get_type$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_new",
        constants$630.g_dtls_client_connection_new$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_get_validation_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_validation_flags",
        constants$630.g_dtls_client_connection_get_validation_flags$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_set_validation_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_set_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_validation_flags",
        constants$630.g_dtls_client_connection_set_validation_flags$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_get_server_identity$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_server_identity",
        constants$630.g_dtls_client_connection_get_server_identity$FUNC, false
    );
}


