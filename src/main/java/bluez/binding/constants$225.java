// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$225 {

    static final FunctionDescriptor g_variant_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_bytes",
        constants$225.g_variant_new_from_bytes$FUNC, false
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
        constants$225.g_variant_new_from_data$FUNC, false
    );
    static final FunctionDescriptor g_variant_iter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_new$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_new",
        constants$225.g_variant_iter_new$FUNC, false
    );
    static final FunctionDescriptor g_variant_iter_init$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_init$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_init",
        constants$225.g_variant_iter_init$FUNC, false
    );
    static final FunctionDescriptor g_variant_iter_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_copy$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_copy",
        constants$225.g_variant_iter_copy$FUNC, false
    );
    static final FunctionDescriptor g_variant_iter_n_children$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_n_children$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_n_children",
        constants$225.g_variant_iter_n_children$FUNC, false
    );
}


