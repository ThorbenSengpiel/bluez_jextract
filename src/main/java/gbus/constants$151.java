// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$151 {

    static final FunctionDescriptor GPollFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GPollFunc$MH = RuntimeHelper.downcallHandle(
        constants$151.GPollFunc$FUNC, false
    );
    static final FunctionDescriptor g_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_poll$MH = RuntimeHelper.downcallHandle(
        "g_poll",
        constants$151.g_poll$FUNC, false
    );
    static final FunctionDescriptor g_slist_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_slist_alloc$MH = RuntimeHelper.downcallHandle(
        "g_slist_alloc",
        constants$151.g_slist_alloc$FUNC, false
    );
    static final FunctionDescriptor g_slist_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_free$MH = RuntimeHelper.downcallHandle(
        "g_slist_free",
        constants$151.g_slist_free$FUNC, false
    );
    static final FunctionDescriptor g_slist_free_1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_free_1$MH = RuntimeHelper.downcallHandle(
        "g_slist_free_1",
        constants$151.g_slist_free_1$FUNC, false
    );
    static final FunctionDescriptor g_slist_free_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_free_full$MH = RuntimeHelper.downcallHandle(
        "g_slist_free_full",
        constants$151.g_slist_free_full$FUNC, false
    );
}


