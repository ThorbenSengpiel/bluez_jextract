// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$658 {

    static final FunctionDescriptor g_file_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_get_child$MH = RuntimeHelper.downcallHandle(
        "g_file_get_child",
        constants$658.g_file_get_child$FUNC, false
    );
    static final FunctionDescriptor g_file_get_child_for_display_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_get_child_for_display_name$MH = RuntimeHelper.downcallHandle(
        "g_file_get_child_for_display_name",
        constants$658.g_file_get_child_for_display_name$FUNC, false
    );
    static final FunctionDescriptor g_file_has_prefix$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_has_prefix$MH = RuntimeHelper.downcallHandle(
        "g_file_has_prefix",
        constants$658.g_file_has_prefix$FUNC, false
    );
    static final FunctionDescriptor g_file_get_relative_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_get_relative_path$MH = RuntimeHelper.downcallHandle(
        "g_file_get_relative_path",
        constants$658.g_file_get_relative_path$FUNC, false
    );
    static final FunctionDescriptor g_file_resolve_relative_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_resolve_relative_path$MH = RuntimeHelper.downcallHandle(
        "g_file_resolve_relative_path",
        constants$658.g_file_resolve_relative_path$FUNC, false
    );
    static final FunctionDescriptor g_file_is_native$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_is_native$MH = RuntimeHelper.downcallHandle(
        "g_file_is_native",
        constants$658.g_file_is_native$FUNC, false
    );
}


