// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GCacheDestroyFunc {

    void apply(MemoryAddress value);
    static NativeSymbol allocate(GCacheDestroyFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GCacheDestroyFunc.class, fi, constants$326.GCacheDestroyFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GCacheDestroyFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GCacheDestroyFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _value) -> {
            try {
                constants$326.GCacheDestroyFunc$MH.invokeExact(symbol, (Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


