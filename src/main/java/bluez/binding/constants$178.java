// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$178 {

    static final FunctionDescriptor g_utf8_strlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strlen$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strlen",
        constants$178.g_utf8_strlen$FUNC, false
    );
    static final FunctionDescriptor g_utf8_substring$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_substring$MH = RuntimeHelper.downcallHandle(
        "g_utf8_substring",
        constants$178.g_utf8_substring$FUNC, false
    );
    static final FunctionDescriptor g_utf8_strncpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strncpy$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strncpy",
        constants$178.g_utf8_strncpy$FUNC, false
    );
    static final FunctionDescriptor g_utf8_strchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_utf8_strchr$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strchr",
        constants$178.g_utf8_strchr$FUNC, false
    );
    static final FunctionDescriptor g_utf8_strrchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_utf8_strrchr$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strrchr",
        constants$178.g_utf8_strrchr$FUNC, false
    );
    static final FunctionDescriptor g_utf8_strreverse$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strreverse$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strreverse",
        constants$178.g_utf8_strreverse$FUNC, false
    );
}


