// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$308 {

    static final FunctionDescriptor g_test_suite_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_suite_add$MH = RuntimeHelper.downcallHandle(
        "g_test_suite_add",
        constants$308.g_test_suite_add$FUNC, false
    );
    static final FunctionDescriptor g_test_suite_add_suite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_suite_add_suite$MH = RuntimeHelper.downcallHandle(
        "g_test_suite_add_suite",
        constants$308.g_test_suite_add_suite$FUNC, false
    );
    static final FunctionDescriptor g_test_run_suite$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_run_suite$MH = RuntimeHelper.downcallHandle(
        "g_test_run_suite",
        constants$308.g_test_run_suite$FUNC, false
    );
    static final FunctionDescriptor g_test_trap_assertions$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_trap_assertions$MH = RuntimeHelper.downcallHandle(
        "g_test_trap_assertions",
        constants$308.g_test_trap_assertions$FUNC, false
    );
    static final FunctionDescriptor g_assertion_message$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_assertion_message$MH = RuntimeHelper.downcallHandle(
        "g_assertion_message",
        constants$308.g_assertion_message$FUNC, false
    );
    static final FunctionDescriptor g_assertion_message_expr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_assertion_message_expr$MH = RuntimeHelper.downcallHandle(
        "g_assertion_message_expr",
        constants$308.g_assertion_message_expr$FUNC, false
    );
}


