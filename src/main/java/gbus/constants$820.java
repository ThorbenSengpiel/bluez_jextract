// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$820 {

    static final FunctionDescriptor g_socket_client_connect_to_service_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_connect_to_service_async$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_to_service_async",
        constants$820.g_socket_client_connect_to_service_async$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_connect_to_service_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_connect_to_service_finish$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_to_service_finish",
        constants$820.g_socket_client_connect_to_service_finish$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_connect_to_uri_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_connect_to_uri_async$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_to_uri_async",
        constants$820.g_socket_client_connect_to_uri_async$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_connect_to_uri_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_connect_to_uri_finish$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_to_uri_finish",
        constants$820.g_socket_client_connect_to_uri_finish$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_add_application_proxy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_add_application_proxy$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_add_application_proxy",
        constants$820.g_socket_client_add_application_proxy$FUNC, false
    );
    static final FunctionDescriptor g_socket_connectable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_connectable_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_connectable_get_type",
        constants$820.g_socket_connectable_get_type$FUNC, false
    );
}


