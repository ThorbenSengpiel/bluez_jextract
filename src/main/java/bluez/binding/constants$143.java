// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$143 {

    static final FunctionDescriptor GHookFinalizeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFinalizeFunc$MH = RuntimeHelper.downcallHandle(
        constants$143.GHookFinalizeFunc$FUNC, false
    );
    static final FunctionDescriptor g_hook_list_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_hook_list_init$MH = RuntimeHelper.downcallHandle(
        "g_hook_list_init",
        constants$143.g_hook_list_init$FUNC, false
    );
    static final FunctionDescriptor g_hook_list_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hook_list_clear$MH = RuntimeHelper.downcallHandle(
        "g_hook_list_clear",
        constants$143.g_hook_list_clear$FUNC, false
    );
    static final FunctionDescriptor g_hook_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hook_alloc$MH = RuntimeHelper.downcallHandle(
        "g_hook_alloc",
        constants$143.g_hook_alloc$FUNC, false
    );
    static final FunctionDescriptor g_hook_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hook_free$MH = RuntimeHelper.downcallHandle(
        "g_hook_free",
        constants$143.g_hook_free$FUNC, false
    );
    static final FunctionDescriptor g_hook_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hook_ref$MH = RuntimeHelper.downcallHandle(
        "g_hook_ref",
        constants$143.g_hook_ref$FUNC, false
    );
}

