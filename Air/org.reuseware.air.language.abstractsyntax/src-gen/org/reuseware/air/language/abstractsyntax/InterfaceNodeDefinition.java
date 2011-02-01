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
 * A representation of the model object '<em><b>Interface Node Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getInterfaceNodeDefinition()
 * @model
 * @generated
 */
public interface InterfaceNodeDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference list.
	 * The list contents are of type {@link org.reuseware.air.language.abstractsyntax.Definition}.
	 * It is bidirectional and its opposite is '{@link org.reuseware.air.language.abstractsyntax.Definition#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference list.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getInterfaceNodeDefinition_Options()
	 * @see org.reuseware.air.language.abstractsyntax.Definition#getInterfaces
	 * @model opposite="interfaces" required="true"
	 * @generated
	 */
	EList<Definition> getOptions();

} // InterfaceNodeDefinition
