/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP Address Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.IPAddressRange#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link es.tid.cim.IPAddressRange#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link es.tid.cim.IPAddressRange#getTypeOfAddress <em>Type Of Address</em>}</li>
 *   <li>{@link es.tid.cim.IPAddressRange#getAllocationRange <em>Allocation Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getIPAddressRange()
 * @model
 * @generated
 */
public interface IPAddressRange extends CollectionOfMSEs {
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
	 * @see es.tid.cim.CimPackage#getIPAddressRange_StartAddress()
	 * @model
	 * @generated
	 */
	String getStartAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPAddressRange#getStartAddress <em>Start Address</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getIPAddressRange_EndAddress()
	 * @model
	 * @generated
	 */
	String getEndAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPAddressRange#getEndAddress <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Address</em>' attribute.
	 * @see #getEndAddress()
	 * @generated
	 */
	void setEndAddress(String value);

	/**
	 * Returns the value of the '<em><b>Type Of Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Address</em>' attribute.
	 * @see #setTypeOfAddress(String)
	 * @see es.tid.cim.CimPackage#getIPAddressRange_TypeOfAddress()
	 * @model
	 * @generated
	 */
	String getTypeOfAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPAddressRange#getTypeOfAddress <em>Type Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Address</em>' attribute.
	 * @see #getTypeOfAddress()
	 * @generated
	 */
	void setTypeOfAddress(String value);

	/**
	 * Returns the value of the '<em><b>Allocation Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Range</em>' attribute.
	 * @see #setAllocationRange(String)
	 * @see es.tid.cim.CimPackage#getIPAddressRange_AllocationRange()
	 * @model
	 * @generated
	 */
	String getAllocationRange();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPAddressRange#getAllocationRange <em>Allocation Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Range</em>' attribute.
	 * @see #getAllocationRange()
	 * @generated
	 */
	void setAllocationRange(String value);

} // IPAddressRange
