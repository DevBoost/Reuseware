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
 * A representation of the literals of the enumeration '<em><b>Enum Port Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumPortType()
 * @model
 * @generated
 */
public enum EnumPortType implements Enumerator {
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
	 * The '<em><b>Not Applicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(2, "NotApplicable", "NotApplicable"),

	/**
	 * The '<em><b>10 Base T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10_BASE_T_VALUE
	 * @generated
	 * @ordered
	 */
	_10_BASE_T(50, "_10BaseT", "10BaseT"),

	/**
	 * The '<em><b>10 100 Base T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10_100_BASE_T_VALUE
	 * @generated
	 * @ordered
	 */
	_10_100_BASE_T(51, "_10_100BaseT", "10-100BaseT"),

	/**
	 * The '<em><b>100 Base T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_100_BASE_T_VALUE
	 * @generated
	 * @ordered
	 */
	_100_BASE_T(52, "_100BaseT", "100BaseT"),

	/**
	 * The '<em><b>1000 Base T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1000_BASE_T_VALUE
	 * @generated
	 * @ordered
	 */
	_1000_BASE_T(53, "_1000BaseT", "1000BaseT"),

	/**
	 * The '<em><b>2500 Base T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2500_BASE_T_VALUE
	 * @generated
	 * @ordered
	 */
	_2500_BASE_T(54, "_2500BaseT", "2500BaseT"),

	/**
	 * The '<em><b>10G Base T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_T_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_T(55, "_10GBaseT", "10GBaseT"),

	/**
	 * The '<em><b>10G Base CX4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_CX4_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_CX4(56, "_10GBase_CX4", "10GBase-CX4"),

	/**
	 * The '<em><b>802 11a</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11A_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11A(70, "_802_11a", "802.11a"),

	/**
	 * The '<em><b>802 11b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11B_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11B(71, "_802_11b", "802.11b"),

	/**
	 * The '<em><b>802 11g</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11G_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11G(72, "_802_11g", "802.11g"),

	/**
	 * The '<em><b>802 11n</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11N_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11N(73, "_802_11n", "802.11n"),

	/**
	 * The '<em><b>100 Base FX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_100_BASE_FX_VALUE
	 * @generated
	 * @ordered
	 */
	_100_BASE_FX(100, "_100Base_FX", "100Base-FX"),

	/**
	 * The '<em><b>100 Base SX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_100_BASE_SX_VALUE
	 * @generated
	 * @ordered
	 */
	_100_BASE_SX(101, "_100Base_SX", "100Base-SX"),

	/**
	 * The '<em><b>1000 Base SX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1000_BASE_SX_VALUE
	 * @generated
	 * @ordered
	 */
	_1000_BASE_SX(102, "_1000Base_SX", "1000Base-SX"),

	/**
	 * The '<em><b>1000 Base LX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1000_BASE_LX_VALUE
	 * @generated
	 * @ordered
	 */
	_1000_BASE_LX(103, "_1000Base_LX", "1000Base-LX"),

	/**
	 * The '<em><b>1000 Base CX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1000_BASE_CX_VALUE
	 * @generated
	 * @ordered
	 */
	_1000_BASE_CX(104, "_1000Base_CX", "1000Base-CX"),

	/**
	 * The '<em><b>10G Base SR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_SR_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_SR(105, "_10GBase_SR", "10GBase-SR"),

	/**
	 * The '<em><b>10G Base SW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_SW_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_SW(106, "_10GBase_SW", "10GBase-SW"),

	/**
	 * The '<em><b>10G Base LX4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_LX4_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_LX4(107, "_10GBase_LX4", "10GBase-LX4"),

	/**
	 * The '<em><b>10G Base LR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_LR_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_LR(108, "_10GBase_LR", "10GBase-LR"),

	/**
	 * The '<em><b>10G Base LW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_LW_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_LW(109, "_10GBase_LW", "10GBase-LW"),

	/**
	 * The '<em><b>10G Base ER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_ER_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_ER(110, "_10GBase_ER", "10GBase-ER"),

	/**
	 * The '<em><b>10G Base EW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_EW_VALUE
	 * @generated
	 * @ordered
	 */
	_10G_BASE_EW(111, "_10GBase_EW", "10GBase-EW"),

	/**
	 * The '<em><b>Client Station</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_STATION_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_STATION(75, "ClientStation", "ClientStation"),

	/**
	 * The '<em><b>Repeater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEATER_VALUE
	 * @generated
	 * @ordered
	 */
	REPEATER(76, "Repeater", "Repeater"),

	/**
	 * The '<em><b>Access Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_POINT(77, "AccessPoint", "AccessPoint"),

	/**
	 * The '<em><b>Bridge Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	BRIDGE_HOST(78, "BridgeHost", "Bridge Host"),

	/**
	 * The '<em><b>Bridge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_VALUE
	 * @generated
	 * @ordered
	 */
	BRIDGE(79, "Bridge", "Bridge"),

