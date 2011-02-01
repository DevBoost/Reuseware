/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BGP Peer Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.BGPPeerGroup#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.BGPPeerGroup#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.BGPPeerGroup#getConnectRetryInterval <em>Connect Retry Interval</em>}</li>
 *   <li>{@link es.tid.cim.BGPPeerGroup#getHoldTimeConfigured <em>Hold Time Configured</em>}</li>
 *   <li>{@link es.tid.cim.BGPPeerGroup#getKeepAliveConfigured <em>Keep Alive Configured</em>}</li>
 *   <li>{@link es.tid.cim.BGPPeerGroup#getMinASOriginationInterval <em>Min AS Origination Interval</em>}</li>
 *   <li>{@link es.tid.cim.BGPPeerGroup#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getBGPPeerGroup()
 * @model
 * @generated
 */
public interface BGPPeerGroup extends CollectionOfMSEs {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getBGPPeerGroup_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPPeerGroup#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

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
	 * @see es.tid.cim.CimPackage#getBGPPeerGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPPeerGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.tid.cim.CimPackage#getBGPPeerGroup_ConnectRetryInterval()
	 * @model
	 * @generated
	 */
	int getConnectRetryInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPPeerGroup#getConnectRetryInterval <em>Connect Retry Interval</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getBGPPeerGroup_HoldTimeConfigured()
	 * @model
	 * @generated
	 */
	int getHoldTimeConfigured();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPPeerGroup#getHoldTimeConfigured <em>Hold Time Configured</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getBGPPeerGroup_KeepAliveConfigured()
	 * @model
	 * @generated
	 */
	int getKeepAliveConfigured();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPPeerGroup#getKeepAliveConfigured <em>Keep Alive Configured</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getBGPPeerGroup_MinASOriginationInterval()
	 * @model
	 * @generated
	 */
	int getMinASOriginationInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPPeerGroup#getMinASOriginationInterval <em>Min AS Origination Interval</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getBGPPeerGroup_MinRouteAdvertisementInterval()
	 * @model
	 * @generated
	 */
	int getMinRouteAdvertisementInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPPeerGroup#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Route Advertisement Interval</em>' attribute.
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 */
	void setMinRouteAdvertisementInterval(int value);

} // BGPPeerGroup
