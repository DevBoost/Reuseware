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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Besiege Port Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.BesiegePortOrder#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.application.taipan.TaiPanPackage#getBesiegePortOrder()
 * @model
 * @generated
 */
public interface BesiegePortOrder extends Order {

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(PortType)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getBesiegePortOrder_Port()
	 * @model required="true"
	 * @generated
	 */
	PortType getPort();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.BesiegePortOrder#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(PortType value);

} // BesiegePortOrder
