// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$356 {

    static final FunctionDescriptor g_static_rw_lock_reader_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_reader_unlock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_reader_unlock",
        constants$356.g_static_rw_lock_reader_unlock$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_writer_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_lock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_lock",
        constants$356.g_static_rw_lock_writer_lock$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_writer_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_trylock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_trylock",
        constants$356.g_static_rw_lock_writer_trylock$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_writer_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_unlock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_unlock",
        constants$356.g_static_rw_lock_writer_unlock$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_free$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_free",
        constants$356.g_static_rw_lock_free$FUNC, false
    );
    static final FunctionDescriptor g_private_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_new$MH = RuntimeHelper.downcallHandle(
        "g_private_new",
        constants$356.g_private_new$FUNC, false
    );
}


