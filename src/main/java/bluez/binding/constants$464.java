// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$464 {

    static final FunctionDescriptor GBindingTransformFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBindingTransformFunc$MH = RuntimeHelper.downcallHandle(
        constants$464.GBindingTransformFunc$FUNC, false
    );
    static final FunctionDescriptor g_binding_flags_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_binding_flags_get_type$MH = RuntimeHelper.downcallHandle(
        "g_binding_flags_get_type",
        constants$464.g_binding_flags_get_type$FUNC, false
    );
    static final FunctionDescriptor g_binding_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_binding_get_type$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_type",
        constants$464.g_binding_get_type$FUNC, false
    );
    static final FunctionDescriptor g_binding_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_flags",
        constants$464.g_binding_get_flags$FUNC, false
    );
    static final FunctionDescriptor g_binding_get_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_get_source$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_source",
        constants$464.g_binding_get_source$FUNC, false
    );
}


