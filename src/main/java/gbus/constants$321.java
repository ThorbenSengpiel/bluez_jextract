// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$321 {

    static final FunctionDescriptor g_thread_pool_set_max_unused_threads$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_thread_pool_set_max_unused_threads$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_set_max_unused_threads",
        constants$321.g_thread_pool_set_max_unused_threads$FUNC, false
    );
    static final FunctionDescriptor g_thread_pool_get_max_unused_threads$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_pool_get_max_unused_threads$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_get_max_unused_threads",
        constants$321.g_thread_pool_get_max_unused_threads$FUNC, false
    );
    static final FunctionDescriptor g_thread_pool_get_num_unused_threads$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_pool_get_num_unused_threads$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_get_num_unused_threads",
        constants$321.g_thread_pool_get_num_unused_threads$FUNC, false
    );
    static final FunctionDescriptor g_thread_pool_stop_unused_threads$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_thread_pool_stop_unused_threads$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_stop_unused_threads",
        constants$321.g_thread_pool_stop_unused_threads$FUNC, false
    );
    static final FunctionDescriptor g_thread_pool_set_max_idle_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_thread_pool_set_max_idle_time$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_set_max_idle_time",
        constants$321.g_thread_pool_set_max_idle_time$FUNC, false
    );
    static final FunctionDescriptor g_thread_pool_get_max_idle_time$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_pool_get_max_idle_time$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_get_max_idle_time",
        constants$321.g_thread_pool_get_max_idle_time$FUNC, false
    );
}

