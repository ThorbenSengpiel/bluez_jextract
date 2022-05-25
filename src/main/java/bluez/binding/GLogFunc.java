// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GLogFunc {

    void apply(MemoryAddress log_domain, int log_level, MemoryAddress message, MemoryAddress user_data);
    static NativeSymbol allocate(GLogFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GLogFunc.class, fi, constants$232.GLogFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GLogFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GLogFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _log_domain, int _log_level, MemoryAddress _message, MemoryAddress _user_data) -> {
            try {
                constants$232.GLogFunc$MH.invokeExact(symbol, (Addressable)_log_domain, _log_level, (Addressable)_message, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


