// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$756 {

    static final FunctionDescriptor g_resource_new_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resource_new_from_data$MH = RuntimeHelper.downcallHandle(
        "g_resource_new_from_data",
        constants$756.g_resource_new_from_data$FUNC, false
    );
    static final FunctionDescriptor g_resource_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resource_ref$MH = RuntimeHelper.downcallHandle(
        "g_resource_ref",
        constants$756.g_resource_ref$FUNC, false
    );
    static final FunctionDescriptor g_resource_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resource_unref$MH = RuntimeHelper.downcallHandle(
        "g_resource_unref",
        constants$756.g_resource_unref$FUNC, false
    );
    static final FunctionDescriptor g_resource_load$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resource_load$MH = RuntimeHelper.downcallHandle(
        "g_resource_load",
        constants$756.g_resource_load$FUNC, false
    );
    static final FunctionDescriptor g_resource_open_stream$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resource_open_stream$MH = RuntimeHelper.downcallHandle(
        "g_resource_open_stream",
        constants$756.g_resource_open_stream$FUNC, false
    );
    static final FunctionDescriptor g_resource_lookup_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resource_lookup_data$MH = RuntimeHelper.downcallHandle(
        "g_resource_lookup_data",
        constants$756.g_resource_lookup_data$FUNC, false
    );
}

