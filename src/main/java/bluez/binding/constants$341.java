// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$341 {

    static final FunctionDescriptor __pthread_unregister_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_unregister_cancel$MH = RuntimeHelper.downcallHandle(
        "__pthread_unregister_cancel",
        constants$341.__pthread_unregister_cancel$FUNC, false
    );
    static final FunctionDescriptor __pthread_unwind_next$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_unwind_next$MH = RuntimeHelper.downcallHandle(
        "__pthread_unwind_next",
        constants$341.__pthread_unwind_next$FUNC, false
    );
    static final FunctionDescriptor __sigsetjmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __sigsetjmp$MH = RuntimeHelper.downcallHandle(
        "__sigsetjmp",
        constants$341.__sigsetjmp$FUNC, false
    );
    static final FunctionDescriptor pthread_mutex_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_init$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_init",
        constants$341.pthread_mutex_init$FUNC, false
    );
    static final FunctionDescriptor pthread_mutex_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_destroy",
        constants$341.pthread_mutex_destroy$FUNC, false
    );
    static final FunctionDescriptor pthread_mutex_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_trylock$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_trylock",
        constants$341.pthread_mutex_trylock$FUNC, false
    );
}

