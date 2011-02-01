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
 * A representation of the model object '<em><b>Dde Connection Decls Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType#getDdeConnectionDecl <em>Dde Connection Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDdeConnectionDeclsType()
 * @model extendedMetaData="name='dde-connection-decls_._type' kind='elementOnly'"
 * @generated
 */
public interface DdeConnectionDeclsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dde Connection Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Connection Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Connection Decl</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDdeConnectionDeclsType_DdeConnectionDecl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dde-connection-decl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DdeConnectionDeclType> getDdeConnectionDecl();

} // DdeConnectionDeclsType
