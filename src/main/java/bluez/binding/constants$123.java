// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$123 {

    static final FunctionDescriptor g_node_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_copy$MH = RuntimeHelper.downcallHandle(
        "g_node_copy",
        constants$123.g_node_copy$FUNC, false
    );
    static final FunctionDescriptor g_node_insert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_insert$MH = RuntimeHelper.downcallHandle(
        "g_node_insert",
        constants$123.g_node_insert$FUNC, false
    );
    static final FunctionDescriptor g_node_insert_before$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_insert_before$MH = RuntimeHelper.downcallHandle(
        "g_node_insert_before",
        constants$123.g_node_insert_before$FUNC, false
    );
    static final FunctionDescriptor g_node_insert_after$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_insert_after$MH = RuntimeHelper.downcallHandle(
        "g_node_insert_after",
        constants$123.g_node_insert_after$FUNC, false
    );
    static final FunctionDescriptor g_node_prepend$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_prepend$MH = RuntimeHelper.downcallHandle(
        "g_node_prepend",
        constants$123.g_node_prepend$FUNC, false
    );
    static final FunctionDescriptor g_node_n_nodes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_node_n_nodes$MH = RuntimeHelper.downcallHandle(
        "g_node_n_nodes",
        constants$123.g_node_n_nodes$FUNC, false
    );
}

