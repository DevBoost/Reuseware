/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.IPProtocolEndpoint#getAddressOrigin <em>Address Origin</em>}</li>
 *   <li>{@link es.tid.cim.IPProtocolEndpoint#getIPv4Address <em>IPv4 Address</em>}</li>
 *   <li>{@link es.tid.cim.IPProtocolEndpoint#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link es.tid.cim.IPProtocolEndpoint#getIPv6Address <em>IPv6 Address</em>}</li>
 *   <li>{@link es.tid.cim.IPProtocolEndpoint#getPrefixLength <em>Prefix Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getIPProtocolEndpoint()
 * @model
 * @generated
 */
public interface IPProtocolEndpoint extends ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Address Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumAddressOrigin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Origin</em>' attribute.
	 * @see es.tid.cim.EnumAddressOrigin
	 * @see #setAddressOrigin(EnumAddressOrigin)
	 * @see es.tid.cim.CimPackage#getIPProtocolEndpoint_AddressOrigin()
	 * @model
	 * @generated
	 */
	EnumAddressOrigin getAddressOrigin();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPProtocolEndpoint#getAddressOrigin <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Origin</em>' attribute.
	 * @see es.tid.cim.EnumAddressOrigin
	 * @see #getAddressOrigin()
	 * @generated
	 */
	void setAddressOrigin(EnumAddressOrigin value);

	/**
	 * Returns the value of the '<em><b>IPv4 Address</b></em>' attribute.
	 * The default value is <code>"0.0.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPv4 Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPv4 Address</em>' attribute.
	 * @see #setIPv4Address(String)
	 * @see es.tid.cim.CimPackage#getIPProtocolEndpoint_IPv4Address()
	 * @model default="0.0.0.0"
	 * @generated
	 */
	String getIPv4Address();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPProtocolEndpoint#getIPv4Address <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv4 Address</em>' attribute.
	 * @see #getIPv4Address()
	 * @generated
	 */
	void setIPv4Address(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' attribute.
	 * The default value is <code>"0.0.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see es.tid.cim.CimPackage#getIPProtocolEndpoint_SubnetMask()
	 * @model default="0.0.0.0"
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPProtocolEndpoint#getSubnetMask <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' attribute.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(String value);

	/**
	 * Returns the value of the '<em><b>IPv6 Address</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPv6 Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPv6 Address</em>' attribute.
	 * @see #setIPv6Address(String)
	 * @see es.tid.cim.CimPackage#getIPProtocolEndpoint_IPv6Address()
	 * @model default=""
	 * @generated
	 */
	String getIPv6Address();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPProtocolEndpoint#getIPv6Address <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv6 Address</em>' attribute.
	 * @see #getIPv6Address()
	 * @generated
	 */
	void setIPv6Address(String value);

	/**
	 * Returns the value of the '<em><b>Prefix Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Length</em>' attribute.
	 * @see #setPrefixLength(int)
	 * @see es.tid.cim.CimPackage#getIPProtocolEndpoint_PrefixLength()
	 * @model
	 * @generated
	 */
	int getPrefixLength();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPProtocolEndpoint#getPrefixLength <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Length</em>' attribute.
	 * @see #getPrefixLength()
	 * @generated
	 */
	void setPrefixLength(int value);

} // IPProtocolEndpoint
