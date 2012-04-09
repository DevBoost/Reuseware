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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consolidation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getFunction <em>Function</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getLinkToSourceData <em>Link To Source Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getSourceCellRangeAddresses <em>Source Cell Range Addresses</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getTargetCellAddress <em>Target Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getUseLabels <em>Use Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getConsolidationType()
 * @model extendedMetaData="name='consolidation_._type' kind='empty'"
 * @generated
 */
public interface ConsolidationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getConsolidationType_Function()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionType" required="true"
	 *        extendedMetaData="kind='attribute' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFunction();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Object value);

	/**
	 * Returns the value of the '<em><b>Link To Source Data</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To Source Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Source Data</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLinkToSourceData()
	 * @see #unsetLinkToSourceData()
	 * @see #setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getConsolidationType_LinkToSourceData()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='link-to-source-data' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLinkToSourceData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getLinkToSourceData <em>Link To Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Source Data</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLinkToSourceData()
	 * @see #unsetLinkToSourceData()
	 * @see #getLinkToSourceData()
	 * @generated
	 */
	void setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getLinkToSourceData <em>Link To Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinkToSourceData()
	 * @see #getLinkToSourceData()
	 * @see #setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLinkToSourceData();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getLinkToSourceData <em>Link To Source Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Link To Source Data</em>' attribute is set.
	 * @see #unsetLinkToSourceData()
	 * @see #getLinkToSourceData()
	 * @see #setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLinkToSourceData();

	/**
	 * Returns the value of the '<em><b>Source Cell Range Addresses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cell Range Addresses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cell Range Addresses</em>' attribute.
	 * @see #setSourceCellRangeAddresses(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getConsolidationType_SourceCellRangeAddresses()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddressList" required="true"
	 *        extendedMetaData="kind='attribute' name='source-cell-range-addresses' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceCellRangeAddresses();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getSourceCellRangeAddresses <em>Source Cell Range Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cell Range Addresses</em>' attribute.
	 * @see #getSourceCellRangeAddresses()
	 * @generated
	 */
	void setSourceCellRangeAddresses(String value);

	/**
	 * Returns the value of the '<em><b>Target Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cell Address</em>' attribute.
	 * @see #setTargetCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getConsolidationType_TargetCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress" required="true"
	 *        extendedMetaData="kind='attribute' name='target-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getTargetCellAddress <em>Target Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cell Address</em>' attribute.
	 * @see #getTargetCellAddress()
	 * @generated
	 */
	void setTargetCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>Use Labels</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType
	 * @see #isSetUseLabels()
	 * @see #unsetUseLabels()
	 * @see #setUseLabels(UseLabelsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getConsolidationType_UseLabels()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-labels' namespace='##targetNamespace'"
	 * @generated
	 */
	UseLabelsType getUseLabels();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getUseLabels <em>Use Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType
	 * @see #isSetUseLabels()
	 * @see #unsetUseLabels()
	 * @see #getUseLabels()
	 * @generated
	 */
	void setUseLabels(UseLabelsType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getUseLabels <em>Use Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseLabels()
	 * @see #getUseLabels()
	 * @see #setUseLabels(UseLabelsType)
	 * @generated
	 */
	void unsetUseLabels();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType#getUseLabels <em>Use Labels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Labels</em>' attribute is set.
	 * @see #unsetUseLabels()
	 * @see #getUseLabels()
	 * @see #setUseLabels(UseLabelsType)
	 * @generated
	 */
	boolean isSetUseLabels();

} // ConsolidationType
