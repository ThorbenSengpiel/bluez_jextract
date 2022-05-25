// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GDBusInterfaceSkeletonClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_info"),
        Constants$root.C_POINTER$LAYOUT.withName("get_vtable"),
        Constants$root.C_POINTER$LAYOUT.withName("get_properties"),
        Constants$root.C_POINTER$LAYOUT.withName("flush"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("vfunc_padding"),
        Constants$root.C_POINTER$LAYOUT.withName("g_authorize_method"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("signal_padding")
    ).withName("_GDBusInterfaceSkeletonClass");
    public static MemoryLayout $LAYOUT() {
        return _GDBusInterfaceSkeletonClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_info$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.get_info$FUNC, false
    );
    public interface get_info {

        Addressable apply(MemoryAddress _x0);
        static NativeSymbol allocate(get_info fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_info.class, fi, _GDBusInterfaceSkeletonClass.get_info$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_info ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_info::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (Addressable)(MemoryAddress)_GDBusInterfaceSkeletonClass.get_info$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_info$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("get_info"));
    public static VarHandle get_info$VH() {
        return _GDBusInterfaceSkeletonClass.get_info$VH;
    }
    public static MemoryAddress get_info$get(MemorySegment seg) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.get_info$VH.get(seg);
    }
    public static void get_info$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_info$VH.set(seg, x);
    }
    public static MemoryAddress get_info$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.get_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_info$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_info get_info (MemorySegment segment, ResourceScope scope) {
        return get_info.ofAddress(get_info$get(segment), scope);
    }
    static final FunctionDescriptor get_vtable$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_vtable$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.get_vtable$FUNC, false
    );
    public interface get_vtable {

        Addressable apply(MemoryAddress _x0);
        static NativeSymbol allocate(get_vtable fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_vtable.class, fi, _GDBusInterfaceSkeletonClass.get_vtable$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_vtable ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_vtable::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (Addressable)(MemoryAddress)_GDBusInterfaceSkeletonClass.get_vtable$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_vtable$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("get_vtable"));
    public static VarHandle get_vtable$VH() {
        return _GDBusInterfaceSkeletonClass.get_vtable$VH;
    }
    public static MemoryAddress get_vtable$get(MemorySegment seg) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.get_vtable$VH.get(seg);
    }
    public static void get_vtable$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_vtable$VH.set(seg, x);
    }
    public static MemoryAddress get_vtable$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.get_vtable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_vtable$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_vtable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_vtable get_vtable (MemorySegment segment, ResourceScope scope) {
        return get_vtable.ofAddress(get_vtable$get(segment), scope);
    }
    static final FunctionDescriptor get_properties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_properties$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.get_properties$FUNC, false
    );
    public interface get_properties {

        Addressable apply(MemoryAddress _x0);
        static NativeSymbol allocate(get_properties fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_properties.class, fi, _GDBusInterfaceSkeletonClass.get_properties$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_properties ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_properties::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    return (Addressable)(MemoryAddress)_GDBusInterfaceSkeletonClass.get_properties$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_properties$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("get_properties"));
    public static VarHandle get_properties$VH() {
        return _GDBusInterfaceSkeletonClass.get_properties$VH;
    }
    public static MemoryAddress get_properties$get(MemorySegment seg) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.get_properties$VH.get(seg);
    }
    public static void get_properties$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_properties$VH.set(seg, x);
    }
    public static MemoryAddress get_properties$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.get_properties$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_properties$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_properties$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_properties get_properties (MemorySegment segment, ResourceScope scope) {
        return get_properties.ofAddress(get_properties$get(segment), scope);
    }
    static final FunctionDescriptor flush$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle flush$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.flush$FUNC, false
    );
    public interface flush {

        void apply(MemoryAddress _x0);
        static NativeSymbol allocate(flush fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(flush.class, fi, _GDBusInterfaceSkeletonClass.flush$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static flush ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("flush::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0) -> {
                try {
                    _GDBusInterfaceSkeletonClass.flush$MH.invokeExact(symbol, (Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle flush$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("flush"));
    public static VarHandle flush$VH() {
        return _GDBusInterfaceSkeletonClass.flush$VH;
    }
    public static MemoryAddress flush$get(MemorySegment seg) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.flush$VH.get(seg);
    }
    public static void flush$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.flush$VH.set(seg, x);
    }
    public static MemoryAddress flush$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.flush$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flush$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.flush$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static flush flush (MemorySegment segment, ResourceScope scope) {
        return flush.ofAddress(flush$get(segment), scope);
    }
    public static MemorySegment vfunc_padding$slice(MemorySegment seg) {
        return seg.asSlice(168, 64);
    }
    static final FunctionDescriptor g_authorize_method$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_authorize_method$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.g_authorize_method$FUNC, false
    );
    public interface g_authorize_method {

        int apply(MemoryAddress _x0, MemoryAddress _x1);
        static NativeSymbol allocate(g_authorize_method fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(g_authorize_method.class, fi, _GDBusInterfaceSkeletonClass.g_authorize_method$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static g_authorize_method ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("g_authorize_method::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1) -> {
                try {
                    return (int)_GDBusInterfaceSkeletonClass.g_authorize_method$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle g_authorize_method$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("g_authorize_method"));
    public static VarHandle g_authorize_method$VH() {
        return _GDBusInterfaceSkeletonClass.g_authorize_method$VH;
    }
    public static MemoryAddress g_authorize_method$get(MemorySegment seg) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.g_authorize_method$VH.get(seg);
    }
    public static void g_authorize_method$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.g_authorize_method$VH.set(seg, x);
    }
    public static MemoryAddress g_authorize_method$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDBusInterfaceSkeletonClass.g_authorize_method$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void g_authorize_method$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.g_authorize_method$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static g_authorize_method g_authorize_method (MemorySegment segment, ResourceScope scope) {
        return g_authorize_method.ofAddress(g_authorize_method$get(segment), scope);
    }
    public static MemorySegment signal_padding$slice(MemorySegment seg) {
        return seg.asSlice(240, 64);
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

