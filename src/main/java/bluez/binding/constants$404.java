// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$404 {

    static final FunctionDescriptor g_type_interface_peek_parent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_interface_peek_parent$MH = RuntimeHelper.downcallHandle(
        "g_type_interface_peek_parent",
        constants$404.g_type_interface_peek_parent$FUNC, false
    );
    static final FunctionDescriptor g_type_default_interface_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_default_interface_ref$MH = RuntimeHelper.downcallHandle(
        "g_type_default_interface_ref",
        constants$404.g_type_default_interface_ref$FUNC, false
    );
    static final FunctionDescriptor g_type_default_interface_peek$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_default_interface_peek$MH = RuntimeHelper.downcallHandle(
        "g_type_default_interface_peek",
        constants$404.g_type_default_interface_peek$FUNC, false
    );
    static final FunctionDescriptor g_type_default_interface_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_default_interface_unref$MH = RuntimeHelper.downcallHandle(
        "g_type_default_interface_unref",
        constants$404.g_type_default_interface_unref$FUNC, false
    );
    static final FunctionDescriptor g_type_children$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_children$MH = RuntimeHelper.downcallHandle(
        "g_type_children",
        constants$404.g_type_children$FUNC, false
    );
    static final FunctionDescriptor g_type_interfaces$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_interfaces$MH = RuntimeHelper.downcallHandle(
        "g_type_interfaces",
        constants$404.g_type_interfaces$FUNC, false
    );
}

