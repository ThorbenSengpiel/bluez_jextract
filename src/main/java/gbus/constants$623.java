// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$623 {

    static final FunctionDescriptor g_dbus_method_invocation_return_error_literal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_error_literal$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_error_literal",
        constants$623.g_dbus_method_invocation_return_error_literal$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_gerror$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_gerror$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_gerror",
        constants$623.g_dbus_method_invocation_return_gerror$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_take_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_take_error$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_take_error",
        constants$623.g_dbus_method_invocation_take_error$FUNC, false
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_dbus_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_dbus_error$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_dbus_error",
        constants$623.g_dbus_method_invocation_return_dbus_error$FUNC, false
    );
    static final FunctionDescriptor GBusAcquiredCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBusAcquiredCallback$MH = RuntimeHelper.downcallHandle(
        constants$623.GBusAcquiredCallback$FUNC, false
    );
}

