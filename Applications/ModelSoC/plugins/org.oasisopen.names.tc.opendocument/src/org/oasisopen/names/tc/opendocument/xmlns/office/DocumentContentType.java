/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getFontFaceDecls <em>Font Face Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getAutomaticStyles <em>Automatic Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getBody <em>Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentContentType()
 * @model extendedMetaData="name='document-content_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentContentType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentContentType_Scripts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scripts' namespace='##targetNamespace'"
	 * @generated
	 */
	ScriptsType getScripts();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getScripts <em>Scripts</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentContentType_FontFaceDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='font-face-decls' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFaceDeclsType getFontFaceDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getFontFaceDecls <em>Font Face Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face Decls</em>' containment reference.
	 * @see #getFontFaceDecls()
	 * @generated
	 */
	void setFontFaceDecls(FontFaceDeclsType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentContentType_AutomaticStyles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='automatic-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	AutomaticStylesType getAutomaticStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getAutomaticStyles <em>Automatic Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Styles</em>' containment reference.
	 * @see #getAutomaticStyles()
	 * @generated
	 */
	void setAutomaticStyles(AutomaticStylesType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentContentType_Body()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	OfficeBodyContent getBody();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OfficeBodyContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getDocumentContentType_Version()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // DocumentContentType
