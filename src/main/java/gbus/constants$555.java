// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$555 {

    static final FunctionDescriptor g_cancellable_make_pollfd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_make_pollfd$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_make_pollfd",
        constants$555.g_cancellable_make_pollfd$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_release_fd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_release_fd$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_release_fd",
        constants$555.g_cancellable_release_fd$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_source_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_source_new$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_source_new",
        constants$555.g_cancellable_source_new$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_get_current$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_cancellable_get_current$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_get_current",
        constants$555.g_cancellable_get_current$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_push_current$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_push_current$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_push_current",
        constants$555.g_cancellable_push_current$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_pop_current$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_pop_current$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_pop_current",
        constants$555.g_cancellable_pop_current$FUNC, false
    );
}


