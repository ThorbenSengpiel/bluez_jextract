// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$318 {

    static final FunctionDescriptor GTestLogFatalFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTestLogFatalFunc$MH = RuntimeHelper.downcallHandle(
        constants$318.GTestLogFatalFunc$FUNC, false
    );
    static final FunctionDescriptor g_test_log_set_fatal_handler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_log_set_fatal_handler$MH = RuntimeHelper.downcallHandle(
        "g_test_log_set_fatal_handler",
        constants$318.g_test_log_set_fatal_handler$FUNC, false
    );
    static final FunctionDescriptor g_test_expect_message$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_expect_message$MH = RuntimeHelper.downcallHandle(
        "g_test_expect_message",
        constants$318.g_test_expect_message$FUNC, false
    );
    static final FunctionDescriptor g_test_assert_expected_messages_internal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_assert_expected_messages_internal$MH = RuntimeHelper.downcallHandle(
        "g_test_assert_expected_messages_internal",
        constants$318.g_test_assert_expected_messages_internal$FUNC, false
    );
    static final FunctionDescriptor g_test_build_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_build_filename$MH = RuntimeHelper.downcallHandle(
        "g_test_build_filename",
        constants$318.g_test_build_filename$FUNC, true
    );
}


