/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Node Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition#getMembers <em>Members</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition#getESuperClass <em>ESuper Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getConcreteNodeDefinition()
 * @model
 * @generated
 */
public interface ConcreteNodeDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.air.language.abstractsyntax.NodeFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getConcreteNodeDefinition_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeFeature> getMembers();

	/**
	 * Returns the value of the '<em><b>ESuper Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Class</em>' reference.
	 * @see #setESuperClass(EClass)
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getConcreteNodeDefinition_ESuperClass()
	 * @model
	 * @generated
	 */
	EClass getESuperClass();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition#getESuperClass <em>ESuper Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESuper Class</em>' reference.
	 * @see #getESuperClass()
	 * @generated
	 */
	void setESuperClass(EClass value);

} // ConcreteNodeDefinition
