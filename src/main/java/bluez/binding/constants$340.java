// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$340 {

    static final FunctionDescriptor pthread_once$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_once$MH = RuntimeHelper.downcallHandle(
        "pthread_once",
        constants$340.pthread_once$FUNC, false
    );
    static final FunctionDescriptor pthread_setcancelstate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setcancelstate$MH = RuntimeHelper.downcallHandle(
        "pthread_setcancelstate",
        constants$340.pthread_setcancelstate$FUNC, false
    );
    static final FunctionDescriptor pthread_setcanceltype$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setcanceltype$MH = RuntimeHelper.downcallHandle(
        "pthread_setcanceltype",
        constants$340.pthread_setcanceltype$FUNC, false
    );
    static final FunctionDescriptor pthread_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_cancel$MH = RuntimeHelper.downcallHandle(
        "pthread_cancel",
        constants$340.pthread_cancel$FUNC, false
    );
    static final FunctionDescriptor pthread_testcancel$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_testcancel$MH = RuntimeHelper.downcallHandle(
        "pthread_testcancel",
        constants$340.pthread_testcancel$FUNC, false
    );
    static final FunctionDescriptor __pthread_register_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_register_cancel$MH = RuntimeHelper.downcallHandle(
        "__pthread_register_cancel",
        constants$340.__pthread_register_cancel$FUNC, false
    );
}


