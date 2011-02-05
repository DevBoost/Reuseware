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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.RootPackage#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.ui.model.sokanui.SokanuiPackage#getRootPackage()
 * @model
 * @generated
 */
public interface RootPackage extends Root {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.sokan.ui.model.sokanui.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.reuseware.sokan.ui.model.sokanui.SokanuiPackage#getRootPackage_Packages()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<org.reuseware.sokan.ui.model.sokanui.Package> getPackages();

} // RootPackage
