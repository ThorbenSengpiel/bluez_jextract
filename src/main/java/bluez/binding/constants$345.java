// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$345 {

    static final FunctionDescriptor pthread_rwlock_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_init$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_init",
        constants$345.pthread_rwlock_init$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlock_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_destroy",
        constants$345.pthread_rwlock_destroy$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlock_rdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_rdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_rdlock",
        constants$345.pthread_rwlock_rdlock$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlock_tryrdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_tryrdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_tryrdlock",
        constants$345.pthread_rwlock_tryrdlock$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlock_timedrdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_timedrdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_timedrdlock",
        constants$345.pthread_rwlock_timedrdlock$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlock_wrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_wrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_wrlock",
        constants$345.pthread_rwlock_wrlock$FUNC, false
    );
}


