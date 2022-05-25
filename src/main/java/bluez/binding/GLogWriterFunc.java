// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GLogWriterFunc {

    int apply(int log_level, MemoryAddress fields, long n_fields, MemoryAddress user_data);
    static NativeSymbol allocate(GLogWriterFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GLogWriterFunc.class, fi, constants$234.GLogWriterFunc$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GLogWriterFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GLogWriterFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int _log_level, MemoryAddress _fields, long _n_fields, MemoryAddress _user_data) -> {
            try {
                return (int)constants$234.GLogWriterFunc$MH.invokeExact(symbol, _log_level, (Addressable)_fields, _n_fields, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


