// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$173 {

    static final FunctionDescriptor g_main_context_invoke$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_invoke$MH = RuntimeHelper.downcallHandle(
        "g_main_context_invoke",
        constants$173.g_main_context_invoke$FUNC, false
    );
    static final FunctionDescriptor g_steal_fd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_steal_fd$MH = RuntimeHelper.downcallHandle(
        "g_steal_fd",
        constants$173.g_steal_fd$FUNC, false
    );
    static final  GroupLayout g_timeout_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_timeout_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_timeout_funcs", constants$173.g_timeout_funcs$LAYOUT);
    static final  GroupLayout g_child_watch_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_child_watch_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_child_watch_funcs", constants$173.g_child_watch_funcs$LAYOUT);
    static final  GroupLayout g_idle_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_idle_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_idle_funcs", constants$173.g_idle_funcs$LAYOUT);
    static final  GroupLayout g_unix_signal_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_unix_signal_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_unix_signal_funcs", constants$173.g_unix_signal_funcs$LAYOUT);
}

