// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$517 {

    static final FunctionDescriptor g_action_name_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_name_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_action_name_is_valid",
        constants$517.g_action_name_is_valid$FUNC, false
    );
    static final FunctionDescriptor g_action_parse_detailed_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_parse_detailed_name$MH = RuntimeHelper.downcallHandle(
        "g_action_parse_detailed_name",
        constants$517.g_action_parse_detailed_name$FUNC, false
    );
    static final FunctionDescriptor g_action_print_detailed_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_print_detailed_name$MH = RuntimeHelper.downcallHandle(
        "g_action_print_detailed_name",
        constants$517.g_action_print_detailed_name$FUNC, false
    );
    static final FunctionDescriptor g_action_group_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_action_group_get_type$MH = RuntimeHelper.downcallHandle(
        "g_action_group_get_type",
        constants$517.g_action_group_get_type$FUNC, false
    );
    static final FunctionDescriptor g_action_group_has_action$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_has_action$MH = RuntimeHelper.downcallHandle(
        "g_action_group_has_action",
        constants$517.g_action_group_has_action$FUNC, false
    );
    static final FunctionDescriptor g_action_group_list_actions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_list_actions$MH = RuntimeHelper.downcallHandle(
        "g_action_group_list_actions",
        constants$517.g_action_group_list_actions$FUNC, false
    );
}


