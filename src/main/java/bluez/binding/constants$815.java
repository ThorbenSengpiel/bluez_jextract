// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$815 {

    static final FunctionDescriptor g_task_get_source_tag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_get_source_tag$MH = RuntimeHelper.downcallHandle(
        "g_task_get_source_tag",
        constants$815.g_task_get_source_tag$FUNC, false
    );
    static final FunctionDescriptor g_task_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_get_name$MH = RuntimeHelper.downcallHandle(
        "g_task_get_name",
        constants$815.g_task_get_name$FUNC, false
    );
    static final FunctionDescriptor g_task_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_task_is_valid",
        constants$815.g_task_is_valid$FUNC, false
    );
    static final FunctionDescriptor GTaskThreadFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTaskThreadFunc$MH = RuntimeHelper.downcallHandle(
        constants$815.GTaskThreadFunc$FUNC, false
    );
    static final FunctionDescriptor g_task_run_in_thread$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_run_in_thread$MH = RuntimeHelper.downcallHandle(
        "g_task_run_in_thread",
        constants$815.g_task_run_in_thread$FUNC, false
    );
}


