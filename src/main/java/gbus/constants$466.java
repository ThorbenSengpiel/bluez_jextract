// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$466 {

    static final FunctionDescriptor g_variant_get_gtype$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_variant_get_gtype$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_gtype",
        constants$466.g_variant_get_gtype$FUNC, false
    );
    static final FunctionDescriptor GBoxedCopyFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBoxedCopyFunc$MH = RuntimeHelper.downcallHandle(
        constants$466.GBoxedCopyFunc$FUNC, false
    );
    static final FunctionDescriptor GBoxedFreeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBoxedFreeFunc$MH = RuntimeHelper.downcallHandle(
        constants$466.GBoxedFreeFunc$FUNC, false
    );
    static final FunctionDescriptor g_boxed_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_boxed_copy$MH = RuntimeHelper.downcallHandle(
        "g_boxed_copy",
        constants$466.g_boxed_copy$FUNC, false
    );
}


