/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BGP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#isIsEBGP <em>Is EBGP</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#isIsEBGPMultihop <em>Is EBGP Multihop</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getLocalIdentifier <em>Local Identifier</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getPerrIdentifier <em>Perr Identifier</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getState <em>State</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getAdminStatus <em>Admin Status</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getNegotiatedVersion <em>Negotiated Version</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getLocalAddress <em>Local Address</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getRemoteAddress <em>Remote Address</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getRemotePort <em>Remote Port</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getRemoteAS <em>Remote AS</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getConnectRetryInterval <em>Connect Retry Interval</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getHoldTimeConfigured <em>Hold Time Configured</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getKeepAliveConfigured <em>Keep Alive Configured</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getMinASOriginationInterval <em>Min AS Origination Interval</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getHoldTime <em>Hold Time</em>}</li>
 *   <li>{@link es.tid.cim.BGPProtocolEndpoint#getKeepAlive <em>Keep Alive</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint()
 * @model
 * @generated
 */
public interface BGPProtocolEndpoint extends ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Is EBGP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is EBGP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is EBGP</em>' attribute.
	 * @see #setIsEBGP(boolean)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_IsEBGP()
	 * @model
	 * @generated
	 */
	boolean isIsEBGP();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#isIsEBGP <em>Is EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is EBGP</em>' attribute.
	 * @see #isIsEBGP()
	 * @generated
	 */
	void setIsEBGP(boolean value);

	/**
	 * Returns the value of the '<em><b>Is EBGP Multihop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is EBGP Multihop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is EBGP Multihop</em>' attribute.
	 * @see #setIsEBGPMultihop(boolean)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_IsEBGPMultihop()
	 * @model
	 * @generated
	 */
	boolean isIsEBGPMultihop();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#isIsEBGPMultihop <em>Is EBGP Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is EBGP Multihop</em>' attribute.
	 * @see #isIsEBGPMultihop()
	 * @generated
	 */
	void setIsEBGPMultihop(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Identifier</em>' attribute.
	 * @see #setLocalIdentifier(String)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_LocalIdentifier()
	 * @model
	 * @generated
	 */
	String getLocalIdentifier();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getLocalIdentifier <em>Local Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Identifier</em>' attribute.
	 * @see #getLocalIdentifier()
	 * @generated
	 */
	void setLocalIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Perr Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perr Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perr Identifier</em>' attribute.
	 * @see #setPerrIdentifier(String)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_PerrIdentifier()
	 * @model
	 * @generated
	 */
	String getPerrIdentifier();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getPerrIdentifier <em>Perr Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perr Identifier</em>' attribute.
	 * @see #getPerrIdentifier()
	 * @generated
	 */
	void setPerrIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_State()
	 * @model
	 * @generated
	 */
	int getState();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(int value);

	/**
	 * Returns the value of the '<em><b>Admin Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Status</em>' attribute.
	 * @see #setAdminStatus(String)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_AdminStatus()
	 * @model
	 * @generated
	 */
	String getAdminStatus();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getAdminStatus <em>Admin Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Status</em>' attribute.
	 * @see #getAdminStatus()
	 * @generated
	 */
	void setAdminStatus(String value);

	/**
	 * Returns the value of the '<em><b>Negotiated Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negotiated Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negotiated Version</em>' attribute.
	 * @see #setNegotiatedVersion(String)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_NegotiatedVersion()
	 * @model
	 * @generated
	 */
	String getNegotiatedVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getNegotiatedVersion <em>Negotiated Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated Version</em>' attribute.
	 * @see #getNegotiatedVersion()
	 * @generated
	 */
	void setNegotiatedVersion(String value);

	/**
	 * Returns the value of the '<em><b>Local Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Address</em>' attribute.
	 * @see #setLocalAddress(String)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_LocalAddress()
	 * @model
	 * @generated
	 */
	String getLocalAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getLocalAddress <em>Local Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Address</em>' attribute.
	 * @see #getLocalAddress()
	 * @generated
	 */
	void setLocalAddress(String value);

	/**
	 * Returns the value of the '<em><b>Local Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Port</em>' attribute.
	 * @see #setLocalPort(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_LocalPort()
	 * @model
	 * @generated
	 */
	int getLocalPort();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getLocalPort <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Port</em>' attribute.
	 * @see #getLocalPort()
	 * @generated
	 */
	void setLocalPort(int value);

	/**
	 * Returns the value of the '<em><b>Remote Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Address</em>' attribute.
	 * @see #setRemoteAddress(String)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_RemoteAddress()
	 * @model
	 * @generated
	 */
	String getRemoteAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getRemoteAddress <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Address</em>' attribute.
	 * @see #getRemoteAddress()
	 * @generated
	 */
	void setRemoteAddress(String value);

	/**
	 * Returns the value of the '<em><b>Remote Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Port</em>' attribute.
	 * @see #setRemotePort(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_RemotePort()
	 * @model
	 * @generated
	 */
	int getRemotePort();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getRemotePort <em>Remote Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Port</em>' attribute.
	 * @see #getRemotePort()
	 * @generated
	 */
	void setRemotePort(int value);

	/**
	 * Returns the value of the '<em><b>Remote AS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote AS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote AS</em>' attribute.
	 * @see #setRemoteAS(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_RemoteAS()
	 * @model
	 * @generated
	 */
	int getRemoteAS();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getRemoteAS <em>Remote AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote AS</em>' attribute.
	 * @see #getRemoteAS()
	 * @generated
	 */
	void setRemoteAS(int value);

	/**
	 * Returns the value of the '<em><b>Connect Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Retry Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Retry Interval</em>' attribute.
	 * @see #setConnectRetryInterval(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_ConnectRetryInterval()
	 * @model
	 * @generated
	 */
	int getConnectRetryInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getConnectRetryInterval <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Retry Interval</em>' attribute.
	 * @see #getConnectRetryInterval()
	 * @generated
	 */
	void setConnectRetryInterval(int value);

	/**
	 * Returns the value of the '<em><b>Hold Time Configured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold Time Configured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold Time Configured</em>' attribute.
	 * @see #setHoldTimeConfigured(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_HoldTimeConfigured()
	 * @model
	 * @generated
	 */
	int getHoldTimeConfigured();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getHoldTimeConfigured <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold Time Configured</em>' attribute.
	 * @see #getHoldTimeConfigured()
	 * @generated
	 */
	void setHoldTimeConfigured(int value);

	/**
	 * Returns the value of the '<em><b>Keep Alive Configured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Alive Configured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Alive Configured</em>' attribute.
	 * @see #setKeepAliveConfigured(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_KeepAliveConfigured()
	 * @model
	 * @generated
	 */
	int getKeepAliveConfigured();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getKeepAliveConfigured <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive Configured</em>' attribute.
	 * @see #getKeepAliveConfigured()
	 * @generated
	 */
	void setKeepAliveConfigured(int value);

	/**
	 * Returns the value of the '<em><b>Min AS Origination Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min AS Origination Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min AS Origination Interval</em>' attribute.
	 * @see #setMinASOriginationInterval(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_MinASOriginationInterval()
	 * @model
	 * @generated
	 */
	int getMinASOriginationInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getMinASOriginationInterval <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min AS Origination Interval</em>' attribute.
	 * @see #getMinASOriginationInterval()
	 * @generated
	 */
	void setMinASOriginationInterval(int value);

	/**
	 * Returns the value of the '<em><b>Min Route Advertisement Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Route Advertisement Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Route Advertisement Interval</em>' attribute.
	 * @see #setMinRouteAdvertisementInterval(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_MinRouteAdvertisementInterval()
	 * @model
	 * @generated
	 */
	int getMinRouteAdvertisementInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Route Advertisement Interval</em>' attribute.
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 */
	void setMinRouteAdvertisementInterval(int value);

	/**
	 * Returns the value of the '<em><b>Hold Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold Time</em>' attribute.
	 * @see #setHoldTime(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_HoldTime()
	 * @model
	 * @generated
	 */
	int getHoldTime();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getHoldTime <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold Time</em>' attribute.
	 * @see #getHoldTime()
	 * @generated
	 */
	void setHoldTime(int value);

	/**
	 * Returns the value of the '<em><b>Keep Alive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Alive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Alive</em>' attribute.
	 * @see #setKeepAlive(int)
	 * @see es.tid.cim.CimPackage#getBGPProtocolEndpoint_KeepAlive()
	 * @model
	 * @generated
	 */
	int getKeepAlive();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPProtocolEndpoint#getKeepAlive <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive</em>' attribute.
	 * @see #getKeepAlive()
	 * @generated
	 */
	void setKeepAlive(int value);

} // BGPProtocolEndpoint
