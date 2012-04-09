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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getMaximumDifference <em>Maximum Difference</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getStatus <em>Status</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getIterationType()
 * @model extendedMetaData="name='iteration_._type' kind='empty'"
 * @generated
 */
public interface IterationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Maximum Difference</b></em>' attribute.
	 * The default value is <code>"0.001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Difference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Difference</em>' attribute.
	 * @see #isSetMaximumDifference()
	 * @see #unsetMaximumDifference()
	 * @see #setMaximumDifference(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getIterationType_MaximumDifference()
	 * @model default="0.001" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='maximum-difference' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaximumDifference();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getMaximumDifference <em>Maximum Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Difference</em>' attribute.
	 * @see #isSetMaximumDifference()
	 * @see #unsetMaximumDifference()
	 * @see #getMaximumDifference()
	 * @generated
	 */
	void setMaximumDifference(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getMaximumDifference <em>Maximum Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumDifference()
	 * @see #getMaximumDifference()
	 * @see #setMaximumDifference(double)
	 * @generated
	 */
	void unsetMaximumDifference();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getMaximumDifference <em>Maximum Difference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Difference</em>' attribute is set.
	 * @see #unsetMaximumDifference()
	 * @see #getMaximumDifference()
	 * @see #setMaximumDifference(double)
	 * @generated
	 */
	boolean isSetMaximumDifference();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"disable"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(StatusType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getIterationType_Status()
	 * @model default="disable" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' attribute.
	 * @see #isSetSteps()
	 * @see #unsetSteps()
	 * @see #setSteps(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getIterationType_Steps()
	 * @model default="100" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='steps' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSteps();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getSteps <em>Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps</em>' attribute.
	 * @see #isSetSteps()
	 * @see #unsetSteps()
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getSteps <em>Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteps()
	 * @see #getSteps()
	 * @see #setSteps(BigInteger)
	 * @generated
	 */
	void unsetSteps();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType#getSteps <em>Steps</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steps</em>' attribute is set.
	 * @see #unsetSteps()
	 * @see #getSteps()
	 * @see #setSteps(BigInteger)
	 * @generated
	 */
	boolean isSetSteps();

} // IterationType
