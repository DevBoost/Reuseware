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
 * A representation of the literals of the enumeration '<em><b>Normals Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getNormalsKindType()
 * @model extendedMetaData="name='normals-kind_._type'"
 * @generated
 */
public enum NormalsKindType implements Enumerator {
	/**
	 * The '<em><b>Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT(0, "object", "object"),

	/**
	 * The '<em><b>Flat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT(1, "flat", "flat"),

	/**
	 * The '<em><b>Sphere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPHERE_VALUE
	 * @generated
	 * @ordered
	 */
	SPHERE(2, "sphere", "sphere");

	/**
	 * The '<em><b>Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT
	 * @model name="object"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_VALUE = 0;

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
	public static final int FLAT_VALUE = 1;

	/**
	 * The '<em><b>Sphere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sphere</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPHERE
	 * @model name="sphere"
	 * @generated
	 * @ordered
	 */
	public static final int SPHERE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Normals Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NormalsKindType[] VALUES_ARRAY =
		new NormalsKindType[] {
			OBJECT,
			FLAT,
			SPHERE,
		};

	/**
	 * A public read-only list of all the '<em><b>Normals Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NormalsKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Normals Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NormalsKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NormalsKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Normals Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NormalsKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NormalsKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Normals Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NormalsKindType get(int value) {
		switch (value) {
			case OBJECT_VALUE: return OBJECT;
			case FLAT_VALUE: return FLAT;
			case SPHERE_VALUE: return SPHERE;
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
	private NormalsKindType(int value, String name, String literal) {
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
	
} //NormalsKindType
