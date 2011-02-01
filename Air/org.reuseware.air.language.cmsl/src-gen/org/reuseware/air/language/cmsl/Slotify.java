/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slotify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.Slotify#getConstruct <em>Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getSlotify()
 * @model
 * @generated
 */
public interface Slotify extends ExtensionStatement {
	/**
   * Returns the value of the '<em><b>Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Construct</em>' containment reference.
   * @see #setConstruct(BaseReference)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getSlotify_Construct()
   * @model containment="true" required="true"
   * @generated
   */
	BaseReference getConstruct();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.Slotify#getConstruct <em>Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Construct</em>' containment reference.
   * @see #getConstruct()
   * @generated
   */
	void setConstruct(BaseReference value);

} // Slotify
