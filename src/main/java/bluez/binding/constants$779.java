// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$779 {

    static final FunctionDescriptor g_simple_async_result_propagate_error$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_result_propagate_error$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_result_propagate_error",
        constants$779.g_simple_async_result_propagate_error$FUNC, false
    );
    static final FunctionDescriptor g_simple_async_result_set_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_result_set_error$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_result_set_error",
        constants$779.g_simple_async_result_set_error$FUNC, true
    );
    static final FunctionDescriptor g_simple_async_result_set_error_va$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_result_set_error_va$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_result_set_error_va",
        constants$779.g_simple_async_result_set_error_va$FUNC, false
    );
    static final FunctionDescriptor g_simple_async_result_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_result_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_result_is_valid",
        constants$779.g_simple_async_result_is_valid$FUNC, false
    );
    static final FunctionDescriptor g_simple_async_report_error_in_idle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_report_error_in_idle$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_report_error_in_idle",
        constants$779.g_simple_async_report_error_in_idle$FUNC, true
    );
    static final FunctionDescriptor g_simple_async_report_gerror_in_idle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_report_gerror_in_idle$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_report_gerror_in_idle",
        constants$779.g_simple_async_report_gerror_in_idle$FUNC, false
    );
}


