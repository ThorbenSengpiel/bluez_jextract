// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$685 {

    static final FunctionDescriptor g_socket_address_get_native_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_address_get_native_size$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_get_native_size",
        constants$685.g_socket_address_get_native_size$FUNC, false
    );
    static final FunctionDescriptor g_inet_socket_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_inet_socket_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_inet_socket_address_get_type",
        constants$685.g_inet_socket_address_get_type$FUNC, false
    );
    static final FunctionDescriptor g_inet_socket_address_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_inet_socket_address_new$MH = RuntimeHelper.downcallHandle(
        "g_inet_socket_address_new",
        constants$685.g_inet_socket_address_new$FUNC, false
    );
    static final FunctionDescriptor g_inet_socket_address_new_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_inet_socket_address_new_from_string$MH = RuntimeHelper.downcallHandle(
        "g_inet_socket_address_new_from_string",
        constants$685.g_inet_socket_address_new_from_string$FUNC, false
    );
    static final FunctionDescriptor g_inet_socket_address_get_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_socket_address_get_address$MH = RuntimeHelper.downcallHandle(
        "g_inet_socket_address_get_address",
        constants$685.g_inet_socket_address_get_address$FUNC, false
    );
    static final FunctionDescriptor g_inet_socket_address_get_port$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_socket_address_get_port$MH = RuntimeHelper.downcallHandle(
        "g_inet_socket_address_get_port",
        constants$685.g_inet_socket_address_get_port$FUNC, false
    );
}


