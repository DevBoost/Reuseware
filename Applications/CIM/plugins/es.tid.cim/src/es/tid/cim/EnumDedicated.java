/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Dedicated</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumDedicated()
 * @model
 * @generated
 */
public enum EnumDedicated implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(1, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Not Dedicated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_DEDICATED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_DEDICATED(0, "NotDedicated", "Not Dedicated"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "Other", "Other"),

	/**
	 * The '<em><b>Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE(3, "Storage", "Storage"),

	/**
	 * The '<em><b>Router</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUTER_VALUE
	 * @generated
	 * @ordered
	 */
	ROUTER(4, "Router", "Router"),

	/**
	 * The '<em><b>Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCH(5, "Switch", "Switch"),

	/**
	 * The '<em><b>Layer3 Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAYER3_SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	LAYER3_SWITCH(6, "Layer3Switch", "Layer 3 Switch"),

	/**
	 * The '<em><b>Central Office Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRAL_OFFICE_SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRAL_OFFICE_SWITCH(7, "CentralOfficeSwitch", "Central Office Switch"),

	/**
	 * The '<em><b>Hub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUB_VALUE
	 * @generated
	 * @ordered
	 */
	HUB(8, "Hub", "Hub"),

	/**
	 * The '<em><b>Access Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_SERVER(9, "AccessServer", "AccessServer"),

	/**
	 * The '<em><b>Firewall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREWALL_VALUE
	 * @generated
	 * @ordered
	 */
	FIREWALL(10, "Firewall", "Firewall"),

	/**
	 * The '<em><b>Print</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINT_VALUE
	 * @generated
	 * @ordered
	 */
	PRINT(11, "Print", "Print"),

	/**
	 * The '<em><b>IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_VALUE
	 * @generated
	 * @ordered
	 */
	IO(12, "IO", "I/O"),

	/**
	 * The '<em><b>Web Caching</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_CACHING_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_CACHING(13, "WebCaching", "Web Caching"),

	/**
	 * The '<em><b>Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGEMENT(14, "Management", "Management"),

	/**
	 * The '<em><b>Block Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCK_SERVER(15, "BlockServer", "Block Server"),

	/**
	 * The '<em><b>File Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_SERVER(16, "FileServer", "File Server"),

	/**
	 * The '<em><b>Mobile User Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_USER_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE_USER_DEVICE(17, "MobileUserDevice", "Mobile User Device"),

	/**
	 * The '<em><b>Repeater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEATER_VALUE
	 * @generated
	 * @ordered
	 */
	REPEATER(18, "Repeater", "Repeater"),

	/**
	 * The '<em><b>Bridge Extender</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_EXTENDER_VALUE
	 * @generated
	 * @ordered
	 */
	BRIDGE_EXTENDER(19, "BridgeExtender", "Bridge/Extender"),

	/**
	 * The '<em><b>Gateway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	GATEWAY(20, "Gateway", "Gateway"),

	/**
	 * The '<em><b>Storage Virtualizer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_VIRTUALIZER_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE_VIRTUALIZER(21, "StorageVirtualizer", "Storage Virtualizer"),

	/**
	 * The '<em><b>Media Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIA_LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIA_LIBRARY(22, "MediaLibrary", "Media Library"),

	/**
	 * The '<em><b>Extender Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDER_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENDER_NODE(23, "ExtenderNode", "ExtenderNode"),

	/**
	 * The '<em><b>NAS Head</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAS_HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	NAS_HEAD(24, "NASHead", "NAS Head"),

	/**
	 * The '<em><b>Selfcontained NAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELFCONTAINED_NAS_VALUE
	 * @generated
	 * @ordered
	 */
	SELFCONTAINED_NAS(25, "SelfcontainedNAS", "Self-contained NAS"),

	/**
	 * The '<em><b>UPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPS_VALUE
	 * @generated
	 * @ordered
	 */
	UPS(26, "UPS", "UPS"),

	/**
	 * The '<em><b>IP Phone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_PHONE_VALUE
	 * @generated
	 * @ordered
	 */
	IP_PHONE(27, "IPPhone", "IP Phone"),

	/**
	 * The '<em><b>Management Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGEMENT_CONTROLLER(28, "ManagementController", "Management Controller"),

	/**
	 * The '<em><b>Chassis Manager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHASSIS_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	CHASSIS_MANAGER(29, "ChassisManager", "Chassis Manager"),

	/**
	 * The '<em><b>Hostbased RAI Dcontroller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSTBASED_RAI_DCONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	HOSTBASED_RAI_DCONTROLLER(30, "HostbasedRAIDcontroller", "Host-based RAID controller"),

	/**
	 * The '<em><b>Storage Device Enclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_DEVICE_ENCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE_DEVICE_ENCLOSURE(31, "StorageDeviceEnclosure", "StorageDeviceEnclosure"),

	/**
	 * The '<em><b>Desktop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESKTOP_VALUE
	 * @generated
	 * @ordered
	 */
	DESKTOP(32, "Desktop", "Desktop"),

	/**
	 * The '<em><b>Laptop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAPTOP_VALUE
	 * @generated
	 * @ordered
	 */
	LAPTOP(33, "Laptop", "Laptop"),

	/**
	 * The '<em><b>Virtual Tape Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_TAPE_LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_TAPE_LIBRARY(34, "VirtualTapeLibrary", "Virtual Tape Library"),

	/**
	 * The '<em><b>Virtual Library System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_LIBRARY_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_LIBRARY_SYSTEM(35, "VirtualLibrarySystem", "Virtual Library System");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 1;

	/**
	 * The '<em><b>Not Dedicated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Dedicated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_DEDICATED
	 * @model name="NotDedicated" literal="Not Dedicated"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_DEDICATED_VALUE = 0;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 2;

	/**
	 * The '<em><b>Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE
	 * @model name="Storage"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_VALUE = 3;

	/**
	 * The '<em><b>Router</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Router</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUTER
	 * @model name="Router"
	 * @generated
	 * @ordered
	 */
	public static final int ROUTER_VALUE = 4;

	/**
	 * The '<em><b>Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCH
	 * @model name="Switch"
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_VALUE = 5;

	/**
	 * The '<em><b>Layer3 Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Layer3 Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAYER3_SWITCH
	 * @model name="Layer3Switch" literal="Layer 3 Switch"
	 * @generated
	 * @ordered
	 */
	public static final int LAYER3_SWITCH_VALUE = 6;

	/**
	 * The '<em><b>Central Office Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Central Office Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRAL_OFFICE_SWITCH
	 * @model name="CentralOfficeSwitch" literal="Central Office Switch"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRAL_OFFICE_SWITCH_VALUE = 7;

	/**
	 * The '<em><b>Hub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hub</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUB
	 * @model name="Hub"
	 * @generated
	 * @ordered
	 */
	public static final int HUB_VALUE = 8;

	/**
	 * The '<em><b>Access Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Access Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESS_SERVER
	 * @model name="AccessServer"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_SERVER_VALUE = 9;

	/**
	 * The '<em><b>Firewall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Firewall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIREWALL
	 * @model name="Firewall"
	 * @generated
	 * @ordered
	 */
	public static final int FIREWALL_VALUE = 10;

	/**
	 * The '<em><b>Print</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Print</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINT
	 * @model name="Print"
	 * @generated
	 * @ordered
	 */
	public static final int PRINT_VALUE = 11;

	/**
	 * The '<em><b>IO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IO
	 * @model literal="I/O"
	 * @generated
	 * @ordered
	 */
	public static final int IO_VALUE = 12;

	/**
	 * The '<em><b>Web Caching</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web Caching</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB_CACHING
	 * @model name="WebCaching" literal="Web Caching"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_CACHING_VALUE = 13;

	/**
	 * The '<em><b>Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Management</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT
	 * @model name="Management"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGEMENT_VALUE = 14;

	/**
	 * The '<em><b>Block Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Block Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOCK_SERVER
	 * @model name="BlockServer" literal="Block Server"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCK_SERVER_VALUE = 15;

	/**
	 * The '<em><b>File Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_SERVER
	 * @model name="FileServer" literal="File Server"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_SERVER_VALUE = 16;

	/**
	 * The '<em><b>Mobile User Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mobile User Device</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOBILE_USER_DEVICE
	 * @model name="MobileUserDevice" literal="Mobile User Device"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_USER_DEVICE_VALUE = 17;

	/**
	 * The '<em><b>Repeater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repeater</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEATER
	 * @model name="Repeater"
	 * @generated
	 * @ordered
	 */
	public static final int REPEATER_VALUE = 18;

	/**
	 * The '<em><b>Bridge Extender</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bridge Extender</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_EXTENDER
	 * @model name="BridgeExtender" literal="Bridge/Extender"
	 * @generated
	 * @ordered
	 */
	public static final int BRIDGE_EXTENDER_VALUE = 19;

	/**
	 * The '<em><b>Gateway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gateway</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATEWAY
	 * @model name="Gateway"
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_VALUE = 20;

	/**
	 * The '<em><b>Storage Virtualizer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage Virtualizer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE_VIRTUALIZER
	 * @model name="StorageVirtualizer" literal="Storage Virtualizer"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_VIRTUALIZER_VALUE = 21;

	/**
	 * The '<em><b>Media Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Media Library</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIA_LIBRARY
	 * @model name="MediaLibrary" literal="Media Library"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIA_LIBRARY_VALUE = 22;

	/**
	 * The '<em><b>Extender Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extender Node</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENDER_NODE
	 * @model name="ExtenderNode"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDER_NODE_VALUE = 23;

	/**
	 * The '<em><b>NAS Head</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAS Head</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAS_HEAD
	 * @model name="NASHead" literal="NAS Head"
	 * @generated
	 * @ordered
	 */
	public static final int NAS_HEAD_VALUE = 24;

	/**
	 * The '<em><b>Selfcontained NAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Selfcontained NAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELFCONTAINED_NAS
	 * @model name="SelfcontainedNAS" literal="Self-contained NAS"
	 * @generated
	 * @ordered
	 */
	public static final int SELFCONTAINED_NAS_VALUE = 25;

	/**
	 * The '<em><b>UPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPS_VALUE = 26;

	/**
	 * The '<em><b>IP Phone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP Phone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_PHONE
	 * @model name="IPPhone" literal="IP Phone"
	 * @generated
	 * @ordered
	 */
	public static final int IP_PHONE_VALUE = 27;

	/**
	 * The '<em><b>Management Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Management Controller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_CONTROLLER
	 * @model name="ManagementController" literal="Management Controller"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGEMENT_CONTROLLER_VALUE = 28;

	/**
	 * The '<em><b>Chassis Manager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chassis Manager</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHASSIS_MANAGER
	 * @model name="ChassisManager" literal="Chassis Manager"
	 * @generated
	 * @ordered
	 */
	public static final int CHASSIS_MANAGER_VALUE = 29;

	/**
	 * The '<em><b>Hostbased RAI Dcontroller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hostbased RAI Dcontroller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOSTBASED_RAI_DCONTROLLER
	 * @model name="HostbasedRAIDcontroller" literal="Host-based RAID controller"
	 * @generated
	 * @ordered
	 */
	public static final int HOSTBASED_RAI_DCONTROLLER_VALUE = 30;

	/**
	 * The '<em><b>Storage Device Enclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage Device Enclosure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE_DEVICE_ENCLOSURE
	 * @model name="StorageDeviceEnclosure"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_DEVICE_ENCLOSURE_VALUE = 31;

	/**
	 * The '<em><b>Desktop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Desktop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESKTOP
	 * @model name="Desktop"
	 * @generated
	 * @ordered
	 */
	public static final int DESKTOP_VALUE = 32;

	/**
	 * The '<em><b>Laptop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Laptop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAPTOP
	 * @model name="Laptop"
	 * @generated
	 * @ordered
	 */
	public static final int LAPTOP_VALUE = 33;

	/**
	 * The '<em><b>Virtual Tape Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtual Tape Library</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_TAPE_LIBRARY
	 * @model name="VirtualTapeLibrary" literal="Virtual Tape Library"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_TAPE_LIBRARY_VALUE = 34;

	/**
	 * The '<em><b>Virtual Library System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtual Library System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_LIBRARY_SYSTEM
	 * @model name="VirtualLibrarySystem" literal="Virtual Library System"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_LIBRARY_SYSTEM_VALUE = 35;

	/**
	 * An array of all the '<em><b>Enum Dedicated</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumDedicated[] VALUES_ARRAY =
		new EnumDedicated[] {
			UNKNOWN,
			NOT_DEDICATED,
			OTHER,
			STORAGE,
			ROUTER,
			SWITCH,
			LAYER3_SWITCH,
			CENTRAL_OFFICE_SWITCH,
			HUB,
			ACCESS_SERVER,
			FIREWALL,
			PRINT,
			IO,
			WEB_CACHING,
			MANAGEMENT,
			BLOCK_SERVER,
			FILE_SERVER,
			MOBILE_USER_DEVICE,
			REPEATER,
			BRIDGE_EXTENDER,
			GATEWAY,
			STORAGE_VIRTUALIZER,
			MEDIA_LIBRARY,
			EXTENDER_NODE,
			NAS_HEAD,
			SELFCONTAINED_NAS,
			UPS,
			IP_PHONE,
			MANAGEMENT_CONTROLLER,
			CHASSIS_MANAGER,
			HOSTBASED_RAI_DCONTROLLER,
			STORAGE_DEVICE_ENCLOSURE,
			DESKTOP,
			LAPTOP,
			VIRTUAL_TAPE_LIBRARY,
			VIRTUAL_LIBRARY_SYSTEM,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Dedicated</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumDedicated> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Dedicated</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDedicated get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDedicated result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Dedicated</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDedicated getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDedicated result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Dedicated</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDedicated get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOT_DEDICATED_VALUE: return NOT_DEDICATED;
			case OTHER_VALUE: return OTHER;
			case STORAGE_VALUE: return STORAGE;
			case ROUTER_VALUE: return ROUTER;
			case SWITCH_VALUE: return SWITCH;
			case LAYER3_SWITCH_VALUE: return LAYER3_SWITCH;
			case CENTRAL_OFFICE_SWITCH_VALUE: return CENTRAL_OFFICE_SWITCH;
			case HUB_VALUE: return HUB;
			case ACCESS_SERVER_VALUE: return ACCESS_SERVER;
			case FIREWALL_VALUE: return FIREWALL;
			case PRINT_VALUE: return PRINT;
			case IO_VALUE: return IO;
			case WEB_CACHING_VALUE: return WEB_CACHING;
			case MANAGEMENT_VALUE: return MANAGEMENT;
			case BLOCK_SERVER_VALUE: return BLOCK_SERVER;
			case FILE_SERVER_VALUE: return FILE_SERVER;
			case MOBILE_USER_DEVICE_VALUE: return MOBILE_USER_DEVICE;
			case REPEATER_VALUE: return REPEATER;
			case BRIDGE_EXTENDER_VALUE: return BRIDGE_EXTENDER;
			case GATEWAY_VALUE: return GATEWAY;
			case STORAGE_VIRTUALIZER_VALUE: return STORAGE_VIRTUALIZER;
			case MEDIA_LIBRARY_VALUE: return MEDIA_LIBRARY;
			case EXTENDER_NODE_VALUE: return EXTENDER_NODE;
			case NAS_HEAD_VALUE: return NAS_HEAD;
			case SELFCONTAINED_NAS_VALUE: return SELFCONTAINED_NAS;
			case UPS_VALUE: return UPS;
			case IP_PHONE_VALUE: return IP_PHONE;
			case MANAGEMENT_CONTROLLER_VALUE: return MANAGEMENT_CONTROLLER;
			case CHASSIS_MANAGER_VALUE: return CHASSIS_MANAGER;
			case HOSTBASED_RAI_DCONTROLLER_VALUE: return HOSTBASED_RAI_DCONTROLLER;
			case STORAGE_DEVICE_ENCLOSURE_VALUE: return STORAGE_DEVICE_ENCLOSURE;
			case DESKTOP_VALUE: return DESKTOP;
			case LAPTOP_VALUE: return LAPTOP;
			case VIRTUAL_TAPE_LIBRARY_VALUE: return VIRTUAL_TAPE_LIBRARY;
			case VIRTUAL_LIBRARY_SYSTEM_VALUE: return VIRTUAL_LIBRARY_SYSTEM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumDedicated(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EnumDedicated
