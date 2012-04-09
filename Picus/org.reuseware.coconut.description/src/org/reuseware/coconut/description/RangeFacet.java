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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.RangeFacet#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getRangeFacet()
 * @model
 * @generated
 */
public interface RangeFacet extends FacetType {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * The default value is <code>"if self.facets->exists(f | f.type = filterFacet.type) then self.facets->any(f | f.type = filterFacet.type).values->exists(v | filterFacet.values->exists(fv | v = fv)) else false endif"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getRangeFacet_Query()
	 * @model default="if self.facets->exists(f | f.type = filterFacet.type) then self.facets->any(f | f.type = filterFacet.type).values->exists(v | filterFacet.values->exists(fv | v = fv)) else false endif"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.RangeFacet#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

} // RangeFacet
