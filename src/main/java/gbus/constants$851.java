// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$851 {

    static final FunctionDescriptor g_tls_certificate_get_issuer_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_issuer_name$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_issuer_name",
        constants$851.g_tls_certificate_get_issuer_name$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_get_dns_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_dns_names$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_dns_names",
        constants$851.g_tls_certificate_get_dns_names$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_get_ip_addresses$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_ip_addresses$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_ip_addresses",
        constants$851.g_tls_certificate_get_ip_addresses$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_type",
        constants$851.g_tls_connection_get_type$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_set_use_system_certdb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_use_system_certdb$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_use_system_certdb",
        constants$851.g_tls_connection_set_use_system_certdb$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_get_use_system_certdb$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_use_system_certdb$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_use_system_certdb",
        constants$851.g_tls_connection_get_use_system_certdb$FUNC, false
    );
}


