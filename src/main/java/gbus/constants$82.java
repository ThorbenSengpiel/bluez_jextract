// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$82 {

    static final FunctionDescriptor g_date_time_get_utc_offset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_utc_offset$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_utc_offset",
        constants$82.g_date_time_get_utc_offset$FUNC, false
    );
    static final FunctionDescriptor g_date_time_get_timezone$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_timezone$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_timezone",
        constants$82.g_date_time_get_timezone$FUNC, false
    );
    static final FunctionDescriptor g_date_time_get_timezone_abbreviation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_timezone_abbreviation$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_timezone_abbreviation",
        constants$82.g_date_time_get_timezone_abbreviation$FUNC, false
    );
    static final FunctionDescriptor g_date_time_is_daylight_savings$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_is_daylight_savings$MH = RuntimeHelper.downcallHandle(
        "g_date_time_is_daylight_savings",
        constants$82.g_date_time_is_daylight_savings$FUNC, false
    );
    static final FunctionDescriptor g_date_time_to_timezone$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_to_timezone$MH = RuntimeHelper.downcallHandle(
        "g_date_time_to_timezone",
        constants$82.g_date_time_to_timezone$FUNC, false
    );
    static final FunctionDescriptor g_date_time_to_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_to_local$MH = RuntimeHelper.downcallHandle(
        "g_date_time_to_local",
        constants$82.g_date_time_to_local$FUNC, false
    );
}


