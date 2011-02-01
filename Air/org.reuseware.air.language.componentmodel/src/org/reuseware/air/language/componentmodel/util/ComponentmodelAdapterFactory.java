/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.componentmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.reuseware.air.language.componentmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.componentmodel.ComponentmodelPackage
 * @generated
 */
public class ComponentmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentmodelSwitch<Adapter> modelSwitch =
		new ComponentmodelSwitch<Adapter>() {
			@Override
			public Adapter caseVariationPoint(VariationPoint object) {
				return createVariationPointAdapter();
			}
			@Override
			public Adapter caseComposer(Composer object) {
				return createComposerAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object) {
				return createSlotAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseAbstractVariationPointName(AbstractVariationPointName object) {
				return createAbstractVariationPointNameAdapter();
			}
			@Override
			public Adapter caseVariationPointName(VariationPointName object) {
				return createVariationPointNameAdapter();
			}
			@Override
			public Adapter caseAbstractFragmentType(AbstractFragmentType object) {
				return createAbstractFragmentTypeAdapter();
			}
			@Override
			public Adapter caseFragmentType(FragmentType object) {
				return createFragmentTypeAdapter();
			}
			@Override
			public Adapter caseFragmentTypeSlot(FragmentTypeSlot object) {
				return createFragmentTypeSlotAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.VariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.VariationPoint
	 * @generated
	 */
	public Adapter createVariationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.Composer <em>Composer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.Composer
	 * @generated
	 */
	public Adapter createComposerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.AbstractVariationPointName <em>Abstract Variation Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.AbstractVariationPointName
	 * @generated
	 */
	public Adapter createAbstractVariationPointNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.VariationPointName <em>Variation Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.VariationPointName
	 * @generated
	 */
	public Adapter createVariationPointNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.AbstractFragmentType <em>Abstract Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.AbstractFragmentType
	 * @generated
	 */
	public Adapter createAbstractFragmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.FragmentType <em>Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.FragmentType
	 * @generated
	 */
	public Adapter createFragmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.componentmodel.FragmentTypeSlot <em>Fragment Type Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.componentmodel.FragmentTypeSlot
	 * @generated
	 */
	public Adapter createFragmentTypeSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponentmodelAdapterFactory
