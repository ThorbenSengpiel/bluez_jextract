// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$252 {

    static final FunctionDescriptor g_queue_find$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_find$MH = RuntimeHelper.downcallHandle(
        "g_queue_find",
        constants$252.g_queue_find$FUNC, false
    );
    static final FunctionDescriptor g_queue_find_custom$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_find_custom$MH = RuntimeHelper.downcallHandle(
        "g_queue_find_custom",
        constants$252.g_queue_find_custom$FUNC, false
    );
    static final FunctionDescriptor g_queue_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_sort$MH = RuntimeHelper.downcallHandle(
        "g_queue_sort",
        constants$252.g_queue_sort$FUNC, false
    );
    static final FunctionDescriptor g_queue_push_head$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_push_head$MH = RuntimeHelper.downcallHandle(
        "g_queue_push_head",
        constants$252.g_queue_push_head$FUNC, false
    );
    static final FunctionDescriptor g_queue_push_tail$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_push_tail$MH = RuntimeHelper.downcallHandle(
        "g_queue_push_tail",
        constants$252.g_queue_push_tail$FUNC, false
    );
    static final FunctionDescriptor g_queue_push_nth$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_queue_push_nth$MH = RuntimeHelper.downcallHandle(
        "g_queue_push_nth",
        constants$252.g_queue_push_nth$FUNC, false
    );
}

