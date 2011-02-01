/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.LANEndpoint#getLANID <em>LANID</em>}</li>
 *   <li>{@link es.tid.cim.LANEndpoint#getLANType <em>LAN Type</em>}</li>
 *   <li>{@link es.tid.cim.LANEndpoint#getOtherLANType <em>Other LAN Type</em>}</li>
 *   <li>{@link es.tid.cim.LANEndpoint#getMACAddress <em>MAC Address</em>}</li>
 *   <li>{@link es.tid.cim.LANEndpoint#getAliasAddress <em>Alias Address</em>}</li>
 *   <li>{@link es.tid.cim.LANEndpoint#getGroupAddresses <em>Group Addresses</em>}</li>
 *   <li>{@link es.tid.cim.LANEndpoint#getMaxDataSize <em>Max Data Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getLANEndpoint()
 * @model
 * @generated
 */
public interface LANEndpoint extends ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>LANID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LANID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LANID</em>' attribute.
	 * @see #setLANID(String)
	 * @see es.tid.cim.CimPackage#getLANEndpoint_LANID()
	 * @model
	 * @generated
	 */
	String getLANID();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANEndpoint#getLANID <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LANID</em>' attribute.
	 * @see #getLANID()
	 * @generated
	 */
	void setLANID(String value);

	/**
	 * Returns the value of the '<em><b>LAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LAN Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAN Type</em>' attribute.
	 * @see #setLANType(String)
	 * @see es.tid.cim.CimPackage#getLANEndpoint_LANType()
	 * @model
	 * @generated
	 */
	String getLANType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANEndpoint#getLANType <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAN Type</em>' attribute.
	 * @see #getLANType()
	 * @generated
	 */
	void setLANType(String value);

	/**
	 * Returns the value of the '<em><b>Other LAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other LAN Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other LAN Type</em>' attribute.
	 * @see #setOtherLANType(String)
	 * @see es.tid.cim.CimPackage#getLANEndpoint_OtherLANType()
	 * @model
	 * @generated
	 */
	String getOtherLANType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANEndpoint#getOtherLANType <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other LAN Type</em>' attribute.
	 * @see #getOtherLANType()
	 * @generated
	 */
	void setOtherLANType(String value);

	/**
	 * Returns the value of the '<em><b>MAC Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAC Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAC Address</em>' attribute.
	 * @see #setMACAddress(String)
	 * @see es.tid.cim.CimPackage#getLANEndpoint_MACAddress()
	 * @model
	 * @generated
	 */
	String getMACAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANEndpoint#getMACAddress <em>MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAC Address</em>' attribute.
	 * @see #getMACAddress()
	 * @generated
	 */
	void setMACAddress(String value);

	/**
	 * Returns the value of the '<em><b>Alias Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Address</em>' attribute.
	 * @see #setAliasAddress(String)
	 * @see es.tid.cim.CimPackage#getLANEndpoint_AliasAddress()
	 * @model
	 * @generated
	 */
	String getAliasAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANEndpoint#getAliasAddress <em>Alias Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Address</em>' attribute.
	 * @see #getAliasAddress()
	 * @generated
	 */
	void setAliasAddress(String value);

	/**
	 * Returns the value of the '<em><b>Group Addresses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Addresses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Addresses</em>' attribute.
	 * @see #setGroupAddresses(String)
	 * @see es.tid.cim.CimPackage#getLANEndpoint_GroupAddresses()
	 * @model
	 * @generated
	 */
	String getGroupAddresses();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANEndpoint#getGroupAddresses <em>Group Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Addresses</em>' attribute.
	 * @see #getGroupAddresses()
	 * @generated
	 */
	void setGroupAddresses(String value);

	/**
	 * Returns the value of the '<em><b>Max Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Data Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Data Size</em>' attribute.
	 * @see #setMaxDataSize(int)
	 * @see es.tid.cim.CimPackage#getLANEndpoint_MaxDataSize()
	 * @model
	 * @generated
	 */
	int getMaxDataSize();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANEndpoint#getMaxDataSize <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Size</em>' attribute.
	 * @see #getMaxDataSize()
	 * @generated
	 */
	void setMaxDataSize(int value);

} // LANEndpoint
