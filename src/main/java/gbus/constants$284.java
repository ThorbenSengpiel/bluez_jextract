// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$284 {

    static final FunctionDescriptor strcpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcpy$MH = RuntimeHelper.downcallHandle(
        "strcpy",
        constants$284.strcpy$FUNC, false
    );
    static final FunctionDescriptor strncpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncpy$MH = RuntimeHelper.downcallHandle(
        "strncpy",
        constants$284.strncpy$FUNC, false
    );
    static final FunctionDescriptor strcat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcat$MH = RuntimeHelper.downcallHandle(
        "strcat",
        constants$284.strcat$FUNC, false
    );
    static final FunctionDescriptor strncat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncat$MH = RuntimeHelper.downcallHandle(
        "strncat",
        constants$284.strncat$FUNC, false
    );
    static final FunctionDescriptor strcmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcmp$MH = RuntimeHelper.downcallHandle(
        "strcmp",
        constants$284.strcmp$FUNC, false
    );
    static final FunctionDescriptor strncmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncmp$MH = RuntimeHelper.downcallHandle(
        "strncmp",
        constants$284.strncmp$FUNC, false
    );
}

