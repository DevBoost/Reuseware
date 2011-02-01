/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.componentmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.componentmodel.VariationPoint#getType <em>Type</em>}</li>
 *   <li>{@link org.reuseware.air.language.componentmodel.VariationPoint#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.componentmodel.ComponentmodelPackage#getVariationPoint()
 * @model
 * @generated
 */
public interface VariationPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AbstractFragmentType)
	 * @see org.reuseware.air.language.componentmodel.ComponentmodelPackage#getVariationPoint_Type()
	 * @model containment="true"
	 * @generated
	 */
	AbstractFragmentType getType();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.componentmodel.VariationPoint#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractFragmentType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(AbstractVariationPointName)
	 * @see org.reuseware.air.language.componentmodel.ComponentmodelPackage#getVariationPoint_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractVariationPointName getName();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.componentmodel.VariationPoint#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(AbstractVariationPointName value);

} // VariationPoint
