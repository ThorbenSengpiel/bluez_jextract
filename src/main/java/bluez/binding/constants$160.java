// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$160 {

    static final FunctionDescriptor g_main_loop_quit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_quit$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_quit",
        constants$160.g_main_loop_quit$FUNC, false
    );
    static final FunctionDescriptor g_main_loop_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_ref$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_ref",
        constants$160.g_main_loop_ref$FUNC, false
    );
    static final FunctionDescriptor g_main_loop_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_unref$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_unref",
        constants$160.g_main_loop_unref$FUNC, false
    );
    static final FunctionDescriptor g_main_loop_is_running$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_is_running$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_is_running",
        constants$160.g_main_loop_is_running$FUNC, false
    );
    static final FunctionDescriptor g_main_loop_get_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_get_context$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_get_context",
        constants$160.g_main_loop_get_context$FUNC, false
    );
    static final FunctionDescriptor g_source_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_new$MH = RuntimeHelper.downcallHandle(
        "g_source_new",
        constants$160.g_source_new$FUNC, false
    );
}


