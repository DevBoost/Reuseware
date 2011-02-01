/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSPF Protocol Endpoint Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpointBase#getTransitDelay <em>Transit Delay</em>}</li>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpointBase#getRetransmitInterval <em>Retransmit Interval</em>}</li>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpointBase#getAuthType <em>Auth Type</em>}</li>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpointBase#getOtherAuthType <em>Other Auth Type</em>}</li>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpointBase#getAuthKey <em>Auth Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpointBase()
 * @model
 * @generated
 */
public interface OSPFProtocolEndpointBase extends ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Transit Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transit Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transit Delay</em>' attribute.
	 * @see #setTransitDelay(int)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpointBase_TransitDelay()
	 * @model
	 * @generated
	 */
	int getTransitDelay();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpointBase#getTransitDelay <em>Transit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transit Delay</em>' attribute.
	 * @see #getTransitDelay()
	 * @generated
	 */
	void setTransitDelay(int value);

	/**
	 * Returns the value of the '<em><b>Retransmit Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retransmit Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retransmit Interval</em>' attribute.
	 * @see #setRetransmitInterval(int)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpointBase_RetransmitInterval()
	 * @model
	 * @generated
	 */
	int getRetransmitInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpointBase#getRetransmitInterval <em>Retransmit Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retransmit Interval</em>' attribute.
	 * @see #getRetransmitInterval()
	 * @generated
	 */
	void setRetransmitInterval(int value);

	/**
	 * Returns the value of the '<em><b>Auth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Type</em>' attribute.
	 * @see #setAuthType(String)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpointBase_AuthType()
	 * @model
	 * @generated
	 */
	String getAuthType();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpointBase#getAuthType <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Type</em>' attribute.
	 * @see #getAuthType()
	 * @generated
	 */
	void setAuthType(String value);

	/**
	 * Returns the value of the '<em><b>Other Auth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Auth Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Auth Type</em>' attribute.
	 * @see #setOtherAuthType(String)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpointBase_OtherAuthType()
	 * @model
	 * @generated
	 */
	String getOtherAuthType();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpointBase#getOtherAuthType <em>Other Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Auth Type</em>' attribute.
	 * @see #getOtherAuthType()
	 * @generated
	 */
	void setOtherAuthType(String value);

	/**
	 * Returns the value of the '<em><b>Auth Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Key</em>' attribute.
	 * @see #setAuthKey(String)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpointBase_AuthKey()
	 * @model
	 * @generated
	 */
	String getAuthKey();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpointBase#getAuthKey <em>Auth Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Key</em>' attribute.
	 * @see #getAuthKey()
	 * @generated
	 */
	void setAuthKey(String value);

} // OSPFProtocolEndpointBase