	/**
	 * The '<em><b>Bridge Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	BRIDGE_ROOT(80, "BridgeRoot", "BridgeRoot");

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
	 * The '<em><b>Not Applicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Applicable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE
	 * @model name="NotApplicable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_APPLICABLE_VALUE = 2;

	/**
	 * The '<em><b>10 Base T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10 Base T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10_BASE_T
	 * @model name="_10BaseT" literal="10BaseT"
	 * @generated
	 * @ordered
	 */
	public static final int _10_BASE_T_VALUE = 50;

	/**
	 * The '<em><b>10 100 Base T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10 100 Base T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10_100_BASE_T
	 * @model name="_10_100BaseT" literal="10-100BaseT"
	 * @generated
	 * @ordered
	 */
	public static final int _10_100_BASE_T_VALUE = 51;

	/**
	 * The '<em><b>100 Base T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>100 Base T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_100_BASE_T
	 * @model name="_100BaseT" literal="100BaseT"
	 * @generated
	 * @ordered
	 */
	public static final int _100_BASE_T_VALUE = 52;

	/**
	 * The '<em><b>1000 Base T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1000 Base T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1000_BASE_T
	 * @model name="_1000BaseT" literal="1000BaseT"
	 * @generated
	 * @ordered
	 */
	public static final int _1000_BASE_T_VALUE = 53;

	/**
	 * The '<em><b>2500 Base T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>2500 Base T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_2500_BASE_T
	 * @model name="_2500BaseT" literal="2500BaseT"
	 * @generated
	 * @ordered
	 */
	public static final int _2500_BASE_T_VALUE = 54;

	/**
	 * The '<em><b>10G Base T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_T
	 * @model name="_10GBaseT" literal="10GBaseT"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_T_VALUE = 55;

	/**
	 * The '<em><b>10G Base CX4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base CX4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_CX4
	 * @model name="_10GBase_CX4" literal="10GBase-CX4"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_CX4_VALUE = 56;

	/**
	 * The '<em><b>802 11a</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>802 11a</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_802_11A
	 * @model name="_802_11a" literal="802.11a"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11A_VALUE = 70;

	/**
	 * The '<em><b>802 11b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>802 11b</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_802_11B
	 * @model name="_802_11b" literal="802.11b"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11B_VALUE = 71;

	/**
	 * The '<em><b>802 11g</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>802 11g</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_802_11G
	 * @model name="_802_11g" literal="802.11g"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11G_VALUE = 72;

	/**
	 * The '<em><b>802 11n</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>802 11n</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_802_11N
	 * @model name="_802_11n" literal="802.11n"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11N_VALUE = 73;

	/**
	 * The '<em><b>100 Base FX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>100 Base FX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_100_BASE_FX
	 * @model name="_100Base_FX" literal="100Base-FX"
	 * @generated
	 * @ordered
	 */
	public static final int _100_BASE_FX_VALUE = 100;

	/**
	 * The '<em><b>100 Base SX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>100 Base SX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_100_BASE_SX
	 * @model name="_100Base_SX" literal="100Base-SX"
	 * @generated
	 * @ordered
	 */
	public static final int _100_BASE_SX_VALUE = 101;

	/**
	 * The '<em><b>1000 Base SX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1000 Base SX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1000_BASE_SX
	 * @model name="_1000Base_SX" literal="1000Base-SX"
	 * @generated
	 * @ordered
	 */
	public static final int _1000_BASE_SX_VALUE = 102;

	/**
	 * The '<em><b>1000 Base LX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1000 Base LX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1000_BASE_LX
	 * @model name="_1000Base_LX" literal="1000Base-LX"
	 * @generated
	 * @ordered
	 */
	public static final int _1000_BASE_LX_VALUE = 103;

	/**
	 * The '<em><b>1000 Base CX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1000 Base CX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1000_BASE_CX
	 * @model name="_1000Base_CX" literal="1000Base-CX"
	 * @generated
	 * @ordered
	 */
	public static final int _1000_BASE_CX_VALUE = 104;

	/**
	 * The '<em><b>10G Base SR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base SR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_SR
	 * @model name="_10GBase_SR" literal="10GBase-SR"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_SR_VALUE = 105;

	/**
	 * The '<em><b>10G Base SW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base SW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_SW
	 * @model name="_10GBase_SW" literal="10GBase-SW"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_SW_VALUE = 106;

	/**
	 * The '<em><b>10G Base LX4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base LX4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_LX4
	 * @model name="_10GBase_LX4" literal="10GBase-LX4"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_LX4_VALUE = 107;

	/**
	 * The '<em><b>10G Base LR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base LR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_LR
	 * @model name="_10GBase_LR" literal="10GBase-LR"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_LR_VALUE = 108;

	/**
	 * The '<em><b>10G Base LW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base LW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_LW
	 * @model name="_10GBase_LW" literal="10GBase-LW"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_LW_VALUE = 109;

	/**
	 * The '<em><b>10G Base ER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base ER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_ER
	 * @model name="_10GBase_ER" literal="10GBase-ER"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_ER_VALUE = 110;

	/**
	 * The '<em><b>10G Base EW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>10G Base EW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_10G_BASE_EW
	 * @model name="_10GBase_EW" literal="10GBase-EW"
	 * @generated
	 * @ordered
	 */
	public static final int _10G_BASE_EW_VALUE = 111;

