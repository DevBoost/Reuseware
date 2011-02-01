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
 * A representation of the model object '<em><b>Change Marks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType#getChangeId <em>Change Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getChangeMarksType()
 * @model extendedMetaData="name='change-marks_._type' kind='empty'"
 * @generated
 */
public interface ChangeMarksType extends EObject {
	/**
	 * Returns the value of the '<em><b>Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Id</em>' attribute.
	 * @see #setChangeId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getChangeMarksType_ChangeId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='change-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChangeId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType#getChangeId <em>Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Id</em>' attribute.
	 * @see #getChangeId()
	 * @generated
	 */
	void setChangeId(String value);

} // ChangeMarksType
