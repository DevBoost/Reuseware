/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NodeFeature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDataType)
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	EDataType getType();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDataType value);

} // Attribute
