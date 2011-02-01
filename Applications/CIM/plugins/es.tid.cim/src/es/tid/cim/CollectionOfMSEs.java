/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Of MS Es</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.CollectionOfMSEs#getCollectionId <em>Collection Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getCollectionOfMSEs()
 * @model abstract="true"
 * @generated
 */
public interface CollectionOfMSEs extends Collection {
	/**
	 * Returns the value of the '<em><b>Collection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Id</em>' attribute.
	 * @see #setCollectionId(String)
	 * @see es.tid.cim.CimPackage#getCollectionOfMSEs_CollectionId()
	 * @model
	 * @generated
	 */
	String getCollectionId();

	/**
	 * Sets the value of the '{@link es.tid.cim.CollectionOfMSEs#getCollectionId <em>Collection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Id</em>' attribute.
	 * @see #getCollectionId()
	 * @generated
	 */
	void setCollectionId(String value);

} // CollectionOfMSEs
