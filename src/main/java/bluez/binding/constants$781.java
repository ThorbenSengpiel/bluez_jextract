// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$781 {

    static final FunctionDescriptor g_simple_proxy_resolver_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_proxy_resolver_new$MH = RuntimeHelper.downcallHandle(
        "g_simple_proxy_resolver_new",
        constants$781.g_simple_proxy_resolver_new$FUNC, false
    );
    static final FunctionDescriptor g_simple_proxy_resolver_set_default_proxy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_proxy_resolver_set_default_proxy$MH = RuntimeHelper.downcallHandle(
        "g_simple_proxy_resolver_set_default_proxy",
        constants$781.g_simple_proxy_resolver_set_default_proxy$FUNC, false
    );
    static final FunctionDescriptor g_simple_proxy_resolver_set_ignore_hosts$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_proxy_resolver_set_ignore_hosts$MH = RuntimeHelper.downcallHandle(
        "g_simple_proxy_resolver_set_ignore_hosts",
        constants$781.g_simple_proxy_resolver_set_ignore_hosts$FUNC, false
    );
    static final FunctionDescriptor g_simple_proxy_resolver_set_uri_proxy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_proxy_resolver_set_uri_proxy$MH = RuntimeHelper.downcallHandle(
        "g_simple_proxy_resolver_set_uri_proxy",
        constants$781.g_simple_proxy_resolver_set_uri_proxy$FUNC, false
    );
    static final FunctionDescriptor g_socket_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_type",
        constants$781.g_socket_get_type$FUNC, false
    );
    static final FunctionDescriptor g_socket_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_new$MH = RuntimeHelper.downcallHandle(
        "g_socket_new",
        constants$781.g_socket_new$FUNC, false
    );
}

