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
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Stop Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getChar <em>Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderColor <em>Leader Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderStyle <em>Leader Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderText <em>Leader Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderTextStyle <em>Leader Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderType <em>Leader Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderWidth <em>Leader Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType()
 * @model extendedMetaData="name='tab-stop_._type' kind='empty'"
 * @generated
 */
public interface TabStopType extends EObject {
	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_Char()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Character"
	 *        extendedMetaData="kind='attribute' name='char' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(String value);

	/**
	 * Returns the value of the '<em><b>Leader Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Color</em>' attribute.
	 * @see #setLeaderColor(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_LeaderColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorType"
	 *        extendedMetaData="kind='attribute' name='leader-color' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLeaderColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderColor <em>Leader Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Color</em>' attribute.
	 * @see #getLeaderColor()
	 * @generated
	 */
	void setLeaderColor(Object value);

	/**
	 * Returns the value of the '<em><b>Leader Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetLeaderStyle()
	 * @see #unsetLeaderStyle()
	 * @see #setLeaderStyle(LineStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_LeaderStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='leader-style' namespace='##targetNamespace'"
	 * @generated
	 */
	LineStyle getLeaderStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderStyle <em>Leader Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetLeaderStyle()
	 * @see #unsetLeaderStyle()
	 * @see #getLeaderStyle()
	 * @generated
	 */
	void setLeaderStyle(LineStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderStyle <em>Leader Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeaderStyle()
	 * @see #getLeaderStyle()
	 * @see #setLeaderStyle(LineStyle)
	 * @generated
	 */
	void unsetLeaderStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderStyle <em>Leader Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leader Style</em>' attribute is set.
	 * @see #unsetLeaderStyle()
	 * @see #getLeaderStyle()
	 * @see #setLeaderStyle(LineStyle)
	 * @generated
	 */
	boolean isSetLeaderStyle();

	/**
	 * Returns the value of the '<em><b>Leader Text</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Text</em>' attribute.
	 * @see #isSetLeaderText()
	 * @see #unsetLeaderText()
	 * @see #setLeaderText(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_LeaderText()
	 * @model default=" " unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='leader-text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeaderText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderText <em>Leader Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Text</em>' attribute.
	 * @see #isSetLeaderText()
	 * @see #unsetLeaderText()
	 * @see #getLeaderText()
	 * @generated
	 */
	void setLeaderText(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderText <em>Leader Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeaderText()
	 * @see #getLeaderText()
	 * @see #setLeaderText(String)
	 * @generated
	 */
	void unsetLeaderText();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderText <em>Leader Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leader Text</em>' attribute is set.
	 * @see #unsetLeaderText()
	 * @see #getLeaderText()
	 * @see #setLeaderText(String)
	 * @generated
	 */
	boolean isSetLeaderText();

	/**
	 * Returns the value of the '<em><b>Leader Text Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Text Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Text Style</em>' attribute.
	 * @see #setLeaderTextStyle(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_LeaderTextStyle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.LeaderTextStyleType"
	 *        extendedMetaData="kind='attribute' name='leader-text-style' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeaderTextStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderTextStyle <em>Leader Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Text Style</em>' attribute.
	 * @see #getLeaderTextStyle()
	 * @generated
	 */
	void setLeaderTextStyle(String value);

	/**
	 * Returns the value of the '<em><b>Leader Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineType
	 * @see #isSetLeaderType()
	 * @see #unsetLeaderType()
	 * @see #setLeaderType(LineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_LeaderType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='leader-type' namespace='##targetNamespace'"
	 * @generated
	 */
	LineType getLeaderType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderType <em>Leader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineType
	 * @see #isSetLeaderType()
	 * @see #unsetLeaderType()
	 * @see #getLeaderType()
	 * @generated
	 */
	void setLeaderType(LineType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderType <em>Leader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeaderType()
	 * @see #getLeaderType()
	 * @see #setLeaderType(LineType)
	 * @generated
	 */
	void unsetLeaderType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderType <em>Leader Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leader Type</em>' attribute is set.
	 * @see #unsetLeaderType()
	 * @see #getLeaderType()
	 * @see #setLeaderType(LineType)
	 * @generated
	 */
	boolean isSetLeaderType();

	/**
	 * Returns the value of the '<em><b>Leader Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Width</em>' attribute.
	 * @see #setLeaderWidth(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_LeaderWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LineWidth"
	 *        extendedMetaData="kind='attribute' name='leader-width' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLeaderWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getLeaderWidth <em>Leader Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Width</em>' attribute.
	 * @see #getLeaderWidth()
	 * @generated
	 */
	void setLeaderWidth(Object value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_Position()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength" required="true"
	 *        extendedMetaData="kind='attribute' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType1 getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	boolean isSetType();

} // TabStopType
