// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$346 {

    static final FunctionDescriptor g_relation_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_relation_count$MH = RuntimeHelper.downcallHandle(
        "g_relation_count",
        constants$346.g_relation_count$FUNC, false
    );
    static final FunctionDescriptor g_relation_exists$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_relation_exists$MH = RuntimeHelper.downcallHandle(
        "g_relation_exists",
        constants$346.g_relation_exists$FUNC, true
    );
    static final FunctionDescriptor g_relation_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_relation_print$MH = RuntimeHelper.downcallHandle(
        "g_relation_print",
        constants$346.g_relation_print$FUNC, false
    );
    static final FunctionDescriptor g_tuples_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tuples_destroy$MH = RuntimeHelper.downcallHandle(
        "g_tuples_destroy",
        constants$346.g_tuples_destroy$FUNC, false
    );
    static final FunctionDescriptor g_tuples_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tuples_index$MH = RuntimeHelper.downcallHandle(
        "g_tuples_index",
        constants$346.g_tuples_index$FUNC, false
    );
    static final  GroupLayout g_thread_functions_for_glib_use$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("mutex_new"),
        Constants$root.C_POINTER$LAYOUT.withName("mutex_lock"),
        Constants$root.C_POINTER$LAYOUT.withName("mutex_trylock"),
        Constants$root.C_POINTER$LAYOUT.withName("mutex_unlock"),
        Constants$root.C_POINTER$LAYOUT.withName("mutex_free"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_new"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_signal"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_broadcast"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_wait"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_timed_wait"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_free"),
        Constants$root.C_POINTER$LAYOUT.withName("private_new"),
        Constants$root.C_POINTER$LAYOUT.withName("private_get"),
        Constants$root.C_POINTER$LAYOUT.withName("private_set"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_create"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_yield"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_join"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_exit"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_set_priority"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_self"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_equal")
    ).withName("_GThreadFunctions");
    static final MemorySegment g_thread_functions_for_glib_use$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_thread_functions_for_glib_use", constants$346.g_thread_functions_for_glib_use$LAYOUT);
}

