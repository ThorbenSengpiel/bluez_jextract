// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$195 {

    static final FunctionDescriptor g_key_file_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_ref$MH = RuntimeHelper.downcallHandle(
        "g_key_file_ref",
        constants$195.g_key_file_ref$FUNC, false
    );
    static final FunctionDescriptor g_key_file_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_unref$MH = RuntimeHelper.downcallHandle(
        "g_key_file_unref",
        constants$195.g_key_file_unref$FUNC, false
    );
    static final FunctionDescriptor g_key_file_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_free$MH = RuntimeHelper.downcallHandle(
        "g_key_file_free",
        constants$195.g_key_file_free$FUNC, false
    );
    static final FunctionDescriptor g_key_file_set_list_separator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_key_file_set_list_separator$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_list_separator",
        constants$195.g_key_file_set_list_separator$FUNC, false
    );
    static final FunctionDescriptor g_key_file_load_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_load_from_file$MH = RuntimeHelper.downcallHandle(
        "g_key_file_load_from_file",
        constants$195.g_key_file_load_from_file$FUNC, false
    );
    static final FunctionDescriptor g_key_file_load_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_load_from_data$MH = RuntimeHelper.downcallHandle(
        "g_key_file_load_from_data",
        constants$195.g_key_file_load_from_data$FUNC, false
    );
}

