// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$181 {

    static final FunctionDescriptor g_utf8_casefold$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_casefold$MH = RuntimeHelper.downcallHandle(
        "g_utf8_casefold",
        constants$181.g_utf8_casefold$FUNC, false
    );
    static final FunctionDescriptor g_utf8_normalize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_utf8_normalize$MH = RuntimeHelper.downcallHandle(
        "g_utf8_normalize",
        constants$181.g_utf8_normalize$FUNC, false
    );
    static final FunctionDescriptor g_utf8_collate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_collate$MH = RuntimeHelper.downcallHandle(
        "g_utf8_collate",
        constants$181.g_utf8_collate$FUNC, false
    );
    static final FunctionDescriptor g_utf8_collate_key$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_collate_key$MH = RuntimeHelper.downcallHandle(
        "g_utf8_collate_key",
        constants$181.g_utf8_collate_key$FUNC, false
    );
    static final FunctionDescriptor g_utf8_collate_key_for_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_collate_key_for_filename$MH = RuntimeHelper.downcallHandle(
        "g_utf8_collate_key_for_filename",
        constants$181.g_utf8_collate_key_for_filename$FUNC, false
    );
    static final FunctionDescriptor g_utf8_make_valid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_make_valid$MH = RuntimeHelper.downcallHandle(
        "g_utf8_make_valid",
        constants$181.g_utf8_make_valid$FUNC, false
    );
}


