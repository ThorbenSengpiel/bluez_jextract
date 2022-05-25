// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GDatagramBasedSourceFunc {

    int apply(MemoryAddress datagram_based, int condition, MemoryAddress user_data);
    static NativeSymbol allocate(GDatagramBasedSourceFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GDatagramBasedSourceFunc.class, fi, constants$495.GDatagramBasedSourceFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GDatagramBasedSourceFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GDatagramBasedSourceFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _datagram_based, int _condition, MemoryAddress _user_data) -> {
            try {
                return (int)constants$495.GDatagramBasedSourceFunc$MH.invokeExact(symbol, (Addressable)_datagram_based, _condition, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


