// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$624 {

    static final FunctionDescriptor GBusNameAcquiredCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBusNameAcquiredCallback$MH = RuntimeHelper.downcallHandle(
        constants$624.GBusNameAcquiredCallback$FUNC, false
    );
    static final FunctionDescriptor GBusNameLostCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBusNameLostCallback$MH = RuntimeHelper.downcallHandle(
        constants$624.GBusNameLostCallback$FUNC, false
    );
    static final FunctionDescriptor g_bus_own_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_own_name$MH = RuntimeHelper.downcallHandle(
        "g_bus_own_name",
        constants$624.g_bus_own_name$FUNC, false
    );
    static final FunctionDescriptor g_bus_own_name_on_connection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_own_name_on_connection$MH = RuntimeHelper.downcallHandle(
        "g_bus_own_name_on_connection",
        constants$624.g_bus_own_name_on_connection$FUNC, false
    );
}


