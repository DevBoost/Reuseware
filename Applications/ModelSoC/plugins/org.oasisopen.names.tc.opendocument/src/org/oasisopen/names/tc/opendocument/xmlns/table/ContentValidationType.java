/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Validation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getHelpMessage <em>Help Message</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getErrorMacro <em>Error Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getAllowEmptyCell <em>Allow Empty Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getDisplayList <em>Display List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType()
 * @model extendedMetaData="name='content-validation_._type' kind='elementOnly'"
 * @generated
 */
public interface ContentValidationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Help Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Message</em>' containment reference.
	 * @see #setHelpMessage(HelpMessageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_HelpMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='help-message' namespace='##targetNamespace'"
	 * @generated
	 */
	HelpMessageType getHelpMessage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getHelpMessage <em>Help Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help Message</em>' containment reference.
	 * @see #getHelpMessage()
	 * @generated
	 */
	void setHelpMessage(HelpMessageType value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' containment reference.
	 * @see #setErrorMessage(ErrorMessageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_ErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error-message' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorMessageType getErrorMessage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getErrorMessage <em>Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' containment reference.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(ErrorMessageType value);

	/**
	 * Returns the value of the '<em><b>Error Macro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Macro</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Macro</em>' containment reference.
	 * @see #setErrorMacro(ErrorMacroType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_ErrorMacro()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error-macro' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorMacroType getErrorMacro();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getErrorMacro <em>Error Macro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Macro</em>' containment reference.
	 * @see #getErrorMacro()
	 * @generated
	 */
	void setErrorMacro(ErrorMacroType value);

	/**
	 * Returns the value of the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listeners</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listeners</em>' containment reference.
	 * @see #setEventListeners(EventListenersType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_EventListeners()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event-listeners' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	EventListenersType getEventListeners();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getEventListeners <em>Event Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Listeners</em>' containment reference.
	 * @see #getEventListeners()
	 * @generated
	 */
	void setEventListeners(EventListenersType value);

	/**
	 * Returns the value of the '<em><b>Allow Empty Cell</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Empty Cell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Empty Cell</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowEmptyCell()
	 * @see #unsetAllowEmptyCell()
	 * @see #setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_AllowEmptyCell()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='allow-empty-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowEmptyCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getAllowEmptyCell <em>Allow Empty Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Empty Cell</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowEmptyCell()
	 * @see #unsetAllowEmptyCell()
	 * @see #getAllowEmptyCell()
	 * @generated
	 */
	void setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getAllowEmptyCell <em>Allow Empty Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowEmptyCell()
	 * @see #getAllowEmptyCell()
	 * @see #setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAllowEmptyCell();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getAllowEmptyCell <em>Allow Empty Cell</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Empty Cell</em>' attribute is set.
	 * @see #unsetAllowEmptyCell()
	 * @see #getAllowEmptyCell()
	 * @see #setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAllowEmptyCell();

	/**
	 * Returns the value of the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Cell Address</em>' attribute.
	 * @see #setBaseCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_BaseCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='base-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getBaseCellAddress <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Cell Address</em>' attribute.
	 * @see #getBaseCellAddress()
	 * @generated
	 */
	void setBaseCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_Condition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Display List</b></em>' attribute.
	 * The default value is <code>"unsorted"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display List</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType
	 * @see #isSetDisplayList()
	 * @see #unsetDisplayList()
	 * @see #setDisplayList(DisplayListType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_DisplayList()
	 * @model default="unsorted" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-list' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayListType getDisplayList();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getDisplayList <em>Display List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display List</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType
	 * @see #isSetDisplayList()
	 * @see #unsetDisplayList()
	 * @see #getDisplayList()
	 * @generated
	 */
	void setDisplayList(DisplayListType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getDisplayList <em>Display List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayList()
	 * @see #getDisplayList()
	 * @see #setDisplayList(DisplayListType)
	 * @generated
	 */
	void unsetDisplayList();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getDisplayList <em>Display List</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display List</em>' attribute is set.
	 * @see #unsetDisplayList()
	 * @see #getDisplayList()
	 * @see #setDisplayList(DisplayListType)
	 * @generated
	 */
	boolean isSetDisplayList();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ContentValidationType
