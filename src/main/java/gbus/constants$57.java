// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$57 {

    static final FunctionDescriptor g_cond_broadcast$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cond_broadcast$MH = RuntimeHelper.downcallHandle(
        "g_cond_broadcast",
        constants$57.g_cond_broadcast$FUNC, false
    );
    static final FunctionDescriptor g_cond_wait_until$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_cond_wait_until$MH = RuntimeHelper.downcallHandle(
        "g_cond_wait_until",
        constants$57.g_cond_wait_until$FUNC, false
    );
    static final FunctionDescriptor g_private_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_get$MH = RuntimeHelper.downcallHandle(
        "g_private_get",
        constants$57.g_private_get$FUNC, false
    );
    static final FunctionDescriptor g_private_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_set$MH = RuntimeHelper.downcallHandle(
        "g_private_set",
        constants$57.g_private_set$FUNC, false
    );
    static final FunctionDescriptor g_private_replace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_replace$MH = RuntimeHelper.downcallHandle(
        "g_private_replace",
        constants$57.g_private_replace$FUNC, false
    );
    static final FunctionDescriptor g_once_impl$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_once_impl$MH = RuntimeHelper.downcallHandle(
        "g_once_impl",
        constants$57.g_once_impl$FUNC, false
    );
}


