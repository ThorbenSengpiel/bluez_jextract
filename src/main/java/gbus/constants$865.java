// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$865 {

    static final FunctionDescriptor g_vfs_parse_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_parse_name$MH = RuntimeHelper.downcallHandle(
        "g_vfs_parse_name",
        constants$865.g_vfs_parse_name$FUNC, false
    );
    static final FunctionDescriptor g_vfs_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_vfs_get_default$MH = RuntimeHelper.downcallHandle(
        "g_vfs_get_default",
        constants$865.g_vfs_get_default$FUNC, false
    );
    static final FunctionDescriptor g_vfs_get_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_vfs_get_local$MH = RuntimeHelper.downcallHandle(
        "g_vfs_get_local",
        constants$865.g_vfs_get_local$FUNC, false
    );
    static final FunctionDescriptor g_vfs_register_uri_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_register_uri_scheme$MH = RuntimeHelper.downcallHandle(
        "g_vfs_register_uri_scheme",
        constants$865.g_vfs_register_uri_scheme$FUNC, false
    );
    static final FunctionDescriptor g_vfs_unregister_uri_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_unregister_uri_scheme$MH = RuntimeHelper.downcallHandle(
        "g_vfs_unregister_uri_scheme",
        constants$865.g_vfs_unregister_uri_scheme$FUNC, false
    );
    static final FunctionDescriptor g_volume_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_volume_get_type$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_type",
        constants$865.g_volume_get_type$FUNC, false
    );
}


