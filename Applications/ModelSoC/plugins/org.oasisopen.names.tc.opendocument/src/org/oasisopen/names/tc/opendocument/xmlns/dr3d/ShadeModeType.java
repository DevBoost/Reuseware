/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.dr3d;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shade Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getShadeModeType()
 * @model extendedMetaData="name='shade-mode_._type'"
 * @generated
 */
public enum ShadeModeType implements Enumerator {
	/**
	 * The '<em><b>Flat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT(0, "flat", "flat"),

	/**
	 * The '<em><b>Phong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONG_VALUE
	 * @generated
	 * @ordered
	 */
	PHONG(1, "phong", "phong"),

	/**
	 * The '<em><b>Gouraud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOURAUD_VALUE
	 * @generated
	 * @ordered
	 */
	GOURAUD(2, "gouraud", "gouraud"),

	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(3, "draft", "draft");

	/**
	 * The '<em><b>Flat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAT
	 * @model name="flat"
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_VALUE = 0;

	/**
	 * The '<em><b>Phong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phong</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHONG
	 * @model name="phong"
	 * @generated
	 * @ordered
	 */
	public static final int PHONG_VALUE = 1;

	/**
	 * The '<em><b>Gouraud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gouraud</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOURAUD
	 * @model name="gouraud"
	 * @generated
	 * @ordered
	 */
	public static final int GOURAUD_VALUE = 2;

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Draft</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAFT
	 * @model name="draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Shade Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ShadeModeType[] VALUES_ARRAY =
		new ShadeModeType[] {
			FLAT,
			PHONG,
			GOURAUD,
			DRAFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Shade Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ShadeModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shade Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShadeModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShadeModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shade Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShadeModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShadeModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shade Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShadeModeType get(int value) {
		switch (value) {
			case FLAT_VALUE: return FLAT;
			case PHONG_VALUE: return PHONG;
			case GOURAUD_VALUE: return GOURAUD;
			case DRAFT_VALUE: return DRAFT;
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
	private ShadeModeType(int value, String name, String literal) {
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
	
} //ShadeModeType
