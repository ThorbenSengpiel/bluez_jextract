// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$742 {

    static final FunctionDescriptor g_notification_set_default_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_default_action$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_default_action",
        constants$742.g_notification_set_default_action$FUNC, false
    );
    static final FunctionDescriptor g_notification_set_default_action_and_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_default_action_and_target$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_default_action_and_target",
        constants$742.g_notification_set_default_action_and_target$FUNC, true
    );
    static final FunctionDescriptor g_notification_set_default_action_and_target_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_default_action_and_target_value$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_default_action_and_target_value",
        constants$742.g_notification_set_default_action_and_target_value$FUNC, false
    );
    static final FunctionDescriptor g_permission_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_permission_get_type$MH = RuntimeHelper.downcallHandle(
        "g_permission_get_type",
        constants$742.g_permission_get_type$FUNC, false
    );
    static final FunctionDescriptor g_permission_acquire$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_acquire$MH = RuntimeHelper.downcallHandle(
        "g_permission_acquire",
        constants$742.g_permission_acquire$FUNC, false
    );
    static final FunctionDescriptor g_permission_acquire_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_acquire_async$MH = RuntimeHelper.downcallHandle(
        "g_permission_acquire_async",
        constants$742.g_permission_acquire_async$FUNC, false
    );
}

