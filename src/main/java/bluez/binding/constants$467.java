// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$467 {

    static final FunctionDescriptor g_flags_get_value_by_nick$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_flags_get_value_by_nick$MH = RuntimeHelper.downcallHandle(
        "g_flags_get_value_by_nick",
        constants$467.g_flags_get_value_by_nick$FUNC, false
    );
    static final FunctionDescriptor g_enum_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_enum_to_string$MH = RuntimeHelper.downcallHandle(
        "g_enum_to_string",
        constants$467.g_enum_to_string$FUNC, false
    );
    static final FunctionDescriptor g_flags_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_flags_to_string$MH = RuntimeHelper.downcallHandle(
        "g_flags_to_string",
        constants$467.g_flags_to_string$FUNC, false
    );
    static final FunctionDescriptor g_value_set_enum$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_value_set_enum$MH = RuntimeHelper.downcallHandle(
        "g_value_set_enum",
        constants$467.g_value_set_enum$FUNC, false
    );
    static final FunctionDescriptor g_value_get_enum$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_enum$MH = RuntimeHelper.downcallHandle(
        "g_value_get_enum",
        constants$467.g_value_get_enum$FUNC, false
    );
    static final FunctionDescriptor g_value_set_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_value_set_flags$MH = RuntimeHelper.downcallHandle(
        "g_value_set_flags",
        constants$467.g_value_set_flags$FUNC, false
    );
}


