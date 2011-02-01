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
 * A representation of the model object '<em><b>Page Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageSequenceType#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPageSequenceType()
 * @model extendedMetaData="name='page-sequence_._type' kind='elementOnly'"
 * @generated
 */
public interface PageSequenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPageSequenceType_Page()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PageType> getPage();

} // PageSequenceType
