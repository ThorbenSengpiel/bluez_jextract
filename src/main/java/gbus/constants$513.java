// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$513 {

    static final FunctionDescriptor GFileMeasureProgressCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GFileMeasureProgressCallback$MH = RuntimeHelper.downcallHandle(
        constants$513.GFileMeasureProgressCallback$FUNC, false
    );
    static final FunctionDescriptor GIOSchedulerJobFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GIOSchedulerJobFunc$MH = RuntimeHelper.downcallHandle(
        constants$513.GIOSchedulerJobFunc$FUNC, false
    );
    static final FunctionDescriptor GSimpleAsyncThreadFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSimpleAsyncThreadFunc$MH = RuntimeHelper.downcallHandle(
        constants$513.GSimpleAsyncThreadFunc$FUNC, false
    );
    static final FunctionDescriptor GSocketSourceFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


