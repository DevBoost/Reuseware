/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.DefinitionList#getRefs <em>Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionList()
 * @model
 * @generated
 */
public interface DefinitionList extends EObject {
	/**
   * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
   * The list contents are of type {@link org.reuseware.air.language.cmsl.DefinitionPart}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' containment reference list.
   * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionList_Refs()
   * @model type="org.reuseware.air.language.cmsl.DefinitionPart" containment="true" required="true"
   * @generated
   */
	EList getRefs();

} // DefinitionList
