// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$487 {

    static final FunctionDescriptor g_enum_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_enum_register_static$MH = RuntimeHelper.downcallHandle(
        "g_enum_register_static",
        constants$487.g_enum_register_static$FUNC, false
    );
    static final FunctionDescriptor g_flags_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_flags_register_static$MH = RuntimeHelper.downcallHandle(
        "g_flags_register_static",
        constants$487.g_flags_register_static$FUNC, false
    );
    static final FunctionDescriptor g_enum_complete_type_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_enum_complete_type_info$MH = RuntimeHelper.downcallHandle(
        "g_enum_complete_type_info",
        constants$487.g_enum_complete_type_info$FUNC, false
    );
    static final FunctionDescriptor g_flags_complete_type_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_flags_complete_type_info$MH = RuntimeHelper.downcallHandle(
        "g_flags_complete_type_info",
        constants$487.g_flags_complete_type_info$FUNC, false
    );
    static final FunctionDescriptor g_unicode_type_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_unicode_type_get_type$MH = RuntimeHelper.downcallHandle(
        "g_unicode_type_get_type",
        constants$487.g_unicode_type_get_type$FUNC, false
    );
    static final FunctionDescriptor g_unicode_break_type_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_unicode_break_type_get_type$MH = RuntimeHelper.downcallHandle(
        "g_unicode_break_type_get_type",
        constants$487.g_unicode_break_type_get_type$FUNC, false
    );
}


