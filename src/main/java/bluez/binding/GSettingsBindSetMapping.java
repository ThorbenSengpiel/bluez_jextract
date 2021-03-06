// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GSettingsBindSetMapping {

    Addressable apply(MemoryAddress value, MemoryAddress expected_type, MemoryAddress user_data);
    static NativeSymbol allocate(GSettingsBindSetMapping fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GSettingsBindSetMapping.class, fi, constants$771.GSettingsBindSetMapping$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GSettingsBindSetMapping ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GSettingsBindSetMapping::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _value, MemoryAddress _expected_type, MemoryAddress _user_data) -> {
            try {
                return (Addressable)(MemoryAddress)constants$772.GSettingsBindSetMapping$MH.invokeExact(symbol, (Addressable)_value, (Addressable)_expected_type, (Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


