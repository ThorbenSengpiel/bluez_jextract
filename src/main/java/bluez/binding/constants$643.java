// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$643 {

    static final FunctionDescriptor g_file_query_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_info_async$MH = RuntimeHelper.downcallHandle(
        "g_file_query_info_async",
        constants$643.g_file_query_info_async$FUNC, false
    );
    static final FunctionDescriptor g_file_query_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_info_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_query_info_finish",
        constants$643.g_file_query_info_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_query_filesystem_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_filesystem_info$MH = RuntimeHelper.downcallHandle(
        "g_file_query_filesystem_info",
        constants$643.g_file_query_filesystem_info$FUNC, false
    );
    static final FunctionDescriptor g_file_query_filesystem_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_filesystem_info_async$MH = RuntimeHelper.downcallHandle(
        "g_file_query_filesystem_info_async",
        constants$643.g_file_query_filesystem_info_async$FUNC, false
    );
    static final FunctionDescriptor g_file_query_filesystem_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_filesystem_info_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_query_filesystem_info_finish",
        constants$643.g_file_query_filesystem_info_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_find_enclosing_mount$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_find_enclosing_mount$MH = RuntimeHelper.downcallHandle(
        "g_file_find_enclosing_mount",
        constants$643.g_file_find_enclosing_mount$FUNC, false
    );
}


