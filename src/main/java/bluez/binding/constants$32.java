// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$32 {

    static final FunctionDescriptor __ctype_get_mb_cur_max$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle __ctype_get_mb_cur_max$MH = RuntimeHelper.downcallHandle(
        "__ctype_get_mb_cur_max",
        constants$32.__ctype_get_mb_cur_max$FUNC, false
    );
    static final FunctionDescriptor atof$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atof$MH = RuntimeHelper.downcallHandle(
        "atof",
        constants$32.atof$FUNC, false
    );
    static final FunctionDescriptor atoi$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atoi$MH = RuntimeHelper.downcallHandle(
        "atoi",
        constants$32.atoi$FUNC, false
    );
    static final FunctionDescriptor atol$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atol$MH = RuntimeHelper.downcallHandle(
        "atol",
        constants$32.atol$FUNC, false
    );
    static final FunctionDescriptor atoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atoll$MH = RuntimeHelper.downcallHandle(
        "atoll",
        constants$32.atoll$FUNC, false
    );
    static final FunctionDescriptor strtod$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtod$MH = RuntimeHelper.downcallHandle(
        "strtod",
        constants$32.strtod$FUNC, false
    );
}


