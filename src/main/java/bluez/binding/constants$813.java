// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$813 {

    static final FunctionDescriptor g_task_report_new_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_report_new_error$MH = RuntimeHelper.downcallHandle(
        "g_task_report_new_error",
        constants$813.g_task_report_new_error$FUNC, true
    );
    static final FunctionDescriptor g_task_set_task_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_set_task_data$MH = RuntimeHelper.downcallHandle(
        "g_task_set_task_data",
        constants$813.g_task_set_task_data$FUNC, false
    );
    static final FunctionDescriptor g_task_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_task_set_priority$MH = RuntimeHelper.downcallHandle(
        "g_task_set_priority",
        constants$813.g_task_set_priority$FUNC, false
    );
    static final FunctionDescriptor g_task_set_check_cancellable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_task_set_check_cancellable$MH = RuntimeHelper.downcallHandle(
        "g_task_set_check_cancellable",
        constants$813.g_task_set_check_cancellable$FUNC, false
    );
    static final FunctionDescriptor g_task_set_source_tag$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_set_source_tag$MH = RuntimeHelper.downcallHandle(
        "g_task_set_source_tag",
        constants$813.g_task_set_source_tag$FUNC, false
    );
    static final FunctionDescriptor g_task_set_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_set_name$MH = RuntimeHelper.downcallHandle(
        "g_task_set_name",
        constants$813.g_task_set_name$FUNC, false
    );
}


