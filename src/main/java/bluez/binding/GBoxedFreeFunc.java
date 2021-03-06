// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GBoxedFreeFunc {

    void apply(MemoryAddress boxed);
    static NativeSymbol allocate(GBoxedFreeFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GBoxedFreeFunc.class, fi, constants$448.GBoxedFreeFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GBoxedFreeFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GBoxedFreeFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _boxed) -> {
            try {
                constants$448.GBoxedFreeFunc$MH.invokeExact(symbol, (Addressable)_boxed);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


