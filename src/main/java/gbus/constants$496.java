// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$496 {

    static final FunctionDescriptor GTypePluginCompleteInterfaceInfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypePluginCompleteInterfaceInfo$MH = RuntimeHelper.downcallHandle(
        constants$496.GTypePluginCompleteInterfaceInfo$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_type_plugin_get_type$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_get_type",
        constants$496.g_type_plugin_get_type$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_use$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_use$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_use",
        constants$496.g_type_plugin_use$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_unuse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_unuse$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_unuse",
        constants$496.g_type_plugin_unuse$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_complete_type_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_complete_type_info$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_complete_type_info",
        constants$496.g_type_plugin_complete_type_info$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_complete_interface_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_complete_interface_info$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_complete_interface_info",
        constants$496.g_type_plugin_complete_interface_info$FUNC, false
    );
}


