// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$305 {

    static final FunctionDescriptor g_ascii_string_to_unsigned$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ascii_string_to_unsigned$MH = RuntimeHelper.downcallHandle(
        "g_ascii_string_to_unsigned",
        constants$305.g_ascii_string_to_unsigned$FUNC, false
    );
    static final FunctionDescriptor g_string_chunk_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_chunk_new$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_new",
        constants$305.g_string_chunk_new$FUNC, false
    );
    static final FunctionDescriptor g_string_chunk_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_chunk_free$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_free",
        constants$305.g_string_chunk_free$FUNC, false
    );
    static final FunctionDescriptor g_string_chunk_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_chunk_clear$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_clear",
        constants$305.g_string_chunk_clear$FUNC, false
    );
    static final FunctionDescriptor g_string_chunk_insert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_chunk_insert$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_insert",
        constants$305.g_string_chunk_insert$FUNC, false
    );
    static final FunctionDescriptor g_string_chunk_insert_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_chunk_insert_len$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_insert_len",
        constants$305.g_string_chunk_insert_len$FUNC, false
    );
}


