// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$338 {

    static final FunctionDescriptor pthread_attr_setscope$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_attr_setscope$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setscope",
        constants$338.pthread_attr_setscope$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_getstackaddr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getstackaddr$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getstackaddr",
        constants$338.pthread_attr_getstackaddr$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_setstackaddr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_setstackaddr$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setstackaddr",
        constants$338.pthread_attr_setstackaddr$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_getstacksize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getstacksize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getstacksize",
        constants$338.pthread_attr_getstacksize$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_setstacksize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_attr_setstacksize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setstacksize",
        constants$338.pthread_attr_setstacksize$FUNC, false
    );
    static final FunctionDescriptor pthread_attr_getstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getstack$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getstack",
        constants$338.pthread_attr_getstack$FUNC, false
    );
}


