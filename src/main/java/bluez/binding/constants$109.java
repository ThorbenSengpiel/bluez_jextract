// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$109 {

    static final FunctionDescriptor readdir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle readdir$MH = RuntimeHelper.downcallHandle(
        "readdir",
        constants$109.readdir$FUNC, false
    );
    static final FunctionDescriptor readdir_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle readdir_r$MH = RuntimeHelper.downcallHandle(
        "readdir_r",
        constants$109.readdir_r$FUNC, false
    );
    static final FunctionDescriptor rewinddir$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rewinddir$MH = RuntimeHelper.downcallHandle(
        "rewinddir",
        constants$109.rewinddir$FUNC, false
    );
    static final FunctionDescriptor seekdir$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle seekdir$MH = RuntimeHelper.downcallHandle(
        "seekdir",
        constants$109.seekdir$FUNC, false
    );
    static final FunctionDescriptor telldir$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle telldir$MH = RuntimeHelper.downcallHandle(
        "telldir",
        constants$109.telldir$FUNC, false
    );
    static final FunctionDescriptor dirfd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dirfd$MH = RuntimeHelper.downcallHandle(
        "dirfd",
        constants$109.dirfd$FUNC, false
    );
}


