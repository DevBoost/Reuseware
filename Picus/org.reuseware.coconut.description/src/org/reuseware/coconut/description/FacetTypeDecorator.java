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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Type Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.FacetTypeDecorator#getValues <em>Values</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetTypeDecorator#getDecoratee <em>Decoratee</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetTypeDecorator#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetTypeDecorator()
 * @model
 * @generated
 */
public interface FacetTypeDecorator extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.FacetValueDecorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetTypeDecorator_Values()
	 * @model
	 * @generated
	 */
	EList<FacetValueDecorator> getValues();

	/**
	 * Returns the value of the '<em><b>Decoratee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoratee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoratee</em>' reference.
	 * @see #setDecoratee(FacetType)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetTypeDecorator_Decoratee()
	 * @model required="true"
	 * @generated
	 */
	FacetType getDecoratee();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetTypeDecorator#getDecoratee <em>Decoratee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoratee</em>' reference.
	 * @see #getDecoratee()
	 * @generated
	 */
	void setDecoratee(FacetType value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Facet)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetTypeDecorator_Selection()
	 * @model
	 * @generated
	 */
	Facet getSelection();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetTypeDecorator#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Facet value);

} // FacetTypeDecorator
