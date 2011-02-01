/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.ConnectivityCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ConnectivityCollectionImpl#getConnectivityStatus <em>Connectivity Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectivityCollectionImpl extends SystemSpecificCollectionImpl implements ConnectivityCollection {
	/**
	 * The default value of the '{@link #getConnectivityStatus() <em>Connectivity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTIVITY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityStatus() <em>Connectivity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityStatus()
	 * @generated
	 * @ordered
	 */
	protected String connectivityStatus = CONNECTIVITY_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getConnectivityCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectivityStatus() {
		return connectivityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityStatus(String newConnectivityStatus) {
		String oldConnectivityStatus = connectivityStatus;
		connectivityStatus = newConnectivityStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS, oldConnectivityStatus, connectivityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS:
				return getConnectivityStatus();
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
			case CimPackage.CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS:
				setConnectivityStatus((String)newValue);
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
			case CimPackage.CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS:
				setConnectivityStatus(CONNECTIVITY_STATUS_EDEFAULT);
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
			case CimPackage.CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS:
				return CONNECTIVITY_STATUS_EDEFAULT == null ? connectivityStatus != null : !CONNECTIVITY_STATUS_EDEFAULT.equals(connectivityStatus);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (connectivityStatus: ");
		result.append(connectivityStatus);
		result.append(')');
		return result.toString();
	}

} //ConnectivityCollectionImpl
