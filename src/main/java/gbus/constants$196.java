// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$196 {

    static final FunctionDescriptor g_io_channel_read_line_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_read_line_string$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_read_line_string",
        constants$196.g_io_channel_read_line_string$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_read_to_end$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_read_to_end$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_read_to_end",
        constants$196.g_io_channel_read_to_end$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_read_chars$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_read_chars$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_read_chars",
        constants$196.g_io_channel_read_chars$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_read_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_read_unichar$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_read_unichar",
        constants$196.g_io_channel_read_unichar$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_write_chars$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_write_chars$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_write_chars",
        constants$196.g_io_channel_write_chars$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_write_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_write_unichar$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_write_unichar",
        constants$196.g_io_channel_write_unichar$FUNC, false
    );
}


