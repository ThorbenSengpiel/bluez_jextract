// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$82 {

    static final FunctionDescriptor g_checksum_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_checksum_new$MH = RuntimeHelper.downcallHandle(
        "g_checksum_new",
        constants$82.g_checksum_new$FUNC, false
    );
    static final FunctionDescriptor g_checksum_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_checksum_reset$MH = RuntimeHelper.downcallHandle(
        "g_checksum_reset",
        constants$82.g_checksum_reset$FUNC, false
    );
    static final FunctionDescriptor g_checksum_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_checksum_copy$MH = RuntimeHelper.downcallHandle(
        "g_checksum_copy",
        constants$82.g_checksum_copy$FUNC, false
    );
    static final FunctionDescriptor g_checksum_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_checksum_free$MH = RuntimeHelper.downcallHandle(
        "g_checksum_free",
        constants$82.g_checksum_free$FUNC, false
    );
    static final FunctionDescriptor g_checksum_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_checksum_update$MH = RuntimeHelper.downcallHandle(
        "g_checksum_update",
        constants$82.g_checksum_update$FUNC, false
    );
    static final FunctionDescriptor g_checksum_get_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_checksum_get_string$MH = RuntimeHelper.downcallHandle(
        "g_checksum_get_string",
        constants$82.g_checksum_get_string$FUNC, false
    );
}


