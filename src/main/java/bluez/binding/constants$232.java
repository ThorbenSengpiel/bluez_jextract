// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$232 {

    static final FunctionDescriptor g_variant_dict_end$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_end$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_end",
        constants$232.g_variant_dict_end$FUNC, false
    );
    static final FunctionDescriptor g_variant_dict_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_ref$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_ref",
        constants$232.g_variant_dict_ref$FUNC, false
    );
    static final FunctionDescriptor g_variant_dict_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_unref$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_unref",
        constants$232.g_variant_dict_unref$FUNC, false
    );
    static final FunctionDescriptor g_printf_string_upper_bound$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_printf_string_upper_bound$MH = RuntimeHelper.downcallHandle(
        "g_printf_string_upper_bound",
        constants$232.g_printf_string_upper_bound$FUNC, false
    );
    static final FunctionDescriptor GLogFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GLogFunc$MH = RuntimeHelper.downcallHandle(
        constants$232.GLogFunc$FUNC, false
    );
}

