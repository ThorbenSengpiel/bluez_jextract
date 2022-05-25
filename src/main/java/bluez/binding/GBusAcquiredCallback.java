// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GBusAcquiredCallback {

    void apply(MemoryAddress connection, MemoryAddress name, MemoryAddress user_data);
    static NativeSymbol allocate(GBusAcquiredCallback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GBusAcquiredCallback.class, fi, constants$604.GBusAcquiredCallback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GBusAcquiredCallback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GBusAcquiredCallback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _connection, MemoryAddress _name, MemoryAddress _user_data) -> {
            try {
                constants$604.GBusAcquiredCallback$MH.invokeExact(symbol, (Addressable)_connection, (Addressable)_name, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


