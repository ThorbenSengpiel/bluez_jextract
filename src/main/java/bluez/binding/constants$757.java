// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$757 {

    static final FunctionDescriptor g_resource_enumerate_children$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resource_enumerate_children$MH = RuntimeHelper.downcallHandle(
        "g_resource_enumerate_children",
        constants$757.g_resource_enumerate_children$FUNC, false
    );
    static final FunctionDescriptor g_resource_get_info$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resource_get_info$MH = RuntimeHelper.downcallHandle(
        "g_resource_get_info",
        constants$757.g_resource_get_info$FUNC, false
    );
    static final FunctionDescriptor g_resources_register$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resources_register$MH = RuntimeHelper.downcallHandle(
        "g_resources_register",
        constants$757.g_resources_register$FUNC, false
    );
    static final FunctionDescriptor g_resources_unregister$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resources_unregister$MH = RuntimeHelper.downcallHandle(
        "g_resources_unregister",
        constants$757.g_resources_unregister$FUNC, false
    );
    static final FunctionDescriptor g_resources_open_stream$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resources_open_stream$MH = RuntimeHelper.downcallHandle(
        "g_resources_open_stream",
        constants$757.g_resources_open_stream$FUNC, false
    );
    static final FunctionDescriptor g_resources_lookup_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resources_lookup_data$MH = RuntimeHelper.downcallHandle(
        "g_resources_lookup_data",
        constants$757.g_resources_lookup_data$FUNC, false
    );
}


