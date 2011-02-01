/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType#getConfigItemSet <em>Config Item Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSettingsType()
 * @model extendedMetaData="name='settings_._type' kind='elementOnly'"
 * @generated
 */
public interface SettingsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Config Item Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Set</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSettingsType_ConfigItemSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='config-item-set' namespace='urn:oasis:names:tc:opendocument:xmlns:config:1.0'"
	 * @generated
	 */
	EList<ConfigItemSetType> getConfigItemSet();

} // SettingsType
