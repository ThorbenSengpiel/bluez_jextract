// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$645 {

    static final FunctionDescriptor g_drive_stop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_stop$MH = RuntimeHelper.downcallHandle(
        "g_drive_stop",
        constants$645.g_drive_stop$FUNC, false
    );
    static final FunctionDescriptor g_drive_stop_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_stop_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_stop_finish",
        constants$645.g_drive_stop_finish$FUNC, false
    );
    static final FunctionDescriptor g_drive_eject_with_operation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_eject_with_operation$MH = RuntimeHelper.downcallHandle(
        "g_drive_eject_with_operation",
        constants$645.g_drive_eject_with_operation$FUNC, false
    );
    static final FunctionDescriptor g_drive_eject_with_operation_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_eject_with_operation_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_eject_with_operation_finish",
        constants$645.g_drive_eject_with_operation_finish$FUNC, false
    );
    static final FunctionDescriptor g_drive_get_sort_key$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_get_sort_key$MH = RuntimeHelper.downcallHandle(
        "g_drive_get_sort_key",
        constants$645.g_drive_get_sort_key$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dtls_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_type",
        constants$645.g_dtls_connection_get_type$FUNC, false
    );
}


