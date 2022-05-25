// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GFloatIEEE754 {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("v_float"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(23).withName("mantissa"),
                MemoryLayout.paddingLayout(8).withName("biased_exponent"),
                MemoryLayout.paddingLayout(1).withName("sign")
            )
        ).withName("mpn")
    ).withName("_GFloatIEEE754");
    public static MemoryLayout $LAYOUT() {
        return _GFloatIEEE754.$union$LAYOUT;
    }
    static final VarHandle v_float$VH = $union$LAYOUT.varHandle(PathElement.groupElement("v_float"));
    public static VarHandle v_float$VH() {
        return _GFloatIEEE754.v_float$VH;
    }
    public static float v_float$get(MemorySegment seg) {
        return (float)_GFloatIEEE754.v_float$VH.get(seg);
    }
    public static void v_float$set( MemorySegment seg, float x) {
        _GFloatIEEE754.v_float$VH.set(seg, x);
    }
    public static float v_float$get(MemorySegment seg, long index) {
        return (float)_GFloatIEEE754.v_float$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_float$set(MemorySegment seg, long index, float x) {
        _GFloatIEEE754.v_float$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class mpn {

        static final  GroupLayout mpn$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(23).withName("mantissa"),
                MemoryLayout.paddingLayout(8).withName("biased_exponent"),
                MemoryLayout.paddingLayout(1).withName("sign")
            )
        );
        public static MemoryLayout $LAYOUT() {
            return mpn.mpn$struct$LAYOUT;
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

    public static MemorySegment mpn$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
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


