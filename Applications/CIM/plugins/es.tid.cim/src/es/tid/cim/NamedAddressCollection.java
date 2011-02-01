/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Address Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NamedAddressCollection#getCollectionAlias <em>Collection Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNamedAddressCollection()
 * @model
 * @generated
 */
public interface NamedAddressCollection extends SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Collection Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Alias</em>' attribute.
	 * @see #setCollectionAlias(String)
	 * @see es.tid.cim.CimPackage#getNamedAddressCollection_CollectionAlias()
	 * @model
	 * @generated
	 */
	String getCollectionAlias();

	/**
	 * Sets the value of the '{@link es.tid.cim.NamedAddressCollection#getCollectionAlias <em>Collection Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Alias</em>' attribute.
	 * @see #getCollectionAlias()
	 * @generated
	 */
	void setCollectionAlias(String value);

} // NamedAddressCollection
