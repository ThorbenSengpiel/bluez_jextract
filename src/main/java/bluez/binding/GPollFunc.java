// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GPollFunc {

    int apply(MemoryAddress ufds, int nfsd, int timeout_);
    static NativeSymbol allocate(GPollFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GPollFunc.class, fi, constants$147.GPollFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)I", scope);
    }
    static GPollFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GPollFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _ufds, int _nfsd, int _timeout_) -> {
            try {
                return (int)constants$148.GPollFunc$MH.invokeExact(symbol, (Addressable)_ufds, _nfsd, _timeout_);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


