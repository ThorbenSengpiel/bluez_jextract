// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTypePluginCompleteInterfaceInfo {

    void apply(MemoryAddress plugin, long instance_type, long interface_type, MemoryAddress info);
    static NativeSymbol allocate(GTypePluginCompleteInterfaceInfo fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTypePluginCompleteInterfaceInfo.class, fi, constants$477.GTypePluginCompleteInterfaceInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GTypePluginCompleteInterfaceInfo ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTypePluginCompleteInterfaceInfo::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress _plugin, long _instance_type, long _interface_type, MemoryAddress _info) -> {
            try {
                constants$477.GTypePluginCompleteInterfaceInfo$MH.invokeExact(symbol, (Addressable)_plugin, _instance_type, _interface_type, (Addressable)_info);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


