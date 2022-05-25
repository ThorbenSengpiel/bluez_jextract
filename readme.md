Erzeugt mit:
/java/jdk/openjdk-19-panama+1-13/bin/jextract --source -d src/main/java -t gbus -I /usr/include/glib-2.0/ -I /usr/include/glib-2.0/glib -I /usr/lib64/glib-2.0/include/ /usr/include/glib-2.0/gio/gio.h

Änderungen:
- Klasse gio_h_4 public gemacht
- Klasse gio_h_5 public gemacht


/java/jdk/openjdk-19-panama+1-13/bin/java --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign de.pdbm.Main

Generate generated-code binding:
./jextract --source -t bluez.binding -I /usr/include/glib-2.0 -I /usr/lib/x86_64-linux-gnu/glib-2.0/include <Path to generated-code.h>

Änderungen:
- Klasse generated_code_h_8 -> public

Die libbluez_binding.so wird generiert von dem bluez_binding-Projekt (https://github.com/ThorbenSengpiel/bluez_binding) und muss unter resources platziert werden.

Problem:
Beim Aufruf einer Methode auf ein gefundenes Device Objekt tritt ein Segmentation-Fault auf. Die Ursache für diesen Segmentation-Fault
ist aktuell unbekannt. Durch printf-Debugging konnte der Fehler auf den Aufruf von

    const gchar* ret = iface->get_name(object); in der Methode device1_get_name (Device1 *object) in der angepassten generated-code.c


