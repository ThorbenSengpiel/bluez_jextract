// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$31 {

    static final FunctionDescriptor g_vsnprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vsnprintf$MH = RuntimeHelper.downcallHandle(
        "g_vsnprintf",
        constants$31.g_vsnprintf$FUNC, false
    );
    static final FunctionDescriptor g_nullify_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_nullify_pointer$MH = RuntimeHelper.downcallHandle(
        "g_nullify_pointer",
        constants$31.g_nullify_pointer$FUNC, false
    );
    static final FunctionDescriptor g_format_size_full$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_format_size_full$MH = RuntimeHelper.downcallHandle(
        "g_format_size_full",
        constants$31.g_format_size_full$FUNC, false
    );
    static final FunctionDescriptor g_format_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_format_size$MH = RuntimeHelper.downcallHandle(
        "g_format_size",
        constants$31.g_format_size$FUNC, false
    );
    static final FunctionDescriptor g_format_size_for_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_format_size_for_display$MH = RuntimeHelper.downcallHandle(
        "g_format_size_for_display",
        constants$31.g_format_size_for_display$FUNC, false
    );
    static final FunctionDescriptor GVoidFunc$FUNC = FunctionDescriptor.ofVoid();
}


