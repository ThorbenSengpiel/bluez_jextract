// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$307 {

    static final FunctionDescriptor g_test_rand_int_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_test_rand_int_range$MH = RuntimeHelper.downcallHandle(
        "g_test_rand_int_range",
        constants$307.g_test_rand_int_range$FUNC, false
    );
    static final FunctionDescriptor g_test_rand_double$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle g_test_rand_double$MH = RuntimeHelper.downcallHandle(
        "g_test_rand_double",
        constants$307.g_test_rand_double$FUNC, false
    );
    static final FunctionDescriptor g_test_rand_double_range$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_test_rand_double_range$MH = RuntimeHelper.downcallHandle(
        "g_test_rand_double_range",
        constants$307.g_test_rand_double_range$FUNC, false
    );
    static final FunctionDescriptor g_test_create_case$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_create_case$MH = RuntimeHelper.downcallHandle(
        "g_test_create_case",
        constants$307.g_test_create_case$FUNC, false
    );
    static final FunctionDescriptor g_test_create_suite$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_create_suite$MH = RuntimeHelper.downcallHandle(
        "g_test_create_suite",
        constants$307.g_test_create_suite$FUNC, false
    );
    static final FunctionDescriptor g_test_get_root$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_test_get_root$MH = RuntimeHelper.downcallHandle(
        "g_test_get_root",
        constants$307.g_test_get_root$FUNC, false
    );
}


