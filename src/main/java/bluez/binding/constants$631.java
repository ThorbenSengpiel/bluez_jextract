// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$631 {

    static final FunctionDescriptor g_dtls_client_connection_set_server_identity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_set_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_server_identity",
        constants$631.g_dtls_client_connection_set_server_identity$FUNC, false
    );
    static final FunctionDescriptor g_dtls_client_connection_get_accepted_cas$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_accepted_cas$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_accepted_cas",
        constants$631.g_dtls_client_connection_get_accepted_cas$FUNC, false
    );
    static final FunctionDescriptor g_dtls_server_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dtls_server_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dtls_server_connection_get_type",
        constants$631.g_dtls_server_connection_get_type$FUNC, false
    );
    static final FunctionDescriptor g_dtls_server_connection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_server_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_dtls_server_connection_new",
        constants$631.g_dtls_server_connection_new$FUNC, false
    );
    static final FunctionDescriptor g_icon_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_icon_get_type$MH = RuntimeHelper.downcallHandle(
        "g_icon_get_type",
        constants$631.g_icon_get_type$FUNC, false
    );
    static final FunctionDescriptor g_icon_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_icon_hash$MH = RuntimeHelper.downcallHandle(
        "g_icon_hash",
        constants$631.g_icon_hash$FUNC, false
    );
}

