// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$775 {

    static final FunctionDescriptor g_simple_action_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_simple_action_group_new$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_group_new",
        constants$775.g_simple_action_group_new$FUNC, false
    );
    static final FunctionDescriptor g_simple_action_group_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_group_lookup$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_group_lookup",
        constants$775.g_simple_action_group_lookup$FUNC, false
    );
    static final FunctionDescriptor g_simple_action_group_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_group_insert$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_group_insert",
        constants$775.g_simple_action_group_insert$FUNC, false
    );
    static final FunctionDescriptor g_simple_action_group_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_group_remove$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_group_remove",
        constants$775.g_simple_action_group_remove$FUNC, false
    );
    static final FunctionDescriptor g_simple_action_group_add_entries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_group_add_entries$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_group_add_entries",
        constants$775.g_simple_action_group_add_entries$FUNC, false
    );
    static final FunctionDescriptor g_simple_async_result_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_simple_async_result_get_type$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_result_get_type",
        constants$775.g_simple_async_result_get_type$FUNC, false
    );
}


