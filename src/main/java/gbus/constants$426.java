// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$426 {

    static final FunctionDescriptor g_type_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_register_static$MH = RuntimeHelper.downcallHandle(
        "g_type_register_static",
        constants$426.g_type_register_static$FUNC, false
    );
    static final FunctionDescriptor g_type_register_static_simple$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_register_static_simple$MH = RuntimeHelper.downcallHandle(
        "g_type_register_static_simple",
        constants$426.g_type_register_static_simple$FUNC, false
    );
    static final FunctionDescriptor g_type_register_dynamic$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_register_dynamic$MH = RuntimeHelper.downcallHandle(
        "g_type_register_dynamic",
        constants$426.g_type_register_dynamic$FUNC, false
    );
    static final FunctionDescriptor g_type_register_fundamental$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_register_fundamental$MH = RuntimeHelper.downcallHandle(
        "g_type_register_fundamental",
        constants$426.g_type_register_fundamental$FUNC, false
    );
    static final FunctionDescriptor g_type_add_interface_static$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_add_interface_static$MH = RuntimeHelper.downcallHandle(
        "g_type_add_interface_static",
        constants$426.g_type_add_interface_static$FUNC, false
    );
    static final FunctionDescriptor g_type_add_interface_dynamic$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_add_interface_dynamic$MH = RuntimeHelper.downcallHandle(
        "g_type_add_interface_dynamic",
        constants$426.g_type_add_interface_dynamic$FUNC, false
    );
}


