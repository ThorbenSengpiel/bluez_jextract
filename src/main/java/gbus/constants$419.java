// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$419 {

    static final FunctionDescriptor g_type_init_with_debug_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_init_with_debug_flags$MH = RuntimeHelper.downcallHandle(
        "g_type_init_with_debug_flags",
        constants$419.g_type_init_with_debug_flags$FUNC, false
    );
    static final FunctionDescriptor g_type_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_name$MH = RuntimeHelper.downcallHandle(
        "g_type_name",
        constants$419.g_type_name$FUNC, false
    );
    static final FunctionDescriptor g_type_qname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_qname$MH = RuntimeHelper.downcallHandle(
        "g_type_qname",
        constants$419.g_type_qname$FUNC, false
    );
    static final FunctionDescriptor g_type_from_name$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_from_name$MH = RuntimeHelper.downcallHandle(
        "g_type_from_name",
        constants$419.g_type_from_name$FUNC, false
    );
    static final FunctionDescriptor g_type_parent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_parent$MH = RuntimeHelper.downcallHandle(
        "g_type_parent",
        constants$419.g_type_parent$FUNC, false
    );
    static final FunctionDescriptor g_type_depth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_depth$MH = RuntimeHelper.downcallHandle(
        "g_type_depth",
        constants$419.g_type_depth$FUNC, false
    );
}


