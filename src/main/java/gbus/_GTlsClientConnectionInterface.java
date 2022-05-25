// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GTlsClientConnectionInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("copy_session_state")
    ).withName("_GTlsClientConnectionInterface");
    public static MemoryLayout $LAYOUT() {
        return _GTlsClientConnectionInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor copy_session_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle copy_session_state$MH = RuntimeHelper.downcallHandle(
        _GTlsClientConnectionInterface.copy_session_state$FUNC, false
    );
    public interface copy_session_state {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static NativeSymbol allocate(copy_session_state fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(copy_session_state.class, fi, _GTlsClientConnectionInterface.copy_session_state$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static copy_session_state ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("copy_session_state::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    _GTlsClientConnectionInterface.copy_session_state$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle copy_session_state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("copy_session_state"));
    public static VarHandle copy_session_state$VH() {
        return _GTlsClientConnectionInterface.copy_session_state$VH;
    }
    public static MemoryAddress copy_session_state$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GTlsClientConnectionInterface.copy_session_state$VH.get(seg);
    }
    public static void copy_session_state$set( MemorySegment seg, MemoryAddress x) {
        _GTlsClientConnectionInterface.copy_session_state$VH.set(seg, x);
    }
    public static MemoryAddress copy_session_state$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GTlsClientConnectionInterface.copy_session_state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void copy_session_state$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsClientConnectionInterface.copy_session_state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static copy_session_state copy_session_state (MemorySegment segment, ResourceScope scope) {
        return copy_session_state.ofAddress(copy_session_state$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


