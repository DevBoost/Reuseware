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
 * A representation of the model object '<em><b>Extension Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getNsuri <em>Nsuri</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getNsprefix <em>Nsprefix</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getTargeturl <em>Targeturl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionDeclaration()
 * @model
 * @generated
 */
public interface ExtensionDeclaration extends EObject {
	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionDeclaration_Name()
   * @model required="true"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Nsuri</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nsuri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Nsuri</em>' attribute.
   * @see #setNsuri(String)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionDeclaration_Nsuri()
   * @model
   * @generated
   */
	String getNsuri();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getNsuri <em>Nsuri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nsuri</em>' attribute.
   * @see #getNsuri()
   * @generated
   */
	void setNsuri(String value);

	/**
   * Returns the value of the '<em><b>Nsprefix</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nsprefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Nsprefix</em>' attribute.
   * @see #setNsprefix(String)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionDeclaration_Nsprefix()
   * @model
   * @generated
   */
	String getNsprefix();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getNsprefix <em>Nsprefix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nsprefix</em>' attribute.
   * @see #getNsprefix()
   * @generated
   */
	void setNsprefix(String value);

	/**
   * Returns the value of the '<em><b>Targeturl</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeturl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Targeturl</em>' attribute.
   * @see #setTargeturl(String)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getExtensionDeclaration_Targeturl()
   * @model
   * @generated
   */
	String getTargeturl();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getTargeturl <em>Targeturl</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Targeturl</em>' attribute.
   * @see #getTargeturl()
   * @generated
   */
	void setTargeturl(String value);

} // ExtensionDeclaration
