/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPX Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.IPXNetwork#getNetworkNumber <em>Network Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getIPXNetwork()
 * @model
 * @generated
 */
public interface IPXNetwork extends LogicalNetwork {
	/**
	 * Returns the value of the '<em><b>Network Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Number</em>' attribute.
	 * @see #setNetworkNumber(String)
	 * @see es.tid.cim.CimPackage#getIPXNetwork_NetworkNumber()
	 * @model
	 * @generated
	 */
	String getNetworkNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPXNetwork#getNetworkNumber <em>Network Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Number</em>' attribute.
	 * @see #getNetworkNumber()
	 * @generated
	 */
	void setNetworkNumber(String value);

} // IPXNetwork
