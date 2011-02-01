/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getErrorMessageType()
 * @model extendedMetaData="name='error-message_._type' kind='elementOnly'"
 * @generated
 */
public interface ErrorMessageType extends EObject {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getErrorMessageType_P()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='p' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	EList<PType> getP();

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplay()
	 * @see #unsetDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getErrorMessageType_Display()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplay()
	 * @see #unsetDisplay()
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplay()
	 * @see #getDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplay();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getDisplay <em>Display</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display</em>' attribute is set.
	 * @see #unsetDisplay()
	 * @see #getDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplay();

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * The default value is <code>"stop"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType
	 * @see #isSetMessageType()
	 * @see #unsetMessageType()
	 * @see #setMessageType(MessageTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getErrorMessageType_MessageType()
	 * @model default="stop" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='message-type' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageTypeType getMessageType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType
	 * @see #isSetMessageType()
	 * @see #unsetMessageType()
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageType()
	 * @see #getMessageType()
	 * @see #setMessageType(MessageTypeType)
	 * @generated
	 */
	void unsetMessageType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getMessageType <em>Message Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Type</em>' attribute is set.
	 * @see #unsetMessageType()
	 * @see #getMessageType()
	 * @see #setMessageType(MessageTypeType)
	 * @generated
	 */
	boolean isSetMessageType();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getErrorMessageType_Title()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // ErrorMessageType
