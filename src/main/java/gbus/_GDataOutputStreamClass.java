// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GDataOutputStreamClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
                Constants$root.C_POINTER$LAYOUT.withName("write_fn"),
                Constants$root.C_POINTER$LAYOUT.withName("splice"),
                Constants$root.C_POINTER$LAYOUT.withName("flush"),
                Constants$root.C_POINTER$LAYOUT.withName("close_fn"),
                Constants$root.C_POINTER$LAYOUT.withName("write_async"),
                Constants$root.C_POINTER$LAYOUT.withName("write_finish"),
                Constants$root.C_POINTER$LAYOUT.withName("splice_async"),
                Constants$root.C_POINTER$LAYOUT.withName("splice_finish"),
                Constants$root.C_POINTER$LAYOUT.withName("flush_async"),
                Constants$root.C_POINTER$LAYOUT.withName("flush_finish"),
                Constants$root.C_POINTER$LAYOUT.withName("close_async"),
                Constants$root.C_POINTER$LAYOUT.withName("close_finish"),
                Constants$root.C_POINTER$LAYOUT.withName("writev_fn"),
                Constants$root.C_POINTER$LAYOUT.withName("writev_async"),
                Constants$root.C_POINTER$LAYOUT.withName("writev_finish"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved7"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved8")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5")
    ).withName("_GDataOutputStreamClass");
    public static MemoryLayout $LAYOUT() {
        return _GDataOutputStreamClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 320);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1$MH = RuntimeHelper.downcallHandle(
        _GDataOutputStreamClass._g_reserved1$FUNC, false
    );
    public interface _g_reserved1 {

        void apply();
        static NativeSymbol allocate(_g_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved1.class, fi, _GDataOutputStreamClass._g_reserved1$FUNC, "()V", scope);
        }
        static _g_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GDataOutputStreamClass._g_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GDataOutputStreamClass._g_reserved1$VH;
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved1$VH.get(seg);
    }
    public static void _g_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2$MH = RuntimeHelper.downcallHandle(
        _GDataOutputStreamClass._g_reserved2$FUNC, false
    );
    public interface _g_reserved2 {

        void apply();
        static NativeSymbol allocate(_g_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved2.class, fi, _GDataOutputStreamClass._g_reserved2$FUNC, "()V", scope);
        }
        static _g_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GDataOutputStreamClass._g_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GDataOutputStreamClass._g_reserved2$VH;
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved2$VH.get(seg);
    }
    public static void _g_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3$MH = RuntimeHelper.downcallHandle(
        _GDataOutputStreamClass._g_reserved3$FUNC, false
    );
    public interface _g_reserved3 {

        void apply();
        static NativeSymbol allocate(_g_reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved3.class, fi, _GDataOutputStreamClass._g_reserved3$FUNC, "()V", scope);
        }
        static _g_reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GDataOutputStreamClass._g_reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GDataOutputStreamClass._g_reserved3$VH;
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved3$VH.get(seg);
    }
    public static void _g_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4$MH = RuntimeHelper.downcallHandle(
        _GDataOutputStreamClass._g_reserved4$FUNC, false
    );
    public interface _g_reserved4 {

        void apply();
        static NativeSymbol allocate(_g_reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved4.class, fi, _GDataOutputStreamClass._g_reserved4$FUNC, "()V", scope);
        }
        static _g_reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GDataOutputStreamClass._g_reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"));
    public static VarHandle _g_reserved4$VH() {
        return _GDataOutputStreamClass._g_reserved4$VH;
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved4$VH.get(seg);
    }
    public static void _g_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5$MH = RuntimeHelper.downcallHandle(
        _GDataOutputStreamClass._g_reserved5$FUNC, false
    );
    public interface _g_reserved5 {

        void apply();
        static NativeSymbol allocate(_g_reserved5 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved5.class, fi, _GDataOutputStreamClass._g_reserved5$FUNC, "()V", scope);
        }
        static _g_reserved5 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved5::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GDataOutputStreamClass._g_reserved5$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    public static VarHandle _g_reserved5$VH() {
        return _GDataOutputStreamClass._g_reserved5$VH;
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved5$VH.get(seg);
    }
    public static void _g_reserved5$set( MemorySegment seg, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved5$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDataOutputStreamClass._g_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDataOutputStreamClass._g_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
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


