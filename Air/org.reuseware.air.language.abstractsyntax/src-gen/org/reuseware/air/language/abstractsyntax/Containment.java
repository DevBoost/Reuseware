/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.Containment#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getContainment()
 * @model
 * @generated
 */
public interface Containment extends NodeFeature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Definition)
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getContainment_Type()
	 * @model required="true"
	 * @generated
	 */
	Definition getType();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.Containment#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Definition value);

} // Containment
