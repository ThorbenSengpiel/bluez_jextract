// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTypePluginUnuse {

    void apply(MemoryAddress plugin);
    static NativeSymbol allocate(GTypePluginUnuse fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTypePluginUnuse.class, fi, constants$476.GTypePluginUnuse$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GTypePluginUnuse ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTypePluginUnuse::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _plugin) -> {
            try {
                constants$476.GTypePluginUnuse$MH.invokeExact(symbol, (Addressable)_plugin);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


