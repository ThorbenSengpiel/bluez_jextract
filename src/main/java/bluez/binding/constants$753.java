// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$753 {

    static final FunctionDescriptor g_resolver_lookup_by_name_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_name_finish$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name_finish",
        constants$753.g_resolver_lookup_by_name_finish$FUNC, false
    );
    static final FunctionDescriptor g_resolver_lookup_by_name_with_flags_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_name_with_flags_async$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name_with_flags_async",
        constants$753.g_resolver_lookup_by_name_with_flags_async$FUNC, false
    );
    static final FunctionDescriptor g_resolver_lookup_by_name_with_flags_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_name_with_flags_finish$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name_with_flags_finish",
        constants$753.g_resolver_lookup_by_name_with_flags_finish$FUNC, false
    );
    static final FunctionDescriptor g_resolver_lookup_by_name_with_flags$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_name_with_flags$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name_with_flags",
        constants$753.g_resolver_lookup_by_name_with_flags$FUNC, false
    );
    static final FunctionDescriptor g_resolver_free_addresses$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_free_addresses$MH = RuntimeHelper.downcallHandle(
        "g_resolver_free_addresses",
        constants$753.g_resolver_free_addresses$FUNC, false
    );
    static final FunctionDescriptor g_resolver_lookup_by_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_address$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_address",
        constants$753.g_resolver_lookup_by_address$FUNC, false
    );
}

