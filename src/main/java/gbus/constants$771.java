// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$771 {

    static final FunctionDescriptor g_property_action_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_property_action_get_type$MH = RuntimeHelper.downcallHandle(
        "g_property_action_get_type",
        constants$771.g_property_action_get_type$FUNC, false
    );
    static final FunctionDescriptor g_property_action_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_property_action_new$MH = RuntimeHelper.downcallHandle(
        "g_property_action_new",
        constants$771.g_property_action_new$FUNC, false
    );
    static final FunctionDescriptor g_proxy_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_proxy_get_type$MH = RuntimeHelper.downcallHandle(
        "g_proxy_get_type",
        constants$771.g_proxy_get_type$FUNC, false
    );
    static final FunctionDescriptor g_proxy_get_default_for_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_proxy_get_default_for_protocol$MH = RuntimeHelper.downcallHandle(
        "g_proxy_get_default_for_protocol",
        constants$771.g_proxy_get_default_for_protocol$FUNC, false
    );
    static final FunctionDescriptor g_proxy_connect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_proxy_connect$MH = RuntimeHelper.downcallHandle(
        "g_proxy_connect",
        constants$771.g_proxy_connect$FUNC, false
    );
    static final FunctionDescriptor g_proxy_connect_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_proxy_connect_async$MH = RuntimeHelper.downcallHandle(
        "g_proxy_connect_async",
        constants$771.g_proxy_connect_async$FUNC, false
    );
}


