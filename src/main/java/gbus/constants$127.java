// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$127 {

    static final FunctionDescriptor g_node_get_root$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_get_root$MH = RuntimeHelper.downcallHandle(
        "g_node_get_root",
        constants$127.g_node_get_root$FUNC, false
    );
    static final FunctionDescriptor g_node_is_ancestor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_is_ancestor$MH = RuntimeHelper.downcallHandle(
        "g_node_is_ancestor",
        constants$127.g_node_is_ancestor$FUNC, false
    );
    static final FunctionDescriptor g_node_depth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_depth$MH = RuntimeHelper.downcallHandle(
        "g_node_depth",
        constants$127.g_node_depth$FUNC, false
    );
    static final FunctionDescriptor g_node_find$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_find$MH = RuntimeHelper.downcallHandle(
        "g_node_find",
        constants$127.g_node_find$FUNC, false
    );
    static final FunctionDescriptor g_node_traverse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_traverse$MH = RuntimeHelper.downcallHandle(
        "g_node_traverse",
        constants$127.g_node_traverse$FUNC, false
    );
    static final FunctionDescriptor g_node_max_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_max_height$MH = RuntimeHelper.downcallHandle(
        "g_node_max_height",
        constants$127.g_node_max_height$FUNC, false
    );
}


