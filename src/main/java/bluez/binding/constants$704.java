// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$704 {

    static final FunctionDescriptor g_io_extension_point_implement$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_extension_point_implement$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_implement",
        constants$704.g_io_extension_point_implement$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_type$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_type",
        constants$704.g_io_extension_get_type$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_name$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_name",
        constants$704.g_io_extension_get_name$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_get_priority$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_priority$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_priority",
        constants$704.g_io_extension_get_priority$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_ref_class$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_ref_class$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_ref_class",
        constants$704.g_io_extension_ref_class$FUNC, false
    );
    static final FunctionDescriptor g_io_module_load$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_module_load$MH = RuntimeHelper.downcallHandle(
        "g_io_module_load",
        constants$704.g_io_module_load$FUNC, false
    );
}


