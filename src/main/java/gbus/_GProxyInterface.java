// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GProxyInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("connect"),
        Constants$root.C_POINTER$LAYOUT.withName("connect_async"),
        Constants$root.C_POINTER$LAYOUT.withName("connect_finish"),
        Constants$root.C_POINTER$LAYOUT.withName("supports_hostname")
    ).withName("_GProxyInterface");
    public static MemoryLayout $LAYOUT() {
        return _GProxyInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor connect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect$MH = RuntimeHelper.downcallHandle(
        _GProxyInterface.connect$FUNC, false
    );
    public interface connect {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static NativeSymbol allocate(connect fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(connect.class, fi, _GProxyInterface.connect$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static connect ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("connect::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GProxyInterface.connect$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3, (jdk.incubator.foreign.Addressable)x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle connect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("connect"));
    public static VarHandle connect$VH() {
        return _GProxyInterface.connect$VH;
    }
    public static MemoryAddress connect$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GProxyInterface.connect$VH.get(seg);
    }
    public static void connect$set( MemorySegment seg, MemoryAddress x) {
        _GProxyInterface.connect$VH.set(seg, x);
    }
    public static MemoryAddress connect$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GProxyInterface.connect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void connect$set(MemorySegment seg, long index, MemoryAddress x) {
        _GProxyInterface.connect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect connect (MemorySegment segment, ResourceScope scope) {
        return connect.ofAddress(connect$get(segment), scope);
    }
    static final FunctionDescriptor connect_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect_async$MH = RuntimeHelper.downcallHandle(
        _GProxyInterface.connect_async$FUNC, false
    );
    public interface connect_async {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
        static NativeSymbol allocate(connect_async fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(connect_async.class, fi, _GProxyInterface.connect_async$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static connect_async ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("connect_async::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
                try {
                    _GProxyInterface.connect_async$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3, (jdk.incubator.foreign.Addressable)x4, (jdk.incubator.foreign.Addressable)x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle connect_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("connect_async"));
    public static VarHandle connect_async$VH() {
        return _GProxyInterface.connect_async$VH;
    }
    public static MemoryAddress connect_async$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GProxyInterface.connect_async$VH.get(seg);
    }
    public static void connect_async$set( MemorySegment seg, MemoryAddress x) {
        _GProxyInterface.connect_async$VH.set(seg, x);
    }
    public static MemoryAddress connect_async$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GProxyInterface.connect_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void connect_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GProxyInterface.connect_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect_async connect_async (MemorySegment segment, ResourceScope scope) {
        return connect_async.ofAddress(connect_async$get(segment), scope);
    }
    static final FunctionDescriptor connect_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect_finish$MH = RuntimeHelper.downcallHandle(
        _GProxyInterface.connect_finish$FUNC, false
    );
    public interface connect_finish {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static NativeSymbol allocate(connect_finish fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(connect_finish.class, fi, _GProxyInterface.connect_finish$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static connect_finish ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("connect_finish::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GProxyInterface.connect_finish$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle connect_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("connect_finish"));
    public static VarHandle connect_finish$VH() {
        return _GProxyInterface.connect_finish$VH;
    }
    public static MemoryAddress connect_finish$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GProxyInterface.connect_finish$VH.get(seg);
    }
    public static void connect_finish$set( MemorySegment seg, MemoryAddress x) {
        _GProxyInterface.connect_finish$VH.set(seg, x);
    }
    public static MemoryAddress connect_finish$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GProxyInterface.connect_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void connect_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GProxyInterface.connect_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect_finish connect_finish (MemorySegment segment, ResourceScope scope) {
        return connect_finish.ofAddress(connect_finish$get(segment), scope);
    }
    static final FunctionDescriptor supports_hostname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle supports_hostname$MH = RuntimeHelper.downcallHandle(
        _GProxyInterface.supports_hostname$FUNC, false
    );
    public interface supports_hostname {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static NativeSymbol allocate(supports_hostname fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(supports_hostname.class, fi, _GProxyInterface.supports_hostname$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static supports_hostname ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("supports_hostname::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)_GProxyInterface.supports_hostname$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle supports_hostname$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("supports_hostname"));
    public static VarHandle supports_hostname$VH() {
        return _GProxyInterface.supports_hostname$VH;
    }
    public static MemoryAddress supports_hostname$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GProxyInterface.supports_hostname$VH.get(seg);
    }
    public static void supports_hostname$set( MemorySegment seg, MemoryAddress x) {
        _GProxyInterface.supports_hostname$VH.set(seg, x);
    }
    public static MemoryAddress supports_hostname$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GProxyInterface.supports_hostname$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void supports_hostname$set(MemorySegment seg, long index, MemoryAddress x) {
        _GProxyInterface.supports_hostname$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static supports_hostname supports_hostname (MemorySegment segment, ResourceScope scope) {
        return supports_hostname.ofAddress(supports_hostname$get(segment), scope);
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


