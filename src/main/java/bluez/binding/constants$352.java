// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$352 {

    static final FunctionDescriptor pthread_key_delete$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_key_delete$MH = RuntimeHelper.downcallHandle(
        "pthread_key_delete",
        constants$352.pthread_key_delete$FUNC, false
    );
    static final FunctionDescriptor pthread_getspecific$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_getspecific$MH = RuntimeHelper.downcallHandle(
        "pthread_getspecific",
        constants$352.pthread_getspecific$FUNC, false
    );
    static final FunctionDescriptor pthread_setspecific$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setspecific$MH = RuntimeHelper.downcallHandle(
        "pthread_setspecific",
        constants$352.pthread_setspecific$FUNC, false
    );
    static final FunctionDescriptor pthread_getcpuclockid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_getcpuclockid$MH = RuntimeHelper.downcallHandle(
        "pthread_getcpuclockid",
        constants$352.pthread_getcpuclockid$FUNC, false
    );
    static final FunctionDescriptor pthread_atfork$__prepare$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__prepare$MH = RuntimeHelper.downcallHandle(
        constants$352.pthread_atfork$__prepare$FUNC, false
    );
}


