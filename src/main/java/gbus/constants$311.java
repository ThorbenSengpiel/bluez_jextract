// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$311 {

    static final FunctionDescriptor g_test_skip_printf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_skip_printf$MH = RuntimeHelper.downcallHandle(
        "g_test_skip_printf",
        constants$311.g_test_skip_printf$FUNC, true
    );
    static final FunctionDescriptor g_test_failed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_test_failed$MH = RuntimeHelper.downcallHandle(
        "g_test_failed",
        constants$311.g_test_failed$FUNC, false
    );
    static final FunctionDescriptor g_test_set_nonfatal_assertions$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_test_set_nonfatal_assertions$MH = RuntimeHelper.downcallHandle(
        "g_test_set_nonfatal_assertions",
        constants$311.g_test_set_nonfatal_assertions$FUNC, false
    );
    static final FunctionDescriptor g_test_message$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_message$MH = RuntimeHelper.downcallHandle(
        "g_test_message",
        constants$311.g_test_message$FUNC, true
    );
    static final FunctionDescriptor g_test_bug_base$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_bug_base$MH = RuntimeHelper.downcallHandle(
        "g_test_bug_base",
        constants$311.g_test_bug_base$FUNC, false
    );
    static final FunctionDescriptor g_test_bug$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_bug$MH = RuntimeHelper.downcallHandle(
        "g_test_bug",
        constants$311.g_test_bug$FUNC, false
    );
}

