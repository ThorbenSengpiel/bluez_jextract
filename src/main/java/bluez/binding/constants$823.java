// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$823 {

    static final FunctionDescriptor g_tls_backend_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_tls_backend_get_default$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_get_default",
        constants$823.g_tls_backend_get_default$FUNC, false
    );
    static final FunctionDescriptor g_tls_backend_get_default_database$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_get_default_database$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_get_default_database",
        constants$823.g_tls_backend_get_default_database$FUNC, false
    );
    static final FunctionDescriptor g_tls_backend_set_default_database$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_set_default_database$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_set_default_database",
        constants$823.g_tls_backend_set_default_database$FUNC, false
    );
    static final FunctionDescriptor g_tls_backend_supports_tls$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_supports_tls$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_supports_tls",
        constants$823.g_tls_backend_supports_tls$FUNC, false
    );
    static final FunctionDescriptor g_tls_backend_supports_dtls$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_supports_dtls$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_supports_dtls",
        constants$823.g_tls_backend_supports_dtls$FUNC, false
    );
    static final FunctionDescriptor g_tls_backend_get_certificate_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_get_certificate_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_get_certificate_type",
        constants$823.g_tls_backend_get_certificate_type$FUNC, false
    );
}

