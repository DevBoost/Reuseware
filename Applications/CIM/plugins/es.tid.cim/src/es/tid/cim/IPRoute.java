/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.IPRoute#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.IPRoute#getIPDestinationAddress <em>IP Destination Address</em>}</li>
 *   <li>{@link es.tid.cim.IPRoute#getIPDestinationMask <em>IP Destination Mask</em>}</li>
 *   <li>{@link es.tid.cim.IPRoute#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getIPRoute()
 * @model abstract="true"
 * @generated
 */
public interface IPRoute extends NextHopRouting {
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
	 * @see es.tid.cim.CimPackage#getIPRoute_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPRoute#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>IP Destination Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP Destination Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP Destination Address</em>' attribute.
	 * @see #setIPDestinationAddress(String)
	 * @see es.tid.cim.CimPackage#getIPRoute_IPDestinationAddress()
	 * @model
	 * @generated
	 */
	String getIPDestinationAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPRoute#getIPDestinationAddress <em>IP Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Destination Address</em>' attribute.
	 * @see #getIPDestinationAddress()
	 * @generated
	 */
	void setIPDestinationAddress(String value);

	/**
	 * Returns the value of the '<em><b>IP Destination Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP Destination Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP Destination Mask</em>' attribute.
	 * @see #setIPDestinationMask(String)
	 * @see es.tid.cim.CimPackage#getIPRoute_IPDestinationMask()
	 * @model
	 * @generated
	 */
	String getIPDestinationMask();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPRoute#getIPDestinationMask <em>IP Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Destination Mask</em>' attribute.
	 * @see #getIPDestinationMask()
	 * @generated
	 */
	void setIPDestinationMask(String value);

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(String)
	 * @see es.tid.cim.CimPackage#getIPRoute_AddressType()
	 * @model
	 * @generated
	 */
	String getAddressType();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPRoute#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(String value);

} // IPRoute
