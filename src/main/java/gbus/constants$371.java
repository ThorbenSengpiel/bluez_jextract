// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$371 {

    static final FunctionDescriptor g_static_rec_mutex_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rec_mutex_free$MH = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_free",
        constants$371.g_static_rec_mutex_free$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_init$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_init",
        constants$371.g_static_rw_lock_init$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_reader_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_reader_lock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_reader_lock",
        constants$371.g_static_rw_lock_reader_lock$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_reader_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_reader_trylock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_reader_trylock",
        constants$371.g_static_rw_lock_reader_trylock$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_reader_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_reader_unlock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_reader_unlock",
        constants$371.g_static_rw_lock_reader_unlock$FUNC, false
    );
    static final FunctionDescriptor g_static_rw_lock_writer_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_lock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_lock",
        constants$371.g_static_rw_lock_writer_lock$FUNC, false
    );
}


