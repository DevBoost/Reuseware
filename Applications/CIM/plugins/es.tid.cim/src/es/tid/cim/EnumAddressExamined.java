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
 * A representation of the literals of the enumeration '<em><b>Enum Address Examined</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumAddressExamined()
 * @model
 * @generated
 */
public enum EnumAddressExamined implements Enumerator {
	/**
	 * The '<em><b>Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE(2, "Source", "Source"),

	/**
	 * The '<em><b>Destination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTINATION_VALUE
	 * @generated
	 * @ordered
	 */
	DESTINATION(3, "Destination", "Destination"),

	/**
	 * The '<em><b>Both Sourc Destination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_SOURC_DESTINATION_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH_SOURC_DESTINATION(4, "BothSourcDestination", "Both Source and Destination");

	/**
	 * The '<em><b>Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE
	 * @model name="Source"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_VALUE = 2;

	/**
	 * The '<em><b>Destination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Destination</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTINATION
	 * @model name="Destination"
	 * @generated
	 * @ordered
	 */
	public static final int DESTINATION_VALUE = 3;

	/**
	 * The '<em><b>Both Sourc Destination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both Sourc Destination</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_SOURC_DESTINATION
	 * @model name="BothSourcDestination" literal="Both Source and Destination"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_SOURC_DESTINATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Enum Address Examined</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumAddressExamined[] VALUES_ARRAY =
		new EnumAddressExamined[] {
			SOURCE,
			DESTINATION,
			BOTH_SOURC_DESTINATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Address Examined</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumAddressExamined> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Address Examined</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAddressExamined get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumAddressExamined result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Address Examined</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAddressExamined getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumAddressExamined result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Address Examined</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumAddressExamined get(int value) {
		switch (value) {
			case SOURCE_VALUE: return SOURCE;
			case DESTINATION_VALUE: return DESTINATION;
			case BOTH_SOURC_DESTINATION_VALUE: return BOTH_SOURC_DESTINATION;
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
	private EnumAddressExamined(int value, String name, String literal) {
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
	
} //EnumAddressExamined
