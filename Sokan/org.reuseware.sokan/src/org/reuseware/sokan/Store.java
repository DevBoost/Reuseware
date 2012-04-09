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
package org.reuseware.sokan;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Store</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.Store#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.reuseware.sokan.Store#getUriBuffer <em>Uri Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.SokanPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends EObject {
	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.sokan.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see org.reuseware.sokan.SokanPackage#getStore_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Uri Buffer</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Buffer</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Uri Buffer</em>' attribute.
	 * @see #setUriBuffer(String)
	 * @see org.reuseware.sokan.SokanPackage#getStore_UriBuffer()
	 * @model
	 * @generated
	 */
	String getUriBuffer();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.Store#getUriBuffer <em>Uri Buffer</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Uri Buffer</em>' attribute.
	 * @see #getUriBuffer()
	 * @generated
	 */
	void setUriBuffer(String value);

} // Store
