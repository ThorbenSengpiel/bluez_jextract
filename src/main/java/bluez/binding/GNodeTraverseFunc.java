// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GNodeTraverseFunc {

    int apply(MemoryAddress node, MemoryAddress data);
    static NativeSymbol allocate(GNodeTraverseFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GNodeTraverseFunc.class, fi, constants$121.GNodeTraverseFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GNodeTraverseFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GNodeTraverseFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _node, MemoryAddress _data) -> {
            try {
                return (int)constants$121.GNodeTraverseFunc$MH.invokeExact(symbol, (Addressable)_node, (Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


