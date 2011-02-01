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
 * A representation of the literals of the enumeration '<em><b>Enum Health State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumHealthState()
 * @model
 * @generated
 */
public enum EnumHealthState implements Enumerator {
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
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(5, "OK", "OK"),

	/**
	 * The '<em><b>Degraded Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGRADED_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	DEGRADED_WARNING(10, "Degraded_Warning", "Degraded/Warning"),

	/**
	 * The '<em><b>Minorfailure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINORFAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	MINORFAILURE(15, "Minorfailure", "Minor failure"),

	/**
	 * The '<em><b>Majorfailure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJORFAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	MAJORFAILURE(20, "Majorfailure", "Majorfailure"),

	/**
	 * The '<em><b>Criticalfailure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICALFAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICALFAILURE(25, "Criticalfailure", "Criticalfailure"),

	/**
	 * The '<em><b>Non recoverable Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_RECOVERABLE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	NON_RECOVERABLE_ERROR(30, "Non_recoverableError", "Non_recoverableError");

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
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 5;

	/**
	 * The '<em><b>Degraded Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Degraded Warning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEGRADED_WARNING
	 * @model name="Degraded_Warning" literal="Degraded/Warning"
	 * @generated
	 * @ordered
	 */
	public static final int DEGRADED_WARNING_VALUE = 10;

	/**
	 * The '<em><b>Minorfailure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minorfailure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINORFAILURE
	 * @model name="Minorfailure" literal="Minor failure"
	 * @generated
	 * @ordered
	 */
	public static final int MINORFAILURE_VALUE = 15;

	/**
	 * The '<em><b>Majorfailure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Majorfailure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJORFAILURE
	 * @model name="Majorfailure"
	 * @generated
	 * @ordered
	 */
	public static final int MAJORFAILURE_VALUE = 20;

	/**
	 * The '<em><b>Criticalfailure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Criticalfailure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICALFAILURE
	 * @model name="Criticalfailure"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICALFAILURE_VALUE = 25;

	/**
	 * The '<em><b>Non recoverable Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non recoverable Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_RECOVERABLE_ERROR
	 * @model name="Non_recoverableError"
	 * @generated
	 * @ordered
	 */
	public static final int NON_RECOVERABLE_ERROR_VALUE = 30;

	/**
	 * An array of all the '<em><b>Enum Health State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumHealthState[] VALUES_ARRAY =
		new EnumHealthState[] {
			UNKNOWN,
			OK,
			DEGRADED_WARNING,
			MINORFAILURE,
			MAJORFAILURE,
			CRITICALFAILURE,
			NON_RECOVERABLE_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Health State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumHealthState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Health State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumHealthState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumHealthState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Health State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumHealthState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumHealthState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Health State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumHealthState get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OK_VALUE: return OK;
			case DEGRADED_WARNING_VALUE: return DEGRADED_WARNING;
			case MINORFAILURE_VALUE: return MINORFAILURE;
			case MAJORFAILURE_VALUE: return MAJORFAILURE;
			case CRITICALFAILURE_VALUE: return CRITICALFAILURE;
			case NON_RECOVERABLE_ERROR_VALUE: return NON_RECOVERABLE_ERROR;
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
	private EnumHealthState(int value, String name, String literal) {
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
	
} //EnumHealthState
