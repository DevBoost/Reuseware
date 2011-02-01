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
 * A representation of the model object '<em><b>User Field Decls Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType#getUserFieldDecl <em>User Field Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserFieldDeclsType()
 * @model extendedMetaData="name='user-field-decls_._type' kind='elementOnly'"
 * @generated
 */
public interface UserFieldDeclsType extends EObject {
	/**
	 * Returns the value of the '<em><b>User Field Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Field Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Field Decl</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserFieldDeclsType_UserFieldDecl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user-field-decl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UserFieldDeclType> getUserFieldDecl();

} // UserFieldDeclsType
