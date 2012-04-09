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
package org.oasisopen.names.tc.opendocument.xmlns.datastyle;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getEmbeddedText <em>Embedded Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDecimalReplacement <em>Decimal Replacement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDisplayFactor <em>Display Factor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getMinIntegerDigits <em>Min Integer Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getNumberType()
 * @model extendedMetaData="name='number_._type' kind='elementOnly'"
 * @generated
 */
public interface NumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Embedded Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Text</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getNumberType_EmbeddedText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='embedded-text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EmbeddedTextType> getEmbeddedText();

	/**
	 * Returns the value of the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Places</em>' attribute.
	 * @see #setDecimalPlaces(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getNumberType_DecimalPlaces()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='decimal-places' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDecimalPlaces();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDecimalPlaces <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Places</em>' attribute.
	 * @see #getDecimalPlaces()
	 * @generated
	 */
	void setDecimalPlaces(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Decimal Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Replacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Replacement</em>' attribute.
	 * @see #setDecimalReplacement(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getNumberType_DecimalReplacement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='decimal-replacement' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDecimalReplacement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDecimalReplacement <em>Decimal Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Replacement</em>' attribute.
	 * @see #getDecimalReplacement()
	 * @generated
	 */
	void setDecimalReplacement(Object value);

	/**
	 * Returns the value of the '<em><b>Display Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Factor</em>' attribute.
	 * @see #isSetDisplayFactor()
	 * @see #unsetDisplayFactor()
	 * @see #setDisplayFactor(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getNumberType_DisplayFactor()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='display-factor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDisplayFactor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDisplayFactor <em>Display Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Factor</em>' attribute.
	 * @see #isSetDisplayFactor()
	 * @see #unsetDisplayFactor()
	 * @see #getDisplayFactor()
	 * @generated
	 */
	void setDisplayFactor(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDisplayFactor <em>Display Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayFactor()
	 * @see #getDisplayFactor()
	 * @see #setDisplayFactor(double)
	 * @generated
	 */
	void unsetDisplayFactor();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getDisplayFactor <em>Display Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Factor</em>' attribute is set.
	 * @see #unsetDisplayFactor()
	 * @see #getDisplayFactor()
	 * @see #setDisplayFactor(double)
	 * @generated
	 */
	boolean isSetDisplayFactor();

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetGrouping()
	 * @see #unsetGrouping()
	 * @see #setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getNumberType_Grouping()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='grouping' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getGrouping();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetGrouping()
	 * @see #unsetGrouping()
	 * @see #getGrouping()
	 * @generated
	 */
	void setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrouping()
	 * @see #getGrouping()
	 * @see #setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetGrouping();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getGrouping <em>Grouping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grouping</em>' attribute is set.
	 * @see #unsetGrouping()
	 * @see #getGrouping()
	 * @see #setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetGrouping();

	/**
	 * Returns the value of the '<em><b>Min Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Integer Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Integer Digits</em>' attribute.
	 * @see #setMinIntegerDigits(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getNumberType_MinIntegerDigits()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='min-integer-digits' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinIntegerDigits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType#getMinIntegerDigits <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Integer Digits</em>' attribute.
	 * @see #getMinIntegerDigits()
	 * @generated
	 */
	void setMinIntegerDigits(BigInteger value);

} // NumberType
