// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GSignalEmissionHook {

    int apply(MemoryAddress ihint, int n_param_values, MemoryAddress param_values, MemoryAddress data);
    static NativeSymbol allocate(GSignalEmissionHook fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GSignalEmissionHook.class, fi, constants$435.GSignalEmissionHook$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GSignalEmissionHook ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GSignalEmissionHook::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _ihint, int _n_param_values, MemoryAddress _param_values, MemoryAddress _data) -> {
            try {
                return (int)constants$435.GSignalEmissionHook$MH.invokeExact(symbol, (Addressable)_ihint, _n_param_values, (Addressable)_param_values, (Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


