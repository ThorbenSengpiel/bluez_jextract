// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$454 {

    static final FunctionDescriptor g_object_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_set$MH = RuntimeHelper.downcallHandle(
        "g_object_set",
        constants$454.g_object_set$FUNC, true
    );
    static final FunctionDescriptor g_object_get$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_get$MH = RuntimeHelper.downcallHandle(
        "g_object_get",
        constants$454.g_object_get$FUNC, true
    );
    static final FunctionDescriptor g_object_connect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_connect$MH = RuntimeHelper.downcallHandle(
        "g_object_connect",
        constants$454.g_object_connect$FUNC, true
    );
    static final FunctionDescriptor g_object_disconnect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_disconnect$MH = RuntimeHelper.downcallHandle(
        "g_object_disconnect",
        constants$454.g_object_disconnect$FUNC, true
    );
    static final FunctionDescriptor g_object_setv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_setv$MH = RuntimeHelper.downcallHandle(
        "g_object_setv",
        constants$454.g_object_setv$FUNC, false
    );
    static final FunctionDescriptor g_object_set_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_set_valist$MH = RuntimeHelper.downcallHandle(
        "g_object_set_valist",
        constants$454.g_object_set_valist$FUNC, false
    );
}


