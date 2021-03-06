// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GObjectGetPropertyFunc {

    void apply(MemoryAddress object, int property_id, MemoryAddress value, MemoryAddress pspec);
    static NativeSymbol allocate(GObjectGetPropertyFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GObjectGetPropertyFunc.class, fi, constants$450.GObjectGetPropertyFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GObjectGetPropertyFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GObjectGetPropertyFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _object, int _property_id, MemoryAddress _value, MemoryAddress _pspec) -> {
            try {
                constants$450.GObjectGetPropertyFunc$MH.invokeExact(symbol, (Addressable)_object, _property_id, (Addressable)_value, (Addressable)_pspec);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


