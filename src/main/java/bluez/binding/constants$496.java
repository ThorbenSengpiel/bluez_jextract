// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$496 {

    static final FunctionDescriptor GPollableSourceFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GPollableSourceFunc$MH = RuntimeHelper.downcallHandle(
        constants$496.GPollableSourceFunc$FUNC, false
    );
    static final FunctionDescriptor GDBusProxyTypeFunc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDBusProxyTypeFunc$MH = RuntimeHelper.downcallHandle(
        constants$496.GDBusProxyTypeFunc$FUNC, false
    );
    static final FunctionDescriptor g_action_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_action_get_type$MH = RuntimeHelper.downcallHandle(
        "g_action_get_type",
        constants$496.g_action_get_type$FUNC, false
    );
    static final FunctionDescriptor g_action_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_get_name$MH = RuntimeHelper.downcallHandle(
        "g_action_get_name",
        constants$496.g_action_get_name$FUNC, false
    );
    static final FunctionDescriptor g_action_get_parameter_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_get_parameter_type$MH = RuntimeHelper.downcallHandle(
        "g_action_get_parameter_type",
        constants$496.g_action_get_parameter_type$FUNC, false
    );
}


