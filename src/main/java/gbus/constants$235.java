// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$235 {

    static final FunctionDescriptor g_variant_dict_insert_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_insert_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_insert_value",
        constants$235.g_variant_dict_insert_value$FUNC, false
    );
    static final FunctionDescriptor g_variant_dict_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_remove$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_remove",
        constants$235.g_variant_dict_remove$FUNC, false
    );
    static final FunctionDescriptor g_variant_dict_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_clear$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_clear",
        constants$235.g_variant_dict_clear$FUNC, false
    );
    static final FunctionDescriptor g_variant_dict_end$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_end$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_end",
        constants$235.g_variant_dict_end$FUNC, false
    );
    static final FunctionDescriptor g_variant_dict_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_ref$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_ref",
        constants$235.g_variant_dict_ref$FUNC, false
    );
    static final FunctionDescriptor g_variant_dict_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_unref$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_unref",
        constants$235.g_variant_dict_unref$FUNC, false
    );
}


