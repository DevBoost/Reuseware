/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.InternalReference#getType <em>Type</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.InternalReference#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getInternalReference()
 * @model
 * @generated
 */
public interface InternalReference extends NodeFeature {
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
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getInternalReference_Type()
	 * @model required="true"
	 * @generated
	 */
	Definition getType();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.InternalReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Definition value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(InternalReference)
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getInternalReference_Opposite()
	 * @model
	 * @generated
	 */
	InternalReference getOpposite();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.InternalReference#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(InternalReference value);

} // InternalReference
