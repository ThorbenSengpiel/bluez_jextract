// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$188 {

    static final FunctionDescriptor GIOFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GIOFunc$MH = RuntimeHelper.downcallHandle(
        constants$188.GIOFunc$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_init$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_init",
        constants$188.g_io_channel_init$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_ref$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_ref",
        constants$188.g_io_channel_ref$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_unref$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_unref",
        constants$188.g_io_channel_unref$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_read$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_read$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_read",
        constants$188.g_io_channel_read$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_write$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_write$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_write",
        constants$188.g_io_channel_write$FUNC, false
    );
}


