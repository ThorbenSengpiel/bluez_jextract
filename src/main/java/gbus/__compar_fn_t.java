// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface __compar_fn_t {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static NativeSymbol allocate(__compar_fn_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(__compar_fn_t.class, fi, constants$47.__compar_fn_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static __compar_fn_t ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("__compar_fn_t::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$47.__compar_fn_t$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

