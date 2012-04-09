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
package org.reuseware.coconut.description;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.reuseware.coconut.repository.RepositoryPackage;

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
 * @see org.reuseware.coconut.description.DescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface DescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "description";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://description/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "description";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DescriptionPackage eINSTANCE = org.reuseware.coconut.description.impl.DescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.BrowserStateImpl <em>Browser State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.BrowserStateImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getBrowserState()
	 * @generated
	 */
	int BROWSER_STATE = 0;

	/**
	 * The feature id for the '<em><b>Selected Facets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_STATE__SELECTED_FACETS = 0;

	/**
	 * The feature id for the '<em><b>Gui State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_STATE__GUI_STATE = 1;

	/**
	 * The feature id for the '<em><b>Filtered Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_STATE__FILTERED_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Additional Facets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_STATE__ADDITIONAL_FACETS = 3;

	/**
	 * The feature id for the '<em><b>Presented Facets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_STATE__PRESENTED_FACETS = 4;

	/**
	 * The number of structural features of the '<em>Browser State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_STATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.FacetDefinitionImpl <em>Facet Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.FacetDefinitionImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetDefinition()
	 * @generated
	 */
	int FACET_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_DEFINITION__ID = RepositoryPackage.PACKAGEABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_DEFINITION__PACKAGE = RepositoryPackage.PACKAGEABLE_ELEMENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_DEFINITION__ROOT = RepositoryPackage.PACKAGEABLE_ELEMENT__ROOT;

	/**
	 * The feature id for the '<em><b>Facet Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_DEFINITION__FACET_TYPES = RepositoryPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Facet Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_DEFINITION_FEATURE_COUNT = RepositoryPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.FacetTypeImpl <em>Facet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.FacetTypeImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetType()
	 * @generated
	 */
	int FACET_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__MULTI_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__VALUES = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Derivation Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__DERIVATION_DATA = 5;

	/**
	 * The number of structural features of the '<em>Facet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.DateFacetImpl <em>Date Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.DateFacetImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getDateFacet()
	 * @generated
	 */
	int DATE_FACET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FACET__NAME = FACET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FACET__MULTI_VALUE = FACET_TYPE__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FACET__DESCRIPTION = FACET_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FACET__VALUES = FACET_TYPE__VALUES;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FACET__CONTAINER = FACET_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Derivation Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FACET__DERIVATION_DATA = FACET_TYPE__DERIVATION_DATA;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FACET__QUERY = FACET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.ListFacetImpl <em>List Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.ListFacetImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getListFacet()
	 * @generated
	 */
	int LIST_FACET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FACET__NAME = FACET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FACET__MULTI_VALUE = FACET_TYPE__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FACET__DESCRIPTION = FACET_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FACET__VALUES = FACET_TYPE__VALUES;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FACET__CONTAINER = FACET_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Derivation Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FACET__DERIVATION_DATA = FACET_TYPE__DERIVATION_DATA;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FACET__QUERY = FACET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.RangeFacetImpl <em>Range Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.RangeFacetImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getRangeFacet()
	 * @generated
	 */
	int RANGE_FACET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FACET__NAME = FACET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FACET__MULTI_VALUE = FACET_TYPE__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FACET__DESCRIPTION = FACET_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FACET__VALUES = FACET_TYPE__VALUES;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FACET__CONTAINER = FACET_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Derivation Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FACET__DERIVATION_DATA = FACET_TYPE__DERIVATION_DATA;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FACET__QUERY = FACET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.TreeFacetImpl <em>Tree Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.TreeFacetImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getTreeFacet()
	 * @generated
	 */
	int TREE_FACET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FACET__NAME = FACET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FACET__MULTI_VALUE = FACET_TYPE__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FACET__DESCRIPTION = FACET_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FACET__VALUES = FACET_TYPE__VALUES;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FACET__CONTAINER = FACET_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Derivation Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FACET__DERIVATION_DATA = FACET_TYPE__DERIVATION_DATA;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FACET__QUERY = FACET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tree Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.FacetImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Type ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__TYPE_ID = 2;

	/**
	 * The feature id for the '<em><b>Value Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__VALUE_NAMES = 3;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.FacetValueImpl <em>Facet Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.FacetValueImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetValue()
	 * @generated
	 */
	int FACET_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE__CHILDREN = 3;

	/**
	 * The number of structural features of the '<em>Facet Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.FragmentDescriptionImpl <em>Fragment Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.FragmentDescriptionImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFragmentDescription()
	 * @generated
	 */
	int FRAGMENT_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DESCRIPTION__ID = RepositoryPackage.PACKAGEABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DESCRIPTION__PACKAGE = RepositoryPackage.PACKAGEABLE_ELEMENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DESCRIPTION__ROOT = RepositoryPackage.PACKAGEABLE_ELEMENT__ROOT;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DESCRIPTION__FACETS = RepositoryPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DESCRIPTION__PROPERTIES = RepositoryPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DESCRIPTION__SUBJECT = RepositoryPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Derivation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DESCRIPTION__DERIVATION_STATE = RepositoryPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fragment Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DESCRIPTION_FEATURE_COUNT = RepositoryPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.PropertyImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.FreeTextFacetImpl <em>Free Text Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.FreeTextFacetImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFreeTextFacet()
	 * @generated
	 */
	int FREE_TEXT_FACET = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FACET__NAME = FACET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FACET__MULTI_VALUE = FACET_TYPE__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FACET__DESCRIPTION = FACET_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FACET__VALUES = FACET_TYPE__VALUES;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FACET__CONTAINER = FACET_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Derivation Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FACET__DERIVATION_DATA = FACET_TYPE__DERIVATION_DATA;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FACET__QUERY = FACET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Free Text Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.FacetTypeDecoratorImpl <em>Facet Type Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.FacetTypeDecoratorImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetTypeDecorator()
	 * @generated
	 */
	int FACET_TYPE_DECORATOR = 12;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_DECORATOR__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Decoratee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_DECORATOR__DECORATEE = 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_DECORATOR__SELECTION = 2;

	/**
	 * The number of structural features of the '<em>Facet Type Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_DECORATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.FacetValueDecoratorImpl <em>Facet Value Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.FacetValueDecoratorImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetValueDecorator()
	 * @generated
	 */
	int FACET_VALUE_DECORATOR = 13;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE_DECORATOR__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Decoratee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE_DECORATOR__DECORATEE = 1;

	/**
	 * The feature id for the '<em><b>Value Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE_DECORATOR__VALUE_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Facet Value Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_VALUE_DECORATOR_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.DerivationDataImpl <em>Derivation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.DerivationDataImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getDerivationData()
	 * @generated
	 */
	int DERIVATION_DATA = 14;

	/**
	 * The feature id for the '<em><b>Derivator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_DATA__DERIVATOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_DATA__RULE = 1;

	/**
	 * The feature id for the '<em><b>Derivation Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_DATA__DERIVATION_DONE = 2;

	/**
	 * The number of structural features of the '<em>Derivation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_DATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.DirectDerivationImpl <em>Direct Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.DirectDerivationImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getDirectDerivation()
	 * @generated
	 */
	int DIRECT_DERIVATION = 15;

	/**
	 * The feature id for the '<em><b>Derivator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION__DERIVATOR_ID = DERIVATION_DATA__DERIVATOR_ID;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION__RULE = DERIVATION_DATA__RULE;

	/**
	 * The feature id for the '<em><b>Derivation Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION__DERIVATION_DONE = DERIVATION_DATA__DERIVATION_DONE;

	/**
	 * The number of structural features of the '<em>Direct Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION_FEATURE_COUNT = DERIVATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.LangIndependentDerivationImpl <em>Lang Independent Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.LangIndependentDerivationImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getLangIndependentDerivation()
	 * @generated
	 */
	int LANG_INDEPENDENT_DERIVATION = 16;

	/**
	 * The feature id for the '<em><b>Derivator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_INDEPENDENT_DERIVATION__DERIVATOR_ID = DERIVATION_DATA__DERIVATOR_ID;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_INDEPENDENT_DERIVATION__RULE = DERIVATION_DATA__RULE;

	/**
	 * The feature id for the '<em><b>Derivation Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_INDEPENDENT_DERIVATION__DERIVATION_DONE = DERIVATION_DATA__DERIVATION_DONE;

	/**
	 * The number of structural features of the '<em>Lang Independent Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_INDEPENDENT_DERIVATION_FEATURE_COUNT = DERIVATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.impl.MappingDerivationImpl <em>Mapping Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.impl.MappingDerivationImpl
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getMappingDerivation()
	 * @generated
	 */
	int MAPPING_DERIVATION = 17;

	/**
	 * The feature id for the '<em><b>Derivator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DERIVATION__DERIVATOR_ID = DERIVATION_DATA__DERIVATOR_ID;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DERIVATION__RULE = DERIVATION_DATA__RULE;

	/**
	 * The feature id for the '<em><b>Derivation Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DERIVATION__DERIVATION_DONE = DERIVATION_DATA__DERIVATION_DONE;

	/**
	 * The feature id for the '<em><b>Facet Type ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DERIVATION__FACET_TYPE_ID = DERIVATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DERIVATION_FEATURE_COUNT = DERIVATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.DerivationState <em>Derivation State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.DerivationState
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getDerivationState()
	 * @generated
	 */
	int DERIVATION_STATE = 18;


	/**
	 * The meta object id for the '{@link org.reuseware.coconut.description.GUIState <em>GUI State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.coconut.description.GUIState
	 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getGUIState()
	 * @generated
	 */
	int GUI_STATE = 19;


	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.BrowserState <em>Browser State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser State</em>'.
	 * @see org.reuseware.coconut.description.BrowserState
	 * @generated
	 */
	EClass getBrowserState();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.coconut.description.BrowserState#getSelectedFacets <em>Selected Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Facets</em>'.
	 * @see org.reuseware.coconut.description.BrowserState#getSelectedFacets()
	 * @see #getBrowserState()
	 * @generated
	 */
	EReference getBrowserState_SelectedFacets();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.BrowserState#getGuiState <em>Gui State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gui State</em>'.
	 * @see org.reuseware.coconut.description.BrowserState#getGuiState()
	 * @see #getBrowserState()
	 * @generated
	 */
	EAttribute getBrowserState_GuiState();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.coconut.description.BrowserState#getFilteredContent <em>Filtered Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filtered Content</em>'.
	 * @see org.reuseware.coconut.description.BrowserState#getFilteredContent()
	 * @see #getBrowserState()
	 * @generated
	 */
	EReference getBrowserState_FilteredContent();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.coconut.description.BrowserState#getAdditionalFacets <em>Additional Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Facets</em>'.
	 * @see org.reuseware.coconut.description.BrowserState#getAdditionalFacets()
	 * @see #getBrowserState()
	 * @generated
	 */
	EReference getBrowserState_AdditionalFacets();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.coconut.description.BrowserState#getPresentedFacets <em>Presented Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Presented Facets</em>'.
	 * @see org.reuseware.coconut.description.BrowserState#getPresentedFacets()
	 * @see #getBrowserState()
	 * @generated
	 */
	EReference getBrowserState_PresentedFacets();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.FacetDefinition <em>Facet Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Definition</em>'.
	 * @see org.reuseware.coconut.description.FacetDefinition
	 * @generated
	 */
	EClass getFacetDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.coconut.description.FacetDefinition#getFacetTypes <em>Facet Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facet Types</em>'.
	 * @see org.reuseware.coconut.description.FacetDefinition#getFacetTypes()
	 * @see #getFacetDefinition()
	 * @generated
	 */
	EReference getFacetDefinition_FacetTypes();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.FacetType <em>Facet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Type</em>'.
	 * @see org.reuseware.coconut.description.FacetType
	 * @generated
	 */
	EClass getFacetType();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.FacetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.coconut.description.FacetType#getName()
	 * @see #getFacetType()
	 * @generated
	 */
	EAttribute getFacetType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.FacetType#isMultiValue <em>Multi Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Value</em>'.
	 * @see org.reuseware.coconut.description.FacetType#isMultiValue()
	 * @see #getFacetType()
	 * @generated
	 */
	EAttribute getFacetType_MultiValue();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.FacetType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.reuseware.coconut.description.FacetType#getDescription()
	 * @see #getFacetType()
	 * @generated
	 */
	EAttribute getFacetType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.coconut.description.FacetType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.reuseware.coconut.description.FacetType#getValues()
	 * @see #getFacetType()
	 * @generated
	 */
	EReference getFacetType_Values();

	/**
	 * Returns the meta object for the container reference '{@link org.reuseware.coconut.description.FacetType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.reuseware.coconut.description.FacetType#getContainer()
	 * @see #getFacetType()
	 * @generated
	 */
	EReference getFacetType_Container();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.coconut.description.FacetType#getDerivationData <em>Derivation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derivation Data</em>'.
	 * @see org.reuseware.coconut.description.FacetType#getDerivationData()
	 * @see #getFacetType()
	 * @generated
	 */
	EReference getFacetType_DerivationData();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.DateFacet <em>Date Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Facet</em>'.
	 * @see org.reuseware.coconut.description.DateFacet
	 * @generated
	 */
	EClass getDateFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.DateFacet#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.reuseware.coconut.description.DateFacet#getQuery()
	 * @see #getDateFacet()
	 * @generated
	 */
	EAttribute getDateFacet_Query();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.ListFacet <em>List Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Facet</em>'.
	 * @see org.reuseware.coconut.description.ListFacet
	 * @generated
	 */
	EClass getListFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.ListFacet#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.reuseware.coconut.description.ListFacet#getQuery()
	 * @see #getListFacet()
	 * @generated
	 */
	EAttribute getListFacet_Query();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.RangeFacet <em>Range Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Facet</em>'.
	 * @see org.reuseware.coconut.description.RangeFacet
	 * @generated
	 */
	EClass getRangeFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.RangeFacet#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.reuseware.coconut.description.RangeFacet#getQuery()
	 * @see #getRangeFacet()
	 * @generated
	 */
	EAttribute getRangeFacet_Query();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.TreeFacet <em>Tree Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Facet</em>'.
	 * @see org.reuseware.coconut.description.TreeFacet
	 * @generated
	 */
	EClass getTreeFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.TreeFacet#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.reuseware.coconut.description.TreeFacet#getQuery()
	 * @see #getTreeFacet()
	 * @generated
	 */
	EAttribute getTreeFacet_Query();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see org.reuseware.coconut.description.Facet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.coconut.description.Facet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.reuseware.coconut.description.Facet#getType()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.coconut.description.Facet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.reuseware.coconut.description.Facet#getValues()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Values();

	/**
	 * Returns the meta object for the attribute list '{@link org.reuseware.coconut.description.Facet#getTypeID <em>Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type ID</em>'.
	 * @see org.reuseware.coconut.description.Facet#getTypeID()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_TypeID();

	/**
	 * Returns the meta object for the attribute list '{@link org.reuseware.coconut.description.Facet#getValueNames <em>Value Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Names</em>'.
	 * @see org.reuseware.coconut.description.Facet#getValueNames()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_ValueNames();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.FacetValue <em>Facet Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Value</em>'.
	 * @see org.reuseware.coconut.description.FacetValue
	 * @generated
	 */
	EClass getFacetValue();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.FacetValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.coconut.description.FacetValue#getName()
	 * @see #getFacetValue()
	 * @generated
	 */
	EAttribute getFacetValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.FacetValue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.reuseware.coconut.description.FacetValue#getDescription()
	 * @see #getFacetValue()
	 * @generated
	 */
	EAttribute getFacetValue_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.coconut.description.FacetValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.reuseware.coconut.description.FacetValue#getValue()
	 * @see #getFacetValue()
	 * @generated
	 */
	EReference getFacetValue_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.coconut.description.FacetValue#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.reuseware.coconut.description.FacetValue#getChildren()
	 * @see #getFacetValue()
	 * @generated
	 */
	EReference getFacetValue_Children();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.FragmentDescription <em>Fragment Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Description</em>'.
	 * @see org.reuseware.coconut.description.FragmentDescription
	 * @generated
	 */
	EClass getFragmentDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.coconut.description.FragmentDescription#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see org.reuseware.coconut.description.FragmentDescription#getFacets()
	 * @see #getFragmentDescription()
	 * @generated
	 */
	EReference getFragmentDescription_Facets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.coconut.description.FragmentDescription#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.reuseware.coconut.description.FragmentDescription#getProperties()
	 * @see #getFragmentDescription()
	 * @generated
	 */
	EReference getFragmentDescription_Properties();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.coconut.description.FragmentDescription#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see org.reuseware.coconut.description.FragmentDescription#getSubject()
	 * @see #getFragmentDescription()
	 * @generated
	 */
	EReference getFragmentDescription_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.FragmentDescription#getDerivationState <em>Derivation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivation State</em>'.
	 * @see org.reuseware.coconut.description.FragmentDescription#getDerivationState()
	 * @see #getFragmentDescription()
	 * @generated
	 */
	EAttribute getFragmentDescription_DerivationState();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.reuseware.coconut.description.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.coconut.description.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.reuseware.coconut.description.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.FreeTextFacet <em>Free Text Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text Facet</em>'.
	 * @see org.reuseware.coconut.description.FreeTextFacet
	 * @generated
	 */
	EClass getFreeTextFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.FreeTextFacet#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.reuseware.coconut.description.FreeTextFacet#getQuery()
	 * @see #getFreeTextFacet()
	 * @generated
	 */
	EAttribute getFreeTextFacet_Query();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.FacetTypeDecorator <em>Facet Type Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Type Decorator</em>'.
	 * @see org.reuseware.coconut.description.FacetTypeDecorator
	 * @generated
	 */
	EClass getFacetTypeDecorator();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.coconut.description.FacetTypeDecorator#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.reuseware.coconut.description.FacetTypeDecorator#getValues()
	 * @see #getFacetTypeDecorator()
	 * @generated
	 */
	EReference getFacetTypeDecorator_Values();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.coconut.description.FacetTypeDecorator#getDecoratee <em>Decoratee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decoratee</em>'.
	 * @see org.reuseware.coconut.description.FacetTypeDecorator#getDecoratee()
	 * @see #getFacetTypeDecorator()
	 * @generated
	 */
	EReference getFacetTypeDecorator_Decoratee();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.coconut.description.FacetTypeDecorator#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see org.reuseware.coconut.description.FacetTypeDecorator#getSelection()
	 * @see #getFacetTypeDecorator()
	 * @generated
	 */
	EReference getFacetTypeDecorator_Selection();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.FacetValueDecorator <em>Facet Value Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Value Decorator</em>'.
	 * @see org.reuseware.coconut.description.FacetValueDecorator
	 * @generated
	 */
	EClass getFacetValueDecorator();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.coconut.description.FacetValueDecorator#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.reuseware.coconut.description.FacetValueDecorator#getChildren()
	 * @see #getFacetValueDecorator()
	 * @generated
	 */
	EReference getFacetValueDecorator_Children();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.coconut.description.FacetValueDecorator#getDecoratee <em>Decoratee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decoratee</em>'.
	 * @see org.reuseware.coconut.description.FacetValueDecorator#getDecoratee()
	 * @see #getFacetValueDecorator()
	 * @generated
	 */
	EReference getFacetValueDecorator_Decoratee();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.FacetValueDecorator#getValueCount <em>Value Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Count</em>'.
	 * @see org.reuseware.coconut.description.FacetValueDecorator#getValueCount()
	 * @see #getFacetValueDecorator()
	 * @generated
	 */
	EAttribute getFacetValueDecorator_ValueCount();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.DerivationData <em>Derivation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation Data</em>'.
	 * @see org.reuseware.coconut.description.DerivationData
	 * @generated
	 */
	EClass getDerivationData();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.DerivationData#getDerivatorID <em>Derivator ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivator ID</em>'.
	 * @see org.reuseware.coconut.description.DerivationData#getDerivatorID()
	 * @see #getDerivationData()
	 * @generated
	 */
	EAttribute getDerivationData_DerivatorID();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.DerivationData#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see org.reuseware.coconut.description.DerivationData#getRule()
	 * @see #getDerivationData()
	 * @generated
	 */
	EAttribute getDerivationData_Rule();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.coconut.description.DerivationData#isDerivationDone <em>Derivation Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivation Done</em>'.
	 * @see org.reuseware.coconut.description.DerivationData#isDerivationDone()
	 * @see #getDerivationData()
	 * @generated
	 */
	EAttribute getDerivationData_DerivationDone();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.DirectDerivation <em>Direct Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Derivation</em>'.
	 * @see org.reuseware.coconut.description.DirectDerivation
	 * @generated
	 */
	EClass getDirectDerivation();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.LangIndependentDerivation <em>Lang Independent Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lang Independent Derivation</em>'.
	 * @see org.reuseware.coconut.description.LangIndependentDerivation
	 * @generated
	 */
	EClass getLangIndependentDerivation();

	/**
	 * Returns the meta object for class '{@link org.reuseware.coconut.description.MappingDerivation <em>Mapping Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Derivation</em>'.
	 * @see org.reuseware.coconut.description.MappingDerivation
	 * @generated
	 */
	EClass getMappingDerivation();

	/**
	 * Returns the meta object for the attribute list '{@link org.reuseware.coconut.description.MappingDerivation#getFacetTypeID <em>Facet Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Facet Type ID</em>'.
	 * @see org.reuseware.coconut.description.MappingDerivation#getFacetTypeID()
	 * @see #getMappingDerivation()
	 * @generated
	 */
	EAttribute getMappingDerivation_FacetTypeID();

	/**
	 * Returns the meta object for enum '{@link org.reuseware.coconut.description.DerivationState <em>Derivation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Derivation State</em>'.
	 * @see org.reuseware.coconut.description.DerivationState
	 * @generated
	 */
	EEnum getDerivationState();

	/**
	 * Returns the meta object for enum '{@link org.reuseware.coconut.description.GUIState <em>GUI State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GUI State</em>'.
	 * @see org.reuseware.coconut.description.GUIState
	 * @generated
	 */
	EEnum getGUIState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DescriptionFactory getDescriptionFactory();

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
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.BrowserStateImpl <em>Browser State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.BrowserStateImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getBrowserState()
		 * @generated
		 */
		EClass BROWSER_STATE = eINSTANCE.getBrowserState();

		/**
		 * The meta object literal for the '<em><b>Selected Facets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROWSER_STATE__SELECTED_FACETS = eINSTANCE.getBrowserState_SelectedFacets();

		/**
		 * The meta object literal for the '<em><b>Gui State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSER_STATE__GUI_STATE = eINSTANCE.getBrowserState_GuiState();

		/**
		 * The meta object literal for the '<em><b>Filtered Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROWSER_STATE__FILTERED_CONTENT = eINSTANCE.getBrowserState_FilteredContent();

		/**
		 * The meta object literal for the '<em><b>Additional Facets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROWSER_STATE__ADDITIONAL_FACETS = eINSTANCE.getBrowserState_AdditionalFacets();

		/**
		 * The meta object literal for the '<em><b>Presented Facets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROWSER_STATE__PRESENTED_FACETS = eINSTANCE.getBrowserState_PresentedFacets();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.FacetDefinitionImpl <em>Facet Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.FacetDefinitionImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetDefinition()
		 * @generated
		 */
		EClass FACET_DEFINITION = eINSTANCE.getFacetDefinition();

		/**
		 * The meta object literal for the '<em><b>Facet Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_DEFINITION__FACET_TYPES = eINSTANCE.getFacetDefinition_FacetTypes();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.FacetTypeImpl <em>Facet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.FacetTypeImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetType()
		 * @generated
		 */
		EClass FACET_TYPE = eINSTANCE.getFacetType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_TYPE__NAME = eINSTANCE.getFacetType_Name();

		/**
		 * The meta object literal for the '<em><b>Multi Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_TYPE__MULTI_VALUE = eINSTANCE.getFacetType_MultiValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_TYPE__DESCRIPTION = eINSTANCE.getFacetType_Description();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE__VALUES = eINSTANCE.getFacetType_Values();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE__CONTAINER = eINSTANCE.getFacetType_Container();

		/**
		 * The meta object literal for the '<em><b>Derivation Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE__DERIVATION_DATA = eINSTANCE.getFacetType_DerivationData();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.DateFacetImpl <em>Date Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.DateFacetImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getDateFacet()
		 * @generated
		 */
		EClass DATE_FACET = eINSTANCE.getDateFacet();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FACET__QUERY = eINSTANCE.getDateFacet_Query();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.ListFacetImpl <em>List Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.ListFacetImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getListFacet()
		 * @generated
		 */
		EClass LIST_FACET = eINSTANCE.getListFacet();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FACET__QUERY = eINSTANCE.getListFacet_Query();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.RangeFacetImpl <em>Range Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.RangeFacetImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getRangeFacet()
		 * @generated
		 */
		EClass RANGE_FACET = eINSTANCE.getRangeFacet();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_FACET__QUERY = eINSTANCE.getRangeFacet_Query();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.TreeFacetImpl <em>Tree Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.TreeFacetImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getTreeFacet()
		 * @generated
		 */
		EClass TREE_FACET = eINSTANCE.getTreeFacet();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_FACET__QUERY = eINSTANCE.getTreeFacet_Query();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.FacetImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__TYPE = eINSTANCE.getFacet_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__VALUES = eINSTANCE.getFacet_Values();

		/**
		 * The meta object literal for the '<em><b>Type ID</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__TYPE_ID = eINSTANCE.getFacet_TypeID();

		/**
		 * The meta object literal for the '<em><b>Value Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__VALUE_NAMES = eINSTANCE.getFacet_ValueNames();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.FacetValueImpl <em>Facet Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.FacetValueImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetValue()
		 * @generated
		 */
		EClass FACET_VALUE = eINSTANCE.getFacetValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_VALUE__NAME = eINSTANCE.getFacetValue_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_VALUE__DESCRIPTION = eINSTANCE.getFacetValue_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_VALUE__VALUE = eINSTANCE.getFacetValue_Value();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_VALUE__CHILDREN = eINSTANCE.getFacetValue_Children();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.FragmentDescriptionImpl <em>Fragment Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.FragmentDescriptionImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFragmentDescription()
		 * @generated
		 */
		EClass FRAGMENT_DESCRIPTION = eINSTANCE.getFragmentDescription();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_DESCRIPTION__FACETS = eINSTANCE.getFragmentDescription_Facets();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_DESCRIPTION__PROPERTIES = eINSTANCE.getFragmentDescription_Properties();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_DESCRIPTION__SUBJECT = eINSTANCE.getFragmentDescription_Subject();

		/**
		 * The meta object literal for the '<em><b>Derivation State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_DESCRIPTION__DERIVATION_STATE = eINSTANCE.getFragmentDescription_DerivationState();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.PropertyImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.FreeTextFacetImpl <em>Free Text Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.FreeTextFacetImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFreeTextFacet()
		 * @generated
		 */
		EClass FREE_TEXT_FACET = eINSTANCE.getFreeTextFacet();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_TEXT_FACET__QUERY = eINSTANCE.getFreeTextFacet_Query();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.FacetTypeDecoratorImpl <em>Facet Type Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.FacetTypeDecoratorImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetTypeDecorator()
		 * @generated
		 */
		EClass FACET_TYPE_DECORATOR = eINSTANCE.getFacetTypeDecorator();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE_DECORATOR__VALUES = eINSTANCE.getFacetTypeDecorator_Values();

		/**
		 * The meta object literal for the '<em><b>Decoratee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE_DECORATOR__DECORATEE = eINSTANCE.getFacetTypeDecorator_Decoratee();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE_DECORATOR__SELECTION = eINSTANCE.getFacetTypeDecorator_Selection();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.FacetValueDecoratorImpl <em>Facet Value Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.FacetValueDecoratorImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getFacetValueDecorator()
		 * @generated
		 */
		EClass FACET_VALUE_DECORATOR = eINSTANCE.getFacetValueDecorator();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_VALUE_DECORATOR__CHILDREN = eINSTANCE.getFacetValueDecorator_Children();

		/**
		 * The meta object literal for the '<em><b>Decoratee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_VALUE_DECORATOR__DECORATEE = eINSTANCE.getFacetValueDecorator_Decoratee();

		/**
		 * The meta object literal for the '<em><b>Value Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_VALUE_DECORATOR__VALUE_COUNT = eINSTANCE.getFacetValueDecorator_ValueCount();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.DerivationDataImpl <em>Derivation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.DerivationDataImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getDerivationData()
		 * @generated
		 */
		EClass DERIVATION_DATA = eINSTANCE.getDerivationData();

		/**
		 * The meta object literal for the '<em><b>Derivator ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION_DATA__DERIVATOR_ID = eINSTANCE.getDerivationData_DerivatorID();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION_DATA__RULE = eINSTANCE.getDerivationData_Rule();

		/**
		 * The meta object literal for the '<em><b>Derivation Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION_DATA__DERIVATION_DONE = eINSTANCE.getDerivationData_DerivationDone();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.DirectDerivationImpl <em>Direct Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.DirectDerivationImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getDirectDerivation()
		 * @generated
		 */
		EClass DIRECT_DERIVATION = eINSTANCE.getDirectDerivation();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.LangIndependentDerivationImpl <em>Lang Independent Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.LangIndependentDerivationImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getLangIndependentDerivation()
		 * @generated
		 */
		EClass LANG_INDEPENDENT_DERIVATION = eINSTANCE.getLangIndependentDerivation();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.impl.MappingDerivationImpl <em>Mapping Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.impl.MappingDerivationImpl
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getMappingDerivation()
		 * @generated
		 */
		EClass MAPPING_DERIVATION = eINSTANCE.getMappingDerivation();

		/**
		 * The meta object literal for the '<em><b>Facet Type ID</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_DERIVATION__FACET_TYPE_ID = eINSTANCE.getMappingDerivation_FacetTypeID();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.DerivationState <em>Derivation State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.DerivationState
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getDerivationState()
		 * @generated
		 */
		EEnum DERIVATION_STATE = eINSTANCE.getDerivationState();

		/**
		 * The meta object literal for the '{@link org.reuseware.coconut.description.GUIState <em>GUI State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.coconut.description.GUIState
		 * @see org.reuseware.coconut.description.impl.DescriptionPackageImpl#getGUIState()
		 * @generated
		 */
		EEnum GUI_STATE = eINSTANCE.getGUIState();

	}

} //DescriptionPackage
