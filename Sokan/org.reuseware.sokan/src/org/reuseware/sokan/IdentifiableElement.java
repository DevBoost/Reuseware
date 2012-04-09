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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Identifiable Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.IdentifiableElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.SokanPackage#getIdentifiableElement()
 * @model abstract="true"
 * @generated
 */
public interface IdentifiableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(ID)
	 * @see org.reuseware.sokan.SokanPackage#getIdentifiableElement_Id()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ID getId();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.IdentifiableElement#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ID value);

} // IdentifiableElement
