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
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.Facet#getType <em>Type</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.Facet#getValues <em>Values</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.Facet#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.Facet#getValueNames <em>Value Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getFacet()
 * @model
 * @generated
 */
public interface Facet extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(FacetType)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacet_Type()
	 * @model required="true" transient="true"
	 * @generated
	 */
	FacetType getType();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.Facet#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(FacetType value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.FacetValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacet_Values()
	 * @model required="true" transient="true"
	 * @generated
	 */
	EList<FacetValue> getValues();

	/**
	 * Returns the value of the '<em><b>Type ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type ID</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type ID</em>' attribute list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacet_TypeID()
	 * @model
	 * @generated
	 */
	EList<String> getTypeID();

	/**
	 * Returns the value of the '<em><b>Value Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Names</em>' attribute list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacet_ValueNames()
	 * @model default=""
	 * @generated
	 */
	EList<String> getValueNames();

} // Facet
