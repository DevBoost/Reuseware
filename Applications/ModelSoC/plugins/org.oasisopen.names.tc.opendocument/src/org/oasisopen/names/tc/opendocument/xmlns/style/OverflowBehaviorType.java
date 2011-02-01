/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Overflow Behavior Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getOverflowBehaviorType()
 * @model extendedMetaData="name='overflow-behavior_._type'"
 * @generated
 */
public enum OverflowBehaviorType implements Enumerator {
	/**
	 * The '<em><b>Clip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIP_VALUE
	 * @generated
	 * @ordered
	 */
	CLIP(0, "clip", "clip"),

	/**
	 * The '<em><b>Auto Create New Frame</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_CREATE_NEW_FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_CREATE_NEW_FRAME(1, "autoCreateNewFrame", "auto-create-new-frame");

	/**
	 * The '<em><b>Clip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIP
	 * @model name="clip"
	 * @generated
	 * @ordered
	 */
	public static final int CLIP_VALUE = 0;

	/**
	 * The '<em><b>Auto Create New Frame</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto Create New Frame</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_CREATE_NEW_FRAME
	 * @model name="autoCreateNewFrame" literal="auto-create-new-frame"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_CREATE_NEW_FRAME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Overflow Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OverflowBehaviorType[] VALUES_ARRAY =
		new OverflowBehaviorType[] {
			CLIP,
			AUTO_CREATE_NEW_FRAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Overflow Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OverflowBehaviorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Overflow Behavior Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OverflowBehaviorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverflowBehaviorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Overflow Behavior Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OverflowBehaviorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverflowBehaviorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Overflow Behavior Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OverflowBehaviorType get(int value) {
		switch (value) {
			case CLIP_VALUE: return CLIP;
			case AUTO_CREATE_NEW_FRAME_VALUE: return AUTO_CREATE_NEW_FRAME;
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
	private OverflowBehaviorType(int value, String name, String literal) {
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
	
} //OverflowBehaviorType
