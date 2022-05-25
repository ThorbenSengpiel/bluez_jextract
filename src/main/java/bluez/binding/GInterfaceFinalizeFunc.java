// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GInterfaceFinalizeFunc {

    void apply(MemoryAddress g_iface, MemoryAddress iface_data);
    static NativeSymbol allocate(GInterfaceFinalizeFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GInterfaceFinalizeFunc.class, fi, constants$407.GInterfaceFinalizeFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GInterfaceFinalizeFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GInterfaceFinalizeFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _g_iface, MemoryAddress _iface_data) -> {
            try {
                constants$407.GInterfaceFinalizeFunc$MH.invokeExact(symbol, (Addressable)_g_iface, (Addressable)_iface_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


