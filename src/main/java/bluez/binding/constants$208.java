// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$208 {

    static final FunctionDescriptor g_variant_type_get_string_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_get_string_length$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_get_string_length",
        constants$208.g_variant_type_get_string_length$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_peek_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_peek_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_peek_string",
        constants$208.g_variant_type_peek_string$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_dup_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_dup_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_dup_string",
        constants$208.g_variant_type_dup_string$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_is_definite$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_is_definite$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_is_definite",
        constants$208.g_variant_type_is_definite$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_is_container$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_is_container$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_is_container",
        constants$208.g_variant_type_is_container$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_is_basic$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_is_basic$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_is_basic",
        constants$208.g_variant_type_is_basic$FUNC, false
    );
}


