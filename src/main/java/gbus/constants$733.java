// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$733 {

    static final FunctionDescriptor g_list_store_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_sort$MH = RuntimeHelper.downcallHandle(
        "g_list_store_sort",
        constants$733.g_list_store_sort$FUNC, false
    );
    static final FunctionDescriptor g_list_store_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_append$MH = RuntimeHelper.downcallHandle(
        "g_list_store_append",
        constants$733.g_list_store_append$FUNC, false
    );
    static final FunctionDescriptor g_list_store_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_list_store_remove$MH = RuntimeHelper.downcallHandle(
        "g_list_store_remove",
        constants$733.g_list_store_remove$FUNC, false
    );
    static final FunctionDescriptor g_list_store_remove_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_remove_all$MH = RuntimeHelper.downcallHandle(
        "g_list_store_remove_all",
        constants$733.g_list_store_remove_all$FUNC, false
    );
    static final FunctionDescriptor g_list_store_splice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_list_store_splice$MH = RuntimeHelper.downcallHandle(
        "g_list_store_splice",
        constants$733.g_list_store_splice$FUNC, false
    );
    static final FunctionDescriptor g_list_store_find$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_find$MH = RuntimeHelper.downcallHandle(
        "g_list_store_find",
        constants$733.g_list_store_find$FUNC, false
    );
}

