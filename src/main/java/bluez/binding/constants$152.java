// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$152 {

    static final FunctionDescriptor g_slist_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_index$MH = RuntimeHelper.downcallHandle(
        "g_slist_index",
        constants$152.g_slist_index$FUNC, false
    );
    static final FunctionDescriptor g_slist_last$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_last$MH = RuntimeHelper.downcallHandle(
        "g_slist_last",
        constants$152.g_slist_last$FUNC, false
    );
    static final FunctionDescriptor g_slist_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_length$MH = RuntimeHelper.downcallHandle(
        "g_slist_length",
        constants$152.g_slist_length$FUNC, false
    );
    static final FunctionDescriptor g_slist_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_foreach$MH = RuntimeHelper.downcallHandle(
        "g_slist_foreach",
        constants$152.g_slist_foreach$FUNC, false
    );
    static final FunctionDescriptor g_slist_sort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_sort$MH = RuntimeHelper.downcallHandle(
        "g_slist_sort",
        constants$152.g_slist_sort$FUNC, false
    );
    static final FunctionDescriptor g_slist_sort_with_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_sort_with_data$MH = RuntimeHelper.downcallHandle(
        "g_slist_sort_with_data",
        constants$152.g_slist_sort_with_data$FUNC, false
    );
}

