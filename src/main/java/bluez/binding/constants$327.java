// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$327 {

    static final FunctionDescriptor g_cache_key_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_key_foreach$MH = RuntimeHelper.downcallHandle(
        "g_cache_key_foreach",
        constants$327.g_cache_key_foreach$FUNC, false
    );
    static final FunctionDescriptor g_cache_value_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_value_foreach$MH = RuntimeHelper.downcallHandle(
        "g_cache_value_foreach",
        constants$327.g_cache_value_foreach$FUNC, false
    );
    static final FunctionDescriptor GCompletionFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCompletionFunc$MH = RuntimeHelper.downcallHandle(
        constants$327.GCompletionFunc$FUNC, false
    );
    static final FunctionDescriptor GCompletionStrncmpFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GCompletionStrncmpFunc$MH = RuntimeHelper.downcallHandle(
        constants$327.GCompletionStrncmpFunc$FUNC, false
    );
}

