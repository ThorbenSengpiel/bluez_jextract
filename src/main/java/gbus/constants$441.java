// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$441 {

    static final FunctionDescriptor GCallback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle GCallback$MH = RuntimeHelper.downcallHandle(
        constants$441.GCallback$FUNC, false
    );
    static final FunctionDescriptor GClosureNotify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GClosureNotify$MH = RuntimeHelper.downcallHandle(
        constants$441.GClosureNotify$FUNC, false
    );
    static final FunctionDescriptor GClosureMarshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GClosureMarshal$MH = RuntimeHelper.downcallHandle(
        constants$441.GClosureMarshal$FUNC, false
    );
}

