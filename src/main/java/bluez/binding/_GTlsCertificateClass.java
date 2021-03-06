// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GTlsCertificateClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
            ).withName("g_type_class"),
            Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
            Constants$root.C_POINTER$LAYOUT.withName("constructor"),
            Constants$root.C_POINTER$LAYOUT.withName("set_property"),
            Constants$root.C_POINTER$LAYOUT.withName("get_property"),
            Constants$root.C_POINTER$LAYOUT.withName("dispose"),
            Constants$root.C_POINTER$LAYOUT.withName("finalize"),
            Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("notify"),
            Constants$root.C_POINTER$LAYOUT.withName("constructed"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("verify"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GTlsCertificateClass");
    public static MemoryLayout $LAYOUT() {
        return _GTlsCertificateClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle verify$MH = RuntimeHelper.downcallHandle(
        _GTlsCertificateClass.verify$FUNC, false
    );
    public interface verify {

        int apply(MemoryAddress _x0, MemoryAddress _x1, MemoryAddress _x2);
        static NativeSymbol allocate(verify fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(verify.class, fi, _GTlsCertificateClass.verify$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static verify ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("verify::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, MemoryAddress __x2) -> {
                try {
                    return (int)_GTlsCertificateClass.verify$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, (Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle verify$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("verify"));
    public static VarHandle verify$VH() {
        return _GTlsCertificateClass.verify$VH;
    }
    public static MemoryAddress verify$get(MemorySegment seg) {
        return (MemoryAddress)_GTlsCertificateClass.verify$VH.get(seg);
    }
    public static void verify$set( MemorySegment seg, MemoryAddress x) {
        _GTlsCertificateClass.verify$VH.set(seg, x);
    }
    public static MemoryAddress verify$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTlsCertificateClass.verify$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void verify$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsCertificateClass.verify$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static verify verify (MemorySegment segment, ResourceScope scope) {
        return verify.ofAddress(verify$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(144, 64);
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


