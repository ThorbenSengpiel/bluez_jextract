// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$482 {

    static final FunctionDescriptor g_weak_ref_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_clear$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_clear",
        constants$482.g_weak_ref_clear$FUNC, false
    );
    static final FunctionDescriptor g_weak_ref_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_get$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_get",
        constants$482.g_weak_ref_get$FUNC, false
    );
    static final FunctionDescriptor g_weak_ref_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_set$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_set",
        constants$482.g_weak_ref_set$FUNC, false
    );
    static final FunctionDescriptor GBindingTransformFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBindingTransformFunc$MH = RuntimeHelper.downcallHandle(
        constants$482.GBindingTransformFunc$FUNC, false
    );
    static final FunctionDescriptor g_binding_flags_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_binding_flags_get_type$MH = RuntimeHelper.downcallHandle(
        "g_binding_flags_get_type",
        constants$482.g_binding_flags_get_type$FUNC, false
    );
}


