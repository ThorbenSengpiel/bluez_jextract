// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GConverterIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("convert"),
        Constants$root.C_POINTER$LAYOUT.withName("reset")
    ).withName("_GConverterIface");
    public static MemoryLayout $LAYOUT() {
        return _GConverterIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor convert$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle convert$MH = RuntimeHelper.downcallHandle(
        _GConverterIface.convert$FUNC, false
    );
    public interface convert {

        int apply(MemoryAddress _x0, MemoryAddress _x1, long _x2, MemoryAddress _x3, long _x4, int _x5, MemoryAddress _x6, MemoryAddress _x7, MemoryAddress _x8);
        static NativeSymbol allocate(convert fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(convert.class, fi, _GConverterIface.convert$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static convert ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("convert::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, long __x2, MemoryAddress __x3, long __x4, int __x5, MemoryAddress __x6, MemoryAddress __x7, MemoryAddress __x8) -> {
                try {
                    return (int)_GConverterIface.convert$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, __x2, (Addressable)__x3, __x4, __x5, (Addressable)__x6, (Addressable)__x7, (Addressable)__x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle convert$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("convert"));
    public static VarHandle convert$VH() {
        return _GConverterIface.convert$VH;
    }
    public static MemoryAddress convert$get(MemorySegment seg) {
        return (MemoryAddress)_GConverterIface.convert$VH.get(seg);
    }
    public static void convert$set( MemorySegment seg, MemoryAddress x) {
        _GConverterIface.convert$VH.set(seg, x);
    }
    public static MemoryAddress convert$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GConverterIface.convert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void convert$set(MemorySegment seg, long index, MemoryAddress x) {
        _GConverterIface.convert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static convert convert (MemorySegment segment, ResourceScope scope) {
        return convert.ofAddress(convert$get(segment), scope);
    }
    static final FunctionDescriptor reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle reset$MH = RuntimeHelper.downcallHandle(
        _GConverterIface.reset$FUNC, false
    );
    public interface reset {

        void apply(MemoryAddress _x0);
        static NativeSymbol allocate(reset fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reset.class, fi, _GConverterIface.reset$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static reset ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reset::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    _GConverterIface.reset$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reset$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("reset"));
    public static VarHandle reset$VH() {
        return _GConverterIface.reset$VH;
    }
    public static MemoryAddress reset$get(MemorySegment seg) {
        return (MemoryAddress)_GConverterIface.reset$VH.get(seg);
    }
    public static void reset$set( MemorySegment seg, MemoryAddress x) {
        _GConverterIface.reset$VH.set(seg, x);
    }
    public static MemoryAddress reset$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GConverterIface.reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reset$set(MemorySegment seg, long index, MemoryAddress x) {
        _GConverterIface.reset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reset reset (MemorySegment segment, ResourceScope scope) {
        return reset.ofAddress(reset$get(segment), scope);
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


