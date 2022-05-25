// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GPollableInputStreamInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("can_poll"),
        Constants$root.C_POINTER$LAYOUT.withName("is_readable"),
        Constants$root.C_POINTER$LAYOUT.withName("create_source"),
        Constants$root.C_POINTER$LAYOUT.withName("read_nonblocking")
    ).withName("_GPollableInputStreamInterface");
    public static MemoryLayout $LAYOUT() {
        return _GPollableInputStreamInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor can_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_poll$MH = RuntimeHelper.downcallHandle(
        _GPollableInputStreamInterface.can_poll$FUNC, false
    );
    public interface can_poll {

        int apply(MemoryAddress _x0);
        static NativeSymbol allocate(can_poll fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(can_poll.class, fi, _GPollableInputStreamInterface.can_poll$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static can_poll ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("can_poll::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (int)_GPollableInputStreamInterface.can_poll$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_poll$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("can_poll"));
    public static VarHandle can_poll$VH() {
        return _GPollableInputStreamInterface.can_poll$VH;
    }
    public static MemoryAddress can_poll$get(MemorySegment seg) {
        return (MemoryAddress)_GPollableInputStreamInterface.can_poll$VH.get(seg);
    }
    public static void can_poll$set( MemorySegment seg, MemoryAddress x) {
        _GPollableInputStreamInterface.can_poll$VH.set(seg, x);
    }
    public static MemoryAddress can_poll$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GPollableInputStreamInterface.can_poll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_poll$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableInputStreamInterface.can_poll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_poll can_poll (MemorySegment segment, ResourceScope scope) {
        return can_poll.ofAddress(can_poll$get(segment), scope);
    }
    static final FunctionDescriptor is_readable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_readable$MH = RuntimeHelper.downcallHandle(
        _GPollableInputStreamInterface.is_readable$FUNC, false
    );
    public interface is_readable {

        int apply(MemoryAddress _x0);
        static NativeSymbol allocate(is_readable fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(is_readable.class, fi, _GPollableInputStreamInterface.is_readable$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static is_readable ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("is_readable::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (int)_GPollableInputStreamInterface.is_readable$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_readable$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("is_readable"));
    public static VarHandle is_readable$VH() {
        return _GPollableInputStreamInterface.is_readable$VH;
    }
    public static MemoryAddress is_readable$get(MemorySegment seg) {
        return (MemoryAddress)_GPollableInputStreamInterface.is_readable$VH.get(seg);
    }
    public static void is_readable$set( MemorySegment seg, MemoryAddress x) {
        _GPollableInputStreamInterface.is_readable$VH.set(seg, x);
    }
    public static MemoryAddress is_readable$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GPollableInputStreamInterface.is_readable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_readable$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableInputStreamInterface.is_readable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_readable is_readable (MemorySegment segment, ResourceScope scope) {
        return is_readable.ofAddress(is_readable$get(segment), scope);
    }
    static final FunctionDescriptor create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_source$MH = RuntimeHelper.downcallHandle(
        _GPollableInputStreamInterface.create_source$FUNC, false
    );
    public interface create_source {

        Addressable apply(MemoryAddress _x0, MemoryAddress _x1);
        static NativeSymbol allocate(create_source fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(create_source.class, fi, _GPollableInputStreamInterface.create_source$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static create_source ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("create_source::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1) -> {
                try {
                    return (Addressable)(MemoryAddress)_GPollableInputStreamInterface.create_source$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle create_source$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("create_source"));
    public static VarHandle create_source$VH() {
        return _GPollableInputStreamInterface.create_source$VH;
    }
    public static MemoryAddress create_source$get(MemorySegment seg) {
        return (MemoryAddress)_GPollableInputStreamInterface.create_source$VH.get(seg);
    }
    public static void create_source$set( MemorySegment seg, MemoryAddress x) {
        _GPollableInputStreamInterface.create_source$VH.set(seg, x);
    }
    public static MemoryAddress create_source$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GPollableInputStreamInterface.create_source$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void create_source$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableInputStreamInterface.create_source$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_source create_source (MemorySegment segment, ResourceScope scope) {
        return create_source.ofAddress(create_source$get(segment), scope);
    }
    static final FunctionDescriptor read_nonblocking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle read_nonblocking$MH = RuntimeHelper.downcallHandle(
        _GPollableInputStreamInterface.read_nonblocking$FUNC, false
    );
    public interface read_nonblocking {

        long apply(MemoryAddress _x0, MemoryAddress _x1, long _x2, MemoryAddress _x3);
        static NativeSymbol allocate(read_nonblocking fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(read_nonblocking.class, fi, _GPollableInputStreamInterface.read_nonblocking$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)J", scope);
        }
        static read_nonblocking ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("read_nonblocking::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, long __x2, MemoryAddress __x3) -> {
                try {
                    return (long)_GPollableInputStreamInterface.read_nonblocking$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, __x2, (Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle read_nonblocking$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("read_nonblocking"));
    public static VarHandle read_nonblocking$VH() {
        return _GPollableInputStreamInterface.read_nonblocking$VH;
    }
    public static MemoryAddress read_nonblocking$get(MemorySegment seg) {
        return (MemoryAddress)_GPollableInputStreamInterface.read_nonblocking$VH.get(seg);
    }
    public static void read_nonblocking$set( MemorySegment seg, MemoryAddress x) {
        _GPollableInputStreamInterface.read_nonblocking$VH.set(seg, x);
    }
    public static MemoryAddress read_nonblocking$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GPollableInputStreamInterface.read_nonblocking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void read_nonblocking$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableInputStreamInterface.read_nonblocking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_nonblocking read_nonblocking (MemorySegment segment, ResourceScope scope) {
        return read_nonblocking.ofAddress(read_nonblocking$get(segment), scope);
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


