// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$95 {

    static final FunctionDescriptor g_date_set_julian$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_set_julian$MH = RuntimeHelper.downcallHandle(
        "g_date_set_julian",
        constants$95.g_date_set_julian$FUNC, false
    );
    static final FunctionDescriptor g_date_is_first_of_month$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_is_first_of_month$MH = RuntimeHelper.downcallHandle(
        "g_date_is_first_of_month",
        constants$95.g_date_is_first_of_month$FUNC, false
    );
    static final FunctionDescriptor g_date_is_last_of_month$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_is_last_of_month$MH = RuntimeHelper.downcallHandle(
        "g_date_is_last_of_month",
        constants$95.g_date_is_last_of_month$FUNC, false
    );
    static final FunctionDescriptor g_date_add_days$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_add_days$MH = RuntimeHelper.downcallHandle(
        "g_date_add_days",
        constants$95.g_date_add_days$FUNC, false
    );
    static final FunctionDescriptor g_date_subtract_days$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_subtract_days$MH = RuntimeHelper.downcallHandle(
        "g_date_subtract_days",
        constants$95.g_date_subtract_days$FUNC, false
    );
    static final FunctionDescriptor g_date_add_months$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_add_months$MH = RuntimeHelper.downcallHandle(
        "g_date_add_months",
        constants$95.g_date_add_months$FUNC, false
    );
}


