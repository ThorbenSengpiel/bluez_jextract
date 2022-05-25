// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GParamSpecTypeInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("instance_size"),
        Constants$root.C_SHORT$LAYOUT.withName("n_preallocs"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("instance_init"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("value_type"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("value_set_default"),
        Constants$root.C_POINTER$LAYOUT.withName("value_validate"),
        Constants$root.C_POINTER$LAYOUT.withName("values_cmp")
    ).withName("_GParamSpecTypeInfo");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecTypeInfo.$struct$LAYOUT;
    }
    static final VarHandle instance_size$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("instance_size"));
    public static VarHandle instance_size$VH() {
        return _GParamSpecTypeInfo.instance_size$VH;
    }
    public static short instance_size$get(MemorySegment seg) {
        return (short)_GParamSpecTypeInfo.instance_size$VH.get(seg);
    }
    public static void instance_size$set( MemorySegment seg, short x) {
        _GParamSpecTypeInfo.instance_size$VH.set(seg, x);
    }
    public static short instance_size$get(MemorySegment seg, long index) {
        return (short)_GParamSpecTypeInfo.instance_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void instance_size$set(MemorySegment seg, long index, short x) {
        _GParamSpecTypeInfo.instance_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n_preallocs$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("n_preallocs"));
    public static VarHandle n_preallocs$VH() {
        return _GParamSpecTypeInfo.n_preallocs$VH;
    }
    public static short n_preallocs$get(MemorySegment seg) {
        return (short)_GParamSpecTypeInfo.n_preallocs$VH.get(seg);
    }
    public static void n_preallocs$set( MemorySegment seg, short x) {
        _GParamSpecTypeInfo.n_preallocs$VH.set(seg, x);
    }
    public static short n_preallocs$get(MemorySegment seg, long index) {
        return (short)_GParamSpecTypeInfo.n_preallocs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_preallocs$set(MemorySegment seg, long index, short x) {
        _GParamSpecTypeInfo.n_preallocs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor instance_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle instance_init$MH = RuntimeHelper.downcallHandle(
        _GParamSpecTypeInfo.instance_init$FUNC, false
    );
    public interface instance_init {

        void apply(MemoryAddress _x0);
        static NativeSymbol allocate(instance_init fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(instance_init.class, fi, _GParamSpecTypeInfo.instance_init$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static instance_init ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("instance_init::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    _GParamSpecTypeInfo.instance_init$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle instance_init$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("instance_init"));
    public static VarHandle instance_init$VH() {
        return _GParamSpecTypeInfo.instance_init$VH;
    }
    public static MemoryAddress instance_init$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecTypeInfo.instance_init$VH.get(seg);
    }
    public static void instance_init$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecTypeInfo.instance_init$VH.set(seg, x);
    }
    public static MemoryAddress instance_init$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecTypeInfo.instance_init$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void instance_init$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecTypeInfo.instance_init$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static instance_init instance_init (MemorySegment segment, ResourceScope scope) {
        return instance_init.ofAddress(instance_init$get(segment), scope);
    }
    static final VarHandle value_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value_type"));
    public static VarHandle value_type$VH() {
        return _GParamSpecTypeInfo.value_type$VH;
    }
    public static long value_type$get(MemorySegment seg) {
        return (long)_GParamSpecTypeInfo.value_type$VH.get(seg);
    }
    public static void value_type$set( MemorySegment seg, long x) {
        _GParamSpecTypeInfo.value_type$VH.set(seg, x);
    }
    public static long value_type$get(MemorySegment seg, long index) {
        return (long)_GParamSpecTypeInfo.value_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_type$set(MemorySegment seg, long index, long x) {
        _GParamSpecTypeInfo.value_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor finalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle finalize$MH = RuntimeHelper.downcallHandle(
        _GParamSpecTypeInfo.finalize$FUNC, false
    );
    public interface finalize {

        void apply(MemoryAddress _x0);
        static NativeSymbol allocate(finalize fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(finalize.class, fi, _GParamSpecTypeInfo.finalize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static finalize ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("finalize::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    _GParamSpecTypeInfo.finalize$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle finalize$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("finalize"));
    public static VarHandle finalize$VH() {
        return _GParamSpecTypeInfo.finalize$VH;
    }
    public static MemoryAddress finalize$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecTypeInfo.finalize$VH.get(seg);
    }
    public static void finalize$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecTypeInfo.finalize$VH.set(seg, x);
    }
    public static MemoryAddress finalize$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecTypeInfo.finalize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void finalize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecTypeInfo.finalize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static finalize finalize (MemorySegment segment, ResourceScope scope) {
        return finalize.ofAddress(finalize$get(segment), scope);
    }
    static final FunctionDescriptor value_set_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_set_default$MH = RuntimeHelper.downcallHandle(
        _GParamSpecTypeInfo.value_set_default$FUNC, false
    );
    public interface value_set_default {

        void apply(MemoryAddress _x0, MemoryAddress _x1);
        static NativeSymbol allocate(value_set_default fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(value_set_default.class, fi, _GParamSpecTypeInfo.value_set_default$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static value_set_default ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("value_set_default::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1) -> {
                try {
                    _GParamSpecTypeInfo.value_set_default$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle value_set_default$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value_set_default"));
    public static VarHandle value_set_default$VH() {
        return _GParamSpecTypeInfo.value_set_default$VH;
    }
    public static MemoryAddress value_set_default$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecTypeInfo.value_set_default$VH.get(seg);
    }
    public static void value_set_default$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecTypeInfo.value_set_default$VH.set(seg, x);
    }
    public static MemoryAddress value_set_default$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecTypeInfo.value_set_default$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_set_default$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecTypeInfo.value_set_default$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_set_default value_set_default (MemorySegment segment, ResourceScope scope) {
        return value_set_default.ofAddress(value_set_default$get(segment), scope);
    }
    static final FunctionDescriptor value_validate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_validate$MH = RuntimeHelper.downcallHandle(
        _GParamSpecTypeInfo.value_validate$FUNC, false
    );
    public interface value_validate {

        int apply(MemoryAddress _x0, MemoryAddress _x1);
        static NativeSymbol allocate(value_validate fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(value_validate.class, fi, _GParamSpecTypeInfo.value_validate$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static value_validate ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("value_validate::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1) -> {
                try {
                    return (int)_GParamSpecTypeInfo.value_validate$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle value_validate$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value_validate"));
    public static VarHandle value_validate$VH() {
        return _GParamSpecTypeInfo.value_validate$VH;
    }
    public static MemoryAddress value_validate$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecTypeInfo.value_validate$VH.get(seg);
    }
    public static void value_validate$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecTypeInfo.value_validate$VH.set(seg, x);
    }
    public static MemoryAddress value_validate$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecTypeInfo.value_validate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_validate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecTypeInfo.value_validate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_validate value_validate (MemorySegment segment, ResourceScope scope) {
        return value_validate.ofAddress(value_validate$get(segment), scope);
    }
    static final FunctionDescriptor values_cmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle values_cmp$MH = RuntimeHelper.downcallHandle(
        _GParamSpecTypeInfo.values_cmp$FUNC, false
    );
    public interface values_cmp {

        int apply(MemoryAddress _x0, MemoryAddress _x1, MemoryAddress _x2);
        static NativeSymbol allocate(values_cmp fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(values_cmp.class, fi, _GParamSpecTypeInfo.values_cmp$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static values_cmp ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("values_cmp::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, MemoryAddress __x2) -> {
                try {
                    return (int)_GParamSpecTypeInfo.values_cmp$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, (Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle values_cmp$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("values_cmp"));
    public static VarHandle values_cmp$VH() {
        return _GParamSpecTypeInfo.values_cmp$VH;
    }
    public static MemoryAddress values_cmp$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecTypeInfo.values_cmp$VH.get(seg);
    }
    public static void values_cmp$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecTypeInfo.values_cmp$VH.set(seg, x);
    }
    public static MemoryAddress values_cmp$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecTypeInfo.values_cmp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void values_cmp$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecTypeInfo.values_cmp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static values_cmp values_cmp (MemorySegment segment, ResourceScope scope) {
        return values_cmp.ofAddress(values_cmp$get(segment), scope);
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

