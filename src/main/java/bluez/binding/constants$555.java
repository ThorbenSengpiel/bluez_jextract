// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$555 {

    static final FunctionDescriptor tcsetpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tcsetpgrp$MH = RuntimeHelper.downcallHandle(
        "tcsetpgrp",
        constants$555.tcsetpgrp$FUNC, false
    );
    static final FunctionDescriptor getlogin$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle getlogin$MH = RuntimeHelper.downcallHandle(
        "getlogin",
        constants$555.getlogin$FUNC, false
    );
    static final FunctionDescriptor getlogin_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getlogin_r$MH = RuntimeHelper.downcallHandle(
        "getlogin_r",
        constants$555.getlogin_r$FUNC, false
    );
    static final FunctionDescriptor setlogin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setlogin$MH = RuntimeHelper.downcallHandle(
        "setlogin",
        constants$555.setlogin$FUNC, false
    );
    static final  OfAddress optarg$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle optarg$VH = constants$555.optarg$LAYOUT.varHandle();
    static final MemorySegment optarg$SEGMENT = RuntimeHelper.lookupGlobalVariable("optarg", constants$555.optarg$LAYOUT);
    static final  OfInt optind$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle optind$VH = constants$555.optind$LAYOUT.varHandle();
    static final MemorySegment optind$SEGMENT = RuntimeHelper.lookupGlobalVariable("optind", constants$555.optind$LAYOUT);
}


