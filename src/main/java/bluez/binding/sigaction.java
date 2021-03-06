// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sigaction {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("sa_handler"),
            Constants$root.C_POINTER$LAYOUT.withName("sa_sigaction")
        ).withName("__sigaction_handler"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_LONG_LONG$LAYOUT).withName("__val")
        ).withName("sa_mask"),
        Constants$root.C_INT$LAYOUT.withName("sa_flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("sa_restorer")
    ).withName("sigaction");
    public static MemoryLayout $LAYOUT() {
        return sigaction.$struct$LAYOUT;
    }
    public static class __sigaction_handler {

        static final  GroupLayout __sigaction_handler$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("sa_handler"),
            Constants$root.C_POINTER$LAYOUT.withName("sa_sigaction")
        );
        public static MemoryLayout $LAYOUT() {
            return __sigaction_handler.__sigaction_handler$union$LAYOUT;
        }
        static final VarHandle sa_handler$VH = __sigaction_handler$union$LAYOUT.varHandle(PathElement.groupElement("sa_handler"));
        public static VarHandle sa_handler$VH() {
            return __sigaction_handler.sa_handler$VH;
        }
        public static MemoryAddress sa_handler$get(MemorySegment seg) {
            return (MemoryAddress)__sigaction_handler.sa_handler$VH.get(seg);
        }
        public static void sa_handler$set( MemorySegment seg, MemoryAddress x) {
            __sigaction_handler.sa_handler$VH.set(seg, x);
        }
        public static MemoryAddress sa_handler$get(MemorySegment seg, long index) {
            return (MemoryAddress)__sigaction_handler.sa_handler$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void sa_handler$set(MemorySegment seg, long index, MemoryAddress x) {
            __sigaction_handler.sa_handler$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static __sighandler_t sa_handler (MemorySegment segment, ResourceScope scope) {
            return __sighandler_t.ofAddress(sa_handler$get(segment), scope);
        }
        static final FunctionDescriptor sa_sigaction$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
        );
        static final MethodHandle sa_sigaction$MH = RuntimeHelper.downcallHandle(
            __sigaction_handler.sa_sigaction$FUNC, false
        );
        public interface sa_sigaction {

            void apply(int _x0, MemoryAddress _x1, MemoryAddress _x2);
            static NativeSymbol allocate(sa_sigaction fi, ResourceScope scope) {
                return RuntimeHelper.upcallStub(sa_sigaction.class, fi, __sigaction_handler.sa_sigaction$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
            }
            static sa_sigaction ofAddress(MemoryAddress addr, ResourceScope scope) {
                NativeSymbol symbol = NativeSymbol.ofAddress("sa_sigaction::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int __x0, MemoryAddress __x1, MemoryAddress __x2) -> {
                    try {
                        __sigaction_handler.sa_sigaction$MH.invokeExact(symbol, __x0, (Addressable)__x1, (Addressable)__x2);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }
        }

        static final VarHandle sa_sigaction$VH = __sigaction_handler$union$LAYOUT.varHandle(PathElement.groupElement("sa_sigaction"));
        public static VarHandle sa_sigaction$VH() {
            return __sigaction_handler.sa_sigaction$VH;
        }
        public static MemoryAddress sa_sigaction$get(MemorySegment seg) {
            return (MemoryAddress)__sigaction_handler.sa_sigaction$VH.get(seg);
        }
        public static void sa_sigaction$set( MemorySegment seg, MemoryAddress x) {
            __sigaction_handler.sa_sigaction$VH.set(seg, x);
        }
        public static MemoryAddress sa_sigaction$get(MemorySegment seg, long index) {
            return (MemoryAddress)__sigaction_handler.sa_sigaction$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void sa_sigaction$set(MemorySegment seg, long index, MemoryAddress x) {
            __sigaction_handler.sa_sigaction$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static sa_sigaction sa_sigaction (MemorySegment segment, ResourceScope scope) {
            return sa_sigaction.ofAddress(sa_sigaction$get(segment), scope);
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

    public static MemorySegment __sigaction_handler$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment sa_mask$slice(MemorySegment seg) {
        return seg.asSlice(8, 128);
    }
    static final VarHandle sa_flags$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sa_flags"));
    public static VarHandle sa_flags$VH() {
        return sigaction.sa_flags$VH;
    }
    public static int sa_flags$get(MemorySegment seg) {
        return (int)sigaction.sa_flags$VH.get(seg);
    }
    public static void sa_flags$set( MemorySegment seg, int x) {
        sigaction.sa_flags$VH.set(seg, x);
    }
    public static int sa_flags$get(MemorySegment seg, long index) {
        return (int)sigaction.sa_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_flags$set(MemorySegment seg, long index, int x) {
        sigaction.sa_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor sa_restorer$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle sa_restorer$MH = RuntimeHelper.downcallHandle(
        sigaction.sa_restorer$FUNC, false
    );
    public interface sa_restorer {

        void apply();
        static NativeSymbol allocate(sa_restorer fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(sa_restorer.class, fi, sigaction.sa_restorer$FUNC, "()V", scope);
        }
        static sa_restorer ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("sa_restorer::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    sigaction.sa_restorer$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle sa_restorer$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sa_restorer"));
    public static VarHandle sa_restorer$VH() {
        return sigaction.sa_restorer$VH;
    }
    public static MemoryAddress sa_restorer$get(MemorySegment seg) {
        return (MemoryAddress)sigaction.sa_restorer$VH.get(seg);
    }
    public static void sa_restorer$set( MemorySegment seg, MemoryAddress x) {
        sigaction.sa_restorer$VH.set(seg, x);
    }
    public static MemoryAddress sa_restorer$get(MemorySegment seg, long index) {
        return (MemoryAddress)sigaction.sa_restorer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_restorer$set(MemorySegment seg, long index, MemoryAddress x) {
        sigaction.sa_restorer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static sa_restorer sa_restorer (MemorySegment segment, ResourceScope scope) {
        return sa_restorer.ofAddress(sa_restorer$get(segment), scope);
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


