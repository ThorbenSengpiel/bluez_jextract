// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$638 {

    static final FunctionDescriptor g_file_has_prefix$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_has_prefix$MH = RuntimeHelper.downcallHandle(
        "g_file_has_prefix",
        constants$638.g_file_has_prefix$FUNC, false
    );
    static final FunctionDescriptor g_file_get_relative_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_get_relative_path$MH = RuntimeHelper.downcallHandle(
        "g_file_get_relative_path",
        constants$638.g_file_get_relative_path$FUNC, false
    );
    static final FunctionDescriptor g_file_resolve_relative_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_resolve_relative_path$MH = RuntimeHelper.downcallHandle(
        "g_file_resolve_relative_path",
        constants$638.g_file_resolve_relative_path$FUNC, false
    );
    static final FunctionDescriptor g_file_is_native$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_is_native$MH = RuntimeHelper.downcallHandle(
        "g_file_is_native",
        constants$638.g_file_is_native$FUNC, false
    );
    static final FunctionDescriptor g_file_has_uri_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_has_uri_scheme$MH = RuntimeHelper.downcallHandle(
        "g_file_has_uri_scheme",
        constants$638.g_file_has_uri_scheme$FUNC, false
    );
    static final FunctionDescriptor g_file_get_uri_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_get_uri_scheme$MH = RuntimeHelper.downcallHandle(
        "g_file_get_uri_scheme",
        constants$638.g_file_get_uri_scheme$FUNC, false
    );
}


