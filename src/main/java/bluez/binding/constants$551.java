// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$551 {

    static final FunctionDescriptor getegid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getegid$MH = RuntimeHelper.downcallHandle(
        "getegid",
        constants$551.getegid$FUNC, false
    );
    static final FunctionDescriptor getgroups$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getgroups$MH = RuntimeHelper.downcallHandle(
        "getgroups",
        constants$551.getgroups$FUNC, false
    );
    static final FunctionDescriptor setuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setuid$MH = RuntimeHelper.downcallHandle(
        "setuid",
        constants$551.setuid$FUNC, false
    );
    static final FunctionDescriptor setreuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setreuid$MH = RuntimeHelper.downcallHandle(
        "setreuid",
        constants$551.setreuid$FUNC, false
    );
    static final FunctionDescriptor seteuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle seteuid$MH = RuntimeHelper.downcallHandle(
        "seteuid",
        constants$551.seteuid$FUNC, false
    );
    static final FunctionDescriptor setgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setgid$MH = RuntimeHelper.downcallHandle(
        "setgid",
        constants$551.setgid$FUNC, false
    );
}

