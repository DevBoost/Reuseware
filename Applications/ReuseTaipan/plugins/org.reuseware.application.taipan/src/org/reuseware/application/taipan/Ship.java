/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitri Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.Ship#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.Ship#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.Ship#getRoute <em>Route</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.Ship#getCargo <em>Cargo</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.Ship#getAquatory <em>Aquatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.application.taipan.TaiPanPackage#getShip()
 * @model
 * @generated
 */
public interface Ship extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getShip_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.Ship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(PortType)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getShip_Destination()
	 * @model
	 * @generated
	 */
	PortType getDestination();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.Ship#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(PortType value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(RouteType)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getShip_Route()
	 * @model
	 * @generated
	 */
	RouteType getRoute();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.Ship#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(RouteType value);

	/**
	 * Returns the value of the '<em><b>Cargo</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.application.taipan.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cargo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo</em>' containment reference list.
	 * @see org.reuseware.application.taipan.TaiPanPackage#getShip_Cargo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemType> getCargo();

	/**
	 * Returns the value of the '<em><b>Aquatory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.reuseware.application.taipan.Aquatory#getShips <em>Ships</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aquatory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aquatory</em>' container reference.
	 * @see #setAquatory(Aquatory)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getShip_Aquatory()
	 * @see org.reuseware.application.taipan.Aquatory#getShips
	 * @model opposite="ships" required="true" transient="false"
	 * @generated
	 */
	Aquatory getAquatory();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.Ship#getAquatory <em>Aquatory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aquatory</em>' container reference.
	 * @see #getAquatory()
	 * @generated
	 */
	void setAquatory(Aquatory value);

} // Ship
