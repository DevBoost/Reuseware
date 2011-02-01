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
package org.reuseware.application.taipan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.reuseware.application.taipan.DestinationType;
import org.reuseware.application.taipan.Route;
import org.reuseware.application.taipan.TaiPanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.impl.RouteImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.RouteImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.RouteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.RouteImpl#getReliability <em>Reliability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends DestinationTypeImpl implements Route {

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DestinationType source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected DestinationType destination;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected static final double RELIABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected double reliability = RELIABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaiPanPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationType getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (DestinationType) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TaiPanPackage.ROUTE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationType basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DestinationType newSource) {
		DestinationType oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.ROUTE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationType getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject) destination;
			destination = (DestinationType) eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TaiPanPackage.ROUTE__DESTINATION, oldDestination,
							destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationType basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(DestinationType newDestination) {
		DestinationType oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.ROUTE__DESTINATION, oldDestination,
					destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.ROUTE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(double newReliability) {
		double oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.ROUTE__RELIABILITY, oldReliability,
					reliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TaiPanPackage.ROUTE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case TaiPanPackage.ROUTE__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		case TaiPanPackage.ROUTE__DESCRIPTION:
			return getDescription();
		case TaiPanPackage.ROUTE__RELIABILITY:
			return getReliability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TaiPanPackage.ROUTE__SOURCE:
			setSource((DestinationType) newValue);
			return;
		case TaiPanPackage.ROUTE__DESTINATION:
			setDestination((DestinationType) newValue);
			return;
		case TaiPanPackage.ROUTE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TaiPanPackage.ROUTE__RELIABILITY:
			setReliability((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TaiPanPackage.ROUTE__SOURCE:
			setSource((DestinationType) null);
			return;
		case TaiPanPackage.ROUTE__DESTINATION:
			setDestination((DestinationType) null);
			return;
		case TaiPanPackage.ROUTE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TaiPanPackage.ROUTE__RELIABILITY:
			setReliability(RELIABILITY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TaiPanPackage.ROUTE__SOURCE:
			return source != null;
		case TaiPanPackage.ROUTE__DESTINATION:
			return destination != null;
		case TaiPanPackage.ROUTE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case TaiPanPackage.ROUTE__RELIABILITY:
			return reliability != RELIABILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", reliability: "); //$NON-NLS-1$
		result.append(reliability);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
