// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor tzset$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle tzset$MH = RuntimeHelper.downcallHandle(
        "tzset",
        constants$3.tzset$FUNC, false
    );
    static final  OfInt daylight$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle daylight$VH = constants$3.daylight$LAYOUT.varHandle();
    static final MemorySegment daylight$SEGMENT = RuntimeHelper.lookupGlobalVariable("daylight", constants$3.daylight$LAYOUT);
    static final  OfLong timezone$LAYOUT = Constants$root.C_LONG_LONG$LAYOUT;
    static final VarHandle timezone$VH = constants$3.timezone$LAYOUT.varHandle();
    static final MemorySegment timezone$SEGMENT = RuntimeHelper.lookupGlobalVariable("timezone", constants$3.timezone$LAYOUT);
    static final FunctionDescriptor timegm$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle timegm$MH = RuntimeHelper.downcallHandle(
        "timegm",
        constants$3.timegm$FUNC, false
    );
    static final FunctionDescriptor timelocal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle timelocal$MH = RuntimeHelper.downcallHandle(
        "timelocal",
        constants$3.timelocal$FUNC, false
    );
    static final FunctionDescriptor dysize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle dysize$MH = RuntimeHelper.downcallHandle(
        "dysize",
        constants$3.dysize$FUNC, false
    );
}


