// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$228 {

    static final FunctionDescriptor g_variant_builder_open$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_open$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_open",
        constants$228.g_variant_builder_open$FUNC, false
    );
    static final FunctionDescriptor g_variant_builder_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_close$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_close",
        constants$228.g_variant_builder_close$FUNC, false
    );
    static final FunctionDescriptor g_variant_builder_add_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_add_value",
        constants$228.g_variant_builder_add_value$FUNC, false
    );
    static final FunctionDescriptor g_variant_builder_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_add",
        constants$228.g_variant_builder_add$FUNC, true
    );
    static final FunctionDescriptor g_variant_builder_add_parsed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add_parsed$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_add_parsed",
        constants$228.g_variant_builder_add_parsed$FUNC, true
    );
    static final FunctionDescriptor g_variant_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new$MH = RuntimeHelper.downcallHandle(
        "g_variant_new",
        constants$228.g_variant_new$FUNC, true
    );
}


