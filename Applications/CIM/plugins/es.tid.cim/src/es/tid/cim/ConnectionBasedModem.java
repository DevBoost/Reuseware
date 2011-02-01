/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Based Modem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ConnectionBasedModem#getVendorId <em>Vendor Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getConnectionBasedModem()
 * @model abstract="true"
 * @generated
 */
public interface ConnectionBasedModem extends Modem {
	/**
	 * Returns the value of the '<em><b>Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Id</em>' attribute.
	 * @see #setVendorId(String)
	 * @see es.tid.cim.CimPackage#getConnectionBasedModem_VendorId()
	 * @model
	 * @generated
	 */
	String getVendorId();

	/**
	 * Sets the value of the '{@link es.tid.cim.ConnectionBasedModem#getVendorId <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Id</em>' attribute.
	 * @see #getVendorId()
	 * @generated
	 */
	void setVendorId(String value);

} // ConnectionBasedModem
