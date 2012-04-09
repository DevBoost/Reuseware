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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getDefaultCellStyleName <em>Default Cell Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableColumnType()
 * @model extendedMetaData="name='table-column_._type' kind='empty'"
 * @generated
 */
public interface TableColumnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Cell Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Cell Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cell Style Name</em>' attribute.
	 * @see #setDefaultCellStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableColumnType_DefaultCellStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.DefaultCellStyleNameType"
	 *        extendedMetaData="kind='attribute' name='default-cell-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultCellStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getDefaultCellStyleName <em>Default Cell Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cell Style Name</em>' attribute.
	 * @see #getDefaultCellStyleName()
	 * @generated
	 */
	void setDefaultCellStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Number Columns Repeated</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Columns Repeated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Columns Repeated</em>' attribute.
	 * @see #isSetNumberColumnsRepeated()
	 * @see #unsetNumberColumnsRepeated()
	 * @see #setNumberColumnsRepeated(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableColumnType_NumberColumnsRepeated()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-columns-repeated' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberColumnsRepeated();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Columns Repeated</em>' attribute.
	 * @see #isSetNumberColumnsRepeated()
	 * @see #unsetNumberColumnsRepeated()
	 * @see #getNumberColumnsRepeated()
	 * @generated
	 */
	void setNumberColumnsRepeated(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberColumnsRepeated()
	 * @see #getNumberColumnsRepeated()
	 * @see #setNumberColumnsRepeated(BigInteger)
	 * @generated
	 */
	void unsetNumberColumnsRepeated();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Columns Repeated</em>' attribute is set.
	 * @see #unsetNumberColumnsRepeated()
	 * @see #getNumberColumnsRepeated()
	 * @see #setNumberColumnsRepeated(BigInteger)
	 * @generated
	 */
	boolean isSetNumberColumnsRepeated();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableColumnType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"visible"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableColumnType_Visibility()
	 * @model default="visible" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
	TableVisibilityValue getVisibility();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(TableVisibilityValue value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @generated
	 */
	boolean isSetVisibility();

} // TableColumnType
