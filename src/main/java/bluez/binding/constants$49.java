// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$49 {

    static final FunctionDescriptor wctomb$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle wctomb$MH = RuntimeHelper.downcallHandle(
        "wctomb",
        constants$49.wctomb$FUNC, false
    );
    static final FunctionDescriptor mbstowcs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mbstowcs$MH = RuntimeHelper.downcallHandle(
        "mbstowcs",
        constants$49.mbstowcs$FUNC, false
    );
    static final FunctionDescriptor wcstombs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcstombs$MH = RuntimeHelper.downcallHandle(
        "wcstombs",
        constants$49.wcstombs$FUNC, false
    );
    static final FunctionDescriptor rpmatch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rpmatch$MH = RuntimeHelper.downcallHandle(
        "rpmatch",
        constants$49.rpmatch$FUNC, false
    );
    static final FunctionDescriptor getsubopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsubopt$MH = RuntimeHelper.downcallHandle(
        "getsubopt",
        constants$49.getsubopt$FUNC, false
    );
    static final FunctionDescriptor getloadavg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getloadavg$MH = RuntimeHelper.downcallHandle(
        "getloadavg",
        constants$49.getloadavg$FUNC, false
    );
}

