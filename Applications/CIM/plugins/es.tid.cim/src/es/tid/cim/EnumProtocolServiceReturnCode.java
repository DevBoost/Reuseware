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
 * A representation of the literals of the enumeration '<em><b>Enum Protocol Service Return Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumProtocolServiceReturnCode()
 * @model
 * @generated
 */
public enum EnumProtocolServiceReturnCode implements Enumerator {
	/**
	 * The '<em><b>Completed With No Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_WITH_NO_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED_WITH_NO_ERROR(0, "CompletedWithNoError", "Completed With No Error"),

	/**
	 * The '<em><b>Not Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SUPPORTED(1, "NotSupported", "NotSupported"),

	/**
	 * The '<em><b>Error Occurred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_OCCURRED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_OCCURRED(2, "ErrorOccurred", "Error Occurred");

	/**
	 * The '<em><b>Completed With No Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Completed With No Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_WITH_NO_ERROR
	 * @model name="CompletedWithNoError" literal="Completed With No Error"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_WITH_NO_ERROR_VALUE = 0;

	/**
	 * The '<em><b>Not Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Supported</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_SUPPORTED
	 * @model name="NotSupported"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SUPPORTED_VALUE = 1;

	/**
	 * The '<em><b>Error Occurred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error Occurred</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_OCCURRED
	 * @model name="ErrorOccurred" literal="Error Occurred"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_OCCURRED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Enum Protocol Service Return Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumProtocolServiceReturnCode[] VALUES_ARRAY =
		new EnumProtocolServiceReturnCode[] {
			COMPLETED_WITH_NO_ERROR,
			NOT_SUPPORTED,
			ERROR_OCCURRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Protocol Service Return Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumProtocolServiceReturnCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Protocol Service Return Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumProtocolServiceReturnCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumProtocolServiceReturnCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Protocol Service Return Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumProtocolServiceReturnCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumProtocolServiceReturnCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Protocol Service Return Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumProtocolServiceReturnCode get(int value) {
		switch (value) {
			case COMPLETED_WITH_NO_ERROR_VALUE: return COMPLETED_WITH_NO_ERROR;
			case NOT_SUPPORTED_VALUE: return NOT_SUPPORTED;
			case ERROR_OCCURRED_VALUE: return ERROR_OCCURRED;
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
	private EnumProtocolServiceReturnCode(int value, String name, String literal) {
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
	
} //EnumProtocolServiceReturnCode
