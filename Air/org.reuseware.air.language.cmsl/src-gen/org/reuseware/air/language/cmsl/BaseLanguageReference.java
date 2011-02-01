/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Language Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.BaseLanguageReference#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.BaseLanguageReference#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getBaseLanguageReference()
 * @model
 * @generated
 */
public interface BaseLanguageReference extends BaseReference {
	/**
   * Returns the value of the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' attribute.
   * @see #setLanguage(String)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getBaseLanguageReference_Language()
   * @model required="true"
   * @generated
   */
	String getLanguage();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.BaseLanguageReference#getLanguage <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' attribute.
   * @see #getLanguage()
   * @generated
   */
	void setLanguage(String value);

	/**
   * Returns the value of the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' containment reference.
   * @see #setBase(NonTerminal)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getBaseLanguageReference_Base()
   * @model containment="true" required="true"
   * @generated
   */
	NonTerminal getBase();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.BaseLanguageReference#getBase <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' containment reference.
   * @see #getBase()
   * @generated
   */
	void setBase(NonTerminal value);

} // BaseLanguageReference
