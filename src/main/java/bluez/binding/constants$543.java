// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$543 {

    static final FunctionDescriptor lseek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle lseek$MH = RuntimeHelper.downcallHandle(
        "lseek",
        constants$543.lseek$FUNC, false
    );
    static final FunctionDescriptor close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle close$MH = RuntimeHelper.downcallHandle(
        "close",
        constants$543.close$FUNC, false
    );
    static final FunctionDescriptor read$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle read$MH = RuntimeHelper.downcallHandle(
        "read",
        constants$543.read$FUNC, false
    );
    static final FunctionDescriptor write$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle write$MH = RuntimeHelper.downcallHandle(
        "write",
        constants$543.write$FUNC, false
    );
    static final FunctionDescriptor pread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pread$MH = RuntimeHelper.downcallHandle(
        "pread",
        constants$543.pread$FUNC, false
    );
    static final FunctionDescriptor pwrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pwrite$MH = RuntimeHelper.downcallHandle(
        "pwrite",
        constants$543.pwrite$FUNC, false
    );
}


