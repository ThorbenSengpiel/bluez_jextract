// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$412 {

    static final FunctionDescriptor g_type_fundamental$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_fundamental$MH = RuntimeHelper.downcallHandle(
        "g_type_fundamental",
        constants$412.g_type_fundamental$FUNC, false
    );
    static final FunctionDescriptor g_type_create_instance$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_create_instance$MH = RuntimeHelper.downcallHandle(
        "g_type_create_instance",
        constants$412.g_type_create_instance$FUNC, false
    );
    static final FunctionDescriptor g_type_free_instance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_free_instance$MH = RuntimeHelper.downcallHandle(
        "g_type_free_instance",
        constants$412.g_type_free_instance$FUNC, false
    );
    static final FunctionDescriptor g_type_add_class_cache_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_add_class_cache_func$MH = RuntimeHelper.downcallHandle(
        "g_type_add_class_cache_func",
        constants$412.g_type_add_class_cache_func$FUNC, false
    );
    static final FunctionDescriptor g_type_remove_class_cache_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_remove_class_cache_func$MH = RuntimeHelper.downcallHandle(
        "g_type_remove_class_cache_func",
        constants$412.g_type_remove_class_cache_func$FUNC, false
    );
    static final FunctionDescriptor g_type_class_unref_uncached$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_class_unref_uncached$MH = RuntimeHelper.downcallHandle(
        "g_type_class_unref_uncached",
        constants$412.g_type_class_unref_uncached$FUNC, false
    );
}


