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
 * <em><b>Index Transaction</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.IndexTransaction#getRemArtifacts <em>Rem Artifacts</em>}</li>
 *   <li>{@link org.reuseware.sokan.IndexTransaction#getAddArtifacts <em>Add Artifacts</em>}</li>
 *   <li>{@link org.reuseware.sokan.IndexTransaction#getUpdateArtifacts <em>Update Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.SokanPackage#getIndexTransaction()
 * @model
 * @generated
 */
public interface IndexTransaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Rem Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.sokan.ID}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rem Artifacts</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Rem Artifacts</em>' reference list.
	 * @see org.reuseware.sokan.SokanPackage#getIndexTransaction_RemArtifacts()
	 * @model
	 * @generated
	 */
	EList<ID> getRemArtifacts();

	/**
	 * Returns the value of the '<em><b>Add Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.sokan.IndexRow}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Artifacts</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Add Artifacts</em>' reference list.
	 * @see org.reuseware.sokan.SokanPackage#getIndexTransaction_AddArtifacts()
	 * @model
	 * @generated
	 */
	EList<IndexRow> getAddArtifacts();

	/**
	 * Returns the value of the '<em><b>Update Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.sokan.IndexRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Artifacts</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Artifacts</em>' containment reference list.
	 * @see org.reuseware.sokan.SokanPackage#getIndexTransaction_UpdateArtifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexRow> getUpdateArtifacts();

} // IndexTransaction
