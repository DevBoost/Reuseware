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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.reuseware.coconut.description.DescriptionPackage
 * @generated
 */
public class DescriptionSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DescriptionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionSwitch() {
		if (modelPackage == null) {
			modelPackage = DescriptionPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DescriptionPackage.BROWSER_STATE: {
				BrowserState browserState = (BrowserState)theEObject;
				T result = caseBrowserState(browserState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.FACET_DEFINITION: {
				FacetDefinition facetDefinition = (FacetDefinition)theEObject;
				T result = caseFacetDefinition(facetDefinition);
				if (result == null) result = casePackageableElement(facetDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.FACET_TYPE: {
				FacetType facetType = (FacetType)theEObject;
				T result = caseFacetType(facetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.DATE_FACET: {
				DateFacet dateFacet = (DateFacet)theEObject;
				T result = caseDateFacet(dateFacet);
				if (result == null) result = caseFacetType(dateFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.LIST_FACET: {
				ListFacet listFacet = (ListFacet)theEObject;
				T result = caseListFacet(listFacet);
				if (result == null) result = caseFacetType(listFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.RANGE_FACET: {
				RangeFacet rangeFacet = (RangeFacet)theEObject;
				T result = caseRangeFacet(rangeFacet);
				if (result == null) result = caseFacetType(rangeFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.TREE_FACET: {
				TreeFacet treeFacet = (TreeFacet)theEObject;
				T result = caseTreeFacet(treeFacet);
				if (result == null) result = caseFacetType(treeFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.FACET: {
				Facet facet = (Facet)theEObject;
				T result = caseFacet(facet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.FACET_VALUE: {
				FacetValue facetValue = (FacetValue)theEObject;
				T result = caseFacetValue(facetValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.FRAGMENT_DESCRIPTION: {
				FragmentDescription fragmentDescription = (FragmentDescription)theEObject;
				T result = caseFragmentDescription(fragmentDescription);
				if (result == null) result = casePackageableElement(fragmentDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.FREE_TEXT_FACET: {
				FreeTextFacet freeTextFacet = (FreeTextFacet)theEObject;
				T result = caseFreeTextFacet(freeTextFacet);
				if (result == null) result = caseFacetType(freeTextFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.FACET_TYPE_DECORATOR: {
				FacetTypeDecorator facetTypeDecorator = (FacetTypeDecorator)theEObject;
				T result = caseFacetTypeDecorator(facetTypeDecorator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.FACET_VALUE_DECORATOR: {
				FacetValueDecorator facetValueDecorator = (FacetValueDecorator)theEObject;
				T result = caseFacetValueDecorator(facetValueDecorator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.DERIVATION_DATA: {
				DerivationData derivationData = (DerivationData)theEObject;
				T result = caseDerivationData(derivationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.DIRECT_DERIVATION: {
				DirectDerivation directDerivation = (DirectDerivation)theEObject;
				T result = caseDirectDerivation(directDerivation);
				if (result == null) result = caseDerivationData(directDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.LANG_INDEPENDENT_DERIVATION: {
				LangIndependentDerivation langIndependentDerivation = (LangIndependentDerivation)theEObject;
				T result = caseLangIndependentDerivation(langIndependentDerivation);
				if (result == null) result = caseDerivationData(langIndependentDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DescriptionPackage.MAPPING_DERIVATION: {
				MappingDerivation mappingDerivation = (MappingDerivation)theEObject;
				T result = caseMappingDerivation(mappingDerivation);
				if (result == null) result = caseDerivationData(mappingDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browser State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browser State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowserState(BrowserState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetDefinition(FacetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetType(FacetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateFacet(DateFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListFacet(ListFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeFacet(RangeFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeFacet(TreeFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacet(Facet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetValue(FacetValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentDescription(FragmentDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Text Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Text Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeTextFacet(FreeTextFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Type Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Type Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetTypeDecorator(FacetTypeDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Value Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Value Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetValueDecorator(FacetValueDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationData(DerivationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectDerivation(DirectDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Independent Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Independent Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangIndependentDerivation(LangIndependentDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingDerivation(MappingDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DescriptionSwitch
