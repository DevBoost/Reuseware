/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Continuation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType#getSelectPage <em>Select Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType#getStringValue <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPageContinuationType()
 * @model extendedMetaData="name='page-continuation_._type' kind='mixed'"
 * @generated
 */
public interface PageContinuationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPageContinuationType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Select Page</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.SelectPageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Page</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SelectPageType
	 * @see #isSetSelectPage()
	 * @see #unsetSelectPage()
	 * @see #setSelectPage(SelectPageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPageContinuationType_SelectPage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='select-page' namespace='##targetNamespace'"
	 * @generated
	 */
	SelectPageType getSelectPage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType#getSelectPage <em>Select Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Page</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SelectPageType
	 * @see #isSetSelectPage()
	 * @see #unsetSelectPage()
	 * @see #getSelectPage()
	 * @generated
	 */
	void setSelectPage(SelectPageType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType#getSelectPage <em>Select Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectPage()
	 * @see #getSelectPage()
	 * @see #setSelectPage(SelectPageType)
	 * @generated
	 */
	void unsetSelectPage();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType#getSelectPage <em>Select Page</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Select Page</em>' attribute is set.
	 * @see #unsetSelectPage()
	 * @see #getSelectPage()
	 * @see #setSelectPage(SelectPageType)
	 * @generated
	 */
	boolean isSetSelectPage();

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPageContinuationType_StringValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='string-value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

} // PageContinuationType
