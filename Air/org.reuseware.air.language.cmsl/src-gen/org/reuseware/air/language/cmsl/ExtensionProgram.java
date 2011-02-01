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
 * A representation of the model object '<em><b>Extension Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.ExtensionProgram#getBase <em>Base</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.ExtensionProgram#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.ExtensionProgram#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionProgram()
 * @model
 * @generated
 */
public interface ExtensionProgram extends GrammarExtensionUnit {
	/**
   * Returns the value of the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' containment reference.
   * @see #setBase(BaseDeclaration)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionProgram_Base()
   * @model containment="true" required="true"
   * @generated
   */
	BaseDeclaration getBase();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.ExtensionProgram#getBase <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' containment reference.
   * @see #getBase()
   * @generated
   */
	void setBase(BaseDeclaration value);

	/**
   * Returns the value of the '<em><b>Extension</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Extension</em>' containment reference.
   * @see #setExtension(ExtensionDeclaration)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionProgram_Extension()
   * @model containment="true" required="true"
   * @generated
   */
	ExtensionDeclaration getExtension();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.ExtensionProgram#getExtension <em>Extension</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' containment reference.
   * @see #getExtension()
   * @generated
   */
	void setExtension(ExtensionDeclaration value);

	/**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.reuseware.air.language.cmsl.ExtensionStatement}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionProgram_Statements()
   * @model type="org.reuseware.air.language.cmsl.ExtensionStatement" containment="true"
   * @generated
   */
	EList getStatements();

} // ExtensionProgram
