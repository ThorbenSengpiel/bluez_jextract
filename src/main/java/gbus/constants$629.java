// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$629 {

    static final FunctionDescriptor g_dbus_object_manager_client_new_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_client_new_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_new_sync",
        constants$629.g_dbus_object_manager_client_new_sync$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_manager_client_new_for_bus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_client_new_for_bus$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_new_for_bus",
        constants$629.g_dbus_object_manager_client_new_for_bus$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_manager_client_new_for_bus_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_client_new_for_bus_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_new_for_bus_finish",
        constants$629.g_dbus_object_manager_client_new_for_bus_finish$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_manager_client_new_for_bus_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_client_new_for_bus_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_new_for_bus_sync",
        constants$629.g_dbus_object_manager_client_new_for_bus_sync$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_manager_client_get_connection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_client_get_connection$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_get_connection",
        constants$629.g_dbus_object_manager_client_get_connection$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_manager_client_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_manager_client_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_get_flags",
        constants$629.g_dbus_object_manager_client_get_flags$FUNC, false
    );
}

