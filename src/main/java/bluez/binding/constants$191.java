// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$191 {

    static final FunctionDescriptor g_io_channel_get_line_term$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_line_term$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_line_term",
        constants$191.g_io_channel_get_line_term$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_set_buffered$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_channel_set_buffered$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_buffered",
        constants$191.g_io_channel_set_buffered$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_get_buffered$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_buffered$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_buffered",
        constants$191.g_io_channel_get_buffered$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_set_encoding$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_set_encoding$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_encoding",
        constants$191.g_io_channel_set_encoding$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_get_encoding$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_encoding$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_encoding",
        constants$191.g_io_channel_get_encoding$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_set_close_on_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_channel_set_close_on_unref$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_close_on_unref",
        constants$191.g_io_channel_set_close_on_unref$FUNC, false
    );
}


