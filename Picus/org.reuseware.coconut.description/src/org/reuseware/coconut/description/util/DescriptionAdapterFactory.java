/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.coconut.description.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.DateFacet;
import org.reuseware.coconut.description.DerivationData;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.DirectDerivation;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.FreeTextFacet;
import org.reuseware.coconut.description.LangIndependentDerivation;
import org.reuseware.coconut.description.ListFacet;
import org.reuseware.coconut.description.MappingDerivation;
import org.reuseware.coconut.description.Property;
import org.reuseware.coconut.description.RangeFacet;
import org.reuseware.coconut.description.TreeFacet;
import org.reuseware.coconut.repository.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.coconut.description.DescriptionPackage
 * @generated
 */
public class DescriptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DescriptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DescriptionPackage.eINSTANCE;
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
	protected DescriptionSwitch<Adapter> modelSwitch =
		new DescriptionSwitch<Adapter>() {
			@Override
			public Adapter caseBrowserState(BrowserState object) {
				return createBrowserStateAdapter();
			}
			@Override
			public Adapter caseFacetDefinition(FacetDefinition object) {
				return createFacetDefinitionAdapter();
			}
			@Override
			public Adapter caseFacetType(FacetType object) {
				return createFacetTypeAdapter();
			}
			@Override
			public Adapter caseDateFacet(DateFacet object) {
				return createDateFacetAdapter();
			}
			@Override
			public Adapter caseListFacet(ListFacet object) {
				return createListFacetAdapter();
			}
			@Override
			public Adapter caseRangeFacet(RangeFacet object) {
				return createRangeFacetAdapter();
			}
			@Override
			public Adapter caseTreeFacet(TreeFacet object) {
				return createTreeFacetAdapter();
			}
			@Override
			public Adapter caseFacet(Facet object) {
				return createFacetAdapter();
			}
			@Override
			public Adapter caseFacetValue(FacetValue object) {
				return createFacetValueAdapter();
			}
			@Override
			public Adapter caseFragmentDescription(FragmentDescription object) {
				return createFragmentDescriptionAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseFreeTextFacet(FreeTextFacet object) {
				return createFreeTextFacetAdapter();
			}
			@Override
			public Adapter caseFacetTypeDecorator(FacetTypeDecorator object) {
				return createFacetTypeDecoratorAdapter();
			}
			@Override
			public Adapter caseFacetValueDecorator(FacetValueDecorator object) {
				return createFacetValueDecoratorAdapter();
			}
			@Override
			public Adapter caseDerivationData(DerivationData object) {
				return createDerivationDataAdapter();
			}
			@Override
			public Adapter caseDirectDerivation(DirectDerivation object) {
				return createDirectDerivationAdapter();
			}
			@Override
			public Adapter caseLangIndependentDerivation(LangIndependentDerivation object) {
				return createLangIndependentDerivationAdapter();
			}
			@Override
			public Adapter caseMappingDerivation(MappingDerivation object) {
				return createMappingDerivationAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.BrowserState <em>Browser State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.BrowserState
	 * @generated
	 */
	public Adapter createBrowserStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.FacetDefinition <em>Facet Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.FacetDefinition
	 * @generated
	 */
	public Adapter createFacetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.FacetType <em>Facet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.FacetType
	 * @generated
	 */
	public Adapter createFacetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.DateFacet <em>Date Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.DateFacet
	 * @generated
	 */
	public Adapter createDateFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.ListFacet <em>List Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.ListFacet
	 * @generated
	 */
	public Adapter createListFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.RangeFacet <em>Range Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.RangeFacet
	 * @generated
	 */
	public Adapter createRangeFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.TreeFacet <em>Tree Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.TreeFacet
	 * @generated
	 */
	public Adapter createTreeFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.Facet
	 * @generated
	 */
	public Adapter createFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.FacetValue <em>Facet Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.FacetValue
	 * @generated
	 */
	public Adapter createFacetValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.FragmentDescription <em>Fragment Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.FragmentDescription
	 * @generated
	 */
	public Adapter createFragmentDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.FreeTextFacet <em>Free Text Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.FreeTextFacet
	 * @generated
	 */
	public Adapter createFreeTextFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.FacetTypeDecorator <em>Facet Type Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.FacetTypeDecorator
	 * @generated
	 */
	public Adapter createFacetTypeDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.FacetValueDecorator <em>Facet Value Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.FacetValueDecorator
	 * @generated
	 */
	public Adapter createFacetValueDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.DerivationData <em>Derivation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.DerivationData
	 * @generated
	 */
	public Adapter createDerivationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.DirectDerivation <em>Direct Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.DirectDerivation
	 * @generated
	 */
	public Adapter createDirectDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.LangIndependentDerivation <em>Lang Independent Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.LangIndependentDerivation
	 * @generated
	 */
	public Adapter createLangIndependentDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.description.MappingDerivation <em>Mapping Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.description.MappingDerivation
	 * @generated
	 */
	public Adapter createMappingDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.coconut.repository.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.coconut.repository.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
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

} //DescriptionAdapterFactory
