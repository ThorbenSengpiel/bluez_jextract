// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$41 {

    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        "realloc",
        constants$41.realloc$FUNC, false
    );
    static final FunctionDescriptor reallocarray$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle reallocarray$MH = RuntimeHelper.downcallHandle(
        "reallocarray",
        constants$41.reallocarray$FUNC, false
    );
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle free$MH = RuntimeHelper.downcallHandle(
        "free",
        constants$41.free$FUNC, false
    );
    static final FunctionDescriptor alloca$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle alloca$MH = RuntimeHelper.downcallHandle(
        "alloca",
        constants$41.alloca$FUNC, false
    );
    static final FunctionDescriptor valloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle valloc$MH = RuntimeHelper.downcallHandle(
        "valloc",
        constants$41.valloc$FUNC, false
    );
    static final FunctionDescriptor posix_memalign$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle posix_memalign$MH = RuntimeHelper.downcallHandle(
        "posix_memalign",
        constants$41.posix_memalign$FUNC, false
    );
}


