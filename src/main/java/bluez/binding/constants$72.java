// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$72 {

    static final FunctionDescriptor g_bookmark_file_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_bookmark_file_new$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_new",
        constants$72.g_bookmark_file_new$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_free$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_free",
        constants$72.g_bookmark_file_free$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_load_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_load_from_file$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_load_from_file",
        constants$72.g_bookmark_file_load_from_file$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_load_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_load_from_data$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_load_from_data",
        constants$72.g_bookmark_file_load_from_data$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_load_from_data_dirs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_load_from_data_dirs$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_load_from_data_dirs",
        constants$72.g_bookmark_file_load_from_data_dirs$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_to_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_to_data$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_to_data",
        constants$72.g_bookmark_file_to_data$FUNC, false
    );
}


