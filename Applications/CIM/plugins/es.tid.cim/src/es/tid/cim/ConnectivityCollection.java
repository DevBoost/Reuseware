/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ConnectivityCollection#getConnectivityStatus <em>Connectivity Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getConnectivityCollection()
 * @model
 * @generated
 */
public interface ConnectivityCollection extends SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Connectivity Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Status</em>' attribute.
	 * @see #setConnectivityStatus(String)
	 * @see es.tid.cim.CimPackage#getConnectivityCollection_ConnectivityStatus()
	 * @model
	 * @generated
	 */
	String getConnectivityStatus();

	/**
	 * Sets the value of the '{@link es.tid.cim.ConnectivityCollection#getConnectivityStatus <em>Connectivity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Status</em>' attribute.
	 * @see #getConnectivityStatus()
	 * @generated
	 */
	void setConnectivityStatus(String value);

} // ConnectivityCollection
