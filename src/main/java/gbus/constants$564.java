// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$564 {

    static final FunctionDescriptor pause$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle pause$MH = RuntimeHelper.downcallHandle(
        "pause",
        constants$564.pause$FUNC, false
    );
    static final FunctionDescriptor chown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle chown$MH = RuntimeHelper.downcallHandle(
        "chown",
        constants$564.chown$FUNC, false
    );
    static final FunctionDescriptor fchown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fchown$MH = RuntimeHelper.downcallHandle(
        "fchown",
        constants$564.fchown$FUNC, false
    );
    static final FunctionDescriptor lchown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle lchown$MH = RuntimeHelper.downcallHandle(
        "lchown",
        constants$564.lchown$FUNC, false
    );
    static final FunctionDescriptor fchownat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fchownat$MH = RuntimeHelper.downcallHandle(
        "fchownat",
        constants$564.fchownat$FUNC, false
    );
    static final FunctionDescriptor chdir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle chdir$MH = RuntimeHelper.downcallHandle(
        "chdir",
        constants$564.chdir$FUNC, false
    );
}


