// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$524 {

    static final FunctionDescriptor g_app_info_should_show$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_should_show$MH = RuntimeHelper.downcallHandle(
        "g_app_info_should_show",
        constants$524.g_app_info_should_show$FUNC, false
    );
    static final FunctionDescriptor g_app_info_set_as_default_for_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_set_as_default_for_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_set_as_default_for_type",
        constants$524.g_app_info_set_as_default_for_type$FUNC, false
    );
    static final FunctionDescriptor g_app_info_set_as_default_for_extension$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_set_as_default_for_extension$MH = RuntimeHelper.downcallHandle(
        "g_app_info_set_as_default_for_extension",
        constants$524.g_app_info_set_as_default_for_extension$FUNC, false
    );
    static final FunctionDescriptor g_app_info_add_supports_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_add_supports_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_add_supports_type",
        constants$524.g_app_info_add_supports_type$FUNC, false
    );
    static final FunctionDescriptor g_app_info_can_remove_supports_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_can_remove_supports_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_can_remove_supports_type",
        constants$524.g_app_info_can_remove_supports_type$FUNC, false
    );
    static final FunctionDescriptor g_app_info_remove_supports_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_remove_supports_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_remove_supports_type",
        constants$524.g_app_info_remove_supports_type$FUNC, false
    );
}


