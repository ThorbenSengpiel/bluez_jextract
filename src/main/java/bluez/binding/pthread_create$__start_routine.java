// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface pthread_create$__start_routine {

    Addressable apply(MemoryAddress _x0);
    static NativeSymbol allocate(pthread_create$__start_routine fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(pthread_create$__start_routine.class, fi, constants$334.pthread_create$__start_routine$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static pthread_create$__start_routine ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("pthread_create$__start_routine::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
            try {
                return (Addressable)(MemoryAddress)constants$334.pthread_create$__start_routine$MH.invokeExact(symbol, (Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


