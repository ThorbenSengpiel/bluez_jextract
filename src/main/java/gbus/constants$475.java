// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$475 {

    static final FunctionDescriptor g_object_take_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_take_ref$MH = RuntimeHelper.downcallHandle(
        "g_object_take_ref",
        constants$475.g_object_take_ref$FUNC, false
    );
    static final FunctionDescriptor g_object_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_ref$MH = RuntimeHelper.downcallHandle(
        "g_object_ref",
        constants$475.g_object_ref$FUNC, false
    );
    static final FunctionDescriptor g_object_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_unref$MH = RuntimeHelper.downcallHandle(
        "g_object_unref",
        constants$475.g_object_unref$FUNC, false
    );
    static final FunctionDescriptor g_object_weak_ref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_weak_ref$MH = RuntimeHelper.downcallHandle(
        "g_object_weak_ref",
        constants$475.g_object_weak_ref$FUNC, false
    );
    static final FunctionDescriptor g_object_weak_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_weak_unref$MH = RuntimeHelper.downcallHandle(
        "g_object_weak_unref",
        constants$475.g_object_weak_unref$FUNC, false
    );
    static final FunctionDescriptor g_object_add_weak_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_add_weak_pointer$MH = RuntimeHelper.downcallHandle(
        "g_object_add_weak_pointer",
        constants$475.g_object_add_weak_pointer$FUNC, false
    );
}


