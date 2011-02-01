/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upper Level Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.UpperLevelReference#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getUpperLevelReference()
 * @model
 * @generated
 */
public interface UpperLevelReference extends ConstructReference {
	/**
   * Returns the value of the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' containment reference.
   * @see #setUpper(NonTerminal)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getUpperLevelReference_Upper()
   * @model containment="true" required="true"
   * @generated
   */
	NonTerminal getUpper();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.UpperLevelReference#getUpper <em>Upper</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' containment reference.
   * @see #getUpper()
   * @generated
   */
	void setUpper(NonTerminal value);

} // UpperLevelReference
