// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$983 {

    static final FunctionDescriptor gatt_service1_proxy_new_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_service1_proxy_new_sync$MH = RuntimeHelper.downcallHandle(
        "gatt_service1_proxy_new_sync",
        constants$983.gatt_service1_proxy_new_sync$FUNC, false
    );
    static final FunctionDescriptor gatt_service1_proxy_new_for_bus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_service1_proxy_new_for_bus$MH = RuntimeHelper.downcallHandle(
        "gatt_service1_proxy_new_for_bus",
        constants$983.gatt_service1_proxy_new_for_bus$FUNC, false
    );
    static final FunctionDescriptor gatt_service1_proxy_new_for_bus_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_service1_proxy_new_for_bus_finish$MH = RuntimeHelper.downcallHandle(
        "gatt_service1_proxy_new_for_bus_finish",
        constants$983.gatt_service1_proxy_new_for_bus_finish$FUNC, false
    );
    static final FunctionDescriptor gatt_service1_proxy_new_for_bus_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_service1_proxy_new_for_bus_sync$MH = RuntimeHelper.downcallHandle(
        "gatt_service1_proxy_new_for_bus_sync",
        constants$983.gatt_service1_proxy_new_for_bus_sync$FUNC, false
    );
    static final FunctionDescriptor gatt_service1_skeleton_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gatt_service1_skeleton_get_type$MH = RuntimeHelper.downcallHandle(
        "gatt_service1_skeleton_get_type",
        constants$983.gatt_service1_skeleton_get_type$FUNC, false
    );
    static final FunctionDescriptor glib_autoptr_clear_GattService1Skeleton$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GattService1Skeleton$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GattService1Skeleton",
        constants$983.glib_autoptr_clear_GattService1Skeleton$FUNC, false
    );
}

