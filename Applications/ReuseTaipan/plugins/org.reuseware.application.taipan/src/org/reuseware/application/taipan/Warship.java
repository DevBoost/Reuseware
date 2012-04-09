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
/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.Warship#getEscortOrder <em>Escort Order</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.Warship#getAttackOrders <em>Attack Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.application.taipan.TaiPanPackage#getWarship()
 * @model
 * @generated
 */
public interface Warship extends Ship {

	/**
	 * Returns the value of the '<em><b>Escort Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escort Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escort Order</em>' containment reference.
	 * @see #setEscortOrder(EscortShipsOrder)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getWarship_EscortOrder()
	 * @model containment="true"
	 * @generated
	 */
	EscortShipsOrder getEscortOrder();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.Warship#getEscortOrder <em>Escort Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escort Order</em>' containment reference.
	 * @see #getEscortOrder()
	 * @generated
	 */
	void setEscortOrder(EscortShipsOrder value);

	/**
	 * Returns the value of the '<em><b>Attack Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.application.taipan.BesiegePortOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Orders</em>' containment reference list.
	 * @see org.reuseware.application.taipan.TaiPanPackage#getWarship_AttackOrders()
	 * @model containment="true"
	 * @generated
	 */
	EList<BesiegePortOrder> getAttackOrders();

} // Warship
