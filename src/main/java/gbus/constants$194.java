// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$194 {

    static final FunctionDescriptor g_io_channel_set_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_set_flags$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_flags",
        constants$194.g_io_channel_set_flags$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_flags",
        constants$194.g_io_channel_get_flags$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_set_line_term$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_channel_set_line_term$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_line_term",
        constants$194.g_io_channel_set_line_term$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_get_line_term$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_line_term$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_line_term",
        constants$194.g_io_channel_get_line_term$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_set_buffered$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_channel_set_buffered$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_buffered",
        constants$194.g_io_channel_set_buffered$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_get_buffered$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_buffered$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_buffered",
        constants$194.g_io_channel_get_buffered$FUNC, false
    );
}


