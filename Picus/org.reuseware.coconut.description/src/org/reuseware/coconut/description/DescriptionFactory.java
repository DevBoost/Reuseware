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
package org.reuseware.coconut.description;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.coconut.description.DescriptionPackage
 * @generated
 */
public interface DescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DescriptionFactory eINSTANCE = org.reuseware.coconut.description.impl.DescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Browser State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Browser State</em>'.
	 * @generated
	 */
	BrowserState createBrowserState();

	/**
	 * Returns a new object of class '<em>Facet Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet Definition</em>'.
	 * @generated
	 */
	FacetDefinition createFacetDefinition();

	/**
	 * Returns a new object of class '<em>Date Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Facet</em>'.
	 * @generated
	 */
	DateFacet createDateFacet();

	/**
	 * Returns a new object of class '<em>List Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Facet</em>'.
	 * @generated
	 */
	ListFacet createListFacet();

	/**
	 * Returns a new object of class '<em>Range Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Facet</em>'.
	 * @generated
	 */
	RangeFacet createRangeFacet();

	/**
	 * Returns a new object of class '<em>Tree Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Facet</em>'.
	 * @generated
	 */
	TreeFacet createTreeFacet();

	/**
	 * Returns a new object of class '<em>Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet</em>'.
	 * @generated
	 */
	Facet createFacet();

	/**
	 * Returns a new object of class '<em>Facet Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet Value</em>'.
	 * @generated
	 */
	FacetValue createFacetValue();

	/**
	 * Returns a new object of class '<em>Fragment Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment Description</em>'.
	 * @generated
	 */
	FragmentDescription createFragmentDescription();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Free Text Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Text Facet</em>'.
	 * @generated
	 */
	FreeTextFacet createFreeTextFacet();

	/**
	 * Returns a new object of class '<em>Facet Type Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet Type Decorator</em>'.
	 * @generated
	 */
	FacetTypeDecorator createFacetTypeDecorator();

	/**
	 * Returns a new object of class '<em>Facet Value Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet Value Decorator</em>'.
	 * @generated
	 */
	FacetValueDecorator createFacetValueDecorator();

	/**
	 * Returns a new object of class '<em>Direct Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Derivation</em>'.
	 * @generated
	 */
	DirectDerivation createDirectDerivation();

	/**
	 * Returns a new object of class '<em>Lang Independent Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Independent Derivation</em>'.
	 * @generated
	 */
	LangIndependentDerivation createLangIndependentDerivation();

	/**
	 * Returns a new object of class '<em>Mapping Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Derivation</em>'.
	 * @generated
	 */
	MappingDerivation createMappingDerivation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DescriptionPackage getDescriptionPackage();

} //DescriptionFactory
