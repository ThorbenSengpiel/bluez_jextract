// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$169 {

    static final FunctionDescriptor g_source_get_time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_time$MH = RuntimeHelper.downcallHandle(
        "g_source_get_time",
        constants$169.g_source_get_time$FUNC, false
    );
    static final FunctionDescriptor g_idle_source_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_idle_source_new$MH = RuntimeHelper.downcallHandle(
        "g_idle_source_new",
        constants$169.g_idle_source_new$FUNC, false
    );
    static final FunctionDescriptor g_child_watch_source_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_child_watch_source_new$MH = RuntimeHelper.downcallHandle(
        "g_child_watch_source_new",
        constants$169.g_child_watch_source_new$FUNC, false
    );
    static final FunctionDescriptor g_timeout_source_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_timeout_source_new$MH = RuntimeHelper.downcallHandle(
        "g_timeout_source_new",
        constants$169.g_timeout_source_new$FUNC, false
    );
    static final FunctionDescriptor g_timeout_source_new_seconds$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_timeout_source_new_seconds$MH = RuntimeHelper.downcallHandle(
        "g_timeout_source_new_seconds",
        constants$169.g_timeout_source_new_seconds$FUNC, false
    );
    static final FunctionDescriptor g_get_current_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_current_time$MH = RuntimeHelper.downcallHandle(
        "g_get_current_time",
        constants$169.g_get_current_time$FUNC, false
    );
}


