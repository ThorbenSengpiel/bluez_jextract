// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$742 {

    static final FunctionDescriptor g_menu_link_iter_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_link_iter_get_name$MH = RuntimeHelper.downcallHandle(
        "g_menu_link_iter_get_name",
        constants$742.g_menu_link_iter_get_name$FUNC, false
    );
    static final FunctionDescriptor g_menu_link_iter_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_link_iter_get_value$MH = RuntimeHelper.downcallHandle(
        "g_menu_link_iter_get_value",
        constants$742.g_menu_link_iter_get_value$FUNC, false
    );
    static final FunctionDescriptor g_menu_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_menu_get_type$MH = RuntimeHelper.downcallHandle(
        "g_menu_get_type",
        constants$742.g_menu_get_type$FUNC, false
    );
    static final FunctionDescriptor g_menu_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_menu_new$MH = RuntimeHelper.downcallHandle(
        "g_menu_new",
        constants$742.g_menu_new$FUNC, false
    );
    static final FunctionDescriptor g_menu_freeze$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_freeze$MH = RuntimeHelper.downcallHandle(
        "g_menu_freeze",
        constants$742.g_menu_freeze$FUNC, false
    );
    static final FunctionDescriptor g_menu_insert_item$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_insert_item$MH = RuntimeHelper.downcallHandle(
        "g_menu_insert_item",
        constants$742.g_menu_insert_item$FUNC, false
    );
}


