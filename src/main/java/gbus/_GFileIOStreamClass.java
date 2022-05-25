// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GFileIOStreamClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            Constants$root.C_POINTER$LAYOUT.withName("get_input_stream"),
            Constants$root.C_POINTER$LAYOUT.withName("get_output_stream"),
            Constants$root.C_POINTER$LAYOUT.withName("close_fn"),
            Constants$root.C_POINTER$LAYOUT.withName("close_async"),
            Constants$root.C_POINTER$LAYOUT.withName("close_finish"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved7"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved8"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved9"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved10")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("tell"),
        Constants$root.C_POINTER$LAYOUT.withName("can_seek"),
        Constants$root.C_POINTER$LAYOUT.withName("seek"),
        Constants$root.C_POINTER$LAYOUT.withName("can_truncate"),
        Constants$root.C_POINTER$LAYOUT.withName("truncate_fn"),
        Constants$root.C_POINTER$LAYOUT.withName("query_info"),
        Constants$root.C_POINTER$LAYOUT.withName("query_info_async"),
        Constants$root.C_POINTER$LAYOUT.withName("query_info_finish"),
        Constants$root.C_POINTER$LAYOUT.withName("get_etag"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5")
    ).withName("_GFileIOStreamClass");
    public static MemoryLayout $LAYOUT() {
        return _GFileIOStreamClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 256);
    }
    static final FunctionDescriptor tell$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tell$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.tell$FUNC, false
    );
    public interface tell {

        long apply(jdk.incubator.foreign.MemoryAddress x0);
        static NativeSymbol allocate(tell fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(tell.class, fi, _GFileIOStreamClass.tell$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)J", scope);
        }
        static tell ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("tell::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (long)_GFileIOStreamClass.tell$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle tell$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tell"));
    public static VarHandle tell$VH() {
        return _GFileIOStreamClass.tell$VH;
    }
    public static MemoryAddress tell$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.tell$VH.get(seg);
    }
    public static void tell$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.tell$VH.set(seg, x);
    }
    public static MemoryAddress tell$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.tell$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tell$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.tell$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static tell tell (MemorySegment segment, ResourceScope scope) {
        return tell.ofAddress(tell$get(segment), scope);
    }
    static final FunctionDescriptor can_seek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_seek$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.can_seek$FUNC, false
    );
    public interface can_seek {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static NativeSymbol allocate(can_seek fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(can_seek.class, fi, _GFileIOStreamClass.can_seek$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static can_seek ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("can_seek::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)_GFileIOStreamClass.can_seek$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_seek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_seek"));
    public static VarHandle can_seek$VH() {
        return _GFileIOStreamClass.can_seek$VH;
    }
    public static MemoryAddress can_seek$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.can_seek$VH.get(seg);
    }
    public static void can_seek$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.can_seek$VH.set(seg, x);
    }
    public static MemoryAddress can_seek$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.can_seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_seek$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.can_seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_seek can_seek (MemorySegment segment, ResourceScope scope) {
        return can_seek.ofAddress(can_seek$get(segment), scope);
    }
    static final FunctionDescriptor seek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle seek$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.seek$FUNC, false
    );
    public interface seek {

        int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static NativeSymbol allocate(seek fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(seek.class, fi, _GFileIOStreamClass.seek$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static seek ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("seek::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, long x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)_GFileIOStreamClass.seek$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1, x2, (jdk.incubator.foreign.Addressable)x3, (jdk.incubator.foreign.Addressable)x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle seek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("seek"));
    public static VarHandle seek$VH() {
        return _GFileIOStreamClass.seek$VH;
    }
    public static MemoryAddress seek$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.seek$VH.get(seg);
    }
    public static void seek$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.seek$VH.set(seg, x);
    }
    public static MemoryAddress seek$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void seek$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static seek seek (MemorySegment segment, ResourceScope scope) {
        return seek.ofAddress(seek$get(segment), scope);
    }
    static final FunctionDescriptor can_truncate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_truncate$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.can_truncate$FUNC, false
    );
    public interface can_truncate {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static NativeSymbol allocate(can_truncate fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(can_truncate.class, fi, _GFileIOStreamClass.can_truncate$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static can_truncate ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("can_truncate::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)_GFileIOStreamClass.can_truncate$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_truncate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_truncate"));
    public static VarHandle can_truncate$VH() {
        return _GFileIOStreamClass.can_truncate$VH;
    }
    public static MemoryAddress can_truncate$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.can_truncate$VH.get(seg);
    }
    public static void can_truncate$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.can_truncate$VH.set(seg, x);
    }
    public static MemoryAddress can_truncate$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.can_truncate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_truncate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.can_truncate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_truncate can_truncate (MemorySegment segment, ResourceScope scope) {
        return can_truncate.ofAddress(can_truncate$get(segment), scope);
    }
    static final FunctionDescriptor truncate_fn$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle truncate_fn$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.truncate_fn$FUNC, false
    );
    public interface truncate_fn {

        int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
        static NativeSymbol allocate(truncate_fn fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(truncate_fn.class, fi, _GFileIOStreamClass.truncate_fn$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static truncate_fn ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("truncate_fn::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, long x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)_GFileIOStreamClass.truncate_fn$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle truncate_fn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("truncate_fn"));
    public static VarHandle truncate_fn$VH() {
        return _GFileIOStreamClass.truncate_fn$VH;
    }
    public static MemoryAddress truncate_fn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.truncate_fn$VH.get(seg);
    }
    public static void truncate_fn$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.truncate_fn$VH.set(seg, x);
    }
    public static MemoryAddress truncate_fn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.truncate_fn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void truncate_fn$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.truncate_fn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static truncate_fn truncate_fn (MemorySegment segment, ResourceScope scope) {
        return truncate_fn.ofAddress(truncate_fn$get(segment), scope);
    }
    static final FunctionDescriptor query_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle query_info$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.query_info$FUNC, false
    );
    public interface query_info {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
        static NativeSymbol allocate(query_info fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(query_info.class, fi, _GFileIOStreamClass.query_info$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static query_info ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("query_info::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.query_info$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle query_info$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("query_info"));
    public static VarHandle query_info$VH() {
        return _GFileIOStreamClass.query_info$VH;
    }
    public static MemoryAddress query_info$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.query_info$VH.get(seg);
    }
    public static void query_info$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.query_info$VH.set(seg, x);
    }
    public static MemoryAddress query_info$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.query_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void query_info$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.query_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static query_info query_info (MemorySegment segment, ResourceScope scope) {
        return query_info.ofAddress(query_info$get(segment), scope);
    }
    static final FunctionDescriptor query_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle query_info_async$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.query_info_async$FUNC, false
    );
    public interface query_info_async {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
        static NativeSymbol allocate(query_info_async fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(query_info_async.class, fi, _GFileIOStreamClass.query_info_async$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static query_info_async ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("query_info_async::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
                try {
                    _GFileIOStreamClass.query_info_async$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, x2, (jdk.incubator.foreign.Addressable)x3, (jdk.incubator.foreign.Addressable)x4, (jdk.incubator.foreign.Addressable)x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle query_info_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("query_info_async"));
    public static VarHandle query_info_async$VH() {
        return _GFileIOStreamClass.query_info_async$VH;
    }
    public static MemoryAddress query_info_async$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.query_info_async$VH.get(seg);
    }
    public static void query_info_async$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.query_info_async$VH.set(seg, x);
    }
    public static MemoryAddress query_info_async$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.query_info_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void query_info_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.query_info_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static query_info_async query_info_async (MemorySegment segment, ResourceScope scope) {
        return query_info_async.ofAddress(query_info_async$get(segment), scope);
    }
    static final FunctionDescriptor query_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle query_info_finish$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.query_info_finish$FUNC, false
    );
    public interface query_info_finish {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static NativeSymbol allocate(query_info_finish fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(query_info_finish.class, fi, _GFileIOStreamClass.query_info_finish$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static query_info_finish ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("query_info_finish::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.query_info_finish$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle query_info_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"));
    public static VarHandle query_info_finish$VH() {
        return _GFileIOStreamClass.query_info_finish$VH;
    }
    public static MemoryAddress query_info_finish$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.query_info_finish$VH.get(seg);
    }
    public static void query_info_finish$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.query_info_finish$VH.set(seg, x);
    }
    public static MemoryAddress query_info_finish$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.query_info_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void query_info_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.query_info_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static query_info_finish query_info_finish (MemorySegment segment, ResourceScope scope) {
        return query_info_finish.ofAddress(query_info_finish$get(segment), scope);
    }
    static final FunctionDescriptor get_etag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_etag$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass.get_etag$FUNC, false
    );
    public interface get_etag {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0);
        static NativeSymbol allocate(get_etag fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_etag.class, fi, _GFileIOStreamClass.get_etag$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_etag ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_etag::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.get_etag$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_etag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_etag"));
    public static VarHandle get_etag$VH() {
        return _GFileIOStreamClass.get_etag$VH;
    }
    public static MemoryAddress get_etag$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.get_etag$VH.get(seg);
    }
    public static void get_etag$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass.get_etag$VH.set(seg, x);
    }
    public static MemoryAddress get_etag$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass.get_etag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_etag$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass.get_etag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_etag get_etag (MemorySegment segment, ResourceScope scope) {
        return get_etag.ofAddress(get_etag$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass._g_reserved1$FUNC, false
    );
    public interface _g_reserved1 {

        void apply();
        static NativeSymbol allocate(_g_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved1.class, fi, _GFileIOStreamClass._g_reserved1$FUNC, "()V", scope);
        }
        static _g_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GFileIOStreamClass._g_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GFileIOStreamClass._g_reserved1$VH;
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved1$VH.get(seg);
    }
    public static void _g_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass._g_reserved2$FUNC, false
    );
    public interface _g_reserved2 {

        void apply();
        static NativeSymbol allocate(_g_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved2.class, fi, _GFileIOStreamClass._g_reserved2$FUNC, "()V", scope);
        }
        static _g_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GFileIOStreamClass._g_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GFileIOStreamClass._g_reserved2$VH;
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved2$VH.get(seg);
    }
    public static void _g_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass._g_reserved3$FUNC, false
    );
    public interface _g_reserved3 {

        void apply();
        static NativeSymbol allocate(_g_reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved3.class, fi, _GFileIOStreamClass._g_reserved3$FUNC, "()V", scope);
        }
        static _g_reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GFileIOStreamClass._g_reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GFileIOStreamClass._g_reserved3$VH;
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved3$VH.get(seg);
    }
    public static void _g_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass._g_reserved4$FUNC, false
    );
    public interface _g_reserved4 {

        void apply();
        static NativeSymbol allocate(_g_reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved4.class, fi, _GFileIOStreamClass._g_reserved4$FUNC, "()V", scope);
        }
        static _g_reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GFileIOStreamClass._g_reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"));
    public static VarHandle _g_reserved4$VH() {
        return _GFileIOStreamClass._g_reserved4$VH;
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved4$VH.get(seg);
    }
    public static void _g_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5$MH = RuntimeHelper.downcallHandle(
        _GFileIOStreamClass._g_reserved5$FUNC, false
    );
    public interface _g_reserved5 {

        void apply();
        static NativeSymbol allocate(_g_reserved5 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved5.class, fi, _GFileIOStreamClass._g_reserved5$FUNC, "()V", scope);
        }
        static _g_reserved5 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved5::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GFileIOStreamClass._g_reserved5$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    public static VarHandle _g_reserved5$VH() {
        return _GFileIOStreamClass._g_reserved5$VH;
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved5$VH.get(seg);
    }
    public static void _g_reserved5$set( MemorySegment seg, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved5$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GFileIOStreamClass._g_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileIOStreamClass._g_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
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


