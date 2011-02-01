/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Change Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormatChangeType#getChangeInfo <em>Change Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormatChangeType()
 * @model extendedMetaData="name='format-change_._type' kind='elementOnly'"
 * @generated
 */
public interface FormatChangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Change Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Info</em>' containment reference.
	 * @see #setChangeInfo(ChangeInfoType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormatChangeType_ChangeInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='change-info' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	ChangeInfoType getChangeInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormatChangeType#getChangeInfo <em>Change Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Info</em>' containment reference.
	 * @see #getChangeInfo()
	 * @generated
	 */
	void setChangeInfo(ChangeInfoType value);

} // FormatChangeType
