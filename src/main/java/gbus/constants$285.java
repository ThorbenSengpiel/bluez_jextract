// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$285 {

    static final FunctionDescriptor strcoll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcoll$MH = RuntimeHelper.downcallHandle(
        "strcoll",
        constants$285.strcoll$FUNC, false
    );
    static final FunctionDescriptor strxfrm$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strxfrm$MH = RuntimeHelper.downcallHandle(
        "strxfrm",
        constants$285.strxfrm$FUNC, false
    );
    static final FunctionDescriptor strcoll_l$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcoll_l$MH = RuntimeHelper.downcallHandle(
        "strcoll_l",
        constants$285.strcoll_l$FUNC, false
    );
    static final FunctionDescriptor strxfrm_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strxfrm_l$MH = RuntimeHelper.downcallHandle(
        "strxfrm_l",
        constants$285.strxfrm_l$FUNC, false
    );
    static final FunctionDescriptor strdup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strdup$MH = RuntimeHelper.downcallHandle(
        "strdup",
        constants$285.strdup$FUNC, false
    );
    static final FunctionDescriptor strndup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strndup$MH = RuntimeHelper.downcallHandle(
        "strndup",
        constants$285.strndup$FUNC, false
    );
}

