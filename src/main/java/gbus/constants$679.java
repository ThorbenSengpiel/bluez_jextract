// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$679 {

    static final FunctionDescriptor g_file_enumerator_next_files_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_next_files_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_next_files_finish",
        constants$679.g_file_enumerator_next_files_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_close_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_close_async$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_close_async",
        constants$679.g_file_enumerator_close_async$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_close_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_close_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_close_finish",
        constants$679.g_file_enumerator_close_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_is_closed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_is_closed$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_is_closed",
        constants$679.g_file_enumerator_is_closed$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_has_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_has_pending$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_has_pending",
        constants$679.g_file_enumerator_has_pending$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_set_pending$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_enumerator_set_pending$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_set_pending",
        constants$679.g_file_enumerator_set_pending$FUNC, false
    );
}

