// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$529 {

    static final FunctionDescriptor g_output_stream_flush$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_flush$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_flush",
        constants$529.g_output_stream_flush$FUNC, false
    );
    static final FunctionDescriptor g_output_stream_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_close$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_close",
        constants$529.g_output_stream_close$FUNC, false
    );
    static final FunctionDescriptor g_output_stream_write_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_write_async$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_write_async",
        constants$529.g_output_stream_write_async$FUNC, false
    );
    static final FunctionDescriptor g_output_stream_write_finish$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_write_finish$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_write_finish",
        constants$529.g_output_stream_write_finish$FUNC, false
    );
    static final FunctionDescriptor g_output_stream_write_all_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_write_all_async$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_write_all_async",
        constants$529.g_output_stream_write_all_async$FUNC, false
    );
    static final FunctionDescriptor g_output_stream_write_all_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_write_all_finish$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_write_all_finish",
        constants$529.g_output_stream_write_all_finish$FUNC, false
    );
}


