// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$246 {

    static final FunctionDescriptor g_option_context_set_translation_domain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_translation_domain$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_translation_domain",
        constants$246.g_option_context_set_translation_domain$FUNC, false
    );
    static final FunctionDescriptor g_option_context_add_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_add_group$MH = RuntimeHelper.downcallHandle(
        "g_option_context_add_group",
        constants$246.g_option_context_add_group$FUNC, false
    );
    static final FunctionDescriptor g_option_context_set_main_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_main_group$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_main_group",
        constants$246.g_option_context_set_main_group$FUNC, false
    );
    static final FunctionDescriptor g_option_context_get_main_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_main_group$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_main_group",
        constants$246.g_option_context_get_main_group$FUNC, false
    );
    static final FunctionDescriptor g_option_context_get_help$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_help$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_help",
        constants$246.g_option_context_get_help$FUNC, false
    );
    static final FunctionDescriptor g_option_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_new$MH = RuntimeHelper.downcallHandle(
        "g_option_group_new",
        constants$246.g_option_group_new$FUNC, false
    );
}


