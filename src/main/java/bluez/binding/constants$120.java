// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$120 {

    static final FunctionDescriptor g_realloc_n$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_realloc_n$MH = RuntimeHelper.downcallHandle(
        "g_realloc_n",
        constants$120.g_realloc_n$FUNC, false
    );
    static final FunctionDescriptor g_try_malloc_n$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_try_malloc_n$MH = RuntimeHelper.downcallHandle(
        "g_try_malloc_n",
        constants$120.g_try_malloc_n$FUNC, false
    );
    static final FunctionDescriptor g_try_malloc0_n$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_try_malloc0_n$MH = RuntimeHelper.downcallHandle(
        "g_try_malloc0_n",
        constants$120.g_try_malloc0_n$FUNC, false
    );
    static final FunctionDescriptor g_try_realloc_n$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_try_realloc_n$MH = RuntimeHelper.downcallHandle(
        "g_try_realloc_n",
        constants$120.g_try_realloc_n$FUNC, false
    );
    static final FunctionDescriptor g_steal_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_steal_pointer$MH = RuntimeHelper.downcallHandle(
        "g_steal_pointer",
        constants$120.g_steal_pointer$FUNC, false
    );
    static final FunctionDescriptor g_mem_set_vtable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mem_set_vtable$MH = RuntimeHelper.downcallHandle(
        "g_mem_set_vtable",
        constants$120.g_mem_set_vtable$FUNC, false
    );
}


