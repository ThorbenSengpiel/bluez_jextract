// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$71 {

    static final FunctionDescriptor g_bit_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_bit_trylock$MH = RuntimeHelper.downcallHandle(
        "g_bit_trylock",
        constants$71.g_bit_trylock$FUNC, false
    );
    static final FunctionDescriptor g_bit_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_bit_unlock$MH = RuntimeHelper.downcallHandle(
        "g_bit_unlock",
        constants$71.g_bit_unlock$FUNC, false
    );
    static final FunctionDescriptor g_pointer_bit_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_pointer_bit_lock$MH = RuntimeHelper.downcallHandle(
        "g_pointer_bit_lock",
        constants$71.g_pointer_bit_lock$FUNC, false
    );
    static final FunctionDescriptor g_pointer_bit_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_pointer_bit_trylock$MH = RuntimeHelper.downcallHandle(
        "g_pointer_bit_trylock",
        constants$71.g_pointer_bit_trylock$FUNC, false
    );
    static final FunctionDescriptor g_pointer_bit_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_pointer_bit_unlock$MH = RuntimeHelper.downcallHandle(
        "g_pointer_bit_unlock",
        constants$71.g_pointer_bit_unlock$FUNC, false
    );
    static final FunctionDescriptor g_bookmark_file_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_bookmark_file_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_error_quark",
        constants$71.g_bookmark_file_error_quark$FUNC, false
    );
}


