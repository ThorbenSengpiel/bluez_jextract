// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$826 {

    static final FunctionDescriptor g_tls_certificate_is_same$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_is_same$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_is_same",
        constants$826.g_tls_certificate_is_same$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_type",
        constants$826.g_tls_connection_get_type$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_set_use_system_certdb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_use_system_certdb$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_use_system_certdb",
        constants$826.g_tls_connection_set_use_system_certdb$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_get_use_system_certdb$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_use_system_certdb$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_use_system_certdb",
        constants$826.g_tls_connection_get_use_system_certdb$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_set_database$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_database$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_database",
        constants$826.g_tls_connection_set_database$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_get_database$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_database$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_database",
        constants$826.g_tls_connection_get_database$FUNC, false
    );
}


