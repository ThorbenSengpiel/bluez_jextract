// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$156 {

    static final FunctionDescriptor g_slist_nth_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_slist_nth_data$MH = RuntimeHelper.downcallHandle(
        "g_slist_nth_data",
        constants$156.g_slist_nth_data$FUNC, false
    );
    static final FunctionDescriptor g_clear_slist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_slist$MH = RuntimeHelper.downcallHandle(
        "g_clear_slist",
        constants$156.g_clear_slist$FUNC, false
    );
    static final FunctionDescriptor GSourceFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSourceFunc$MH = RuntimeHelper.downcallHandle(
        constants$156.GSourceFunc$FUNC, false
    );
    static final FunctionDescriptor GChildWatchFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GChildWatchFunc$MH = RuntimeHelper.downcallHandle(
        constants$156.GChildWatchFunc$FUNC, false
    );
}


