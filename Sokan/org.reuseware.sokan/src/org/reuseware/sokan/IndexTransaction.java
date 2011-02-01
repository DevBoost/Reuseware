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
