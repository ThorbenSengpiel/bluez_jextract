// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$20 {

    static final FunctionDescriptor g_byte_array_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_byte_array_sort$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_sort",
        constants$20.g_byte_array_sort$FUNC, false
    );
    static final FunctionDescriptor g_byte_array_sort_with_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_byte_array_sort_with_data$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_sort_with_data",
        constants$20.g_byte_array_sort_with_data$FUNC, false
    );
    static final FunctionDescriptor g_atomic_int_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atomic_int_get$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_get",
        constants$20.g_atomic_int_get$FUNC, false
    );
    static final FunctionDescriptor g_atomic_int_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_atomic_int_set$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_set",
        constants$20.g_atomic_int_set$FUNC, false
    );
    static final FunctionDescriptor g_atomic_int_inc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atomic_int_inc$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_inc",
        constants$20.g_atomic_int_inc$FUNC, false
    );
    static final FunctionDescriptor g_atomic_int_dec_and_test$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atomic_int_dec_and_test$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_dec_and_test",
        constants$20.g_atomic_int_dec_and_test$FUNC, false
    );
}

