// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$299 {

    static final FunctionDescriptor ffs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle ffs$MH = RuntimeHelper.downcallHandle(
        "ffs",
        constants$299.ffs$FUNC, false
    );
    static final FunctionDescriptor ffsl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ffsl$MH = RuntimeHelper.downcallHandle(
        "ffsl",
        constants$299.ffsl$FUNC, false
    );
    static final FunctionDescriptor ffsll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ffsll$MH = RuntimeHelper.downcallHandle(
        "ffsll",
        constants$299.ffsll$FUNC, false
    );
    static final FunctionDescriptor strcasecmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcasecmp$MH = RuntimeHelper.downcallHandle(
        "strcasecmp",
        constants$299.strcasecmp$FUNC, false
    );
    static final FunctionDescriptor strncasecmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncasecmp$MH = RuntimeHelper.downcallHandle(
        "strncasecmp",
        constants$299.strncasecmp$FUNC, false
    );
    static final FunctionDescriptor strcasecmp_l$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcasecmp_l$MH = RuntimeHelper.downcallHandle(
        "strcasecmp_l",
        constants$299.strcasecmp_l$FUNC, false
    );
}

