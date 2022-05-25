// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GDBusObjectManagerClientClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("interface_proxy_signal"),
        Constants$root.C_POINTER$LAYOUT.withName("interface_proxy_properties_changed"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GDBusObjectManagerClientClass");
    public static MemoryLayout $LAYOUT() {
        return _GDBusObjectManagerClientClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor interface_proxy_signal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_proxy_signal$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerClientClass.interface_proxy_signal$FUNC, false
    );
    public interface interface_proxy_signal {

        void apply(MemoryAddress _x0, MemoryAddress _x1, MemoryAddress _x2, MemoryAddress _x3, MemoryAddress _x4, MemoryAddress _x5);
        static NativeSymbol allocate(interface_proxy_signal fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(interface_proxy_signal.class, fi, _GDBusObjectManagerClientClass.interface_proxy_signal$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static interface_proxy_signal ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("interface_proxy_signal::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, MemoryAddress __x2, MemoryAddress __x3, MemoryAddress __x4, MemoryAddress __x5) -> {
                try {
                    _GDBusObjectManagerClientClass.interface_proxy_signal$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, (Addressable)__x2, (Addressable)__x3, (Addressable)__x4, (Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle interface_proxy_signal$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("interface_proxy_signal"));
    public static VarHandle interface_proxy_signal$VH() {
        return _GDBusObjectManagerClientClass.interface_proxy_signal$VH;
    }
    public static MemoryAddress interface_proxy_signal$get(MemorySegment seg) {
        return (MemoryAddress)_GDBusObjectManagerClientClass.interface_proxy_signal$VH.get(seg);
    }
    public static void interface_proxy_signal$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerClientClass.interface_proxy_signal$VH.set(seg, x);
    }
    public static MemoryAddress interface_proxy_signal$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDBusObjectManagerClientClass.interface_proxy_signal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_proxy_signal$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerClientClass.interface_proxy_signal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_proxy_signal interface_proxy_signal (MemorySegment segment, ResourceScope scope) {
        return interface_proxy_signal.ofAddress(interface_proxy_signal$get(segment), scope);
    }
    static final FunctionDescriptor interface_proxy_properties_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_proxy_properties_changed$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerClientClass.interface_proxy_properties_changed$FUNC, false
    );
    public interface interface_proxy_properties_changed {

        void apply(MemoryAddress _x0, MemoryAddress _x1, MemoryAddress _x2, MemoryAddress _x3, MemoryAddress _x4);
        static NativeSymbol allocate(interface_proxy_properties_changed fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(interface_proxy_properties_changed.class, fi, _GDBusObjectManagerClientClass.interface_proxy_properties_changed$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static interface_proxy_properties_changed ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("interface_proxy_properties_changed::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (MemoryAddress __x0, MemoryAddress __x1, MemoryAddress __x2, MemoryAddress __x3, MemoryAddress __x4) -> {
                try {
                    _GDBusObjectManagerClientClass.interface_proxy_properties_changed$MH.invokeExact(symbol, (Addressable)__x0, (Addressable)__x1, (Addressable)__x2, (Addressable)__x3, (Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle interface_proxy_properties_changed$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("interface_proxy_properties_changed"));
    public static VarHandle interface_proxy_properties_changed$VH() {
        return _GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH;
    }
    public static MemoryAddress interface_proxy_properties_changed$get(MemorySegment seg) {
        return (MemoryAddress)_GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH.get(seg);
    }
    public static void interface_proxy_properties_changed$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH.set(seg, x);
    }
    public static MemoryAddress interface_proxy_properties_changed$get(MemorySegment seg, long index) {
        return (MemoryAddress)_GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_proxy_properties_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_proxy_properties_changed interface_proxy_properties_changed (MemorySegment segment, ResourceScope scope) {
        return interface_proxy_properties_changed.ofAddress(interface_proxy_properties_changed$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(152, 64);
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

