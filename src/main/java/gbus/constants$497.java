// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$497 {

    static final FunctionDescriptor g_value_array_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_value_array_get_type$MH = RuntimeHelper.downcallHandle(
        "g_value_array_get_type",
        constants$497.g_value_array_get_type$FUNC, false
    );
    static final FunctionDescriptor g_value_array_get_nth$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_value_array_get_nth$MH = RuntimeHelper.downcallHandle(
        "g_value_array_get_nth",
        constants$497.g_value_array_get_nth$FUNC, false
    );
    static final FunctionDescriptor g_value_array_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_value_array_new$MH = RuntimeHelper.downcallHandle(
        "g_value_array_new",
        constants$497.g_value_array_new$FUNC, false
    );
    static final FunctionDescriptor g_value_array_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_array_free$MH = RuntimeHelper.downcallHandle(
        "g_value_array_free",
        constants$497.g_value_array_free$FUNC, false
    );
    static final FunctionDescriptor g_value_array_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_array_copy$MH = RuntimeHelper.downcallHandle(
        "g_value_array_copy",
        constants$497.g_value_array_copy$FUNC, false
    );
    static final FunctionDescriptor g_value_array_prepend$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_array_prepend$MH = RuntimeHelper.downcallHandle(
        "g_value_array_prepend",
        constants$497.g_value_array_prepend$FUNC, false
    );
}

