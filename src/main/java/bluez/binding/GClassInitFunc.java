// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GClassInitFunc {

    void apply(MemoryAddress g_class, MemoryAddress class_data);
    static NativeSymbol allocate(GClassInitFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GClassInitFunc.class, fi, constants$406.GClassInitFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GClassInitFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GClassInitFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _g_class, MemoryAddress _class_data) -> {
            try {
                constants$406.GClassInitFunc$MH.invokeExact(symbol, (Addressable)_g_class, (Addressable)_class_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


