// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$684 {

    static final FunctionDescriptor g_file_info_get_attribute_uint64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_uint64$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_uint64",
        constants$684.g_file_info_get_attribute_uint64$FUNC, false
    );
    static final FunctionDescriptor g_file_info_get_attribute_int64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_int64$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_int64",
        constants$684.g_file_info_get_attribute_int64$FUNC, false
    );
    static final FunctionDescriptor g_file_info_get_attribute_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_object$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_object",
        constants$684.g_file_info_get_attribute_object$FUNC, false
    );
    static final FunctionDescriptor g_file_info_get_attribute_stringv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_stringv$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_stringv",
        constants$684.g_file_info_get_attribute_stringv$FUNC, false
    );
    static final FunctionDescriptor g_file_info_set_attribute$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_attribute$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_attribute",
        constants$684.g_file_info_set_attribute$FUNC, false
    );
    static final FunctionDescriptor g_file_info_set_attribute_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_attribute_string$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_attribute_string",
        constants$684.g_file_info_set_attribute_string$FUNC, false
    );
}

