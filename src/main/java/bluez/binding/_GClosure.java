// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GClosure {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(15).withName("ref_count"),
            MemoryLayout.paddingLayout(1).withName("meta_marshal_nouse"),
            MemoryLayout.paddingLayout(1).withName("n_guards"),
            MemoryLayout.paddingLayout(2).withName("n_fnotifiers"),
            MemoryLayout.paddingLayout(8).withName("n_inotifiers"),
            MemoryLayout.paddingLayout(1).withName("in_inotify"),
            MemoryLayout.paddingLayout(1).withName("floating"),
            MemoryLayout.paddingLayout(1).withName("derivative_flag"),
            MemoryLayout.paddingLayout(1).withName("in_marshal"),
            MemoryLayout.paddingLayout(1).withName("is_invalid"),
            MemoryLayout.paddingLayout(32)
        ),
        Constants$root.C_POINTER$LAYOUT.withName("marshal"),
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_POINTER$LAYOUT.withName("notifiers")
    ).withName("_GClosure");
    public static MemoryLayout $LAYOUT() {
        return _GClosure.$struct$LAYOUT;
    }
    static final FunctionDescriptor marshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle marshal$MH = RuntimeHelper.downcallHandle(
        _GClosure.marshal$FUNC, false
    );
    public interface marshal {

        void apply(MemoryAddress _x0, MemoryAddress _x1, int _x2, MemoryAddress _x3, MemoryAddress _x4, MemoryAddress _x5);
        static NativeSymbol allocate(marshal fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(marshal.class, fi, _GClosure.marshal$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static marshal ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("marshal::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, int __x2, MemoryAddress __x3, MemoryAddress __x4, MemoryAddress __x5) -> {
                try {
                    _GClosure.marshal$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, __x2, (Addressable)__x3, (Addressable)__x4, (Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle marshal$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("marshal"));
    public static VarHandle marshal$VH() {
        return _GClosure.marshal$VH;
    }
    public static MemoryAddress marshal$get(MemorySegment seg) {
        return (MemoryAddress)_GClosure.marshal$VH.get(seg);
    }
    public static void marshal$set( MemorySegment seg, MemoryAddress x) {
        _GClosure.marshal$VH.set(seg, x);
    }
    public static MemoryAddress marshal$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GClosure.marshal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void marshal$set(MemorySegment seg, long index, MemoryAddress x) {
        _GClosure.marshal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static marshal marshal (MemorySegment segment, ResourceScope scope) {
        return marshal.ofAddress(marshal$get(segment), scope);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _GClosure.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (MemoryAddress)_GClosure.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        _GClosure.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GClosure.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        _GClosure.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle notifiers$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("notifiers"));
    public static VarHandle notifiers$VH() {
        return _GClosure.notifiers$VH;
    }
    public static MemoryAddress notifiers$get(MemorySegment seg) {
        return (MemoryAddress)_GClosure.notifiers$VH.get(seg);
    }
    public static void notifiers$set( MemorySegment seg, MemoryAddress x) {
        _GClosure.notifiers$VH.set(seg, x);
    }
    public static MemoryAddress notifiers$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GClosure.notifiers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void notifiers$set(MemorySegment seg, long index, MemoryAddress x) {
        _GClosure.notifiers$VH.set(seg.asSlice(index*sizeof()), x);
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


