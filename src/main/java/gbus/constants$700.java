// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$700 {

    static final FunctionDescriptor g_file_output_stream_query_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_output_stream_query_info$MH = RuntimeHelper.downcallHandle(
        "g_file_output_stream_query_info",
        constants$700.g_file_output_stream_query_info$FUNC, false
    );
    static final FunctionDescriptor g_file_output_stream_query_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_output_stream_query_info_async$MH = RuntimeHelper.downcallHandle(
        "g_file_output_stream_query_info_async",
        constants$700.g_file_output_stream_query_info_async$FUNC, false
    );
    static final FunctionDescriptor g_file_output_stream_query_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_output_stream_query_info_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_output_stream_query_info_finish",
        constants$700.g_file_output_stream_query_info_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_output_stream_get_etag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_output_stream_get_etag$MH = RuntimeHelper.downcallHandle(
        "g_file_output_stream_get_etag",
        constants$700.g_file_output_stream_get_etag$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_inet_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_get_type",
        constants$700.g_inet_address_get_type$FUNC, false
    );
    static final FunctionDescriptor g_inet_address_new_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_new_from_string$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_new_from_string",
        constants$700.g_inet_address_new_from_string$FUNC, false
    );
}


