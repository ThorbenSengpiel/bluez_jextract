// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GAppLaunchContextClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_display"),
        Constants$root.C_POINTER$LAYOUT.withName("get_startup_notify_id"),
        Constants$root.C_POINTER$LAYOUT.withName("launch_failed"),
        Constants$root.C_POINTER$LAYOUT.withName("launched"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4")
    ).withName("_GAppLaunchContextClass");
    public static MemoryLayout $LAYOUT() {
        return _GAppLaunchContextClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_display$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.get_display$FUNC, false
    );
    public interface get_display {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static NativeSymbol allocate(get_display fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_display.class, fi, _GAppLaunchContextClass.get_display$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_display ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_display::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.get_display$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_display"));
    public static VarHandle get_display$VH() {
        return _GAppLaunchContextClass.get_display$VH;
    }
    public static MemoryAddress get_display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.get_display$VH.get(seg);
    }
    public static void get_display$set( MemorySegment seg, MemoryAddress x) {
        _GAppLaunchContextClass.get_display$VH.set(seg, x);
    }
    public static MemoryAddress get_display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.get_display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_display$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAppLaunchContextClass.get_display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_display get_display (MemorySegment segment, ResourceScope scope) {
        return get_display.ofAddress(get_display$get(segment), scope);
    }
    static final FunctionDescriptor get_startup_notify_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_startup_notify_id$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.get_startup_notify_id$FUNC, false
    );
    public interface get_startup_notify_id {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static NativeSymbol allocate(get_startup_notify_id fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_startup_notify_id.class, fi, _GAppLaunchContextClass.get_startup_notify_id$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_startup_notify_id ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_startup_notify_id::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.get_startup_notify_id$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_startup_notify_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_startup_notify_id"));
    public static VarHandle get_startup_notify_id$VH() {
        return _GAppLaunchContextClass.get_startup_notify_id$VH;
    }
    public static MemoryAddress get_startup_notify_id$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.get_startup_notify_id$VH.get(seg);
    }
    public static void get_startup_notify_id$set( MemorySegment seg, MemoryAddress x) {
        _GAppLaunchContextClass.get_startup_notify_id$VH.set(seg, x);
    }
    public static MemoryAddress get_startup_notify_id$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.get_startup_notify_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_startup_notify_id$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAppLaunchContextClass.get_startup_notify_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_startup_notify_id get_startup_notify_id (MemorySegment segment, ResourceScope scope) {
        return get_startup_notify_id.ofAddress(get_startup_notify_id$get(segment), scope);
    }
    static final FunctionDescriptor launch_failed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle launch_failed$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.launch_failed$FUNC, false
    );
    public interface launch_failed {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static NativeSymbol allocate(launch_failed fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(launch_failed.class, fi, _GAppLaunchContextClass.launch_failed$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static launch_failed ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("launch_failed::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    _GAppLaunchContextClass.launch_failed$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle launch_failed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("launch_failed"));
    public static VarHandle launch_failed$VH() {
        return _GAppLaunchContextClass.launch_failed$VH;
    }
    public static MemoryAddress launch_failed$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.launch_failed$VH.get(seg);
    }
    public static void launch_failed$set( MemorySegment seg, MemoryAddress x) {
        _GAppLaunchContextClass.launch_failed$VH.set(seg, x);
    }
    public static MemoryAddress launch_failed$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.launch_failed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void launch_failed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAppLaunchContextClass.launch_failed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static launch_failed launch_failed (MemorySegment segment, ResourceScope scope) {
        return launch_failed.ofAddress(launch_failed$get(segment), scope);
    }
    static final FunctionDescriptor launched$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle launched$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.launched$FUNC, false
    );
    public interface launched {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static NativeSymbol allocate(launched fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(launched.class, fi, _GAppLaunchContextClass.launched$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static launched ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("launched::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    _GAppLaunchContextClass.launched$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle launched$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("launched"));
    public static VarHandle launched$VH() {
        return _GAppLaunchContextClass.launched$VH;
    }
    public static MemoryAddress launched$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.launched$VH.get(seg);
    }
    public static void launched$set( MemorySegment seg, MemoryAddress x) {
        _GAppLaunchContextClass.launched$VH.set(seg, x);
    }
    public static MemoryAddress launched$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass.launched$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void launched$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAppLaunchContextClass.launched$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static launched launched (MemorySegment segment, ResourceScope scope) {
        return launched.ofAddress(launched$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass._g_reserved1$FUNC, false
    );
    public interface _g_reserved1 {

        void apply();
        static NativeSymbol allocate(_g_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved1.class, fi, _GAppLaunchContextClass._g_reserved1$FUNC, "()V", scope);
        }
        static _g_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GAppLaunchContextClass._g_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GAppLaunchContextClass._g_reserved1$VH;
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass._g_reserved1$VH.get(seg);
    }
    public static void _g_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GAppLaunchContextClass._g_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAppLaunchContextClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass._g_reserved2$FUNC, false
    );
    public interface _g_reserved2 {

        void apply();
        static NativeSymbol allocate(_g_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved2.class, fi, _GAppLaunchContextClass._g_reserved2$FUNC, "()V", scope);
        }
        static _g_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GAppLaunchContextClass._g_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GAppLaunchContextClass._g_reserved2$VH;
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass._g_reserved2$VH.get(seg);
    }
    public static void _g_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GAppLaunchContextClass._g_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAppLaunchContextClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass._g_reserved3$FUNC, false
    );
    public interface _g_reserved3 {

        void apply();
        static NativeSymbol allocate(_g_reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved3.class, fi, _GAppLaunchContextClass._g_reserved3$FUNC, "()V", scope);
        }
        static _g_reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GAppLaunchContextClass._g_reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GAppLaunchContextClass._g_reserved3$VH;
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass._g_reserved3$VH.get(seg);
    }
    public static void _g_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GAppLaunchContextClass._g_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAppLaunchContextClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass._g_reserved4$FUNC, false
    );
    public interface _g_reserved4 {

        void apply();
        static NativeSymbol allocate(_g_reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved4.class, fi, _GAppLaunchContextClass._g_reserved4$FUNC, "()V", scope);
        }
        static _g_reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GAppLaunchContextClass._g_reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"));
    public static VarHandle _g_reserved4$VH() {
        return _GAppLaunchContextClass._g_reserved4$VH;
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass._g_reserved4$VH.get(seg);
    }
    public static void _g_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GAppLaunchContextClass._g_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAppLaunchContextClass._g_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAppLaunchContextClass._g_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
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


