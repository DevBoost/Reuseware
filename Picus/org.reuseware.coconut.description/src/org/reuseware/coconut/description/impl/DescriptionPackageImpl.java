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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.DateFacet;
import org.reuseware.coconut.description.DerivationData;
import org.reuseware.coconut.description.DerivationState;
import org.reuseware.coconut.description.DescriptionFactory;
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
import org.reuseware.coconut.description.GUIState;
import org.reuseware.coconut.description.LangIndependentDerivation;
import org.reuseware.coconut.description.ListFacet;
import org.reuseware.coconut.description.MappingDerivation;
import org.reuseware.coconut.description.Property;
import org.reuseware.coconut.description.RangeFacet;
import org.reuseware.coconut.description.TreeFacet;
import org.reuseware.coconut.fragment.FragmentPackage;
import org.reuseware.coconut.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionPackageImpl extends EPackageImpl implements DescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browserStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeTextFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetTypeDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetValueDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass langIndependentDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum derivationStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guiStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.reuseware.coconut.description.DescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DescriptionPackageImpl() {
		super(eNS_URI, DescriptionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DescriptionPackage init() {
		if (isInited) return (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);

		// Obtain or create and register package
		DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DescriptionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FragmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDescriptionPackage.createPackageContents();

		// Initialize created meta-data
		theDescriptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDescriptionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DescriptionPackage.eNS_URI, theDescriptionPackage);
		return theDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowserState() {
		return browserStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowserState_SelectedFacets() {
		return (EReference)browserStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowserState_GuiState() {
		return (EAttribute)browserStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowserState_FilteredContent() {
		return (EReference)browserStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowserState_AdditionalFacets() {
		return (EReference)browserStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowserState_PresentedFacets() {
		return (EReference)browserStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetDefinition() {
		return facetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetDefinition_FacetTypes() {
		return (EReference)facetDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetType() {
		return facetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetType_Name() {
		return (EAttribute)facetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetType_MultiValue() {
		return (EAttribute)facetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetType_Description() {
		return (EAttribute)facetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetType_Values() {
		return (EReference)facetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetType_Container() {
		return (EReference)facetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetType_DerivationData() {
		return (EReference)facetTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateFacet() {
		return dateFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateFacet_Query() {
		return (EAttribute)dateFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListFacet() {
		return listFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFacet_Query() {
		return (EAttribute)listFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeFacet() {
		return rangeFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeFacet_Query() {
		return (EAttribute)rangeFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeFacet() {
		return treeFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeFacet_Query() {
		return (EAttribute)treeFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacet() {
		return facetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacet_Type() {
		return (EReference)facetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacet_Values() {
		return (EReference)facetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacet_TypeID() {
		return (EAttribute)facetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacet_ValueNames() {
		return (EAttribute)facetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetValue() {
		return facetValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetValue_Name() {
		return (EAttribute)facetValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetValue_Description() {
		return (EAttribute)facetValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetValue_Value() {
		return (EReference)facetValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetValue_Children() {
		return (EReference)facetValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragmentDescription() {
		return fragmentDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentDescription_Facets() {
		return (EReference)fragmentDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentDescription_Properties() {
		return (EReference)fragmentDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentDescription_Subject() {
		return (EReference)fragmentDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFragmentDescription_DerivationState() {
		return (EAttribute)fragmentDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeTextFacet() {
		return freeTextFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeTextFacet_Query() {
		return (EAttribute)freeTextFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetTypeDecorator() {
		return facetTypeDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetTypeDecorator_Values() {
		return (EReference)facetTypeDecoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetTypeDecorator_Decoratee() {
		return (EReference)facetTypeDecoratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetTypeDecorator_Selection() {
		return (EReference)facetTypeDecoratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetValueDecorator() {
		return facetValueDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetValueDecorator_Children() {
		return (EReference)facetValueDecoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetValueDecorator_Decoratee() {
		return (EReference)facetValueDecoratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetValueDecorator_ValueCount() {
		return (EAttribute)facetValueDecoratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationData() {
		return derivationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivationData_DerivatorID() {
		return (EAttribute)derivationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivationData_Rule() {
		return (EAttribute)derivationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivationData_DerivationDone() {
		return (EAttribute)derivationDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectDerivation() {
		return directDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLangIndependentDerivation() {
		return langIndependentDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingDerivation() {
		return mappingDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingDerivation_FacetTypeID() {
		return (EAttribute)mappingDerivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDerivationState() {
		return derivationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGUIState() {
		return guiStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionFactory getDescriptionFactory() {
		return (DescriptionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		browserStateEClass = createEClass(BROWSER_STATE);
		createEReference(browserStateEClass, BROWSER_STATE__SELECTED_FACETS);
		createEAttribute(browserStateEClass, BROWSER_STATE__GUI_STATE);
		createEReference(browserStateEClass, BROWSER_STATE__FILTERED_CONTENT);
		createEReference(browserStateEClass, BROWSER_STATE__ADDITIONAL_FACETS);
		createEReference(browserStateEClass, BROWSER_STATE__PRESENTED_FACETS);

		facetDefinitionEClass = createEClass(FACET_DEFINITION);
		createEReference(facetDefinitionEClass, FACET_DEFINITION__FACET_TYPES);

		facetTypeEClass = createEClass(FACET_TYPE);
		createEAttribute(facetTypeEClass, FACET_TYPE__NAME);
		createEAttribute(facetTypeEClass, FACET_TYPE__MULTI_VALUE);
		createEAttribute(facetTypeEClass, FACET_TYPE__DESCRIPTION);
		createEReference(facetTypeEClass, FACET_TYPE__VALUES);
		createEReference(facetTypeEClass, FACET_TYPE__CONTAINER);
		createEReference(facetTypeEClass, FACET_TYPE__DERIVATION_DATA);

		dateFacetEClass = createEClass(DATE_FACET);
		createEAttribute(dateFacetEClass, DATE_FACET__QUERY);

		listFacetEClass = createEClass(LIST_FACET);
		createEAttribute(listFacetEClass, LIST_FACET__QUERY);

		rangeFacetEClass = createEClass(RANGE_FACET);
		createEAttribute(rangeFacetEClass, RANGE_FACET__QUERY);

		treeFacetEClass = createEClass(TREE_FACET);
		createEAttribute(treeFacetEClass, TREE_FACET__QUERY);

		facetEClass = createEClass(FACET);
		createEReference(facetEClass, FACET__TYPE);
		createEReference(facetEClass, FACET__VALUES);
		createEAttribute(facetEClass, FACET__TYPE_ID);
		createEAttribute(facetEClass, FACET__VALUE_NAMES);

		facetValueEClass = createEClass(FACET_VALUE);
		createEAttribute(facetValueEClass, FACET_VALUE__NAME);
		createEAttribute(facetValueEClass, FACET_VALUE__DESCRIPTION);
		createEReference(facetValueEClass, FACET_VALUE__VALUE);
		createEReference(facetValueEClass, FACET_VALUE__CHILDREN);

		fragmentDescriptionEClass = createEClass(FRAGMENT_DESCRIPTION);
		createEReference(fragmentDescriptionEClass, FRAGMENT_DESCRIPTION__FACETS);
		createEReference(fragmentDescriptionEClass, FRAGMENT_DESCRIPTION__PROPERTIES);
		createEReference(fragmentDescriptionEClass, FRAGMENT_DESCRIPTION__SUBJECT);
		createEAttribute(fragmentDescriptionEClass, FRAGMENT_DESCRIPTION__DERIVATION_STATE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		freeTextFacetEClass = createEClass(FREE_TEXT_FACET);
		createEAttribute(freeTextFacetEClass, FREE_TEXT_FACET__QUERY);

		facetTypeDecoratorEClass = createEClass(FACET_TYPE_DECORATOR);
		createEReference(facetTypeDecoratorEClass, FACET_TYPE_DECORATOR__VALUES);
		createEReference(facetTypeDecoratorEClass, FACET_TYPE_DECORATOR__DECORATEE);
		createEReference(facetTypeDecoratorEClass, FACET_TYPE_DECORATOR__SELECTION);

		facetValueDecoratorEClass = createEClass(FACET_VALUE_DECORATOR);
		createEReference(facetValueDecoratorEClass, FACET_VALUE_DECORATOR__CHILDREN);
		createEReference(facetValueDecoratorEClass, FACET_VALUE_DECORATOR__DECORATEE);
		createEAttribute(facetValueDecoratorEClass, FACET_VALUE_DECORATOR__VALUE_COUNT);

		derivationDataEClass = createEClass(DERIVATION_DATA);
		createEAttribute(derivationDataEClass, DERIVATION_DATA__DERIVATOR_ID);
		createEAttribute(derivationDataEClass, DERIVATION_DATA__RULE);
		createEAttribute(derivationDataEClass, DERIVATION_DATA__DERIVATION_DONE);

		directDerivationEClass = createEClass(DIRECT_DERIVATION);

		langIndependentDerivationEClass = createEClass(LANG_INDEPENDENT_DERIVATION);

		mappingDerivationEClass = createEClass(MAPPING_DERIVATION);
		createEAttribute(mappingDerivationEClass, MAPPING_DERIVATION__FACET_TYPE_ID);

		// Create enums
		derivationStateEEnum = createEEnum(DERIVATION_STATE);
		guiStateEEnum = createEEnum(GUI_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		FragmentPackage theFragmentPackage = (FragmentPackage)EPackage.Registry.INSTANCE.getEPackage(FragmentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		facetDefinitionEClass.getESuperTypes().add(theRepositoryPackage.getPackageableElement());
		dateFacetEClass.getESuperTypes().add(this.getFacetType());
		listFacetEClass.getESuperTypes().add(this.getFacetType());
		rangeFacetEClass.getESuperTypes().add(this.getFacetType());
		treeFacetEClass.getESuperTypes().add(this.getFacetType());
		fragmentDescriptionEClass.getESuperTypes().add(theRepositoryPackage.getPackageableElement());
		freeTextFacetEClass.getESuperTypes().add(this.getFacetType());
		directDerivationEClass.getESuperTypes().add(this.getDerivationData());
		langIndependentDerivationEClass.getESuperTypes().add(this.getDerivationData());
		mappingDerivationEClass.getESuperTypes().add(this.getDerivationData());

		// Initialize classes and features; add operations and parameters
		initEClass(browserStateEClass, BrowserState.class, "BrowserState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBrowserState_SelectedFacets(), this.getFacet(), null, "selectedFacets", null, 0, -1, BrowserState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrowserState_GuiState(), this.getGUIState(), "guiState", null, 0, 1, BrowserState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrowserState_FilteredContent(), this.getFragmentDescription(), null, "filteredContent", null, 0, -1, BrowserState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrowserState_AdditionalFacets(), this.getFacetTypeDecorator(), null, "additionalFacets", null, 0, -1, BrowserState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrowserState_PresentedFacets(), this.getFacetTypeDecorator(), null, "presentedFacets", null, 0, -1, BrowserState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetDefinitionEClass, FacetDefinition.class, "FacetDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetDefinition_FacetTypes(), this.getFacetType(), this.getFacetType_Container(), "facetTypes", null, 0, -1, FacetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetTypeEClass, FacetType.class, "FacetType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacetType_Name(), ecorePackage.getEString(), "name", null, 0, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacetType_MultiValue(), ecorePackage.getEBoolean(), "multiValue", null, 0, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacetType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetType_Values(), this.getFacetValue(), null, "values", null, 1, -1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetType_Container(), this.getFacetDefinition(), this.getFacetDefinition_FacetTypes(), "container", null, 1, 1, FacetType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFacetType_DerivationData(), this.getDerivationData(), null, "derivationData", null, 0, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(facetTypeEClass, ecorePackage.getEString(), "getQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dateFacetEClass, DateFacet.class, "DateFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateFacet_Query(), ecorePackage.getEString(), "query", "if self.facets->exists(f | f.type = filterFacet.type) then self.facets->any(f | f.type = filterFacet.type).values->exists(v | filterFacet.values->exists(fv | v = fv)) else false endif", 0, 1, DateFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listFacetEClass, ListFacet.class, "ListFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListFacet_Query(), ecorePackage.getEString(), "query", "if self.facets->exists(f | f.type = filterFacet.type) then self.facets->any(f | f.type = filterFacet.type).values->exists(v | filterFacet.values->exists(fv | v = fv)) else false endif", 0, 1, ListFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeFacetEClass, RangeFacet.class, "RangeFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeFacet_Query(), ecorePackage.getEString(), "query", "if self.facets->exists(f | f.type = filterFacet.type) then self.facets->any(f | f.type = filterFacet.type).values->exists(v | filterFacet.values->exists(fv | v = fv)) else false endif", 0, 1, RangeFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeFacetEClass, TreeFacet.class, "TreeFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeFacet_Query(), ecorePackage.getEString(), "query", "if self.facets->exists(f | f.type = filterFacet.type) then self.facets->any(f | f.type = filterFacet.type).values->exists(v | filterFacet.values->exists(fv | v = fv)) else false endif", 0, 1, TreeFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetEClass, Facet.class, "Facet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacet_Type(), this.getFacetType(), null, "type", null, 1, 1, Facet.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacet_Values(), this.getFacetValue(), null, "values", null, 1, -1, Facet.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacet_TypeID(), ecorePackage.getEString(), "typeID", null, 0, -1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacet_ValueNames(), ecorePackage.getEString(), "valueNames", "", 0, -1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetValueEClass, FacetValue.class, "FacetValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacetValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, FacetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacetValue_Description(), ecorePackage.getEString(), "description", null, 0, 1, FacetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetValue_Value(), theEcorePackage.getEObject(), null, "value", null, 1, 1, FacetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetValue_Children(), this.getFacetValue(), null, "children", null, 0, -1, FacetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentDescriptionEClass, FragmentDescription.class, "FragmentDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragmentDescription_Facets(), this.getFacet(), null, "facets", null, 0, -1, FragmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFragmentDescription_Properties(), this.getProperty(), null, "properties", null, 0, -1, FragmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFragmentDescription_Subject(), theFragmentPackage.getFragment(), null, "subject", null, 1, 1, FragmentDescription.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFragmentDescription_DerivationState(), this.getDerivationState(), "derivationState", "", 0, 1, FragmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freeTextFacetEClass, FreeTextFacet.class, "FreeTextFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeTextFacet_Query(), ecorePackage.getEString(), "query", "if self.facets->exists(f | f.type = filterFacet.type) then self.facets->any(f | f.type = filterFacet.type).values->exists(v | filterFacet.values->exists(fv | v = fv)) else false endif", 0, 1, FreeTextFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetTypeDecoratorEClass, FacetTypeDecorator.class, "FacetTypeDecorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetTypeDecorator_Values(), this.getFacetValueDecorator(), null, "values", null, 0, -1, FacetTypeDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetTypeDecorator_Decoratee(), this.getFacetType(), null, "decoratee", null, 1, 1, FacetTypeDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetTypeDecorator_Selection(), this.getFacet(), null, "selection", null, 0, 1, FacetTypeDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetValueDecoratorEClass, FacetValueDecorator.class, "FacetValueDecorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetValueDecorator_Children(), this.getFacetValueDecorator(), null, "children", null, 0, -1, FacetValueDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetValueDecorator_Decoratee(), this.getFacetValue(), null, "decoratee", null, 1, 1, FacetValueDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacetValueDecorator_ValueCount(), ecorePackage.getEInt(), "valueCount", null, 0, 1, FacetValueDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivationDataEClass, DerivationData.class, "DerivationData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivationData_DerivatorID(), theEcorePackage.getEString(), "derivatorID", null, 0, 1, DerivationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerivationData_Rule(), ecorePackage.getEString(), "rule", "", 0, 1, DerivationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerivationData_DerivationDone(), theEcorePackage.getEBoolean(), "derivationDone", null, 0, 1, DerivationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directDerivationEClass, DirectDerivation.class, "DirectDerivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(langIndependentDerivationEClass, LangIndependentDerivation.class, "LangIndependentDerivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingDerivationEClass, MappingDerivation.class, "MappingDerivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingDerivation_FacetTypeID(), ecorePackage.getEString(), "facetTypeID", null, 0, -1, MappingDerivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(derivationStateEEnum, DerivationState.class, "DerivationState");
		addEEnumLiteral(derivationStateEEnum, DerivationState.REFRESH_ALL);
		addEEnumLiteral(derivationStateEEnum, DerivationState.REFRESH_DIRECT_FACETS);
		addEEnumLiteral(derivationStateEEnum, DerivationState.REFRESH_LANG_INDE_FACETS);
		addEEnumLiteral(derivationStateEEnum, DerivationState.REFRESH_MAPPING_FACETS);
		addEEnumLiteral(derivationStateEEnum, DerivationState.UP_TO_DATE);

		initEEnum(guiStateEEnum, GUIState.class, "GUIState");
		addEEnumLiteral(guiStateEEnum, GUIState.REFRESH_ALL);
		addEEnumLiteral(guiStateEEnum, GUIState.REFRESH_VALUE_COUNTS);
		addEEnumLiteral(guiStateEEnum, GUIState.UP_TO_DATE);

		// Create resource
		createResource(eNS_URI);
	}

} //DescriptionPackageImpl
