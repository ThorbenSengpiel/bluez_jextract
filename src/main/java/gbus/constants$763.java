// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$763 {

    static final FunctionDescriptor g_notification_set_icon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_icon$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_icon",
        constants$763.g_notification_set_icon$FUNC, false
    );
    static final FunctionDescriptor g_notification_set_urgent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_notification_set_urgent$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_urgent",
        constants$763.g_notification_set_urgent$FUNC, false
    );
    static final FunctionDescriptor g_notification_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_notification_set_priority$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_priority",
        constants$763.g_notification_set_priority$FUNC, false
    );
    static final FunctionDescriptor g_notification_set_category$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_category$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_category",
        constants$763.g_notification_set_category$FUNC, false
    );
    static final FunctionDescriptor g_notification_add_button$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_add_button$MH = RuntimeHelper.downcallHandle(
        "g_notification_add_button",
        constants$763.g_notification_add_button$FUNC, false
    );
    static final FunctionDescriptor g_notification_add_button_with_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_add_button_with_target$MH = RuntimeHelper.downcallHandle(
        "g_notification_add_button_with_target",
        constants$763.g_notification_add_button_with_target$FUNC, true
    );
}


