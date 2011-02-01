/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.DefinitionChoice#getNewConstruct <em>New Construct</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.DefinitionChoice#getChoice <em>Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionChoice()
 * @model
 * @generated
 */
public interface DefinitionChoice extends Definition {
	/**
   * Returns the value of the '<em><b>New Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Construct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>New Construct</em>' containment reference.
   * @see #setNewConstruct(NonTerminal)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionChoice_NewConstruct()
   * @model containment="true" required="true"
   * @generated
   */
	NonTerminal getNewConstruct();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.DefinitionChoice#getNewConstruct <em>New Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Construct</em>' containment reference.
   * @see #getNewConstruct()
   * @generated
   */
	void setNewConstruct(NonTerminal value);

	/**
   * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
   * The list contents are of type {@link org.reuseware.air.language.cmsl.NonTerminal}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Choice</em>' containment reference list.
   * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionChoice_Choice()
   * @model type="org.reuseware.air.language.cmsl.NonTerminal" containment="true"
   * @generated
   */
	EList getChoice();

} // DefinitionChoice
