// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$323 {

    static final FunctionDescriptor g_mem_chunk_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mem_chunk_free$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_free",
        constants$323.g_mem_chunk_free$FUNC, false
    );
    static final FunctionDescriptor g_mem_chunk_clean$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mem_chunk_clean$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_clean",
        constants$323.g_mem_chunk_clean$FUNC, false
    );
    static final FunctionDescriptor g_mem_chunk_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mem_chunk_reset$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_reset",
        constants$323.g_mem_chunk_reset$FUNC, false
    );
    static final FunctionDescriptor g_mem_chunk_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mem_chunk_print$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_print",
        constants$323.g_mem_chunk_print$FUNC, false
    );
    static final FunctionDescriptor g_mem_chunk_info$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_mem_chunk_info$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_info",
        constants$323.g_mem_chunk_info$FUNC, false
    );
    static final FunctionDescriptor g_blow_chunks$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_blow_chunks$MH = RuntimeHelper.downcallHandle(
        "g_blow_chunks",
        constants$323.g_blow_chunks$FUNC, false
    );
}


