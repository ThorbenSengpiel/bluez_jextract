// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$95 {

    static final FunctionDescriptor g_checksum_type_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_checksum_type_get_length$MH = RuntimeHelper.downcallHandle(
        "g_checksum_type_get_length",
        constants$95.g_checksum_type_get_length$FUNC, false
    );
    static final FunctionDescriptor g_checksum_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_checksum_new$MH = RuntimeHelper.downcallHandle(
        "g_checksum_new",
        constants$95.g_checksum_new$FUNC, false
    );
    static final FunctionDescriptor g_checksum_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_checksum_reset$MH = RuntimeHelper.downcallHandle(
        "g_checksum_reset",
        constants$95.g_checksum_reset$FUNC, false
    );
    static final FunctionDescriptor g_checksum_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_checksum_copy$MH = RuntimeHelper.downcallHandle(
        "g_checksum_copy",
        constants$95.g_checksum_copy$FUNC, false
    );
    static final FunctionDescriptor g_checksum_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_checksum_free$MH = RuntimeHelper.downcallHandle(
        "g_checksum_free",
        constants$95.g_checksum_free$FUNC, false
    );
    static final FunctionDescriptor g_checksum_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_checksum_update$MH = RuntimeHelper.downcallHandle(
        "g_checksum_update",
        constants$95.g_checksum_update$FUNC, false
    );
}


