// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$704 {

    static final FunctionDescriptor g_inet_address_mask_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_inet_address_mask_get_type$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_type",
        constants$704.g_inet_address_mask_get_type$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_mask_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_new$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_new",
        constants$704.g_inet_address_mask_new$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_mask_new_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_new_from_string$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_new_from_string",
        constants$704.g_inet_address_mask_new_from_string$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_mask_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_to_string$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_to_string",
        constants$704.g_inet_address_mask_to_string$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_mask_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_get_family$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_family",
        constants$704.g_inet_address_mask_get_family$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_mask_get_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_get_address$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_address",
        constants$704.g_inet_address_mask_get_address$FUNC, false
    );
}


