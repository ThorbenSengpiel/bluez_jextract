// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GSpawnChildSetupFunc {

    void apply(MemoryAddress user_data);
    static NativeSymbol allocate(GSpawnChildSetupFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GSpawnChildSetupFunc.class, fi, constants$280.GSpawnChildSetupFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GSpawnChildSetupFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GSpawnChildSetupFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _user_data) -> {
            try {
                constants$280.GSpawnChildSetupFunc$MH.invokeExact(symbol, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

