// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$39 {

    static final FunctionDescriptor rand_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rand_r$MH = RuntimeHelper.downcallHandle(
        "rand_r",
        constants$39.rand_r$FUNC, false
    );
    static final FunctionDescriptor drand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle drand48$MH = RuntimeHelper.downcallHandle(
        "drand48",
        constants$39.drand48$FUNC, false
    );
    static final FunctionDescriptor erand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle erand48$MH = RuntimeHelper.downcallHandle(
        "erand48",
        constants$39.erand48$FUNC, false
    );
    static final FunctionDescriptor lrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle lrand48$MH = RuntimeHelper.downcallHandle(
        "lrand48",
        constants$39.lrand48$FUNC, false
    );
    static final FunctionDescriptor nrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle nrand48$MH = RuntimeHelper.downcallHandle(
        "nrand48",
        constants$39.nrand48$FUNC, false
    );
    static final FunctionDescriptor mrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle mrand48$MH = RuntimeHelper.downcallHandle(
        "mrand48",
        constants$39.mrand48$FUNC, false
    );
}

