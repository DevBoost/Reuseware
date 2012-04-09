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
package org.oasisopen.names.tc.opendocument.xmlns.table;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.ValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNullDateType()
 * @model extendedMetaData="name='null-date_._type' kind='empty'"
 * @generated
 */
public interface NullDateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Value</b></em>' attribute.
	 * The default value is <code>"1899-12-30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Value</em>' attribute.
	 * @see #isSetDateValue()
	 * @see #unsetDateValue()
	 * @see #setDateValue(XMLGregorianCalendar)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNullDateType_DateValue()
	 * @model default="1899-12-30" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Date"
	 *        extendedMetaData="kind='attribute' name='date-value' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getDateValue <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Value</em>' attribute.
	 * @see #isSetDateValue()
	 * @see #unsetDateValue()
	 * @see #getDateValue()
	 * @generated
	 */
	void setDateValue(XMLGregorianCalendar value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getDateValue <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDateValue()
	 * @see #getDateValue()
	 * @see #setDateValue(XMLGregorianCalendar)
	 * @generated
	 */
	void unsetDateValue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getDateValue <em>Date Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date Value</em>' attribute is set.
	 * @see #unsetDateValue()
	 * @see #getDateValue()
	 * @see #setDateValue(XMLGregorianCalendar)
	 * @generated
	 */
	boolean isSetDateValue();

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The default value is <code>"date"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ValueType
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #setValueType(ValueType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNullDateType_ValueType()
	 * @model default="date" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueType getValueType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ValueType
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueType()
	 * @see #getValueType()
	 * @see #setValueType(ValueType)
	 * @generated
	 */
	void unsetValueType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType#getValueType <em>Value Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Type</em>' attribute is set.
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @see #setValueType(ValueType)
	 * @generated
	 */
	boolean isSetValueType();

} // NullDateType
