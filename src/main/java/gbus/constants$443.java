// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$443 {

    static final FunctionDescriptor g_closure_sink$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_sink$MH = RuntimeHelper.downcallHandle(
        "g_closure_sink",
        constants$443.g_closure_sink$FUNC, false
    );
    static final FunctionDescriptor g_closure_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_unref$MH = RuntimeHelper.downcallHandle(
        "g_closure_unref",
        constants$443.g_closure_unref$FUNC, false
    );
    static final FunctionDescriptor g_closure_new_simple$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_new_simple$MH = RuntimeHelper.downcallHandle(
        "g_closure_new_simple",
        constants$443.g_closure_new_simple$FUNC, false
    );
    static final FunctionDescriptor g_closure_add_finalize_notifier$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_add_finalize_notifier$MH = RuntimeHelper.downcallHandle(
        "g_closure_add_finalize_notifier",
        constants$443.g_closure_add_finalize_notifier$FUNC, false
    );
    static final FunctionDescriptor g_closure_remove_finalize_notifier$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_remove_finalize_notifier$MH = RuntimeHelper.downcallHandle(
        "g_closure_remove_finalize_notifier",
        constants$443.g_closure_remove_finalize_notifier$FUNC, false
    );
    static final FunctionDescriptor g_closure_add_invalidate_notifier$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_add_invalidate_notifier$MH = RuntimeHelper.downcallHandle(
        "g_closure_add_invalidate_notifier",
        constants$443.g_closure_add_invalidate_notifier$FUNC, false
    );
}


