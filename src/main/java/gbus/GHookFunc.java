// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GHookFunc {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static NativeSymbol allocate(GHookFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GHookFunc.class, fi, constants$145.GHookFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GHookFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GHookFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$145.GHookFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


