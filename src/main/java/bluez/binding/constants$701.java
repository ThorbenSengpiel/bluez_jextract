// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$701 {

    static final FunctionDescriptor g_module_symbol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_module_symbol$MH = RuntimeHelper.downcallHandle(
        "g_module_symbol",
        constants$701.g_module_symbol$FUNC, false
    );
    static final FunctionDescriptor g_module_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_module_name$MH = RuntimeHelper.downcallHandle(
        "g_module_name",
        constants$701.g_module_name$FUNC, false
    );
    static final FunctionDescriptor g_module_build_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_module_build_path$MH = RuntimeHelper.downcallHandle(
        "g_module_build_path",
        constants$701.g_module_build_path$FUNC, false
    );
    static final FunctionDescriptor g_io_module_scope_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_module_scope_new$MH = RuntimeHelper.downcallHandle(
        "g_io_module_scope_new",
        constants$701.g_io_module_scope_new$FUNC, false
    );
    static final FunctionDescriptor g_io_module_scope_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_module_scope_free$MH = RuntimeHelper.downcallHandle(
        "g_io_module_scope_free",
        constants$701.g_io_module_scope_free$FUNC, false
    );
    static final FunctionDescriptor g_io_module_scope_block$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_module_scope_block$MH = RuntimeHelper.downcallHandle(
        "g_io_module_scope_block",
        constants$701.g_io_module_scope_block$FUNC, false
    );
}


