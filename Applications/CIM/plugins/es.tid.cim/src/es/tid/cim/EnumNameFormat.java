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
 * A representation of the literals of the enumeration '<em><b>Enum Name Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumNameFormat()
 * @model
 * @generated
 */
public enum EnumNameFormat implements Enumerator {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "Other", "Other"),

	/**
	 * The '<em><b>Autonomous System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTONOMOUS_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	AUTONOMOUS_SYSTEM(1, "AutonomousSystem", "Autonomous System"),

	/**
	 * The '<em><b>Network Access Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_ACCESS_PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_ACCESS_PROVIDER(2, "NetworkAccessProvider", "NetworkAccessProvider"),

	/**
	 * The '<em><b>Network Operations Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_OPERATIONS_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_OPERATIONS_CENTER(3, "NetworkOperationsCenter", "Network Operations Center"),

	/**
	 * The '<em><b>Pointof Presence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTOF_PRESENCE_VALUE
	 * @generated
	 * @ordered
	 */
	POINTOF_PRESENCE(4, "PointofPresence", "PointofPresence"),

	/**
	 * The '<em><b>Regional Network Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_NETWORK_PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL_NETWORK_PROVIDER(5, "RegionalNetworkProvider", "Regional Network Provider"),

	/**
	 * The '<em><b>IP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_VALUE
	 * @generated
	 * @ordered
	 */
	IP(6, "IP", "IP"),

	/**
	 * The '<em><b>IPX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPX_VALUE
	 * @generated
	 * @ordered
	 */
	IPX(7, "IPX", "IPX"),

	/**
	 * The '<em><b>SNA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNA_VALUE
	 * @generated
	 * @ordered
	 */
	SNA(8, "SNA", "SNA"),

	/**
	 * The '<em><b>Dial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIAL(9, "Dial", "Dial"),

	/**
	 * The '<em><b>WAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAN_VALUE
	 * @generated
	 * @ordered
	 */
	WAN(10, "WAN", "WAN"),

	/**
	 * The '<em><b>LAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAN_VALUE
	 * @generated
	 * @ordered
	 */
	LAN(11, "LAN", "LAN"),

	/**
	 * The '<em><b>ISDN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISDN_VALUE
	 * @generated
	 * @ordered
	 */
	ISDN(12, "ISDN", "ISDN"),

	/**
	 * The '<em><b>Frame Relay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_RELAY_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_RELAY(13, "FrameRelay", "FrameRelay"),

	/**
	 * The '<em><b>ATM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATM_VALUE
	 * @generated
	 * @ordered
	 */
	ATM(14, "ATM", "ATM"),

	/**
	 * The '<em><b>E164</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E164_VALUE
	 * @generated
	 * @ordered
	 */
	E164(15, "E164", "E164"),

	/**
	 * The '<em><b>Infiniband</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINIBAND_VALUE
	 * @generated
	 * @ordered
	 */
	INFINIBAND(16, "Infiniband", "Infiniband"),

	/**
	 * The '<em><b>Fibre Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIBRE_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	FIBRE_CHANNEL(17, "FibreChannel", "FibreChannel"),

	/**
	 * The '<em><b>Policy Repository</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLICY_REPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	POLICY_REPOSITORY(18, "PolicyRepository", "PolicyRepository"),

	/**
	 * The '<em><b>Fibre Channel Worldwide Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIBRE_CHANNEL_WORLDWIDE_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	FIBRE_CHANNEL_WORLDWIDE_NAME(19, "FibreChannelWorldwideName", "FibreChannelWorldwideName");

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
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>Autonomous System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autonomous System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTONOMOUS_SYSTEM
	 * @model name="AutonomousSystem" literal="Autonomous System"
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMOUS_SYSTEM_VALUE = 1;

	/**
	 * The '<em><b>Network Access Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Network Access Provider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWORK_ACCESS_PROVIDER
	 * @model name="NetworkAccessProvider"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_ACCESS_PROVIDER_VALUE = 2;

	/**
	 * The '<em><b>Network Operations Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Network Operations Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWORK_OPERATIONS_CENTER
	 * @model name="NetworkOperationsCenter" literal="Network Operations Center"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_OPERATIONS_CENTER_VALUE = 3;

	/**
	 * The '<em><b>Pointof Presence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pointof Presence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINTOF_PRESENCE
	 * @model name="PointofPresence"
	 * @generated
	 * @ordered
	 */
	public static final int POINTOF_PRESENCE_VALUE = 4;

	/**
	 * The '<em><b>Regional Network Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regional Network Provider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_NETWORK_PROVIDER
	 * @model name="RegionalNetworkProvider" literal="Regional Network Provider"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_NETWORK_PROVIDER_VALUE = 5;

	/**
	 * The '<em><b>IP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_VALUE = 6;

	/**
	 * The '<em><b>IPX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPX_VALUE = 7;

	/**
	 * The '<em><b>SNA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SNA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNA_VALUE = 8;

	/**
	 * The '<em><b>Dial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAL
	 * @model name="Dial"
	 * @generated
	 * @ordered
	 */
	public static final int DIAL_VALUE = 9;

	/**
	 * The '<em><b>WAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAN_VALUE = 10;

	/**
	 * The '<em><b>LAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAN_VALUE = 11;

	/**
	 * The '<em><b>ISDN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISDN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISDN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISDN_VALUE = 12;

	/**
	 * The '<em><b>Frame Relay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frame Relay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME_RELAY
	 * @model name="FrameRelay"
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_RELAY_VALUE = 13;

	/**
	 * The '<em><b>ATM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATM_VALUE = 14;

	/**
	 * The '<em><b>E164</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E164</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E164
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E164_VALUE = 15;

	/**
	 * The '<em><b>Infiniband</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infiniband</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFINIBAND
	 * @model name="Infiniband"
	 * @generated
	 * @ordered
	 */
	public static final int INFINIBAND_VALUE = 16;

	/**
	 * The '<em><b>Fibre Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fibre Channel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIBRE_CHANNEL
	 * @model name="FibreChannel"
	 * @generated
	 * @ordered
	 */
	public static final int FIBRE_CHANNEL_VALUE = 17;

	/**
	 * The '<em><b>Policy Repository</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Policy Repository</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLICY_REPOSITORY
	 * @model name="PolicyRepository"
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_REPOSITORY_VALUE = 18;

	/**
	 * The '<em><b>Fibre Channel Worldwide Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fibre Channel Worldwide Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIBRE_CHANNEL_WORLDWIDE_NAME
	 * @model name="FibreChannelWorldwideName"
	 * @generated
	 * @ordered
	 */
	public static final int FIBRE_CHANNEL_WORLDWIDE_NAME_VALUE = 19;

	/**
	 * An array of all the '<em><b>Enum Name Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumNameFormat[] VALUES_ARRAY =
		new EnumNameFormat[] {
			OTHER,
			AUTONOMOUS_SYSTEM,
			NETWORK_ACCESS_PROVIDER,
			NETWORK_OPERATIONS_CENTER,
			POINTOF_PRESENCE,
			REGIONAL_NETWORK_PROVIDER,
			IP,
			IPX,
			SNA,
			DIAL,
			WAN,
			LAN,
			ISDN,
			FRAME_RELAY,
			ATM,
			E164,
			INFINIBAND,
			FIBRE_CHANNEL,
			POLICY_REPOSITORY,
			FIBRE_CHANNEL_WORLDWIDE_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Name Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumNameFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Name Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumNameFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumNameFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Name Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumNameFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumNameFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Name Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumNameFormat get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case AUTONOMOUS_SYSTEM_VALUE: return AUTONOMOUS_SYSTEM;
			case NETWORK_ACCESS_PROVIDER_VALUE: return NETWORK_ACCESS_PROVIDER;
			case NETWORK_OPERATIONS_CENTER_VALUE: return NETWORK_OPERATIONS_CENTER;
			case POINTOF_PRESENCE_VALUE: return POINTOF_PRESENCE;
			case REGIONAL_NETWORK_PROVIDER_VALUE: return REGIONAL_NETWORK_PROVIDER;
			case IP_VALUE: return IP;
			case IPX_VALUE: return IPX;
			case SNA_VALUE: return SNA;
			case DIAL_VALUE: return DIAL;
			case WAN_VALUE: return WAN;
			case LAN_VALUE: return LAN;
			case ISDN_VALUE: return ISDN;
			case FRAME_RELAY_VALUE: return FRAME_RELAY;
			case ATM_VALUE: return ATM;
			case E164_VALUE: return E164;
			case INFINIBAND_VALUE: return INFINIBAND;
			case FIBRE_CHANNEL_VALUE: return FIBRE_CHANNEL;
			case POLICY_REPOSITORY_VALUE: return POLICY_REPOSITORY;
			case FIBRE_CHANNEL_WORLDWIDE_NAME_VALUE: return FIBRE_CHANNEL_WORLDWIDE_NAME;
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
	private EnumNameFormat(int value, String name, String literal) {
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
	
} //EnumNameFormat
