// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor clearenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle clearenv$MH = RuntimeHelper.downcallHandle(
        "clearenv",
        constants$45.clearenv$FUNC, false
    );
    static final FunctionDescriptor mktemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mktemp$MH = RuntimeHelper.downcallHandle(
        "mktemp",
        constants$45.mktemp$FUNC, false
    );
    static final FunctionDescriptor mkstemp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mkstemp$MH = RuntimeHelper.downcallHandle(
        "mkstemp",
        constants$45.mkstemp$FUNC, false
    );
    static final FunctionDescriptor mkstemps$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mkstemps$MH = RuntimeHelper.downcallHandle(
        "mkstemps",
        constants$45.mkstemps$FUNC, false
    );
    static final FunctionDescriptor mkdtemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mkdtemp$MH = RuntimeHelper.downcallHandle(
        "mkdtemp",
        constants$45.mkdtemp$FUNC, false
    );
    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        "system",
        constants$45.system$FUNC, false
    );
}


