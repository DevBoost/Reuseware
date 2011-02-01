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
import es.tid.cim.LANConnectivitySegment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LAN Connectivity Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.LANConnectivitySegmentImpl#getLANID <em>LANID</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANConnectivitySegmentImpl#getConnectivityType <em>Connectivity Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANConnectivitySegmentImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LANConnectivitySegmentImpl extends ConnectivityCollectionImpl implements LANConnectivitySegment {
	/**
	 * The default value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected static final String LANID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected String lanid = LANID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectivityType() <em>Connectivity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTIVITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityType() <em>Connectivity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityType()
	 * @generated
	 * @ordered
	 */
	protected String connectivityType = CONNECTIVITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LANConnectivitySegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getLANConnectivitySegment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLANID() {
		return lanid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLANID(String newLANID) {
		String oldLANID = lanid;
		lanid = newLANID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_CONNECTIVITY_SEGMENT__LANID, oldLANID, lanid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectivityType() {
		return connectivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityType(String newConnectivityType) {
		String oldConnectivityType = connectivityType;
		connectivityType = newConnectivityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE, oldConnectivityType, connectivityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__LANID:
				return getLANID();
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE:
				return getConnectivityType();
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
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
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__LANID:
				setLANID((String)newValue);
				return;
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE:
				setConnectivityType((String)newValue);
				return;
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
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
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__LANID:
				setLANID(LANID_EDEFAULT);
				return;
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE:
				setConnectivityType(CONNECTIVITY_TYPE_EDEFAULT);
				return;
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__LANID:
				return LANID_EDEFAULT == null ? lanid != null : !LANID_EDEFAULT.equals(lanid);
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE:
				return CONNECTIVITY_TYPE_EDEFAULT == null ? connectivityType != null : !CONNECTIVITY_TYPE_EDEFAULT.equals(connectivityType);
			case CimPackage.LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
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
		result.append(" (LANID: ");
		result.append(lanid);
		result.append(", connectivityType: ");
		result.append(connectivityType);
		result.append(", otherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(')');
		return result.toString();
	}

} //LANConnectivitySegmentImpl
