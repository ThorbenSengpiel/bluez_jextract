// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$565 {

    static final FunctionDescriptor fchdir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fchdir$MH = RuntimeHelper.downcallHandle(
        "fchdir",
        constants$565.fchdir$FUNC, false
    );
    static final FunctionDescriptor getcwd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getcwd$MH = RuntimeHelper.downcallHandle(
        "getcwd",
        constants$565.getcwd$FUNC, false
    );
    static final FunctionDescriptor getwd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getwd$MH = RuntimeHelper.downcallHandle(
        "getwd",
        constants$565.getwd$FUNC, false
    );
    static final FunctionDescriptor dup$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle dup$MH = RuntimeHelper.downcallHandle(
        "dup",
        constants$565.dup$FUNC, false
    );
    static final FunctionDescriptor dup2$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle dup2$MH = RuntimeHelper.downcallHandle(
        "dup2",
        constants$565.dup2$FUNC, false
    );
    static final  OfAddress __environ$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __environ$VH = constants$565.__environ$LAYOUT.varHandle();
    static final MemorySegment __environ$SEGMENT = RuntimeHelper.lookupGlobalVariable("__environ", constants$565.__environ$LAYOUT);
}


