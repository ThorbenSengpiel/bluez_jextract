// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GDataForeachFunc {

    void apply(int key_id, MemoryAddress data, MemoryAddress user_data);
    static NativeSymbol allocate(GDataForeachFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GDataForeachFunc.class, fi, constants$86.GDataForeachFunc$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GDataForeachFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GDataForeachFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int _key_id, MemoryAddress _data, MemoryAddress _user_data) -> {
            try {
                constants$86.GDataForeachFunc$MH.invokeExact(symbol, _key_id, (Addressable)_data, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


