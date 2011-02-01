/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.RemotePort#getPortInfo <em>Port Info</em>}</li>
 *   <li>{@link es.tid.cim.RemotePort#getPortProtocol <em>Port Protocol</em>}</li>
 *   <li>{@link es.tid.cim.RemotePort#getOtherProtocolDescription <em>Other Protocol Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getRemotePort()
 * @model
 * @generated
 */
public interface RemotePort extends RemoteServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Port Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Info</em>' attribute.
	 * @see #setPortInfo(String)
	 * @see es.tid.cim.CimPackage#getRemotePort_PortInfo()
	 * @model
	 * @generated
	 */
	String getPortInfo();

	/**
	 * Sets the value of the '{@link es.tid.cim.RemotePort#getPortInfo <em>Port Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Info</em>' attribute.
	 * @see #getPortInfo()
	 * @generated
	 */
	void setPortInfo(String value);

	/**
	 * Returns the value of the '<em><b>Port Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Protocol</em>' attribute.
	 * @see #setPortProtocol(String)
	 * @see es.tid.cim.CimPackage#getRemotePort_PortProtocol()
	 * @model
	 * @generated
	 */
	String getPortProtocol();

	/**
	 * Sets the value of the '{@link es.tid.cim.RemotePort#getPortProtocol <em>Port Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Protocol</em>' attribute.
	 * @see #getPortProtocol()
	 * @generated
	 */
	void setPortProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Other Protocol Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Protocol Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Protocol Description</em>' attribute.
	 * @see #setOtherProtocolDescription(String)
	 * @see es.tid.cim.CimPackage#getRemotePort_OtherProtocolDescription()
	 * @model
	 * @generated
	 */
	String getOtherProtocolDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.RemotePort#getOtherProtocolDescription <em>Other Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol Description</em>' attribute.
	 * @see #getOtherProtocolDescription()
	 * @generated
	 */
	void setOtherProtocolDescription(String value);

} // RemotePort
