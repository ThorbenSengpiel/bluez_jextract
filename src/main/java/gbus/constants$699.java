// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$699 {

    static final FunctionDescriptor g_filename_completer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_filename_completer_get_type$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_get_type",
        constants$699.g_filename_completer_get_type$FUNC, false
    );
    static final FunctionDescriptor g_filename_completer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_filename_completer_new$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_new",
        constants$699.g_filename_completer_new$FUNC, false
    );
    static final FunctionDescriptor g_filename_completer_get_completion_suffix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_completer_get_completion_suffix$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_get_completion_suffix",
        constants$699.g_filename_completer_get_completion_suffix$FUNC, false
    );
    static final FunctionDescriptor g_filename_completer_get_completions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_completer_get_completions$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_get_completions",
        constants$699.g_filename_completer_get_completions$FUNC, false
    );
    static final FunctionDescriptor g_filename_completer_set_dirs_only$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_filename_completer_set_dirs_only$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_set_dirs_only",
        constants$699.g_filename_completer_set_dirs_only$FUNC, false
    );
    static final FunctionDescriptor g_file_output_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_output_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_output_stream_get_type",
        constants$699.g_file_output_stream_get_type$FUNC, false
    );
}


