// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$10 {

    static final FunctionDescriptor g_array_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_new$MH = RuntimeHelper.downcallHandle(
        "g_array_new",
        constants$10.g_array_new$FUNC, false
    );
    static final FunctionDescriptor g_array_steal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_steal$MH = RuntimeHelper.downcallHandle(
        "g_array_steal",
        constants$10.g_array_steal$FUNC, false
    );
    static final FunctionDescriptor g_array_sized_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_sized_new$MH = RuntimeHelper.downcallHandle(
        "g_array_sized_new",
        constants$10.g_array_sized_new$FUNC, false
    );
    static final FunctionDescriptor g_array_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_copy$MH = RuntimeHelper.downcallHandle(
        "g_array_copy",
        constants$10.g_array_copy$FUNC, false
    );
    static final FunctionDescriptor g_array_free$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_free$MH = RuntimeHelper.downcallHandle(
        "g_array_free",
        constants$10.g_array_free$FUNC, false
    );
    static final FunctionDescriptor g_array_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_ref$MH = RuntimeHelper.downcallHandle(
        "g_array_ref",
        constants$10.g_array_ref$FUNC, false
    );
}


