// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GOptionArgFunc {

    int apply(MemoryAddress option_name, MemoryAddress value, MemoryAddress data, MemoryAddress error);
    static NativeSymbol allocate(GOptionArgFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GOptionArgFunc.class, fi, constants$238.GOptionArgFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GOptionArgFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GOptionArgFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _option_name, MemoryAddress _value, MemoryAddress _data, MemoryAddress _error) -> {
            try {
                return (int)constants$238.GOptionArgFunc$MH.invokeExact(symbol, (Addressable)_option_name, (Addressable)_value, (Addressable)_data, (Addressable)_error);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

