// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$759 {

    static final FunctionDescriptor g_network_address_parse$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_address_parse$MH = RuntimeHelper.downcallHandle(
        "g_network_address_parse",
        constants$759.g_network_address_parse$FUNC, false
    );
    static final FunctionDescriptor g_network_address_parse_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_address_parse_uri$MH = RuntimeHelper.downcallHandle(
        "g_network_address_parse_uri",
        constants$759.g_network_address_parse_uri$FUNC, false
    );
    static final FunctionDescriptor g_network_address_get_hostname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_address_get_hostname$MH = RuntimeHelper.downcallHandle(
        "g_network_address_get_hostname",
        constants$759.g_network_address_get_hostname$FUNC, false
    );
    static final FunctionDescriptor g_network_address_get_port$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_address_get_port$MH = RuntimeHelper.downcallHandle(
        "g_network_address_get_port",
        constants$759.g_network_address_get_port$FUNC, false
    );
    static final FunctionDescriptor g_network_address_get_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_address_get_scheme$MH = RuntimeHelper.downcallHandle(
        "g_network_address_get_scheme",
        constants$759.g_network_address_get_scheme$FUNC, false
    );
    static final FunctionDescriptor g_network_monitor_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_network_monitor_get_type$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_get_type",
        constants$759.g_network_monitor_get_type$FUNC, false
    );
}

