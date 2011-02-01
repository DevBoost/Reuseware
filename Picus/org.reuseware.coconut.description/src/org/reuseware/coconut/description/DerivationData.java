/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.coconut.description;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.DerivationData#getDerivatorID <em>Derivator ID</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.DerivationData#getRule <em>Rule</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.DerivationData#isDerivationDone <em>Derivation Done</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getDerivationData()
 * @model abstract="true"
 * @generated
 */
public interface DerivationData extends EObject {
	/**
	 * Returns the value of the '<em><b>Derivator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivator ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivator ID</em>' attribute.
	 * @see #setDerivatorID(String)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getDerivationData_DerivatorID()
	 * @model
	 * @generated
	 */
	String getDerivatorID();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.DerivationData#getDerivatorID <em>Derivator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivator ID</em>' attribute.
	 * @see #getDerivatorID()
	 * @generated
	 */
	void setDerivatorID(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see #setRule(String)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getDerivationData_Rule()
	 * @model default=""
	 * @generated
	 */
	String getRule();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.DerivationData#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(String value);

	/**
	 * Returns the value of the '<em><b>Derivation Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Done</em>' attribute.
	 * @see #setDerivationDone(boolean)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getDerivationData_DerivationDone()
	 * @model
	 * @generated
	 */
	boolean isDerivationDone();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.DerivationData#isDerivationDone <em>Derivation Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Done</em>' attribute.
	 * @see #isDerivationDone()
	 * @generated
	 */
	void setDerivationDone(boolean value);

} // DerivationData
