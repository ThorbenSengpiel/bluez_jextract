// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$409 {

    static final FunctionDescriptor g_type_register_dynamic$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_register_dynamic$MH = RuntimeHelper.downcallHandle(
        "g_type_register_dynamic",
        constants$409.g_type_register_dynamic$FUNC, false
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
        constants$409.g_type_register_fundamental$FUNC, false
    );
    static final FunctionDescriptor g_type_add_interface_static$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_add_interface_static$MH = RuntimeHelper.downcallHandle(
        "g_type_add_interface_static",
        constants$409.g_type_add_interface_static$FUNC, false
    );
    static final FunctionDescriptor g_type_add_interface_dynamic$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_add_interface_dynamic$MH = RuntimeHelper.downcallHandle(
        "g_type_add_interface_dynamic",
        constants$409.g_type_add_interface_dynamic$FUNC, false
    );
    static final FunctionDescriptor g_type_interface_add_prerequisite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_interface_add_prerequisite$MH = RuntimeHelper.downcallHandle(
        "g_type_interface_add_prerequisite",
        constants$409.g_type_interface_add_prerequisite$FUNC, false
    );
    static final FunctionDescriptor g_type_interface_prerequisites$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_interface_prerequisites$MH = RuntimeHelper.downcallHandle(
        "g_type_interface_prerequisites",
        constants$409.g_type_interface_prerequisites$FUNC, false
    );
}


