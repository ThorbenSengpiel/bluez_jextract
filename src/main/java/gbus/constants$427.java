// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$427 {

    static final FunctionDescriptor g_type_interface_add_prerequisite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_interface_add_prerequisite$MH = RuntimeHelper.downcallHandle(
        "g_type_interface_add_prerequisite",
        constants$427.g_type_interface_add_prerequisite$FUNC, false
    );
    static final FunctionDescriptor g_type_interface_prerequisites$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_interface_prerequisites$MH = RuntimeHelper.downcallHandle(
        "g_type_interface_prerequisites",
        constants$427.g_type_interface_prerequisites$FUNC, false
    );
    static final FunctionDescriptor g_type_interface_instantiatable_prerequisite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_interface_instantiatable_prerequisite$MH = RuntimeHelper.downcallHandle(
        "g_type_interface_instantiatable_prerequisite",
        constants$427.g_type_interface_instantiatable_prerequisite$FUNC, false
    );
    static final FunctionDescriptor g_type_class_add_private$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_class_add_private$MH = RuntimeHelper.downcallHandle(
        "g_type_class_add_private",
        constants$427.g_type_class_add_private$FUNC, false
    );
    static final FunctionDescriptor g_type_add_instance_private$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_add_instance_private$MH = RuntimeHelper.downcallHandle(
        "g_type_add_instance_private",
        constants$427.g_type_add_instance_private$FUNC, false
    );
    static final FunctionDescriptor g_type_instance_get_private$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_instance_get_private$MH = RuntimeHelper.downcallHandle(
        "g_type_instance_get_private",
        constants$427.g_type_instance_get_private$FUNC, false
    );
}

