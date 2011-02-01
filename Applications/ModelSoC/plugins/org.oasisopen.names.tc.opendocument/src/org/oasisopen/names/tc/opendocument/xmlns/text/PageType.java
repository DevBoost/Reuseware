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
 * A representation of the model object '<em><b>Page Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageType#getMasterPageName <em>Master Page Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPageType()
 * @model extendedMetaData="name='page_._type' kind='empty'"
 * @generated
 */
public interface PageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Master Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Page Name</em>' attribute.
	 * @see #setMasterPageName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPageType_MasterPageName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.MasterPageNameType" required="true"
	 *        extendedMetaData="kind='attribute' name='master-page-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterPageName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageType#getMasterPageName <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Page Name</em>' attribute.
	 * @see #getMasterPageName()
	 * @generated
	 */
	void setMasterPageName(String value);

} // PageType
