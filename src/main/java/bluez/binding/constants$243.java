// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$243 {

    static final FunctionDescriptor g_option_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_new$MH = RuntimeHelper.downcallHandle(
        "g_option_group_new",
        constants$243.g_option_group_new$FUNC, false
    );
    static final FunctionDescriptor g_option_group_set_parse_hooks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_set_parse_hooks$MH = RuntimeHelper.downcallHandle(
        "g_option_group_set_parse_hooks",
        constants$243.g_option_group_set_parse_hooks$FUNC, false
    );
    static final FunctionDescriptor g_option_group_set_error_hook$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_set_error_hook$MH = RuntimeHelper.downcallHandle(
        "g_option_group_set_error_hook",
        constants$243.g_option_group_set_error_hook$FUNC, false
    );
    static final FunctionDescriptor g_option_group_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_free$MH = RuntimeHelper.downcallHandle(
        "g_option_group_free",
        constants$243.g_option_group_free$FUNC, false
    );
    static final FunctionDescriptor g_option_group_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_ref$MH = RuntimeHelper.downcallHandle(
        "g_option_group_ref",
        constants$243.g_option_group_ref$FUNC, false
    );
    static final FunctionDescriptor g_option_group_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_unref$MH = RuntimeHelper.downcallHandle(
        "g_option_group_unref",
        constants$243.g_option_group_unref$FUNC, false
    );
}

