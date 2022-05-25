// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GDBusSubtreeEnumerateFunc {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static NativeSymbol allocate(GDBusSubtreeEnumerateFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GDBusSubtreeEnumerateFunc.class, fi, constants$599.GDBusSubtreeEnumerateFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GDBusSubtreeEnumerateFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GDBusSubtreeEnumerateFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$599.GDBusSubtreeEnumerateFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


