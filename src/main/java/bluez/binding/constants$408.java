// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$408 {

    static final FunctionDescriptor GTypeClassCacheFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypeClassCacheFunc$MH = RuntimeHelper.downcallHandle(
        constants$408.GTypeClassCacheFunc$FUNC, false
    );
    static final FunctionDescriptor GTypeInterfaceCheckFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypeInterfaceCheckFunc$MH = RuntimeHelper.downcallHandle(
        constants$408.GTypeInterfaceCheckFunc$FUNC, false
    );
    static final FunctionDescriptor g_type_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_register_static$MH = RuntimeHelper.downcallHandle(
        "g_type_register_static",
        constants$408.g_type_register_static$FUNC, false
    );
    static final FunctionDescriptor g_type_register_static_simple$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_register_static_simple$MH = RuntimeHelper.downcallHandle(
        "g_type_register_static_simple",
        constants$408.g_type_register_static_simple$FUNC, false
    );
}


