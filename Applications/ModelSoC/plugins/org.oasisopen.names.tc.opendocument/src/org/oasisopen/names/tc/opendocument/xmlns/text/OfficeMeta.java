/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Office Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMeta#getMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeMeta()
 * @model extendedMetaData="name='office-meta' kind='elementOnly'"
 * @generated
 */
public interface OfficeMeta extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference.
	 * @see #setMeta(OfficeMetaContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeMeta_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	OfficeMetaContent getMeta();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMeta#getMeta <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' containment reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(OfficeMetaContent value);

} // OfficeMeta
