// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$287 {

    static final FunctionDescriptor strtok$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtok$MH = RuntimeHelper.downcallHandle(
        "strtok",
        constants$287.strtok$FUNC, false
    );
    static final FunctionDescriptor __strtok_r$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __strtok_r$MH = RuntimeHelper.downcallHandle(
        "__strtok_r",
        constants$287.__strtok_r$FUNC, false
    );
    static final FunctionDescriptor strtok_r$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtok_r$MH = RuntimeHelper.downcallHandle(
        "strtok_r",
        constants$287.strtok_r$FUNC, false
    );
    static final FunctionDescriptor strlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strlen$MH = RuntimeHelper.downcallHandle(
        "strlen",
        constants$287.strlen$FUNC, false
    );
    static final FunctionDescriptor strnlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strnlen$MH = RuntimeHelper.downcallHandle(
        "strnlen",
        constants$287.strnlen$FUNC, false
    );
    static final FunctionDescriptor strerror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strerror$MH = RuntimeHelper.downcallHandle(
        "strerror",
        constants$287.strerror$FUNC, false
    );
}


