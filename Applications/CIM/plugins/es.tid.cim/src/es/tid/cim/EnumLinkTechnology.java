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
 * A representation of the literals of the enumeration '<em><b>Enum Link Technology</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumLinkTechnology()
 * @model
 * @generated
 */
public enum EnumLinkTechnology implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "Other", "Other"),

	/**
	 * The '<em><b>Ethernet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET(2, "Ethernet", "Ethernet"),

	/**
	 * The '<em><b>IB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IB_VALUE
	 * @generated
	 * @ordered
	 */
	IB(3, "IB", "IB"),

	/**
	 * The '<em><b>FC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FC_VALUE
	 * @generated
	 * @ordered
	 */
	FC(4, "FC", "FC"),

	/**
	 * The '<em><b>FDDI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FDDI_VALUE
	 * @generated
	 * @ordered
	 */
	FDDI(5, "FDDI", "FDDI"),

	/**
	 * The '<em><b>ATM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATM_VALUE
	 * @generated
	 * @ordered
	 */
	ATM(6, "ATM", "ATM"),

	/**
	 * The '<em><b>Token Ring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_RING_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_RING(7, "TokenRing", "Token Ring"),

	/**
	 * The '<em><b>Frame Relay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_RELAY_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_RELAY(8, "FrameRelay", "FrameRelay"),

	/**
	 * The '<em><b>Infrared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFRARED_VALUE
	 * @generated
	 * @ordered
	 */
	INFRARED(9, "Infrared", "Infrared"),

	/**
	 * The '<em><b>Blue Tooth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_TOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE_TOOTH(10, "BlueTooth", "BlueTooth"),

	/**
	 * The '<em><b>Wireless LAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRELESS_LAN_VALUE
	 * @generated
	 * @ordered
	 */
	WIRELESS_LAN(11, "WirelessLAN", "WirelessLAN");

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
	public static final int UNKNOWN_VALUE = 0;

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
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>Ethernet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET
	 * @model name="Ethernet"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET_VALUE = 2;

	/**
	 * The '<em><b>IB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IB_VALUE = 3;

	/**
	 * The '<em><b>FC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FC_VALUE = 4;

	/**
	 * The '<em><b>FDDI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FDDI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FDDI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FDDI_VALUE = 5;

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
	public static final int ATM_VALUE = 6;

	/**
	 * The '<em><b>Token Ring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Ring</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_RING
	 * @model name="TokenRing" literal="Token Ring"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_RING_VALUE = 7;

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
	public static final int FRAME_RELAY_VALUE = 8;

	/**
	 * The '<em><b>Infrared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infrared</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFRARED
	 * @model name="Infrared"
	 * @generated
	 * @ordered
	 */
	public static final int INFRARED_VALUE = 9;

	/**
	 * The '<em><b>Blue Tooth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blue Tooth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE_TOOTH
	 * @model name="BlueTooth"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_TOOTH_VALUE = 10;

	/**
	 * The '<em><b>Wireless LAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wireless LAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIRELESS_LAN
	 * @model name="WirelessLAN"
	 * @generated
	 * @ordered
	 */
	public static final int WIRELESS_LAN_VALUE = 11;

	/**
	 * An array of all the '<em><b>Enum Link Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumLinkTechnology[] VALUES_ARRAY =
		new EnumLinkTechnology[] {
			UNKNOWN,
			OTHER,
			ETHERNET,
			IB,
			FC,
			FDDI,
			ATM,
			TOKEN_RING,
			FRAME_RELAY,
			INFRARED,
			BLUE_TOOTH,
			WIRELESS_LAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Link Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumLinkTechnology> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Link Technology</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLinkTechnology get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLinkTechnology result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Link Technology</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLinkTechnology getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLinkTechnology result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Link Technology</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLinkTechnology get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case ETHERNET_VALUE: return ETHERNET;
			case IB_VALUE: return IB;
			case FC_VALUE: return FC;
			case FDDI_VALUE: return FDDI;
			case ATM_VALUE: return ATM;
			case TOKEN_RING_VALUE: return TOKEN_RING;
			case FRAME_RELAY_VALUE: return FRAME_RELAY;
			case INFRARED_VALUE: return INFRARED;
			case BLUE_TOOTH_VALUE: return BLUE_TOOTH;
			case WIRELESS_LAN_VALUE: return WIRELESS_LAN;
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
	private EnumLinkTechnology(int value, String name, String literal) {
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
	
} //EnumLinkTechnology
