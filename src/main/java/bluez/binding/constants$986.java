// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$986 {

    static final FunctionDescriptor gatt_characteristic1_call_read_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_characteristic1_call_read_value$MH = RuntimeHelper.downcallHandle(
        "gatt_characteristic1_call_read_value",
        constants$986.gatt_characteristic1_call_read_value$FUNC, false
    );
    static final FunctionDescriptor gatt_characteristic1_call_read_value_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_characteristic1_call_read_value_finish$MH = RuntimeHelper.downcallHandle(
        "gatt_characteristic1_call_read_value_finish",
        constants$986.gatt_characteristic1_call_read_value_finish$FUNC, false
    );
    static final FunctionDescriptor gatt_characteristic1_call_read_value_sync$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_characteristic1_call_read_value_sync$MH = RuntimeHelper.downcallHandle(
        "gatt_characteristic1_call_read_value_sync",
        constants$986.gatt_characteristic1_call_read_value_sync$FUNC, false
    );
    static final FunctionDescriptor gatt_characteristic1_call_write_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_characteristic1_call_write_value$MH = RuntimeHelper.downcallHandle(
        "gatt_characteristic1_call_write_value",
        constants$986.gatt_characteristic1_call_write_value$FUNC, false
    );
    static final FunctionDescriptor gatt_characteristic1_call_write_value_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_characteristic1_call_write_value_finish$MH = RuntimeHelper.downcallHandle(
        "gatt_characteristic1_call_write_value_finish",
        constants$986.gatt_characteristic1_call_write_value_finish$FUNC, false
    );
    static final FunctionDescriptor gatt_characteristic1_call_write_value_sync$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gatt_characteristic1_call_write_value_sync$MH = RuntimeHelper.downcallHandle(
        "gatt_characteristic1_call_write_value_sync",
        constants$986.gatt_characteristic1_call_write_value_sync$FUNC, false
    );
}

