// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$743 {

    static final FunctionDescriptor g_permission_acquire_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_acquire_finish$MH = RuntimeHelper.downcallHandle(
        "g_permission_acquire_finish",
        constants$743.g_permission_acquire_finish$FUNC, false
    );
    static final FunctionDescriptor g_permission_release$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_release$MH = RuntimeHelper.downcallHandle(
        "g_permission_release",
        constants$743.g_permission_release$FUNC, false
    );
    static final FunctionDescriptor g_permission_release_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_release_async$MH = RuntimeHelper.downcallHandle(
        "g_permission_release_async",
        constants$743.g_permission_release_async$FUNC, false
    );
    static final FunctionDescriptor g_permission_release_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_release_finish$MH = RuntimeHelper.downcallHandle(
        "g_permission_release_finish",
        constants$743.g_permission_release_finish$FUNC, false
    );
    static final FunctionDescriptor g_permission_get_allowed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_get_allowed$MH = RuntimeHelper.downcallHandle(
        "g_permission_get_allowed",
        constants$743.g_permission_get_allowed$FUNC, false
    );
    static final FunctionDescriptor g_permission_get_can_acquire$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_get_can_acquire$MH = RuntimeHelper.downcallHandle(
        "g_permission_get_can_acquire",
        constants$743.g_permission_get_can_acquire$FUNC, false
    );
}

