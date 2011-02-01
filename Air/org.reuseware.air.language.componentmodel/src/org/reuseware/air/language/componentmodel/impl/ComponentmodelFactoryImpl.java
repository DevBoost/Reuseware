/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.componentmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.reuseware.air.language.componentmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentmodelFactoryImpl extends EFactoryImpl implements ComponentmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentmodelFactory init() {
		try {
			ComponentmodelFactory theComponentmodelFactory = (ComponentmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.reuseware.org/air/language/componentmodel"); 
			if (theComponentmodelFactory != null) {
				return theComponentmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentmodelPackage.VARIATION_POINT: return createVariationPoint();
			case ComponentmodelPackage.COMPOSER: return createComposer();
			case ComponentmodelPackage.SLOT: return createSlot();
			case ComponentmodelPackage.LOCATION: return createLocation();
			case ComponentmodelPackage.ABSTRACT_VARIATION_POINT_NAME: return createAbstractVariationPointName();
			case ComponentmodelPackage.VARIATION_POINT_NAME: return createVariationPointName();
			case ComponentmodelPackage.ABSTRACT_FRAGMENT_TYPE: return createAbstractFragmentType();
			case ComponentmodelPackage.FRAGMENT_TYPE: return createFragmentType();
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT: return createFragmentTypeSlot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariationPoint createVariationPoint() {
		VariationPointImpl variationPoint = new VariationPointImpl();
		return variationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composer createComposer() {
		ComposerImpl composer = new ComposerImpl();
		return composer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVariationPointName createAbstractVariationPointName() {
		AbstractVariationPointNameImpl abstractVariationPointName = new AbstractVariationPointNameImpl();
		return abstractVariationPointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariationPointName createVariationPointName() {
		VariationPointNameImpl variationPointName = new VariationPointNameImpl();
		return variationPointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFragmentType createAbstractFragmentType() {
		AbstractFragmentTypeImpl abstractFragmentType = new AbstractFragmentTypeImpl();
		return abstractFragmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentType createFragmentType() {
		FragmentTypeImpl fragmentType = new FragmentTypeImpl();
		return fragmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentTypeSlot createFragmentTypeSlot() {
		FragmentTypeSlotImpl fragmentTypeSlot = new FragmentTypeSlotImpl();
		return fragmentTypeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentmodelPackage getComponentmodelPackage() {
		return (ComponentmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentmodelPackage getPackage() {
		return ComponentmodelPackage.eINSTANCE;
	}

} //ComponentmodelFactoryImpl
