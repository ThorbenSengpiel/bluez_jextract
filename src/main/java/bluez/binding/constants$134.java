// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$134 {

    static final FunctionDescriptor g_hash_table_steal_extended$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_steal_extended$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_steal_extended",
        constants$134.g_hash_table_steal_extended$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_steal_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_steal_all$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_steal_all",
        constants$134.g_hash_table_steal_all$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_lookup$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_lookup",
        constants$134.g_hash_table_lookup$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_contains$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_contains$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_contains",
        constants$134.g_hash_table_contains$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_lookup_extended$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_lookup_extended$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_lookup_extended",
        constants$134.g_hash_table_lookup_extended$FUNC, false
    );
    static final FunctionDescriptor g_hash_table_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_foreach$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_foreach",
        constants$134.g_hash_table_foreach$FUNC, false
    );
}


