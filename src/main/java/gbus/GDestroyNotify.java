// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GDestroyNotify {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static NativeSymbol allocate(GDestroyNotify fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GDestroyNotify.class, fi, constants$7.GDestroyNotify$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GDestroyNotify ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GDestroyNotify::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$7.GDestroyNotify$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


