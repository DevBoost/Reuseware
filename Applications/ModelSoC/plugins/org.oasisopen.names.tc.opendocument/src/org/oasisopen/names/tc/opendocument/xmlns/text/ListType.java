/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getListHeader <em>List Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getListItem <em>List Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getContinueNumbering <em>Continue Numbering</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListType()
 * @model extendedMetaData="name='list_._type' kind='elementOnly'"
 * @generated
 */
public interface ListType extends EObject {
	/**
	 * Returns the value of the '<em><b>List Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Header</em>' containment reference.
	 * @see #setListHeader(TextListItemContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListType_ListHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='list-header' namespace='##targetNamespace'"
	 * @generated
	 */
	TextListItemContent getListHeader();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getListHeader <em>List Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Header</em>' containment reference.
	 * @see #getListHeader()
	 * @generated
	 */
	void setListHeader(TextListItemContent value);

	/**
	 * Returns the value of the '<em><b>List Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ListItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Item</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListType_ListItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='list-item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ListItemType> getListItem();

	/**
	 * Returns the value of the '<em><b>Continue Numbering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continue Numbering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue Numbering</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetContinueNumbering()
	 * @see #unsetContinueNumbering()
	 * @see #setContinueNumbering(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListType_ContinueNumbering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='continue-numbering' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContinueNumbering();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getContinueNumbering <em>Continue Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue Numbering</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetContinueNumbering()
	 * @see #unsetContinueNumbering()
	 * @see #getContinueNumbering()
	 * @generated
	 */
	void setContinueNumbering(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getContinueNumbering <em>Continue Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinueNumbering()
	 * @see #getContinueNumbering()
	 * @see #setContinueNumbering(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetContinueNumbering();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getContinueNumbering <em>Continue Numbering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continue Numbering</em>' attribute is set.
	 * @see #unsetContinueNumbering()
	 * @see #getContinueNumbering()
	 * @see #setContinueNumbering(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetContinueNumbering();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getListType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType25"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // ListType
