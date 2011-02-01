/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Caption Escape Direction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getCaptionEscapeDirectionType()
 * @model extendedMetaData="name='caption-escape-direction_._type'"
 * @generated
 */
public enum CaptionEscapeDirectionType implements Enumerator {
	/**
	 * The '<em><b>Horizontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL(0, "horizontal", "horizontal"),

	/**
	 * The '<em><b>Vertical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL(1, "vertical", "vertical"),

	/**
	 * The '<em><b>Auto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO(2, "auto", "auto");

	/**
	 * The '<em><b>Horizontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL
	 * @model name="horizontal"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_VALUE = 0;

	/**
	 * The '<em><b>Vertical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL
	 * @model name="vertical"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_VALUE = 1;

	/**
	 * The '<em><b>Auto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO
	 * @model name="auto"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Caption Escape Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CaptionEscapeDirectionType[] VALUES_ARRAY =
		new CaptionEscapeDirectionType[] {
			HORIZONTAL,
			VERTICAL,
			AUTO,
		};

	/**
	 * A public read-only list of all the '<em><b>Caption Escape Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CaptionEscapeDirectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Caption Escape Direction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaptionEscapeDirectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CaptionEscapeDirectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Caption Escape Direction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaptionEscapeDirectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CaptionEscapeDirectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Caption Escape Direction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaptionEscapeDirectionType get(int value) {
		switch (value) {
			case HORIZONTAL_VALUE: return HORIZONTAL;
			case VERTICAL_VALUE: return VERTICAL;
			case AUTO_VALUE: return AUTO;
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
	private CaptionEscapeDirectionType(int value, String name, String literal) {
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
	
} //CaptionEscapeDirectionType