	/**
	 * The '<em><b>Client Station</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Client Station</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENT_STATION
	 * @model name="ClientStation"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_STATION_VALUE = 75;

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
	public static final int REPEATER_VALUE = 76;

	/**
	 * The '<em><b>Access Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Access Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESS_POINT
	 * @model name="AccessPoint"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_POINT_VALUE = 77;

	/**
	 * The '<em><b>Bridge Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bridge Host</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_HOST
	 * @model name="BridgeHost" literal="Bridge Host"
	 * @generated
	 * @ordered
	 */
	public static final int BRIDGE_HOST_VALUE = 78;

	/**
	 * The '<em><b>Bridge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bridge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRIDGE
	 * @model name="Bridge"
	 * @generated
	 * @ordered
	 */
	public static final int BRIDGE_VALUE = 79;

	/**
	 * The '<em><b>Bridge Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bridge Root</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_ROOT
	 * @model name="BridgeRoot"
	 * @generated
	 * @ordered
	 */
	public static final int BRIDGE_ROOT_VALUE = 80;

	/**
	 * An array of all the '<em><b>Enum Port Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumPortType[] VALUES_ARRAY =
		new EnumPortType[] {
			UNKNOWN,
			OTHER,
			NOT_APPLICABLE,
			_10_BASE_T,
			_10_100_BASE_T,
			_100_BASE_T,
			_1000_BASE_T,
			_2500_BASE_T,
			_10G_BASE_T,
			_10G_BASE_CX4,
			_802_11A,
			_802_11B,
			_802_11G,
			_802_11N,
			_100_BASE_FX,
			_100_BASE_SX,
			_1000_BASE_SX,
			_1000_BASE_LX,
			_1000_BASE_CX,
			_10G_BASE_SR,
			_10G_BASE_SW,
			_10G_BASE_LX4,
			_10G_BASE_LR,
			_10G_BASE_LW,
			_10G_BASE_ER,
			_10G_BASE_EW,
			CLIENT_STATION,
			REPEATER,
			ACCESS_POINT,
			BRIDGE_HOST,
			BRIDGE,
			BRIDGE_ROOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Port Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumPortType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Port Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumPortType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumPortType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Port Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumPortType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumPortType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Port Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumPortType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
			case _10_BASE_T_VALUE: return _10_BASE_T;
			case _10_100_BASE_T_VALUE: return _10_100_BASE_T;
			case _100_BASE_T_VALUE: return _100_BASE_T;
			case _1000_BASE_T_VALUE: return _1000_BASE_T;
			case _2500_BASE_T_VALUE: return _2500_BASE_T;
			case _10G_BASE_T_VALUE: return _10G_BASE_T;
			case _10G_BASE_CX4_VALUE: return _10G_BASE_CX4;
			case _802_11A_VALUE: return _802_11A;
			case _802_11B_VALUE: return _802_11B;
			case _802_11G_VALUE: return _802_11G;
			case _802_11N_VALUE: return _802_11N;
			case _100_BASE_FX_VALUE: return _100_BASE_FX;
			case _100_BASE_SX_VALUE: return _100_BASE_SX;
			case _1000_BASE_SX_VALUE: return _1000_BASE_SX;
			case _1000_BASE_LX_VALUE: return _1000_BASE_LX;
			case _1000_BASE_CX_VALUE: return _1000_BASE_CX;
			case _10G_BASE_SR_VALUE: return _10G_BASE_SR;
			case _10G_BASE_SW_VALUE: return _10G_BASE_SW;
			case _10G_BASE_LX4_VALUE: return _10G_BASE_LX4;
			case _10G_BASE_LR_VALUE: return _10G_BASE_LR;
			case _10G_BASE_LW_VALUE: return _10G_BASE_LW;
			case _10G_BASE_ER_VALUE: return _10G_BASE_ER;
			case _10G_BASE_EW_VALUE: return _10G_BASE_EW;
			case CLIENT_STATION_VALUE: return CLIENT_STATION;
			case REPEATER_VALUE: return REPEATER;
			case ACCESS_POINT_VALUE: return ACCESS_POINT;
			case BRIDGE_HOST_VALUE: return BRIDGE_HOST;
			case BRIDGE_VALUE: return BRIDGE;
			case BRIDGE_ROOT_VALUE: return BRIDGE_ROOT;
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
	private EnumPortType(int value, String name, String literal) {
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
	
} //EnumPortType
