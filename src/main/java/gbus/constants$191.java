// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$191 {

    static final FunctionDescriptor g_string_down$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_down$MH = RuntimeHelper.downcallHandle(
        "g_string_down",
        constants$191.g_string_down$FUNC, false
    );
    static final FunctionDescriptor g_string_up$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_up$MH = RuntimeHelper.downcallHandle(
        "g_string_up",
        constants$191.g_string_up$FUNC, false
    );
    static final FunctionDescriptor GIOFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GIOFunc$MH = RuntimeHelper.downcallHandle(
        constants$191.GIOFunc$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_init$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_init",
        constants$191.g_io_channel_init$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_ref$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_ref",
        constants$191.g_io_channel_ref$FUNC, false
    );
}


