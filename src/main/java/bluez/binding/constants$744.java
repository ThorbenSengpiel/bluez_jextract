// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$744 {

    static final FunctionDescriptor g_permission_get_can_release$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_get_can_release$MH = RuntimeHelper.downcallHandle(
        "g_permission_get_can_release",
        constants$744.g_permission_get_can_release$FUNC, false
    );
    static final FunctionDescriptor g_permission_impl_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_permission_impl_update$MH = RuntimeHelper.downcallHandle(
        "g_permission_impl_update",
        constants$744.g_permission_impl_update$FUNC, false
    );
    static final FunctionDescriptor g_pollable_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_pollable_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_get_type",
        constants$744.g_pollable_input_stream_get_type$FUNC, false
    );
    static final FunctionDescriptor g_pollable_input_stream_can_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_input_stream_can_poll$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_can_poll",
        constants$744.g_pollable_input_stream_can_poll$FUNC, false
    );
    static final FunctionDescriptor g_pollable_input_stream_is_readable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_input_stream_is_readable$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_is_readable",
        constants$744.g_pollable_input_stream_is_readable$FUNC, false
    );
    static final FunctionDescriptor g_pollable_input_stream_create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_input_stream_create_source$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_create_source",
        constants$744.g_pollable_input_stream_create_source$FUNC, false
    );
}


