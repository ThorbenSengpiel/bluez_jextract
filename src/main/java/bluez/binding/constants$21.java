// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor g_atomic_int_compare_and_exchange$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_atomic_int_compare_and_exchange$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_compare_and_exchange",
        constants$21.g_atomic_int_compare_and_exchange$FUNC, false
    );
    static final FunctionDescriptor g_atomic_int_add$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_atomic_int_add$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_add",
        constants$21.g_atomic_int_add$FUNC, false
    );
    static final FunctionDescriptor g_atomic_int_and$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_atomic_int_and$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_and",
        constants$21.g_atomic_int_and$FUNC, false
    );
    static final FunctionDescriptor g_atomic_int_or$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_atomic_int_or$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_or",
        constants$21.g_atomic_int_or$FUNC, false
    );
    static final FunctionDescriptor g_atomic_int_xor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_atomic_int_xor$MH = RuntimeHelper.downcallHandle(
        "g_atomic_int_xor",
        constants$21.g_atomic_int_xor$FUNC, false
    );
    static final FunctionDescriptor g_atomic_pointer_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atomic_pointer_get$MH = RuntimeHelper.downcallHandle(
        "g_atomic_pointer_get",
        constants$21.g_atomic_pointer_get$FUNC, false
    );
}


