// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GattService1Iface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_characteristics"),
        Constants$root.C_POINTER$LAYOUT.withName("get_device"),
        Constants$root.C_POINTER$LAYOUT.withName("get_primary"),
        Constants$root.C_POINTER$LAYOUT.withName("get_uuid")
    ).withName("_GattService1Iface");
    public static MemoryLayout $LAYOUT() {
        return _GattService1Iface.$struct$LAYOUT;
    }
    public static MemorySegment parent_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_characteristics$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_characteristics$MH = RuntimeHelper.downcallHandle(
        _GattService1Iface.get_characteristics$FUNC, false
    );
    public interface get_characteristics {

        Addressable apply(MemoryAddress _x0);
        static NativeSymbol allocate(get_characteristics fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_characteristics.class, fi, _GattService1Iface.get_characteristics$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_characteristics ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_characteristics::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (Addressable)(MemoryAddress)_GattService1Iface.get_characteristics$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_characteristics$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("get_characteristics"));
    public static VarHandle get_characteristics$VH() {
        return _GattService1Iface.get_characteristics$VH;
    }
    public static MemoryAddress get_characteristics$get(MemorySegment seg) {
        return (MemoryAddress)_GattService1Iface.get_characteristics$VH.get(seg);
    }
    public static void get_characteristics$set( MemorySegment seg, MemoryAddress x) {
        _GattService1Iface.get_characteristics$VH.set(seg, x);
    }
    public static MemoryAddress get_characteristics$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GattService1Iface.get_characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_characteristics$set(MemorySegment seg, long index, MemoryAddress x) {
        _GattService1Iface.get_characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_characteristics get_characteristics (MemorySegment segment, ResourceScope scope) {
        return get_characteristics.ofAddress(get_characteristics$get(segment), scope);
    }
    static final FunctionDescriptor get_device$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_device$MH = RuntimeHelper.downcallHandle(
        _GattService1Iface.get_device$FUNC, false
    );
    public interface get_device {

        Addressable apply(MemoryAddress _x0);
        static NativeSymbol allocate(get_device fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_device.class, fi, _GattService1Iface.get_device$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_device ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_device::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (Addressable)(MemoryAddress)_GattService1Iface.get_device$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_device$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("get_device"));
    public static VarHandle get_device$VH() {
        return _GattService1Iface.get_device$VH;
    }
    public static MemoryAddress get_device$get(MemorySegment seg) {
        return (MemoryAddress)_GattService1Iface.get_device$VH.get(seg);
    }
    public static void get_device$set( MemorySegment seg, MemoryAddress x) {
        _GattService1Iface.get_device$VH.set(seg, x);
    }
    public static MemoryAddress get_device$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GattService1Iface.get_device$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_device$set(MemorySegment seg, long index, MemoryAddress x) {
        _GattService1Iface.get_device$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_device get_device (MemorySegment segment, ResourceScope scope) {
        return get_device.ofAddress(get_device$get(segment), scope);
    }
    static final FunctionDescriptor get_primary$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_primary$MH = RuntimeHelper.downcallHandle(
        _GattService1Iface.get_primary$FUNC, false
    );
    public interface get_primary {

        int apply(MemoryAddress _x0);
        static NativeSymbol allocate(get_primary fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_primary.class, fi, _GattService1Iface.get_primary$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static get_primary ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_primary::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (int)_GattService1Iface.get_primary$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_primary$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("get_primary"));
    public static VarHandle get_primary$VH() {
        return _GattService1Iface.get_primary$VH;
    }
    public static MemoryAddress get_primary$get(MemorySegment seg) {
        return (MemoryAddress)_GattService1Iface.get_primary$VH.get(seg);
    }
    public static void get_primary$set( MemorySegment seg, MemoryAddress x) {
        _GattService1Iface.get_primary$VH.set(seg, x);
    }
    public static MemoryAddress get_primary$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GattService1Iface.get_primary$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_primary$set(MemorySegment seg, long index, MemoryAddress x) {
        _GattService1Iface.get_primary$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_primary get_primary (MemorySegment segment, ResourceScope scope) {
        return get_primary.ofAddress(get_primary$get(segment), scope);
    }
    static final FunctionDescriptor get_uuid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_uuid$MH = RuntimeHelper.downcallHandle(
        _GattService1Iface.get_uuid$FUNC, false
    );
    public interface get_uuid {

        Addressable apply(MemoryAddress _x0);
        static NativeSymbol allocate(get_uuid fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_uuid.class, fi, _GattService1Iface.get_uuid$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_uuid ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_uuid::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (Addressable)(MemoryAddress)_GattService1Iface.get_uuid$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_uuid$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("get_uuid"));
    public static VarHandle get_uuid$VH() {
        return _GattService1Iface.get_uuid$VH;
    }
    public static MemoryAddress get_uuid$get(MemorySegment seg) {
        return (MemoryAddress)_GattService1Iface.get_uuid$VH.get(seg);
    }
    public static void get_uuid$set( MemorySegment seg, MemoryAddress x) {
        _GattService1Iface.get_uuid$VH.set(seg, x);
    }
    public static MemoryAddress get_uuid$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GattService1Iface.get_uuid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_uuid$set(MemorySegment seg, long index, MemoryAddress x) {
        _GattService1Iface.get_uuid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_uuid get_uuid (MemorySegment segment, ResourceScope scope) {
        return get_uuid.ofAddress(get_uuid$get(segment), scope);
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


