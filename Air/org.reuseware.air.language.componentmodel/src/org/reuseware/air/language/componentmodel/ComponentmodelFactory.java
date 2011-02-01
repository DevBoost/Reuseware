/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.componentmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.componentmodel.ComponentmodelPackage
 * @generated
 */
public interface ComponentmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentmodelFactory eINSTANCE = org.reuseware.air.language.componentmodel.impl.ComponentmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variation Point</em>'.
	 * @generated
	 */
	VariationPoint createVariationPoint();

	/**
	 * Returns a new object of class '<em>Composer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composer</em>'.
	 * @generated
	 */
	Composer createComposer();

	/**
	 * Returns a new object of class '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot</em>'.
	 * @generated
	 */
	Slot createSlot();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Abstract Variation Point Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Variation Point Name</em>'.
	 * @generated
	 */
	AbstractVariationPointName createAbstractVariationPointName();

	/**
	 * Returns a new object of class '<em>Variation Point Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variation Point Name</em>'.
	 * @generated
	 */
	VariationPointName createVariationPointName();

	/**
	 * Returns a new object of class '<em>Abstract Fragment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Fragment Type</em>'.
	 * @generated
	 */
	AbstractFragmentType createAbstractFragmentType();

	/**
	 * Returns a new object of class '<em>Fragment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment Type</em>'.
	 * @generated
	 */
	FragmentType createFragmentType();

	/**
	 * Returns a new object of class '<em>Fragment Type Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment Type Slot</em>'.
	 * @generated
	 */
	FragmentTypeSlot createFragmentTypeSlot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentmodelPackage getComponentmodelPackage();

} //ComponentmodelFactory
