// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$769 {

    static final FunctionDescriptor g_pollable_stream_write_all$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_stream_write_all$MH = RuntimeHelper.downcallHandle(
        "g_pollable_stream_write_all",
        constants$769.g_pollable_stream_write_all$FUNC, false
    );
    static final FunctionDescriptor g_power_profile_monitor_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_power_profile_monitor_get_type$MH = RuntimeHelper.downcallHandle(
        "g_power_profile_monitor_get_type",
        constants$769.g_power_profile_monitor_get_type$FUNC, false
    );
    static final FunctionDescriptor glib_autoptr_clear_GPowerProfileMonitor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GPowerProfileMonitor$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GPowerProfileMonitor",
        constants$769.glib_autoptr_clear_GPowerProfileMonitor$FUNC, false
    );
    static final FunctionDescriptor glib_autoptr_cleanup_GPowerProfileMonitor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_GPowerProfileMonitor$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_GPowerProfileMonitor",
        constants$769.glib_autoptr_cleanup_GPowerProfileMonitor$FUNC, false
    );
    static final FunctionDescriptor glib_listautoptr_cleanup_GPowerProfileMonitor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_listautoptr_cleanup_GPowerProfileMonitor$MH = RuntimeHelper.downcallHandle(
        "glib_listautoptr_cleanup_GPowerProfileMonitor",
        constants$769.glib_listautoptr_cleanup_GPowerProfileMonitor$FUNC, false
    );
    static final FunctionDescriptor glib_slistautoptr_cleanup_GPowerProfileMonitor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_slistautoptr_cleanup_GPowerProfileMonitor$MH = RuntimeHelper.downcallHandle(
        "glib_slistautoptr_cleanup_GPowerProfileMonitor",
        constants$769.glib_slistautoptr_cleanup_GPowerProfileMonitor$FUNC, false
    );
}


