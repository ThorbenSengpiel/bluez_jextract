// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$202 {

    static final FunctionDescriptor g_key_file_set_integer_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_key_file_set_integer_list$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_integer_list",
        constants$202.g_key_file_set_integer_list$FUNC, false
    );
    static final FunctionDescriptor g_key_file_set_comment$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_set_comment$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_comment",
        constants$202.g_key_file_set_comment$FUNC, false
    );
    static final FunctionDescriptor g_key_file_get_comment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_comment$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_comment",
        constants$202.g_key_file_get_comment$FUNC, false
    );
    static final FunctionDescriptor g_key_file_remove_comment$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_remove_comment$MH = RuntimeHelper.downcallHandle(
        "g_key_file_remove_comment",
        constants$202.g_key_file_remove_comment$FUNC, false
    );
    static final FunctionDescriptor g_key_file_remove_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_remove_key$MH = RuntimeHelper.downcallHandle(
        "g_key_file_remove_key",
        constants$202.g_key_file_remove_key$FUNC, false
    );
    static final FunctionDescriptor g_key_file_remove_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_remove_group$MH = RuntimeHelper.downcallHandle(
        "g_key_file_remove_group",
        constants$202.g_key_file_remove_group$FUNC, false
    );
}


