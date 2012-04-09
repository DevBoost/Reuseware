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
import org.reuseware.coconut.repository.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.FacetDefinition#getFacetTypes <em>Facet Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetDefinition()
 * @model
 * @generated
 */
public interface FacetDefinition extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Facet Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.FacetType}.
	 * It is bidirectional and its opposite is '{@link org.reuseware.coconut.description.FacetType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Types</em>' containment reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetDefinition_FacetTypes()
	 * @see org.reuseware.coconut.description.FacetType#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<FacetType> getFacetTypes();

} // FacetDefinition
