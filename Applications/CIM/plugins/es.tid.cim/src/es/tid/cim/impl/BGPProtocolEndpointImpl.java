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

import es.tid.cim.BGPProtocolEndpoint;
import es.tid.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BGP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#isIsEBGP <em>Is EBGP</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#isIsEBGPMultihop <em>Is EBGP Multihop</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getLocalIdentifier <em>Local Identifier</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getPerrIdentifier <em>Perr Identifier</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getState <em>State</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getAdminStatus <em>Admin Status</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getNegotiatedVersion <em>Negotiated Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getLocalAddress <em>Local Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getRemoteAddress <em>Remote Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getRemotePort <em>Remote Port</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getRemoteAS <em>Remote AS</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getConnectRetryInterval <em>Connect Retry Interval</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getHoldTimeConfigured <em>Hold Time Configured</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getKeepAliveConfigured <em>Keep Alive Configured</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getMinASOriginationInterval <em>Min AS Origination Interval</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getHoldTime <em>Hold Time</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPProtocolEndpointImpl#getKeepAlive <em>Keep Alive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BGPProtocolEndpointImpl extends ProtocolEndpointImpl implements BGPProtocolEndpoint {
	/**
	 * The default value of the '{@link #isIsEBGP() <em>Is EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEBGP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EBGP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEBGP() <em>Is EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEBGP()
	 * @generated
	 * @ordered
	 */
	protected boolean isEBGP = IS_EBGP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEBGPMultihop() <em>Is EBGP Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEBGPMultihop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EBGP_MULTIHOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEBGPMultihop() <em>Is EBGP Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEBGPMultihop()
	 * @generated
	 * @ordered
	 */
	protected boolean isEBGPMultihop = IS_EBGP_MULTIHOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalIdentifier() <em>Local Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalIdentifier() <em>Local Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String localIdentifier = LOCAL_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerrIdentifier() <em>Perr Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerrIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PERR_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerrIdentifier() <em>Perr Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerrIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String perrIdentifier = PERR_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final int STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected int state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminStatus() <em>Admin Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminStatus() <em>Admin Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminStatus()
	 * @generated
	 * @ordered
	 */
	protected String adminStatus = ADMIN_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegotiatedVersion() <em>Negotiated Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGOTIATED_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiatedVersion() <em>Negotiated Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedVersion()
	 * @generated
	 * @ordered
	 */
	protected String negotiatedVersion = NEGOTIATED_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalAddress() <em>Local Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalAddress() <em>Local Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAddress()
	 * @generated
	 * @ordered
	 */
	protected String localAddress = LOCAL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalPort() <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCAL_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocalPort() <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected int localPort = LOCAL_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteAddress() <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteAddress() <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAddress()
	 * @generated
	 * @ordered
	 */
	protected String remoteAddress = REMOTE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemotePort() <em>Remote Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemotePort()
	 * @generated
	 * @ordered
	 */
	protected static final int REMOTE_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRemotePort() <em>Remote Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemotePort()
	 * @generated
	 * @ordered
	 */
	protected int remotePort = REMOTE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteAS() <em>Remote AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAS()
	 * @generated
	 * @ordered
	 */
	protected static final int REMOTE_AS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRemoteAS() <em>Remote AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAS()
	 * @generated
	 * @ordered
	 */
	protected int remoteAS = REMOTE_AS_EDEFAULT;

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
	 * The default value of the '{@link #getHoldTime() <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTime()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLD_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoldTime() <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTime()
	 * @generated
	 * @ordered
	 */
	protected int holdTime = HOLD_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepAlive() <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAlive()
	 * @generated
	 * @ordered
	 */
	protected static final int KEEP_ALIVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKeepAlive() <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAlive()
	 * @generated
	 * @ordered
	 */
	protected int keepAlive = KEEP_ALIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BGPProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getBGPProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEBGP() {
		return isEBGP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEBGP(boolean newIsEBGP) {
		boolean oldIsEBGP = isEBGP;
		isEBGP = newIsEBGP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP, oldIsEBGP, isEBGP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEBGPMultihop() {
		return isEBGPMultihop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEBGPMultihop(boolean newIsEBGPMultihop) {
		boolean oldIsEBGPMultihop = isEBGPMultihop;
		isEBGPMultihop = newIsEBGPMultihop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP, oldIsEBGPMultihop, isEBGPMultihop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalIdentifier() {
		return localIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalIdentifier(String newLocalIdentifier) {
		String oldLocalIdentifier = localIdentifier;
		localIdentifier = newLocalIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER, oldLocalIdentifier, localIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerrIdentifier() {
		return perrIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerrIdentifier(String newPerrIdentifier) {
		String oldPerrIdentifier = perrIdentifier;
		perrIdentifier = newPerrIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__PERR_IDENTIFIER, oldPerrIdentifier, perrIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(int newState) {
		int oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdminStatus() {
		return adminStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminStatus(String newAdminStatus) {
		String oldAdminStatus = adminStatus;
		adminStatus = newAdminStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS, oldAdminStatus, adminStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegotiatedVersion() {
		return negotiatedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegotiatedVersion(String newNegotiatedVersion) {
		String oldNegotiatedVersion = negotiatedVersion;
		negotiatedVersion = newNegotiatedVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION, oldNegotiatedVersion, negotiatedVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalAddress() {
		return localAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalAddress(String newLocalAddress) {
		String oldLocalAddress = localAddress;
		localAddress = newLocalAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS, oldLocalAddress, localAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocalPort() {
		return localPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalPort(int newLocalPort) {
		int oldLocalPort = localPort;
		localPort = newLocalPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_PORT, oldLocalPort, localPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteAddress() {
		return remoteAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteAddress(String newRemoteAddress) {
		String oldRemoteAddress = remoteAddress;
		remoteAddress = newRemoteAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS, oldRemoteAddress, remoteAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemotePort() {
		return remotePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemotePort(int newRemotePort) {
		int oldRemotePort = remotePort;
		remotePort = newRemotePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_PORT, oldRemotePort, remotePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemoteAS() {
		return remoteAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteAS(int newRemoteAS) {
		int oldRemoteAS = remoteAS;
		remoteAS = newRemoteAS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_AS, oldRemoteAS, remoteAS));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL, oldConnectRetryInterval, connectRetryInterval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED, oldHoldTimeConfigured, holdTimeConfigured));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED, oldKeepAliveConfigured, keepAliveConfigured));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL, oldMinASOriginationInterval, minASOriginationInterval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL, oldMinRouteAdvertisementInterval, minRouteAdvertisementInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldTime() {
		return holdTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldTime(int newHoldTime) {
		int oldHoldTime = holdTime;
		holdTime = newHoldTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME, oldHoldTime, holdTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKeepAlive() {
		return keepAlive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepAlive(int newKeepAlive) {
		int oldKeepAlive = keepAlive;
		keepAlive = newKeepAlive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE, oldKeepAlive, keepAlive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP:
				return isIsEBGP();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
				return isIsEBGPMultihop();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
				return getLocalIdentifier();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__PERR_IDENTIFIER:
				return getPerrIdentifier();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__STATE:
				return getState();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
				return getAdminStatus();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
				return getNegotiatedVersion();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
				return getLocalAddress();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
				return getLocalPort();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
				return getRemoteAddress();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
				return getRemotePort();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
				return getRemoteAS();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
				return getConnectRetryInterval();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
				return getHoldTimeConfigured();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
				return getKeepAliveConfigured();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
				return getMinASOriginationInterval();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				return getMinRouteAdvertisementInterval();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
				return getHoldTime();
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				return getKeepAlive();
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
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP:
				setIsEBGP((Boolean)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
				setIsEBGPMultihop((Boolean)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
				setLocalIdentifier((String)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__PERR_IDENTIFIER:
				setPerrIdentifier((String)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__STATE:
				setState((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
				setAdminStatus((String)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
				setNegotiatedVersion((String)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
				setLocalAddress((String)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
				setLocalPort((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
				setRemoteAddress((String)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
				setRemotePort((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
				setRemoteAS((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
				setConnectRetryInterval((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
				setHoldTimeConfigured((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
				setKeepAliveConfigured((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
				setMinASOriginationInterval((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				setMinRouteAdvertisementInterval((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
				setHoldTime((Integer)newValue);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				setKeepAlive((Integer)newValue);
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
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP:
				setIsEBGP(IS_EBGP_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
				setIsEBGPMultihop(IS_EBGP_MULTIHOP_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
				setLocalIdentifier(LOCAL_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__PERR_IDENTIFIER:
				setPerrIdentifier(PERR_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
				setAdminStatus(ADMIN_STATUS_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
				setNegotiatedVersion(NEGOTIATED_VERSION_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
				setLocalAddress(LOCAL_ADDRESS_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
				setLocalPort(LOCAL_PORT_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
				setRemoteAddress(REMOTE_ADDRESS_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
				setRemotePort(REMOTE_PORT_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
				setRemoteAS(REMOTE_AS_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
				setConnectRetryInterval(CONNECT_RETRY_INTERVAL_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
				setHoldTimeConfigured(HOLD_TIME_CONFIGURED_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
				setKeepAliveConfigured(KEEP_ALIVE_CONFIGURED_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
				setMinASOriginationInterval(MIN_AS_ORIGINATION_INTERVAL_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				setMinRouteAdvertisementInterval(MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
				setHoldTime(HOLD_TIME_EDEFAULT);
				return;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				setKeepAlive(KEEP_ALIVE_EDEFAULT);
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
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP:
				return isEBGP != IS_EBGP_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
				return isEBGPMultihop != IS_EBGP_MULTIHOP_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
				return LOCAL_IDENTIFIER_EDEFAULT == null ? localIdentifier != null : !LOCAL_IDENTIFIER_EDEFAULT.equals(localIdentifier);
			case CimPackage.BGP_PROTOCOL_ENDPOINT__PERR_IDENTIFIER:
				return PERR_IDENTIFIER_EDEFAULT == null ? perrIdentifier != null : !PERR_IDENTIFIER_EDEFAULT.equals(perrIdentifier);
			case CimPackage.BGP_PROTOCOL_ENDPOINT__STATE:
				return state != STATE_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
				return ADMIN_STATUS_EDEFAULT == null ? adminStatus != null : !ADMIN_STATUS_EDEFAULT.equals(adminStatus);
			case CimPackage.BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
				return NEGOTIATED_VERSION_EDEFAULT == null ? negotiatedVersion != null : !NEGOTIATED_VERSION_EDEFAULT.equals(negotiatedVersion);
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
				return LOCAL_ADDRESS_EDEFAULT == null ? localAddress != null : !LOCAL_ADDRESS_EDEFAULT.equals(localAddress);
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
				return localPort != LOCAL_PORT_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
				return REMOTE_ADDRESS_EDEFAULT == null ? remoteAddress != null : !REMOTE_ADDRESS_EDEFAULT.equals(remoteAddress);
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
				return remotePort != REMOTE_PORT_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
				return remoteAS != REMOTE_AS_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
				return connectRetryInterval != CONNECT_RETRY_INTERVAL_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
				return holdTimeConfigured != HOLD_TIME_CONFIGURED_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
				return keepAliveConfigured != KEEP_ALIVE_CONFIGURED_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
				return minASOriginationInterval != MIN_AS_ORIGINATION_INTERVAL_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				return minRouteAdvertisementInterval != MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
				return holdTime != HOLD_TIME_EDEFAULT;
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				return keepAlive != KEEP_ALIVE_EDEFAULT;
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
		result.append(" (isEBGP: ");
		result.append(isEBGP);
		result.append(", isEBGPMultihop: ");
		result.append(isEBGPMultihop);
		result.append(", localIdentifier: ");
		result.append(localIdentifier);
		result.append(", perrIdentifier: ");
		result.append(perrIdentifier);
		result.append(", state: ");
		result.append(state);
		result.append(", adminStatus: ");
		result.append(adminStatus);
		result.append(", negotiatedVersion: ");
		result.append(negotiatedVersion);
		result.append(", localAddress: ");
		result.append(localAddress);
		result.append(", localPort: ");
		result.append(localPort);
		result.append(", remoteAddress: ");
		result.append(remoteAddress);
		result.append(", remotePort: ");
		result.append(remotePort);
		result.append(", remoteAS: ");
		result.append(remoteAS);
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
		result.append(", holdTime: ");
		result.append(holdTime);
		result.append(", keepAlive: ");
		result.append(keepAlive);
		result.append(')');
		return result.toString();
	}

} //BGPProtocolEndpointImpl
