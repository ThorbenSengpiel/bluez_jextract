// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$858 {

    static final FunctionDescriptor g_tls_database_verify_chain_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_database_verify_chain_finish$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_verify_chain_finish",
        constants$858.g_tls_database_verify_chain_finish$FUNC, false
    );
    static final FunctionDescriptor g_tls_database_create_certificate_handle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_database_create_certificate_handle$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_create_certificate_handle",
        constants$858.g_tls_database_create_certificate_handle$FUNC, false
    );
    static final FunctionDescriptor g_tls_database_lookup_certificate_for_handle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_database_lookup_certificate_for_handle$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_lookup_certificate_for_handle",
        constants$858.g_tls_database_lookup_certificate_for_handle$FUNC, false
    );
    static final FunctionDescriptor g_tls_database_lookup_certificate_for_handle_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_database_lookup_certificate_for_handle_async$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_lookup_certificate_for_handle_async",
        constants$858.g_tls_database_lookup_certificate_for_handle_async$FUNC, false
    );
    static final FunctionDescriptor g_tls_database_lookup_certificate_for_handle_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_database_lookup_certificate_for_handle_finish$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_lookup_certificate_for_handle_finish",
        constants$858.g_tls_database_lookup_certificate_for_handle_finish$FUNC, false
    );
    static final FunctionDescriptor g_tls_database_lookup_certificate_issuer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_database_lookup_certificate_issuer$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_lookup_certificate_issuer",
        constants$858.g_tls_database_lookup_certificate_issuer$FUNC, false
    );
}


