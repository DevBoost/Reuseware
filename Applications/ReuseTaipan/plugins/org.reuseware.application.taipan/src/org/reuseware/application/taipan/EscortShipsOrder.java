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
package org.reuseware.application.taipan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escort Ships Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.EscortShipsOrder#getShips <em>Ships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.application.taipan.TaiPanPackage#getEscortShipsOrder()
 * @model
 * @generated
 */
public interface EscortShipsOrder extends Order {

	/**
	 * Returns the value of the '<em><b>Ships</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.application.taipan.Ship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ships</em>' reference list.
	 * @see org.reuseware.application.taipan.TaiPanPackage#getEscortShipsOrder_Ships()
	 * @model required="true"
	 * @generated
	 */
	EList<Ship> getShips();

} // EscortShipsOrder
