// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GSocketAddressClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_family"),
        Constants$root.C_POINTER$LAYOUT.withName("get_native_size"),
        Constants$root.C_POINTER$LAYOUT.withName("to_native")
    ).withName("_GSocketAddressClass");
    public static MemoryLayout $LAYOUT() {
        return _GSocketAddressClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_family$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_family$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressClass.get_family$FUNC, false
    );
    public interface get_family {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static NativeSymbol allocate(get_family fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_family.class, fi, _GSocketAddressClass.get_family$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static get_family ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_family::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)_GSocketAddressClass.get_family$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_family$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_family"));
    public static VarHandle get_family$VH() {
        return _GSocketAddressClass.get_family$VH;
    }
    public static MemoryAddress get_family$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressClass.get_family$VH.get(seg);
    }
    public static void get_family$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressClass.get_family$VH.set(seg, x);
    }
    public static MemoryAddress get_family$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressClass.get_family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_family$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressClass.get_family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_family get_family (MemorySegment segment, ResourceScope scope) {
        return get_family.ofAddress(get_family$get(segment), scope);
    }
    static final FunctionDescriptor get_native_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_native_size$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressClass.get_native_size$FUNC, false
    );
    public interface get_native_size {

        long apply(jdk.incubator.foreign.MemoryAddress x0);
        static NativeSymbol allocate(get_native_size fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_native_size.class, fi, _GSocketAddressClass.get_native_size$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)J", scope);
        }
        static get_native_size ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_native_size::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (long)_GSocketAddressClass.get_native_size$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_native_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_native_size"));
    public static VarHandle get_native_size$VH() {
        return _GSocketAddressClass.get_native_size$VH;
    }
    public static MemoryAddress get_native_size$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressClass.get_native_size$VH.get(seg);
    }
    public static void get_native_size$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressClass.get_native_size$VH.set(seg, x);
    }
    public static MemoryAddress get_native_size$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressClass.get_native_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_native_size$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressClass.get_native_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_native_size get_native_size (MemorySegment segment, ResourceScope scope) {
        return get_native_size.ofAddress(get_native_size$get(segment), scope);
    }
    static final FunctionDescriptor to_native$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle to_native$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressClass.to_native$FUNC, false
    );
    public interface to_native {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2, jdk.incubator.foreign.MemoryAddress x3);
        static NativeSymbol allocate(to_native fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(to_native.class, fi, _GSocketAddressClass.to_native$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static to_native ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("to_native::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)_GSocketAddressClass.to_native$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, x2, (jdk.incubator.foreign.Addressable)x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle to_native$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("to_native"));
    public static VarHandle to_native$VH() {
        return _GSocketAddressClass.to_native$VH;
    }
    public static MemoryAddress to_native$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressClass.to_native$VH.get(seg);
    }
    public static void to_native$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressClass.to_native$VH.set(seg, x);
    }
    public static MemoryAddress to_native$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressClass.to_native$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void to_native$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressClass.to_native$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static to_native to_native (MemorySegment segment, ResourceScope scope) {
        return to_native.ofAddress(to_native$get(segment), scope);
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


