// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GSocketClass {

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
    ).withName("_GSocketClass");
    public static MemoryLayout $LAYOUT() {
        return _GSocketClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved1$FUNC, false
    );
    public interface _g_reserved1 {

        void apply();
        static NativeSymbol allocate(_g_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved1.class, fi, _GSocketClass._g_reserved1$FUNC, "()V", scope);
        }
        static _g_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GSocketClass._g_reserved1$VH;
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved1$VH.get(seg);
    }
    public static void _g_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved2$FUNC, false
    );
    public interface _g_reserved2 {

        void apply();
        static NativeSymbol allocate(_g_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved2.class, fi, _GSocketClass._g_reserved2$FUNC, "()V", scope);
        }
        static _g_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GSocketClass._g_reserved2$VH;
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved2$VH.get(seg);
    }
    public static void _g_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved3$FUNC, false
    );
    public interface _g_reserved3 {

        void apply();
        static NativeSymbol allocate(_g_reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved3.class, fi, _GSocketClass._g_reserved3$FUNC, "()V", scope);
        }
        static _g_reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GSocketClass._g_reserved3$VH;
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved3$VH.get(seg);
    }
    public static void _g_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved4$FUNC, false
    );
    public interface _g_reserved4 {

        void apply();
        static NativeSymbol allocate(_g_reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved4.class, fi, _GSocketClass._g_reserved4$FUNC, "()V", scope);
        }
        static _g_reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved4$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved4"));
    public static VarHandle _g_reserved4$VH() {
        return _GSocketClass._g_reserved4$VH;
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved4$VH.get(seg);
    }
    public static void _g_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved5$FUNC, false
    );
    public interface _g_reserved5 {

        void apply();
        static NativeSymbol allocate(_g_reserved5 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved5.class, fi, _GSocketClass._g_reserved5$FUNC, "()V", scope);
        }
        static _g_reserved5 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved5::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved5$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved5$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved5"));
    public static VarHandle _g_reserved5$VH() {
        return _GSocketClass._g_reserved5$VH;
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved5$VH.get(seg);
    }
    public static void _g_reserved5$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved5$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved6$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved6$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved6$FUNC, false
    );
    public interface _g_reserved6 {

        void apply();
        static NativeSymbol allocate(_g_reserved6 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved6.class, fi, _GSocketClass._g_reserved6$FUNC, "()V", scope);
        }
        static _g_reserved6 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved6::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved6$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved6$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved6"));
    public static VarHandle _g_reserved6$VH() {
        return _GSocketClass._g_reserved6$VH;
    }
    public static MemoryAddress _g_reserved6$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved6$VH.get(seg);
    }
    public static void _g_reserved6$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved6$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved6$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved6$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved6 _g_reserved6 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved6.ofAddress(_g_reserved6$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved7$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved7$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved7$FUNC, false
    );
    public interface _g_reserved7 {

        void apply();
        static NativeSymbol allocate(_g_reserved7 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved7.class, fi, _GSocketClass._g_reserved7$FUNC, "()V", scope);
        }
        static _g_reserved7 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved7::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved7$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved7$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved7"));
    public static VarHandle _g_reserved7$VH() {
        return _GSocketClass._g_reserved7$VH;
    }
    public static MemoryAddress _g_reserved7$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved7$VH.get(seg);
    }
    public static void _g_reserved7$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved7$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved7$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved7$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved7 _g_reserved7 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved7.ofAddress(_g_reserved7$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved8$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved8$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved8$FUNC, false
    );
    public interface _g_reserved8 {

        void apply();
        static NativeSymbol allocate(_g_reserved8 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved8.class, fi, _GSocketClass._g_reserved8$FUNC, "()V", scope);
        }
        static _g_reserved8 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved8::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved8$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved8$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved8"));
    public static VarHandle _g_reserved8$VH() {
        return _GSocketClass._g_reserved8$VH;
    }
    public static MemoryAddress _g_reserved8$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved8$VH.get(seg);
    }
    public static void _g_reserved8$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved8$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved8$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved8$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved8$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved8$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved8 _g_reserved8 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved8.ofAddress(_g_reserved8$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved9$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved9$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved9$FUNC, false
    );
    public interface _g_reserved9 {

        void apply();
        static NativeSymbol allocate(_g_reserved9 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved9.class, fi, _GSocketClass._g_reserved9$FUNC, "()V", scope);
        }
        static _g_reserved9 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved9::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved9$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved9$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved9"));
    public static VarHandle _g_reserved9$VH() {
        return _GSocketClass._g_reserved9$VH;
    }
    public static MemoryAddress _g_reserved9$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved9$VH.get(seg);
    }
    public static void _g_reserved9$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved9$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved9$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved9$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved9$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved9$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved9 _g_reserved9 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved9.ofAddress(_g_reserved9$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved10$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved10$MH = RuntimeHelper.downcallHandle(
        _GSocketClass._g_reserved10$FUNC, false
    );
    public interface _g_reserved10 {

        void apply();
        static NativeSymbol allocate(_g_reserved10 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved10.class, fi, _GSocketClass._g_reserved10$FUNC, "()V", scope);
        }
        static _g_reserved10 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved10::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GSocketClass._g_reserved10$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved10$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("_g_reserved10"));
    public static VarHandle _g_reserved10$VH() {
        return _GSocketClass._g_reserved10$VH;
    }
    public static MemoryAddress _g_reserved10$get(MemorySegment seg) {
        return (MemoryAddress)_GSocketClass._g_reserved10$VH.get(seg);
    }
    public static void _g_reserved10$set( MemorySegment seg, MemoryAddress x) {
        _GSocketClass._g_reserved10$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved10$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GSocketClass._g_reserved10$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved10$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketClass._g_reserved10$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved10 _g_reserved10 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved10.ofAddress(_g_reserved10$get(segment), scope);
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


