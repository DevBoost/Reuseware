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
 * <em><b>Artifact</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.Artifact#getModel <em>Model</em>}</li>
 *   <li>{@link org.reuseware.sokan.Artifact#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link org.reuseware.sokan.Artifact#getIndexRepresentation <em>Index Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.SokanPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference list. The list
	 * contents are of type {@link org.eclipse.emf.ecore.EObject}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model</em>' reference list.
	 * @see org.reuseware.sokan.SokanPackage#getArtifact_Model()
	 * @model
	 * @generated
	 */
	EList<EObject> getModel();

	/**
	 * Returns the value of the '<em><b>Meta Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Information</em>' reference.
	 * @see #setMetaInformation(EObject)
	 * @see org.reuseware.sokan.SokanPackage#getArtifact_MetaInformation()
	 * @model
	 * @generated
	 */
	EObject getMetaInformation();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.Artifact#getMetaInformation <em>Meta Information</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Meta Information</em>' reference.
	 * @see #getMetaInformation()
	 * @generated
	 */
	void setMetaInformation(EObject value);

	/**
	 * Returns the value of the '<em><b>Index Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Representation</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Representation</em>' containment reference.
	 * @see #setIndexRepresentation(IndexRow)
	 * @see org.reuseware.sokan.SokanPackage#getArtifact_IndexRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IndexRow getIndexRepresentation();

	/**
	 * Sets the value of the '
	 * {@link org.reuseware.sokan.Artifact#getIndexRepresentation
	 * <em>Index Representation</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Index Representation</em>'
	 *            containment reference.
	 * @see #getIndexRepresentation()
	 * @generated
	 */
	void setIndexRepresentation(IndexRow value);

} // Artifact
