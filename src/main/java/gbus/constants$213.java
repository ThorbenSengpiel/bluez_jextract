// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$213 {

    static final FunctionDescriptor g_variant_type_is_dict_entry$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_is_dict_entry$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_is_dict_entry",
        constants$213.g_variant_type_is_dict_entry$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_is_variant$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_is_variant$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_is_variant",
        constants$213.g_variant_type_is_variant$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_hash$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_hash",
        constants$213.g_variant_type_hash$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_equal$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_equal",
        constants$213.g_variant_type_equal$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_is_subtype_of$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_is_subtype_of$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_is_subtype_of",
        constants$213.g_variant_type_is_subtype_of$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_element$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_element$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_element",
        constants$213.g_variant_type_element$FUNC, false
    );
}

