// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GHookCompareFunc {

    int apply(MemoryAddress new_hook, MemoryAddress sibling);
    static NativeSymbol allocate(GHookCompareFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GHookCompareFunc.class, fi, constants$140.GHookCompareFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GHookCompareFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GHookCompareFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _new_hook, MemoryAddress _sibling) -> {
            try {
                return (int)constants$141.GHookCompareFunc$MH.invokeExact(symbol, (Addressable)_new_hook, (Addressable)_sibling);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


