// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTestLogFatalFunc {

    int apply(MemoryAddress log_domain, int log_level, MemoryAddress message, MemoryAddress user_data);
    static NativeSymbol allocate(GTestLogFatalFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTestLogFatalFunc.class, fi, constants$310.GTestLogFatalFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GTestLogFatalFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTestLogFatalFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _log_domain, int _log_level, MemoryAddress _message, MemoryAddress _user_data) -> {
            try {
                return (int)constants$310.GTestLogFatalFunc$MH.invokeExact(symbol, (Addressable)_log_domain, _log_level, (Addressable)_message, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


