// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$56 {

    static final FunctionDescriptor g_private_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_set$MH = RuntimeHelper.downcallHandle(
        "g_private_set",
        constants$56.g_private_set$FUNC, false
    );
    static final FunctionDescriptor g_private_replace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_replace$MH = RuntimeHelper.downcallHandle(
        "g_private_replace",
        constants$56.g_private_replace$FUNC, false
    );
    static final FunctionDescriptor g_once_impl$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_once_impl$MH = RuntimeHelper.downcallHandle(
        "g_once_impl",
        constants$56.g_once_impl$FUNC, false
    );
    static final FunctionDescriptor g_once_init_enter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_once_init_enter$MH = RuntimeHelper.downcallHandle(
        "g_once_init_enter",
        constants$56.g_once_init_enter$FUNC, false
    );
    static final FunctionDescriptor g_once_init_leave$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_once_init_leave$MH = RuntimeHelper.downcallHandle(
        "g_once_init_leave",
        constants$56.g_once_init_leave$FUNC, false
    );
    static final FunctionDescriptor g_get_num_processors$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_get_num_processors$MH = RuntimeHelper.downcallHandle(
        "g_get_num_processors",
        constants$56.g_get_num_processors$FUNC, false
    );
}


