// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$298 {

    static final FunctionDescriptor strerror_l$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strerror_l$MH = RuntimeHelper.downcallHandle(
        "strerror_l",
        constants$298.strerror_l$FUNC, false
    );
    static final FunctionDescriptor bcmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle bcmp$MH = RuntimeHelper.downcallHandle(
        "bcmp",
        constants$298.bcmp$FUNC, false
    );
    static final FunctionDescriptor bcopy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle bcopy$MH = RuntimeHelper.downcallHandle(
        "bcopy",
        constants$298.bcopy$FUNC, false
    );
    static final FunctionDescriptor bzero$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle bzero$MH = RuntimeHelper.downcallHandle(
        "bzero",
        constants$298.bzero$FUNC, false
    );
    static final FunctionDescriptor index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle index$MH = RuntimeHelper.downcallHandle(
        "index",
        constants$298.index$FUNC, false
    );
    static final FunctionDescriptor rindex$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle rindex$MH = RuntimeHelper.downcallHandle(
        "rindex",
        constants$298.rindex$FUNC, false
    );
}


