// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$358 {

    static final FunctionDescriptor g_thread_init_with_errorcheck_mutexes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_init_with_errorcheck_mutexes$MH = RuntimeHelper.downcallHandle(
        "g_thread_init_with_errorcheck_mutexes",
        constants$358.g_thread_init_with_errorcheck_mutexes$FUNC, false
    );
    static final FunctionDescriptor g_thread_get_initialized$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_get_initialized$MH = RuntimeHelper.downcallHandle(
        "g_thread_get_initialized",
        constants$358.g_thread_get_initialized$FUNC, false
    );
    static final  OfInt g_threads_got_initialized$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle g_threads_got_initialized$VH = constants$358.g_threads_got_initialized$LAYOUT.varHandle();
    static final MemorySegment g_threads_got_initialized$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_threads_got_initialized", constants$358.g_threads_got_initialized$LAYOUT);
    static final FunctionDescriptor g_mutex_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_mutex_new$MH = RuntimeHelper.downcallHandle(
        "g_mutex_new",
        constants$358.g_mutex_new$FUNC, false
    );
    static final FunctionDescriptor g_mutex_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mutex_free$MH = RuntimeHelper.downcallHandle(
        "g_mutex_free",
        constants$358.g_mutex_free$FUNC, false
    );
    static final FunctionDescriptor g_cond_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_cond_new$MH = RuntimeHelper.downcallHandle(
        "g_cond_new",
        constants$358.g_cond_new$FUNC, false
    );
}


