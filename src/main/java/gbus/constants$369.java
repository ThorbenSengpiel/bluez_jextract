// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$369 {

    static final FunctionDescriptor pthread_atfork$__child$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__child$MH = RuntimeHelper.downcallHandle(
        constants$369.pthread_atfork$__child$FUNC, false
    );
    static final FunctionDescriptor pthread_atfork$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_atfork$MH = RuntimeHelper.downcallHandle(
        "pthread_atfork",
        constants$369.pthread_atfork$FUNC, false
    );
    static final FunctionDescriptor g_static_mutex_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_mutex_init$MH = RuntimeHelper.downcallHandle(
        "g_static_mutex_init",
        constants$369.g_static_mutex_init$FUNC, false
    );
    static final FunctionDescriptor g_static_mutex_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_mutex_free$MH = RuntimeHelper.downcallHandle(
        "g_static_mutex_free",
        constants$369.g_static_mutex_free$FUNC, false
    );
    static final FunctionDescriptor g_static_mutex_get_mutex_impl$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_mutex_get_mutex_impl$MH = RuntimeHelper.downcallHandle(
        "g_static_mutex_get_mutex_impl",
        constants$369.g_static_mutex_get_mutex_impl$FUNC, false
    );
}


