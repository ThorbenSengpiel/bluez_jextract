// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$420 {

    static final FunctionDescriptor g_type_next_base$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_next_base$MH = RuntimeHelper.downcallHandle(
        "g_type_next_base",
        constants$420.g_type_next_base$FUNC, false
    );
    static final FunctionDescriptor g_type_is_a$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_is_a$MH = RuntimeHelper.downcallHandle(
        "g_type_is_a",
        constants$420.g_type_is_a$FUNC, false
    );
    static final FunctionDescriptor g_type_class_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_class_ref$MH = RuntimeHelper.downcallHandle(
        "g_type_class_ref",
        constants$420.g_type_class_ref$FUNC, false
    );
    static final FunctionDescriptor g_type_class_peek$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_class_peek$MH = RuntimeHelper.downcallHandle(
        "g_type_class_peek",
        constants$420.g_type_class_peek$FUNC, false
    );
    static final FunctionDescriptor g_type_class_peek_static$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_class_peek_static$MH = RuntimeHelper.downcallHandle(
        "g_type_class_peek_static",
        constants$420.g_type_class_peek_static$FUNC, false
    );
    static final FunctionDescriptor g_type_class_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_class_unref$MH = RuntimeHelper.downcallHandle(
        "g_type_class_unref",
        constants$420.g_type_class_unref$FUNC, false
    );
}


