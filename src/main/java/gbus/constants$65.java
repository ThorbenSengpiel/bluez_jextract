// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor signal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle signal$MH = RuntimeHelper.downcallHandle(
        "signal",
        constants$65.signal$FUNC, false
    );
    static final FunctionDescriptor kill$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle kill$MH = RuntimeHelper.downcallHandle(
        "kill",
        constants$65.kill$FUNC, false
    );
    static final FunctionDescriptor killpg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle killpg$MH = RuntimeHelper.downcallHandle(
        "killpg",
        constants$65.killpg$FUNC, false
    );
    static final FunctionDescriptor raise$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle raise$MH = RuntimeHelper.downcallHandle(
        "raise",
        constants$65.raise$FUNC, false
    );
    static final FunctionDescriptor ssignal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ssignal$MH = RuntimeHelper.downcallHandle(
        "ssignal",
        constants$65.ssignal$FUNC, false
    );
    static final FunctionDescriptor gsignal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gsignal$MH = RuntimeHelper.downcallHandle(
        "gsignal",
        constants$65.gsignal$FUNC, false
    );
}


