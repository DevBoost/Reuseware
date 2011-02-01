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

import es.tid.cim.BGPPeerGroup;
import es.tid.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BGP Peer Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.BGPPeerGroupImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPPeerGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPPeerGroupImpl#getConnectRetryInterval <em>Connect Retry Interval</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPPeerGroupImpl#getHoldTimeConfigured <em>Hold Time Configured</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPPeerGroupImpl#getKeepAliveConfigured <em>Keep Alive Configured</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPPeerGroupImpl#getMinASOriginationInterval <em>Min AS Origination Interval</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPPeerGroupImpl#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BGPPeerGroupImpl extends CollectionOfMSEsImpl implements BGPPeerGroup {
	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectRetryInterval() <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECT_RETRY_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectRetryInterval() <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected int connectRetryInterval = CONNECT_RETRY_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoldTimeConfigured() <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTimeConfigured()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLD_TIME_CONFIGURED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoldTimeConfigured() <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTimeConfigured()
	 * @generated
	 * @ordered
	 */
	protected int holdTimeConfigured = HOLD_TIME_CONFIGURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepAliveConfigured() <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveConfigured()
	 * @generated
	 * @ordered
	 */
	protected static final int KEEP_ALIVE_CONFIGURED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKeepAliveConfigured() <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveConfigured()
	 * @generated
	 * @ordered
	 */
	protected int keepAliveConfigured = KEEP_ALIVE_CONFIGURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinASOriginationInterval() <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinASOriginationInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_AS_ORIGINATION_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinASOriginationInterval() <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinASOriginationInterval()
	 * @generated
	 * @ordered
	 */
	protected int minASOriginationInterval = MIN_AS_ORIGINATION_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRouteAdvertisementInterval() <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinRouteAdvertisementInterval() <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 * @ordered
	 */
	protected int minRouteAdvertisementInterval = MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BGPPeerGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getBGPPeerGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PEER_GROUP__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PEER_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConnectRetryInterval() {
		return connectRetryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectRetryInterval(int newConnectRetryInterval) {
		int oldConnectRetryInterval = connectRetryInterval;
		connectRetryInterval = newConnectRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL, oldConnectRetryInterval, connectRetryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldTimeConfigured() {
		return holdTimeConfigured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldTimeConfigured(int newHoldTimeConfigured) {
		int oldHoldTimeConfigured = holdTimeConfigured;
		holdTimeConfigured = newHoldTimeConfigured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PEER_GROUP__HOLD_TIME_CONFIGURED, oldHoldTimeConfigured, holdTimeConfigured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKeepAliveConfigured() {
		return keepAliveConfigured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepAliveConfigured(int newKeepAliveConfigured) {
		int oldKeepAliveConfigured = keepAliveConfigured;
		keepAliveConfigured = newKeepAliveConfigured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED, oldKeepAliveConfigured, keepAliveConfigured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinASOriginationInterval() {
		return minASOriginationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinASOriginationInterval(int newMinASOriginationInterval) {
		int oldMinASOriginationInterval = minASOriginationInterval;
		minASOriginationInterval = newMinASOriginationInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL, oldMinASOriginationInterval, minASOriginationInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinRouteAdvertisementInterval() {
		return minRouteAdvertisementInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRouteAdvertisementInterval(int newMinRouteAdvertisementInterval) {
		int oldMinRouteAdvertisementInterval = minRouteAdvertisementInterval;
		minRouteAdvertisementInterval = newMinRouteAdvertisementInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL, oldMinRouteAdvertisementInterval, minRouteAdvertisementInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.BGP_PEER_GROUP__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.BGP_PEER_GROUP__NAME:
				return getName();
			case CimPackage.BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
				return getConnectRetryInterval();
			case CimPackage.BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
				return getHoldTimeConfigured();
			case CimPackage.BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
				return getKeepAliveConfigured();
			case CimPackage.BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
				return getMinASOriginationInterval();
			case CimPackage.BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				return getMinRouteAdvertisementInterval();
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
			case CimPackage.BGP_PEER_GROUP__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.BGP_PEER_GROUP__NAME:
				setName((String)newValue);
				return;
			case CimPackage.BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
				setConnectRetryInterval((Integer)newValue);
				return;
			case CimPackage.BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
				setHoldTimeConfigured((Integer)newValue);
				return;
			case CimPackage.BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
				setKeepAliveConfigured((Integer)newValue);
				return;
			case CimPackage.BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
				setMinASOriginationInterval((Integer)newValue);
				return;
			case CimPackage.BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				setMinRouteAdvertisementInterval((Integer)newValue);
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
			case CimPackage.BGP_PEER_GROUP__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.BGP_PEER_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
				setConnectRetryInterval(CONNECT_RETRY_INTERVAL_EDEFAULT);
				return;
			case CimPackage.BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
				setHoldTimeConfigured(HOLD_TIME_CONFIGURED_EDEFAULT);
				return;
			case CimPackage.BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
				setKeepAliveConfigured(KEEP_ALIVE_CONFIGURED_EDEFAULT);
				return;
			case CimPackage.BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
				setMinASOriginationInterval(MIN_AS_ORIGINATION_INTERVAL_EDEFAULT);
				return;
			case CimPackage.BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				setMinRouteAdvertisementInterval(MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT);
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
			case CimPackage.BGP_PEER_GROUP__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.BGP_PEER_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
				return connectRetryInterval != CONNECT_RETRY_INTERVAL_EDEFAULT;
			case CimPackage.BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
				return holdTimeConfigured != HOLD_TIME_CONFIGURED_EDEFAULT;
			case CimPackage.BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
				return keepAliveConfigured != KEEP_ALIVE_CONFIGURED_EDEFAULT;
			case CimPackage.BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
				return minASOriginationInterval != MIN_AS_ORIGINATION_INTERVAL_EDEFAULT;
			case CimPackage.BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				return minRouteAdvertisementInterval != MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT;
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
		result.append(" (creationClassName: ");
		result.append(creationClassName);
		result.append(", name: ");
		result.append(name);
		result.append(", connectRetryInterval: ");
		result.append(connectRetryInterval);
		result.append(", holdTimeConfigured: ");
		result.append(holdTimeConfigured);
		result.append(", keepAliveConfigured: ");
		result.append(keepAliveConfigured);
		result.append(", minASOriginationInterval: ");
		result.append(minASOriginationInterval);
		result.append(", minRouteAdvertisementInterval: ");
		result.append(minRouteAdvertisementInterval);
		result.append(')');
		return result.toString();
	}

} //BGPPeerGroupImpl
