// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$741 {

    static final FunctionDescriptor g_notification_set_icon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_icon$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_icon",
        constants$741.g_notification_set_icon$FUNC, false
    );
    static final FunctionDescriptor g_notification_set_urgent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_notification_set_urgent$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_urgent",
        constants$741.g_notification_set_urgent$FUNC, false
    );
    static final FunctionDescriptor g_notification_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_notification_set_priority$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_priority",
        constants$741.g_notification_set_priority$FUNC, false
    );
    static final FunctionDescriptor g_notification_add_button$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_add_button$MH = RuntimeHelper.downcallHandle(
        "g_notification_add_button",
        constants$741.g_notification_add_button$FUNC, false
    );
    static final FunctionDescriptor g_notification_add_button_with_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_add_button_with_target$MH = RuntimeHelper.downcallHandle(
        "g_notification_add_button_with_target",
        constants$741.g_notification_add_button_with_target$FUNC, true
    );
    static final FunctionDescriptor g_notification_add_button_with_target_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_add_button_with_target_value$MH = RuntimeHelper.downcallHandle(
        "g_notification_add_button_with_target_value",
        constants$741.g_notification_add_button_with_target_value$FUNC, false
    );
}


