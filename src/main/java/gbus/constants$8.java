// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$8 {

    static final FunctionDescriptor GHFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHFunc$MH = RuntimeHelper.downcallHandle(
        constants$8.GHFunc$FUNC, false
    );
    static final FunctionDescriptor GCopyFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCopyFunc$MH = RuntimeHelper.downcallHandle(
        constants$8.GCopyFunc$FUNC, false
    );
    static final FunctionDescriptor GFreeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GFreeFunc$MH = RuntimeHelper.downcallHandle(
        constants$8.GFreeFunc$FUNC, false
    );
}


