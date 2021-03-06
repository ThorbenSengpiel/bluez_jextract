// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GDatagramBasedInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("receive_messages"),
        Constants$root.C_POINTER$LAYOUT.withName("send_messages"),
        Constants$root.C_POINTER$LAYOUT.withName("create_source"),
        Constants$root.C_POINTER$LAYOUT.withName("condition_check"),
        Constants$root.C_POINTER$LAYOUT.withName("condition_wait")
    ).withName("_GDatagramBasedInterface");
    public static MemoryLayout $LAYOUT() {
        return _GDatagramBasedInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor receive_messages$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle receive_messages$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.receive_messages$FUNC, false
    );
    public interface receive_messages {

        int apply(MemoryAddress _x0, MemoryAddress _x1, int _x2, int _x3, long _x4, MemoryAddress _x5, MemoryAddress _x6);
        static NativeSymbol allocate(receive_messages fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(receive_messages.class, fi, _GDatagramBasedInterface.receive_messages$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static receive_messages ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("receive_messages::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, int __x2, int __x3, long __x4, MemoryAddress __x5, MemoryAddress __x6) -> {
                try {
                    return (int)_GDatagramBasedInterface.receive_messages$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, __x2, __x3, __x4, (Addressable)__x5, (Addressable)__x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle receive_messages$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("receive_messages"));
    public static VarHandle receive_messages$VH() {
        return _GDatagramBasedInterface.receive_messages$VH;
    }
    public static MemoryAddress receive_messages$get(MemorySegment seg) {
        return (MemoryAddress)_GDatagramBasedInterface.receive_messages$VH.get(seg);
    }
    public static void receive_messages$set( MemorySegment seg, MemoryAddress x) {
        _GDatagramBasedInterface.receive_messages$VH.set(seg, x);
    }
    public static MemoryAddress receive_messages$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDatagramBasedInterface.receive_messages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void receive_messages$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDatagramBasedInterface.receive_messages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static receive_messages receive_messages (MemorySegment segment, ResourceScope scope) {
        return receive_messages.ofAddress(receive_messages$get(segment), scope);
    }
    static final FunctionDescriptor send_messages$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle send_messages$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.send_messages$FUNC, false
    );
    public interface send_messages {

        int apply(MemoryAddress _x0, MemoryAddress _x1, int _x2, int _x3, long _x4, MemoryAddress _x5, MemoryAddress _x6);
        static NativeSymbol allocate(send_messages fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(send_messages.class, fi, _GDatagramBasedInterface.send_messages$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static send_messages ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("send_messages::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, int __x2, int __x3, long __x4, MemoryAddress __x5, MemoryAddress __x6) -> {
                try {
                    return (int)_GDatagramBasedInterface.send_messages$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, __x2, __x3, __x4, (Addressable)__x5, (Addressable)__x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle send_messages$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("send_messages"));
    public static VarHandle send_messages$VH() {
        return _GDatagramBasedInterface.send_messages$VH;
    }
    public static MemoryAddress send_messages$get(MemorySegment seg) {
        return (MemoryAddress)_GDatagramBasedInterface.send_messages$VH.get(seg);
    }
    public static void send_messages$set( MemorySegment seg, MemoryAddress x) {
        _GDatagramBasedInterface.send_messages$VH.set(seg, x);
    }
    public static MemoryAddress send_messages$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDatagramBasedInterface.send_messages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_messages$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDatagramBasedInterface.send_messages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static send_messages send_messages (MemorySegment segment, ResourceScope scope) {
        return send_messages.ofAddress(send_messages$get(segment), scope);
    }
    static final FunctionDescriptor create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_source$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.create_source$FUNC, false
    );
    public interface create_source {

        Addressable apply(MemoryAddress _x0, int _x1, MemoryAddress _x2);
        static NativeSymbol allocate(create_source fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(create_source.class, fi, _GDatagramBasedInterface.create_source$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static create_source ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("create_source::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, int __x1, MemoryAddress __x2) -> {
                try {
                    return (Addressable)(MemoryAddress)_GDatagramBasedInterface.create_source$MH.invokeExact(symbol, (Addressable)__x0, __x1, (Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle create_source$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("create_source"));
    public static VarHandle create_source$VH() {
        return _GDatagramBasedInterface.create_source$VH;
    }
    public static MemoryAddress create_source$get(MemorySegment seg) {
        return (MemoryAddress)_GDatagramBasedInterface.create_source$VH.get(seg);
    }
    public static void create_source$set( MemorySegment seg, MemoryAddress x) {
        _GDatagramBasedInterface.create_source$VH.set(seg, x);
    }
    public static MemoryAddress create_source$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDatagramBasedInterface.create_source$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void create_source$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDatagramBasedInterface.create_source$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_source create_source (MemorySegment segment, ResourceScope scope) {
        return create_source.ofAddress(create_source$get(segment), scope);
    }
    static final FunctionDescriptor condition_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle condition_check$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.condition_check$FUNC, false
    );
    public interface condition_check {

        int apply(MemoryAddress _x0, int _x1);
        static NativeSymbol allocate(condition_check fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(condition_check.class, fi, _GDatagramBasedInterface.condition_check$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static condition_check ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("condition_check::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)_GDatagramBasedInterface.condition_check$MH.invokeExact(symbol, (Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle condition_check$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("condition_check"));
    public static VarHandle condition_check$VH() {
        return _GDatagramBasedInterface.condition_check$VH;
    }
    public static MemoryAddress condition_check$get(MemorySegment seg) {
        return (MemoryAddress)_GDatagramBasedInterface.condition_check$VH.get(seg);
    }
    public static void condition_check$set( MemorySegment seg, MemoryAddress x) {
        _GDatagramBasedInterface.condition_check$VH.set(seg, x);
    }
    public static MemoryAddress condition_check$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDatagramBasedInterface.condition_check$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void condition_check$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDatagramBasedInterface.condition_check$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static condition_check condition_check (MemorySegment segment, ResourceScope scope) {
        return condition_check.ofAddress(condition_check$get(segment), scope);
    }
    static final FunctionDescriptor condition_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle condition_wait$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.condition_wait$FUNC, false
    );
    public interface condition_wait {

        int apply(MemoryAddress _x0, int _x1, long _x2, MemoryAddress _x3, MemoryAddress _x4);
        static NativeSymbol allocate(condition_wait fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(condition_wait.class, fi, _GDatagramBasedInterface.condition_wait$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static condition_wait ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("condition_wait::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, int __x1, long __x2, MemoryAddress __x3, MemoryAddress __x4) -> {
                try {
                    return (int)_GDatagramBasedInterface.condition_wait$MH.invokeExact(symbol, (Addressable)__x0, __x1, __x2, (Addressable)__x3, (Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle condition_wait$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("condition_wait"));
    public static VarHandle condition_wait$VH() {
        return _GDatagramBasedInterface.condition_wait$VH;
    }
    public static MemoryAddress condition_wait$get(MemorySegment seg) {
        return (MemoryAddress)_GDatagramBasedInterface.condition_wait$VH.get(seg);
    }
    public static void condition_wait$set( MemorySegment seg, MemoryAddress x) {
        _GDatagramBasedInterface.condition_wait$VH.set(seg, x);
    }
    public static MemoryAddress condition_wait$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDatagramBasedInterface.condition_wait$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void condition_wait$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDatagramBasedInterface.condition_wait$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static condition_wait condition_wait (MemorySegment segment, ResourceScope scope) {
        return condition_wait.ofAddress(condition_wait$get(segment), scope);
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


