// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTestFunc {

    void apply();
    static NativeSymbol allocate(GTestFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTestFunc.class, fi, constants$307.GTestFunc$FUNC, "()V", scope);
    }
    static GTestFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTestFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
            try {
                constants$307.GTestFunc$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

