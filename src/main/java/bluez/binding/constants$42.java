// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor aligned_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle aligned_alloc$MH = RuntimeHelper.downcallHandle(
        "aligned_alloc",
        constants$42.aligned_alloc$FUNC, false
    );
    static final FunctionDescriptor abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle abort$MH = RuntimeHelper.downcallHandle(
        "abort",
        constants$42.abort$FUNC, false
    );
    static final FunctionDescriptor atexit$__func$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$__func$MH = RuntimeHelper.downcallHandle(
        constants$42.atexit$__func$FUNC, false
    );
    static final FunctionDescriptor atexit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atexit$MH = RuntimeHelper.downcallHandle(
        "atexit",
        constants$42.atexit$FUNC, false
    );
    static final FunctionDescriptor at_quick_exit$__func$FUNC = FunctionDescriptor.ofVoid();
}

