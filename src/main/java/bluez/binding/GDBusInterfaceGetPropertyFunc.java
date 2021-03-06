// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GDBusInterfaceGetPropertyFunc {

    Addressable apply(MemoryAddress connection, MemoryAddress sender, MemoryAddress object_path, MemoryAddress interface_name, MemoryAddress property_name, MemoryAddress error, MemoryAddress user_data);
    static NativeSymbol allocate(GDBusInterfaceGetPropertyFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GDBusInterfaceGetPropertyFunc.class, fi, constants$578.GDBusInterfaceGetPropertyFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GDBusInterfaceGetPropertyFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GDBusInterfaceGetPropertyFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _connection, MemoryAddress _sender, MemoryAddress _object_path, MemoryAddress _interface_name, MemoryAddress _property_name, MemoryAddress _error, MemoryAddress _user_data) -> {
            try {
                return (Addressable)(MemoryAddress)constants$578.GDBusInterfaceGetPropertyFunc$MH.invokeExact(symbol, (Addressable)_connection, (Addressable)_sender, (Addressable)_object_path, (Addressable)_interface_name, (Addressable)_property_name, (Addressable)_error, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


