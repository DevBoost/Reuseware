/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.application.taipan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.reuseware.application.taipan.RouteSlot;
import org.reuseware.application.taipan.TaiPanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.impl.RouteSlotImpl#getPortName <em>Port Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteSlotImpl extends RouteTypeImpl implements RouteSlot {
	/**
	 * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NAME_EDEFAULT = null; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected String portName = PORT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaiPanPackage.Literals.ROUTE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortName() {
		return portName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortName(String newPortName) {
		String oldPortName = portName;
		portName = newPortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.ROUTE_SLOT__PORT_NAME, oldPortName, portName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TaiPanPackage.ROUTE_SLOT__PORT_NAME:
			return getPortName();
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
		case TaiPanPackage.ROUTE_SLOT__PORT_NAME:
			setPortName((String) newValue);
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
		case TaiPanPackage.ROUTE_SLOT__PORT_NAME:
			setPortName(PORT_NAME_EDEFAULT);
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
		case TaiPanPackage.ROUTE_SLOT__PORT_NAME:
			return PORT_NAME_EDEFAULT == null ? portName != null
					: !PORT_NAME_EDEFAULT.equals(portName);
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
		result.append(" (portName: "); //$NON-NLS-1$
		result.append(portName);
		result.append(')');
		return result.toString();
	}

} //RouteSlotImpl
