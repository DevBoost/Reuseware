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
 * A representation of the model object '<em><b>Sequence Decls Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType#getSequenceDecl <em>Sequence Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSequenceDeclsType()
 * @model extendedMetaData="name='sequence-decls_._type' kind='elementOnly'"
 * @generated
 */
public interface SequenceDeclsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Decl</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSequenceDeclsType_SequenceDecl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence-decl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceDeclType> getSequenceDecl();

} // SequenceDeclsType
