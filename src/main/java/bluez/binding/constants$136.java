// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$136 {

    static final FunctionDescriptor g_hash_table_get_keys_as_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_get_keys_as_array$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_get_keys_as_array",
        constants$136.g_hash_table_get_keys_as_array$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_iter_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_init$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_init",
        constants$136.g_hash_table_iter_init$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_iter_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_next$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_next",
        constants$136.g_hash_table_iter_next$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_iter_get_hash_table$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_get_hash_table$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_get_hash_table",
        constants$136.g_hash_table_iter_get_hash_table$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_iter_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_remove$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_remove",
        constants$136.g_hash_table_iter_remove$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_iter_replace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_replace$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_replace",
        constants$136.g_hash_table_iter_replace$FUNC, false
    );
}

