// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$270 {

    static final FunctionDescriptor g_match_info_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_free$MH = RuntimeHelper.downcallHandle(
        "g_match_info_free",
        constants$270.g_match_info_free$FUNC, false
    );
    static final FunctionDescriptor g_match_info_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_next$MH = RuntimeHelper.downcallHandle(
        "g_match_info_next",
        constants$270.g_match_info_next$FUNC, false
    );
    static final FunctionDescriptor g_match_info_matches$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_matches$MH = RuntimeHelper.downcallHandle(
        "g_match_info_matches",
        constants$270.g_match_info_matches$FUNC, false
    );
    static final FunctionDescriptor g_match_info_get_match_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_get_match_count$MH = RuntimeHelper.downcallHandle(
        "g_match_info_get_match_count",
        constants$270.g_match_info_get_match_count$FUNC, false
    );
    static final FunctionDescriptor g_match_info_is_partial_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_is_partial_match$MH = RuntimeHelper.downcallHandle(
        "g_match_info_is_partial_match",
        constants$270.g_match_info_is_partial_match$FUNC, false
    );
    static final FunctionDescriptor g_match_info_expand_references$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_expand_references$MH = RuntimeHelper.downcallHandle(
        "g_match_info_expand_references",
        constants$270.g_match_info_expand_references$FUNC, false
    );
}


