/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dde Links Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType#getDdeLink <em>Dde Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDdeLinksType()
 * @model extendedMetaData="name='dde-links_._type' kind='elementOnly'"
 * @generated
 */
public interface DdeLinksType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dde Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Link</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDdeLinksType_DdeLink()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dde-link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DdeLinkType> getDdeLink();

} // DdeLinksType
