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
package org.oasisopen.names.tc.opendocument.xmlns.form;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormFactory
 * @model kind="package"
 * @generated
 */
public interface FormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "form";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:form:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl <em>Button Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getButtonType()
	 * @generated
	 */
	int BUTTON_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Button Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__BUTTON_TYPE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__DEFAULT_BUTTON = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Focus On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__FOCUS_ON_CLICK = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__HREF = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Image Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__IMAGE_ALIGN = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__IMAGE_DATA = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Image Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__IMAGE_POSITION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__LABEL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Target Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__TARGET_FRAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__TOGGLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Xforms Submission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE__XFORMS_SUBMISSION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Button Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.CheckboxTypeImpl <em>Checkbox Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.CheckboxTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getCheckboxType()
	 * @generated
	 */
	int CHECKBOX_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__CURRENT_STATE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Image Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__IMAGE_ALIGN = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__IMAGE_POSITION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Tristate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__IS_TRISTATE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__LABEL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__STATE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Visual Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE__VISUAL_EFFECT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Checkbox Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ColumnTypeImpl <em>Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ColumnTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getColumnType()
	 * @generated
	 */
	int COLUMN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Column Controls Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__COLUMN_CONTROLS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Column Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__COLUMN_CONTROLS = 1;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__CONTROL_IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__TEXT_STYLE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl <em>Combobox Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getComboboxType()
	 * @generated
	 */
	int COMBOBOX_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__ITEM = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__AUTO_COMPLETE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__CONVERT_EMPTY_TO_NULL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__CURRENT_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dropdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__DROPDOWN = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__LIST_SOURCE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>List Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__LIST_SOURCE_TYPE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__SIZE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Combobox Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ConnectionResourceTypeImpl <em>Connection Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ConnectionResourceTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getConnectionResourceType()
	 * @generated
	 */
	int CONNECTION_RESOURCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESOURCE_TYPE__HREF = 0;

	/**
	 * The number of structural features of the '<em>Connection Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.DateTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__CONVERT_EMPTY_TO_NULL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__CURRENT_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__MAX_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__MIN_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FileTypeImpl <em>File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FileTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__CURRENT_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl <em>Fixed Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getFixedTextType()
	 * @generated
	 */
	int FIXED_TEXT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__FOR = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__LABEL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__MULTI_LINE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Fixed Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TEXT_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormattedTextTypeImpl <em>Formatted Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormattedTextTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getFormattedTextType()
	 * @generated
	 */
	int FORMATTED_TEXT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__CONVERT_EMPTY_TO_NULL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__CURRENT_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__MAX_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__MIN_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__VALIDATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Formatted Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getFormType()
	 * @generated
	 */
	int FORM_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__EVENT_LISTENERS = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Controls Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__CONTROLS_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__CONTROLS = 4;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__FORM = 5;

	/**
	 * The feature id for the '<em><b>Connection Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__CONNECTION_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__ACTUATE = 7;

	/**
	 * The feature id for the '<em><b>Allow Deletes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__ALLOW_DELETES = 8;

	/**
	 * The feature id for the '<em><b>Allow Inserts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__ALLOW_INSERTS = 9;

	/**
	 * The feature id for the '<em><b>Allow Updates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__ALLOW_UPDATES = 10;

	/**
	 * The feature id for the '<em><b>Apply Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__APPLY_FILTER = 11;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__COMMAND = 12;

	/**
	 * The feature id for the '<em><b>Command Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__COMMAND_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__CONTROL_IMPLEMENTATION = 14;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__DATASOURCE = 15;

	/**
	 * The feature id for the '<em><b>Detail Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__DETAIL_FIELDS = 16;

	/**
	 * The feature id for the '<em><b>Enctype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__ENCTYPE = 17;

	/**
	 * The feature id for the '<em><b>Escape Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__ESCAPE_PROCESSING = 18;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__FILTER = 19;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__HREF = 20;

	/**
	 * The feature id for the '<em><b>Ignore Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__IGNORE_RESULT = 21;

	/**
	 * The feature id for the '<em><b>Master Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__MASTER_FIELDS = 22;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__METHOD = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__NAME = 24;

	/**
	 * The feature id for the '<em><b>Navigation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__NAVIGATION_MODE = 25;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__ORDER = 26;

	/**
	 * The feature id for the '<em><b>Tab Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__TAB_CYCLE = 27;

	/**
	 * The feature id for the '<em><b>Target Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__TARGET_FRAME = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE__TYPE = 29;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TYPE_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FrameTypeImpl <em>Frame Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FrameTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getFrameType()
	 * @generated
	 */
	int FRAME_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__FOR = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__LABEL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.GenericControlTypeImpl <em>Generic Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.GenericControlTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getGenericControlType()
	 * @generated
	 */
	int GENERIC_CONTROL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generic Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.GridTypeImpl <em>Grid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.GridTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getGridType()
	 * @generated
	 */
	int GRID_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__COLUMN = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Grid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.HiddenTypeImpl <em>Hidden Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.HiddenTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getHiddenType()
	 * @generated
	 */
	int HIDDEN_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hidden Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageFrameTypeImpl <em>Image Frame Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageFrameTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getImageFrameType()
	 * @generated
	 */
	int IMAGE_FRAME_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__IMAGE_DATA = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Image Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FRAME_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl <em>Image Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getImageType()
	 * @generated
	 */
	int IMAGE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Button Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__BUTTON_TYPE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__HREF = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__IMAGE_DATA = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__TARGET_FRAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ItemTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListboxTypeImpl <em>Listbox Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListboxTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListboxType()
	 * @generated
	 */
	int LISTBOX_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__OPTION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bound Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__BOUND_COLUMN = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dropdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__DROPDOWN = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__LIST_SOURCE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>List Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__LIST_SOURCE_TYPE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__MULTIPLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__SIZE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Xforms List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE__XFORMS_LIST_SOURCE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Listbox Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTBOX_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListPropertyTypeImpl <em>List Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListPropertyTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListPropertyType()
	 * @generated
	 */
	int LIST_PROPERTY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>List Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE;

	/**
	 * The feature id for the '<em><b>List Value1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE1 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE1;

	/**
	 * The feature id for the '<em><b>List Value2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE2 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE2;

	/**
	 * The feature id for the '<em><b>List Value3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE3 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE3;

	/**
	 * The feature id for the '<em><b>List Value11</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE11 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE11;

	/**
	 * The feature id for the '<em><b>List Value4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE4 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE4;

	/**
	 * The feature id for the '<em><b>List Value21</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE21 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE21;

	/**
	 * The feature id for the '<em><b>List Value5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE5 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE5;

	/**
	 * The feature id for the '<em><b>List Value31</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE31 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE31;

	/**
	 * The feature id for the '<em><b>List Value6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE6 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE6;

	/**
	 * The feature id for the '<em><b>List Value41</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE41 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE41;

	/**
	 * The feature id for the '<em><b>List Value7</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE7 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE7;

	/**
	 * The feature id for the '<em><b>List Value51</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE51 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE51;

	/**
	 * The feature id for the '<em><b>List Value8</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__LIST_VALUE8 = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE8;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__VALUE_TYPE = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE__PROPERTY_NAME = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_TYPE_FEATURE_COUNT = TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueTypeImpl <em>List Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListValueType()
	 * @generated
	 */
	int LIST_VALUE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE__DATE_VALUE = 0;

	/**
	 * The number of structural features of the '<em>List Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType1Impl <em>List Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType1Impl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListValueType1()
	 * @generated
	 */
	int LIST_VALUE_TYPE1 = 20;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE1__BOOLEAN_VALUE = 0;

	/**
	 * The number of structural features of the '<em>List Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType2Impl <em>List Value Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType2Impl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListValueType2()
	 * @generated
	 */
	int LIST_VALUE_TYPE2 = 21;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE2__STRING_VALUE = 0;

	/**
	 * The number of structural features of the '<em>List Value Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType3Impl <em>List Value Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType3Impl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListValueType3()
	 * @generated
	 */
	int LIST_VALUE_TYPE3 = 22;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE3__TIME_VALUE = 0;

	/**
	 * The number of structural features of the '<em>List Value Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType4Impl <em>List Value Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType4Impl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListValueType4()
	 * @generated
	 */
	int LIST_VALUE_TYPE4 = 23;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE4__CURRENCY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE4__VALUE = 1;

	/**
	 * The number of structural features of the '<em>List Value Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE4_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType5Impl <em>List Value Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType5Impl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListValueType5()
	 * @generated
	 */
	int LIST_VALUE_TYPE5 = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE5__VALUE = 0;

	/**
	 * The number of structural features of the '<em>List Value Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_TYPE5_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertiesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Form Property Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__FORM_PROPERTY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Form Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__FORM_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 26;

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
	 * The feature id for the '<em><b>Button</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHECKBOX = 4;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Combobox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMBOBOX = 6;

	/**
	 * The feature id for the '<em><b>Connection Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTION_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE = 8;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILE = 9;

	/**
	 * The feature id for the '<em><b>Fixed Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIXED_TEXT = 10;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORM = 11;

	/**
	 * The feature id for the '<em><b>Formatted Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMATTED_TEXT = 12;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRAME = 13;

	/**
	 * The feature id for the '<em><b>Generic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_CONTROL = 14;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID = 15;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIDDEN = 16;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE = 17;

	/**
	 * The feature id for the '<em><b>Image Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_FRAME = 18;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM = 19;

	/**
	 * The feature id for the '<em><b>Listbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LISTBOX = 20;

	/**
	 * The feature id for the '<em><b>List Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER = 22;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPTION = 23;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PASSWORD = 24;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTIES = 25;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 26;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RADIO = 27;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT = 28;

	/**
	 * The feature id for the '<em><b>Textarea</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTAREA = 29;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME = 30;

	/**
	 * The feature id for the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_RANGE = 31;

	/**
	 * The feature id for the '<em><b>Allow Deletes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALLOW_DELETES = 32;

	/**
	 * The feature id for the '<em><b>Allow Inserts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALLOW_INSERTS = 33;

	/**
	 * The feature id for the '<em><b>Allow Updates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALLOW_UPDATES = 34;

	/**
	 * The feature id for the '<em><b>Apply Design Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLY_DESIGN_MODE = 35;

	/**
	 * The feature id for the '<em><b>Apply Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLY_FILTER = 36;

	/**
	 * The feature id for the '<em><b>Auto Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTO_COMPLETE = 37;

	/**
	 * The feature id for the '<em><b>Automatic Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTOMATIC_FOCUS = 38;

	/**
	 * The feature id for the '<em><b>Bound Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOUND_COLUMN = 39;

	/**
	 * The feature id for the '<em><b>Button Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUTTON_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMAND = 41;

	/**
	 * The feature id for the '<em><b>Command Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMAND_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTROL_IMPLEMENTATION = 43;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONVERT_EMPTY_TO_NULL = 44;

	/**
	 * The feature id for the '<em><b>Current Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENT_SELECTED = 45;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENT_STATE = 46;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_FIELD = 47;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATASOURCE = 48;

	/**
	 * The feature id for the '<em><b>Default Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_BUTTON = 49;

	/**
	 * The feature id for the '<em><b>Delay For Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELAY_FOR_REPEAT = 50;

	/**
	 * The feature id for the '<em><b>Detail Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DETAIL_FIELDS = 51;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISABLED = 52;

	/**
	 * The feature id for the '<em><b>Dropdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROPDOWN = 53;

	/**
	 * The feature id for the '<em><b>Echo Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ECHO_CHAR = 54;

	/**
	 * The feature id for the '<em><b>Enctype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCTYPE = 55;

	/**
	 * The feature id for the '<em><b>Escape Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ESCAPE_PROCESSING = 56;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 57;

	/**
	 * The feature id for the '<em><b>Focus On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOCUS_ON_CLICK = 58;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOR = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 60;

	/**
	 * The feature id for the '<em><b>Ignore Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IGNORE_RESULT = 61;

	/**
	 * The feature id for the '<em><b>Image Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_ALIGN = 62;

	/**
	 * The feature id for the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_DATA = 63;

	/**
	 * The feature id for the '<em><b>Image Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_POSITION = 64;

	/**
	 * The feature id for the '<em><b>Is Tristate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_TRISTATE = 65;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL = 66;

	/**
	 * The feature id for the '<em><b>List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_SOURCE = 67;

	/**
	 * The feature id for the '<em><b>List Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_SOURCE_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Master Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_FIELDS = 69;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_LENGTH = 70;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD = 71;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_LINE = 72;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTIPLE = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 74;

	/**
	 * The feature id for the '<em><b>Navigation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAVIGATION_MODE = 75;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORDER = 76;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIENTATION = 77;

	/**
	 * The feature id for the '<em><b>Page Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_STEP_SIZE = 78;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINTABLE = 79;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_NAME = 80;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__READONLY = 81;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELECTED = 82;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIZE = 83;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATE = 84;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STEP_SIZE = 85;

	/**
	 * The feature id for the '<em><b>Tab Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAB_CYCLE = 86;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAB_INDEX = 87;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAB_STOP = 88;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_STYLE_NAME = 89;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 90;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOGGLE = 91;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATION = 92;

	/**
	 * The feature id for the '<em><b>Visual Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISUAL_EFFECT = 93;

	/**
	 * The feature id for the '<em><b>Xforms List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XFORMS_LIST_SOURCE = 94;

	/**
	 * The feature id for the '<em><b>Xforms Submission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XFORMS_SUBMISSION = 95;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 96;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.NumberTypeImpl <em>Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.NumberTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getNumberType()
	 * @generated
	 */
	int NUMBER_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__CONVERT_EMPTY_TO_NULL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__CURRENT_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__MAX_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__MIN_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.OptionTypeImpl <em>Option Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.OptionTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getOptionType()
	 * @generated
	 */
	int OPTION_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Current Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__CURRENT_SELECTED = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__SELECTED = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Option Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PasswordTypeImpl <em>Password Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.PasswordTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getPasswordType()
	 * @generated
	 */
	int PASSWORD_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__CONVERT_EMPTY_TO_NULL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Echo Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__ECHO_CHAR = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Password Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__BOOLEAN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__CURRENCY = 1;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DATE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__PROPERTY_NAME = 3;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__STRING_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__TIME_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl <em>Radio Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getRadioType()
	 * @generated
	 */
	int RADIO_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__CURRENT_SELECTED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Image Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__IMAGE_ALIGN = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__IMAGE_POSITION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__LABEL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__SELECTED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Visual Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE__VISUAL_EFFECT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Radio Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.TextareaTypeImpl <em>Textarea Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.TextareaTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getTextareaType()
	 * @generated
	 */
	int TEXTAREA_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__P = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__CONVERT_EMPTY_TO_NULL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__CURRENT_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Textarea Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.TextTypeImpl <em>Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.TextTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CONVERT_EMPTY_TO_NULL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CURRENT_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.TimeTypeImpl <em>Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.TimeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__CONVERT_EMPTY_TO_NULL = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__CURRENT_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__DATA_FIELD = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__MAX_LENGTH = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__MAX_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__MIN_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__READONLY = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl <em>Value Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getValueRangeType()
	 * @generated
	 */
	int VALUE_RANGE_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__PROPERTIES = TextPackage.COMMON_FORM_CONTROL_CONTENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__EVENT_LISTENERS = TextPackage.COMMON_FORM_CONTROL_CONTENT__EVENT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__BIND = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__CONTROL_IMPLEMENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delay For Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__DELAY_FOR_REPEAT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__DISABLED = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__ID = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__MAX_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__MIN_VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__NAME = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__ORIENTATION = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Page Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__PAGE_STEP_SIZE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Printable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__PRINTABLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__STEP_SIZE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__TAB_INDEX = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tab Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__TAB_STOP = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__TITLE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE__VALUE = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Value Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_TYPE_FEATURE_COUNT = TextPackage.COMMON_FORM_CONTROL_CONTENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType <em>Command Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getCommandTypeType()
	 * @generated
	 */
	int COMMAND_TYPE_TYPE = 36;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType <em>Image Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getImageAlignType()
	 * @generated
	 */
	int IMAGE_ALIGN_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType <em>Image Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getImagePositionType()
	 * @generated
	 */
	int IMAGE_POSITION_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType <em>List Source Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListSourceTypeType()
	 * @generated
	 */
	int LIST_SOURCE_TYPE_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1 <em>Method Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getMethodTypeMember1()
	 * @generated
	 */
	int METHOD_TYPE_MEMBER1 = 40;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2 <em>Method Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getMethodTypeMember2()
	 * @generated
	 */
	int METHOD_TYPE_MEMBER2 = 41;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType <em>Orientation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getOrientationType()
	 * @generated
	 */
	int ORIENTATION_TYPE = 42;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType <em>Visual Effect Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getVisualEffectType()
	 * @generated
	 */
	int VISUAL_EFFECT_TYPE = 43;

	/**
	 * The meta object id for the '<em>Command Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getCommandTypeTypeObject()
	 * @generated
	 */
	int COMMAND_TYPE_TYPE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Datasource Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getDatasourceType()
	 * @generated
	 */
	int DATASOURCE_TYPE = 45;

	/**
	 * The meta object id for the '<em>Image Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getImageAlignTypeObject()
	 * @generated
	 */
	int IMAGE_ALIGN_TYPE_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Image Position Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getImagePositionTypeObject()
	 * @generated
	 */
	int IMAGE_POSITION_TYPE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>List Source Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getListSourceTypeTypeObject()
	 * @generated
	 */
	int LIST_SOURCE_TYPE_TYPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Method Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 49;

	/**
	 * The meta object id for the '<em>Method Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getMethodTypeMember1Object()
	 * @generated
	 */
	int METHOD_TYPE_MEMBER1_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Method Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getMethodTypeMember2Object()
	 * @generated
	 */
	int METHOD_TYPE_MEMBER2_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Orientation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getOrientationTypeObject()
	 * @generated
	 */
	int ORIENTATION_TYPE_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Text Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getTextStyleNameType()
	 * @generated
	 */
	int TEXT_STYLE_NAME_TYPE = 53;

	/**
	 * The meta object id for the '<em>Text Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getTextStyleNameTypeMember1()
	 * @generated
	 */
	int TEXT_STYLE_NAME_TYPE_MEMBER1 = 54;

	/**
	 * The meta object id for the '<em>Visual Effect Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl#getVisualEffectTypeObject()
	 * @generated
	 */
	int VISUAL_EFFECT_TYPE_OBJECT = 55;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType
	 * @generated
	 */
	EClass getButtonType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getBind()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getButtonType()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_ButtonType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getControlImplementation()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getDefaultButton <em>Default Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Button</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getDefaultButton()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_DefaultButton();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getDisabled()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getFocusOnClick <em>Focus On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus On Click</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getFocusOnClick()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_FocusOnClick();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getHref()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getId()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getImageAlign <em>Image Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getImageAlign()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_ImageAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getImageData()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_ImageData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getImagePosition <em>Image Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getImagePosition()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_ImagePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getLabel()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getName()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getPrintable()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getTabIndex()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getTabStop()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getTargetFrame <em>Target Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getTargetFrame()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_TargetFrame();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getTitle()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getToggle()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Toggle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getValue()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getXformsSubmission <em>Xforms Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xforms Submission</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType#getXformsSubmission()
	 * @see #getButtonType()
	 * @generated
	 */
	EAttribute getButtonType_XformsSubmission();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType <em>Checkbox Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType
	 * @generated
	 */
	EClass getCheckboxType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getBind()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getControlImplementation()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getCurrentState()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDataField()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDisabled()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getId()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImageAlign <em>Image Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImageAlign()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_ImageAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImagePosition <em>Image Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImagePosition()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_ImagePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getIsTristate <em>Is Tristate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tristate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getIsTristate()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_IsTristate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getLabel()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getName()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getPrintable()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getState()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_State();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabIndex()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabStop()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTitle()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getValue()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getVisualEffect <em>Visual Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getVisualEffect()
	 * @see #getCheckboxType()
	 * @generated
	 */
	EAttribute getCheckboxType_VisualEffect();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType
	 * @generated
	 */
	EClass getColumnType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getColumnControlsGroup <em>Column Controls Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Controls Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getColumnControlsGroup()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ColumnControlsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getColumnControls <em>Column Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Controls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getColumnControls()
	 * @see #getColumnType()
	 * @generated
	 */
	EReference getColumnType_ColumnControls();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getControlImplementation()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getLabel()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getName()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType#getTextStyleName()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_TextStyleName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType <em>Combobox Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combobox Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType
	 * @generated
	 */
	EClass getComboboxType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getItem()
	 * @see #getComboboxType()
	 * @generated
	 */
	EReference getComboboxType_Item();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getAutoComplete <em>Auto Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Complete</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getAutoComplete()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_AutoComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getBind()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getControlImplementation()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getConvertEmptyToNull()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getCurrentValue()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getDataField()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getDisabled()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getDropdown <em>Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropdown</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getDropdown()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Dropdown();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getId()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getListSource <em>List Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getListSource()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_ListSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getListSourceType <em>List Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getListSourceType()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_ListSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getMaxLength()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getName()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getPrintable()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getReadonly()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getSize()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getTabIndex()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getTabStop()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getTitle()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType#getValue()
	 * @see #getComboboxType()
	 * @generated
	 */
	EAttribute getComboboxType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType <em>Connection Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Resource Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType
	 * @generated
	 */
	EClass getConnectionResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType#getHref()
	 * @see #getConnectionResourceType()
	 * @generated
	 */
	EAttribute getConnectionResourceType_Href();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getBind()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getControlImplementation()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getConvertEmptyToNull()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getCurrentValue()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getDataField()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getDisabled()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getId()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getMaxLength()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getMaxValue()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getMinValue()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getName()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getPrintable()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getReadonly()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getTabIndex()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getTabStop()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getTitle()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DateType#getValue()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType
	 * @generated
	 */
	EClass getFileType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getBind()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getControlImplementation()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getCurrentValue()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getDisabled()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getId()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getMaxLength()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getName()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getPrintable()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getReadonly()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getTabIndex()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getTabStop()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getTitle()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FileType#getValue()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType <em>Fixed Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Text Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType
	 * @generated
	 */
	EClass getFixedTextType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getBind()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getControlImplementation()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getDisabled()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getFor()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_For();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getId()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getLabel()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getMultiLine <em>Multi Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getMultiLine()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_MultiLine();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getName()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getPrintable()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType#getTitle()
	 * @see #getFixedTextType()
	 * @generated
	 */
	EAttribute getFixedTextType_Title();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType <em>Formatted Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatted Text Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType
	 * @generated
	 */
	EClass getFormattedTextType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getBind()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getControlImplementation()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getConvertEmptyToNull()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getCurrentValue()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getDataField()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getDisabled()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getId()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getMaxLength()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getMaxValue()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getMinValue()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getName()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getPrintable()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getReadonly()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getTabIndex()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getTabStop()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getTitle()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getValidation()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Validation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType#getValue()
	 * @see #getFormattedTextType()
	 * @generated
	 */
	EAttribute getFormattedTextType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType
	 * @generated
	 */
	EClass getFormType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getProperties()
	 * @see #getFormType()
	 * @generated
	 */
	EReference getFormType_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEventListeners()
	 * @see #getFormType()
	 * @generated
	 */
	EReference getFormType_EventListeners();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getGroup()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControlsGroup <em>Controls Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Controls Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControlsGroup()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_ControlsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControls()
	 * @see #getFormType()
	 * @generated
	 */
	EReference getFormType_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getForm()
	 * @see #getFormType()
	 * @generated
	 */
	EReference getFormType_Form();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getConnectionResource <em>Connection Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Resource</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getConnectionResource()
	 * @see #getFormType()
	 * @generated
	 */
	EReference getFormType_ConnectionResource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getActuate()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowDeletes <em>Allow Deletes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Deletes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowDeletes()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_AllowDeletes();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowInserts <em>Allow Inserts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Inserts</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowInserts()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_AllowInserts();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowUpdates <em>Allow Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Updates</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowUpdates()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_AllowUpdates();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getApplyFilter <em>Apply Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getApplyFilter()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_ApplyFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommand()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommandType()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_CommandType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControlImplementation()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datasource</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getDatasource()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Datasource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getDetailFields <em>Detail Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Fields</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getDetailFields()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_DetailFields();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEnctype <em>Enctype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enctype</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEnctype()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Enctype();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEscapeProcessing <em>Escape Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escape Processing</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEscapeProcessing()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_EscapeProcessing();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getFilter()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getHref()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getIgnoreResult <em>Ignore Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Result</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getIgnoreResult()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_IgnoreResult();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMasterFields <em>Master Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Fields</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMasterFields()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_MasterFields();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMethod()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getName()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getNavigationMode <em>Navigation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getNavigationMode()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_NavigationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getOrder()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTabCycle <em>Tab Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Cycle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTabCycle()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_TabCycle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTargetFrame <em>Target Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTargetFrame()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_TargetFrame();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getType()
	 * @see #getFormType()
	 * @generated
	 */
	EAttribute getFormType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType
	 * @generated
	 */
	EClass getFrameType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getBind()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getControlImplementation()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getDisabled()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getFor()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_For();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getId()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getLabel()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getName()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getPrintable()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FrameType#getTitle()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Title();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType <em>Generic Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Control Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType
	 * @generated
	 */
	EClass getGenericControlType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType#getBind()
	 * @see #getGenericControlType()
	 * @generated
	 */
	EAttribute getGenericControlType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType#getControlImplementation()
	 * @see #getGenericControlType()
	 * @generated
	 */
	EAttribute getGenericControlType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType#getId()
	 * @see #getGenericControlType()
	 * @generated
	 */
	EAttribute getGenericControlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType#getName()
	 * @see #getGenericControlType()
	 * @generated
	 */
	EAttribute getGenericControlType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType <em>Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType
	 * @generated
	 */
	EClass getGridType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getColumn()
	 * @see #getGridType()
	 * @generated
	 */
	EReference getGridType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getBind()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getControlImplementation()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getDisabled()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getId()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getName()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getPrintable()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getTabIndex()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getTabStop()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.GridType#getTitle()
	 * @see #getGridType()
	 * @generated
	 */
	EAttribute getGridType_Title();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType <em>Hidden Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hidden Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType
	 * @generated
	 */
	EClass getHiddenType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getBind()
	 * @see #getHiddenType()
	 * @generated
	 */
	EAttribute getHiddenType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getControlImplementation()
	 * @see #getHiddenType()
	 * @generated
	 */
	EAttribute getHiddenType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getId()
	 * @see #getHiddenType()
	 * @generated
	 */
	EAttribute getHiddenType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getName()
	 * @see #getHiddenType()
	 * @generated
	 */
	EAttribute getHiddenType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType#getValue()
	 * @see #getHiddenType()
	 * @generated
	 */
	EAttribute getHiddenType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType <em>Image Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Frame Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType
	 * @generated
	 */
	EClass getImageFrameType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getBind()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getControlImplementation()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getDataField()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getDisabled()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getId()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getImageData()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_ImageData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getName()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getPrintable()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getReadonly()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType#getTitle()
	 * @see #getImageFrameType()
	 * @generated
	 */
	EAttribute getImageFrameType_Title();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType
	 * @generated
	 */
	EClass getImageType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getBind()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getButtonType()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_ButtonType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getControlImplementation()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getDisabled()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getHref()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getId()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getImageData()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_ImageData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getName()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getPrintable()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getTabIndex()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getTabStop()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getTargetFrame <em>Target Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getTargetFrame()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_TargetFrame();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getTitle()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageType#getValue()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ItemType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ItemType#getMixed()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ItemType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ItemType#getLabel()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Label();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType <em>Listbox Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listbox Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType
	 * @generated
	 */
	EClass getListboxType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getOption()
	 * @see #getListboxType()
	 * @generated
	 */
	EReference getListboxType_Option();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getBind()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getBoundColumn <em>Bound Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getBoundColumn()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_BoundColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getControlImplementation()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDataField()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDisabled()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDropdown <em>Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropdown</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDropdown()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Dropdown();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getId()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSource <em>List Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSource()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_ListSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSourceType <em>List Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSourceType()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_ListSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getMultiple()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getName()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getPrintable()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getSize()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabIndex()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabStop()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTitle()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getXformsListSource <em>Xforms List Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xforms List Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getXformsListSource()
	 * @see #getListboxType()
	 * @generated
	 */
	EAttribute getListboxType_XformsListSource();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListPropertyType <em>List Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Property Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListPropertyType
	 * @generated
	 */
	EClass getListPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListPropertyType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListPropertyType#getPropertyName()
	 * @see #getListPropertyType()
	 * @generated
	 */
	EAttribute getListPropertyType_PropertyName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType <em>List Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType
	 * @generated
	 */
	EClass getListValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType#getDateValue()
	 * @see #getListValueType()
	 * @generated
	 */
	EAttribute getListValueType_DateValue();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1 <em>List Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1
	 * @generated
	 */
	EClass getListValueType1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1#getBooleanValue()
	 * @see #getListValueType1()
	 * @generated
	 */
	EAttribute getListValueType1_BooleanValue();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2 <em>List Value Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value Type2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2
	 * @generated
	 */
	EClass getListValueType2();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2#getStringValue()
	 * @see #getListValueType2()
	 * @generated
	 */
	EAttribute getListValueType2_StringValue();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3 <em>List Value Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value Type3</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3
	 * @generated
	 */
	EClass getListValueType3();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3#getTimeValue()
	 * @see #getListValueType3()
	 * @generated
	 */
	EAttribute getListValueType3_TimeValue();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4 <em>List Value Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value Type4</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4
	 * @generated
	 */
	EClass getListValueType4();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getCurrency()
	 * @see #getListValueType4()
	 * @generated
	 */
	EAttribute getListValueType4_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getValue()
	 * @see #getListValueType4()
	 * @generated
	 */
	EAttribute getListValueType4_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5 <em>List Value Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value Type5</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5
	 * @generated
	 */
	EClass getListValueType5();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5#getValue()
	 * @see #getListValueType5()
	 * @generated
	 */
	EAttribute getListValueType5_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType#getFormPropertyGroup <em>Form Property Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Form Property Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType#getFormPropertyGroup()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_FormPropertyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType#getFormProperty <em>Form Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Property</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType#getFormProperty()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_FormProperty();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Button</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButton()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Button();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCheckbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checkbox</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCheckbox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Checkbox();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCombobox <em>Combobox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combobox</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCombobox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Combobox();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConnectionResource <em>Connection Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Resource</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConnectionResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConnectionResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Date();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_File();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFixedText <em>Fixed Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFixedText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FixedText();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getForm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Form();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFormattedText <em>Formatted Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formatted Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFormattedText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FormattedText();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Frame();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getGenericControl <em>Generic Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getGenericControl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericControl();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getGrid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Grid();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hidden</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getHidden()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Hidden();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageFrame <em>Image Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImageFrame();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Item();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListbox <em>Listbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listbox</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListbox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Listbox();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListProperty <em>List Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Property</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Number();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Option();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPassword()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Password();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Radio</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getRadio()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Radio();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTextarea <em>Textarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textarea</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTextarea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Textarea();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Range</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValueRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueRange();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowDeletes <em>Allow Deletes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Deletes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowDeletes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AllowDeletes();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowInserts <em>Allow Inserts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Inserts</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowInserts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AllowInserts();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowUpdates <em>Allow Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Updates</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowUpdates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AllowUpdates();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyDesignMode <em>Apply Design Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply Design Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyDesignMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApplyDesignMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyFilter <em>Apply Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApplyFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutoComplete <em>Auto Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Complete</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutoComplete()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutoComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutomaticFocus <em>Automatic Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Focus</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutomaticFocus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutomaticFocus();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getBoundColumn <em>Bound Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Column</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getBoundColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BoundColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButtonType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ButtonType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommand()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommandType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CommandType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getControlImplementation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConvertEmptyToNull()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentSelected <em>Current Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Selected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentSelected()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrentSelected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDataField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datasource</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDatasource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Datasource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDefaultButton <em>Default Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Button</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDefaultButton()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DefaultButton();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDelayForRepeat <em>Delay For Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay For Repeat</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDelayForRepeat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DelayForRepeat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDetailFields <em>Detail Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Fields</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDetailFields()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DetailFields();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDisabled()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDropdown <em>Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropdown</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDropdown()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Dropdown();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEchoChar <em>Echo Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Echo Char</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEchoChar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EchoChar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEnctype <em>Enctype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enctype</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEnctype()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Enctype();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEscapeProcessing <em>Escape Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escape Processing</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEscapeProcessing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EscapeProcessing();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFocusOnClick <em>Focus On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus On Click</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFocusOnClick()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FocusOnClick();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_For();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIgnoreResult <em>Ignore Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Result</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIgnoreResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IgnoreResult();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageAlign <em>Image Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImageAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImageData();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImagePosition <em>Image Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImagePosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImagePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIsTristate <em>Is Tristate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tristate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIsTristate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsTristate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSource <em>List Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ListSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSourceType <em>List Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSourceType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ListSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMasterFields <em>Master Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Fields</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMasterFields()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MasterFields();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMaxLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiLine <em>Multi Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MultiLine();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiple()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNavigationMode <em>Navigation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNavigationMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NavigationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrientation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPageStepSize <em>Page Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Step Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPageStepSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PageStepSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPrintable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPropertyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getReadonly()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSelected()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Selected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_State();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getStepSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StepSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabCycle <em>Tab Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Cycle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabCycle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TabCycle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabIndex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabStop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTextStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getToggle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Toggle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValidation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Validation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getVisualEffect <em>Visual Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getVisualEffect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VisualEffect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXformsListSource <em>Xforms List Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xforms List Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXformsListSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_XformsListSource();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXformsSubmission <em>Xforms Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xforms Submission</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXformsSubmission()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_XformsSubmission();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType
	 * @generated
	 */
	EClass getNumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getBind()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getControlImplementation()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getConvertEmptyToNull()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getCurrentValue()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getDataField()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getDisabled()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getId()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getMaxLength()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getMaxValue()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getMinValue()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getName()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getPrintable()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getReadonly()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getTabIndex()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getTabStop()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getTitle()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.NumberType#getValue()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OptionType
	 * @generated
	 */
	EClass getOptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getMixed()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getCurrentSelected <em>Current Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Selected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getCurrentSelected()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_CurrentSelected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getLabel()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getSelected()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_Selected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OptionType#getValue()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType <em>Password Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType
	 * @generated
	 */
	EClass getPasswordType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getBind()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getControlImplementation()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getConvertEmptyToNull()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getDisabled()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getEchoChar <em>Echo Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Echo Char</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getEchoChar()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_EchoChar();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getId()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getMaxLength()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getName()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getPrintable()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getTabIndex()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getTabStop()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getTitle()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType#getValue()
	 * @see #getPasswordType()
	 * @generated
	 */
	EAttribute getPasswordType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getBooleanValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getCurrency()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getDateValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_DateValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getPropertyName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getStringValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getTimeValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_TimeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValueType()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType <em>Radio Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType
	 * @generated
	 */
	EClass getRadioType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getBind()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getControlImplementation()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getCurrentSelected <em>Current Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Selected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getCurrentSelected()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_CurrentSelected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getDataField()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getDisabled()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getId()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getImageAlign <em>Image Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getImageAlign()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_ImageAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getImagePosition <em>Image Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Position</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getImagePosition()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_ImagePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getLabel()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getName()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getPrintable()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getSelected()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Selected();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getTabIndex()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getTabStop()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getTitle()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getValue()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getVisualEffect <em>Visual Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.RadioType#getVisualEffect()
	 * @see #getRadioType()
	 * @generated
	 */
	EAttribute getRadioType_VisualEffect();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType <em>Textarea Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textarea Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType
	 * @generated
	 */
	EClass getTextareaType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getP()
	 * @see #getTextareaType()
	 * @generated
	 */
	EReference getTextareaType_P();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getBind()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getControlImplementation()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getConvertEmptyToNull()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getCurrentValue()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getDataField()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getDisabled()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getId()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getMaxLength()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getName()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getPrintable()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getReadonly()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getTabIndex()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getTabStop()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getTitle()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType#getValue()
	 * @see #getTextareaType()
	 * @generated
	 */
	EAttribute getTextareaType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType
	 * @generated
	 */
	EClass getTextType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getBind()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getControlImplementation()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getConvertEmptyToNull()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getCurrentValue()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getDataField()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getDisabled()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getId()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getMaxLength()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getName()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getPrintable()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getReadonly()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getTabIndex()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getTabStop()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getTitle()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TextType#getValue()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType
	 * @generated
	 */
	EClass getTimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getBind()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getControlImplementation()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getConvertEmptyToNull <em>Convert Empty To Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Empty To Null</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getConvertEmptyToNull()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_ConvertEmptyToNull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getCurrentValue()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Field</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getDataField()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_DataField();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getDisabled()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getId()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getMaxLength()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getMaxValue()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getMinValue()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getName()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getPrintable()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getReadonly()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getTabIndex()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getTabStop()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getTitle()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.TimeType#getValue()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Value();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType <em>Value Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Range Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType
	 * @generated
	 */
	EClass getValueRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getBind()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_Bind();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Implementation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getControlImplementation()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_ControlImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDelayForRepeat <em>Delay For Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay For Repeat</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDelayForRepeat()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_DelayForRepeat();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDisabled()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getId()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getMaxValue()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getMinValue()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getName()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getOrientation()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPageStepSize <em>Page Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Step Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPageStepSize()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_PageStepSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPrintable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPrintable()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_Printable();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getStepSize()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_StepSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabIndex()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_TabIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabStop <em>Tab Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stop</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabStop()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_TabStop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTitle()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getValue()
	 * @see #getValueRangeType()
	 * @generated
	 */
	EAttribute getValueRangeType_Value();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType <em>Command Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType
	 * @generated
	 */
	EEnum getCommandTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType <em>Image Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType
	 * @generated
	 */
	EEnum getImageAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType <em>Image Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Position Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType
	 * @generated
	 */
	EEnum getImagePositionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType <em>List Source Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Source Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType
	 * @generated
	 */
	EEnum getListSourceTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1 <em>Method Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1
	 * @generated
	 */
	EEnum getMethodTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2 <em>Method Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2
	 * @generated
	 */
	EEnum getMethodTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType
	 * @generated
	 */
	EEnum getOrientationType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType <em>Visual Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visual Effect Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType
	 * @generated
	 */
	EEnum getVisualEffectType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType <em>Command Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Command Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType"
	 *        extendedMetaData="name='command-type_._type:Object' baseType='command-type_._type'"
	 * @generated
	 */
	EDataType getCommandTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datasource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datasource Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datasource_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#anyURI urn:oasis:names:tc:opendocument:xmlns:text:1.0#string'"
	 * @generated
	 */
	EDataType getDatasourceType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType <em>Image Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType"
	 *        extendedMetaData="name='image-align_._type:Object' baseType='image-align_._type'"
	 * @generated
	 */
	EDataType getImageAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType <em>Image Position Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Position Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType"
	 *        extendedMetaData="name='image-position_._type:Object' baseType='image-position_._type'"
	 * @generated
	 */
	EDataType getImagePositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType <em>List Source Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Source Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType"
	 *        extendedMetaData="name='list-source-type_._type:Object' baseType='list-source-type_._type'"
	 * @generated
	 */
	EDataType getListSourceTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='method_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#string method_._type_._member_._1 method_._type_._member_._2'"
	 * @generated
	 */
	EDataType getMethodType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1 <em>Method Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1"
	 *        extendedMetaData="name='method_._type_._member_._1:Object' baseType='method_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMethodTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2 <em>Method Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2"
	 *        extendedMetaData="name='method_._type_._member_._2:Object' baseType='method_._type_._member_._2'"
	 * @generated
	 */
	EDataType getMethodTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType <em>Orientation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orientation Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType"
	 *        extendedMetaData="name='orientation_._type:Object' baseType='orientation_._type'"
	 * @generated
	 */
	EDataType getOrientationTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='text-style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef text-style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTextStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='text-style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getTextStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType <em>Visual Effect Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Visual Effect Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType"
	 *        extendedMetaData="name='visual-effect_._type:Object' baseType='visual-effect_._type'"
	 * @generated
	 */
	EDataType getVisualEffectTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormFactory getFormFactory();

} //FormPackage
