// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1006 {

    static final FunctionDescriptor glib_slistautoptr_cleanup_ObjectManagerClient$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_slistautoptr_cleanup_ObjectManagerClient$MH = RuntimeHelper.downcallHandle(
        "glib_slistautoptr_cleanup_ObjectManagerClient",
        constants$1006.glib_slistautoptr_cleanup_ObjectManagerClient$FUNC, false
    );
    static final FunctionDescriptor glib_queueautoptr_cleanup_ObjectManagerClient$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_queueautoptr_cleanup_ObjectManagerClient$MH = RuntimeHelper.downcallHandle(
        "glib_queueautoptr_cleanup_ObjectManagerClient",
        constants$1006.glib_queueautoptr_cleanup_ObjectManagerClient$FUNC, false
    );
    static final FunctionDescriptor object_manager_client_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle object_manager_client_get_type$MH = RuntimeHelper.downcallHandle(
        "object_manager_client_get_type",
        constants$1006.object_manager_client_get_type$FUNC, false
    );
    static final FunctionDescriptor object_manager_client_get_proxy_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle object_manager_client_get_proxy_type$MH = RuntimeHelper.downcallHandle(
        "object_manager_client_get_proxy_type",
        constants$1006.object_manager_client_get_proxy_type$FUNC, false
    );
    static final FunctionDescriptor object_manager_client_new$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle object_manager_client_new$MH = RuntimeHelper.downcallHandle(
        "object_manager_client_new",
        constants$1006.object_manager_client_new$FUNC, false
    );
    static final FunctionDescriptor object_manager_client_new_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle object_manager_client_new_finish$MH = RuntimeHelper.downcallHandle(
        "object_manager_client_new_finish",
        constants$1006.object_manager_client_new_finish$FUNC, false
    );
}

