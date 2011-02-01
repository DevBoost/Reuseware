/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Level Style Bullet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getListLevelProperties <em>List Level Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getBulletChar <em>Bullet Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getBulletRelativeSize <em>Bullet Relative Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getLevel <em>Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getNumPrefix <em>Num Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getNumSuffix <em>Num Suffix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType()
 * @model extendedMetaData="name='list-level-style-bullet_._type' kind='elementOnly'"
 * @generated
 */
public interface ListLevelStyleBulletType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType_ListLevelProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='list-level-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleListLevelPropertiesContent getListLevelProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getListLevelProperties <em>List Level Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Level Properties</em>' containment reference.
	 * @see #getListLevelProperties()
	 * @generated
	 */
	void setListLevelProperties(StyleListLevelPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Properties</em>' containment reference.
	 * @see #setTextProperties(StyleTextPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType_TextProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getTextProperties <em>Text Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties</em>' containment reference.
	 * @see #getTextProperties()
	 * @generated
	 */
	void setTextProperties(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Bullet Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bullet Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bullet Char</em>' attribute.
	 * @see #setBulletChar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType_BulletChar()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Character" required="true"
	 *        extendedMetaData="kind='attribute' name='bullet-char' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBulletChar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getBulletChar <em>Bullet Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bullet Char</em>' attribute.
	 * @see #getBulletChar()
	 * @generated
	 */
	void setBulletChar(String value);

	/**
	 * Returns the value of the '<em><b>Bullet Relative Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bullet Relative Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bullet Relative Size</em>' attribute.
	 * @see #setBulletRelativeSize(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType_BulletRelativeSize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='bullet-relative-size' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBulletRelativeSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getBulletRelativeSize <em>Bullet Relative Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bullet Relative Size</em>' attribute.
	 * @see #getBulletRelativeSize()
	 * @generated
	 */
	void setBulletRelativeSize(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType_Level()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Num Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Prefix</em>' attribute.
	 * @see #setNumPrefix(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType_NumPrefix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='num-prefix' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getNumPrefix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getNumPrefix <em>Num Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Prefix</em>' attribute.
	 * @see #getNumPrefix()
	 * @generated
	 */
	void setNumPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Num Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Suffix</em>' attribute.
	 * @see #setNumSuffix(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType_NumSuffix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='num-suffix' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getNumSuffix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getNumSuffix <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Suffix</em>' attribute.
	 * @see #getNumSuffix()
	 * @generated
	 */
	void setNumSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleBulletType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType5"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // ListLevelStyleBulletType
