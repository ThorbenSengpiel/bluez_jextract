// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$247 {

    static final FunctionDescriptor g_queue_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_get_length$MH = RuntimeHelper.downcallHandle(
        "g_queue_get_length",
        constants$247.g_queue_get_length$FUNC, false
    );
    static final FunctionDescriptor g_queue_reverse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_reverse$MH = RuntimeHelper.downcallHandle(
        "g_queue_reverse",
        constants$247.g_queue_reverse$FUNC, false
    );
    static final FunctionDescriptor g_queue_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_copy$MH = RuntimeHelper.downcallHandle(
        "g_queue_copy",
        constants$247.g_queue_copy$FUNC, false
    );
    static final FunctionDescriptor g_queue_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_foreach$MH = RuntimeHelper.downcallHandle(
        "g_queue_foreach",
        constants$247.g_queue_foreach$FUNC, false
    );
    static final FunctionDescriptor g_queue_find$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_find$MH = RuntimeHelper.downcallHandle(
        "g_queue_find",
        constants$247.g_queue_find$FUNC, false
    );
    static final FunctionDescriptor g_queue_find_custom$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_find_custom$MH = RuntimeHelper.downcallHandle(
        "g_queue_find_custom",
        constants$247.g_queue_find_custom$FUNC, false
    );
}


