// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$64 {

    static final FunctionDescriptor g_async_queue_push_front_unlocked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_push_front_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_push_front_unlocked",
        constants$64.g_async_queue_push_front_unlocked$FUNC, false
    );
    static final FunctionDescriptor g_async_queue_timed_pop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_timed_pop$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_timed_pop",
        constants$64.g_async_queue_timed_pop$FUNC, false
    );
    static final FunctionDescriptor g_async_queue_timed_pop_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_timed_pop_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_timed_pop_unlocked",
        constants$64.g_async_queue_timed_pop_unlocked$FUNC, false
    );
    static final FunctionDescriptor __sighandler_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __sighandler_t$MH = RuntimeHelper.downcallHandle(
        constants$64.__sighandler_t$FUNC, false
    );
    static final FunctionDescriptor __sysv_signal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __sysv_signal$MH = RuntimeHelper.downcallHandle(
        "__sysv_signal",
        constants$64.__sysv_signal$FUNC, false
    );
}


