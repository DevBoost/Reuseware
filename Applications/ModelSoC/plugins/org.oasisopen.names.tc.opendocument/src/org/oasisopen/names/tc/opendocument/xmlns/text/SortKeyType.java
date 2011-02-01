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
 * A representation of the model object '<em><b>Sort Key Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType#getKey <em>Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType#getSortAscending <em>Sort Ascending</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSortKeyType()
 * @model extendedMetaData="name='sort-key_._type' kind='empty'"
 * @generated
 */
public interface SortKeyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.KeyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.KeyType
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(KeyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSortKeyType_Key()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyType getKey();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.KeyType
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	void setKey(KeyType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(KeyType)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(KeyType)
	 * @generated
	 */
	boolean isSetKey();

	/**
	 * Returns the value of the '<em><b>Sort Ascending</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Ascending</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSortAscending()
	 * @see #unsetSortAscending()
	 * @see #setSortAscending(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSortKeyType_SortAscending()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='sort-ascending' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSortAscending();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType#getSortAscending <em>Sort Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Ascending</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSortAscending()
	 * @see #unsetSortAscending()
	 * @see #getSortAscending()
	 * @generated
	 */
	void setSortAscending(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType#getSortAscending <em>Sort Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortAscending()
	 * @see #getSortAscending()
	 * @see #setSortAscending(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetSortAscending();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType#getSortAscending <em>Sort Ascending</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Ascending</em>' attribute is set.
	 * @see #unsetSortAscending()
	 * @see #getSortAscending()
	 * @see #setSortAscending(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetSortAscending();

} // SortKeyType
