// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$12 {

    static final FunctionDescriptor g_array_remove_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_remove_index$MH = RuntimeHelper.downcallHandle(
        "g_array_remove_index",
        constants$12.g_array_remove_index$FUNC, false
    );
    static final FunctionDescriptor g_array_remove_index_fast$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_remove_index_fast$MH = RuntimeHelper.downcallHandle(
        "g_array_remove_index_fast",
        constants$12.g_array_remove_index_fast$FUNC, false
    );
    static final FunctionDescriptor g_array_remove_range$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_remove_range$MH = RuntimeHelper.downcallHandle(
        "g_array_remove_range",
        constants$12.g_array_remove_range$FUNC, false
    );
    static final FunctionDescriptor g_array_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_sort$MH = RuntimeHelper.downcallHandle(
        "g_array_sort",
        constants$12.g_array_sort$FUNC, false
    );
    static final FunctionDescriptor g_array_sort_with_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_sort_with_data$MH = RuntimeHelper.downcallHandle(
        "g_array_sort_with_data",
        constants$12.g_array_sort_with_data$FUNC, false
    );
    static final FunctionDescriptor g_array_binary_search$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_binary_search$MH = RuntimeHelper.downcallHandle(
        "g_array_binary_search",
        constants$12.g_array_binary_search$FUNC, false
    );
}


