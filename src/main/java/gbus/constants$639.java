// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$639 {

    static final FunctionDescriptor g_dbus_is_guid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_is_guid$MH = RuntimeHelper.downcallHandle(
        "g_dbus_is_guid",
        constants$639.g_dbus_is_guid$FUNC, false
    );
    static final FunctionDescriptor g_dbus_generate_guid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_dbus_generate_guid$MH = RuntimeHelper.downcallHandle(
        "g_dbus_generate_guid",
        constants$639.g_dbus_generate_guid$FUNC, false
    );
    static final FunctionDescriptor g_dbus_is_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_is_name$MH = RuntimeHelper.downcallHandle(
        "g_dbus_is_name",
        constants$639.g_dbus_is_name$FUNC, false
    );
    static final FunctionDescriptor g_dbus_is_unique_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_is_unique_name$MH = RuntimeHelper.downcallHandle(
        "g_dbus_is_unique_name",
        constants$639.g_dbus_is_unique_name$FUNC, false
    );
    static final FunctionDescriptor g_dbus_is_member_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_is_member_name$MH = RuntimeHelper.downcallHandle(
        "g_dbus_is_member_name",
        constants$639.g_dbus_is_member_name$FUNC, false
    );
    static final FunctionDescriptor g_dbus_is_interface_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_is_interface_name$MH = RuntimeHelper.downcallHandle(
        "g_dbus_is_interface_name",
        constants$639.g_dbus_is_interface_name$FUNC, false
    );
}

