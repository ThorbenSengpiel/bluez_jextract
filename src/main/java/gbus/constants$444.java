// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$444 {

    static final FunctionDescriptor g_closure_remove_invalidate_notifier$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_remove_invalidate_notifier$MH = RuntimeHelper.downcallHandle(
        "g_closure_remove_invalidate_notifier",
        constants$444.g_closure_remove_invalidate_notifier$FUNC, false
    );
    static final FunctionDescriptor g_closure_add_marshal_guards$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_add_marshal_guards$MH = RuntimeHelper.downcallHandle(
        "g_closure_add_marshal_guards",
        constants$444.g_closure_add_marshal_guards$FUNC, false
    );
    static final FunctionDescriptor g_closure_set_marshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_set_marshal$MH = RuntimeHelper.downcallHandle(
        "g_closure_set_marshal",
        constants$444.g_closure_set_marshal$FUNC, false
    );
    static final FunctionDescriptor g_closure_set_meta_marshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_set_meta_marshal$MH = RuntimeHelper.downcallHandle(
        "g_closure_set_meta_marshal",
        constants$444.g_closure_set_meta_marshal$FUNC, false
    );
    static final FunctionDescriptor g_closure_invalidate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_invalidate$MH = RuntimeHelper.downcallHandle(
        "g_closure_invalidate",
        constants$444.g_closure_invalidate$FUNC, false
    );
    static final FunctionDescriptor g_closure_invoke$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_invoke$MH = RuntimeHelper.downcallHandle(
        "g_closure_invoke",
        constants$444.g_closure_invoke$FUNC, false
    );
}


