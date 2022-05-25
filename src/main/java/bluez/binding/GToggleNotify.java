// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GToggleNotify {

    void apply(MemoryAddress data, MemoryAddress object, int is_last_ref);
    static NativeSymbol allocate(GToggleNotify fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GToggleNotify.class, fi, constants$457.GToggleNotify$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static GToggleNotify ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GToggleNotify::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _data, MemoryAddress _object, int _is_last_ref) -> {
            try {
                constants$457.GToggleNotify$MH.invokeExact(symbol, (Addressable)_data, (Addressable)_object, _is_last_ref);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

