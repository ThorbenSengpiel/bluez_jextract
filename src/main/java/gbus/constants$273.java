// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$273 {

    static final FunctionDescriptor g_scanner_get_next_token$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_get_next_token$MH = RuntimeHelper.downcallHandle(
        "g_scanner_get_next_token",
        constants$273.g_scanner_get_next_token$FUNC, false
    );
    static final FunctionDescriptor g_scanner_peek_next_token$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_peek_next_token$MH = RuntimeHelper.downcallHandle(
        "g_scanner_peek_next_token",
        constants$273.g_scanner_peek_next_token$FUNC, false
    );
    static final FunctionDescriptor g_scanner_cur_token$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_cur_token$MH = RuntimeHelper.downcallHandle(
        "g_scanner_cur_token",
        constants$273.g_scanner_cur_token$FUNC, false
    );
    static final FunctionDescriptor g_scanner_cur_value$FUNC = FunctionDescriptor.of(MemoryLayout.unionLayout(
        Constants$root.C_POINTER$LAYOUT.withName("v_symbol"),
        Constants$root.C_POINTER$LAYOUT.withName("v_identifier"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_binary"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_octal"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_int"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_int64"),
        Constants$root.C_DOUBLE$LAYOUT.withName("v_float"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_hex"),
        Constants$root.C_POINTER$LAYOUT.withName("v_string"),
        Constants$root.C_POINTER$LAYOUT.withName("v_comment"),
        Constants$root.C_CHAR$LAYOUT.withName("v_char"),
        Constants$root.C_INT$LAYOUT.withName("v_error")
    ).withName("_GTokenValue"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_cur_value$MH = RuntimeHelper.downcallHandle(
        "g_scanner_cur_value",
        constants$273.g_scanner_cur_value$FUNC, false
    );
    static final FunctionDescriptor g_scanner_cur_line$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_cur_line$MH = RuntimeHelper.downcallHandle(
        "g_scanner_cur_line",
        constants$273.g_scanner_cur_line$FUNC, false
    );
    static final FunctionDescriptor g_scanner_cur_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_cur_position$MH = RuntimeHelper.downcallHandle(
        "g_scanner_cur_position",
        constants$273.g_scanner_cur_position$FUNC, false
    );
}


