// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$808 {

    static final FunctionDescriptor g_subprocess_get_exit_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_get_exit_status$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_get_exit_status",
        constants$808.g_subprocess_get_exit_status$FUNC, false
    );
    static final FunctionDescriptor g_subprocess_get_if_signaled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_get_if_signaled$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_get_if_signaled",
        constants$808.g_subprocess_get_if_signaled$FUNC, false
    );
    static final FunctionDescriptor g_subprocess_get_term_sig$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_get_term_sig$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_get_term_sig",
        constants$808.g_subprocess_get_term_sig$FUNC, false
    );
    static final FunctionDescriptor g_subprocess_communicate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_communicate$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_communicate",
        constants$808.g_subprocess_communicate$FUNC, false
    );
    static final FunctionDescriptor g_subprocess_communicate_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_communicate_async$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_communicate_async",
        constants$808.g_subprocess_communicate_async$FUNC, false
    );
    static final FunctionDescriptor g_subprocess_communicate_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_communicate_finish$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_communicate_finish",
        constants$808.g_subprocess_communicate_finish$FUNC, false
    );
}


