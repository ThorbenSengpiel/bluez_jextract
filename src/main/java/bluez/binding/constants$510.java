// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$510 {

    static final FunctionDescriptor g_application_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_application_get_type$MH = RuntimeHelper.downcallHandle(
        "g_application_get_type",
        constants$510.g_application_get_type$FUNC, false
    );
    static final FunctionDescriptor g_application_id_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_id_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_application_id_is_valid",
        constants$510.g_application_id_is_valid$FUNC, false
    );
    static final FunctionDescriptor g_application_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_application_new$MH = RuntimeHelper.downcallHandle(
        "g_application_new",
        constants$510.g_application_new$FUNC, false
    );
    static final FunctionDescriptor g_application_get_application_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_application_id$MH = RuntimeHelper.downcallHandle(
        "g_application_get_application_id",
        constants$510.g_application_get_application_id$FUNC, false
    );
    static final FunctionDescriptor g_application_set_application_id$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_set_application_id$MH = RuntimeHelper.downcallHandle(
        "g_application_set_application_id",
        constants$510.g_application_set_application_id$FUNC, false
    );
    static final FunctionDescriptor g_application_get_dbus_connection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_dbus_connection$MH = RuntimeHelper.downcallHandle(
        "g_application_get_dbus_connection",
        constants$510.g_application_get_dbus_connection$FUNC, false
    );
}

