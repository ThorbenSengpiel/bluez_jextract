// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$790 {

    static final FunctionDescriptor g_settings_range_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_range_check$MH = RuntimeHelper.downcallHandle(
        "g_settings_range_check",
        constants$790.g_settings_range_check$FUNC, false
    );
    static final FunctionDescriptor g_settings_set_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_set_value$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_value",
        constants$790.g_settings_set_value$FUNC, false
    );
    static final FunctionDescriptor g_settings_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_value$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_value",
        constants$790.g_settings_get_value$FUNC, false
    );
    static final FunctionDescriptor g_settings_get_user_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_user_value$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_user_value",
        constants$790.g_settings_get_user_value$FUNC, false
    );
    static final FunctionDescriptor g_settings_get_default_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_default_value$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_default_value",
        constants$790.g_settings_get_default_value$FUNC, false
    );
    static final FunctionDescriptor g_settings_set$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_set$MH = RuntimeHelper.downcallHandle(
        "g_settings_set",
        constants$790.g_settings_set$FUNC, true
    );
}


