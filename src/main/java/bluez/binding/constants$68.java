// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$68 {

    static final  SequenceLayout sys_siglist$LAYOUT = MemoryLayout.sequenceLayout(65, Constants$root.C_POINTER$LAYOUT);
    static final MemorySegment sys_siglist$SEGMENT = RuntimeHelper.lookupGlobalVariable("sys_siglist", constants$68.sys_siglist$LAYOUT);
    static final FunctionDescriptor sigreturn$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigreturn$MH = RuntimeHelper.downcallHandle(
        "sigreturn",
        constants$68.sigreturn$FUNC, false
    );
    static final FunctionDescriptor siginterrupt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle siginterrupt$MH = RuntimeHelper.downcallHandle(
        "siginterrupt",
        constants$68.siginterrupt$FUNC, false
    );
    static final FunctionDescriptor sigaltstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigaltstack$MH = RuntimeHelper.downcallHandle(
        "sigaltstack",
        constants$68.sigaltstack$FUNC, false
    );
    static final FunctionDescriptor sigstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigstack$MH = RuntimeHelper.downcallHandle(
        "sigstack",
        constants$68.sigstack$FUNC, false
    );
    static final FunctionDescriptor pthread_sigmask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_sigmask$MH = RuntimeHelper.downcallHandle(
        "pthread_sigmask",
        constants$68.pthread_sigmask$FUNC, false
    );
}


