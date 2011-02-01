/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP Connectivity Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.IPConnectivitySubnet#getSubnetNumber <em>Subnet Number</em>}</li>
 *   <li>{@link es.tid.cim.IPConnectivitySubnet#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link es.tid.cim.IPConnectivitySubnet#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link es.tid.cim.IPConnectivitySubnet#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getIPConnectivitySubnet()
 * @model
 * @generated
 */
public interface IPConnectivitySubnet extends ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>Subnet Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Number</em>' attribute.
	 * @see #setSubnetNumber(String)
	 * @see es.tid.cim.CimPackage#getIPConnectivitySubnet_SubnetNumber()
	 * @model
	 * @generated
	 */
	String getSubnetNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPConnectivitySubnet#getSubnetNumber <em>Subnet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Number</em>' attribute.
	 * @see #getSubnetNumber()
	 * @generated
	 */
	void setSubnetNumber(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see es.tid.cim.CimPackage#getIPConnectivitySubnet_SubnetMask()
	 * @model
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPConnectivitySubnet#getSubnetMask <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' attribute.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(String value);

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
	 * @see es.tid.cim.CimPackage#getIPConnectivitySubnet_PrefixLength()
	 * @model
	 * @generated
	 */
	int getPrefixLength();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPConnectivitySubnet#getPrefixLength <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Length</em>' attribute.
	 * @see #getPrefixLength()
	 * @generated
	 */
	void setPrefixLength(int value);

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumAddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see es.tid.cim.EnumAddressType
	 * @see #setAddressType(EnumAddressType)
	 * @see es.tid.cim.CimPackage#getIPConnectivitySubnet_AddressType()
	 * @model
	 * @generated
	 */
	EnumAddressType getAddressType();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPConnectivitySubnet#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see es.tid.cim.EnumAddressType
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(EnumAddressType value);

} // IPConnectivitySubnet
