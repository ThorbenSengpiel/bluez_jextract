// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$696 {

    static final FunctionDescriptor g_io_stream_splice_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_stream_splice_finish$MH = RuntimeHelper.downcallHandle(
        "g_io_stream_splice_finish",
        constants$696.g_io_stream_splice_finish$FUNC, false
    );
    static final FunctionDescriptor g_io_stream_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_stream_close$MH = RuntimeHelper.downcallHandle(
        "g_io_stream_close",
        constants$696.g_io_stream_close$FUNC, false
    );
    static final FunctionDescriptor g_io_stream_close_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_stream_close_async$MH = RuntimeHelper.downcallHandle(
        "g_io_stream_close_async",
        constants$696.g_io_stream_close_async$FUNC, false
    );
    static final FunctionDescriptor g_io_stream_close_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_stream_close_finish$MH = RuntimeHelper.downcallHandle(
        "g_io_stream_close_finish",
        constants$696.g_io_stream_close_finish$FUNC, false
    );
    static final FunctionDescriptor g_io_stream_is_closed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_stream_is_closed$MH = RuntimeHelper.downcallHandle(
        "g_io_stream_is_closed",
        constants$696.g_io_stream_is_closed$FUNC, false
    );
    static final FunctionDescriptor g_io_stream_has_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_stream_has_pending$MH = RuntimeHelper.downcallHandle(
        "g_io_stream_has_pending",
        constants$696.g_io_stream_has_pending$FUNC, false
    );
}


