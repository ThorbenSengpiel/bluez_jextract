// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$237 {

    static final FunctionDescriptor g_log_default_handler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_default_handler$MH = RuntimeHelper.downcallHandle(
        "g_log_default_handler",
        constants$237.g_log_default_handler$FUNC, false
    );
    static final FunctionDescriptor g_log_set_default_handler$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_set_default_handler$MH = RuntimeHelper.downcallHandle(
        "g_log_set_default_handler",
        constants$237.g_log_set_default_handler$FUNC, false
    );
    static final FunctionDescriptor g_log$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log$MH = RuntimeHelper.downcallHandle(
        "g_log",
        constants$237.g_log$FUNC, true
    );
    static final FunctionDescriptor g_logv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_logv$MH = RuntimeHelper.downcallHandle(
        "g_logv",
        constants$237.g_logv$FUNC, false
    );
    static final FunctionDescriptor g_log_set_fatal_mask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_log_set_fatal_mask$MH = RuntimeHelper.downcallHandle(
        "g_log_set_fatal_mask",
        constants$237.g_log_set_fatal_mask$FUNC, false
    );
    static final FunctionDescriptor g_log_set_always_fatal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_log_set_always_fatal$MH = RuntimeHelper.downcallHandle(
        "g_log_set_always_fatal",
        constants$237.g_log_set_always_fatal$FUNC, false
    );
}


