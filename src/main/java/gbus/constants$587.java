// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$587 {

    static final FunctionDescriptor g_data_output_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_data_output_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_data_output_stream_get_type",
        constants$587.g_data_output_stream_get_type$FUNC, false
    );
    static final FunctionDescriptor g_data_output_stream_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_output_stream_new$MH = RuntimeHelper.downcallHandle(
        "g_data_output_stream_new",
        constants$587.g_data_output_stream_new$FUNC, false
    );
    static final FunctionDescriptor g_data_output_stream_set_byte_order$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_data_output_stream_set_byte_order$MH = RuntimeHelper.downcallHandle(
        "g_data_output_stream_set_byte_order",
        constants$587.g_data_output_stream_set_byte_order$FUNC, false
    );
    static final FunctionDescriptor g_data_output_stream_get_byte_order$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_output_stream_get_byte_order$MH = RuntimeHelper.downcallHandle(
        "g_data_output_stream_get_byte_order",
        constants$587.g_data_output_stream_get_byte_order$FUNC, false
    );
    static final FunctionDescriptor g_data_output_stream_put_byte$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_output_stream_put_byte$MH = RuntimeHelper.downcallHandle(
        "g_data_output_stream_put_byte",
        constants$587.g_data_output_stream_put_byte$FUNC, false
    );
    static final FunctionDescriptor g_data_output_stream_put_int16$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_output_stream_put_int16$MH = RuntimeHelper.downcallHandle(
        "g_data_output_stream_put_int16",
        constants$587.g_data_output_stream_put_int16$FUNC, false
    );
}


