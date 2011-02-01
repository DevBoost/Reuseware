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
 * A representation of the model object '<em><b>Definition Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.DefinitionPart#getRolename <em>Rolename</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.DefinitionPart#getConstruct <em>Construct</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.DefinitionPart#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionPart()
 * @model
 * @generated
 */
public interface DefinitionPart extends EObject {
	/**
   * Returns the value of the '<em><b>Rolename</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolename</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Rolename</em>' containment reference.
   * @see #setRolename(Role)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionPart_Rolename()
   * @model containment="true" required="true"
   * @generated
   */
	Role getRolename();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.DefinitionPart#getRolename <em>Rolename</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolename</em>' containment reference.
   * @see #getRolename()
   * @generated
   */
	void setRolename(Role value);

	/**
   * Returns the value of the '<em><b>Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Construct</em>' containment reference.
   * @see #setConstruct(ConstructReference)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionPart_Construct()
   * @model containment="true" required="true"
   * @generated
   */
	ConstructReference getConstruct();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.DefinitionPart#getConstruct <em>Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Construct</em>' containment reference.
   * @see #getConstruct()
   * @generated
   */
	void setConstruct(ConstructReference value);

	/**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(UpperLevelReference)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getDefinitionPart_Annotation()
   * @model containment="true"
   * @generated
   */
	UpperLevelReference getAnnotation();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.DefinitionPart#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
	void setAnnotation(UpperLevelReference value);

} // DefinitionPart
