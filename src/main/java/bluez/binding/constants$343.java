// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$343 {

    static final FunctionDescriptor pthread_mutexattr_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_init$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_init",
        constants$343.pthread_mutexattr_init$FUNC, false
    );
    static final FunctionDescriptor pthread_mutexattr_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_destroy",
        constants$343.pthread_mutexattr_destroy$FUNC, false
    );
    static final FunctionDescriptor pthread_mutexattr_getpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_getpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_getpshared",
        constants$343.pthread_mutexattr_getpshared$FUNC, false
    );
    static final FunctionDescriptor pthread_mutexattr_setpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_setpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_setpshared",
        constants$343.pthread_mutexattr_setpshared$FUNC, false
    );
    static final FunctionDescriptor pthread_mutexattr_gettype$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_gettype$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_gettype",
        constants$343.pthread_mutexattr_gettype$FUNC, false
    );
    static final FunctionDescriptor pthread_mutexattr_settype$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_settype$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_settype",
        constants$343.pthread_mutexattr_settype$FUNC, false
    );
}


