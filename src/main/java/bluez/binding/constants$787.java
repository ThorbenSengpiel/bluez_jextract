// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$787 {

    static final FunctionDescriptor g_socket_check_connect_result$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_check_connect_result$MH = RuntimeHelper.downcallHandle(
        "g_socket_check_connect_result",
        constants$787.g_socket_check_connect_result$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_available_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_available_bytes$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_available_bytes",
        constants$787.g_socket_get_available_bytes$FUNC, false
    );
    static final FunctionDescriptor g_socket_condition_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_condition_check$MH = RuntimeHelper.downcallHandle(
        "g_socket_condition_check",
        constants$787.g_socket_condition_check$FUNC, false
    );
    static final FunctionDescriptor g_socket_condition_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_condition_wait$MH = RuntimeHelper.downcallHandle(
        "g_socket_condition_wait",
        constants$787.g_socket_condition_wait$FUNC, false
    );
    static final FunctionDescriptor g_socket_condition_timed_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_condition_timed_wait$MH = RuntimeHelper.downcallHandle(
        "g_socket_condition_timed_wait",
        constants$787.g_socket_condition_timed_wait$FUNC, false
    );
    static final FunctionDescriptor g_socket_accept$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_accept$MH = RuntimeHelper.downcallHandle(
        "g_socket_accept",
        constants$787.g_socket_accept$FUNC, false
    );
}


