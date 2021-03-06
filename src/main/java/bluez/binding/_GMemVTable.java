// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GMemVTable {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("malloc"),
        Constants$root.C_POINTER$LAYOUT.withName("realloc"),
        Constants$root.C_POINTER$LAYOUT.withName("free"),
        Constants$root.C_POINTER$LAYOUT.withName("calloc"),
        Constants$root.C_POINTER$LAYOUT.withName("try_malloc"),
        Constants$root.C_POINTER$LAYOUT.withName("try_realloc")
    ).withName("_GMemVTable");
    public static MemoryLayout $LAYOUT() {
        return _GMemVTable.$struct$LAYOUT;
    }
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle malloc$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.malloc$FUNC, false
    );
    public interface malloc {

        Addressable apply(long _x0);
        static NativeSymbol allocate(malloc fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(malloc.class, fi, _GMemVTable.malloc$FUNC, "(J)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static malloc ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("malloc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (long __x0) -> {
                try {
                    return (Addressable)(MemoryAddress)_GMemVTable.malloc$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle malloc$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("malloc"));
    public static VarHandle malloc$VH() {
        return _GMemVTable.malloc$VH;
    }
    public static MemoryAddress malloc$get(MemorySegment seg) {
        return (MemoryAddress)_GMemVTable.malloc$VH.get(seg);
    }
    public static void malloc$set( MemorySegment seg, MemoryAddress x) {
        _GMemVTable.malloc$VH.set(seg, x);
    }
    public static MemoryAddress malloc$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GMemVTable.malloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void malloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMemVTable.malloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static malloc malloc (MemorySegment segment, ResourceScope scope) {
        return malloc.ofAddress(malloc$get(segment), scope);
    }
    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.realloc$FUNC, false
    );
    public interface realloc {

        Addressable apply(MemoryAddress _x0, long _x1);
        static NativeSymbol allocate(realloc fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(realloc.class, fi, _GMemVTable.realloc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static realloc ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("realloc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, long __x1) -> {
                try {
                    return (Addressable)(MemoryAddress)_GMemVTable.realloc$MH.invokeExact(symbol, (Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle realloc$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("realloc"));
    public static VarHandle realloc$VH() {
        return _GMemVTable.realloc$VH;
    }
    public static MemoryAddress realloc$get(MemorySegment seg) {
        return (MemoryAddress)_GMemVTable.realloc$VH.get(seg);
    }
    public static void realloc$set( MemorySegment seg, MemoryAddress x) {
        _GMemVTable.realloc$VH.set(seg, x);
    }
    public static MemoryAddress realloc$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GMemVTable.realloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void realloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMemVTable.realloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static realloc realloc (MemorySegment segment, ResourceScope scope) {
        return realloc.ofAddress(realloc$get(segment), scope);
    }
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle free$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.free$FUNC, false
    );
    public interface free {

        void apply(MemoryAddress _x0);
        static NativeSymbol allocate(free fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(free.class, fi, _GMemVTable.free$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static free ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("free::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    _GMemVTable.free$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle free$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("free"));
    public static VarHandle free$VH() {
        return _GMemVTable.free$VH;
    }
    public static MemoryAddress free$get(MemorySegment seg) {
        return (MemoryAddress)_GMemVTable.free$VH.get(seg);
    }
    public static void free$set( MemorySegment seg, MemoryAddress x) {
        _GMemVTable.free$VH.set(seg, x);
    }
    public static MemoryAddress free$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GMemVTable.free$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void free$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMemVTable.free$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static free free (MemorySegment segment, ResourceScope scope) {
        return free.ofAddress(free$get(segment), scope);
    }
    static final FunctionDescriptor calloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle calloc$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.calloc$FUNC, false
    );
    public interface calloc {

        Addressable apply(long _x0, long _x1);
        static NativeSymbol allocate(calloc fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(calloc.class, fi, _GMemVTable.calloc$FUNC, "(JJ)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static calloc ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("calloc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (long __x0, long __x1) -> {
                try {
                    return (Addressable)(MemoryAddress)_GMemVTable.calloc$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle calloc$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("calloc"));
    public static VarHandle calloc$VH() {
        return _GMemVTable.calloc$VH;
    }
    public static MemoryAddress calloc$get(MemorySegment seg) {
        return (MemoryAddress)_GMemVTable.calloc$VH.get(seg);
    }
    public static void calloc$set( MemorySegment seg, MemoryAddress x) {
        _GMemVTable.calloc$VH.set(seg, x);
    }
    public static MemoryAddress calloc$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GMemVTable.calloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void calloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMemVTable.calloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static calloc calloc (MemorySegment segment, ResourceScope scope) {
        return calloc.ofAddress(calloc$get(segment), scope);
    }
    static final FunctionDescriptor try_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle try_malloc$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.try_malloc$FUNC, false
    );
    public interface try_malloc {

        Addressable apply(long _x0);
        static NativeSymbol allocate(try_malloc fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(try_malloc.class, fi, _GMemVTable.try_malloc$FUNC, "(J)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static try_malloc ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("try_malloc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (long __x0) -> {
                try {
                    return (Addressable)(MemoryAddress)_GMemVTable.try_malloc$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle try_malloc$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("try_malloc"));
    public static VarHandle try_malloc$VH() {
        return _GMemVTable.try_malloc$VH;
    }
    public static MemoryAddress try_malloc$get(MemorySegment seg) {
        return (MemoryAddress)_GMemVTable.try_malloc$VH.get(seg);
    }
    public static void try_malloc$set( MemorySegment seg, MemoryAddress x) {
        _GMemVTable.try_malloc$VH.set(seg, x);
    }
    public static MemoryAddress try_malloc$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GMemVTable.try_malloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void try_malloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMemVTable.try_malloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static try_malloc try_malloc (MemorySegment segment, ResourceScope scope) {
        return try_malloc.ofAddress(try_malloc$get(segment), scope);
    }
    static final FunctionDescriptor try_realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle try_realloc$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.try_realloc$FUNC, false
    );
    public interface try_realloc {

        Addressable apply(MemoryAddress _x0, long _x1);
        static NativeSymbol allocate(try_realloc fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(try_realloc.class, fi, _GMemVTable.try_realloc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static try_realloc ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("try_realloc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, long __x1) -> {
                try {
                    return (Addressable)(MemoryAddress)_GMemVTable.try_realloc$MH.invokeExact(symbol, (Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle try_realloc$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("try_realloc"));
    public static VarHandle try_realloc$VH() {
        return _GMemVTable.try_realloc$VH;
    }
    public static MemoryAddress try_realloc$get(MemorySegment seg) {
        return (MemoryAddress)_GMemVTable.try_realloc$VH.get(seg);
    }
    public static void try_realloc$set( MemorySegment seg, MemoryAddress x) {
        _GMemVTable.try_realloc$VH.set(seg, x);
    }
    public static MemoryAddress try_realloc$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GMemVTable.try_realloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void try_realloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMemVTable.try_realloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static try_realloc try_realloc (MemorySegment segment, ResourceScope scope) {
        return try_realloc.ofAddress(try_realloc$get(segment), scope);
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


