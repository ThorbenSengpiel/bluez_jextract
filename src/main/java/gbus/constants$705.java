// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$705 {

    static final FunctionDescriptor g_inet_address_mask_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_get_length$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_length",
        constants$705.g_inet_address_mask_get_length$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_mask_matches$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_matches$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_matches",
        constants$705.g_inet_address_mask_matches$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_mask_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_equal$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_equal",
        constants$705.g_inet_address_mask_equal$FUNC, false
    );
    static final FunctionDescriptor g_socket_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_get_type",
        constants$705.g_socket_address_get_type$FUNC, false
    );
    static final FunctionDescriptor g_socket_address_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_address_get_family$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_get_family",
        constants$705.g_socket_address_get_family$FUNC, false
    );
    static final FunctionDescriptor g_socket_address_new_from_native$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_socket_address_new_from_native$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_new_from_native",
        constants$705.g_socket_address_new_from_native$FUNC, false
    );
}


