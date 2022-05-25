// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GParamSpecClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
        ).withName("g_type_class"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("value_type"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("value_set_default"),
        Constants$root.C_POINTER$LAYOUT.withName("value_validate"),
        Constants$root.C_POINTER$LAYOUT.withName("values_cmp"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_POINTER$LAYOUT).withName("dummy")
    ).withName("_GParamSpecClass");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecClass.$struct$LAYOUT;
    }
    public static MemorySegment g_type_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle value_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value_type"));
    public static VarHandle value_type$VH() {
        return _GParamSpecClass.value_type$VH;
    }
    public static long value_type$get(MemorySegment seg) {
        return (long)_GParamSpecClass.value_type$VH.get(seg);
    }
    public static void value_type$set( MemorySegment seg, long x) {
        _GParamSpecClass.value_type$VH.set(seg, x);
    }
    public static long value_type$get(MemorySegment seg, long index) {
        return (long)_GParamSpecClass.value_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_type$set(MemorySegment seg, long index, long x) {
        _GParamSpecClass.value_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor finalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle finalize$MH = RuntimeHelper.downcallHandle(
        _GParamSpecClass.finalize$FUNC, false
    );
    public interface finalize {

        void apply(MemoryAddress _x0);
        static NativeSymbol allocate(finalize fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(finalize.class, fi, _GParamSpecClass.finalize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static finalize ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("finalize::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    _GParamSpecClass.finalize$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle finalize$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("finalize"));
    public static VarHandle finalize$VH() {
        return _GParamSpecClass.finalize$VH;
    }
    public static MemoryAddress finalize$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecClass.finalize$VH.get(seg);
    }
    public static void finalize$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecClass.finalize$VH.set(seg, x);
    }
    public static MemoryAddress finalize$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecClass.finalize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void finalize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecClass.finalize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static finalize finalize (MemorySegment segment, ResourceScope scope) {
        return finalize.ofAddress(finalize$get(segment), scope);
    }
    static final FunctionDescriptor value_set_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_set_default$MH = RuntimeHelper.downcallHandle(
        _GParamSpecClass.value_set_default$FUNC, false
    );
    public interface value_set_default {

        void apply(MemoryAddress _x0, MemoryAddress _x1);
        static NativeSymbol allocate(value_set_default fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(value_set_default.class, fi, _GParamSpecClass.value_set_default$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static value_set_default ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("value_set_default::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1) -> {
                try {
                    _GParamSpecClass.value_set_default$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle value_set_default$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value_set_default"));
    public static VarHandle value_set_default$VH() {
        return _GParamSpecClass.value_set_default$VH;
    }
    public static MemoryAddress value_set_default$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecClass.value_set_default$VH.get(seg);
    }
    public static void value_set_default$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecClass.value_set_default$VH.set(seg, x);
    }
    public static MemoryAddress value_set_default$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecClass.value_set_default$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_set_default$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecClass.value_set_default$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_set_default value_set_default (MemorySegment segment, ResourceScope scope) {
        return value_set_default.ofAddress(value_set_default$get(segment), scope);
    }
    static final FunctionDescriptor value_validate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_validate$MH = RuntimeHelper.downcallHandle(
        _GParamSpecClass.value_validate$FUNC, false
    );
    public interface value_validate {

        int apply(MemoryAddress _x0, MemoryAddress _x1);
        static NativeSymbol allocate(value_validate fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(value_validate.class, fi, _GParamSpecClass.value_validate$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static value_validate ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("value_validate::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1) -> {
                try {
                    return (int)_GParamSpecClass.value_validate$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle value_validate$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("value_validate"));
    public static VarHandle value_validate$VH() {
        return _GParamSpecClass.value_validate$VH;
    }
    public static MemoryAddress value_validate$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecClass.value_validate$VH.get(seg);
    }
    public static void value_validate$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecClass.value_validate$VH.set(seg, x);
    }
    public static MemoryAddress value_validate$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecClass.value_validate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_validate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecClass.value_validate$VH.set(seg.asSlice(index*sizeof()), x);
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
        _GParamSpecClass.values_cmp$FUNC, false
    );
    public interface values_cmp {

        int apply(MemoryAddress _x0, MemoryAddress _x1, MemoryAddress _x2);
        static NativeSymbol allocate(values_cmp fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(values_cmp.class, fi, _GParamSpecClass.values_cmp$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static values_cmp ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("values_cmp::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, MemoryAddress __x2) -> {
                try {
                    return (int)_GParamSpecClass.values_cmp$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, (Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle values_cmp$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("values_cmp"));
    public static VarHandle values_cmp$VH() {
        return _GParamSpecClass.values_cmp$VH;
    }
    public static MemoryAddress values_cmp$get(MemorySegment seg) {
        return (MemoryAddress)_GParamSpecClass.values_cmp$VH.get(seg);
    }
    public static void values_cmp$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecClass.values_cmp$VH.set(seg, x);
    }
    public static MemoryAddress values_cmp$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GParamSpecClass.values_cmp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void values_cmp$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecClass.values_cmp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static values_cmp values_cmp (MemorySegment segment, ResourceScope scope) {
        return values_cmp.ofAddress(values_cmp$get(segment), scope);
    }
    public static MemorySegment dummy$slice(MemorySegment seg) {
        return seg.asSlice(48, 32);
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


