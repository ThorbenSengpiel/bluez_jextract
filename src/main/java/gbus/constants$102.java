// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$102 {

    static final FunctionDescriptor g_datalist_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_datalist_get_flags",
        constants$102.g_datalist_get_flags$FUNC, false
    );
    static final FunctionDescriptor g_dataset_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dataset_destroy$MH = RuntimeHelper.downcallHandle(
        "g_dataset_destroy",
        constants$102.g_dataset_destroy$FUNC, false
    );
    static final FunctionDescriptor g_dataset_id_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dataset_id_get_data$MH = RuntimeHelper.downcallHandle(
        "g_dataset_id_get_data",
        constants$102.g_dataset_id_get_data$FUNC, false
    );
    static final FunctionDescriptor g_datalist_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_get_data$MH = RuntimeHelper.downcallHandle(
        "g_datalist_get_data",
        constants$102.g_datalist_get_data$FUNC, false
    );
    static final FunctionDescriptor g_dataset_id_set_data_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dataset_id_set_data_full$MH = RuntimeHelper.downcallHandle(
        "g_dataset_id_set_data_full",
        constants$102.g_dataset_id_set_data_full$FUNC, false
    );
    static final FunctionDescriptor g_dataset_id_remove_no_notify$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dataset_id_remove_no_notify$MH = RuntimeHelper.downcallHandle(
        "g_dataset_id_remove_no_notify",
        constants$102.g_dataset_id_remove_no_notify$FUNC, false
    );
}

