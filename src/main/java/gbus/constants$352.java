// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$352 {

    static final FunctionDescriptor pthread_attr_setdetachstate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_attr_setdetachstate$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setdetachstate",
        constants$352.pthread_attr_setdetachstate$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_getguardsize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getguardsize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getguardsize",
        constants$352.pthread_attr_getguardsize$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_setguardsize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_attr_setguardsize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setguardsize",
        constants$352.pthread_attr_setguardsize$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_getschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getschedparam",
        constants$352.pthread_attr_getschedparam$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_setschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_setschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setschedparam",
        constants$352.pthread_attr_setschedparam$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_getschedpolicy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getschedpolicy$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getschedpolicy",
        constants$352.pthread_attr_getschedpolicy$FUNC, false
    );
}


