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
import es.tid.cim.ConnectivityMemberhipSettingData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Memberhip Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ConnectivityMemberhipSettingDataImpl#getConnectivityMembershipType <em>Connectivity Membership Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.ConnectivityMemberhipSettingDataImpl#getOtherConnectivityMembershipType <em>Other Connectivity Membership Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.ConnectivityMemberhipSettingDataImpl#getConnectivityMembershipID <em>Connectivity Membership ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectivityMemberhipSettingDataImpl extends SettingDataImpl implements ConnectivityMemberhipSettingData {
	/**
	 * The default value of the '{@link #getConnectivityMembershipType() <em>Connectivity Membership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityMembershipType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityMembershipType() <em>Connectivity Membership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityMembershipType()
	 * @generated
	 * @ordered
	 */
	protected String connectivityMembershipType = CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherConnectivityMembershipType() <em>Other Connectivity Membership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConnectivityMembershipType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherConnectivityMembershipType() <em>Other Connectivity Membership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConnectivityMembershipType()
	 * @generated
	 * @ordered
	 */
	protected String otherConnectivityMembershipType = OTHER_CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectivityMembershipID() <em>Connectivity Membership ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityMembershipID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTIVITY_MEMBERSHIP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityMembershipID() <em>Connectivity Membership ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityMembershipID()
	 * @generated
	 * @ordered
	 */
	protected String connectivityMembershipID = CONNECTIVITY_MEMBERSHIP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityMemberhipSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getConnectivityMemberhipSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectivityMembershipType() {
		return connectivityMembershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityMembershipType(String newConnectivityMembershipType) {
		String oldConnectivityMembershipType = connectivityMembershipType;
		connectivityMembershipType = newConnectivityMembershipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_TYPE, oldConnectivityMembershipType, connectivityMembershipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherConnectivityMembershipType() {
		return otherConnectivityMembershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherConnectivityMembershipType(String newOtherConnectivityMembershipType) {
		String oldOtherConnectivityMembershipType = otherConnectivityMembershipType;
		otherConnectivityMembershipType = newOtherConnectivityMembershipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBERSHIP_TYPE, oldOtherConnectivityMembershipType, otherConnectivityMembershipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectivityMembershipID() {
		return connectivityMembershipID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityMembershipID(String newConnectivityMembershipID) {
		String oldConnectivityMembershipID = connectivityMembershipID;
		connectivityMembershipID = newConnectivityMembershipID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_ID, oldConnectivityMembershipID, connectivityMembershipID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_TYPE:
				return getConnectivityMembershipType();
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBERSHIP_TYPE:
				return getOtherConnectivityMembershipType();
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_ID:
				return getConnectivityMembershipID();
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
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_TYPE:
				setConnectivityMembershipType((String)newValue);
				return;
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBERSHIP_TYPE:
				setOtherConnectivityMembershipType((String)newValue);
				return;
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_ID:
				setConnectivityMembershipID((String)newValue);
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
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_TYPE:
				setConnectivityMembershipType(CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT);
				return;
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBERSHIP_TYPE:
				setOtherConnectivityMembershipType(OTHER_CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT);
				return;
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_ID:
				setConnectivityMembershipID(CONNECTIVITY_MEMBERSHIP_ID_EDEFAULT);
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
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_TYPE:
				return CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT == null ? connectivityMembershipType != null : !CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT.equals(connectivityMembershipType);
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBERSHIP_TYPE:
				return OTHER_CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT == null ? otherConnectivityMembershipType != null : !OTHER_CONNECTIVITY_MEMBERSHIP_TYPE_EDEFAULT.equals(otherConnectivityMembershipType);
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_ID:
				return CONNECTIVITY_MEMBERSHIP_ID_EDEFAULT == null ? connectivityMembershipID != null : !CONNECTIVITY_MEMBERSHIP_ID_EDEFAULT.equals(connectivityMembershipID);
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
		result.append(" (connectivityMembershipType: ");
		result.append(connectivityMembershipType);
		result.append(", otherConnectivityMembershipType: ");
		result.append(otherConnectivityMembershipType);
		result.append(", connectivityMembershipID: ");
		result.append(connectivityMembershipID);
		result.append(')');
		return result.toString();
	}

} //ConnectivityMemberhipSettingDataImpl
