// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$670 {

    static final FunctionDescriptor g_file_set_attribute_int64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attribute_int64$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attribute_int64",
        constants$670.g_file_set_attribute_int64$FUNC, false
    );
    static final FunctionDescriptor g_file_mount_enclosing_volume$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_mount_enclosing_volume$MH = RuntimeHelper.downcallHandle(
        "g_file_mount_enclosing_volume",
        constants$670.g_file_mount_enclosing_volume$FUNC, false
    );
    static final FunctionDescriptor g_file_mount_enclosing_volume_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_mount_enclosing_volume_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_mount_enclosing_volume_finish",
        constants$670.g_file_mount_enclosing_volume_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_mount_mountable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_mount_mountable$MH = RuntimeHelper.downcallHandle(
        "g_file_mount_mountable",
        constants$670.g_file_mount_mountable$FUNC, false
    );
    static final FunctionDescriptor g_file_mount_mountable_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_mount_mountable_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_mount_mountable_finish",
        constants$670.g_file_mount_mountable_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_unmount_mountable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_unmount_mountable$MH = RuntimeHelper.downcallHandle(
        "g_file_unmount_mountable",
        constants$670.g_file_unmount_mountable$FUNC, false
    );
}


