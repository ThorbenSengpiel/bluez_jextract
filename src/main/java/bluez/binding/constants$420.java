// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$420 {

    static final FunctionDescriptor g_param_values_cmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_values_cmp$MH = RuntimeHelper.downcallHandle(
        "g_param_values_cmp",
        constants$420.g_param_values_cmp$FUNC, false
    );
    static final FunctionDescriptor g_param_spec_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_get_name$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_get_name",
        constants$420.g_param_spec_get_name$FUNC, false
    );
    static final FunctionDescriptor g_param_spec_get_nick$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_get_nick$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_get_nick",
        constants$420.g_param_spec_get_nick$FUNC, false
    );
    static final FunctionDescriptor g_param_spec_get_blurb$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_get_blurb$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_get_blurb",
        constants$420.g_param_spec_get_blurb$FUNC, false
    );
    static final FunctionDescriptor g_value_set_param$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_param$MH = RuntimeHelper.downcallHandle(
        "g_value_set_param",
        constants$420.g_value_set_param$FUNC, false
    );
    static final FunctionDescriptor g_value_get_param$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_param$MH = RuntimeHelper.downcallHandle(
        "g_value_get_param",
        constants$420.g_value_get_param$FUNC, false
    );
}


