// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1 {

    static final FunctionDescriptor gmtime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gmtime$MH = RuntimeHelper.downcallHandle(
        "gmtime",
        constants$1.gmtime$FUNC, false
    );
    static final FunctionDescriptor localtime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle localtime$MH = RuntimeHelper.downcallHandle(
        "localtime",
        constants$1.localtime$FUNC, false
    );
    static final FunctionDescriptor gmtime_r$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gmtime_r$MH = RuntimeHelper.downcallHandle(
        "gmtime_r",
        constants$1.gmtime_r$FUNC, false
    );
    static final FunctionDescriptor localtime_r$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle localtime_r$MH = RuntimeHelper.downcallHandle(
        "localtime_r",
        constants$1.localtime_r$FUNC, false
    );
    static final FunctionDescriptor asctime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle asctime$MH = RuntimeHelper.downcallHandle(
        "asctime",
        constants$1.asctime$FUNC, false
    );
    static final FunctionDescriptor ctime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ctime$MH = RuntimeHelper.downcallHandle(
        "ctime",
        constants$1.ctime$FUNC, false
    );
}

