// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$671 {

    static final FunctionDescriptor g_file_info_set_modification_date_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_modification_date_time$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_modification_date_time",
        constants$671.g_file_info_set_modification_date_time$FUNC, false
    );
    static final FunctionDescriptor g_file_info_set_symlink_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_symlink_target$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_symlink_target",
        constants$671.g_file_info_set_symlink_target$FUNC, false
    );
    static final FunctionDescriptor g_file_info_set_sort_order$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_info_set_sort_order$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_sort_order",
        constants$671.g_file_info_set_sort_order$FUNC, false
    );
    static final FunctionDescriptor g_file_attribute_matcher_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_attribute_matcher_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_attribute_matcher_get_type",
        constants$671.g_file_attribute_matcher_get_type$FUNC, false
    );
    static final FunctionDescriptor g_file_attribute_matcher_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_attribute_matcher_new$MH = RuntimeHelper.downcallHandle(
        "g_file_attribute_matcher_new",
        constants$671.g_file_attribute_matcher_new$FUNC, false
    );
    static final FunctionDescriptor g_file_attribute_matcher_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_attribute_matcher_ref$MH = RuntimeHelper.downcallHandle(
        "g_file_attribute_matcher_ref",
        constants$671.g_file_attribute_matcher_ref$FUNC, false
    );
}


