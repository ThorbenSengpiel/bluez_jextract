// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$105 {

    static final FunctionDescriptor g_date_valid_dmy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_valid_dmy$MH = RuntimeHelper.downcallHandle(
        "g_date_valid_dmy",
        constants$105.g_date_valid_dmy$FUNC, false
    );
    static final FunctionDescriptor g_date_get_weekday$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_get_weekday$MH = RuntimeHelper.downcallHandle(
        "g_date_get_weekday",
        constants$105.g_date_get_weekday$FUNC, false
    );
    static final FunctionDescriptor g_date_get_month$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_get_month$MH = RuntimeHelper.downcallHandle(
        "g_date_get_month",
        constants$105.g_date_get_month$FUNC, false
    );
    static final FunctionDescriptor g_date_get_year$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_get_year$MH = RuntimeHelper.downcallHandle(
        "g_date_get_year",
        constants$105.g_date_get_year$FUNC, false
    );
    static final FunctionDescriptor g_date_get_day$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_get_day$MH = RuntimeHelper.downcallHandle(
        "g_date_get_day",
        constants$105.g_date_get_day$FUNC, false
    );
    static final FunctionDescriptor g_date_get_julian$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_get_julian$MH = RuntimeHelper.downcallHandle(
        "g_date_get_julian",
        constants$105.g_date_get_julian$FUNC, false
    );
}

