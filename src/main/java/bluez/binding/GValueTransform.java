// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GValueTransform {

    void apply(MemoryAddress src_value, MemoryAddress dest_value);
    static NativeSymbol allocate(GValueTransform fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GValueTransform.class, fi, constants$415.GValueTransform$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GValueTransform ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GValueTransform::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _src_value, MemoryAddress _dest_value) -> {
            try {
                constants$415.GValueTransform$MH.invokeExact(symbol, (Addressable)_src_value, (Addressable)_dest_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


