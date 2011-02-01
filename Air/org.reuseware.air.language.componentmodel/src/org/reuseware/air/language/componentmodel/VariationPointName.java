/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.componentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variation Point Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.componentmodel.VariationPointName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.componentmodel.ComponentmodelPackage#getVariationPointName()
 * @model
 * @generated
 */
public interface VariationPointName extends AbstractVariationPointName {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.reuseware.air.language.componentmodel.ComponentmodelPackage#getVariationPointName_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.componentmodel.VariationPointName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VariationPointName
