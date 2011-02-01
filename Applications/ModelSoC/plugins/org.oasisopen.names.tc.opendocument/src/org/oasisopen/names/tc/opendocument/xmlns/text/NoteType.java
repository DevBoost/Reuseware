/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getNoteCitation <em>Note Citation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getNoteBody <em>Note Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getNoteClass <em>Note Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteType()
 * @model extendedMetaData="name='note_._type' kind='elementOnly'"
 * @generated
 */
public interface NoteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Note Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Citation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Citation</em>' containment reference.
	 * @see #setNoteCitation(NoteCitationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteType_NoteCitation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='note-citation' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteCitationType getNoteCitation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getNoteCitation <em>Note Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Citation</em>' containment reference.
	 * @see #getNoteCitation()
	 * @generated
	 */
	void setNoteCitation(NoteCitationType value);

	/**
	 * Returns the value of the '<em><b>Note Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Body</em>' containment reference.
	 * @see #setNoteBody(NoteBodyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteType_NoteBody()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='note-body' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteBodyType getNoteBody();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getNoteBody <em>Note Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Body</em>' containment reference.
	 * @see #getNoteBody()
	 * @generated
	 */
	void setNoteBody(NoteBodyType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteType_Id()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getNoteType_NoteClass()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='note-class' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteClassType getNoteClass();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getNoteClass <em>Note Class</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getNoteClass <em>Note Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoteClass()
	 * @see #getNoteClass()
	 * @see #setNoteClass(NoteClassType)
	 * @generated
	 */
	void unsetNoteClass();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType#getNoteClass <em>Note Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Note Class</em>' attribute is set.
	 * @see #unsetNoteClass()
	 * @see #getNoteClass()
	 * @see #setNoteClass(NoteClassType)
	 * @generated
	 */
	boolean isSetNoteClass();

} // NoteType
