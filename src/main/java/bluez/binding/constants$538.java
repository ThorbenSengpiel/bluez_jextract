// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$538 {

    static final FunctionDescriptor g_converter_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_converter_reset$MH = RuntimeHelper.downcallHandle(
        "g_converter_reset",
        constants$538.g_converter_reset$FUNC, false
    );
    static final FunctionDescriptor g_charset_converter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_charset_converter_get_type$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_get_type",
        constants$538.g_charset_converter_get_type$FUNC, false
    );
    static final FunctionDescriptor g_charset_converter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_charset_converter_new$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_new",
        constants$538.g_charset_converter_new$FUNC, false
    );
    static final FunctionDescriptor g_charset_converter_set_use_fallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_charset_converter_set_use_fallback$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_set_use_fallback",
        constants$538.g_charset_converter_set_use_fallback$FUNC, false
    );
    static final FunctionDescriptor g_charset_converter_get_use_fallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_charset_converter_get_use_fallback$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_get_use_fallback",
        constants$538.g_charset_converter_get_use_fallback$FUNC, false
    );
    static final FunctionDescriptor g_charset_converter_get_num_fallbacks$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_charset_converter_get_num_fallbacks$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_get_num_fallbacks",
        constants$538.g_charset_converter_get_num_fallbacks$FUNC, false
    );
}


