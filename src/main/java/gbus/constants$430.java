// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$430 {

    static final FunctionDescriptor g_type_add_class_cache_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_add_class_cache_func$MH = RuntimeHelper.downcallHandle(
        "g_type_add_class_cache_func",
        constants$430.g_type_add_class_cache_func$FUNC, false
    );
    static final FunctionDescriptor g_type_remove_class_cache_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_remove_class_cache_func$MH = RuntimeHelper.downcallHandle(
        "g_type_remove_class_cache_func",
        constants$430.g_type_remove_class_cache_func$FUNC, false
    );
    static final FunctionDescriptor g_type_class_unref_uncached$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_class_unref_uncached$MH = RuntimeHelper.downcallHandle(
        "g_type_class_unref_uncached",
        constants$430.g_type_class_unref_uncached$FUNC, false
    );
    static final FunctionDescriptor g_type_add_interface_check$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_add_interface_check$MH = RuntimeHelper.downcallHandle(
        "g_type_add_interface_check",
        constants$430.g_type_add_interface_check$FUNC, false
    );
    static final FunctionDescriptor g_type_remove_interface_check$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_remove_interface_check$MH = RuntimeHelper.downcallHandle(
        "g_type_remove_interface_check",
        constants$430.g_type_remove_interface_check$FUNC, false
    );
    static final FunctionDescriptor g_type_value_table_peek$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_value_table_peek$MH = RuntimeHelper.downcallHandle(
        "g_type_value_table_peek",
        constants$430.g_type_value_table_peek$FUNC, false
    );
}


