// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GEnumValue {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("value"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("value_name"),
        Constants$root.C_POINTER$LAYOUT.withName("value_nick")
    ).withName("_GEnumValue");
    public static MemoryLayout $LAYOUT() {
        return _GEnumValue.$struct$LAYOUT;
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _GEnumValue.value$VH;
    }
    public static int value$get(MemorySegment seg) {
        return (int)_GEnumValue.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, int x) {
        _GEnumValue.value$VH.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)_GEnumValue.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        _GEnumValue.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_name"));
    public static VarHandle value_name$VH() {
        return _GEnumValue.value_name$VH;
    }
    public static MemoryAddress value_name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GEnumValue.value_name$VH.get(seg);
    }
    public static void value_name$set( MemorySegment seg, MemoryAddress x) {
        _GEnumValue.value_name$VH.set(seg, x);
    }
    public static MemoryAddress value_name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GEnumValue.value_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GEnumValue.value_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value_nick$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_nick"));
    public static VarHandle value_nick$VH() {
        return _GEnumValue.value_nick$VH;
    }
    public static MemoryAddress value_nick$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GEnumValue.value_nick$VH.get(seg);
    }
    public static void value_nick$set( MemorySegment seg, MemoryAddress x) {
        _GEnumValue.value_nick$VH.set(seg, x);
    }
    public static MemoryAddress value_nick$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GEnumValue.value_nick$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_nick$set(MemorySegment seg, long index, MemoryAddress x) {
        _GEnumValue.value_nick$VH.set(seg.asSlice(index*sizeof()), x);
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


