// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$236 {

    static final FunctionDescriptor g_log_writer_journald$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_writer_journald$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_journald",
        constants$236.g_log_writer_journald$FUNC, false
    );
    static final FunctionDescriptor g_log_writer_standard_streams$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_writer_standard_streams$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_standard_streams",
        constants$236.g_log_writer_standard_streams$FUNC, false
    );
    static final FunctionDescriptor g_log_writer_default$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_writer_default$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_default",
        constants$236.g_log_writer_default$FUNC, false
    );
    static final FunctionDescriptor _g_log_fallback_handler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _g_log_fallback_handler$MH = RuntimeHelper.downcallHandle(
        "_g_log_fallback_handler",
        constants$236._g_log_fallback_handler$FUNC, false
    );
    static final FunctionDescriptor g_return_if_fail_warning$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_return_if_fail_warning$MH = RuntimeHelper.downcallHandle(
        "g_return_if_fail_warning",
        constants$236.g_return_if_fail_warning$FUNC, false
    );
    static final FunctionDescriptor g_warn_message$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_warn_message$MH = RuntimeHelper.downcallHandle(
        "g_warn_message",
        constants$236.g_warn_message$FUNC, false
    );
}


