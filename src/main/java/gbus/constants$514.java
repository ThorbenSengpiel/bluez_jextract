// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$514 {

    static final FunctionDescriptor GSocketSourceFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSocketSourceFunc$MH = RuntimeHelper.downcallHandle(
        constants$514.GSocketSourceFunc$FUNC, false
    );
    static final FunctionDescriptor GDatagramBasedSourceFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDatagramBasedSourceFunc$MH = RuntimeHelper.downcallHandle(
        constants$514.GDatagramBasedSourceFunc$FUNC, false
    );
    static final FunctionDescriptor GCancellableSourceFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCancellableSourceFunc$MH = RuntimeHelper.downcallHandle(
        constants$514.GCancellableSourceFunc$FUNC, false
    );
    static final FunctionDescriptor GPollableSourceFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


