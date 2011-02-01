/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.application.taipan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Large Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.LargeItem#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.application.taipan.TaiPanPackage#getLargeItem()
 * @model
 * @generated
 */
public interface LargeItem extends Item {

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(float)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getLargeItem_Weight()
	 * @model
	 * @generated
	 */
	float getWeight();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.LargeItem#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(float value);

} // LargeItem