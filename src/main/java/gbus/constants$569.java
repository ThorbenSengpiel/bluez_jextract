// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$569 {

    static final FunctionDescriptor setpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setpgid$MH = RuntimeHelper.downcallHandle(
        "setpgid",
        constants$569.setpgid$FUNC, false
    );
    static final FunctionDescriptor setpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle setpgrp$MH = RuntimeHelper.downcallHandle(
        "setpgrp",
        constants$569.setpgrp$FUNC, false
    );
    static final FunctionDescriptor setsid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle setsid$MH = RuntimeHelper.downcallHandle(
        "setsid",
        constants$569.setsid$FUNC, false
    );
    static final FunctionDescriptor getsid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getsid$MH = RuntimeHelper.downcallHandle(
        "getsid",
        constants$569.getsid$FUNC, false
    );
    static final FunctionDescriptor getuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getuid$MH = RuntimeHelper.downcallHandle(
        "getuid",
        constants$569.getuid$FUNC, false
    );
    static final FunctionDescriptor geteuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle geteuid$MH = RuntimeHelper.downcallHandle(
        "geteuid",
        constants$569.geteuid$FUNC, false
    );
}


