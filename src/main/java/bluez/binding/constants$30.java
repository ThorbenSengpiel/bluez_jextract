// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$30 {

    static final FunctionDescriptor g_format_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_format_size$MH = RuntimeHelper.downcallHandle(
        "g_format_size",
        constants$30.g_format_size$FUNC, false
    );
    static final FunctionDescriptor g_format_size_for_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_format_size_for_display$MH = RuntimeHelper.downcallHandle(
        "g_format_size_for_display",
        constants$30.g_format_size_for_display$FUNC, false
    );
    static final FunctionDescriptor GVoidFunc$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle GVoidFunc$MH = RuntimeHelper.downcallHandle(
        constants$30.GVoidFunc$FUNC, false
    );
    static final FunctionDescriptor g_atexit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atexit$MH = RuntimeHelper.downcallHandle(
        "g_atexit",
        constants$30.g_atexit$FUNC, false
    );
    static final FunctionDescriptor g_find_program_in_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_find_program_in_path$MH = RuntimeHelper.downcallHandle(
        "g_find_program_in_path",
        constants$30.g_find_program_in_path$FUNC, false
    );
}


