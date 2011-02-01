/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.config;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Map Indexed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType#getConfigItemMapEntry <em>Config Item Map Entry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage#getConfigItemMapIndexedType()
 * @model extendedMetaData="name='config-item-map-indexed_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigItemMapIndexedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Config Item Map Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Map Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Map Entry</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage#getConfigItemMapIndexedType_ConfigItemMapEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='config-item-map-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConfigItemMapEntryType> getConfigItemMapEntry();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage#getConfigItemMapIndexedType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConfigItemMapIndexedType
