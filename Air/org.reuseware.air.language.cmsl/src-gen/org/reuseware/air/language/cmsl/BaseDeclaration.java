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
 * A representation of the model object '<em><b>Base Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.BaseDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.BaseDeclaration#getNsuri <em>Nsuri</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.BaseDeclaration#getSourceurl <em>Sourceurl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getBaseDeclaration()
 * @model
 * @generated
 */
public interface BaseDeclaration extends EObject {
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
   * @see org.reuseware.air.language.cmsl.CmslPackage#getBaseDeclaration_Name()
   * @model required="true"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.BaseDeclaration#getName <em>Name</em>}' attribute.
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
   * @see org.reuseware.air.language.cmsl.CmslPackage#getBaseDeclaration_Nsuri()
   * @model required="true"
   * @generated
   */
	String getNsuri();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.BaseDeclaration#getNsuri <em>Nsuri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nsuri</em>' attribute.
   * @see #getNsuri()
   * @generated
   */
	void setNsuri(String value);

	/**
   * Returns the value of the '<em><b>Sourceurl</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourceurl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sourceurl</em>' attribute.
   * @see #setSourceurl(String)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getBaseDeclaration_Sourceurl()
   * @model
   * @generated
   */
	String getSourceurl();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.BaseDeclaration#getSourceurl <em>Sourceurl</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sourceurl</em>' attribute.
   * @see #getSourceurl()
   * @generated
   */
	void setSourceurl(String value);

} // BaseDeclaration
