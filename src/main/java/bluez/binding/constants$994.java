// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$994 {

    static final FunctionDescriptor gatt_descriptor1_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gatt_descriptor1_get_type$MH = RuntimeHelper.downcallHandle(
        "gatt_descriptor1_get_type",
        constants$994.gatt_descriptor1_get_type$FUNC, false
    );
    static final FunctionDescriptor gatt_descriptor1_interface_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gatt_descriptor1_interface_info$MH = RuntimeHelper.downcallHandle(
        "gatt_descriptor1_interface_info",
        constants$994.gatt_descriptor1_interface_info$FUNC, false
    );
    static final FunctionDescriptor gatt_descriptor1_override_properties$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gatt_descriptor1_override_properties$MH = RuntimeHelper.downcallHandle(
        "gatt_descriptor1_override_properties",
        constants$994.gatt_descriptor1_override_properties$FUNC, false
    );
    static final FunctionDescriptor gatt_descriptor1_complete_read_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_descriptor1_complete_read_value$MH = RuntimeHelper.downcallHandle(
        "gatt_descriptor1_complete_read_value",
        constants$994.gatt_descriptor1_complete_read_value$FUNC, false
    );
    static final FunctionDescriptor gatt_descriptor1_complete_write_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_descriptor1_complete_write_value$MH = RuntimeHelper.downcallHandle(
        "gatt_descriptor1_complete_write_value",
        constants$994.gatt_descriptor1_complete_write_value$FUNC, false
    );
    static final FunctionDescriptor gatt_descriptor1_call_read_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_descriptor1_call_read_value$MH = RuntimeHelper.downcallHandle(
        "gatt_descriptor1_call_read_value",
        constants$994.gatt_descriptor1_call_read_value$FUNC, false
    );
}


