// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$651 {

    static final FunctionDescriptor g_dtls_client_connection_set_validation_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_set_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_validation_flags",
        constants$651.g_dtls_client_connection_set_validation_flags$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_get_server_identity$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_server_identity",
        constants$651.g_dtls_client_connection_get_server_identity$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_set_server_identity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_set_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_server_identity",
        constants$651.g_dtls_client_connection_set_server_identity$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_get_accepted_cas$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_accepted_cas$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_accepted_cas",
        constants$651.g_dtls_client_connection_get_accepted_cas$FUNC, false
    );
    static final FunctionDescriptor g_dtls_server_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dtls_server_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dtls_server_connection_get_type",
        constants$651.g_dtls_server_connection_get_type$FUNC, false
    );
    static final FunctionDescriptor g_dtls_server_connection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_server_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_dtls_server_connection_new",
        constants$651.g_dtls_server_connection_new$FUNC, false
    );
}

