// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$450 {

    static final FunctionDescriptor g_closure_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_closure_get_type$MH = RuntimeHelper.downcallHandle(
        "g_closure_get_type",
        constants$450.g_closure_get_type$FUNC, false
    );
    static final FunctionDescriptor g_value_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_value_get_type$MH = RuntimeHelper.downcallHandle(
        "g_value_get_type",
        constants$450.g_value_get_type$FUNC, false
    );
    static final FunctionDescriptor GObjectGetPropertyFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GObjectGetPropertyFunc$MH = RuntimeHelper.downcallHandle(
        constants$450.GObjectGetPropertyFunc$FUNC, false
    );
    static final FunctionDescriptor GObjectSetPropertyFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GObjectSetPropertyFunc$MH = RuntimeHelper.downcallHandle(
        constants$450.GObjectSetPropertyFunc$FUNC, false
    );
}


