// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$183 {

    static final FunctionDescriptor g_utf16_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf16_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_utf16_to_utf8",
        constants$183.g_utf16_to_utf8$FUNC, false
    );
    static final FunctionDescriptor g_ucs4_to_utf16$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ucs4_to_utf16$MH = RuntimeHelper.downcallHandle(
        "g_ucs4_to_utf16",
        constants$183.g_ucs4_to_utf16$FUNC, false
    );
    static final FunctionDescriptor g_ucs4_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ucs4_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_ucs4_to_utf8",
        constants$183.g_ucs4_to_utf8$FUNC, false
    );
    static final FunctionDescriptor g_unichar_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unichar_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_unichar_to_utf8",
        constants$183.g_unichar_to_utf8$FUNC, false
    );
    static final FunctionDescriptor g_utf8_validate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_validate$MH = RuntimeHelper.downcallHandle(
        "g_utf8_validate",
        constants$183.g_utf8_validate$FUNC, false
    );
    static final FunctionDescriptor g_utf8_validate_len$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_validate_len$MH = RuntimeHelper.downcallHandle(
        "g_utf8_validate_len",
        constants$183.g_utf8_validate_len$FUNC, false
    );
}

