// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$98 {

    static final FunctionDescriptor g_date_strftime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_strftime$MH = RuntimeHelper.downcallHandle(
        "g_date_strftime",
        constants$98.g_date_strftime$FUNC, false
    );
    static final FunctionDescriptor g_time_zone_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_new$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new",
        constants$98.g_time_zone_new$FUNC, false
    );
    static final FunctionDescriptor g_time_zone_new_utc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_time_zone_new_utc$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_utc",
        constants$98.g_time_zone_new_utc$FUNC, false
    );
    static final FunctionDescriptor g_time_zone_new_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_time_zone_new_local$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_local",
        constants$98.g_time_zone_new_local$FUNC, false
    );
    static final FunctionDescriptor g_time_zone_new_offset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_time_zone_new_offset$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_offset",
        constants$98.g_time_zone_new_offset$FUNC, false
    );
    static final FunctionDescriptor g_time_zone_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_ref$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_ref",
        constants$98.g_time_zone_ref$FUNC, false
    );
}


