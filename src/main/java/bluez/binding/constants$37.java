// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$37 {

    static final FunctionDescriptor setstate_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setstate_r$MH = RuntimeHelper.downcallHandle(
        "setstate_r",
        constants$37.setstate_r$FUNC, false
    );
    static final FunctionDescriptor rand$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle rand$MH = RuntimeHelper.downcallHandle(
        "rand",
        constants$37.rand$FUNC, false
    );
    static final FunctionDescriptor srand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle srand$MH = RuntimeHelper.downcallHandle(
        "srand",
        constants$37.srand$FUNC, false
    );
    static final FunctionDescriptor rand_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rand_r$MH = RuntimeHelper.downcallHandle(
        "rand_r",
        constants$37.rand_r$FUNC, false
    );
    static final FunctionDescriptor drand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle drand48$MH = RuntimeHelper.downcallHandle(
        "drand48",
        constants$37.drand48$FUNC, false
    );
    static final FunctionDescriptor erand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle erand48$MH = RuntimeHelper.downcallHandle(
        "erand48",
        constants$37.erand48$FUNC, false
    );
}


