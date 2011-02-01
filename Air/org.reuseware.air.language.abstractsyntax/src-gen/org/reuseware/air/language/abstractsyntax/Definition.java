/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.Definition#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.Definition#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getDefinition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Definition extends ASStatement {

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
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.Definition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition}.
	 * It is bidirectional and its opposite is '{@link org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getDefinition_Interfaces()
	 * @see org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition#getOptions
	 * @model opposite="options"
	 * @generated
	 */
	EList<InterfaceNodeDefinition> getInterfaces();
} // Definition
