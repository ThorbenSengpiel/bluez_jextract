// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$255 {

    static final FunctionDescriptor g_random_int$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_random_int$MH = RuntimeHelper.downcallHandle(
        "g_random_int",
        constants$255.g_random_int$FUNC, false
    );
    static final FunctionDescriptor g_random_int_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_random_int_range$MH = RuntimeHelper.downcallHandle(
        "g_random_int_range",
        constants$255.g_random_int_range$FUNC, false
    );
    static final FunctionDescriptor g_random_double$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle g_random_double$MH = RuntimeHelper.downcallHandle(
        "g_random_double",
        constants$255.g_random_double$FUNC, false
    );
    static final FunctionDescriptor g_random_double_range$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_random_double_range$MH = RuntimeHelper.downcallHandle(
        "g_random_double_range",
        constants$255.g_random_double_range$FUNC, false
    );
    static final FunctionDescriptor g_rc_box_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_rc_box_alloc$MH = RuntimeHelper.downcallHandle(
        "g_rc_box_alloc",
        constants$255.g_rc_box_alloc$FUNC, false
    );
    static final FunctionDescriptor g_rc_box_alloc0$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_rc_box_alloc0$MH = RuntimeHelper.downcallHandle(
        "g_rc_box_alloc0",
        constants$255.g_rc_box_alloc0$FUNC, false
    );
}


