// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$468 {

    static final FunctionDescriptor g_value_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_value_get_flags",
        constants$468.g_value_get_flags$FUNC, false
    );
    static final FunctionDescriptor g_enum_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_enum_register_static$MH = RuntimeHelper.downcallHandle(
        "g_enum_register_static",
        constants$468.g_enum_register_static$FUNC, false
    );
    static final FunctionDescriptor g_flags_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_flags_register_static$MH = RuntimeHelper.downcallHandle(
        "g_flags_register_static",
        constants$468.g_flags_register_static$FUNC, false
    );
    static final FunctionDescriptor g_enum_complete_type_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_enum_complete_type_info$MH = RuntimeHelper.downcallHandle(
        "g_enum_complete_type_info",
        constants$468.g_enum_complete_type_info$FUNC, false
    );
    static final FunctionDescriptor g_flags_complete_type_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_flags_complete_type_info$MH = RuntimeHelper.downcallHandle(
        "g_flags_complete_type_info",
        constants$468.g_flags_complete_type_info$FUNC, false
    );
    static final FunctionDescriptor g_unicode_type_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_unicode_type_get_type$MH = RuntimeHelper.downcallHandle(
        "g_unicode_type_get_type",
        constants$468.g_unicode_type_get_type$FUNC, false
    );
}


