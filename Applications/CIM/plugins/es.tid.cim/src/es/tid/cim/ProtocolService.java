/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ProtocolService#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link es.tid.cim.ProtocolService#getOtherProtocol <em>Other Protocol</em>}</li>
 *   <li>{@link es.tid.cim.ProtocolService#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getProtocolService()
 * @model
 * @generated
 */
public interface ProtocolService extends Service {
	/**
	 * Returns the value of the '<em><b>Max Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Connections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Connections</em>' attribute.
	 * @see #setMaxConnections(int)
	 * @see es.tid.cim.CimPackage#getProtocolService_MaxConnections()
	 * @model
	 * @generated
	 */
	int getMaxConnections();

	/**
	 * Sets the value of the '{@link es.tid.cim.ProtocolService#getMaxConnections <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Connections</em>' attribute.
	 * @see #getMaxConnections()
	 * @generated
	 */
	void setMaxConnections(int value);

	/**
	 * Returns the value of the '<em><b>Other Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Protocol</em>' attribute.
	 * @see #setOtherProtocol(String)
	 * @see es.tid.cim.CimPackage#getProtocolService_OtherProtocol()
	 * @model
	 * @generated
	 */
	String getOtherProtocol();

	/**
	 * Sets the value of the '{@link es.tid.cim.ProtocolService#getOtherProtocol <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol</em>' attribute.
	 * @see #getOtherProtocol()
	 * @generated
	 */
	void setOtherProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumProtocolType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see es.tid.cim.EnumProtocolType
	 * @see #setProtocol(EnumProtocolType)
	 * @see es.tid.cim.CimPackage#getProtocolService_Protocol()
	 * @model
	 * @generated
	 */
	EnumProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link es.tid.cim.ProtocolService#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see es.tid.cim.EnumProtocolType
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(EnumProtocolType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model portNumberRequired="true" ipEndpointRequired="true"
	 * @generated
	 */
	EnumProtocolServiceReturnCode listenOnPort(int portNumber, IPProtocolEndpoint ipEndpoint, TCPProtocolEndpoint tcpEndpoint);

} // ProtocolService
