// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$170 {

    static final FunctionDescriptor g_get_monotonic_time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_get_monotonic_time$MH = RuntimeHelper.downcallHandle(
        "g_get_monotonic_time",
        constants$170.g_get_monotonic_time$FUNC, false
    );
    static final FunctionDescriptor g_get_real_time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_get_real_time$MH = RuntimeHelper.downcallHandle(
        "g_get_real_time",
        constants$170.g_get_real_time$FUNC, false
    );
    static final FunctionDescriptor g_source_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_remove$MH = RuntimeHelper.downcallHandle(
        "g_source_remove",
        constants$170.g_source_remove$FUNC, false
    );
    static final FunctionDescriptor g_source_remove_by_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_remove_by_user_data$MH = RuntimeHelper.downcallHandle(
        "g_source_remove_by_user_data",
        constants$170.g_source_remove_by_user_data$FUNC, false
    );
    static final FunctionDescriptor g_source_remove_by_funcs_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_remove_by_funcs_user_data$MH = RuntimeHelper.downcallHandle(
        "g_source_remove_by_funcs_user_data",
        constants$170.g_source_remove_by_funcs_user_data$FUNC, false
    );
    static final FunctionDescriptor GClearHandleFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
}

