// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$121 {

    static final FunctionDescriptor g_mem_is_system_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_mem_is_system_malloc$MH = RuntimeHelper.downcallHandle(
        "g_mem_is_system_malloc",
        constants$121.g_mem_is_system_malloc$FUNC, false
    );
    static final  OfInt g_mem_gc_friendly$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle g_mem_gc_friendly$VH = constants$121.g_mem_gc_friendly$LAYOUT.varHandle();
    static final MemorySegment g_mem_gc_friendly$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_mem_gc_friendly", constants$121.g_mem_gc_friendly$LAYOUT);
    static final  OfAddress glib_mem_profiler_table$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle glib_mem_profiler_table$VH = constants$121.glib_mem_profiler_table$LAYOUT.varHandle();
    static final MemorySegment glib_mem_profiler_table$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_mem_profiler_table", constants$121.glib_mem_profiler_table$LAYOUT);
    static final FunctionDescriptor g_mem_profile$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_mem_profile$MH = RuntimeHelper.downcallHandle(
        "g_mem_profile",
        constants$121.g_mem_profile$FUNC, false
    );
    static final FunctionDescriptor GNodeTraverseFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GNodeTraverseFunc$MH = RuntimeHelper.downcallHandle(
        constants$121.GNodeTraverseFunc$FUNC, false
    );
}

