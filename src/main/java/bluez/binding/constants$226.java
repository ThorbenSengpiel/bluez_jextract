// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$226 {

    static final FunctionDescriptor g_variant_iter_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_free$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_free",
        constants$226.g_variant_iter_free$FUNC, false
    );
    static final FunctionDescriptor g_variant_iter_next_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_next_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_next_value",
        constants$226.g_variant_iter_next_value$FUNC, false
    );
    static final FunctionDescriptor g_variant_iter_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_next$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_next",
        constants$226.g_variant_iter_next$FUNC, true
    );
    static final FunctionDescriptor g_variant_iter_loop$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_loop$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_loop",
        constants$226.g_variant_iter_loop$FUNC, true
    );
    static final FunctionDescriptor g_variant_parser_get_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_variant_parser_get_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_variant_parser_get_error_quark",
        constants$226.g_variant_parser_get_error_quark$FUNC, false
    );
    static final FunctionDescriptor g_variant_parse_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_variant_parse_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_variant_parse_error_quark",
        constants$226.g_variant_parse_error_quark$FUNC, false
    );
}


