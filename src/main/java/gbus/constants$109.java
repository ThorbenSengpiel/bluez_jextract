// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$109 {

    static final FunctionDescriptor g_date_add_months$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_add_months$MH = RuntimeHelper.downcallHandle(
        "g_date_add_months",
        constants$109.g_date_add_months$FUNC, false
    );
    static final FunctionDescriptor g_date_subtract_months$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_subtract_months$MH = RuntimeHelper.downcallHandle(
        "g_date_subtract_months",
        constants$109.g_date_subtract_months$FUNC, false
    );
    static final FunctionDescriptor g_date_add_years$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_add_years$MH = RuntimeHelper.downcallHandle(
        "g_date_add_years",
        constants$109.g_date_add_years$FUNC, false
    );
    static final FunctionDescriptor g_date_subtract_years$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_subtract_years$MH = RuntimeHelper.downcallHandle(
        "g_date_subtract_years",
        constants$109.g_date_subtract_years$FUNC, false
    );
    static final FunctionDescriptor g_date_is_leap_year$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_is_leap_year$MH = RuntimeHelper.downcallHandle(
        "g_date_is_leap_year",
        constants$109.g_date_is_leap_year$FUNC, false
    );
    static final FunctionDescriptor g_date_get_days_in_month$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_get_days_in_month$MH = RuntimeHelper.downcallHandle(
        "g_date_get_days_in_month",
        constants$109.g_date_get_days_in_month$FUNC, false
    );
}


