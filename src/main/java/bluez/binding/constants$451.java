// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$451 {

    static final FunctionDescriptor GObjectFinalizeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GObjectFinalizeFunc$MH = RuntimeHelper.downcallHandle(
        constants$451.GObjectFinalizeFunc$FUNC, false
    );
    static final FunctionDescriptor GWeakNotify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GWeakNotify$MH = RuntimeHelper.downcallHandle(
        constants$451.GWeakNotify$FUNC, false
    );
    static final FunctionDescriptor g_initially_unowned_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_initially_unowned_get_type$MH = RuntimeHelper.downcallHandle(
        "g_initially_unowned_get_type",
        constants$451.g_initially_unowned_get_type$FUNC, false
    );
    static final FunctionDescriptor g_object_class_install_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_install_property$MH = RuntimeHelper.downcallHandle(
        "g_object_class_install_property",
        constants$451.g_object_class_install_property$FUNC, false
    );
}


