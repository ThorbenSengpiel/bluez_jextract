// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$307 {

    static final FunctionDescriptor g_strv_builder_add_many$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_add_many$MH = RuntimeHelper.downcallHandle(
        "g_strv_builder_add_many",
        constants$307.g_strv_builder_add_many$FUNC, true
    );
    static final FunctionDescriptor g_strv_builder_end$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_end$MH = RuntimeHelper.downcallHandle(
        "g_strv_builder_end",
        constants$307.g_strv_builder_end$FUNC, false
    );
    static final FunctionDescriptor __errno_location$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __errno_location$MH = RuntimeHelper.downcallHandle(
        "__errno_location",
        constants$307.__errno_location$FUNC, false
    );
    static final FunctionDescriptor GTestFunc$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle GTestFunc$MH = RuntimeHelper.downcallHandle(
        constants$307.GTestFunc$FUNC, false
    );
    static final FunctionDescriptor GTestDataFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}

