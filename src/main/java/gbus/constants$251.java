// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$251 {

    static final FunctionDescriptor g_queue_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_is_empty$MH = RuntimeHelper.downcallHandle(
        "g_queue_is_empty",
        constants$251.g_queue_is_empty$FUNC, false
    );
    static final FunctionDescriptor g_queue_clear_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_clear_full$MH = RuntimeHelper.downcallHandle(
        "g_queue_clear_full",
        constants$251.g_queue_clear_full$FUNC, false
    );
    static final FunctionDescriptor g_queue_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_get_length$MH = RuntimeHelper.downcallHandle(
        "g_queue_get_length",
        constants$251.g_queue_get_length$FUNC, false
    );
    static final FunctionDescriptor g_queue_reverse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_reverse$MH = RuntimeHelper.downcallHandle(
        "g_queue_reverse",
        constants$251.g_queue_reverse$FUNC, false
    );
    static final FunctionDescriptor g_queue_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_copy$MH = RuntimeHelper.downcallHandle(
        "g_queue_copy",
        constants$251.g_queue_copy$FUNC, false
    );
    static final FunctionDescriptor g_queue_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_foreach$MH = RuntimeHelper.downcallHandle(
        "g_queue_foreach",
        constants$251.g_queue_foreach$FUNC, false
    );
}


