// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$643 {

    static final FunctionDescriptor g_drive_eject$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_eject$MH = RuntimeHelper.downcallHandle(
        "g_drive_eject",
        constants$643.g_drive_eject$FUNC, false
    );
    static final FunctionDescriptor g_drive_eject_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_eject_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_eject_finish",
        constants$643.g_drive_eject_finish$FUNC, false
    );
    static final FunctionDescriptor g_drive_poll_for_media$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_poll_for_media$MH = RuntimeHelper.downcallHandle(
        "g_drive_poll_for_media",
        constants$643.g_drive_poll_for_media$FUNC, false
    );
    static final FunctionDescriptor g_drive_poll_for_media_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_poll_for_media_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_poll_for_media_finish",
        constants$643.g_drive_poll_for_media_finish$FUNC, false
    );
    static final FunctionDescriptor g_drive_get_identifier$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_get_identifier$MH = RuntimeHelper.downcallHandle(
        "g_drive_get_identifier",
        constants$643.g_drive_get_identifier$FUNC, false
    );
    static final FunctionDescriptor g_drive_enumerate_identifiers$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_enumerate_identifiers$MH = RuntimeHelper.downcallHandle(
        "g_drive_enumerate_identifiers",
        constants$643.g_drive_enumerate_identifiers$FUNC, false
    );
}


