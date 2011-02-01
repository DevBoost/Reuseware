/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getText1 <em>Text1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationCountry <em>Transliteration Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationFormat <em>Transliteration Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationLanguage <em>Transliteration Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationStyle <em>Transliteration Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getVolatile <em>Volatile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType()
 * @model extendedMetaData="name='boolean-style_._type' kind='elementOnly'"
 * @generated
 */
public interface BooleanStyleType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_TextProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTextProperties <em>Text Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties</em>' containment reference.
	 * @see #getTextProperties()
	 * @generated
	 */
	void setTextProperties(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' containment reference.
	 * @see #setBoolean(BooleanType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Boolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanType getBoolean();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getBoolean <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' containment reference.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(BooleanType value);

	/**
	 * Returns the value of the '<em><b>Text1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text1</em>' attribute.
	 * @see #setText1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Text1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getText1 <em>Text1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text1</em>' attribute.
	 * @see #getText1()
	 * @generated
	 */
	void setText1(String value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	EList<MapType> getMap();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Country()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Language()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Transliteration Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration Country</em>' attribute.
	 * @see #setTransliterationCountry(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_TransliterationCountry()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='transliteration-country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransliterationCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationCountry <em>Transliteration Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration Country</em>' attribute.
	 * @see #getTransliterationCountry()
	 * @generated
	 */
	void setTransliterationCountry(String value);

	/**
	 * Returns the value of the '<em><b>Transliteration Format</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration Format</em>' attribute.
	 * @see #isSetTransliterationFormat()
	 * @see #unsetTransliterationFormat()
	 * @see #setTransliterationFormat(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_TransliterationFormat()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='transliteration-format' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransliterationFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationFormat <em>Transliteration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration Format</em>' attribute.
	 * @see #isSetTransliterationFormat()
	 * @see #unsetTransliterationFormat()
	 * @see #getTransliterationFormat()
	 * @generated
	 */
	void setTransliterationFormat(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationFormat <em>Transliteration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransliterationFormat()
	 * @see #getTransliterationFormat()
	 * @see #setTransliterationFormat(String)
	 * @generated
	 */
	void unsetTransliterationFormat();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationFormat <em>Transliteration Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transliteration Format</em>' attribute is set.
	 * @see #unsetTransliterationFormat()
	 * @see #getTransliterationFormat()
	 * @see #setTransliterationFormat(String)
	 * @generated
	 */
	boolean isSetTransliterationFormat();

	/**
	 * Returns the value of the '<em><b>Transliteration Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration Language</em>' attribute.
	 * @see #setTransliterationLanguage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_TransliterationLanguage()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='transliteration-language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransliterationLanguage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationLanguage <em>Transliteration Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration Language</em>' attribute.
	 * @see #getTransliterationLanguage()
	 * @generated
	 */
	void setTransliterationLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Transliteration Style</b></em>' attribute.
	 * The default value is <code>"short"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
	 * @see #isSetTransliterationStyle()
	 * @see #unsetTransliterationStyle()
	 * @see #setTransliterationStyle(TransliterationStyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_TransliterationStyle()
	 * @model default="short" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transliteration-style' namespace='##targetNamespace'"
	 * @generated
	 */
	TransliterationStyleType getTransliterationStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationStyle <em>Transliteration Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType
	 * @see #isSetTransliterationStyle()
	 * @see #unsetTransliterationStyle()
	 * @see #getTransliterationStyle()
	 * @generated
	 */
	void setTransliterationStyle(TransliterationStyleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationStyle <em>Transliteration Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransliterationStyle()
	 * @see #getTransliterationStyle()
	 * @see #setTransliterationStyle(TransliterationStyleType)
	 * @generated
	 */
	void unsetTransliterationStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getTransliterationStyle <em>Transliteration Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transliteration Style</em>' attribute is set.
	 * @see #unsetTransliterationStyle()
	 * @see #getTransliterationStyle()
	 * @see #setTransliterationStyle(TransliterationStyleType)
	 * @generated
	 */
	boolean isSetTransliterationStyle();

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getBooleanStyleType_Volatile()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='volatile' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVolatile();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #getVolatile()
	 * @generated
	 */
	void setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolatile()
	 * @see #getVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetVolatile();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType#getVolatile <em>Volatile</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volatile</em>' attribute is set.
	 * @see #unsetVolatile()
	 * @see #getVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetVolatile();

} // BooleanStyleType
