// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GScannerMsgFunc {

    void apply(MemoryAddress scanner, MemoryAddress message, int error);
    static NativeSymbol allocate(GScannerMsgFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GScannerMsgFunc.class, fi, constants$267.GScannerMsgFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static GScannerMsgFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GScannerMsgFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _scanner, MemoryAddress _message, int _error) -> {
            try {
                constants$267.GScannerMsgFunc$MH.invokeExact(symbol, (Addressable)_scanner, (Addressable)_message, _error);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


