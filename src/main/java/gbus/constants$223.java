// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$223 {

    static final FunctionDescriptor g_variant_get_variant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_variant$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_variant",
        constants$223.g_variant_get_variant$FUNC, false
    );
    static final FunctionDescriptor g_variant_get_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_string",
        constants$223.g_variant_get_string$FUNC, false
    );
    static final FunctionDescriptor g_variant_dup_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dup_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_dup_string",
        constants$223.g_variant_dup_string$FUNC, false
    );
    static final FunctionDescriptor g_variant_get_strv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_strv$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_strv",
        constants$223.g_variant_get_strv$FUNC, false
    );
    static final FunctionDescriptor g_variant_dup_strv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dup_strv$MH = RuntimeHelper.downcallHandle(
        "g_variant_dup_strv",
        constants$223.g_variant_dup_strv$FUNC, false
    );
    static final FunctionDescriptor g_variant_get_objv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_objv$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_objv",
        constants$223.g_variant_get_objv$FUNC, false
    );
}

