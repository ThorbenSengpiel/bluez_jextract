// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$302 {

    static final FunctionDescriptor GTestFixtureFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTestFixtureFunc$MH = RuntimeHelper.downcallHandle(
        constants$302.GTestFixtureFunc$FUNC, false
    );
    static final FunctionDescriptor g_strcmp0$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strcmp0$MH = RuntimeHelper.downcallHandle(
        "g_strcmp0",
        constants$302.g_strcmp0$FUNC, false
    );
    static final FunctionDescriptor g_test_minimized_result$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_minimized_result$MH = RuntimeHelper.downcallHandle(
        "g_test_minimized_result",
        constants$302.g_test_minimized_result$FUNC, true
    );
    static final FunctionDescriptor g_test_maximized_result$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_maximized_result$MH = RuntimeHelper.downcallHandle(
        "g_test_maximized_result",
        constants$302.g_test_maximized_result$FUNC, true
    );
    static final FunctionDescriptor g_test_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_init$MH = RuntimeHelper.downcallHandle(
        "g_test_init",
        constants$302.g_test_init$FUNC, true
    );
}


