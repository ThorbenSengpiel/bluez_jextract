// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GDBusInterfaceMethodCallFunc {

    void apply(MemoryAddress connection, MemoryAddress sender, MemoryAddress object_path, MemoryAddress interface_name, MemoryAddress method_name, MemoryAddress parameters, MemoryAddress invocation, MemoryAddress user_data);
    static NativeSymbol allocate(GDBusInterfaceMethodCallFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GDBusInterfaceMethodCallFunc.class, fi, constants$578.GDBusInterfaceMethodCallFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GDBusInterfaceMethodCallFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GDBusInterfaceMethodCallFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _connection, MemoryAddress _sender, MemoryAddress _object_path, MemoryAddress _interface_name, MemoryAddress _method_name, MemoryAddress _parameters, MemoryAddress _invocation, MemoryAddress _user_data) -> {
            try {
                constants$578.GDBusInterfaceMethodCallFunc$MH.invokeExact(symbol, (Addressable)_connection, (Addressable)_sender, (Addressable)_object_path, (Addressable)_interface_name, (Addressable)_method_name, (Addressable)_parameters, (Addressable)_invocation, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

