// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$258 {

    static final FunctionDescriptor g_ref_count_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_count_init$MH = RuntimeHelper.downcallHandle(
        "g_ref_count_init",
        constants$258.g_ref_count_init$FUNC, false
    );
    static final FunctionDescriptor g_ref_count_inc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_count_inc$MH = RuntimeHelper.downcallHandle(
        "g_ref_count_inc",
        constants$258.g_ref_count_inc$FUNC, false
    );
    static final FunctionDescriptor g_ref_count_dec$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_count_dec$MH = RuntimeHelper.downcallHandle(
        "g_ref_count_dec",
        constants$258.g_ref_count_dec$FUNC, false
    );
    static final FunctionDescriptor g_ref_count_compare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_ref_count_compare$MH = RuntimeHelper.downcallHandle(
        "g_ref_count_compare",
        constants$258.g_ref_count_compare$FUNC, false
    );
    static final FunctionDescriptor g_atomic_ref_count_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atomic_ref_count_init$MH = RuntimeHelper.downcallHandle(
        "g_atomic_ref_count_init",
        constants$258.g_atomic_ref_count_init$FUNC, false
    );
    static final FunctionDescriptor g_atomic_ref_count_inc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atomic_ref_count_inc$MH = RuntimeHelper.downcallHandle(
        "g_atomic_ref_count_inc",
        constants$258.g_atomic_ref_count_inc$FUNC, false
    );
}


