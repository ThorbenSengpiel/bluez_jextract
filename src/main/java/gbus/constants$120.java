// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$120 {

    static final FunctionDescriptor g_path_get_dirname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_path_get_dirname$MH = RuntimeHelper.downcallHandle(
        "g_path_get_dirname",
        constants$120.g_path_get_dirname$FUNC, false
    );
    static final FunctionDescriptor g_canonicalize_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_canonicalize_filename$MH = RuntimeHelper.downcallHandle(
        "g_canonicalize_filename",
        constants$120.g_canonicalize_filename$FUNC, false
    );
    static final FunctionDescriptor g_strip_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strip_context$MH = RuntimeHelper.downcallHandle(
        "g_strip_context",
        constants$120.g_strip_context$FUNC, false
    );
    static final FunctionDescriptor g_dgettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dgettext$MH = RuntimeHelper.downcallHandle(
        "g_dgettext",
        constants$120.g_dgettext$FUNC, false
    );
    static final FunctionDescriptor g_dcgettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dcgettext$MH = RuntimeHelper.downcallHandle(
        "g_dcgettext",
        constants$120.g_dcgettext$FUNC, false
    );
    static final FunctionDescriptor g_dngettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_dngettext$MH = RuntimeHelper.downcallHandle(
        "g_dngettext",
        constants$120.g_dngettext$FUNC, false
    );
}


