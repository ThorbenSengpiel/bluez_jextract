// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$825 {

    static final FunctionDescriptor g_tls_certificate_new_from_pem$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_pem$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_pem",
        constants$825.g_tls_certificate_new_from_pem$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_new_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_file$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_file",
        constants$825.g_tls_certificate_new_from_file$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_new_from_files$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_files$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_files",
        constants$825.g_tls_certificate_new_from_files$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_list_new_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_list_new_from_file$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_list_new_from_file",
        constants$825.g_tls_certificate_list_new_from_file$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_get_issuer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_issuer$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_issuer",
        constants$825.g_tls_certificate_get_issuer$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_verify$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_verify",
        constants$825.g_tls_certificate_verify$FUNC, false
    );
}


