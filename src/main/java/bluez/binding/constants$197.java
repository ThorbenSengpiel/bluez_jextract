// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$197 {

    static final FunctionDescriptor g_key_file_get_groups$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_groups$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_groups",
        constants$197.g_key_file_get_groups$FUNC, false
    );
    static final FunctionDescriptor g_key_file_get_keys$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_keys$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_keys",
        constants$197.g_key_file_get_keys$FUNC, false
    );
    static final FunctionDescriptor g_key_file_has_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_has_group$MH = RuntimeHelper.downcallHandle(
        "g_key_file_has_group",
        constants$197.g_key_file_has_group$FUNC, false
    );
    static final FunctionDescriptor g_key_file_has_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_has_key$MH = RuntimeHelper.downcallHandle(
        "g_key_file_has_key",
        constants$197.g_key_file_has_key$FUNC, false
    );
    static final FunctionDescriptor g_key_file_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_value$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_value",
        constants$197.g_key_file_get_value$FUNC, false
    );
    static final FunctionDescriptor g_key_file_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_set_value$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_value",
        constants$197.g_key_file_set_value$FUNC, false
    );
}

