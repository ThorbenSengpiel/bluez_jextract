// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$774 {

    static final FunctionDescriptor g_socket_address_enumerator_next$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_address_enumerator_next$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_enumerator_next",
        constants$774.g_socket_address_enumerator_next$FUNC, false
    );
    static final FunctionDescriptor g_socket_address_enumerator_next_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_address_enumerator_next_async$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_enumerator_next_async",
        constants$774.g_socket_address_enumerator_next_async$FUNC, false
    );
    static final FunctionDescriptor g_socket_address_enumerator_next_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_address_enumerator_next_finish$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_enumerator_next_finish",
        constants$774.g_socket_address_enumerator_next_finish$FUNC, false
    );
    static final FunctionDescriptor g_proxy_address_enumerator_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_proxy_address_enumerator_get_type$MH = RuntimeHelper.downcallHandle(
        "g_proxy_address_enumerator_get_type",
        constants$774.g_proxy_address_enumerator_get_type$FUNC, false
    );
    static final FunctionDescriptor g_proxy_resolver_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_proxy_resolver_get_type$MH = RuntimeHelper.downcallHandle(
        "g_proxy_resolver_get_type",
        constants$774.g_proxy_resolver_get_type$FUNC, false
    );
    static final FunctionDescriptor g_proxy_resolver_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_proxy_resolver_get_default$MH = RuntimeHelper.downcallHandle(
        "g_proxy_resolver_get_default",
        constants$774.g_proxy_resolver_get_default$FUNC, false
    );
}

