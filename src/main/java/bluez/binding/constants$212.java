// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$212 {

    static final FunctionDescriptor g_variant_type_checked_$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_checked_$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_checked_",
        constants$212.g_variant_type_checked_$FUNC, false
    );
    static final FunctionDescriptor g_variant_type_string_get_depth_$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_string_get_depth_$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_string_get_depth_",
        constants$212.g_variant_type_string_get_depth_$FUNC, false
    );
    static final FunctionDescriptor g_variant_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_unref$MH = RuntimeHelper.downcallHandle(
        "g_variant_unref",
        constants$212.g_variant_unref$FUNC, false
    );
    static final FunctionDescriptor g_variant_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_ref$MH = RuntimeHelper.downcallHandle(
        "g_variant_ref",
        constants$212.g_variant_ref$FUNC, false
    );
    static final FunctionDescriptor g_variant_ref_sink$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_ref_sink$MH = RuntimeHelper.downcallHandle(
        "g_variant_ref_sink",
        constants$212.g_variant_ref_sink$FUNC, false
    );
    static final FunctionDescriptor g_variant_is_floating$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_is_floating$MH = RuntimeHelper.downcallHandle(
        "g_variant_is_floating",
        constants$212.g_variant_is_floating$FUNC, false
    );
}


