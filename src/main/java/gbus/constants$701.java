// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$701 {

    static final FunctionDescriptor g_inet_address_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_inet_address_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_new_from_bytes",
        constants$701.g_inet_address_new_from_bytes$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_new_loopback$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_inet_address_new_loopback$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_new_loopback",
        constants$701.g_inet_address_new_loopback$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_new_any$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_inet_address_new_any$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_new_any",
        constants$701.g_inet_address_new_any$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_equal$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_equal",
        constants$701.g_inet_address_equal$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_to_string$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_to_string",
        constants$701.g_inet_address_to_string$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_to_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_to_bytes$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_to_bytes",
        constants$701.g_inet_address_to_bytes$FUNC, false
    );
}


