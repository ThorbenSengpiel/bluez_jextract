// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$453 {

    static final FunctionDescriptor g_object_interface_list_properties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_interface_list_properties$MH = RuntimeHelper.downcallHandle(
        "g_object_interface_list_properties",
        constants$453.g_object_interface_list_properties$FUNC, false
    );
    static final FunctionDescriptor g_object_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_object_get_type$MH = RuntimeHelper.downcallHandle(
        "g_object_get_type",
        constants$453.g_object_get_type$FUNC, false
    );
    static final FunctionDescriptor g_object_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_new$MH = RuntimeHelper.downcallHandle(
        "g_object_new",
        constants$453.g_object_new$FUNC, true
    );
    static final FunctionDescriptor g_object_new_with_properties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_new_with_properties$MH = RuntimeHelper.downcallHandle(
        "g_object_new_with_properties",
        constants$453.g_object_new_with_properties$FUNC, false
    );
    static final FunctionDescriptor g_object_newv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_newv$MH = RuntimeHelper.downcallHandle(
        "g_object_newv",
        constants$453.g_object_newv$FUNC, false
    );
    static final FunctionDescriptor g_object_new_valist$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_new_valist$MH = RuntimeHelper.downcallHandle(
        "g_object_new_valist",
        constants$453.g_object_new_valist$FUNC, false
    );
}


