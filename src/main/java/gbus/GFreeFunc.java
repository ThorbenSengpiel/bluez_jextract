// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GFreeFunc {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static NativeSymbol allocate(GFreeFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GFreeFunc.class, fi, constants$8.GFreeFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GFreeFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GFreeFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$8.GFreeFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

