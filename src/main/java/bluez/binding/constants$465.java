// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$465 {

    static final FunctionDescriptor g_binding_get_target$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_get_target$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_target",
        constants$465.g_binding_get_target$FUNC, false
    );
    static final FunctionDescriptor g_binding_get_source_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_get_source_property$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_source_property",
        constants$465.g_binding_get_source_property$FUNC, false
    );
    static final FunctionDescriptor g_binding_get_target_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_get_target_property$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_target_property",
        constants$465.g_binding_get_target_property$FUNC, false
    );
    static final FunctionDescriptor g_binding_unbind$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_unbind$MH = RuntimeHelper.downcallHandle(
        "g_binding_unbind",
        constants$465.g_binding_unbind$FUNC, false
    );
    static final FunctionDescriptor g_object_bind_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_object_bind_property$MH = RuntimeHelper.downcallHandle(
        "g_object_bind_property",
        constants$465.g_object_bind_property$FUNC, false
    );
    static final FunctionDescriptor g_object_bind_property_full$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_bind_property_full$MH = RuntimeHelper.downcallHandle(
        "g_object_bind_property_full",
        constants$465.g_object_bind_property_full$FUNC, false
    );
}


