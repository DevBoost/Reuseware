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
 * A representation of the model object '<em><b>Root Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.RootFolder#getFolders <em>Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.ui.model.sokanui.SokanuiPackage#getRootFolder()
 * @model
 * @generated
 */
public interface RootFolder extends Root {
	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.sokan.ui.model.sokanui.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see org.reuseware.sokan.ui.model.sokanui.SokanuiPackage#getRootFolder_Folders()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Folder> getFolders();

} // RootFolder
