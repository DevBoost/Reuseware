/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Of IP Addresses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.RangeOfIPAddresses#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link es.tid.cim.RangeOfIPAddresses#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link es.tid.cim.RangeOfIPAddresses#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getRangeOfIPAddresses()
 * @model
 * @generated
 */
public interface RangeOfIPAddresses extends SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(String)
	 * @see es.tid.cim.CimPackage#getRangeOfIPAddresses_StartAddress()
	 * @model
	 * @generated
	 */
	String getStartAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.RangeOfIPAddresses#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(String value);

	/**
	 * Returns the value of the '<em><b>End Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Address</em>' attribute.
	 * @see #setEndAddress(String)
	 * @see es.tid.cim.CimPackage#getRangeOfIPAddresses_EndAddress()
	 * @model
	 * @generated
	 */
	String getEndAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.RangeOfIPAddresses#getEndAddress <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Address</em>' attribute.
	 * @see #getEndAddress()
	 * @generated
	 */
	void setEndAddress(String value);

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
	 * @see es.tid.cim.CimPackage#getRangeOfIPAddresses_AddressType()
	 * @model
	 * @generated
	 */
	String getAddressType();

	/**
	 * Sets the value of the '{@link es.tid.cim.RangeOfIPAddresses#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(String value);

} // RangeOfIPAddresses
