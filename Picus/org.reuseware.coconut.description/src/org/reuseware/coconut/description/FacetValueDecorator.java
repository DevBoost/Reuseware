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
 * A representation of the model object '<em><b>Facet Value Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.FacetValueDecorator#getChildren <em>Children</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetValueDecorator#getDecoratee <em>Decoratee</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetValueDecorator#getValueCount <em>Value Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetValueDecorator()
 * @model
 * @generated
 */
public interface FacetValueDecorator extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.FacetValueDecorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetValueDecorator_Children()
	 * @model
	 * @generated
	 */
	EList<FacetValueDecorator> getChildren();

	/**
	 * Returns the value of the '<em><b>Decoratee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoratee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoratee</em>' reference.
	 * @see #setDecoratee(FacetValue)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetValueDecorator_Decoratee()
	 * @model required="true"
	 * @generated
	 */
	FacetValue getDecoratee();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetValueDecorator#getDecoratee <em>Decoratee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoratee</em>' reference.
	 * @see #getDecoratee()
	 * @generated
	 */
	void setDecoratee(FacetValue value);

	/**
	 * Returns the value of the '<em><b>Value Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Count</em>' attribute.
	 * @see #setValueCount(int)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetValueDecorator_ValueCount()
	 * @model
	 * @generated
	 */
	int getValueCount();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetValueDecorator#getValueCount <em>Value Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Count</em>' attribute.
	 * @see #getValueCount()
	 * @generated
	 */
	void setValueCount(int value);

} // FacetValueDecorator
