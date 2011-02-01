/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.DefinitionConstruct#getNewConstruct <em>New Construct</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.DefinitionConstruct#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionConstruct()
 * @model
 * @generated
 */
public interface DefinitionConstruct extends Definition {
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
   * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionConstruct_NewConstruct()
   * @model containment="true" required="true"
   * @generated
   */
	NonTerminal getNewConstruct();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.DefinitionConstruct#getNewConstruct <em>New Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Construct</em>' containment reference.
   * @see #getNewConstruct()
   * @generated
   */
	void setNewConstruct(NonTerminal value);

	/**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(DefinitionList)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionConstruct_Definition()
   * @model containment="true"
   * @generated
   */
	DefinitionList getDefinition();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.DefinitionConstruct#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
	void setDefinition(DefinitionList value);

} // DefinitionConstruct
