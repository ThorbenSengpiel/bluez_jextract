// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$283 {

    static final FunctionDescriptor g_strcanon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_strcanon$MH = RuntimeHelper.downcallHandle(
        "g_strcanon",
        constants$283.g_strcanon$FUNC, false
    );
    static final FunctionDescriptor g_strerror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_strerror$MH = RuntimeHelper.downcallHandle(
        "g_strerror",
        constants$283.g_strerror$FUNC, false
    );
    static final FunctionDescriptor g_strsignal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_strsignal$MH = RuntimeHelper.downcallHandle(
        "g_strsignal",
        constants$283.g_strsignal$FUNC, false
    );
    static final FunctionDescriptor g_strreverse$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strreverse$MH = RuntimeHelper.downcallHandle(
        "g_strreverse",
        constants$283.g_strreverse$FUNC, false
    );
    static final FunctionDescriptor g_strlcpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_strlcpy$MH = RuntimeHelper.downcallHandle(
        "g_strlcpy",
        constants$283.g_strlcpy$FUNC, false
    );
    static final FunctionDescriptor g_strlcat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_strlcat$MH = RuntimeHelper.downcallHandle(
        "g_strlcat",
        constants$283.g_strlcat$FUNC, false
    );
}

