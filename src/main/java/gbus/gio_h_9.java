// Generated by jextract

package gbus;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
 class gio_h_9 extends gio_h_8 {

    public static MemorySegment G_FILE_ATTRIBUTE_TIME_CHANGED_USEC() {
        return constants$1001.G_FILE_ATTRIBUTE_TIME_CHANGED_USEC$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_TIME_CREATED() {
        return constants$1001.G_FILE_ATTRIBUTE_TIME_CREATED$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_TIME_CREATED_USEC() {
        return constants$1001.G_FILE_ATTRIBUTE_TIME_CREATED_USEC$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_DEVICE() {
        return constants$1001.G_FILE_ATTRIBUTE_UNIX_DEVICE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_INODE() {
        return constants$1001.G_FILE_ATTRIBUTE_UNIX_INODE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_MODE() {
        return constants$1001.G_FILE_ATTRIBUTE_UNIX_MODE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_NLINK() {
        return constants$1002.G_FILE_ATTRIBUTE_UNIX_NLINK$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_UID() {
        return constants$1002.G_FILE_ATTRIBUTE_UNIX_UID$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_GID() {
        return constants$1002.G_FILE_ATTRIBUTE_UNIX_GID$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_RDEV() {
        return constants$1002.G_FILE_ATTRIBUTE_UNIX_RDEV$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_BLOCK_SIZE() {
        return constants$1002.G_FILE_ATTRIBUTE_UNIX_BLOCK_SIZE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_BLOCKS() {
        return constants$1002.G_FILE_ATTRIBUTE_UNIX_BLOCKS$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_UNIX_IS_MOUNTPOINT() {
        return constants$1003.G_FILE_ATTRIBUTE_UNIX_IS_MOUNTPOINT$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_DOS_IS_ARCHIVE() {
        return constants$1003.G_FILE_ATTRIBUTE_DOS_IS_ARCHIVE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_DOS_IS_SYSTEM() {
        return constants$1003.G_FILE_ATTRIBUTE_DOS_IS_SYSTEM$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_DOS_IS_MOUNTPOINT() {
        return constants$1003.G_FILE_ATTRIBUTE_DOS_IS_MOUNTPOINT$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_DOS_REPARSE_POINT_TAG() {
        return constants$1003.G_FILE_ATTRIBUTE_DOS_REPARSE_POINT_TAG$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_OWNER_USER() {
        return constants$1003.G_FILE_ATTRIBUTE_OWNER_USER$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_OWNER_USER_REAL() {
        return constants$1004.G_FILE_ATTRIBUTE_OWNER_USER_REAL$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_OWNER_GROUP() {
        return constants$1004.G_FILE_ATTRIBUTE_OWNER_GROUP$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_THUMBNAIL_PATH() {
        return constants$1004.G_FILE_ATTRIBUTE_THUMBNAIL_PATH$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_THUMBNAILING_FAILED() {
        return constants$1004.G_FILE_ATTRIBUTE_THUMBNAILING_FAILED$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_THUMBNAIL_IS_VALID() {
        return constants$1004.G_FILE_ATTRIBUTE_THUMBNAIL_IS_VALID$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_PREVIEW_ICON() {
        return constants$1004.G_FILE_ATTRIBUTE_PREVIEW_ICON$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_FILESYSTEM_SIZE() {
        return constants$1005.G_FILE_ATTRIBUTE_FILESYSTEM_SIZE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_FILESYSTEM_FREE() {
        return constants$1005.G_FILE_ATTRIBUTE_FILESYSTEM_FREE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_FILESYSTEM_USED() {
        return constants$1005.G_FILE_ATTRIBUTE_FILESYSTEM_USED$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_FILESYSTEM_TYPE() {
        return constants$1005.G_FILE_ATTRIBUTE_FILESYSTEM_TYPE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_FILESYSTEM_READONLY() {
        return constants$1005.G_FILE_ATTRIBUTE_FILESYSTEM_READONLY$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW() {
        return constants$1005.G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_FILESYSTEM_REMOTE() {
        return constants$1006.G_FILE_ATTRIBUTE_FILESYSTEM_REMOTE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_GVFS_BACKEND() {
        return constants$1006.G_FILE_ATTRIBUTE_GVFS_BACKEND$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_SELINUX_CONTEXT() {
        return constants$1006.G_FILE_ATTRIBUTE_SELINUX_CONTEXT$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_TRASH_ITEM_COUNT() {
        return constants$1006.G_FILE_ATTRIBUTE_TRASH_ITEM_COUNT$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_TRASH_ORIG_PATH() {
        return constants$1006.G_FILE_ATTRIBUTE_TRASH_ORIG_PATH$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_TRASH_DELETION_DATE() {
        return constants$1006.G_FILE_ATTRIBUTE_TRASH_DELETION_DATE$SEGMENT;
    }
    public static MemorySegment G_FILE_ATTRIBUTE_RECENT_MODIFIED() {
        return constants$1007.G_FILE_ATTRIBUTE_RECENT_MODIFIED$SEGMENT;
    }
    public static MemorySegment G_MEMORY_MONITOR_EXTENSION_POINT_NAME() {
        return constants$1007.G_MEMORY_MONITOR_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_MENU_ATTRIBUTE_ACTION() {
        return constants$1007.G_MENU_ATTRIBUTE_ACTION$SEGMENT;
    }
    public static MemorySegment G_MENU_ATTRIBUTE_ACTION_NAMESPACE() {
        return constants$1007.G_MENU_ATTRIBUTE_ACTION_NAMESPACE$SEGMENT;
    }
    public static MemorySegment G_MENU_ATTRIBUTE_TARGET() {
        return constants$1007.G_MENU_ATTRIBUTE_TARGET$SEGMENT;
    }
    public static MemorySegment G_MENU_ATTRIBUTE_LABEL() {
        return constants$1007.G_MENU_ATTRIBUTE_LABEL$SEGMENT;
    }
    public static MemorySegment G_MENU_ATTRIBUTE_ICON() {
        return constants$1008.G_MENU_ATTRIBUTE_ICON$SEGMENT;
    }
    public static MemorySegment G_MENU_LINK_SUBMENU() {
        return constants$1008.G_MENU_LINK_SUBMENU$SEGMENT;
    }
    public static MemorySegment G_MENU_LINK_SECTION() {
        return constants$1008.G_MENU_LINK_SECTION$SEGMENT;
    }
    public static MemorySegment G_VOLUME_MONITOR_EXTENSION_POINT_NAME() {
        return constants$1008.G_VOLUME_MONITOR_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_NATIVE_VOLUME_MONITOR_EXTENSION_POINT_NAME() {
        return constants$1008.G_NATIVE_VOLUME_MONITOR_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_NETWORK_MONITOR_EXTENSION_POINT_NAME() {
        return constants$1008.G_NETWORK_MONITOR_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_POWER_PROFILE_MONITOR_EXTENSION_POINT_NAME() {
        return constants$1009.G_POWER_PROFILE_MONITOR_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_PROXY_EXTENSION_POINT_NAME() {
        return constants$1009.G_PROXY_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_PROXY_RESOLVER_EXTENSION_POINT_NAME() {
        return constants$1009.G_PROXY_RESOLVER_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_TLS_BACKEND_EXTENSION_POINT_NAME() {
        return constants$1009.G_TLS_BACKEND_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER() {
        return constants$1009.G_TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER$SEGMENT;
    }
    public static MemorySegment G_TLS_DATABASE_PURPOSE_AUTHENTICATE_CLIENT() {
        return constants$1009.G_TLS_DATABASE_PURPOSE_AUTHENTICATE_CLIENT$SEGMENT;
    }
    public static MemorySegment G_VFS_EXTENSION_POINT_NAME() {
        return constants$1010.G_VFS_EXTENSION_POINT_NAME$SEGMENT;
    }
    public static MemorySegment G_VOLUME_IDENTIFIER_KIND_HAL_UDI() {
        return constants$1010.G_VOLUME_IDENTIFIER_KIND_HAL_UDI$SEGMENT;
    }
    public static MemorySegment G_VOLUME_IDENTIFIER_KIND_UNIX_DEVICE() {
        return constants$1010.G_VOLUME_IDENTIFIER_KIND_UNIX_DEVICE$SEGMENT;
    }
    public static MemorySegment G_VOLUME_IDENTIFIER_KIND_LABEL() {
        return constants$1010.G_VOLUME_IDENTIFIER_KIND_LABEL$SEGMENT;
    }
    public static MemorySegment G_VOLUME_IDENTIFIER_KIND_UUID() {
        return constants$1010.G_VOLUME_IDENTIFIER_KIND_UUID$SEGMENT;
    }
    public static MemorySegment G_VOLUME_IDENTIFIER_KIND_NFS_MOUNT() {
        return constants$1010.G_VOLUME_IDENTIFIER_KIND_NFS_MOUNT$SEGMENT;
    }
    public static MemorySegment G_VOLUME_IDENTIFIER_KIND_CLASS() {
        return constants$1011.G_VOLUME_IDENTIFIER_KIND_CLASS$SEGMENT;
    }
}


