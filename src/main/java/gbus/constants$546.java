// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$546 {

    static final FunctionDescriptor g_buffered_input_stream_fill_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_fill_async$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_fill_async",
        constants$546.g_buffered_input_stream_fill_async$FUNC, false
    );
    static final FunctionDescriptor g_buffered_input_stream_fill_finish$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_fill_finish$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_fill_finish",
        constants$546.g_buffered_input_stream_fill_finish$FUNC, false
    );
    static final FunctionDescriptor g_buffered_input_stream_read_byte$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_read_byte$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_read_byte",
        constants$546.g_buffered_input_stream_read_byte$FUNC, false
    );
    static final FunctionDescriptor g_output_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_output_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_get_type",
        constants$546.g_output_stream_get_type$FUNC, false
    );
    static final FunctionDescriptor g_output_stream_write$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_write$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_write",
        constants$546.g_output_stream_write$FUNC, false
    );
    static final FunctionDescriptor g_output_stream_write_all$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_write_all$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_write_all",
        constants$546.g_output_stream_write_all$FUNC, false
    );
}


