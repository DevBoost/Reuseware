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
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems#getConfigItem <em>Config Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems#getConfigItemSet <em>Config Item Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems#getConfigItemMapNamed <em>Config Item Map Named</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems#getConfigItemMapIndexed <em>Config Item Map Indexed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConfigItems()
 * @model extendedMetaData="name='config-items' kind='elementOnly'"
 * @generated
 */
public interface ConfigItems extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConfigItems_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Config Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConfigItems_ConfigItem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='config-item' namespace='urn:oasis:names:tc:opendocument:xmlns:config:1.0' group='#group:0'"
	 * @generated
	 */
	EList<ConfigItemType> getConfigItem();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConfigItems_ConfigItemSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='config-item-set' namespace='urn:oasis:names:tc:opendocument:xmlns:config:1.0' group='#group:0'"
	 * @generated
	 */
	EList<ConfigItemSetType> getConfigItemSet();

	/**
	 * Returns the value of the '<em><b>Config Item Map Named</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Map Named</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Map Named</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConfigItems_ConfigItemMapNamed()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='config-item-map-named' namespace='urn:oasis:names:tc:opendocument:xmlns:config:1.0' group='#group:0'"
	 * @generated
	 */
	EList<ConfigItemMapNamedType> getConfigItemMapNamed();

	/**
	 * Returns the value of the '<em><b>Config Item Map Indexed</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Map Indexed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Map Indexed</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConfigItems_ConfigItemMapIndexed()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='config-item-map-indexed' namespace='urn:oasis:names:tc:opendocument:xmlns:config:1.0' group='#group:0'"
	 * @generated
	 */
	EList<ConfigItemMapIndexedType> getConfigItemMapIndexed();

} // ConfigItems
