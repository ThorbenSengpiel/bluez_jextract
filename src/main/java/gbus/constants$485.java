// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$485 {

    static final FunctionDescriptor g_enum_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_enum_get_value$MH = RuntimeHelper.downcallHandle(
        "g_enum_get_value",
        constants$485.g_enum_get_value$FUNC, false
    );
    static final FunctionDescriptor g_enum_get_value_by_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_enum_get_value_by_name$MH = RuntimeHelper.downcallHandle(
        "g_enum_get_value_by_name",
        constants$485.g_enum_get_value_by_name$FUNC, false
    );
    static final FunctionDescriptor g_enum_get_value_by_nick$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_enum_get_value_by_nick$MH = RuntimeHelper.downcallHandle(
        "g_enum_get_value_by_nick",
        constants$485.g_enum_get_value_by_nick$FUNC, false
    );
    static final FunctionDescriptor g_flags_get_first_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_flags_get_first_value$MH = RuntimeHelper.downcallHandle(
        "g_flags_get_first_value",
        constants$485.g_flags_get_first_value$FUNC, false
    );
    static final FunctionDescriptor g_flags_get_value_by_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_flags_get_value_by_name$MH = RuntimeHelper.downcallHandle(
        "g_flags_get_value_by_name",
        constants$485.g_flags_get_value_by_name$FUNC, false
    );
    static final FunctionDescriptor g_flags_get_value_by_nick$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_flags_get_value_by_nick$MH = RuntimeHelper.downcallHandle(
        "g_flags_get_value_by_nick",
        constants$485.g_flags_get_value_by_nick$FUNC, false
    );
}

