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
package org.oasisopen.names.tc.opendocument.xmlns.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:config:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfconfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapEntryTypeImpl <em>Item Map Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapEntryTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemMapEntryType()
	 * @generated
	 */
	int CONFIG_ITEM_MAP_ENTRY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_ENTRY_TYPE__GROUP = TextPackage.CONFIG_ITEMS__GROUP;

	/**
	 * The feature id for the '<em><b>Config Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_ENTRY_TYPE__CONFIG_ITEM = TextPackage.CONFIG_ITEMS__CONFIG_ITEM;

	/**
	 * The feature id for the '<em><b>Config Item Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_ENTRY_TYPE__CONFIG_ITEM_SET = TextPackage.CONFIG_ITEMS__CONFIG_ITEM_SET;

	/**
	 * The feature id for the '<em><b>Config Item Map Named</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_ENTRY_TYPE__CONFIG_ITEM_MAP_NAMED = TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_NAMED;

	/**
	 * The feature id for the '<em><b>Config Item Map Indexed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_ENTRY_TYPE__CONFIG_ITEM_MAP_INDEXED = TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_INDEXED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_ENTRY_TYPE__NAME = TextPackage.CONFIG_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Map Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_ENTRY_TYPE_FEATURE_COUNT = TextPackage.CONFIG_ITEMS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapIndexedTypeImpl <em>Item Map Indexed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapIndexedTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemMapIndexedType()
	 * @generated
	 */
	int CONFIG_ITEM_MAP_INDEXED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Config Item Map Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_INDEXED_TYPE__CONFIG_ITEM_MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_INDEXED_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Item Map Indexed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_INDEXED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapNamedTypeImpl <em>Item Map Named Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapNamedTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemMapNamedType()
	 * @generated
	 */
	int CONFIG_ITEM_MAP_NAMED_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Config Item Map Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_NAMED_TYPE__CONFIG_ITEM_MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_NAMED_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Item Map Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_MAP_NAMED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemSetTypeImpl <em>Item Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemSetTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemSetType()
	 * @generated
	 */
	int CONFIG_ITEM_SET_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_SET_TYPE__GROUP = TextPackage.CONFIG_ITEMS__GROUP;

	/**
	 * The feature id for the '<em><b>Config Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_SET_TYPE__CONFIG_ITEM = TextPackage.CONFIG_ITEMS__CONFIG_ITEM;

	/**
	 * The feature id for the '<em><b>Config Item Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_SET_TYPE__CONFIG_ITEM_SET = TextPackage.CONFIG_ITEMS__CONFIG_ITEM_SET;

	/**
	 * The feature id for the '<em><b>Config Item Map Named</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_SET_TYPE__CONFIG_ITEM_MAP_NAMED = TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_NAMED;

	/**
	 * The feature id for the '<em><b>Config Item Map Indexed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_SET_TYPE__CONFIG_ITEM_MAP_INDEXED = TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_INDEXED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_SET_TYPE__NAME = TextPackage.CONFIG_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_SET_TYPE_FEATURE_COUNT = TextPackage.CONFIG_ITEMS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemType()
	 * @generated
	 */
	int CONFIG_ITEM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Config Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIG_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Config Item Map Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Config Item Map Indexed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED = 5;

	/**
	 * The feature id for the '<em><b>Config Item Map Named</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED = 6;

	/**
	 * The feature id for the '<em><b>Config Item Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIG_ITEM_SET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 9;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 6;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.TypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 7;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType <em>Item Map Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Map Entry Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType
	 * @generated
	 */
	EClass getConfigItemMapEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType#getName()
	 * @see #getConfigItemMapEntryType()
	 * @generated
	 */
	EAttribute getConfigItemMapEntryType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType <em>Item Map Indexed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Map Indexed Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType
	 * @generated
	 */
	EClass getConfigItemMapIndexedType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType#getConfigItemMapEntry <em>Config Item Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Item Map Entry</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType#getConfigItemMapEntry()
	 * @see #getConfigItemMapIndexedType()
	 * @generated
	 */
	EReference getConfigItemMapIndexedType_ConfigItemMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType#getName()
	 * @see #getConfigItemMapIndexedType()
	 * @generated
	 */
	EAttribute getConfigItemMapIndexedType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType <em>Item Map Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Map Named Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType
	 * @generated
	 */
	EClass getConfigItemMapNamedType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType#getConfigItemMapEntry <em>Config Item Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Item Map Entry</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType#getConfigItemMapEntry()
	 * @see #getConfigItemMapNamedType()
	 * @generated
	 */
	EReference getConfigItemMapNamedType_ConfigItemMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType#getName()
	 * @see #getConfigItemMapNamedType()
	 * @generated
	 */
	EAttribute getConfigItemMapNamedType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType <em>Item Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Set Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType
	 * @generated
	 */
	EClass getConfigItemSetType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType#getName()
	 * @see #getConfigItemSetType()
	 * @generated
	 */
	EAttribute getConfigItemSetType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType
	 * @generated
	 */
	EClass getConfigItemType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType#getMixed()
	 * @see #getConfigItemType()
	 * @generated
	 */
	EAttribute getConfigItemType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType#getName()
	 * @see #getConfigItemType()
	 * @generated
	 */
	EAttribute getConfigItemType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType#getType()
	 * @see #getConfigItemType()
	 * @generated
	 */
	EAttribute getConfigItemType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItem <em>Config Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConfigItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItemMapEntry <em>Config Item Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Item Map Entry</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItemMapEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConfigItemMapEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItemMapIndexed <em>Config Item Map Indexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Item Map Indexed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItemMapIndexed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConfigItemMapIndexed();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItemMapNamed <em>Config Item Map Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Item Map Named</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItemMapNamed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConfigItemMapNamed();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItemSet <em>Config Item Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Item Set</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getConfigItemSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConfigItemSet();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Type();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.config.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.config.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.TypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.config.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapEntryTypeImpl <em>Item Map Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapEntryTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemMapEntryType()
		 * @generated
		 */
		EClass CONFIG_ITEM_MAP_ENTRY_TYPE = eINSTANCE.getConfigItemMapEntryType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_ITEM_MAP_ENTRY_TYPE__NAME = eINSTANCE.getConfigItemMapEntryType_Name();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapIndexedTypeImpl <em>Item Map Indexed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapIndexedTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemMapIndexedType()
		 * @generated
		 */
		EClass CONFIG_ITEM_MAP_INDEXED_TYPE = eINSTANCE.getConfigItemMapIndexedType();

		/**
		 * The meta object literal for the '<em><b>Config Item Map Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_ITEM_MAP_INDEXED_TYPE__CONFIG_ITEM_MAP_ENTRY = eINSTANCE.getConfigItemMapIndexedType_ConfigItemMapEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_ITEM_MAP_INDEXED_TYPE__NAME = eINSTANCE.getConfigItemMapIndexedType_Name();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapNamedTypeImpl <em>Item Map Named Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapNamedTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemMapNamedType()
		 * @generated
		 */
		EClass CONFIG_ITEM_MAP_NAMED_TYPE = eINSTANCE.getConfigItemMapNamedType();

		/**
		 * The meta object literal for the '<em><b>Config Item Map Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_ITEM_MAP_NAMED_TYPE__CONFIG_ITEM_MAP_ENTRY = eINSTANCE.getConfigItemMapNamedType_ConfigItemMapEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_ITEM_MAP_NAMED_TYPE__NAME = eINSTANCE.getConfigItemMapNamedType_Name();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemSetTypeImpl <em>Item Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemSetTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemSetType()
		 * @generated
		 */
		EClass CONFIG_ITEM_SET_TYPE = eINSTANCE.getConfigItemSetType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_ITEM_SET_TYPE__NAME = eINSTANCE.getConfigItemSetType_Name();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getConfigItemType()
		 * @generated
		 */
		EClass CONFIG_ITEM_TYPE = eINSTANCE.getConfigItemType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_ITEM_TYPE__MIXED = eINSTANCE.getConfigItemType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_ITEM_TYPE__NAME = eINSTANCE.getConfigItemType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_ITEM_TYPE__TYPE = eINSTANCE.getConfigItemType_Type();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Config Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIG_ITEM = eINSTANCE.getDocumentRoot_ConfigItem();

		/**
		 * The meta object literal for the '<em><b>Config Item Map Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY = eINSTANCE.getDocumentRoot_ConfigItemMapEntry();

		/**
		 * The meta object literal for the '<em><b>Config Item Map Indexed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED = eINSTANCE.getDocumentRoot_ConfigItemMapIndexed();

		/**
		 * The meta object literal for the '<em><b>Config Item Map Named</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED = eINSTANCE.getDocumentRoot_ConfigItemMapNamed();

		/**
		 * The meta object literal for the '<em><b>Config Item Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIG_ITEM_SET = eINSTANCE.getDocumentRoot_ConfigItemSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.config.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.TypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.TypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

	}

} //ConfigPackage
