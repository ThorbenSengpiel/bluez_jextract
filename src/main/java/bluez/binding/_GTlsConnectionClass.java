// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GTlsConnectionClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            Constants$root.C_POINTER$LAYOUT.withName("get_input_stream"),
            Constants$root.C_POINTER$LAYOUT.withName("get_output_stream"),
            Constants$root.C_POINTER$LAYOUT.withName("close_fn"),
            Constants$root.C_POINTER$LAYOUT.withName("close_async"),
            Constants$root.C_POINTER$LAYOUT.withName("close_finish"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved7"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved8"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved9"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved10")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("accept_certificate"),
        Constants$root.C_POINTER$LAYOUT.withName("handshake"),
        Constants$root.C_POINTER$LAYOUT.withName("handshake_async"),
        Constants$root.C_POINTER$LAYOUT.withName("handshake_finish"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GTlsConnectionClass");
    public static MemoryLayout $LAYOUT() {
        return _GTlsConnectionClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 256);
    }
    static final FunctionDescriptor accept_certificate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle accept_certificate$MH = RuntimeHelper.downcallHandle(
        _GTlsConnectionClass.accept_certificate$FUNC, false
    );
    public interface accept_certificate {

        int apply(MemoryAddress _x0, MemoryAddress _x1, int _x2);
        static NativeSymbol allocate(accept_certificate fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(accept_certificate.class, fi, _GTlsConnectionClass.accept_certificate$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static accept_certificate ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("accept_certificate::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, int __x2) -> {
                try {
                    return (int)_GTlsConnectionClass.accept_certificate$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle accept_certificate$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("accept_certificate"));
    public static VarHandle accept_certificate$VH() {
        return _GTlsConnectionClass.accept_certificate$VH;
    }
    public static MemoryAddress accept_certificate$get(MemorySegment seg) {
        return (MemoryAddress)_GTlsConnectionClass.accept_certificate$VH.get(seg);
    }
    public static void accept_certificate$set( MemorySegment seg, MemoryAddress x) {
        _GTlsConnectionClass.accept_certificate$VH.set(seg, x);
    }
    public static MemoryAddress accept_certificate$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTlsConnectionClass.accept_certificate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void accept_certificate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsConnectionClass.accept_certificate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static accept_certificate accept_certificate (MemorySegment segment, ResourceScope scope) {
        return accept_certificate.ofAddress(accept_certificate$get(segment), scope);
    }
    static final FunctionDescriptor handshake$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle handshake$MH = RuntimeHelper.downcallHandle(
        _GTlsConnectionClass.handshake$FUNC, false
    );
    public interface handshake {

        int apply(MemoryAddress _x0, MemoryAddress _x1, MemoryAddress _x2);
        static NativeSymbol allocate(handshake fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(handshake.class, fi, _GTlsConnectionClass.handshake$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static handshake ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("handshake::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, MemoryAddress __x2) -> {
                try {
                    return (int)_GTlsConnectionClass.handshake$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, (Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle handshake$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("handshake"));
    public static VarHandle handshake$VH() {
        return _GTlsConnectionClass.handshake$VH;
    }
    public static MemoryAddress handshake$get(MemorySegment seg) {
        return (MemoryAddress)_GTlsConnectionClass.handshake$VH.get(seg);
    }
    public static void handshake$set( MemorySegment seg, MemoryAddress x) {
        _GTlsConnectionClass.handshake$VH.set(seg, x);
    }
    public static MemoryAddress handshake$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTlsConnectionClass.handshake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void handshake$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsConnectionClass.handshake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static handshake handshake (MemorySegment segment, ResourceScope scope) {
        return handshake.ofAddress(handshake$get(segment), scope);
    }
    static final FunctionDescriptor handshake_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle handshake_async$MH = RuntimeHelper.downcallHandle(
        _GTlsConnectionClass.handshake_async$FUNC, false
    );
    public interface handshake_async {

        void apply(MemoryAddress _x0, int _x1, MemoryAddress _x2, MemoryAddress _x3, MemoryAddress _x4);
        static NativeSymbol allocate(handshake_async fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(handshake_async.class, fi, _GTlsConnectionClass.handshake_async$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static handshake_async ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("handshake_async::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, int __x1, MemoryAddress __x2, MemoryAddress __x3, MemoryAddress __x4) -> {
                try {
                    _GTlsConnectionClass.handshake_async$MH.invokeExact(symbol, (Addressable)__x0, __x1, (Addressable)__x2, (Addressable)__x3, (Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle handshake_async$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("handshake_async"));
    public static VarHandle handshake_async$VH() {
        return _GTlsConnectionClass.handshake_async$VH;
    }
    public static MemoryAddress handshake_async$get(MemorySegment seg) {
        return (MemoryAddress)_GTlsConnectionClass.handshake_async$VH.get(seg);
    }
    public static void handshake_async$set( MemorySegment seg, MemoryAddress x) {
        _GTlsConnectionClass.handshake_async$VH.set(seg, x);
    }
    public static MemoryAddress handshake_async$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTlsConnectionClass.handshake_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void handshake_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsConnectionClass.handshake_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static handshake_async handshake_async (MemorySegment segment, ResourceScope scope) {
        return handshake_async.ofAddress(handshake_async$get(segment), scope);
    }
    static final FunctionDescriptor handshake_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle handshake_finish$MH = RuntimeHelper.downcallHandle(
        _GTlsConnectionClass.handshake_finish$FUNC, false
    );
    public interface handshake_finish {

        int apply(MemoryAddress _x0, MemoryAddress _x1, MemoryAddress _x2);
        static NativeSymbol allocate(handshake_finish fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(handshake_finish.class, fi, _GTlsConnectionClass.handshake_finish$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static handshake_finish ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("handshake_finish::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, MemoryAddress __x2) -> {
                try {
                    return (int)_GTlsConnectionClass.handshake_finish$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, (Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle handshake_finish$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("handshake_finish"));
    public static VarHandle handshake_finish$VH() {
        return _GTlsConnectionClass.handshake_finish$VH;
    }
    public static MemoryAddress handshake_finish$get(MemorySegment seg) {
        return (MemoryAddress)_GTlsConnectionClass.handshake_finish$VH.get(seg);
    }
    public static void handshake_finish$set( MemorySegment seg, MemoryAddress x) {
        _GTlsConnectionClass.handshake_finish$VH.set(seg, x);
    }
    public static MemoryAddress handshake_finish$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GTlsConnectionClass.handshake_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void handshake_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsConnectionClass.handshake_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static handshake_finish handshake_finish (MemorySegment segment, ResourceScope scope) {
        return handshake_finish.ofAddress(handshake_finish$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(288, 64);
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


