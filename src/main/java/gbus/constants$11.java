// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$11 {

    static final FunctionDescriptor g_array_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_unref$MH = RuntimeHelper.downcallHandle(
        "g_array_unref",
        constants$11.g_array_unref$FUNC, false
    );
    static final FunctionDescriptor g_array_get_element_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_get_element_size$MH = RuntimeHelper.downcallHandle(
        "g_array_get_element_size",
        constants$11.g_array_get_element_size$FUNC, false
    );
    static final FunctionDescriptor g_array_append_vals$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_append_vals$MH = RuntimeHelper.downcallHandle(
        "g_array_append_vals",
        constants$11.g_array_append_vals$FUNC, false
    );
    static final FunctionDescriptor g_array_prepend_vals$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_prepend_vals$MH = RuntimeHelper.downcallHandle(
        "g_array_prepend_vals",
        constants$11.g_array_prepend_vals$FUNC, false
    );
    static final FunctionDescriptor g_array_insert_vals$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_insert_vals$MH = RuntimeHelper.downcallHandle(
        "g_array_insert_vals",
        constants$11.g_array_insert_vals$FUNC, false
    );
    static final FunctionDescriptor g_array_set_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_set_size$MH = RuntimeHelper.downcallHandle(
        "g_array_set_size",
        constants$11.g_array_set_size$FUNC, false
    );
}


