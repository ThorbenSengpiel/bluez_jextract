// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$59 {

    static final FunctionDescriptor g_async_queue_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_ref$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_ref",
        constants$59.g_async_queue_ref$FUNC, false
    );
    static final FunctionDescriptor g_async_queue_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_unref$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_unref",
        constants$59.g_async_queue_unref$FUNC, false
    );
    static final FunctionDescriptor g_async_queue_ref_unlocked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_ref_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_ref_unlocked",
        constants$59.g_async_queue_ref_unlocked$FUNC, false
    );
    static final FunctionDescriptor g_async_queue_unref_and_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_unref_and_unlock$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_unref_and_unlock",
        constants$59.g_async_queue_unref_and_unlock$FUNC, false
    );
    static final FunctionDescriptor g_async_queue_push$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_push$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_push",
        constants$59.g_async_queue_push$FUNC, false
    );
    static final FunctionDescriptor g_async_queue_push_unlocked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_push_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_push_unlocked",
        constants$59.g_async_queue_push_unlocked$FUNC, false
    );
}


