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
import es.tid.cim.OSPFProtocolEndpointBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSPF Protocol Endpoint Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointBaseImpl#getTransitDelay <em>Transit Delay</em>}</li>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointBaseImpl#getRetransmitInterval <em>Retransmit Interval</em>}</li>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointBaseImpl#getAuthType <em>Auth Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointBaseImpl#getOtherAuthType <em>Other Auth Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointBaseImpl#getAuthKey <em>Auth Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSPFProtocolEndpointBaseImpl extends ProtocolEndpointImpl implements OSPFProtocolEndpointBase {
	/**
	 * The default value of the '{@link #getTransitDelay() <em>Transit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSIT_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransitDelay() <em>Transit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitDelay()
	 * @generated
	 * @ordered
	 */
	protected int transitDelay = TRANSIT_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetransmitInterval() <em>Retransmit Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmitInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRANSMIT_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetransmitInterval() <em>Retransmit Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmitInterval()
	 * @generated
	 * @ordered
	 */
	protected int retransmitInterval = RETRANSMIT_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthType() <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthType() <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthType()
	 * @generated
	 * @ordered
	 */
	protected String authType = AUTH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAuthType() <em>Other Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAuthType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_AUTH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAuthType() <em>Other Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAuthType()
	 * @generated
	 * @ordered
	 */
	protected String otherAuthType = OTHER_AUTH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthKey() <em>Auth Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthKey()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthKey() <em>Auth Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthKey()
	 * @generated
	 * @ordered
	 */
	protected String authKey = AUTH_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSPFProtocolEndpointBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getOSPFProtocolEndpointBase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransitDelay() {
		return transitDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitDelay(int newTransitDelay) {
		int oldTransitDelay = transitDelay;
		transitDelay = newTransitDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY, oldTransitDelay, transitDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetransmitInterval() {
		return retransmitInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetransmitInterval(int newRetransmitInterval) {
		int oldRetransmitInterval = retransmitInterval;
		retransmitInterval = newRetransmitInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL, oldRetransmitInterval, retransmitInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthType() {
		return authType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthType(String newAuthType) {
		String oldAuthType = authType;
		authType = newAuthType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE, oldAuthType, authType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherAuthType() {
		return otherAuthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherAuthType(String newOtherAuthType) {
		String oldOtherAuthType = otherAuthType;
		otherAuthType = newOtherAuthType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE, oldOtherAuthType, otherAuthType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthKey() {
		return authKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthKey(String newAuthKey) {
		String oldAuthKey = authKey;
		authKey = newAuthKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY, oldAuthKey, authKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
				return getTransitDelay();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
				return getRetransmitInterval();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
				return getAuthType();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
				return getOtherAuthType();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
				return getAuthKey();
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
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
				setTransitDelay((Integer)newValue);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
				setRetransmitInterval((Integer)newValue);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
				setAuthType((String)newValue);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
				setOtherAuthType((String)newValue);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
				setAuthKey((String)newValue);
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
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
				setTransitDelay(TRANSIT_DELAY_EDEFAULT);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
				setRetransmitInterval(RETRANSMIT_INTERVAL_EDEFAULT);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
				setAuthType(AUTH_TYPE_EDEFAULT);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
				setOtherAuthType(OTHER_AUTH_TYPE_EDEFAULT);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
				setAuthKey(AUTH_KEY_EDEFAULT);
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
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
				return transitDelay != TRANSIT_DELAY_EDEFAULT;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
				return retransmitInterval != RETRANSMIT_INTERVAL_EDEFAULT;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
				return AUTH_TYPE_EDEFAULT == null ? authType != null : !AUTH_TYPE_EDEFAULT.equals(authType);
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
				return OTHER_AUTH_TYPE_EDEFAULT == null ? otherAuthType != null : !OTHER_AUTH_TYPE_EDEFAULT.equals(otherAuthType);
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
				return AUTH_KEY_EDEFAULT == null ? authKey != null : !AUTH_KEY_EDEFAULT.equals(authKey);
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
		result.append(" (transitDelay: ");
		result.append(transitDelay);
		result.append(", retransmitInterval: ");
		result.append(retransmitInterval);
		result.append(", authType: ");
		result.append(authType);
		result.append(", otherAuthType: ");
		result.append(otherAuthType);
		result.append(", authKey: ");
		result.append(authKey);
		result.append(')');
		return result.toString();
	}

} //OSPFProtocolEndpointBaseImpl
