// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$279 {

    static final FunctionDescriptor g_sequence_sort_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_sort_changed$MH = RuntimeHelper.downcallHandle(
        "g_sequence_sort_changed",
        constants$279.g_sequence_sort_changed$FUNC, false
    );
    static final FunctionDescriptor g_sequence_sort_changed_iter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_sort_changed_iter$MH = RuntimeHelper.downcallHandle(
        "g_sequence_sort_changed_iter",
        constants$279.g_sequence_sort_changed_iter$FUNC, false
    );
    static final FunctionDescriptor g_sequence_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_remove$MH = RuntimeHelper.downcallHandle(
        "g_sequence_remove",
        constants$279.g_sequence_remove$FUNC, false
    );
    static final FunctionDescriptor g_sequence_remove_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_remove_range$MH = RuntimeHelper.downcallHandle(
        "g_sequence_remove_range",
        constants$279.g_sequence_remove_range$FUNC, false
    );
    static final FunctionDescriptor g_sequence_move_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_move_range$MH = RuntimeHelper.downcallHandle(
        "g_sequence_move_range",
        constants$279.g_sequence_move_range$FUNC, false
    );
    static final FunctionDescriptor g_sequence_search$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_search$MH = RuntimeHelper.downcallHandle(
        "g_sequence_search",
        constants$279.g_sequence_search$FUNC, false
    );
}

