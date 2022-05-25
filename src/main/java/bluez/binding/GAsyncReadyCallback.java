// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GAsyncReadyCallback {

    void apply(MemoryAddress source_object, MemoryAddress res, MemoryAddress user_data);
    static NativeSymbol allocate(GAsyncReadyCallback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GAsyncReadyCallback.class, fi, constants$492.GAsyncReadyCallback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GAsyncReadyCallback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GAsyncReadyCallback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _source_object, MemoryAddress _res, MemoryAddress _user_data) -> {
            try {
                constants$493.GAsyncReadyCallback$MH.invokeExact(symbol, (Addressable)_source_object, (Addressable)_res, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


