// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor g_bit_nth_lsf_impl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_bit_nth_lsf_impl$MH = RuntimeHelper.downcallHandle(
        "g_bit_nth_lsf_impl",
        constants$33.g_bit_nth_lsf_impl$FUNC, false
    );
    static final FunctionDescriptor g_bit_nth_msf_impl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_bit_nth_msf_impl$MH = RuntimeHelper.downcallHandle(
        "g_bit_nth_msf_impl",
        constants$33.g_bit_nth_msf_impl$FUNC, false
    );
    static final FunctionDescriptor g_bit_storage_impl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bit_storage_impl$MH = RuntimeHelper.downcallHandle(
        "g_bit_storage_impl",
        constants$33.g_bit_storage_impl$FUNC, false
    );
    static final FunctionDescriptor __ctype_get_mb_cur_max$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle __ctype_get_mb_cur_max$MH = RuntimeHelper.downcallHandle(
        "__ctype_get_mb_cur_max",
        constants$33.__ctype_get_mb_cur_max$FUNC, false
    );
    static final FunctionDescriptor atof$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atof$MH = RuntimeHelper.downcallHandle(
        "atof",
        constants$33.atof$FUNC, false
    );
    static final FunctionDescriptor atoi$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atoi$MH = RuntimeHelper.downcallHandle(
        "atoi",
        constants$33.atoi$FUNC, false
    );
}


