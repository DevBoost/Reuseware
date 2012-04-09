/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.meta;

import java.math.BigInteger;

import javax.xml.datatype.Duration;
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
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getAutoReload <em>Auto Reload</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getDateString <em>Date String</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getDocumentStatistic <em>Document Statistic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getHyperlinkBehaviour <em>Hyperlink Behaviour</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getUserDefined <em>User Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_Mixed()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Auto Reload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Reload</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Reload</em>' containment reference.
	 * @see #setAutoReload(AutoReloadType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_AutoReload()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='auto-reload' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	AutoReloadType getAutoReload();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getAutoReload <em>Auto Reload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Reload</em>' containment reference.
	 * @see #getAutoReload()
	 * @generated
	 */
	void setAutoReload(AutoReloadType value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_CreationDate()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creation-date' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date String</em>' attribute.
	 * @see #setDateString(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_DateString()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-string' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDateString();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getDateString <em>Date String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date String</em>' attribute.
	 * @see #getDateString()
	 * @generated
	 */
	void setDateString(String value);

	/**
	 * Returns the value of the '<em><b>Document Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Statistic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Statistic</em>' containment reference.
	 * @see #setDocumentStatistic(DocumentStatisticType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_DocumentStatistic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='document-statistic' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	DocumentStatisticType getDocumentStatistic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getDocumentStatistic <em>Document Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Statistic</em>' containment reference.
	 * @see #getDocumentStatistic()
	 * @generated
	 */
	void setDocumentStatistic(DocumentStatisticType value);

	/**
	 * Returns the value of the '<em><b>Editing Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Cycles</em>' attribute.
	 * @see #setEditingCycles(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_EditingCycles()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editing-cycles' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	BigInteger getEditingCycles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getEditingCycles <em>Editing Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Cycles</em>' attribute.
	 * @see #getEditingCycles()
	 * @generated
	 */
	void setEditingCycles(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Editing Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Duration</em>' attribute.
	 * @see #setEditingDuration(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_EditingDuration()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editing-duration' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	Duration getEditingDuration();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getEditingDuration <em>Editing Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Duration</em>' attribute.
	 * @see #getEditingDuration()
	 * @generated
	 */
	void setEditingDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' attribute.
	 * @see #setGenerator(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_Generator()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generator' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getGenerator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getGenerator <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' attribute.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyperlink Behaviour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperlink Behaviour</em>' containment reference.
	 * @see #setHyperlinkBehaviour(HyperlinkBehaviourType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_HyperlinkBehaviour()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hyperlink-behaviour' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	HyperlinkBehaviourType getHyperlinkBehaviour();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getHyperlinkBehaviour <em>Hyperlink Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink Behaviour</em>' containment reference.
	 * @see #getHyperlinkBehaviour()
	 * @generated
	 */
	void setHyperlinkBehaviour(HyperlinkBehaviourType value);

	/**
	 * Returns the value of the '<em><b>Initial Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Creator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Creator</em>' attribute.
	 * @see #setInitialCreator(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_InitialCreator()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='initial-creator' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getInitialCreator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getInitialCreator <em>Initial Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Creator</em>' attribute.
	 * @see #getInitialCreator()
	 * @generated
	 */
	void setInitialCreator(String value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_Keyword()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Print Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Date</em>' attribute.
	 * @see #setPrintDate(XMLGregorianCalendar)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_PrintDate()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='print-date' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	XMLGregorianCalendar getPrintDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getPrintDate <em>Print Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Date</em>' attribute.
	 * @see #getPrintDate()
	 * @generated
	 */
	void setPrintDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Printed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printed By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printed By</em>' attribute.
	 * @see #setPrintedBy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_PrintedBy()
	 * @model unique="false" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='printed-by' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	String getPrintedBy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getPrintedBy <em>Printed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printed By</em>' attribute.
	 * @see #getPrintedBy()
	 * @generated
	 */
	void setPrintedBy(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(TemplateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_Template()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	TemplateType getTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateType value);

	/**
	 * Returns the value of the '<em><b>User Defined</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined</em>' containment reference.
	 * @see #setUserDefined(UserDefinedType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentRoot_UserDefined()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-defined' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data'"
	 * @generated
	 */
	UserDefinedType getUserDefined();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getUserDefined <em>User Defined</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined</em>' containment reference.
	 * @see #getUserDefined()
	 * @generated
	 */
	void setUserDefined(UserDefinedType value);

} // DocumentRoot
