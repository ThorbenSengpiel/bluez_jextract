// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$265 {

    static final FunctionDescriptor GRegexEvalCallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GRegexEvalCallback$MH = RuntimeHelper.downcallHandle(
        constants$265.GRegexEvalCallback$FUNC, false
    );
    static final FunctionDescriptor g_regex_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_new$MH = RuntimeHelper.downcallHandle(
        "g_regex_new",
        constants$265.g_regex_new$FUNC, false
    );
    static final FunctionDescriptor g_regex_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_ref$MH = RuntimeHelper.downcallHandle(
        "g_regex_ref",
        constants$265.g_regex_ref$FUNC, false
    );
    static final FunctionDescriptor g_regex_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_unref$MH = RuntimeHelper.downcallHandle(
        "g_regex_unref",
        constants$265.g_regex_unref$FUNC, false
    );
    static final FunctionDescriptor g_regex_get_pattern$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_get_pattern$MH = RuntimeHelper.downcallHandle(
        "g_regex_get_pattern",
        constants$265.g_regex_get_pattern$FUNC, false
    );
    static final FunctionDescriptor g_regex_get_max_backref$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_get_max_backref$MH = RuntimeHelper.downcallHandle(
        "g_regex_get_max_backref",
        constants$265.g_regex_get_max_backref$FUNC, false
    );
}

