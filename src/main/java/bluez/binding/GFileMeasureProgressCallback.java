// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GFileMeasureProgressCallback {

    void apply(int reporting, long current_size, long num_dirs, long num_files, MemoryAddress user_data);
    static NativeSymbol allocate(GFileMeasureProgressCallback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GFileMeasureProgressCallback.class, fi, constants$493.GFileMeasureProgressCallback$FUNC, "(IJJJLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GFileMeasureProgressCallback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GFileMeasureProgressCallback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int _reporting, long _current_size, long _num_dirs, long _num_files, MemoryAddress _user_data) -> {
            try {
                constants$494.GFileMeasureProgressCallback$MH.invokeExact(symbol, _reporting, _current_size, _num_dirs, _num_files, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


