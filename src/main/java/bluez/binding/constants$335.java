// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$335 {

    static final FunctionDescriptor pthread_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_exit$MH = RuntimeHelper.downcallHandle(
        "pthread_exit",
        constants$335.pthread_exit$FUNC, false
    );
    static final FunctionDescriptor pthread_join$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_join$MH = RuntimeHelper.downcallHandle(
        "pthread_join",
        constants$335.pthread_join$FUNC, false
    );
    static final FunctionDescriptor pthread_detach$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_detach$MH = RuntimeHelper.downcallHandle(
        "pthread_detach",
        constants$335.pthread_detach$FUNC, false
    );
    static final FunctionDescriptor pthread_self$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pthread_self$MH = RuntimeHelper.downcallHandle(
        "pthread_self",
        constants$335.pthread_self$FUNC, false
    );
    static final FunctionDescriptor pthread_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_equal$MH = RuntimeHelper.downcallHandle(
        "pthread_equal",
        constants$335.pthread_equal$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_init$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_init",
        constants$335.pthread_attr_init$FUNC, false
    );
}

