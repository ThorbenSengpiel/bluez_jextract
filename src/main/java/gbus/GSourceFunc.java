// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GSourceFunc {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static NativeSymbol allocate(GSourceFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GSourceFunc.class, fi, constants$156.GSourceFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GSourceFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GSourceFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$156.GSourceFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


