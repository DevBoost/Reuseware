/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Level Style Image Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleImageType#getListLevelProperties <em>List Level Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleImageType#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleImageType()
 * @model extendedMetaData="name='list-level-style-image_._type' kind='elementOnly'"
 * @generated
 */
public interface ListLevelStyleImageType extends TextListLevelStyleImageAttr {
	/**
	 * Returns the value of the '<em><b>List Level Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Level Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Level Properties</em>' containment reference.
	 * @see #setListLevelProperties(StyleListLevelPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleImageType_ListLevelProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='list-level-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleListLevelPropertiesContent getListLevelProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleImageType#getListLevelProperties <em>List Level Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Level Properties</em>' containment reference.
	 * @see #getListLevelProperties()
	 * @generated
	 */
	void setListLevelProperties(StyleListLevelPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleImageType_Level()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleImageType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

} // ListLevelStyleImageType
