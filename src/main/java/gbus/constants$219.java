// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$219 {

    static final FunctionDescriptor g_variant_new_double$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_variant_new_double$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_double",
        constants$219.g_variant_new_double$FUNC, false
    );
    static final FunctionDescriptor g_variant_new_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_string",
        constants$219.g_variant_new_string$FUNC, false
    );
    static final FunctionDescriptor g_variant_new_take_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_take_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_take_string",
        constants$219.g_variant_new_take_string$FUNC, false
    );
    static final FunctionDescriptor g_variant_new_printf$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_printf$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_printf",
        constants$219.g_variant_new_printf$FUNC, true
    );
    static final FunctionDescriptor g_variant_new_object_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_object_path$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_object_path",
        constants$219.g_variant_new_object_path$FUNC, false
    );
    static final FunctionDescriptor g_variant_is_object_path$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_is_object_path$MH = RuntimeHelper.downcallHandle(
        "g_variant_is_object_path",
        constants$219.g_variant_is_object_path$FUNC, false
    );
}


