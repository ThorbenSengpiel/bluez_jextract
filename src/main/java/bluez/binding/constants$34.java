// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$34 {

    static final FunctionDescriptor strtoull$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoull$MH = RuntimeHelper.downcallHandle(
        "strtoull",
        constants$34.strtoull$FUNC, false
    );
    static final FunctionDescriptor l64a$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle l64a$MH = RuntimeHelper.downcallHandle(
        "l64a",
        constants$34.l64a$FUNC, false
    );
    static final FunctionDescriptor a64l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle a64l$MH = RuntimeHelper.downcallHandle(
        "a64l",
        constants$34.a64l$FUNC, false
    );
    static final FunctionDescriptor __bswap_16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle __bswap_16$MH = RuntimeHelper.downcallHandle(
        "__bswap_16",
        constants$34.__bswap_16$FUNC, false
    );
    static final FunctionDescriptor __bswap_32$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __bswap_32$MH = RuntimeHelper.downcallHandle(
        "__bswap_32",
        constants$34.__bswap_32$FUNC, false
    );
    static final FunctionDescriptor __bswap_64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __bswap_64$MH = RuntimeHelper.downcallHandle(
        "__bswap_64",
        constants$34.__bswap_64$FUNC, false
    );
}


