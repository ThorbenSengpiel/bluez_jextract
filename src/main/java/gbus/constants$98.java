// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$98 {

    static final FunctionDescriptor g_locale_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_locale_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_locale_to_utf8",
        constants$98.g_locale_to_utf8$FUNC, false
    );
    static final FunctionDescriptor g_locale_from_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_locale_from_utf8$MH = RuntimeHelper.downcallHandle(
        "g_locale_from_utf8",
        constants$98.g_locale_from_utf8$FUNC, false
    );
    static final FunctionDescriptor g_filename_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_filename_to_utf8",
        constants$98.g_filename_to_utf8$FUNC, false
    );
    static final FunctionDescriptor g_filename_from_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_from_utf8$MH = RuntimeHelper.downcallHandle(
        "g_filename_from_utf8",
        constants$98.g_filename_from_utf8$FUNC, false
    );
    static final FunctionDescriptor g_filename_from_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_from_uri$MH = RuntimeHelper.downcallHandle(
        "g_filename_from_uri",
        constants$98.g_filename_from_uri$FUNC, false
    );
    static final FunctionDescriptor g_filename_to_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_to_uri$MH = RuntimeHelper.downcallHandle(
        "g_filename_to_uri",
        constants$98.g_filename_to_uri$FUNC, false
    );
}

