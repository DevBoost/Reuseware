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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtotal Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType#getSubtotalField <em>Subtotal Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType#getGroupByFieldNumber <em>Group By Field Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRuleType()
 * @model extendedMetaData="name='subtotal-rule_._type' kind='elementOnly'"
 * @generated
 */
public interface SubtotalRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subtotal Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtotal Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtotal Field</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRuleType_SubtotalField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtotal-field' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubtotalFieldType> getSubtotalField();

	/**
	 * Returns the value of the '<em><b>Group By Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group By Field Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By Field Number</em>' attribute.
	 * @see #setGroupByFieldNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRuleType_GroupByFieldNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='group-by-field-number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getGroupByFieldNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType#getGroupByFieldNumber <em>Group By Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group By Field Number</em>' attribute.
	 * @see #getGroupByFieldNumber()
	 * @generated
	 */
	void setGroupByFieldNumber(BigInteger value);

} // SubtotalRuleType
