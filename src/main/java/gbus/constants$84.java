// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$84 {

    static final FunctionDescriptor g_bookmark_file_load_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_load_from_file$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_load_from_file",
        constants$84.g_bookmark_file_load_from_file$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_load_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_load_from_data$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_load_from_data",
        constants$84.g_bookmark_file_load_from_data$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_load_from_data_dirs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_load_from_data_dirs$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_load_from_data_dirs",
        constants$84.g_bookmark_file_load_from_data_dirs$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_to_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_to_data$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_to_data",
        constants$84.g_bookmark_file_to_data$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_to_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_to_file$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_to_file",
        constants$84.g_bookmark_file_to_file$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_set_title$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_set_title$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_set_title",
        constants$84.g_bookmark_file_set_title$FUNC, false
    );
}


