/**
 * Copyright (c) 2006-2011
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
 */
package org.reuseware.sokan.ui.model.sokanui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.Root#getVisibleTypes <em>Visible Types</em>}</li>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.Root#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.ui.model.sokanui.SokanuiPackage#getRoot()
 * @model abstract="true"
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Visible Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Types</em>' reference list.
	 * @see org.reuseware.sokan.ui.model.sokanui.SokanuiPackage#getRoot_VisibleTypes()
	 * @model transient="true"
	 * @generated
	 */
	EList<EClass> getVisibleTypes();

	/**
	 * Returns the value of the '<em><b>Resource Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Set</em>' attribute.
	 * @see #setResourceSet(ResourceSet)
	 * @see org.reuseware.sokan.ui.model.sokanui.SokanuiPackage#getRoot_ResourceSet()
	 * @model dataType="org.reuseware.sokan.ui.model.sokanui.ResourceSet" transient="true"
	 * @generated
	 */
	ResourceSet getResourceSet();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.ui.model.sokanui.Root#getResourceSet <em>Resource Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set</em>' attribute.
	 * @see #getResourceSet()
	 * @generated
	 */
	void setResourceSet(ResourceSet value);

} // Root
