// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$673 {

    static final FunctionDescriptor g_file_attribute_matcher_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_attribute_matcher_to_string$MH = RuntimeHelper.downcallHandle(
        "g_file_attribute_matcher_to_string",
        constants$673.g_file_attribute_matcher_to_string$FUNC, false
    );
    static final FunctionDescriptor g_file_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_input_stream_get_type",
        constants$673.g_file_input_stream_get_type$FUNC, false
    );
    static final FunctionDescriptor g_file_input_stream_query_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_input_stream_query_info$MH = RuntimeHelper.downcallHandle(
        "g_file_input_stream_query_info",
        constants$673.g_file_input_stream_query_info$FUNC, false
    );
    static final FunctionDescriptor g_file_input_stream_query_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_input_stream_query_info_async$MH = RuntimeHelper.downcallHandle(
        "g_file_input_stream_query_info_async",
        constants$673.g_file_input_stream_query_info_async$FUNC, false
    );
    static final FunctionDescriptor g_file_input_stream_query_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_input_stream_query_info_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_input_stream_query_info_finish",
        constants$673.g_file_input_stream_query_info_finish$FUNC, false
    );
    static final FunctionDescriptor g_io_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_io_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_io_error_quark",
        constants$673.g_io_error_quark$FUNC, false
    );
}

