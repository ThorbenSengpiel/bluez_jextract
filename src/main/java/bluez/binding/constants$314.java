// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$314 {

    static final FunctionDescriptor g_thread_pool_stop_unused_threads$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_thread_pool_stop_unused_threads$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_stop_unused_threads",
        constants$314.g_thread_pool_stop_unused_threads$FUNC, false
    );
    static final FunctionDescriptor g_thread_pool_set_max_idle_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_thread_pool_set_max_idle_time$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_set_max_idle_time",
        constants$314.g_thread_pool_set_max_idle_time$FUNC, false
    );
    static final FunctionDescriptor g_thread_pool_get_max_idle_time$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_pool_get_max_idle_time$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_get_max_idle_time",
        constants$314.g_thread_pool_get_max_idle_time$FUNC, false
    );
    static final FunctionDescriptor g_timer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_timer_new$MH = RuntimeHelper.downcallHandle(
        "g_timer_new",
        constants$314.g_timer_new$FUNC, false
    );
    static final FunctionDescriptor g_timer_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_timer_destroy$MH = RuntimeHelper.downcallHandle(
        "g_timer_destroy",
        constants$314.g_timer_destroy$FUNC, false
    );
    static final FunctionDescriptor g_timer_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_timer_start$MH = RuntimeHelper.downcallHandle(
        "g_timer_start",
        constants$314.g_timer_start$FUNC, false
    );
}

