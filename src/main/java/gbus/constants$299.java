// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$299 {

    static final FunctionDescriptor g_strchug$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strchug$MH = RuntimeHelper.downcallHandle(
        "g_strchug",
        constants$299.g_strchug$FUNC, false
    );
    static final FunctionDescriptor g_strchomp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strchomp$MH = RuntimeHelper.downcallHandle(
        "g_strchomp",
        constants$299.g_strchomp$FUNC, false
    );
    static final FunctionDescriptor g_ascii_strcasecmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ascii_strcasecmp$MH = RuntimeHelper.downcallHandle(
        "g_ascii_strcasecmp",
        constants$299.g_ascii_strcasecmp$FUNC, false
    );
    static final FunctionDescriptor g_ascii_strncasecmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_ascii_strncasecmp$MH = RuntimeHelper.downcallHandle(
        "g_ascii_strncasecmp",
        constants$299.g_ascii_strncasecmp$FUNC, false
    );
    static final FunctionDescriptor g_ascii_strdown$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_ascii_strdown$MH = RuntimeHelper.downcallHandle(
        "g_ascii_strdown",
        constants$299.g_ascii_strdown$FUNC, false
    );
    static final FunctionDescriptor g_ascii_strup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_ascii_strup$MH = RuntimeHelper.downcallHandle(
        "g_ascii_strup",
        constants$299.g_ascii_strup$FUNC, false
    );
}

