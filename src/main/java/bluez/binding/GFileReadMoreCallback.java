// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GFileReadMoreCallback {

    int apply(MemoryAddress file_contents, long file_size, MemoryAddress callback_data);
    static NativeSymbol allocate(GFileReadMoreCallback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GFileReadMoreCallback.class, fi, constants$493.GFileReadMoreCallback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GFileReadMoreCallback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GFileReadMoreCallback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _file_contents, long _file_size, MemoryAddress _callback_data) -> {
            try {
                return (int)constants$493.GFileReadMoreCallback$MH.invokeExact(symbol, (Addressable)_file_contents, _file_size, (Addressable)_callback_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

