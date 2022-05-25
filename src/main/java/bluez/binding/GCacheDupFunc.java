// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GCacheDupFunc {

    Addressable apply(MemoryAddress value);
    static NativeSymbol allocate(GCacheDupFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GCacheDupFunc.class, fi, constants$325.GCacheDupFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GCacheDupFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GCacheDupFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _value) -> {
            try {
                return (Addressable)(MemoryAddress)constants$325.GCacheDupFunc$MH.invokeExact(symbol, (Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

