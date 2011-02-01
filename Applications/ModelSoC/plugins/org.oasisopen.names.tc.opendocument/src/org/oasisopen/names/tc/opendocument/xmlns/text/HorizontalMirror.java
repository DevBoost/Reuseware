/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Horizontal Mirror</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHorizontalMirror()
 * @model extendedMetaData="name='horizontal-mirror'"
 * @generated
 */
public enum HorizontalMirror implements Enumerator {
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
	 * The '<em><b>Horizontal On Odd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_ON_ODD_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL_ON_ODD(1, "horizontalOnOdd", "horizontal-on-odd"),

	/**
	 * The '<em><b>Horizontal On Even</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_ON_EVEN_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL_ON_EVEN(2, "horizontalOnEven", "horizontal-on-even");

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
	 * The '<em><b>Horizontal On Odd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal On Odd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_ON_ODD
	 * @model name="horizontalOnOdd" literal="horizontal-on-odd"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_ON_ODD_VALUE = 1;

	/**
	 * The '<em><b>Horizontal On Even</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal On Even</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_ON_EVEN
	 * @model name="horizontalOnEven" literal="horizontal-on-even"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_ON_EVEN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Horizontal Mirror</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HorizontalMirror[] VALUES_ARRAY =
		new HorizontalMirror[] {
			HORIZONTAL,
			HORIZONTAL_ON_ODD,
			HORIZONTAL_ON_EVEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Horizontal Mirror</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HorizontalMirror> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Horizontal Mirror</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HorizontalMirror get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HorizontalMirror result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Horizontal Mirror</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HorizontalMirror getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HorizontalMirror result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Horizontal Mirror</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HorizontalMirror get(int value) {
		switch (value) {
			case HORIZONTAL_VALUE: return HORIZONTAL;
			case HORIZONTAL_ON_ODD_VALUE: return HORIZONTAL_ON_ODD;
			case HORIZONTAL_ON_EVEN_VALUE: return HORIZONTAL_ON_EVEN;
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
	private HorizontalMirror(int value, String name, String literal) {
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
	
} //HorizontalMirror
