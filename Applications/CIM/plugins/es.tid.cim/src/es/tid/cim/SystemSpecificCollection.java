/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Specific Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SystemSpecificCollection#getInstanceID <em>Instance ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSystemSpecificCollection()
 * @model
 * @generated
 */
public interface SystemSpecificCollection extends Collection {
	/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(String)
	 * @see es.tid.cim.CimPackage#getSystemSpecificCollection_InstanceID()
	 * @model
	 * @generated
	 */
	String getInstanceID();

	/**
	 * Sets the value of the '{@link es.tid.cim.SystemSpecificCollection#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

} // SystemSpecificCollection
