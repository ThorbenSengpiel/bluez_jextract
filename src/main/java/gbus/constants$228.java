// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$228 {

    static final FunctionDescriptor g_variant_get_normal_form$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_normal_form$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_normal_form",
        constants$228.g_variant_get_normal_form$FUNC, false
    );
    static final FunctionDescriptor g_variant_is_normal_form$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_is_normal_form$MH = RuntimeHelper.downcallHandle(
        "g_variant_is_normal_form",
        constants$228.g_variant_is_normal_form$FUNC, false
    );
    static final FunctionDescriptor g_variant_byteswap$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_byteswap$MH = RuntimeHelper.downcallHandle(
        "g_variant_byteswap",
        constants$228.g_variant_byteswap$FUNC, false
    );
    static final FunctionDescriptor g_variant_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_bytes",
        constants$228.g_variant_new_from_bytes$FUNC, false
    );
    static final FunctionDescriptor g_variant_new_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_from_data$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_data",
        constants$228.g_variant_new_from_data$FUNC, false
    );
    static final FunctionDescriptor g_variant_iter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_new$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_new",
        constants$228.g_variant_iter_new$FUNC, false
    );
}

