// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class mcontext_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(23, Constants$root.C_LONG_LONG$LAYOUT).withName("gregs"),
        Constants$root.C_POINTER$LAYOUT.withName("fpregs"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_LONG_LONG$LAYOUT).withName("__reserved1")
    );
    public static MemoryLayout $LAYOUT() {
        return mcontext_t.$struct$LAYOUT;
    }
    public static MemorySegment gregs$slice(MemorySegment seg) {
        return seg.asSlice(0, 184);
    }
    static final VarHandle fpregs$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("fpregs"));
    public static VarHandle fpregs$VH() {
        return mcontext_t.fpregs$VH;
    }
    public static MemoryAddress fpregs$get(MemorySegment seg) {
        return (MemoryAddress)mcontext_t.fpregs$VH.get(seg);
    }
    public static void fpregs$set( MemorySegment seg, MemoryAddress x) {
        mcontext_t.fpregs$VH.set(seg, x);
    }
    public static MemoryAddress fpregs$get(MemorySegment seg, long index) {
        return (MemoryAddress)mcontext_t.fpregs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fpregs$set(MemorySegment seg, long index, MemoryAddress x) {
        mcontext_t.fpregs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __reserved1$slice(MemorySegment seg) {
        return seg.asSlice(192, 64);
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


