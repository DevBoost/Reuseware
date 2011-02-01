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
 * A representation of the model object '<em><b>List Level Style Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getListLevelProperties <em>List Level Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getDisplayLevels <em>Display Levels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getLevel <em>Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumPrefix <em>Num Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumSuffix <em>Num Suffix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType()
 * @model extendedMetaData="name='list-level-style-number_._type' kind='elementOnly'"
 * @generated
 */
public interface ListLevelStyleNumberType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_ListLevelProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='list-level-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleListLevelPropertiesContent getListLevelProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getListLevelProperties <em>List Level Properties</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_TextProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getTextProperties <em>Text Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties</em>' containment reference.
	 * @see #getTextProperties()
	 * @generated
	 */
	void setTextProperties(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Display Levels</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Levels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Levels</em>' attribute.
	 * @see #isSetDisplayLevels()
	 * @see #unsetDisplayLevels()
	 * @see #setDisplayLevels(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_DisplayLevels()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='display-levels' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDisplayLevels();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getDisplayLevels <em>Display Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Levels</em>' attribute.
	 * @see #isSetDisplayLevels()
	 * @see #unsetDisplayLevels()
	 * @see #getDisplayLevels()
	 * @generated
	 */
	void setDisplayLevels(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getDisplayLevels <em>Display Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayLevels()
	 * @see #getDisplayLevels()
	 * @see #setDisplayLevels(BigInteger)
	 * @generated
	 */
	void unsetDisplayLevels();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getDisplayLevels <em>Display Levels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Levels</em>' attribute is set.
	 * @see #unsetDisplayLevels()
	 * @see #getDisplayLevels()
	 * @see #setDisplayLevels(BigInteger)
	 * @generated
	 */
	boolean isSetDisplayLevels();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_Level()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Num Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Format</em>' attribute.
	 * @see #setNumFormat(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_NumFormat()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatType"
	 *        extendedMetaData="kind='attribute' name='num-format' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	Object getNumFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumFormat <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Format</em>' attribute.
	 * @see #getNumFormat()
	 * @generated
	 */
	void setNumFormat(Object value);

	/**
	 * Returns the value of the '<em><b>Num Letter Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Letter Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Letter Sync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumLetterSync()
	 * @see #unsetNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_NumLetterSync()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='num-letter-sync' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumLetterSync();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Letter Sync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumLetterSync()
	 * @see #unsetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @generated
	 */
	void setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetNumLetterSync();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumLetterSync <em>Num Letter Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Letter Sync</em>' attribute is set.
	 * @see #unsetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetNumLetterSync();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_NumPrefix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='num-prefix' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getNumPrefix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumPrefix <em>Num Prefix</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_NumSuffix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='num-suffix' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getNumSuffix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getNumSuffix <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Suffix</em>' attribute.
	 * @see #getNumSuffix()
	 * @generated
	 */
	void setNumSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Start Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Value</em>' attribute.
	 * @see #isSetStartValue()
	 * @see #unsetStartValue()
	 * @see #setStartValue(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_StartValue()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='start-value' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' attribute.
	 * @see #isSetStartValue()
	 * @see #unsetStartValue()
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartValue()
	 * @see #getStartValue()
	 * @see #setStartValue(BigInteger)
	 * @generated
	 */
	void unsetStartValue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getStartValue <em>Start Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Value</em>' attribute is set.
	 * @see #unsetStartValue()
	 * @see #getStartValue()
	 * @see #setStartValue(BigInteger)
	 * @generated
	 */
	boolean isSetStartValue();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListLevelStyleNumberType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType6"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // ListLevelStyleNumberType
