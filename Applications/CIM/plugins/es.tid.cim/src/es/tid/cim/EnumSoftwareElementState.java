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
 * A representation of the literals of the enumeration '<em><b>Enum Software Element State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumSoftwareElementState()
 * @model
 * @generated
 */
public enum EnumSoftwareElementState implements Enumerator {
	/**
	 * The '<em><b>Deployable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYABLE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYABLE(0, "Deployable", "Deployable"),

	/**
	 * The '<em><b>Installable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLABLE_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLABLE(1, "Installable", "Installable"),

	/**
	 * The '<em><b>Executable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTABLE(2, "Executable", "Executable"),

	/**
	 * The '<em><b>Running</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNING(3, "Running", "Running");

	/**
	 * The '<em><b>Deployable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deployable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYABLE
	 * @model name="Deployable"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYABLE_VALUE = 0;

	/**
	 * The '<em><b>Installable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Installable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTALLABLE
	 * @model name="Installable"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLABLE_VALUE = 1;

	/**
	 * The '<em><b>Executable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Executable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTABLE
	 * @model name="Executable"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTABLE_VALUE = 2;

	/**
	 * The '<em><b>Running</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Running</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNNING
	 * @model name="Running"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Enum Software Element State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumSoftwareElementState[] VALUES_ARRAY =
		new EnumSoftwareElementState[] {
			DEPLOYABLE,
			INSTALLABLE,
			EXECUTABLE,
			RUNNING,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Software Element State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumSoftwareElementState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Software Element State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumSoftwareElementState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumSoftwareElementState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Software Element State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumSoftwareElementState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumSoftwareElementState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Software Element State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumSoftwareElementState get(int value) {
		switch (value) {
			case DEPLOYABLE_VALUE: return DEPLOYABLE;
			case INSTALLABLE_VALUE: return INSTALLABLE;
			case EXECUTABLE_VALUE: return EXECUTABLE;
			case RUNNING_VALUE: return RUNNING;
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
	private EnumSoftwareElementState(int value, String name, String literal) {
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
	
} //EnumSoftwareElementState
