// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$484 {

    static final FunctionDescriptor g_binding_get_source_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_get_source_property$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_source_property",
        constants$484.g_binding_get_source_property$FUNC, false
    );
    static final FunctionDescriptor g_binding_get_target_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_get_target_property$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_target_property",
        constants$484.g_binding_get_target_property$FUNC, false
    );
    static final FunctionDescriptor g_binding_unbind$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_unbind$MH = RuntimeHelper.downcallHandle(
        "g_binding_unbind",
        constants$484.g_binding_unbind$FUNC, false
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
        constants$484.g_object_bind_property$FUNC, false
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
        constants$484.g_object_bind_property_full$FUNC, false
    );
    static final FunctionDescriptor g_object_bind_property_with_closures$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_bind_property_with_closures$MH = RuntimeHelper.downcallHandle(
        "g_object_bind_property_with_closures",
        constants$484.g_object_bind_property_with_closures$FUNC, false
    );
}

