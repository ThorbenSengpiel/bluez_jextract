// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$159 {

    static final FunctionDescriptor g_main_context_find_source_by_funcs_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_find_source_by_funcs_user_data$MH = RuntimeHelper.downcallHandle(
        "g_main_context_find_source_by_funcs_user_data",
        constants$159.g_main_context_find_source_by_funcs_user_data$FUNC, false
    );
    static final FunctionDescriptor g_main_context_wakeup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_wakeup$MH = RuntimeHelper.downcallHandle(
        "g_main_context_wakeup",
        constants$159.g_main_context_wakeup$FUNC, false
    );
    static final FunctionDescriptor g_main_context_acquire$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_acquire$MH = RuntimeHelper.downcallHandle(
        "g_main_context_acquire",
        constants$159.g_main_context_acquire$FUNC, false
    );
    static final FunctionDescriptor g_main_context_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_release$MH = RuntimeHelper.downcallHandle(
        "g_main_context_release",
        constants$159.g_main_context_release$FUNC, false
    );
    static final FunctionDescriptor g_main_context_is_owner$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_is_owner$MH = RuntimeHelper.downcallHandle(
        "g_main_context_is_owner",
        constants$159.g_main_context_is_owner$FUNC, false
    );
    static final FunctionDescriptor g_main_context_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_wait$MH = RuntimeHelper.downcallHandle(
        "g_main_context_wait",
        constants$159.g_main_context_wait$FUNC, false
    );
}

