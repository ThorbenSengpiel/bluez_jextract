// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$51 {

    static final FunctionDescriptor rpmatch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rpmatch$MH = RuntimeHelper.downcallHandle(
        "rpmatch",
        constants$51.rpmatch$FUNC, false
    );
    static final FunctionDescriptor getsubopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsubopt$MH = RuntimeHelper.downcallHandle(
        "getsubopt",
        constants$51.getsubopt$FUNC, false
    );
    static final FunctionDescriptor getloadavg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getloadavg$MH = RuntimeHelper.downcallHandle(
        "getloadavg",
        constants$51.getloadavg$FUNC, false
    );
    static final FunctionDescriptor g_thread_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_thread_error_quark",
        constants$51.g_thread_error_quark$FUNC, false
    );
    static final FunctionDescriptor GThreadFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GThreadFunc$MH = RuntimeHelper.downcallHandle(
        constants$51.GThreadFunc$FUNC, false
    );
}


