// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$452 {

    static final FunctionDescriptor g_object_class_find_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_find_property$MH = RuntimeHelper.downcallHandle(
        "g_object_class_find_property",
        constants$452.g_object_class_find_property$FUNC, false
    );
    static final FunctionDescriptor g_object_class_list_properties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_list_properties$MH = RuntimeHelper.downcallHandle(
        "g_object_class_list_properties",
        constants$452.g_object_class_list_properties$FUNC, false
    );
    static final FunctionDescriptor g_object_class_override_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_override_property$MH = RuntimeHelper.downcallHandle(
        "g_object_class_override_property",
        constants$452.g_object_class_override_property$FUNC, false
    );
    static final FunctionDescriptor g_object_class_install_properties$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_install_properties$MH = RuntimeHelper.downcallHandle(
        "g_object_class_install_properties",
        constants$452.g_object_class_install_properties$FUNC, false
    );
    static final FunctionDescriptor g_object_interface_install_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_interface_install_property$MH = RuntimeHelper.downcallHandle(
        "g_object_interface_install_property",
        constants$452.g_object_interface_install_property$FUNC, false
    );
    static final FunctionDescriptor g_object_interface_find_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_interface_find_property$MH = RuntimeHelper.downcallHandle(
        "g_object_interface_find_property",
        constants$452.g_object_interface_find_property$FUNC, false
    );
}

