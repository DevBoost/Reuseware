/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.GrammarExtension#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getGrammarExtension()
 * @model
 * @generated
 */
public interface GrammarExtension extends EObject {
	/**
   * Returns the value of the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' containment reference.
   * @see #setUnit(GrammarExtensionUnit)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getGrammarExtension_Unit()
   * @model containment="true" required="true"
   * @generated
   */
	GrammarExtensionUnit getUnit();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.GrammarExtension#getUnit <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' containment reference.
   * @see #getUnit()
   * @generated
   */
	void setUnit(GrammarExtensionUnit value);

} // GrammarExtension
