// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$421 {

    static final FunctionDescriptor g_value_dup_param$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_dup_param$MH = RuntimeHelper.downcallHandle(
        "g_value_dup_param",
        constants$421.g_value_dup_param$FUNC, false
    );
    static final FunctionDescriptor g_value_take_param$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_take_param$MH = RuntimeHelper.downcallHandle(
        "g_value_take_param",
        constants$421.g_value_take_param$FUNC, false
    );
    static final FunctionDescriptor g_value_set_param_take_ownership$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_param_take_ownership$MH = RuntimeHelper.downcallHandle(
        "g_value_set_param_take_ownership",
        constants$421.g_value_set_param_take_ownership$FUNC, false
    );
    static final FunctionDescriptor g_param_spec_get_default_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_get_default_value$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_get_default_value",
        constants$421.g_param_spec_get_default_value$FUNC, false
    );
    static final FunctionDescriptor g_param_spec_get_name_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_get_name_quark$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_get_name_quark",
        constants$421.g_param_spec_get_name_quark$FUNC, false
    );
    static final FunctionDescriptor g_param_type_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_type_register_static$MH = RuntimeHelper.downcallHandle(
        "g_param_type_register_static",
        constants$421.g_param_type_register_static$FUNC, false
    );
}


