// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$250 {

    static final FunctionDescriptor g_qsort_with_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_qsort_with_data$MH = RuntimeHelper.downcallHandle(
        "g_qsort_with_data",
        constants$250.g_qsort_with_data$FUNC, false
    );
    static final FunctionDescriptor g_queue_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_queue_new$MH = RuntimeHelper.downcallHandle(
        "g_queue_new",
        constants$250.g_queue_new$FUNC, false
    );
    static final FunctionDescriptor g_queue_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_free$MH = RuntimeHelper.downcallHandle(
        "g_queue_free",
        constants$250.g_queue_free$FUNC, false
    );
    static final FunctionDescriptor g_queue_free_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_free_full$MH = RuntimeHelper.downcallHandle(
        "g_queue_free_full",
        constants$250.g_queue_free_full$FUNC, false
    );
    static final FunctionDescriptor g_queue_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_init$MH = RuntimeHelper.downcallHandle(
        "g_queue_init",
        constants$250.g_queue_init$FUNC, false
    );
    static final FunctionDescriptor g_queue_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_clear$MH = RuntimeHelper.downcallHandle(
        "g_queue_clear",
        constants$250.g_queue_clear$FUNC, false
    );
}


