// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$567 {

    static final FunctionDescriptor execlp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execlp$MH = RuntimeHelper.downcallHandle(
        "execlp",
        constants$567.execlp$FUNC, true
    );
    static final FunctionDescriptor nice$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle nice$MH = RuntimeHelper.downcallHandle(
        "nice",
        constants$567.nice$FUNC, false
    );
    static final FunctionDescriptor _exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle _exit$MH = RuntimeHelper.downcallHandle(
        "_exit",
        constants$567._exit$FUNC, false
    );
    static final FunctionDescriptor pathconf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pathconf$MH = RuntimeHelper.downcallHandle(
        "pathconf",
        constants$567.pathconf$FUNC, false
    );
    static final FunctionDescriptor fpathconf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fpathconf$MH = RuntimeHelper.downcallHandle(
        "fpathconf",
        constants$567.fpathconf$FUNC, false
    );
    static final FunctionDescriptor sysconf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sysconf$MH = RuntimeHelper.downcallHandle(
        "sysconf",
        constants$567.sysconf$FUNC, false
    );
}


