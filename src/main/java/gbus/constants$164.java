// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$164 {

    static final FunctionDescriptor g_source_set_dispose_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_dispose_function$MH = RuntimeHelper.downcallHandle(
        "g_source_set_dispose_function",
        constants$164.g_source_set_dispose_function$FUNC, false
    );
    static final FunctionDescriptor g_source_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_ref$MH = RuntimeHelper.downcallHandle(
        "g_source_ref",
        constants$164.g_source_ref$FUNC, false
    );
    static final FunctionDescriptor g_source_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_unref$MH = RuntimeHelper.downcallHandle(
        "g_source_unref",
        constants$164.g_source_unref$FUNC, false
    );
    static final FunctionDescriptor g_source_attach$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_attach$MH = RuntimeHelper.downcallHandle(
        "g_source_attach",
        constants$164.g_source_attach$FUNC, false
    );
    static final FunctionDescriptor g_source_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_destroy$MH = RuntimeHelper.downcallHandle(
        "g_source_destroy",
        constants$164.g_source_destroy$FUNC, false
    );
    static final FunctionDescriptor g_source_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_set_priority$MH = RuntimeHelper.downcallHandle(
        "g_source_set_priority",
        constants$164.g_source_set_priority$FUNC, false
    );
}

