/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMeta;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getFontFaceDecls <em>Font Face Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getAutomaticStyles <em>Automatic Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getMasterStyles <em>Master Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getBody <em>Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getMimetype <em>Mimetype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType()
 * @model extendedMetaData="name='document_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentType extends OfficeMeta {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(SettingsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_Settings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='settings' namespace='##targetNamespace'"
	 * @generated
	 */
	SettingsType getSettings();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(SettingsType value);

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference.
	 * @see #setScripts(ScriptsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_Scripts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scripts' namespace='##targetNamespace'"
	 * @generated
	 */
	ScriptsType getScripts();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getScripts <em>Scripts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scripts</em>' containment reference.
	 * @see #getScripts()
	 * @generated
	 */
	void setScripts(ScriptsType value);

	/**
	 * Returns the value of the '<em><b>Font Face Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face Decls</em>' containment reference.
	 * @see #setFontFaceDecls(FontFaceDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_FontFaceDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='font-face-decls' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFaceDeclsType getFontFaceDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getFontFaceDecls <em>Font Face Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face Decls</em>' containment reference.
	 * @see #getFontFaceDecls()
	 * @generated
	 */
	void setFontFaceDecls(FontFaceDeclsType value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference.
	 * @see #setStyles(StylesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_Styles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='styles' namespace='##targetNamespace'"
	 * @generated
	 */
	StylesType getStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getStyles <em>Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styles</em>' containment reference.
	 * @see #getStyles()
	 * @generated
	 */
	void setStyles(StylesType value);

	/**
	 * Returns the value of the '<em><b>Automatic Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Styles</em>' containment reference.
	 * @see #setAutomaticStyles(AutomaticStylesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_AutomaticStyles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='automatic-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	AutomaticStylesType getAutomaticStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getAutomaticStyles <em>Automatic Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Styles</em>' containment reference.
	 * @see #getAutomaticStyles()
	 * @generated
	 */
	void setAutomaticStyles(AutomaticStylesType value);

	/**
	 * Returns the value of the '<em><b>Master Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Styles</em>' containment reference.
	 * @see #setMasterStyles(MasterStylesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_MasterStyles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='master-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterStylesType getMasterStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getMasterStyles <em>Master Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Styles</em>' containment reference.
	 * @see #getMasterStyles()
	 * @generated
	 */
	void setMasterStyles(MasterStylesType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OfficeBodyContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_Body()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	OfficeBodyContent getBody();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OfficeBodyContent value);

	/**
	 * Returns the value of the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mimetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mimetype</em>' attribute.
	 * @see #setMimetype(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_Mimetype()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='mimetype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMimetype();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getMimetype <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimetype</em>' attribute.
	 * @see #getMimetype()
	 * @generated
	 */
	void setMimetype(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentType_Version()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // DocumentType
