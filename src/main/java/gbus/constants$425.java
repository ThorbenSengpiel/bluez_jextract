// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$425 {

    static final FunctionDescriptor GInterfaceFinalizeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GInterfaceFinalizeFunc$MH = RuntimeHelper.downcallHandle(
        constants$425.GInterfaceFinalizeFunc$FUNC, false
    );
    static final FunctionDescriptor GTypeClassCacheFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypeClassCacheFunc$MH = RuntimeHelper.downcallHandle(
        constants$425.GTypeClassCacheFunc$FUNC, false
    );
    static final FunctionDescriptor GTypeInterfaceCheckFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypeInterfaceCheckFunc$MH = RuntimeHelper.downcallHandle(
        constants$425.GTypeInterfaceCheckFunc$FUNC, false
    );
}

