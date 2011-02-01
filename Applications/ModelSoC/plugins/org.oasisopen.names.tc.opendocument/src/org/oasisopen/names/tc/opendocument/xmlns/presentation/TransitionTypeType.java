/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transition Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getTransitionTypeType()
 * @model extendedMetaData="name='transition-type_._type'"
 * @generated
 */
public enum TransitionTypeType implements Enumerator {
	/**
	 * The '<em><b>Manual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL(0, "manual", "manual"),

	/**
	 * The '<em><b>Automatic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC(1, "automatic", "automatic"),

	/**
	 * The '<em><b>Semi Automatic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_AUTOMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_AUTOMATIC(2, "semiAutomatic", "semi-automatic");

	/**
	 * The '<em><b>Manual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL
	 * @model name="manual"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_VALUE = 0;

	/**
	 * The '<em><b>Automatic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Automatic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC
	 * @model name="automatic"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_VALUE = 1;

	/**
	 * The '<em><b>Semi Automatic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semi Automatic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMI_AUTOMATIC
	 * @model name="semiAutomatic" literal="semi-automatic"
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_AUTOMATIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transition Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransitionTypeType[] VALUES_ARRAY =
		new TransitionTypeType[] {
			MANUAL,
			AUTOMATIC,
			SEMI_AUTOMATIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Transition Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransitionTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transition Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransitionTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitionTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transition Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransitionTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitionTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transition Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransitionTypeType get(int value) {
		switch (value) {
			case MANUAL_VALUE: return MANUAL;
			case AUTOMATIC_VALUE: return AUTOMATIC;
			case SEMI_AUTOMATIC_VALUE: return SEMI_AUTOMATIC;
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
	private TransitionTypeType(int value, String name, String literal) {
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
	
} //TransitionTypeType
