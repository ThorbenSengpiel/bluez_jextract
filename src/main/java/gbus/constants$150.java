// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$150 {

    static final FunctionDescriptor g_hostname_is_non_ascii$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hostname_is_non_ascii$MH = RuntimeHelper.downcallHandle(
        "g_hostname_is_non_ascii",
        constants$150.g_hostname_is_non_ascii$FUNC, false
    );
    static final FunctionDescriptor g_hostname_is_ascii_encoded$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hostname_is_ascii_encoded$MH = RuntimeHelper.downcallHandle(
        "g_hostname_is_ascii_encoded",
        constants$150.g_hostname_is_ascii_encoded$FUNC, false
    );
    static final FunctionDescriptor g_hostname_is_ip_address$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hostname_is_ip_address$MH = RuntimeHelper.downcallHandle(
        "g_hostname_is_ip_address",
        constants$150.g_hostname_is_ip_address$FUNC, false
    );
    static final FunctionDescriptor g_hostname_to_ascii$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hostname_to_ascii$MH = RuntimeHelper.downcallHandle(
        "g_hostname_to_ascii",
        constants$150.g_hostname_to_ascii$FUNC, false
    );
    static final FunctionDescriptor g_hostname_to_unicode$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hostname_to_unicode$MH = RuntimeHelper.downcallHandle(
        "g_hostname_to_unicode",
        constants$150.g_hostname_to_unicode$FUNC, false
    );
    static final FunctionDescriptor GPollFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
}

