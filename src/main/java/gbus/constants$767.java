// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$767 {

    static final FunctionDescriptor g_pollable_input_stream_create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_input_stream_create_source$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_create_source",
        constants$767.g_pollable_input_stream_create_source$FUNC, false
    );
    static final FunctionDescriptor g_pollable_input_stream_read_nonblocking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_input_stream_read_nonblocking$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_read_nonblocking",
        constants$767.g_pollable_input_stream_read_nonblocking$FUNC, false
    );
    static final FunctionDescriptor g_pollable_output_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_pollable_output_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_get_type",
        constants$767.g_pollable_output_stream_get_type$FUNC, false
    );
    static final FunctionDescriptor g_pollable_output_stream_can_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_output_stream_can_poll$MH = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_can_poll",
        constants$767.g_pollable_output_stream_can_poll$FUNC, false
    );
    static final FunctionDescriptor g_pollable_output_stream_is_writable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_output_stream_is_writable$MH = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_is_writable",
        constants$767.g_pollable_output_stream_is_writable$FUNC, false
    );
    static final FunctionDescriptor g_pollable_output_stream_create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_output_stream_create_source$MH = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_create_source",
        constants$767.g_pollable_output_stream_create_source$FUNC, false
    );
}


