// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$795 {

    static final FunctionDescriptor g_settings_delay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_delay$MH = RuntimeHelper.downcallHandle(
        "g_settings_delay",
        constants$795.g_settings_delay$FUNC, false
    );
    static final FunctionDescriptor g_settings_apply$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_apply$MH = RuntimeHelper.downcallHandle(
        "g_settings_apply",
        constants$795.g_settings_apply$FUNC, false
    );
    static final FunctionDescriptor g_settings_revert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_revert$MH = RuntimeHelper.downcallHandle(
        "g_settings_revert",
        constants$795.g_settings_revert$FUNC, false
    );
    static final FunctionDescriptor g_settings_get_has_unapplied$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_has_unapplied$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_has_unapplied",
        constants$795.g_settings_get_has_unapplied$FUNC, false
    );
    static final FunctionDescriptor g_settings_sync$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_settings_sync$MH = RuntimeHelper.downcallHandle(
        "g_settings_sync",
        constants$795.g_settings_sync$FUNC, false
    );
    static final FunctionDescriptor GSettingsBindSetMapping$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

