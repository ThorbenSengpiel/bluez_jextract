// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$207 {

    static final FunctionDescriptor g_mapped_file_get_contents$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_contents$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_contents",
        constants$207.g_mapped_file_get_contents$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_get_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_bytes$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_bytes",
        constants$207.g_mapped_file_get_bytes$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_ref$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_ref",
        constants$207.g_mapped_file_ref$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_unref$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_unref",
        constants$207.g_mapped_file_unref$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_free$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_free",
        constants$207.g_mapped_file_free$FUNC, false
    );
    static final FunctionDescriptor g_markup_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_markup_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_markup_error_quark",
        constants$207.g_markup_error_quark$FUNC, false
    );
}

