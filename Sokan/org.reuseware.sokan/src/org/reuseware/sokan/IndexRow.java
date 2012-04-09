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
 * <em><b>Index Row</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.IndexRow#getArtifactID <em>Artifact ID</em>}</li>
 *   <li>{@link org.reuseware.sokan.IndexRow#getPhyURI <em>Phy URI</em>}</li>
 *   <li>{@link org.reuseware.sokan.IndexRow#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link org.reuseware.sokan.IndexRow#isGenerated <em>Generated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.SokanPackage#getIndexRow()
 * @model
 * @generated
 */
public interface IndexRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact ID</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact ID</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Artifact ID</em>' reference.
	 * @see #setArtifactID(ID)
	 * @see org.reuseware.sokan.SokanPackage#getIndexRow_ArtifactID()
	 * @model required="true"
	 * @generated
	 */
	ID getArtifactID();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.IndexRow#getArtifactID <em>Artifact ID</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Artifact ID</em>' containment reference.
	 * @see #getArtifactID()
	 * @generated
	 */
	void setArtifactID(ID value);

	/**
	 * Returns the value of the '<em><b>Phy URI</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phy URI</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Phy URI</em>' attribute.
	 * @see #setPhyURI(String)
	 * @see org.reuseware.sokan.SokanPackage#getIndexRow_PhyURI()
	 * @model
	 * @generated
	 */
	String getPhyURI();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.IndexRow#getPhyURI
	 * <em>Phy URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Phy URI</em>' attribute.
	 * @see #getPhyURI()
	 * @generated
	 */
	void setPhyURI(String value);

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference.
	 * @see #setMetaData(IndexMetaData)
	 * @see org.reuseware.sokan.SokanPackage#getIndexRow_MetaData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IndexMetaData getMetaData();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.IndexRow#getMetaData <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' containment reference.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(IndexMetaData value);

	/**
	 * Returns the value of the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated</em>' attribute.
	 * @see #setGenerated(boolean)
	 * @see org.reuseware.sokan.SokanPackage#getIndexRow_Generated()
	 * @model
	 * @generated
	 */
	boolean isGenerated();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.IndexRow#isGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated</em>' attribute.
	 * @see #isGenerated()
	 * @generated
	 */
	void setGenerated(boolean value);

} // IndexRow
