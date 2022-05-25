// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class dirent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("d_ino"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("d_off"),
        Constants$root.C_SHORT$LAYOUT.withName("d_reclen"),
        Constants$root.C_CHAR$LAYOUT.withName("d_type"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_CHAR$LAYOUT).withName("d_name"),
        MemoryLayout.paddingLayout(40)
    ).withName("dirent");
    public static MemoryLayout $LAYOUT() {
        return dirent.$struct$LAYOUT;
    }
    static final VarHandle d_ino$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("d_ino"));
    public static VarHandle d_ino$VH() {
        return dirent.d_ino$VH;
    }
    public static long d_ino$get(MemorySegment seg) {
        return (long)dirent.d_ino$VH.get(seg);
    }
    public static void d_ino$set( MemorySegment seg, long x) {
        dirent.d_ino$VH.set(seg, x);
    }
    public static long d_ino$get(MemorySegment seg, long index) {
        return (long)dirent.d_ino$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void d_ino$set(MemorySegment seg, long index, long x) {
        dirent.d_ino$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle d_off$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("d_off"));
    public static VarHandle d_off$VH() {
        return dirent.d_off$VH;
    }
    public static long d_off$get(MemorySegment seg) {
        return (long)dirent.d_off$VH.get(seg);
    }
    public static void d_off$set( MemorySegment seg, long x) {
        dirent.d_off$VH.set(seg, x);
    }
    public static long d_off$get(MemorySegment seg, long index) {
        return (long)dirent.d_off$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void d_off$set(MemorySegment seg, long index, long x) {
        dirent.d_off$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle d_reclen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("d_reclen"));
    public static VarHandle d_reclen$VH() {
        return dirent.d_reclen$VH;
    }
    public static short d_reclen$get(MemorySegment seg) {
        return (short)dirent.d_reclen$VH.get(seg);
    }
    public static void d_reclen$set( MemorySegment seg, short x) {
        dirent.d_reclen$VH.set(seg, x);
    }
    public static short d_reclen$get(MemorySegment seg, long index) {
        return (short)dirent.d_reclen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void d_reclen$set(MemorySegment seg, long index, short x) {
        dirent.d_reclen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle d_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("d_type"));
    public static VarHandle d_type$VH() {
        return dirent.d_type$VH;
    }
    public static byte d_type$get(MemorySegment seg) {
        return (byte)dirent.d_type$VH.get(seg);
    }
    public static void d_type$set( MemorySegment seg, byte x) {
        dirent.d_type$VH.set(seg, x);
    }
    public static byte d_type$get(MemorySegment seg, long index) {
        return (byte)dirent.d_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void d_type$set(MemorySegment seg, long index, byte x) {
        dirent.d_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment d_name$slice(MemorySegment seg) {
        return seg.asSlice(19, 256);
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

