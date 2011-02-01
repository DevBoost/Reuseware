/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.application.taipan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Small Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.SmallItems#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.application.taipan.TaiPanPackage#getSmallItems()
 * @model
 * @generated
 */
public interface SmallItems extends Item {

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getSmallItems_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.SmallItems#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // SmallItems