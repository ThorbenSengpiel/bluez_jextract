package de.pdbm;

import bluez.binding.generated_code_h;
import bluez.binding.generated_code_h_5;
import bluez.binding.generated_code_h_8;
import gbus.GList;
import jdk.incubator.foreign.*;

import static jdk.incubator.foreign.SegmentAllocator.implicitAllocator;
import static jdk.incubator.foreign.ValueLayout.JAVA_INT;

import java.lang.invoke.MethodHandle;

import gbus.gio_h_5;
import gbus.gio_h_4;


/**
 * Quelle: https://www.linumiz.com/bluetooth-list-available-controllers-using-dbus/
 * 
 * @author bernd
 *
 */
public class Main {

	public static void main(String[] args) throws Throwable {
		
		System.loadLibrary("gio-2.0"); // /usr/lib64/libgio-2.0.so
		System.loadLibrary("glib-2.0"); // /usr/lib64/libglib.so
		System.load("/home/tosen/Documents/Work/jextract_bluez/bluez/src/main/resources/libbluez_binding.so");
		MemorySegment errPtr = MemorySegment.allocateNative(8, ResourceScope.newImplicitScope());

		MemorySegment name = implicitAllocator().allocateUtf8String("org.bluez");
		MemorySegment path = implicitAllocator().allocateUtf8String("/");

		MemoryAddress object_manager = gio_h_5.g_dbus_object_manager_client_new_for_bus_sync(gio_h_4.G_BUS_TYPE_SYSTEM(),
				gio_h_4.G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE(),
				name,
				path,
				MemoryAddress.NULL,
				MemoryAddress.NULL,
				MemoryAddress.NULL,
				MemoryAddress.NULL,
				MemoryAddress.NULL);

		Thread mainThread = new Thread(){
			@Override
			public void run() {
				MemoryAddress main_loop = gio_h_5.g_main_loop_new(MemoryAddress.NULL, 0);
				gio_h_5.g_main_loop_run(main_loop);
			}
		};

		mainThread.start();

		System.out.println("Manager = " + object_manager);

		MemoryAddress glist = gio_h_5.g_dbus_object_manager_get_objects(object_manager);

		MemoryAddress found_adapter = null;

		MemoryAddress next = glist;
		do {
			MemorySegment list = GList.ofAddress(next, ResourceScope.newImplicitScope());
			MemoryAddress current = GList.data$get(list);
			next = GList.next$get(list);

			MemorySegment adapter_interface = implicitAllocator().allocateUtf8String("org.bluez.Adapter1");

			System.out.println("Curr = " + current);

			MemoryAddress adapter = generated_code_h_8.object_get_adapter1(current);

			if (adapter.toRawLongValue() == MemoryAddress.NULL.toRawLongValue()){
				System.out.println("Is no Adapter");
			} else{
				System.out.println("Is an Adapter");
				found_adapter = adapter;

			}
		} while (next.toRawLongValue() != MemoryAddress.NULL.toRawLongValue() && found_adapter == null);

		int start_discovery_result = generated_code_h_8.adapter1_call_start_discovery_sync(
				found_adapter,
				MemoryAddress.NULL,
				MemoryAddress.NULL //TODO replace with actual error obj
		);

		MemoryAddress device_glist = gio_h_5.g_dbus_object_manager_get_objects(object_manager);


		next = device_glist;
		do {
			MemorySegment list = GList.ofAddress(next, ResourceScope.newImplicitScope());
			MemoryAddress current = GList.data$get(list);
			next = GList.next$get(list);

			System.out.println("Curr = " + current);

			MemoryAddress device = generated_code_h_8.object_get_device1(current);

			if (device.toRawLongValue() == MemoryAddress.NULL.toRawLongValue()){
				System.out.println("Is no device");
			} else{
				System.out.println("Is a device");
				MemoryAddress nameString = generated_code_h_8.device1_get_name(device);
				MemoryAddress addrString = generated_code_h_8.device1_get_address(device);

				System.out.println("Name = " + nameString.getUtf8String(0));
				System.out.println("Addr = " + addrString.getUtf8String(0));

			}
		} while (next.toRawLongValue() != MemoryAddress.NULL.toRawLongValue());

		/*
		long g_dbus_type = generated_code_h_5.g_dbus_object_get_type();

		MemoryAddress adapter1 = generated_code_h_8.object_get_adapter1(found_adapter);
		System.out.println("Next = " + next);

		MemorySegment discoverable_string = implicitAllocator().allocateUtf8String("discoverable");

		MemoryAddress discoverable_variant = gio_h_5.g_dbus_proxy_get_cached_property(found_adapter, discoverable_string);

		int is_discoverable = gio_h_5.g_variant_get_boolean(discoverable_variant);

		System.out.println(is_discoverable);
		*/
		//MemoryAddress con = gio_h_5.g_bus_get_sync(gio_h_4.G_BUS_TYPE_SYSTEM(), MemoryAddress.NULL, MemoryAddress.NULL);
		
		//System.out.println("con: " + con);
		
	}

}
