// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GClearHandleFunc {

    void apply(int handle_id);
    static NativeSymbol allocate(GClearHandleFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GClearHandleFunc.class, fi, constants$167.GClearHandleFunc$FUNC, "(I)V", scope);
    }
    static GClearHandleFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GClearHandleFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int _handle_id) -> {
            try {
                constants$167.GClearHandleFunc$MH.invokeExact(symbol, _handle_id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


