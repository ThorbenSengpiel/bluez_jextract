// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface scandir$__selector {

    int apply(MemoryAddress _x0);
    static NativeSymbol allocate(scandir$__selector fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(scandir$__selector.class, fi, constants$110.scandir$__selector$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static scandir$__selector ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("scandir$__selector::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
            try {
                return (int)constants$110.scandir$__selector$MH.invokeExact(symbol, (Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


