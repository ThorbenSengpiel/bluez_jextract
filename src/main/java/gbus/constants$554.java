// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$554 {

    static final FunctionDescriptor g_bytes_icon_get_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bytes_icon_get_bytes$MH = RuntimeHelper.downcallHandle(
        "g_bytes_icon_get_bytes",
        constants$554.g_bytes_icon_get_bytes$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_cancellable_get_type$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_get_type",
        constants$554.g_cancellable_get_type$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_cancellable_new$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_new",
        constants$554.g_cancellable_new$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_is_cancelled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_is_cancelled$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_is_cancelled",
        constants$554.g_cancellable_is_cancelled$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_set_error_if_cancelled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_set_error_if_cancelled$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_set_error_if_cancelled",
        constants$554.g_cancellable_set_error_if_cancelled$FUNC, false
    );
    static final FunctionDescriptor g_cancellable_get_fd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_get_fd$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_get_fd",
        constants$554.g_cancellable_get_fd$FUNC, false
    );
}


