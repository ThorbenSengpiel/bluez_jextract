// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$100 {

    static final FunctionDescriptor g_datalist_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_init$MH = RuntimeHelper.downcallHandle(
        "g_datalist_init",
        constants$100.g_datalist_init$FUNC, false
    );
    static final FunctionDescriptor g_datalist_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_clear$MH = RuntimeHelper.downcallHandle(
        "g_datalist_clear",
        constants$100.g_datalist_clear$FUNC, false
    );
    static final FunctionDescriptor g_datalist_id_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_datalist_id_get_data$MH = RuntimeHelper.downcallHandle(
        "g_datalist_id_get_data",
        constants$100.g_datalist_id_get_data$FUNC, false
    );
    static final FunctionDescriptor g_datalist_id_set_data_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_id_set_data_full$MH = RuntimeHelper.downcallHandle(
        "g_datalist_id_set_data_full",
        constants$100.g_datalist_id_set_data_full$FUNC, false
    );
    static final FunctionDescriptor GDuplicateFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDuplicateFunc$MH = RuntimeHelper.downcallHandle(
        constants$100.GDuplicateFunc$FUNC, false
    );
}


