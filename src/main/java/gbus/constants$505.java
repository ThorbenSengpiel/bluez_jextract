// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$505 {

    static final FunctionDescriptor g_value_dup_variant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_dup_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_dup_variant",
        constants$505.g_value_dup_variant$FUNC, false
    );
    static final FunctionDescriptor g_pointer_type_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pointer_type_register_static$MH = RuntimeHelper.downcallHandle(
        "g_pointer_type_register_static",
        constants$505.g_pointer_type_register_static$FUNC, false
    );
    static final FunctionDescriptor g_strdup_value_contents$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strdup_value_contents$MH = RuntimeHelper.downcallHandle(
        "g_strdup_value_contents",
        constants$505.g_strdup_value_contents$FUNC, false
    );
    static final FunctionDescriptor g_value_take_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_take_string$MH = RuntimeHelper.downcallHandle(
        "g_value_take_string",
        constants$505.g_value_take_string$FUNC, false
    );
    static final FunctionDescriptor g_value_set_string_take_ownership$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_string_take_ownership$MH = RuntimeHelper.downcallHandle(
        "g_value_set_string_take_ownership",
        constants$505.g_value_set_string_take_ownership$FUNC, false
    );
    static final FunctionDescriptor glib_autoptr_clear_GClosure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GClosure$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GClosure",
        constants$505.glib_autoptr_clear_GClosure$FUNC, false
    );
}


