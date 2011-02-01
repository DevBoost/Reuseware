/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.coconut.description.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.DateFacet;
import org.reuseware.coconut.description.DerivationState;
import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.DirectDerivation;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.FreeTextFacet;
import org.reuseware.coconut.description.GUIState;
import org.reuseware.coconut.description.LangIndependentDerivation;
import org.reuseware.coconut.description.ListFacet;
import org.reuseware.coconut.description.MappingDerivation;
import org.reuseware.coconut.description.Property;
import org.reuseware.coconut.description.RangeFacet;
import org.reuseware.coconut.description.TreeFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionFactoryImpl extends EFactoryImpl implements DescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DescriptionFactory init() {
		try {
			DescriptionFactory theDescriptionFactory = (DescriptionFactory)EPackage.Registry.INSTANCE.getEFactory("http://description/1.0"); 
			if (theDescriptionFactory != null) {
				return theDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionFactoryImpl() {
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
			case DescriptionPackage.BROWSER_STATE: return createBrowserState();
			case DescriptionPackage.FACET_DEFINITION: return createFacetDefinition();
			case DescriptionPackage.DATE_FACET: return createDateFacet();
			case DescriptionPackage.LIST_FACET: return createListFacet();
			case DescriptionPackage.RANGE_FACET: return createRangeFacet();
			case DescriptionPackage.TREE_FACET: return createTreeFacet();
			case DescriptionPackage.FACET: return createFacet();
			case DescriptionPackage.FACET_VALUE: return createFacetValue();
			case DescriptionPackage.FRAGMENT_DESCRIPTION: return createFragmentDescription();
			case DescriptionPackage.PROPERTY: return createProperty();
			case DescriptionPackage.FREE_TEXT_FACET: return createFreeTextFacet();
			case DescriptionPackage.FACET_TYPE_DECORATOR: return createFacetTypeDecorator();
			case DescriptionPackage.FACET_VALUE_DECORATOR: return createFacetValueDecorator();
			case DescriptionPackage.DIRECT_DERIVATION: return createDirectDerivation();
			case DescriptionPackage.LANG_INDEPENDENT_DERIVATION: return createLangIndependentDerivation();
			case DescriptionPackage.MAPPING_DERIVATION: return createMappingDerivation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DescriptionPackage.DERIVATION_STATE:
				return createDerivationStateFromString(eDataType, initialValue);
			case DescriptionPackage.GUI_STATE:
				return createGUIStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DescriptionPackage.DERIVATION_STATE:
				return convertDerivationStateToString(eDataType, instanceValue);
			case DescriptionPackage.GUI_STATE:
				return convertGUIStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserState createBrowserState() {
		BrowserStateImpl browserState = new BrowserStateImpl();
		return browserState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetDefinition createFacetDefinition() {
		FacetDefinitionImpl facetDefinition = new FacetDefinitionImpl();
		return facetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFacet createDateFacet() {
		DateFacetImpl dateFacet = new DateFacetImpl();
		return dateFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFacet createListFacet() {
		ListFacetImpl listFacet = new ListFacetImpl();
		return listFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeFacet createRangeFacet() {
		RangeFacetImpl rangeFacet = new RangeFacetImpl();
		return rangeFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeFacet createTreeFacet() {
		TreeFacetImpl treeFacet = new TreeFacetImpl();
		return treeFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facet createFacet() {
		FacetImpl facet = new FacetImpl();
		return facet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetValue createFacetValue() {
		FacetValueImpl facetValue = new FacetValueImpl();
		return facetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentDescription createFragmentDescription() {
		FragmentDescriptionImpl fragmentDescription = new FragmentDescriptionImpl();
		return fragmentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeTextFacet createFreeTextFacet() {
		FreeTextFacetImpl freeTextFacet = new FreeTextFacetImpl();
		return freeTextFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetTypeDecorator createFacetTypeDecorator() {
		FacetTypeDecoratorImpl facetTypeDecorator = new FacetTypeDecoratorImpl();
		return facetTypeDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetValueDecorator createFacetValueDecorator() {
		FacetValueDecoratorImpl facetValueDecorator = new FacetValueDecoratorImpl();
		return facetValueDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectDerivation createDirectDerivation() {
		DirectDerivationImpl directDerivation = new DirectDerivationImpl();
		return directDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangIndependentDerivation createLangIndependentDerivation() {
		LangIndependentDerivationImpl langIndependentDerivation = new LangIndependentDerivationImpl();
		return langIndependentDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingDerivation createMappingDerivation() {
		MappingDerivationImpl mappingDerivation = new MappingDerivationImpl();
		return mappingDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationState createDerivationStateFromString(EDataType eDataType, String initialValue) {
		DerivationState result = DerivationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIState createGUIStateFromString(EDataType eDataType, String initialValue) {
		GUIState result = GUIState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGUIStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionPackage getDescriptionPackage() {
		return (DescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DescriptionPackage getPackage() {
		return DescriptionPackage.eINSTANCE;
	}

} //DescriptionFactoryImpl
