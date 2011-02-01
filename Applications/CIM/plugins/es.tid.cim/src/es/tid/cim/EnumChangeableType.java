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
 * A representation of the literals of the enumeration '<em><b>Enum Changeable Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumChangeableType()
 * @model
 * @generated
 */
public enum EnumChangeableType implements Enumerator {
	/**
	 * The '<em><b>Not Changeable Persistent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CHANGEABLE_PERSISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_CHANGEABLE_PERSISTENT(0, "NotChangeable_Persistent", "Not Changeable - Persistent"),

	/**
	 * The '<em><b>Changeable Transient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGEABLE_TRANSIENT_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGEABLE_TRANSIENT(1, "Changeable_Transient", "Changeable - Transient"),

	/**
	 * The '<em><b>Changeable Persistent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGEABLE_PERSISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGEABLE_PERSISTENT(2, "Changeable_Persistent", "Changeable - Persistent"),

	/**
	 * The '<em><b>Not Changeable Transient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CHANGEABLE_TRANSIENT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_CHANGEABLE_TRANSIENT(3, "NotChangeable_Transient", "NotChangeable_Transient");

	/**
	 * The '<em><b>Not Changeable Persistent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Changeable Persistent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_CHANGEABLE_PERSISTENT
	 * @model name="NotChangeable_Persistent" literal="Not Changeable - Persistent"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_CHANGEABLE_PERSISTENT_VALUE = 0;

	/**
	 * The '<em><b>Changeable Transient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Changeable Transient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGEABLE_TRANSIENT
	 * @model name="Changeable_Transient" literal="Changeable - Transient"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGEABLE_TRANSIENT_VALUE = 1;

	/**
	 * The '<em><b>Changeable Persistent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Changeable Persistent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGEABLE_PERSISTENT
	 * @model name="Changeable_Persistent" literal="Changeable - Persistent"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGEABLE_PERSISTENT_VALUE = 2;

	/**
	 * The '<em><b>Not Changeable Transient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Changeable Transient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_CHANGEABLE_TRANSIENT
	 * @model name="NotChangeable_Transient"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_CHANGEABLE_TRANSIENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Enum Changeable Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumChangeableType[] VALUES_ARRAY =
		new EnumChangeableType[] {
			NOT_CHANGEABLE_PERSISTENT,
			CHANGEABLE_TRANSIENT,
			CHANGEABLE_PERSISTENT,
			NOT_CHANGEABLE_TRANSIENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Changeable Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumChangeableType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Changeable Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumChangeableType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumChangeableType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Changeable Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumChangeableType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumChangeableType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Changeable Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumChangeableType get(int value) {
		switch (value) {
			case NOT_CHANGEABLE_PERSISTENT_VALUE: return NOT_CHANGEABLE_PERSISTENT;
			case CHANGEABLE_TRANSIENT_VALUE: return CHANGEABLE_TRANSIENT;
			case CHANGEABLE_PERSISTENT_VALUE: return CHANGEABLE_PERSISTENT;
			case NOT_CHANGEABLE_TRANSIENT_VALUE: return NOT_CHANGEABLE_TRANSIENT;
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
	private EnumChangeableType(int value, String name, String literal) {
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
	
} //EnumChangeableType
