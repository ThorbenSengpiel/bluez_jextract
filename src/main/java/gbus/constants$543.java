// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$543 {

    static final FunctionDescriptor g_input_stream_close_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_close_finish$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_close_finish",
        constants$543.g_input_stream_close_finish$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_is_closed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_is_closed$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_is_closed",
        constants$543.g_input_stream_is_closed$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_has_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_has_pending$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_has_pending",
        constants$543.g_input_stream_has_pending$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_set_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_set_pending$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_set_pending",
        constants$543.g_input_stream_set_pending$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_clear_pending$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_clear_pending$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_clear_pending",
        constants$543.g_input_stream_clear_pending$FUNC, false
    );
    static final FunctionDescriptor g_filter_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_filter_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_filter_input_stream_get_type",
        constants$543.g_filter_input_stream_get_type$FUNC, false
    );
}


