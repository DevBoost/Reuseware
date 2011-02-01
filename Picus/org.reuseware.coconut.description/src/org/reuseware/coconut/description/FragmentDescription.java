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

import org.eclipse.emf.common.util.EList;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.repository.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.FragmentDescription#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FragmentDescription#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FragmentDescription#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FragmentDescription#getDerivationState <em>Derivation State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getFragmentDescription()
 * @model
 * @generated
 */
public interface FragmentDescription extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Facets</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.Facet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facets</em>' containment reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFragmentDescription_Facets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Facet> getFacets();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFragmentDescription_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Fragment)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFragmentDescription_Subject()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Fragment getSubject();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FragmentDescription#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Fragment value);

	/**
	 * Returns the value of the '<em><b>Derivation State</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.reuseware.coconut.description.DerivationState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation State</em>' attribute.
	 * @see org.reuseware.coconut.description.DerivationState
	 * @see #setDerivationState(DerivationState)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFragmentDescription_DerivationState()
	 * @model default=""
	 * @generated
	 */
	DerivationState getDerivationState();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FragmentDescription#getDerivationState <em>Derivation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation State</em>' attribute.
	 * @see org.reuseware.coconut.description.DerivationState
	 * @see #getDerivationState()
	 * @generated
	 */
	void setDerivationState(DerivationState value);

} // FragmentDescription
