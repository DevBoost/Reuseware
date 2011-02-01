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
 * A representation of the literals of the enumeration '<em><b>Enum Match Condition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumMatchConditionType()
 * @model
 * @generated
 */
public enum EnumMatchConditionType implements Enumerator {
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
	 * The '<em><b>Source Address Mask</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_ADDRESS_MASK_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_ADDRESS_MASK(2, "SourceAddressMask", "Source Address and Mask"),

	/**
	 * The '<em><b>Destination Address Mask</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTINATION_ADDRESS_MASK_VALUE
	 * @generated
	 * @ordered
	 */
	DESTINATION_ADDRESS_MASK(3, "DestinationAddressMask", "Destination Address and Mask"),

	/**
	 * The '<em><b>Source Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_PORT(4, "SourcePort", "Source Port"),

	/**
	 * The '<em><b>Source Port Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_PORT_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_PORT_RANGE(5, "SourcePortRange", "Source Port Range"),

	/**
	 * The '<em><b>Destination Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTINATION_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	DESTINATION_PORT(6, "DestinationPort", "Destination Port"),

	/**
	 * The '<em><b>Destination Port Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTINATION_PORT_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	DESTINATION_PORT_RANGE(7, "DestinationPortRange", "Destination Port Range"),

	/**
	 * The '<em><b>Protocol Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_TYPE(8, "ProtocolType", "Protocol Type"),

	/**
	 * The '<em><b>Protocol Type Option</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_TYPE_OPTION_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_TYPE_OPTION(9, "ProtocolTypeOption", "Protocol Type and Option"),

	/**
	 * The '<em><b>DSCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSCP_VALUE
	 * @generated
	 * @ordered
	 */
	DSCP(10, "DSCP", "DSCP"),

	/**
	 * The '<em><b>To SValue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_SVALUE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_SVALUE(11, "ToSValue", "ToS Value"),

	/**
	 * The '<em><b>PPriority Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPRIORITY_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	PPRIORITY_VALUE(12, "PPriorityValue", "802.1P Priority Value"),

	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(13, "Any", "Any");

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
	 * The '<em><b>Source Address Mask</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source Address Mask</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE_ADDRESS_MASK
	 * @model name="SourceAddressMask" literal="Source Address and Mask"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_ADDRESS_MASK_VALUE = 2;

	/**
	 * The '<em><b>Destination Address Mask</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Destination Address Mask</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTINATION_ADDRESS_MASK
	 * @model name="DestinationAddressMask" literal="Destination Address and Mask"
	 * @generated
	 * @ordered
	 */
	public static final int DESTINATION_ADDRESS_MASK_VALUE = 3;

	/**
	 * The '<em><b>Source Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source Port</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE_PORT
	 * @model name="SourcePort" literal="Source Port"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_PORT_VALUE = 4;

	/**
	 * The '<em><b>Source Port Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source Port Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE_PORT_RANGE
	 * @model name="SourcePortRange" literal="Source Port Range"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_PORT_RANGE_VALUE = 5;

	/**
	 * The '<em><b>Destination Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Destination Port</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTINATION_PORT
	 * @model name="DestinationPort" literal="Destination Port"
	 * @generated
	 * @ordered
	 */
	public static final int DESTINATION_PORT_VALUE = 6;

	/**
	 * The '<em><b>Destination Port Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Destination Port Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTINATION_PORT_RANGE
	 * @model name="DestinationPortRange" literal="Destination Port Range"
	 * @generated
	 * @ordered
	 */
	public static final int DESTINATION_PORT_RANGE_VALUE = 7;

	/**
	 * The '<em><b>Protocol Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protocol Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_TYPE
	 * @model name="ProtocolType" literal="Protocol Type"
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_TYPE_VALUE = 8;

	/**
	 * The '<em><b>Protocol Type Option</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protocol Type Option</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_TYPE_OPTION
	 * @model name="ProtocolTypeOption" literal="Protocol Type and Option"
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_TYPE_OPTION_VALUE = 9;

	/**
	 * The '<em><b>DSCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DSCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DSCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSCP_VALUE = 10;

	/**
	 * The '<em><b>To SValue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To SValue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_SVALUE
	 * @model name="ToSValue" literal="ToS Value"
	 * @generated
	 * @ordered
	 */
	public static final int TO_SVALUE_VALUE = 11;

	/**
	 * The '<em><b>PPriority Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PPriority Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPRIORITY_VALUE
	 * @model name="PPriorityValue" literal="802.1P Priority Value"
	 * @generated
	 * @ordered
	 */
	public static final int PPRIORITY_VALUE_VALUE = 12;

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model name="Any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 13;

	/**
	 * An array of all the '<em><b>Enum Match Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumMatchConditionType[] VALUES_ARRAY =
		new EnumMatchConditionType[] {
			OTHER,
			SOURCE_ADDRESS_MASK,
			DESTINATION_ADDRESS_MASK,
			SOURCE_PORT,
			SOURCE_PORT_RANGE,
			DESTINATION_PORT,
			DESTINATION_PORT_RANGE,
			PROTOCOL_TYPE,
			PROTOCOL_TYPE_OPTION,
			DSCP,
			TO_SVALUE,
			PPRIORITY_VALUE,
			ANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Match Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumMatchConditionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Match Condition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumMatchConditionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumMatchConditionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Match Condition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumMatchConditionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumMatchConditionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Match Condition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumMatchConditionType get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case SOURCE_ADDRESS_MASK_VALUE: return SOURCE_ADDRESS_MASK;
			case DESTINATION_ADDRESS_MASK_VALUE: return DESTINATION_ADDRESS_MASK;
			case SOURCE_PORT_VALUE: return SOURCE_PORT;
			case SOURCE_PORT_RANGE_VALUE: return SOURCE_PORT_RANGE;
			case DESTINATION_PORT_VALUE: return DESTINATION_PORT;
			case DESTINATION_PORT_RANGE_VALUE: return DESTINATION_PORT_RANGE;
			case PROTOCOL_TYPE_VALUE: return PROTOCOL_TYPE;
			case PROTOCOL_TYPE_OPTION_VALUE: return PROTOCOL_TYPE_OPTION;
			case DSCP_VALUE: return DSCP;
			case TO_SVALUE_VALUE: return TO_SVALUE;
			case PPRIORITY_VALUE_VALUE: return PPRIORITY_VALUE;
			case ANY_VALUE: return ANY;
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
	private EnumMatchConditionType(int value, String name, String literal) {
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
	
} //EnumMatchConditionType
