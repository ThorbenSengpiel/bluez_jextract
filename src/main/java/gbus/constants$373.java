// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$373 {

    static final FunctionDescriptor g_static_private_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_private_set$MH = RuntimeHelper.downcallHandle(
        "g_static_private_set",
        constants$373.g_static_private_set$FUNC, false
    );
    static final FunctionDescriptor g_static_private_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_private_free$MH = RuntimeHelper.downcallHandle(
        "g_static_private_free",
        constants$373.g_static_private_free$FUNC, false
    );
    static final FunctionDescriptor g_once_init_enter_impl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_once_init_enter_impl$MH = RuntimeHelper.downcallHandle(
        "g_once_init_enter_impl",
        constants$373.g_once_init_enter_impl$FUNC, false
    );
    static final FunctionDescriptor g_thread_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_init$MH = RuntimeHelper.downcallHandle(
        "g_thread_init",
        constants$373.g_thread_init$FUNC, false
    );
    static final FunctionDescriptor g_thread_init_with_errorcheck_mutexes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_init_with_errorcheck_mutexes$MH = RuntimeHelper.downcallHandle(
        "g_thread_init_with_errorcheck_mutexes",
        constants$373.g_thread_init_with_errorcheck_mutexes$FUNC, false
    );
    static final FunctionDescriptor g_thread_get_initialized$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_get_initialized$MH = RuntimeHelper.downcallHandle(
        "g_thread_get_initialized",
        constants$373.g_thread_get_initialized$FUNC, false
    );
}


