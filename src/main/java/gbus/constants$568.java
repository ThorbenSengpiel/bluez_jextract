// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$568 {

    static final FunctionDescriptor confstr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle confstr$MH = RuntimeHelper.downcallHandle(
        "confstr",
        constants$568.confstr$FUNC, false
    );
    static final FunctionDescriptor getpid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getpid$MH = RuntimeHelper.downcallHandle(
        "getpid",
        constants$568.getpid$FUNC, false
    );
    static final FunctionDescriptor getppid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getppid$MH = RuntimeHelper.downcallHandle(
        "getppid",
        constants$568.getppid$FUNC, false
    );
    static final FunctionDescriptor getpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getpgrp$MH = RuntimeHelper.downcallHandle(
        "getpgrp",
        constants$568.getpgrp$FUNC, false
    );
    static final FunctionDescriptor __getpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __getpgid$MH = RuntimeHelper.downcallHandle(
        "__getpgid",
        constants$568.__getpgid$FUNC, false
    );
    static final FunctionDescriptor getpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getpgid$MH = RuntimeHelper.downcallHandle(
        "getpgid",
        constants$568.getpgid$FUNC, false
    );
}

