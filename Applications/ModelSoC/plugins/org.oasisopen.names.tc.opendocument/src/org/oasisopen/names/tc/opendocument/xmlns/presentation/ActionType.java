/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
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
 * A representation of the literals of the enumeration '<em><b>Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getActionType()
 * @model extendedMetaData="name='action_._type'"
 * @generated
 */
public enum ActionType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Previous Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUS_PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUS_PAGE(1, "previousPage", "previous-page"),

	/**
	 * The '<em><b>Next Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT_PAGE(2, "nextPage", "next-page"),

	/**
	 * The '<em><b>First Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_PAGE(3, "firstPage", "first-page"),

	/**
	 * The '<em><b>Last Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_PAGE(4, "lastPage", "last-page"),

	/**
	 * The '<em><b>Hide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDE_VALUE
	 * @generated
	 * @ordered
	 */
	HIDE(5, "hide", "hide"),

	/**
	 * The '<em><b>Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_VALUE
	 * @generated
	 * @ordered
	 */
	STOP(6, "stop", "stop"),

	/**
	 * The '<em><b>Execute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTE_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTE(7, "execute", "execute"),

	/**
	 * The '<em><b>Show</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOW_VALUE
	 * @generated
	 * @ordered
	 */
	SHOW(8, "show", "show"),

	/**
	 * The '<em><b>Verb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERB_VALUE
	 * @generated
	 * @ordered
	 */
	VERB(9, "verb", "verb"),

	/**
	 * The '<em><b>Fade Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FADE_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	FADE_OUT(10, "fadeOut", "fade-out"),

	/**
	 * The '<em><b>Sound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND(11, "sound", "sound");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Previous Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Previous Page</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREVIOUS_PAGE
	 * @model name="previousPage" literal="previous-page"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUS_PAGE_VALUE = 1;

	/**
	 * The '<em><b>Next Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Next Page</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT_PAGE
	 * @model name="nextPage" literal="next-page"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_PAGE_VALUE = 2;

	/**
	 * The '<em><b>First Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>First Page</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRST_PAGE
	 * @model name="firstPage" literal="first-page"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_PAGE_VALUE = 3;

	/**
	 * The '<em><b>Last Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Last Page</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAST_PAGE
	 * @model name="lastPage" literal="last-page"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_PAGE_VALUE = 4;

	/**
	 * The '<em><b>Hide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIDE
	 * @model name="hide"
	 * @generated
	 * @ordered
	 */
	public static final int HIDE_VALUE = 5;

	/**
	 * The '<em><b>Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP
	 * @model name="stop"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_VALUE = 6;

	/**
	 * The '<em><b>Execute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Execute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTE
	 * @model name="execute"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTE_VALUE = 7;

	/**
	 * The '<em><b>Show</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Show</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHOW
	 * @model name="show"
	 * @generated
	 * @ordered
	 */
	public static final int SHOW_VALUE = 8;

	/**
	 * The '<em><b>Verb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERB
	 * @model name="verb"
	 * @generated
	 * @ordered
	 */
	public static final int VERB_VALUE = 9;

	/**
	 * The '<em><b>Fade Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fade Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FADE_OUT
	 * @model name="fadeOut" literal="fade-out"
	 * @generated
	 * @ordered
	 */
	public static final int FADE_OUT_VALUE = 10;

	/**
	 * The '<em><b>Sound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sound</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND
	 * @model name="sound"
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_VALUE = 11;

	/**
	 * An array of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionType[] VALUES_ARRAY =
		new ActionType[] {
			NONE,
			PREVIOUS_PAGE,
			NEXT_PAGE,
			FIRST_PAGE,
			LAST_PAGE,
			HIDE,
			STOP,
			EXECUTE,
			SHOW,
			VERB,
			FADE_OUT,
			SOUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case PREVIOUS_PAGE_VALUE: return PREVIOUS_PAGE;
			case NEXT_PAGE_VALUE: return NEXT_PAGE;
			case FIRST_PAGE_VALUE: return FIRST_PAGE;
			case LAST_PAGE_VALUE: return LAST_PAGE;
			case HIDE_VALUE: return HIDE;
			case STOP_VALUE: return STOP;
			case EXECUTE_VALUE: return EXECUTE;
			case SHOW_VALUE: return SHOW;
			case VERB_VALUE: return VERB;
			case FADE_OUT_VALUE: return FADE_OUT;
			case SOUND_VALUE: return SOUND;
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
	private ActionType(int value, String name, String literal) {
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
	
} //ActionType
