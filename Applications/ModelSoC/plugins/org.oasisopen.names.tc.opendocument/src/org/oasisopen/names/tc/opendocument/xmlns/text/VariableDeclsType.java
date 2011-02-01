/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decls Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclsType#getVariableDecl <em>Variable Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getVariableDeclsType()
 * @model extendedMetaData="name='variable-decls_._type' kind='elementOnly'"
 * @generated
 */
public interface VariableDeclsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Decl</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getVariableDeclsType_VariableDecl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable-decl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VariableDeclType> getVariableDecl();

} // VariableDeclsType
