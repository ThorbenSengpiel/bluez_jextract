// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$245 {

    static final FunctionDescriptor g_pattern_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pattern_match$MH = RuntimeHelper.downcallHandle(
        "g_pattern_match",
        constants$245.g_pattern_match$FUNC, false
    );
    static final FunctionDescriptor g_pattern_match_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pattern_match_string$MH = RuntimeHelper.downcallHandle(
        "g_pattern_match_string",
        constants$245.g_pattern_match_string$FUNC, false
    );
    static final FunctionDescriptor g_pattern_match_simple$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pattern_match_simple$MH = RuntimeHelper.downcallHandle(
        "g_pattern_match_simple",
        constants$245.g_pattern_match_simple$FUNC, false
    );
    static final FunctionDescriptor g_spaced_primes_closest$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_spaced_primes_closest$MH = RuntimeHelper.downcallHandle(
        "g_spaced_primes_closest",
        constants$245.g_spaced_primes_closest$FUNC, false
    );
    static final FunctionDescriptor g_qsort_with_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_qsort_with_data$MH = RuntimeHelper.downcallHandle(
        "g_qsort_with_data",
        constants$245.g_qsort_with_data$FUNC, false
    );
    static final FunctionDescriptor g_queue_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_queue_new$MH = RuntimeHelper.downcallHandle(
        "g_queue_new",
        constants$245.g_queue_new$FUNC, false
    );
}


