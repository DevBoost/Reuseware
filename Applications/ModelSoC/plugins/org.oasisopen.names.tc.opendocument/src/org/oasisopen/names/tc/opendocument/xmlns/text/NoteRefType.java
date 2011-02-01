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
 * A representation of the model object '<em><b>Note Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getNoteClass <em>Note Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getReferenceFormat <em>Reference Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getRefName <em>Ref Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteRefType()
 * @model extendedMetaData="name='note-ref_._type' kind='mixed'"
 * @generated
 */
public interface NoteRefType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteRefType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteRefType_NoteClass()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='note-class' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteClassType getNoteClass();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getNoteClass <em>Note Class</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getNoteClass <em>Note Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoteClass()
	 * @see #getNoteClass()
	 * @see #setNoteClass(NoteClassType)
	 * @generated
	 */
	void unsetNoteClass();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getNoteClass <em>Note Class</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Reference Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceFormatType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Format</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceFormatType1
	 * @see #isSetReferenceFormat()
	 * @see #unsetReferenceFormat()
	 * @see #setReferenceFormat(ReferenceFormatType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteRefType_ReferenceFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference-format' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceFormatType1 getReferenceFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getReferenceFormat <em>Reference Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Format</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceFormatType1
	 * @see #isSetReferenceFormat()
	 * @see #unsetReferenceFormat()
	 * @see #getReferenceFormat()
	 * @generated
	 */
	void setReferenceFormat(ReferenceFormatType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getReferenceFormat <em>Reference Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceFormat()
	 * @see #getReferenceFormat()
	 * @see #setReferenceFormat(ReferenceFormatType1)
	 * @generated
	 */
	void unsetReferenceFormat();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getReferenceFormat <em>Reference Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Format</em>' attribute is set.
	 * @see #unsetReferenceFormat()
	 * @see #getReferenceFormat()
	 * @see #setReferenceFormat(ReferenceFormatType1)
	 * @generated
	 */
	boolean isSetReferenceFormat();

	/**
	 * Returns the value of the '<em><b>Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Name</em>' attribute.
	 * @see #setRefName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteRefType_RefName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType#getRefName <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Name</em>' attribute.
	 * @see #getRefName()
	 * @generated
	 */
	void setRefName(String value);

} // NoteRefType
