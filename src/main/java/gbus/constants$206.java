// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$206 {

    static final FunctionDescriptor g_key_file_remove_comment$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_remove_comment$MH = RuntimeHelper.downcallHandle(
        "g_key_file_remove_comment",
        constants$206.g_key_file_remove_comment$FUNC, false
    );
    static final FunctionDescriptor g_key_file_remove_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_remove_key$MH = RuntimeHelper.downcallHandle(
        "g_key_file_remove_key",
        constants$206.g_key_file_remove_key$FUNC, false
    );
    static final FunctionDescriptor g_key_file_remove_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_remove_group$MH = RuntimeHelper.downcallHandle(
        "g_key_file_remove_group",
        constants$206.g_key_file_remove_group$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_new$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_new",
        constants$206.g_mapped_file_new$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_new_from_fd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_new_from_fd$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_new_from_fd",
        constants$206.g_mapped_file_new_from_fd$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_length$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_length",
        constants$206.g_mapped_file_get_length$FUNC, false
    );
}


