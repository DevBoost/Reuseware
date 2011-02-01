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
 * A representation of the literals of the enumeration '<em><b>Texture Generation Mode XType</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getTextureGenerationModeXType()
 * @model extendedMetaData="name='texture-generation-mode-x_._type'"
 * @generated
 */
public enum TextureGenerationModeXType implements Enumerator {
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
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL(1, "parallel", "parallel"),

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
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_VALUE = 1;

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
	 * An array of all the '<em><b>Texture Generation Mode XType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextureGenerationModeXType[] VALUES_ARRAY =
		new TextureGenerationModeXType[] {
			OBJECT,
			PARALLEL,
			SPHERE,
		};

	/**
	 * A public read-only list of all the '<em><b>Texture Generation Mode XType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextureGenerationModeXType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Texture Generation Mode XType</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextureGenerationModeXType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextureGenerationModeXType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Texture Generation Mode XType</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextureGenerationModeXType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextureGenerationModeXType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Texture Generation Mode XType</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextureGenerationModeXType get(int value) {
		switch (value) {
			case OBJECT_VALUE: return OBJECT;
			case PARALLEL_VALUE: return PARALLEL;
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
	private TextureGenerationModeXType(int value, String name, String literal) {
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
	
} //TextureGenerationModeXType
