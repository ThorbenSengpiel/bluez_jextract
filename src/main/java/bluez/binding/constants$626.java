// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$626 {

    static final FunctionDescriptor g_dtls_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dtls_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_type",
        constants$626.g_dtls_connection_get_type$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_set_database$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_set_database$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_set_database",
        constants$626.g_dtls_connection_set_database$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_get_database$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_get_database$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_database",
        constants$626.g_dtls_connection_get_database$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_set_certificate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_set_certificate$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_set_certificate",
        constants$626.g_dtls_connection_set_certificate$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_get_certificate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_get_certificate$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_certificate",
        constants$626.g_dtls_connection_get_certificate$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_set_interaction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_set_interaction$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_set_interaction",
        constants$626.g_dtls_connection_set_interaction$FUNC, false
    );
}


