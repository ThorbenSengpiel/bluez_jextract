// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$75 {

    static final FunctionDescriptor g_time_zone_get_identifier$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_get_identifier$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_get_identifier",
        constants$75.g_time_zone_get_identifier$FUNC, false
    );
    static final FunctionDescriptor g_date_time_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_unref$MH = RuntimeHelper.downcallHandle(
        "g_date_time_unref",
        constants$75.g_date_time_unref$FUNC, false
    );
    static final FunctionDescriptor g_date_time_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_ref$MH = RuntimeHelper.downcallHandle(
        "g_date_time_ref",
        constants$75.g_date_time_ref$FUNC, false
    );
    static final FunctionDescriptor g_date_time_new_now$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_new_now$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_now",
        constants$75.g_date_time_new_now$FUNC, false
    );
    static final FunctionDescriptor g_date_time_new_now_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_date_time_new_now_local$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_now_local",
        constants$75.g_date_time_new_now_local$FUNC, false
    );
    static final FunctionDescriptor g_date_time_new_now_utc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_date_time_new_now_utc$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_now_utc",
        constants$75.g_date_time_new_now_utc$FUNC, false
    );
}


