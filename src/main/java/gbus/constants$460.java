// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$460 {

    static final FunctionDescriptor g_signal_chain_from_overridden_handler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_chain_from_overridden_handler$MH = RuntimeHelper.downcallHandle(
        "g_signal_chain_from_overridden_handler",
        constants$460.g_signal_chain_from_overridden_handler$FUNC, true
    );
    static final FunctionDescriptor g_signal_accumulator_true_handled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_accumulator_true_handled$MH = RuntimeHelper.downcallHandle(
        "g_signal_accumulator_true_handled",
        constants$460.g_signal_accumulator_true_handled$FUNC, false
    );
    static final FunctionDescriptor g_signal_accumulator_first_wins$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_accumulator_first_wins$MH = RuntimeHelper.downcallHandle(
        "g_signal_accumulator_first_wins",
        constants$460.g_signal_accumulator_first_wins$FUNC, false
    );
    static final FunctionDescriptor g_signal_handlers_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_handlers_destroy$MH = RuntimeHelper.downcallHandle(
        "g_signal_handlers_destroy",
        constants$460.g_signal_handlers_destroy$FUNC, false
    );
    static final FunctionDescriptor _g_signals_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _g_signals_destroy$MH = RuntimeHelper.downcallHandle(
        "_g_signals_destroy",
        constants$460._g_signals_destroy$FUNC, false
    );
    static final FunctionDescriptor g_date_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_date_get_type$MH = RuntimeHelper.downcallHandle(
        "g_date_get_type",
        constants$460.g_date_get_type$FUNC, false
    );
}

