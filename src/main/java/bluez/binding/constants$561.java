// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$561 {

    static final FunctionDescriptor crypt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypt$MH = RuntimeHelper.downcallHandle(
        "crypt",
        constants$561.crypt$FUNC, false
    );
    static final FunctionDescriptor getentropy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getentropy$MH = RuntimeHelper.downcallHandle(
        "getentropy",
        constants$561.getentropy$FUNC, false
    );
    static final FunctionDescriptor g_credentials_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_credentials_get_type$MH = RuntimeHelper.downcallHandle(
        "g_credentials_get_type",
        constants$561.g_credentials_get_type$FUNC, false
    );
    static final FunctionDescriptor g_credentials_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_credentials_new$MH = RuntimeHelper.downcallHandle(
        "g_credentials_new",
        constants$561.g_credentials_new$FUNC, false
    );
    static final FunctionDescriptor g_credentials_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_credentials_to_string$MH = RuntimeHelper.downcallHandle(
        "g_credentials_to_string",
        constants$561.g_credentials_to_string$FUNC, false
    );
    static final FunctionDescriptor g_credentials_get_native$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_credentials_get_native$MH = RuntimeHelper.downcallHandle(
        "g_credentials_get_native",
        constants$561.g_credentials_get_native$FUNC, false
    );
}


