// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$264 {

    static final FunctionDescriptor g_ref_string_new_intern$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_string_new_intern$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_new_intern",
        constants$264.g_ref_string_new_intern$FUNC, false
    );
    static final FunctionDescriptor g_ref_string_acquire$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_string_acquire$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_acquire",
        constants$264.g_ref_string_acquire$FUNC, false
    );
    static final FunctionDescriptor g_ref_string_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_string_release$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_release",
        constants$264.g_ref_string_release$FUNC, false
    );
    static final FunctionDescriptor g_ref_string_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_string_length$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_length",
        constants$264.g_ref_string_length$FUNC, false
    );
    static final FunctionDescriptor g_regex_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_regex_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_regex_error_quark",
        constants$264.g_regex_error_quark$FUNC, false
    );
    static final FunctionDescriptor GRegexEvalCallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


