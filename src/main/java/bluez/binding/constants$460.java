// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$460 {

    static final FunctionDescriptor g_object_dup_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_dup_data$MH = RuntimeHelper.downcallHandle(
        "g_object_dup_data",
        constants$460.g_object_dup_data$FUNC, false
    );
    static final FunctionDescriptor g_object_replace_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_replace_data$MH = RuntimeHelper.downcallHandle(
        "g_object_replace_data",
        constants$460.g_object_replace_data$FUNC, false
    );
    static final FunctionDescriptor g_object_watch_closure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_watch_closure$MH = RuntimeHelper.downcallHandle(
        "g_object_watch_closure",
        constants$460.g_object_watch_closure$FUNC, false
    );
    static final FunctionDescriptor g_cclosure_new_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cclosure_new_object$MH = RuntimeHelper.downcallHandle(
        "g_cclosure_new_object",
        constants$460.g_cclosure_new_object$FUNC, false
    );
    static final FunctionDescriptor g_cclosure_new_object_swap$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cclosure_new_object_swap$MH = RuntimeHelper.downcallHandle(
        "g_cclosure_new_object_swap",
        constants$460.g_cclosure_new_object_swap$FUNC, false
    );
    static final FunctionDescriptor g_closure_new_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_new_object$MH = RuntimeHelper.downcallHandle(
        "g_closure_new_object",
        constants$460.g_closure_new_object$FUNC, false
    );
}


