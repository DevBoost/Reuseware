/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.componentmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.componentmodel.ComponentmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.reuseware.org/air/language/componentmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.reuseware.air.language";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentmodelPackage eINSTANCE = org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.VariationPointImpl <em>Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.VariationPointImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getVariationPoint()
	 * @generated
	 */
	int VARIATION_POINT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.ComposerImpl <em>Composer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.ComposerImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getComposer()
	 * @generated
	 */
	int COMPOSER = 1;

	/**
	 * The number of structural features of the '<em>Composer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.SlotImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__TYPE = VARIATION_POINT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__NAME = VARIATION_POINT__NAME;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.LocationImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PATH = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.AbstractVariationPointNameImpl <em>Abstract Variation Point Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.AbstractVariationPointNameImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getAbstractVariationPointName()
	 * @generated
	 */
	int ABSTRACT_VARIATION_POINT_NAME = 4;

	/**
	 * The number of structural features of the '<em>Abstract Variation Point Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIATION_POINT_NAME_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.VariationPointNameImpl <em>Variation Point Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.VariationPointNameImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getVariationPointName()
	 * @generated
	 */
	int VARIATION_POINT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT_NAME__NAME = ABSTRACT_VARIATION_POINT_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variation Point Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT_NAME_FEATURE_COUNT = ABSTRACT_VARIATION_POINT_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.AbstractFragmentTypeImpl <em>Abstract Fragment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.AbstractFragmentTypeImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getAbstractFragmentType()
	 * @generated
	 */
	int ABSTRACT_FRAGMENT_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Abstract Fragment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAGMENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.FragmentTypeImpl <em>Fragment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.FragmentTypeImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getFragmentType()
	 * @generated
	 */
	int FRAGMENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_TYPE__TYPE = ABSTRACT_FRAGMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fragment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_TYPE_FEATURE_COUNT = ABSTRACT_FRAGMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.componentmodel.impl.FragmentTypeSlotImpl <em>Fragment Type Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.componentmodel.impl.FragmentTypeSlotImpl
	 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getFragmentTypeSlot()
	 * @generated
	 */
	int FRAGMENT_TYPE_SLOT = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_TYPE_SLOT__TYPE = ABSTRACT_FRAGMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_TYPE_SLOT__NAME = ABSTRACT_FRAGMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fragment Type Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_TYPE_SLOT_FEATURE_COUNT = ABSTRACT_FRAGMENT_TYPE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.VariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation Point</em>'.
	 * @see org.reuseware.air.language.componentmodel.VariationPoint
	 * @generated
	 */
	EClass getVariationPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.air.language.componentmodel.VariationPoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.reuseware.air.language.componentmodel.VariationPoint#getType()
	 * @see #getVariationPoint()
	 * @generated
	 */
	EReference getVariationPoint_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.air.language.componentmodel.VariationPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.reuseware.air.language.componentmodel.VariationPoint#getName()
	 * @see #getVariationPoint()
	 * @generated
	 */
	EReference getVariationPoint_Name();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.Composer <em>Composer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composer</em>'.
	 * @see org.reuseware.air.language.componentmodel.Composer
	 * @generated
	 */
	EClass getComposer();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see org.reuseware.air.language.componentmodel.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.reuseware.air.language.componentmodel.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.componentmodel.Location#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.reuseware.air.language.componentmodel.Location#getPath()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Path();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.AbstractVariationPointName <em>Abstract Variation Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Variation Point Name</em>'.
	 * @see org.reuseware.air.language.componentmodel.AbstractVariationPointName
	 * @generated
	 */
	EClass getAbstractVariationPointName();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.VariationPointName <em>Variation Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation Point Name</em>'.
	 * @see org.reuseware.air.language.componentmodel.VariationPointName
	 * @generated
	 */
	EClass getVariationPointName();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.componentmodel.VariationPointName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.air.language.componentmodel.VariationPointName#getName()
	 * @see #getVariationPointName()
	 * @generated
	 */
	EAttribute getVariationPointName_Name();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.AbstractFragmentType <em>Abstract Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Fragment Type</em>'.
	 * @see org.reuseware.air.language.componentmodel.AbstractFragmentType
	 * @generated
	 */
	EClass getAbstractFragmentType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.FragmentType <em>Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Type</em>'.
	 * @see org.reuseware.air.language.componentmodel.FragmentType
	 * @generated
	 */
	EClass getFragmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.componentmodel.FragmentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.reuseware.air.language.componentmodel.FragmentType#getType()
	 * @see #getFragmentType()
	 * @generated
	 */
	EAttribute getFragmentType_Type();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.componentmodel.FragmentTypeSlot <em>Fragment Type Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Type Slot</em>'.
	 * @see org.reuseware.air.language.componentmodel.FragmentTypeSlot
	 * @generated
	 */
	EClass getFragmentTypeSlot();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentmodelFactory getComponentmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.VariationPointImpl <em>Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.VariationPointImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getVariationPoint()
		 * @generated
		 */
		EClass VARIATION_POINT = eINSTANCE.getVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION_POINT__TYPE = eINSTANCE.getVariationPoint_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION_POINT__NAME = eINSTANCE.getVariationPoint_Name();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.ComposerImpl <em>Composer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.ComposerImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getComposer()
		 * @generated
		 */
		EClass COMPOSER = eINSTANCE.getComposer();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.SlotImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.LocationImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__PATH = eINSTANCE.getLocation_Path();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.AbstractVariationPointNameImpl <em>Abstract Variation Point Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.AbstractVariationPointNameImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getAbstractVariationPointName()
		 * @generated
		 */
		EClass ABSTRACT_VARIATION_POINT_NAME = eINSTANCE.getAbstractVariationPointName();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.VariationPointNameImpl <em>Variation Point Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.VariationPointNameImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getVariationPointName()
		 * @generated
		 */
		EClass VARIATION_POINT_NAME = eINSTANCE.getVariationPointName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIATION_POINT_NAME__NAME = eINSTANCE.getVariationPointName_Name();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.AbstractFragmentTypeImpl <em>Abstract Fragment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.AbstractFragmentTypeImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getAbstractFragmentType()
		 * @generated
		 */
		EClass ABSTRACT_FRAGMENT_TYPE = eINSTANCE.getAbstractFragmentType();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.FragmentTypeImpl <em>Fragment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.FragmentTypeImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getFragmentType()
		 * @generated
		 */
		EClass FRAGMENT_TYPE = eINSTANCE.getFragmentType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_TYPE__TYPE = eINSTANCE.getFragmentType_Type();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.componentmodel.impl.FragmentTypeSlotImpl <em>Fragment Type Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.componentmodel.impl.FragmentTypeSlotImpl
		 * @see org.reuseware.air.language.componentmodel.impl.ComponentmodelPackageImpl#getFragmentTypeSlot()
		 * @generated
		 */
		EClass FRAGMENT_TYPE_SLOT = eINSTANCE.getFragmentTypeSlot();

	}

} //ComponentmodelPackage
