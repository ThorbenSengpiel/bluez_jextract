// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$199 {

    static final FunctionDescriptor g_key_file_set_boolean$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_key_file_set_boolean$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_boolean",
        constants$199.g_key_file_set_boolean$FUNC, false
    );
    static final FunctionDescriptor g_key_file_get_integer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_integer$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_integer",
        constants$199.g_key_file_get_integer$FUNC, false
    );
    static final FunctionDescriptor g_key_file_set_integer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_key_file_set_integer$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_integer",
        constants$199.g_key_file_set_integer$FUNC, false
    );
    static final FunctionDescriptor g_key_file_get_int64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_int64$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_int64",
        constants$199.g_key_file_get_int64$FUNC, false
    );
    static final FunctionDescriptor g_key_file_set_int64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_key_file_set_int64$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_int64",
        constants$199.g_key_file_set_int64$FUNC, false
    );
    static final FunctionDescriptor g_key_file_get_uint64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_uint64$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_uint64",
        constants$199.g_key_file_get_uint64$FUNC, false
    );
}


