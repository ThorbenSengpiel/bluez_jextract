// Generated by jextract

package bluez.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$271 {

    static final FunctionDescriptor g_scanner_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_error$MH = RuntimeHelper.downcallHandle(
        "g_scanner_error",
        constants$271.g_scanner_error$FUNC, true
    );
    static final FunctionDescriptor g_scanner_warn$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_warn$MH = RuntimeHelper.downcallHandle(
        "g_scanner_warn",
        constants$271.g_scanner_warn$FUNC, true
    );
    static final FunctionDescriptor GSequenceIterCompareFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSequenceIterCompareFunc$MH = RuntimeHelper.downcallHandle(
        constants$271.GSequenceIterCompareFunc$FUNC, false
    );
    static final FunctionDescriptor g_sequence_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_new$MH = RuntimeHelper.downcallHandle(
        "g_sequence_new",
        constants$271.g_sequence_new$FUNC, false
    );
    static final FunctionDescriptor g_sequence_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_free$MH = RuntimeHelper.downcallHandle(
        "g_sequence_free",
        constants$271.g_sequence_free$FUNC, false
    );
}


