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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browser State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.BrowserState#getSelectedFacets <em>Selected Facets</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.BrowserState#getGuiState <em>Gui State</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.BrowserState#getFilteredContent <em>Filtered Content</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.BrowserState#getAdditionalFacets <em>Additional Facets</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.BrowserState#getPresentedFacets <em>Presented Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getBrowserState()
 * @model
 * @generated
 */
public interface BrowserState extends EObject {
	/**
	 * Returns the value of the '<em><b>Selected Facets</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.Facet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Facets</em>' reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getBrowserState_SelectedFacets()
	 * @model
	 * @generated
	 */
	EList<Facet> getSelectedFacets();

	/**
	 * Returns the value of the '<em><b>Gui State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.reuseware.coconut.description.GUIState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gui State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui State</em>' attribute.
	 * @see org.reuseware.coconut.description.GUIState
	 * @see #setGuiState(GUIState)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getBrowserState_GuiState()
	 * @model
	 * @generated
	 */
	GUIState getGuiState();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.BrowserState#getGuiState <em>Gui State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui State</em>' attribute.
	 * @see org.reuseware.coconut.description.GUIState
	 * @see #getGuiState()
	 * @generated
	 */
	void setGuiState(GUIState value);

	/**
	 * Returns the value of the '<em><b>Filtered Content</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.FragmentDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtered Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtered Content</em>' reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getBrowserState_FilteredContent()
	 * @model
	 * @generated
	 */
	EList<FragmentDescription> getFilteredContent();

	/**
	 * Returns the value of the '<em><b>Additional Facets</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.FacetTypeDecorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Facets</em>' reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getBrowserState_AdditionalFacets()
	 * @model
	 * @generated
	 */
	EList<FacetTypeDecorator> getAdditionalFacets();

	/**
	 * Returns the value of the '<em><b>Presented Facets</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.FacetTypeDecorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presented Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presented Facets</em>' reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getBrowserState_PresentedFacets()
	 * @model
	 * @generated
	 */
	EList<FacetTypeDecorator> getPresentedFacets();

} // BrowserState
