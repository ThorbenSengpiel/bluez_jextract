// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$121 {

    static final FunctionDescriptor g_dpgettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_dpgettext$MH = RuntimeHelper.downcallHandle(
        "g_dpgettext",
        constants$121.g_dpgettext$FUNC, false
    );
    static final FunctionDescriptor g_dpgettext2$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dpgettext2$MH = RuntimeHelper.downcallHandle(
        "g_dpgettext2",
        constants$121.g_dpgettext2$FUNC, false
    );
    static final FunctionDescriptor g_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_free$MH = RuntimeHelper.downcallHandle(
        "g_free",
        constants$121.g_free$FUNC, false
    );
    static final FunctionDescriptor g_clear_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_pointer$MH = RuntimeHelper.downcallHandle(
        "g_clear_pointer",
        constants$121.g_clear_pointer$FUNC, false
    );
    static final FunctionDescriptor g_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc$MH = RuntimeHelper.downcallHandle(
        "g_malloc",
        constants$121.g_malloc$FUNC, false
    );
    static final FunctionDescriptor g_malloc0$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc0$MH = RuntimeHelper.downcallHandle(
        "g_malloc0",
        constants$121.g_malloc0$FUNC, false
    );
}


