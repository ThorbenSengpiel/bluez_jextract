// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$184 {

    static final FunctionDescriptor g_string_append_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_append_len$MH = RuntimeHelper.downcallHandle(
        "g_string_append_len",
        constants$184.g_string_append_len$FUNC, false
    );
    static final FunctionDescriptor g_string_append_c$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_string_append_c$MH = RuntimeHelper.downcallHandle(
        "g_string_append_c",
        constants$184.g_string_append_c$FUNC, false
    );
    static final FunctionDescriptor g_string_append_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_string_append_unichar$MH = RuntimeHelper.downcallHandle(
        "g_string_append_unichar",
        constants$184.g_string_append_unichar$FUNC, false
    );
    static final FunctionDescriptor g_string_prepend$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_prepend$MH = RuntimeHelper.downcallHandle(
        "g_string_prepend",
        constants$184.g_string_prepend$FUNC, false
    );
    static final FunctionDescriptor g_string_prepend_c$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_string_prepend_c$MH = RuntimeHelper.downcallHandle(
        "g_string_prepend_c",
        constants$184.g_string_prepend_c$FUNC, false
    );
    static final FunctionDescriptor g_string_prepend_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_string_prepend_unichar$MH = RuntimeHelper.downcallHandle(
        "g_string_prepend_unichar",
        constants$184.g_string_prepend_unichar$FUNC, false
    );
}

