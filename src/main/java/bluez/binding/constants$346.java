// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$346 {

    static final FunctionDescriptor pthread_rwlock_trywrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_trywrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_trywrlock",
        constants$346.pthread_rwlock_trywrlock$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlock_timedwrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_timedwrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_timedwrlock",
        constants$346.pthread_rwlock_timedwrlock$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlock_unlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_unlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_unlock",
        constants$346.pthread_rwlock_unlock$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlockattr_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlockattr_init$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlockattr_init",
        constants$346.pthread_rwlockattr_init$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlockattr_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlockattr_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlockattr_destroy",
        constants$346.pthread_rwlockattr_destroy$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlockattr_getpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlockattr_getpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlockattr_getpshared",
        constants$346.pthread_rwlockattr_getpshared$FUNC, false
    );
}


