// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$339 {

    static final FunctionDescriptor pthread_attr_setstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_attr_setstack$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setstack",
        constants$339.pthread_attr_setstack$FUNC, false
    );
    static final FunctionDescriptor pthread_setschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_setschedparam",
        constants$339.pthread_setschedparam$FUNC, false
    );
    static final FunctionDescriptor pthread_getschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_getschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_getschedparam",
        constants$339.pthread_getschedparam$FUNC, false
    );
    static final FunctionDescriptor pthread_setschedprio$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_setschedprio$MH = RuntimeHelper.downcallHandle(
        "pthread_setschedprio",
        constants$339.pthread_setschedprio$FUNC, false
    );
    static final FunctionDescriptor pthread_once$__init_routine$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_once$__init_routine$MH = RuntimeHelper.downcallHandle(
        constants$339.pthread_once$__init_routine$FUNC, false
    );
}


