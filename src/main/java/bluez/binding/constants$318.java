// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$318 {

    static final FunctionDescriptor g_tree_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_ref$MH = RuntimeHelper.downcallHandle(
        "g_tree_ref",
        constants$318.g_tree_ref$FUNC, false
    );
    static final FunctionDescriptor g_tree_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_unref$MH = RuntimeHelper.downcallHandle(
        "g_tree_unref",
        constants$318.g_tree_unref$FUNC, false
    );
    static final FunctionDescriptor g_tree_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_destroy$MH = RuntimeHelper.downcallHandle(
        "g_tree_destroy",
        constants$318.g_tree_destroy$FUNC, false
    );
    static final FunctionDescriptor g_tree_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_insert$MH = RuntimeHelper.downcallHandle(
        "g_tree_insert",
        constants$318.g_tree_insert$FUNC, false
    );
    static final FunctionDescriptor g_tree_replace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_replace$MH = RuntimeHelper.downcallHandle(
        "g_tree_replace",
        constants$318.g_tree_replace$FUNC, false
    );
    static final FunctionDescriptor g_tree_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_remove$MH = RuntimeHelper.downcallHandle(
        "g_tree_remove",
        constants$318.g_tree_remove$FUNC, false
    );
}


