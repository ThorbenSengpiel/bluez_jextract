// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$119 {

    static final FunctionDescriptor g_realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_realloc$MH = RuntimeHelper.downcallHandle(
        "g_realloc",
        constants$119.g_realloc$FUNC, false
    );
    static final FunctionDescriptor g_try_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_try_malloc$MH = RuntimeHelper.downcallHandle(
        "g_try_malloc",
        constants$119.g_try_malloc$FUNC, false
    );
    static final FunctionDescriptor g_try_malloc0$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_try_malloc0$MH = RuntimeHelper.downcallHandle(
        "g_try_malloc0",
        constants$119.g_try_malloc0$FUNC, false
    );
    static final FunctionDescriptor g_try_realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_try_realloc$MH = RuntimeHelper.downcallHandle(
        "g_try_realloc",
        constants$119.g_try_realloc$FUNC, false
    );
    static final FunctionDescriptor g_malloc_n$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc_n$MH = RuntimeHelper.downcallHandle(
        "g_malloc_n",
        constants$119.g_malloc_n$FUNC, false
    );
    static final FunctionDescriptor g_malloc0_n$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc0_n$MH = RuntimeHelper.downcallHandle(
        "g_malloc0_n",
        constants$119.g_malloc0_n$FUNC, false
    );
}

