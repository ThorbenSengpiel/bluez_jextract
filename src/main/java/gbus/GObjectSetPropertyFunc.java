// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GObjectSetPropertyFunc {

    void apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static NativeSymbol allocate(GObjectSetPropertyFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GObjectSetPropertyFunc.class, fi, constants$469.GObjectSetPropertyFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GObjectSetPropertyFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GObjectSetPropertyFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$469.GObjectSetPropertyFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


