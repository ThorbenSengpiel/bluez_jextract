// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$541 {

    static final FunctionDescriptor g_input_stream_read_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read_bytes$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read_bytes",
        constants$541.g_input_stream_read_bytes$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_skip$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_skip$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_skip",
        constants$541.g_input_stream_skip$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_close$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_close",
        constants$541.g_input_stream_close$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_read_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read_async$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read_async",
        constants$541.g_input_stream_read_async$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_read_finish$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read_finish$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read_finish",
        constants$541.g_input_stream_read_finish$FUNC, false
    );
    static final FunctionDescriptor g_input_stream_read_all_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read_all_async$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read_all_async",
        constants$541.g_input_stream_read_all_async$FUNC, false
    );
}


