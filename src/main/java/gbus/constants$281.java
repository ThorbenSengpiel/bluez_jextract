// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$281 {

    static final FunctionDescriptor g_sequence_iter_is_end$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_is_end$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_is_end",
        constants$281.g_sequence_iter_is_end$FUNC, false
    );
    static final FunctionDescriptor g_sequence_iter_next$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_next$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_next",
        constants$281.g_sequence_iter_next$FUNC, false
    );
    static final FunctionDescriptor g_sequence_iter_prev$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_prev$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_prev",
        constants$281.g_sequence_iter_prev$FUNC, false
    );
    static final FunctionDescriptor g_sequence_iter_get_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_get_position$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_get_position",
        constants$281.g_sequence_iter_get_position$FUNC, false
    );
    static final FunctionDescriptor g_sequence_iter_move$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_sequence_iter_move$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_move",
        constants$281.g_sequence_iter_move$FUNC, false
    );
    static final FunctionDescriptor g_sequence_iter_get_sequence$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_get_sequence$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_get_sequence",
        constants$281.g_sequence_iter_get_sequence$FUNC, false
    );
}


