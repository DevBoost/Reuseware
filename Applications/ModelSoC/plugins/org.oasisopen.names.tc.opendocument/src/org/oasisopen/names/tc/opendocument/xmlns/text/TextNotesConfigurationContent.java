/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notes Configuration Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNoteContinuationNoticeForward <em>Note Continuation Notice Forward</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNoteContinuationNoticeBackward <em>Note Continuation Notice Backward</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getCitationBodyStyleName <em>Citation Body Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getCitationStyleName <em>Citation Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getDefaultStyleName <em>Default Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getFootnotesPosition <em>Footnotes Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNoteClass <em>Note Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumPrefix <em>Num Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumSuffix <em>Num Suffix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getStartNumberingAt <em>Start Numbering At</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getStartValue <em>Start Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent()
 * @model extendedMetaData="name='text-notes-configuration-content' kind='elementOnly'"
 * @generated
 */
public interface TextNotesConfigurationContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Note Continuation Notice Forward</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Continuation Notice Forward</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Continuation Notice Forward</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_NoteContinuationNoticeForward()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note-continuation-notice-forward' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getNoteContinuationNoticeForward();

	/**
	 * Returns the value of the '<em><b>Note Continuation Notice Backward</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Continuation Notice Backward</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Continuation Notice Backward</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_NoteContinuationNoticeBackward()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note-continuation-notice-backward' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getNoteContinuationNoticeBackward();

	/**
	 * Returns the value of the '<em><b>Citation Body Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Citation Body Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation Body Style Name</em>' attribute.
	 * @see #setCitationBodyStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_CitationBodyStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CitationBodyStyleNameType"
	 *        extendedMetaData="kind='attribute' name='citation-body-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCitationBodyStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getCitationBodyStyleName <em>Citation Body Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation Body Style Name</em>' attribute.
	 * @see #getCitationBodyStyleName()
	 * @generated
	 */
	void setCitationBodyStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Citation Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Citation Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation Style Name</em>' attribute.
	 * @see #setCitationStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_CitationStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CitationStyleNameType"
	 *        extendedMetaData="kind='attribute' name='citation-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCitationStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getCitationStyleName <em>Citation Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation Style Name</em>' attribute.
	 * @see #getCitationStyleName()
	 * @generated
	 */
	void setCitationStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Default Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Style Name</em>' attribute.
	 * @see #setDefaultStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_DefaultStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.DefaultStyleNameType"
	 *        extendedMetaData="kind='attribute' name='default-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getDefaultStyleName <em>Default Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Style Name</em>' attribute.
	 * @see #getDefaultStyleName()
	 * @generated
	 */
	void setDefaultStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Footnotes Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FootnotesPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footnotes Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnotes Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FootnotesPositionType
	 * @see #isSetFootnotesPosition()
	 * @see #unsetFootnotesPosition()
	 * @see #setFootnotesPosition(FootnotesPositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_FootnotesPosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='footnotes-position' namespace='##targetNamespace'"
	 * @generated
	 */
	FootnotesPositionType getFootnotesPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getFootnotesPosition <em>Footnotes Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footnotes Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FootnotesPositionType
	 * @see #isSetFootnotesPosition()
	 * @see #unsetFootnotesPosition()
	 * @see #getFootnotesPosition()
	 * @generated
	 */
	void setFootnotesPosition(FootnotesPositionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getFootnotesPosition <em>Footnotes Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFootnotesPosition()
	 * @see #getFootnotesPosition()
	 * @see #setFootnotesPosition(FootnotesPositionType)
	 * @generated
	 */
	void unsetFootnotesPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getFootnotesPosition <em>Footnotes Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Footnotes Position</em>' attribute is set.
	 * @see #unsetFootnotesPosition()
	 * @see #getFootnotesPosition()
	 * @see #setFootnotesPosition(FootnotesPositionType)
	 * @generated
	 */
	boolean isSetFootnotesPosition();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_MasterPageName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.MasterPageNameType1"
	 *        extendedMetaData="kind='attribute' name='master-page-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterPageName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getMasterPageName <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Page Name</em>' attribute.
	 * @see #getMasterPageName()
	 * @generated
	 */
	void setMasterPageName(String value);

	/**
	 * Returns the value of the '<em><b>Note Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NoteClassType
	 * @see #isSetNoteClass()
	 * @see #unsetNoteClass()
	 * @see #setNoteClass(NoteClassType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_NoteClass()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='note-class' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteClassType getNoteClass();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNoteClass <em>Note Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NoteClassType
	 * @see #isSetNoteClass()
	 * @see #unsetNoteClass()
	 * @see #getNoteClass()
	 * @generated
	 */
	void setNoteClass(NoteClassType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNoteClass <em>Note Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoteClass()
	 * @see #getNoteClass()
	 * @see #setNoteClass(NoteClassType)
	 * @generated
	 */
	void unsetNoteClass();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNoteClass <em>Note Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Note Class</em>' attribute is set.
	 * @see #unsetNoteClass()
	 * @see #getNoteClass()
	 * @see #setNoteClass(NoteClassType)
	 * @generated
	 */
	boolean isSetNoteClass();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_NumFormat()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatType"
	 *        extendedMetaData="kind='attribute' name='num-format' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	Object getNumFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumFormat <em>Num Format</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_NumLetterSync()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='num-letter-sync' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumLetterSync();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetNumLetterSync();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumLetterSync <em>Num Letter Sync</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_NumPrefix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='num-prefix' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getNumPrefix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumPrefix <em>Num Prefix</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_NumSuffix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='num-suffix' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getNumSuffix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getNumSuffix <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Suffix</em>' attribute.
	 * @see #getNumSuffix()
	 * @generated
	 */
	void setNumSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Start Numbering At</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.StartNumberingAtType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Numbering At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Numbering At</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StartNumberingAtType
	 * @see #isSetStartNumberingAt()
	 * @see #unsetStartNumberingAt()
	 * @see #setStartNumberingAt(StartNumberingAtType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_StartNumberingAt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='start-numbering-at' namespace='##targetNamespace'"
	 * @generated
	 */
	StartNumberingAtType getStartNumberingAt();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getStartNumberingAt <em>Start Numbering At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Numbering At</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StartNumberingAtType
	 * @see #isSetStartNumberingAt()
	 * @see #unsetStartNumberingAt()
	 * @see #getStartNumberingAt()
	 * @generated
	 */
	void setStartNumberingAt(StartNumberingAtType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getStartNumberingAt <em>Start Numbering At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartNumberingAt()
	 * @see #getStartNumberingAt()
	 * @see #setStartNumberingAt(StartNumberingAtType)
	 * @generated
	 */
	void unsetStartNumberingAt();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getStartNumberingAt <em>Start Numbering At</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Numbering At</em>' attribute is set.
	 * @see #unsetStartNumberingAt()
	 * @see #getStartNumberingAt()
	 * @see #setStartNumberingAt(StartNumberingAtType)
	 * @generated
	 */
	boolean isSetStartNumberingAt();

	/**
	 * Returns the value of the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Value</em>' attribute.
	 * @see #setStartValue(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextNotesConfigurationContent_StartValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='start-value' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' attribute.
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(BigInteger value);

} // TextNotesConfigurationContent
