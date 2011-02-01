/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.purl.dc.elements.dc;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.purl.dc.elements.dc.DocumentRoot#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
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
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_Creator()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link org.purl.dc.elements.dc.DocumentRoot#getCreator <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_Date()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link org.purl.dc.elements.dc.DocumentRoot#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_Description()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.purl.dc.elements.dc.DocumentRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_Language()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Language" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.purl.dc.elements.dc.DocumentRoot#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_Subject()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.purl.dc.elements.dc.DocumentRoot#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.purl.dc.elements.dc.DCPackage#getDocumentRoot_Title()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.purl.dc.elements.dc.DocumentRoot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // DocumentRoot
