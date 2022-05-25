// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GMountOperationClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("ask_password"),
        Constants$root.C_POINTER$LAYOUT.withName("ask_question"),
        Constants$root.C_POINTER$LAYOUT.withName("reply"),
        Constants$root.C_POINTER$LAYOUT.withName("aborted"),
        Constants$root.C_POINTER$LAYOUT.withName("show_processes"),
        Constants$root.C_POINTER$LAYOUT.withName("show_unmount_progress"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved7"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved8"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved9")
    ).withName("_GMountOperationClass");
    public static MemoryLayout $LAYOUT() {
        return _GMountOperationClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor ask_password$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle ask_password$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass.ask_password$FUNC, false
    );
    public interface ask_password {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, int x4);
        static NativeSymbol allocate(ask_password fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ask_password.class, fi, _GMountOperationClass.ask_password$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
        }
        static ask_password ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("ask_password::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, int x4) -> {
                try {
                    _GMountOperationClass.ask_password$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ask_password$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ask_password"));
    public static VarHandle ask_password$VH() {
        return _GMountOperationClass.ask_password$VH;
    }
    public static MemoryAddress ask_password$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.ask_password$VH.get(seg);
    }
    public static void ask_password$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass.ask_password$VH.set(seg, x);
    }
    public static MemoryAddress ask_password$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.ask_password$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ask_password$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass.ask_password$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ask_password ask_password (MemorySegment segment, ResourceScope scope) {
        return ask_password.ofAddress(ask_password$get(segment), scope);
    }
    static final FunctionDescriptor ask_question$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ask_question$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass.ask_question$FUNC, false
    );
    public interface ask_question {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static NativeSymbol allocate(ask_question fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ask_question.class, fi, _GMountOperationClass.ask_question$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static ask_question ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("ask_question::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    _GMountOperationClass.ask_question$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ask_question$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ask_question"));
    public static VarHandle ask_question$VH() {
        return _GMountOperationClass.ask_question$VH;
    }
    public static MemoryAddress ask_question$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.ask_question$VH.get(seg);
    }
    public static void ask_question$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass.ask_question$VH.set(seg, x);
    }
    public static MemoryAddress ask_question$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.ask_question$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ask_question$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass.ask_question$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ask_question ask_question (MemorySegment segment, ResourceScope scope) {
        return ask_question.ofAddress(ask_question$get(segment), scope);
    }
    static final FunctionDescriptor reply$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle reply$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass.reply$FUNC, false
    );
    public interface reply {

        void apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static NativeSymbol allocate(reply fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reply.class, fi, _GMountOperationClass.reply$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
        }
        static reply ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reply::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    _GMountOperationClass.reply$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reply$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reply"));
    public static VarHandle reply$VH() {
        return _GMountOperationClass.reply$VH;
    }
    public static MemoryAddress reply$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.reply$VH.get(seg);
    }
    public static void reply$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass.reply$VH.set(seg, x);
    }
    public static MemoryAddress reply$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.reply$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reply$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass.reply$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reply reply (MemorySegment segment, ResourceScope scope) {
        return reply.ofAddress(reply$get(segment), scope);
    }
    static final FunctionDescriptor aborted$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle aborted$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass.aborted$FUNC, false
    );
    public interface aborted {

        void apply(jdk.incubator.foreign.MemoryAddress x0);
        static NativeSymbol allocate(aborted fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(aborted.class, fi, _GMountOperationClass.aborted$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static aborted ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("aborted::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    _GMountOperationClass.aborted$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle aborted$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("aborted"));
    public static VarHandle aborted$VH() {
        return _GMountOperationClass.aborted$VH;
    }
    public static MemoryAddress aborted$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.aborted$VH.get(seg);
    }
    public static void aborted$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass.aborted$VH.set(seg, x);
    }
    public static MemoryAddress aborted$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.aborted$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void aborted$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass.aborted$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static aborted aborted (MemorySegment segment, ResourceScope scope) {
        return aborted.ofAddress(aborted$get(segment), scope);
    }
    static final FunctionDescriptor show_processes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle show_processes$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass.show_processes$FUNC, false
    );
    public interface show_processes {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
        static NativeSymbol allocate(show_processes fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(show_processes.class, fi, _GMountOperationClass.show_processes$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static show_processes ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("show_processes::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    _GMountOperationClass.show_processes$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle show_processes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("show_processes"));
    public static VarHandle show_processes$VH() {
        return _GMountOperationClass.show_processes$VH;
    }
    public static MemoryAddress show_processes$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.show_processes$VH.get(seg);
    }
    public static void show_processes$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass.show_processes$VH.set(seg, x);
    }
    public static MemoryAddress show_processes$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.show_processes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void show_processes$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass.show_processes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static show_processes show_processes (MemorySegment segment, ResourceScope scope) {
        return show_processes.ofAddress(show_processes$get(segment), scope);
    }
    static final FunctionDescriptor show_unmount_progress$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle show_unmount_progress$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass.show_unmount_progress$FUNC, false
    );
    public interface show_unmount_progress {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2, long x3);
        static NativeSymbol allocate(show_unmount_progress fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(show_unmount_progress.class, fi, _GMountOperationClass.show_unmount_progress$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJ)V", scope);
        }
        static show_unmount_progress ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("show_unmount_progress::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2, long x3) -> {
                try {
                    _GMountOperationClass.show_unmount_progress$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle show_unmount_progress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("show_unmount_progress"));
    public static VarHandle show_unmount_progress$VH() {
        return _GMountOperationClass.show_unmount_progress$VH;
    }
    public static MemoryAddress show_unmount_progress$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.show_unmount_progress$VH.get(seg);
    }
    public static void show_unmount_progress$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass.show_unmount_progress$VH.set(seg, x);
    }
    public static MemoryAddress show_unmount_progress$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass.show_unmount_progress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void show_unmount_progress$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass.show_unmount_progress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static show_unmount_progress show_unmount_progress (MemorySegment segment, ResourceScope scope) {
        return show_unmount_progress.ofAddress(show_unmount_progress$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved1$FUNC, false
    );
    public interface _g_reserved1 {

        void apply();
        static NativeSymbol allocate(_g_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved1.class, fi, _GMountOperationClass._g_reserved1$FUNC, "()V", scope);
        }
        static _g_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GMountOperationClass._g_reserved1$VH;
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved1$VH.get(seg);
    }
    public static void _g_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved2$FUNC, false
    );
    public interface _g_reserved2 {

        void apply();
        static NativeSymbol allocate(_g_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved2.class, fi, _GMountOperationClass._g_reserved2$FUNC, "()V", scope);
        }
        static _g_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GMountOperationClass._g_reserved2$VH;
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved2$VH.get(seg);
    }
    public static void _g_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved3$FUNC, false
    );
    public interface _g_reserved3 {

        void apply();
        static NativeSymbol allocate(_g_reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved3.class, fi, _GMountOperationClass._g_reserved3$FUNC, "()V", scope);
        }
        static _g_reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GMountOperationClass._g_reserved3$VH;
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved3$VH.get(seg);
    }
    public static void _g_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved4$FUNC, false
    );
    public interface _g_reserved4 {

        void apply();
        static NativeSymbol allocate(_g_reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved4.class, fi, _GMountOperationClass._g_reserved4$FUNC, "()V", scope);
        }
        static _g_reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"));
    public static VarHandle _g_reserved4$VH() {
        return _GMountOperationClass._g_reserved4$VH;
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved4$VH.get(seg);
    }
    public static void _g_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved5$FUNC, false
    );
    public interface _g_reserved5 {

        void apply();
        static NativeSymbol allocate(_g_reserved5 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved5.class, fi, _GMountOperationClass._g_reserved5$FUNC, "()V", scope);
        }
        static _g_reserved5 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved5::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved5$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    public static VarHandle _g_reserved5$VH() {
        return _GMountOperationClass._g_reserved5$VH;
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved5$VH.get(seg);
    }
    public static void _g_reserved5$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved5$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved6$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved6$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved6$FUNC, false
    );
    public interface _g_reserved6 {

        void apply();
        static NativeSymbol allocate(_g_reserved6 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved6.class, fi, _GMountOperationClass._g_reserved6$FUNC, "()V", scope);
        }
        static _g_reserved6 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved6::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved6$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"));
    public static VarHandle _g_reserved6$VH() {
        return _GMountOperationClass._g_reserved6$VH;
    }
    public static MemoryAddress _g_reserved6$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved6$VH.get(seg);
    }
    public static void _g_reserved6$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved6$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved6$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved6$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved6 _g_reserved6 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved6.ofAddress(_g_reserved6$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved7$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved7$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved7$FUNC, false
    );
    public interface _g_reserved7 {

        void apply();
        static NativeSymbol allocate(_g_reserved7 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved7.class, fi, _GMountOperationClass._g_reserved7$FUNC, "()V", scope);
        }
        static _g_reserved7 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved7::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved7$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved7$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved7"));
    public static VarHandle _g_reserved7$VH() {
        return _GMountOperationClass._g_reserved7$VH;
    }
    public static MemoryAddress _g_reserved7$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved7$VH.get(seg);
    }
    public static void _g_reserved7$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved7$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved7$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved7$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved7 _g_reserved7 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved7.ofAddress(_g_reserved7$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved8$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved8$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved8$FUNC, false
    );
    public interface _g_reserved8 {

        void apply();
        static NativeSymbol allocate(_g_reserved8 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved8.class, fi, _GMountOperationClass._g_reserved8$FUNC, "()V", scope);
        }
        static _g_reserved8 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved8::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved8$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved8$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved8"));
    public static VarHandle _g_reserved8$VH() {
        return _GMountOperationClass._g_reserved8$VH;
    }
    public static MemoryAddress _g_reserved8$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved8$VH.get(seg);
    }
    public static void _g_reserved8$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved8$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved8$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved8$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved8$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved8$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved8 _g_reserved8 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved8.ofAddress(_g_reserved8$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved9$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved9$MH = RuntimeHelper.downcallHandle(
        _GMountOperationClass._g_reserved9$FUNC, false
    );
    public interface _g_reserved9 {

        void apply();
        static NativeSymbol allocate(_g_reserved9 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_g_reserved9.class, fi, _GMountOperationClass._g_reserved9$FUNC, "()V", scope);
        }
        static _g_reserved9 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_g_reserved9::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GMountOperationClass._g_reserved9$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved9$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved9"));
    public static VarHandle _g_reserved9$VH() {
        return _GMountOperationClass._g_reserved9$VH;
    }
    public static MemoryAddress _g_reserved9$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved9$VH.get(seg);
    }
    public static void _g_reserved9$set( MemorySegment seg, MemoryAddress x) {
        _GMountOperationClass._g_reserved9$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved9$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMountOperationClass._g_reserved9$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved9$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMountOperationClass._g_reserved9$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved9 _g_reserved9 (MemorySegment segment, ResourceScope scope) {
        return _g_reserved9.ofAddress(_g_reserved9$get(segment), scope);
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


