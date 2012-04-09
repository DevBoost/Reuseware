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
package org.oasisopen.names.tc.opendocument.xmlns.office;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficeFactory
 * @model kind="package"
 * @generated
 */
public interface OfficePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "office";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:office:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfoffice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OfficePackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getAnnotationType()
	 * @generated
	 */
	int ANNOTATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Date String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DATE_STRING = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__GROUP = 3;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__P = 4;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__LIST = 5;

	/**
	 * The feature id for the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANCHOR_PAGE_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Anchor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANCHOR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Caption Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__CAPTION_POINT_X = 8;

	/**
	 * The feature id for the '<em><b>Caption Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__CAPTION_POINT_Y = 9;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__CLASS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__CLASS_NAMES1 = 11;

	/**
	 * The feature id for the '<em><b>Corner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__CORNER_RADIUS = 12;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DISPLAY = 13;

	/**
	 * The feature id for the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__END_CELL_ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__END_X = 15;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__END_Y = 16;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__HEIGHT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ID = 18;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__LAYER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NAME = 20;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__STYLE_NAME = 21;

	/**
	 * The feature id for the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__STYLE_NAME1 = 22;

	/**
	 * The feature id for the '<em><b>Table Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__TABLE_BACKGROUND = 23;

	/**
	 * The feature id for the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__TEXT_STYLE_NAME = 24;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__TRANSFORM = 25;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__WIDTH = 26;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__X = 27;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__Y = 28;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ZINDEX = 29;

	/**
	 * The number of structural features of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl <em>Automatic Styles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getAutomaticStylesType()
	 * @generated
	 */
	int AUTOMATIC_STYLES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__STYLE = 1;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__LIST_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Number Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__NUMBER_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Currency Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Percentage Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Date Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__DATE_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Time Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__TIME_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Boolean Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__TEXT_STYLE = 9;

	/**
	 * The feature id for the '<em><b>Page Layout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT = 10;

	/**
	 * The number of structural features of the '<em>Automatic Styles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_STYLES_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ChangeInfoTypeImpl <em>Change Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.ChangeInfoTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getChangeInfoType()
	 * @generated
	 */
	int CHANGE_INFO_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFO_TYPE__CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFO_TYPE__DATE = 1;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFO_TYPE__P = 2;

	/**
	 * The number of structural features of the '<em>Change Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ChartTypeImpl <em>Chart Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.ChartTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getChartType()
	 * @generated
	 */
	int CHART_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__VARIABLE_DECLS = 0;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__SEQUENCE_DECLS = 1;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__USER_FIELD_DECLS = 2;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__DDE_CONNECTION_DECLS = 3;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = 4;

	/**
	 * The feature id for the '<em><b>Calculation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__CALCULATION_SETTINGS = 5;

	/**
	 * The feature id for the '<em><b>Content Validations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__CONTENT_VALIDATIONS = 6;

	/**
	 * The feature id for the '<em><b>Label Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__LABEL_RANGES = 7;

	/**
	 * The feature id for the '<em><b>Office Chart Content Main Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__OFFICE_CHART_CONTENT_MAIN_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Office Chart Content Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__OFFICE_CHART_CONTENT_MAIN = 9;

	/**
	 * The feature id for the '<em><b>Named Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__NAMED_EXPRESSIONS = 10;

	/**
	 * The feature id for the '<em><b>Database Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__DATABASE_RANGES = 11;

	/**
	 * The feature id for the '<em><b>Data Pilot Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__DATA_PILOT_TABLES = 12;

	/**
	 * The feature id for the '<em><b>Consolidation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__CONSOLIDATION = 13;

	/**
	 * The feature id for the '<em><b>Dde Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__DDE_LINKS = 14;

	/**
	 * The number of structural features of the '<em>Chart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl <em>Document Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentContentType()
	 * @generated
	 */
	int DOCUMENT_CONTENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTENT_TYPE__SCRIPTS = 0;

	/**
	 * The feature id for the '<em><b>Font Face Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS = 1;

	/**
	 * The feature id for the '<em><b>Automatic Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTENT_TYPE__BODY = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTENT_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Document Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentMetaTypeImpl <em>Document Meta Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentMetaTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentMetaType()
	 * @generated
	 */
	int DOCUMENT_META_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_META_TYPE__META = TextPackage.OFFICE_META__META;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_META_TYPE__VERSION = TextPackage.OFFICE_META_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document Meta Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_META_TYPE_FEATURE_COUNT = TextPackage.OFFICE_META_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentSettingsTypeImpl <em>Document Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentSettingsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentSettingsType()
	 * @generated
	 */
	int DOCUMENT_SETTINGS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SETTINGS_TYPE__SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SETTINGS_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Document Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SETTINGS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl <em>Document Styles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentStylesType()
	 * @generated
	 */
	int DOCUMENT_STYLES_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Font Face Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS = 0;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STYLES_TYPE__STYLES = 1;

	/**
	 * The feature id for the '<em><b>Automatic Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES = 2;

	/**
	 * The feature id for the '<em><b>Master Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STYLES_TYPE__MASTER_STYLES = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STYLES_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Document Styles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STYLES_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentTypeImpl <em>Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__META = TextPackage.OFFICE_META__META;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SETTINGS = TextPackage.OFFICE_META_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SCRIPTS = TextPackage.OFFICE_META_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Face Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__FONT_FACE_DECLS = TextPackage.OFFICE_META_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__STYLES = TextPackage.OFFICE_META_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Automatic Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__AUTOMATIC_STYLES = TextPackage.OFFICE_META_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Master Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__MASTER_STYLES = TextPackage.OFFICE_META_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__BODY = TextPackage.OFFICE_META_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__MIMETYPE = TextPackage.OFFICE_META_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__VERSION = TextPackage.OFFICE_META_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = TextPackage.OFFICE_META_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DrawingTypeImpl <em>Drawing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DrawingTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDrawingType()
	 * @generated
	 */
	int DRAWING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__VARIABLE_DECLS = 0;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__SEQUENCE_DECLS = 1;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__USER_FIELD_DECLS = 2;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__DDE_CONNECTION_DECLS = 3;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = 4;

	/**
	 * The feature id for the '<em><b>Calculation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__CALCULATION_SETTINGS = 5;

	/**
	 * The feature id for the '<em><b>Content Validations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__CONTENT_VALIDATIONS = 6;

	/**
	 * The feature id for the '<em><b>Label Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__LABEL_RANGES = 7;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__PAGE = 8;

	/**
	 * The feature id for the '<em><b>Named Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__NAMED_EXPRESSIONS = 9;

	/**
	 * The feature id for the '<em><b>Database Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__DATABASE_RANGES = 10;

	/**
	 * The feature id for the '<em><b>Data Pilot Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__DATA_PILOT_TABLES = 11;

	/**
	 * The feature id for the '<em><b>Consolidation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__CONSOLIDATION = 12;

	/**
	 * The feature id for the '<em><b>Dde Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE__DDE_LINKS = 13;

	/**
	 * The number of structural features of the '<em>Drawing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.EventListenersTypeImpl <em>Event Listeners Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.EventListenersTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getEventListenersType()
	 * @generated
	 */
	int EVENT_LISTENERS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENERS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Event Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENERS_TYPE__EVENT_LISTENER = 1;

	/**
	 * The feature id for the '<em><b>Event Listener1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENERS_TYPE__EVENT_LISTENER1 = 2;

	/**
	 * The number of structural features of the '<em>Event Listeners Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENERS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FontFaceDeclsTypeImpl <em>Font Face Decls Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.FontFaceDeclsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getFontFaceDeclsType()
	 * @generated
	 */
	int FONT_FACE_DECLS_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Font Face</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_DECLS_TYPE__FONT_FACE = 0;

	/**
	 * The number of structural features of the '<em>Font Face Decls Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FACE_DECLS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl <em>Forms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getFormsType()
	 * @generated
	 */
	int FORMS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMS_TYPE__FORM = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMS_TYPE__MODEL = 2;

	/**
	 * The feature id for the '<em><b>Apply Design Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMS_TYPE__APPLY_DESIGN_MODE = 3;

	/**
	 * The feature id for the '<em><b>Automatic Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMS_TYPE__AUTOMATIC_FOCUS = 4;

	/**
	 * The number of structural features of the '<em>Forms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.MasterStylesTypeImpl <em>Master Styles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.MasterStylesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getMasterStylesType()
	 * @generated
	 */
	int MASTER_STYLES_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_STYLES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Master Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_STYLES_TYPE__MASTER_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Handout Master</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_STYLES_TYPE__HANDOUT_MASTER = 2;

	/**
	 * The feature id for the '<em><b>Layer Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_STYLES_TYPE__LAYER_SET = 3;

	/**
	 * The number of structural features of the '<em>Master Styles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_STYLES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.PresentationTypeImpl <em>Presentation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.PresentationTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getPresentationType()
	 * @generated
	 */
	int PRESENTATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__VARIABLE_DECLS = 0;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__SEQUENCE_DECLS = 1;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__USER_FIELD_DECLS = 2;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__DDE_CONNECTION_DECLS = 3;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = 4;

	/**
	 * The feature id for the '<em><b>Calculation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__CALCULATION_SETTINGS = 5;

	/**
	 * The feature id for the '<em><b>Content Validations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__CONTENT_VALIDATIONS = 6;

	/**
	 * The feature id for the '<em><b>Label Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__LABEL_RANGES = 7;

	/**
	 * The feature id for the '<em><b>Presentation Decl Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__PRESENTATION_DECL_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Presentation Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__PRESENTATION_DECL = 9;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__PAGE = 10;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__SETTINGS = 11;

	/**
	 * The feature id for the '<em><b>Named Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__NAMED_EXPRESSIONS = 12;

	/**
	 * The feature id for the '<em><b>Database Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__DATABASE_RANGES = 13;

	/**
	 * The feature id for the '<em><b>Data Pilot Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__DATA_PILOT_TABLES = 14;

	/**
	 * The feature id for the '<em><b>Consolidation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__CONSOLIDATION = 15;

	/**
	 * The feature id for the '<em><b>Dde Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__DDE_LINKS = 16;

	/**
	 * The number of structural features of the '<em>Presentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptsTypeImpl <em>Scripts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getScriptsType()
	 * @generated
	 */
	int SCRIPTS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTS_TYPE__SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTS_TYPE__EVENT_LISTENERS = 1;

	/**
	 * The number of structural features of the '<em>Scripts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptTypeImpl <em>Script Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getScriptType()
	 * @generated
	 */
	int SCRIPT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Script Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SettingsTypeImpl <em>Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.SettingsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getSettingsType()
	 * @generated
	 */
	int SETTINGS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Config Item Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__CONFIG_ITEM_SET = 0;

	/**
	 * The number of structural features of the '<em>Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl <em>Spreadsheet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getSpreadsheetType()
	 * @generated
	 */
	int SPREADSHEET_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__TRACKED_CHANGES = 0;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__VARIABLE_DECLS = 1;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__SEQUENCE_DECLS = 2;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__USER_FIELD_DECLS = 3;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__DDE_CONNECTION_DECLS = 4;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = 5;

	/**
	 * The feature id for the '<em><b>Calculation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__CALCULATION_SETTINGS = 6;

	/**
	 * The feature id for the '<em><b>Content Validations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__CONTENT_VALIDATIONS = 7;

	/**
	 * The feature id for the '<em><b>Label Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__LABEL_RANGES = 8;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__TABLE = 9;

	/**
	 * The feature id for the '<em><b>Named Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__NAMED_EXPRESSIONS = 10;

	/**
	 * The feature id for the '<em><b>Database Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__DATABASE_RANGES = 11;

	/**
	 * The feature id for the '<em><b>Data Pilot Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__DATA_PILOT_TABLES = 12;

	/**
	 * The feature id for the '<em><b>Consolidation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__CONSOLIDATION = 13;

	/**
	 * The feature id for the '<em><b>Dde Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__DDE_LINKS = 14;

	/**
	 * The feature id for the '<em><b>Protection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__PROTECTION_KEY = 15;

	/**
	 * The feature id for the '<em><b>Structure Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE__STRUCTURE_PROTECTED = 16;

	/**
	 * The number of structural features of the '<em>Spreadsheet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl <em>Styles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getStylesType()
	 * @generated
	 */
	int STYLES_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__STYLE = 1;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__LIST_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Number Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__NUMBER_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Currency Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__CURRENCY_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Percentage Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__PERCENTAGE_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Date Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__DATE_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Time Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__TIME_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Boolean Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__BOOLEAN_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__TEXT_STYLE = 9;

	/**
	 * The feature id for the '<em><b>Default Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__DEFAULT_STYLE = 10;

	/**
	 * The feature id for the '<em><b>Outline Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__OUTLINE_STYLE = 11;

	/**
	 * The feature id for the '<em><b>Notes Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__NOTES_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Bibliography Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Linenumbering Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__LINENUMBERING_CONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__GRADIENT = 15;

	/**
	 * The feature id for the '<em><b>Linear Gradient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__LINEAR_GRADIENT = 16;

	/**
	 * The feature id for the '<em><b>Radial Gradient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__RADIAL_GRADIENT = 17;

	/**
	 * The feature id for the '<em><b>Hatch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__HATCH = 18;

	/**
	 * The feature id for the '<em><b>Fill Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__FILL_IMAGE = 19;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__MARKER = 20;

	/**
	 * The feature id for the '<em><b>Stroke Dash</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__STROKE_DASH = 21;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__OPACITY = 22;

	/**
	 * The feature id for the '<em><b>Presentation Page Layout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE__PRESENTATION_PAGE_LAYOUT = 23;

	/**
	 * The number of structural features of the '<em>Styles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_TYPE_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl <em>Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__FORMS = 0;

	/**
	 * The feature id for the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TRACKED_CHANGES = 1;

	/**
	 * The feature id for the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__VARIABLE_DECLS = 2;

	/**
	 * The feature id for the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__SEQUENCE_DECLS = 3;

	/**
	 * The feature id for the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__USER_FIELD_DECLS = 4;

	/**
	 * The feature id for the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__DDE_CONNECTION_DECLS = 5;

	/**
	 * The feature id for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = 6;

	/**
	 * The feature id for the '<em><b>Calculation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CALCULATION_SETTINGS = 7;

	/**
	 * The feature id for the '<em><b>Content Validations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CONTENT_VALIDATIONS = 8;

	/**
	 * The feature id for the '<em><b>Label Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__LABEL_RANGES = 9;

	/**
	 * The feature id for the '<em><b>Office Text Content Main</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN = 10;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__H = 11;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__P = 12;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__LIST = 13;

	/**
	 * The feature id for the '<em><b>Numbered Paragraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__NUMBERED_PARAGRAPH = 14;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TABLE = 15;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__A = 16;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__SECTION = 17;

	/**
	 * The feature id for the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__SOFT_PAGE_BREAK = 18;

	/**
	 * The feature id for the '<em><b>Table Of Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TABLE_OF_CONTENT = 19;

	/**
	 * The feature id for the '<em><b>Illustration Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ILLUSTRATION_INDEX = 20;

	/**
	 * The feature id for the '<em><b>Table Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TABLE_INDEX = 21;

	/**
	 * The feature id for the '<em><b>Object Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__OBJECT_INDEX = 22;

	/**
	 * The feature id for the '<em><b>User Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__USER_INDEX = 23;

	/**
	 * The feature id for the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ALPHABETICAL_INDEX = 24;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__BIBLIOGRAPHY = 25;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__RECT = 26;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__LINE = 27;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__POLYLINE = 28;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__POLYGON = 29;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__REGULAR_POLYGON = 30;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__PATH = 31;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CIRCLE = 32;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ELLIPSE = 33;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__G = 34;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__PAGE_THUMBNAIL = 35;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__FRAME = 36;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__MEASURE = 37;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CAPTION = 38;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CONNECTOR = 39;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CONTROL = 40;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__SCENE = 41;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CUSTOM_SHAPE = 42;

	/**
	 * The feature id for the '<em><b>Change Marks Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CHANGE_MARKS_GROUP = 43;

	/**
	 * The feature id for the '<em><b>Change Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CHANGE_MARKS = 44;

	/**
	 * The feature id for the '<em><b>Page Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__PAGE_SEQUENCE = 45;

	/**
	 * The feature id for the '<em><b>A1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__A1 = 46;

	/**
	 * The feature id for the '<em><b>Rect1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__RECT1 = 47;

	/**
	 * The feature id for the '<em><b>Line1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__LINE1 = 48;

	/**
	 * The feature id for the '<em><b>Polyline1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__POLYLINE1 = 49;

	/**
	 * The feature id for the '<em><b>Polygon1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__POLYGON1 = 50;

	/**
	 * The feature id for the '<em><b>Regular Polygon1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__REGULAR_POLYGON1 = 51;

	/**
	 * The feature id for the '<em><b>Path1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__PATH1 = 52;

	/**
	 * The feature id for the '<em><b>Circle1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CIRCLE1 = 53;

	/**
	 * The feature id for the '<em><b>Ellipse1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ELLIPSE1 = 54;

	/**
	 * The feature id for the '<em><b>G1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__G1 = 55;

	/**
	 * The feature id for the '<em><b>Page Thumbnail1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__PAGE_THUMBNAIL1 = 56;

	/**
	 * The feature id for the '<em><b>Frame1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__FRAME1 = 57;

	/**
	 * The feature id for the '<em><b>Measure1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__MEASURE1 = 58;

	/**
	 * The feature id for the '<em><b>Caption1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CAPTION1 = 59;

	/**
	 * The feature id for the '<em><b>Connector1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CONNECTOR1 = 60;

	/**
	 * The feature id for the '<em><b>Control1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CONTROL1 = 61;

	/**
	 * The feature id for the '<em><b>Scene1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__SCENE1 = 62;

	/**
	 * The feature id for the '<em><b>Custom Shape1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CUSTOM_SHAPE1 = 63;

	/**
	 * The feature id for the '<em><b>Named Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__NAMED_EXPRESSIONS = 64;

	/**
	 * The feature id for the '<em><b>Database Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__DATABASE_RANGES = 65;

	/**
	 * The feature id for the '<em><b>Data Pilot Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__DATA_PILOT_TABLES = 66;

	/**
	 * The feature id for the '<em><b>Consolidation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CONSOLIDATION = 67;

	/**
	 * The feature id for the '<em><b>Dde Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__DDE_LINKS = 68;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__GLOBAL = 69;

	/**
	 * The feature id for the '<em><b>Use Soft Page Breaks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__USE_SOFT_PAGE_BREAKS = 70;

	/**
	 * The number of structural features of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_FEATURE_COUNT = 71;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 21;

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
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Automatic Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTOMATIC_STYLES = 4;

	/**
	 * The feature id for the '<em><b>Binary Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINARY_DATA = 5;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BODY = 6;

	/**
	 * The feature id for the '<em><b>Change Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_INFO = 7;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHART = 8;

	/**
	 * The feature id for the '<em><b>Dde Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DDE_SOURCE = 9;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT = 10;

	/**
	 * The feature id for the '<em><b>Document Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Document Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_META = 12;

	/**
	 * The feature id for the '<em><b>Document Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_SETTINGS = 13;

	/**
	 * The feature id for the '<em><b>Document Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_STYLES = 14;

	/**
	 * The feature id for the '<em><b>Drawing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DRAWING = 15;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_LISTENERS = 16;

	/**
	 * The feature id for the '<em><b>Font Face Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FACE_DECLS = 17;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMS = 18;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE = 19;

	/**
	 * The feature id for the '<em><b>Master Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_STYLES = 20;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__META = 21;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRESENTATION = 22;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCRIPT = 23;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCRIPTS = 24;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SETTINGS = 25;

	/**
	 * The feature id for the '<em><b>Spreadsheet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPREADSHEET = 26;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLES = 27;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT = 28;

	/**
	 * The feature id for the '<em><b>Automatic Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTOMATIC_UPDATE = 29;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN_VALUE = 30;

	/**
	 * The feature id for the '<em><b>Conversion Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONVERSION_MODE = 31;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY = 32;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Dde Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DDE_APPLICATION = 34;

	/**
	 * The feature id for the '<em><b>Dde Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DDE_ITEM = 35;

	/**
	 * The feature id for the '<em><b>Dde Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DDE_TOPIC = 36;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY = 37;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIMETYPE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 39;

	/**
	 * The feature id for the '<em><b>Process Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESS_CONTENT = 40;

	/**
	 * The feature id for the '<em><b>Server Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVER_MAP = 41;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_VALUE = 42;

	/**
	 * The feature id for the '<em><b>Target Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_FRAME = 43;

	/**
	 * The feature id for the '<em><b>Target Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_FRAME_NAME = 44;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_VALUE = 45;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 47;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERSION = 48;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 49;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType <em>Conversion Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getConversionModeType()
	 * @generated
	 */
	int CONVERSION_MODE_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType <em>Value Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getValueTypeType()
	 * @generated
	 */
	int VALUE_TYPE_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1 <em>Value Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getValueTypeType1()
	 * @generated
	 */
	int VALUE_TYPE_TYPE1 = 24;

	/**
	 * The meta object id for the '<em>Conversion Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getConversionModeTypeObject()
	 * @generated
	 */
	int CONVERSION_MODE_TYPE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Value Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getValueTypeTypeObject()
	 * @generated
	 */
	int VALUE_TYPE_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Value Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getValueTypeTypeObject1()
	 * @generated
	 */
	int VALUE_TYPE_TYPE_OBJECT1 = 27;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType
	 * @generated
	 */
	EClass getAnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getCreator()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Creator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getDate()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getDateString <em>Date String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date String</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getDateString()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_DateString();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getGroup()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getP()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getList()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_List();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getAnchorPageNumber <em>Anchor Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getAnchorPageNumber()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_AnchorPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getAnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getAnchorType()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_AnchorType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getCaptionPointX <em>Caption Point X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Point X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getCaptionPointX()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_CaptionPointX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getCaptionPointY <em>Caption Point Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Point Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getCaptionPointY()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_CaptionPointY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getClassNames()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getClassNames1 <em>Class Names1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getClassNames1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_ClassNames1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getCornerRadius <em>Corner Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Radius</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getCornerRadius()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_CornerRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getDisplay()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getEndCellAddress <em>End Cell Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cell Address</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getEndCellAddress()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_EndCellAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getEndX()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getEndY()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getHeight()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getId()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getLayer()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getName()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getStyleName()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getStyleName1 <em>Style Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getStyleName1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_StyleName1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getTableBackground <em>Table Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Background</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getTableBackground()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_TableBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getTextStyleName <em>Text Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getTextStyleName()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_TextStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getTransform()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getWidth()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getX()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getY()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType#getZIndex()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_ZIndex();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType <em>Automatic Styles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automatic Styles Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType
	 * @generated
	 */
	EClass getAutomaticStylesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getGroup()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EAttribute getAutomaticStylesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getListStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_ListStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getNumberStyle <em>Number Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Number Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getNumberStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_NumberStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getCurrencyStyle <em>Currency Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getCurrencyStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_CurrencyStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getPercentageStyle <em>Percentage Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percentage Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getPercentageStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_PercentageStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getDateStyle <em>Date Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getDateStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_DateStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getTimeStyle <em>Time Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getTimeStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_TimeStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getBooleanStyle <em>Boolean Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getBooleanStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_BooleanStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getTextStyle()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_TextStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getPageLayout <em>Page Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Layout</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getPageLayout()
	 * @see #getAutomaticStylesType()
	 * @generated
	 */
	EReference getAutomaticStylesType_PageLayout();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType <em>Change Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Info Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType
	 * @generated
	 */
	EClass getChangeInfoType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType#getCreator()
	 * @see #getChangeInfoType()
	 * @generated
	 */
	EAttribute getChangeInfoType_Creator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType#getDate()
	 * @see #getChangeInfoType()
	 * @generated
	 */
	EAttribute getChangeInfoType_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType#getP()
	 * @see #getChangeInfoType()
	 * @generated
	 */
	EReference getChangeInfoType_P();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType
	 * @generated
	 */
	EClass getChartType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getVariableDecls <em>Variable Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getVariableDecls()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_VariableDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getSequenceDecls <em>Sequence Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getSequenceDecls()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_SequenceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getUserFieldDecls <em>User Field Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Field Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getUserFieldDecls()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_UserFieldDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDdeConnectionDecls <em>Dde Connection Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Connection Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDdeConnectionDecls()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_DdeConnectionDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alphabetical Index Auto Mark File</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getAlphabeticalIndexAutoMarkFile()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_AlphabeticalIndexAutoMarkFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getCalculationSettings <em>Calculation Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculation Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getCalculationSettings()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_CalculationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getContentValidations <em>Content Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Validations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getContentValidations()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_ContentValidations();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getLabelRanges <em>Label Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getLabelRanges()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_LabelRanges();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getOfficeChartContentMainGroup <em>Office Chart Content Main Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Office Chart Content Main Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getOfficeChartContentMainGroup()
	 * @see #getChartType()
	 * @generated
	 */
	EAttribute getChartType_OfficeChartContentMainGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getOfficeChartContentMain <em>Office Chart Content Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Office Chart Content Main</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getOfficeChartContentMain()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_OfficeChartContentMain();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getNamedExpressions <em>Named Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Expressions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getNamedExpressions()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_NamedExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDatabaseRanges <em>Database Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDatabaseRanges()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_DatabaseRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDataPilotTables <em>Data Pilot Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Tables</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDataPilotTables()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_DataPilotTables();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getConsolidation <em>Consolidation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consolidation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getConsolidation()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_Consolidation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDdeLinks <em>Dde Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Links</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDdeLinks()
	 * @see #getChartType()
	 * @generated
	 */
	EReference getChartType_DdeLinks();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType <em>Document Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Content Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType
	 * @generated
	 */
	EClass getDocumentContentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scripts</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getScripts()
	 * @see #getDocumentContentType()
	 * @generated
	 */
	EReference getDocumentContentType_Scripts();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getFontFaceDecls <em>Font Face Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getFontFaceDecls()
	 * @see #getDocumentContentType()
	 * @generated
	 */
	EReference getDocumentContentType_FontFaceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getAutomaticStyles <em>Automatic Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automatic Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getAutomaticStyles()
	 * @see #getDocumentContentType()
	 * @generated
	 */
	EReference getDocumentContentType_AutomaticStyles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getBody()
	 * @see #getDocumentContentType()
	 * @generated
	 */
	EReference getDocumentContentType_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType#getVersion()
	 * @see #getDocumentContentType()
	 * @generated
	 */
	EAttribute getDocumentContentType_Version();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentMetaType <em>Document Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Meta Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentMetaType
	 * @generated
	 */
	EClass getDocumentMetaType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentMetaType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentMetaType#getVersion()
	 * @see #getDocumentMetaType()
	 * @generated
	 */
	EAttribute getDocumentMetaType_Version();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentSettingsType <em>Document Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Settings Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentSettingsType
	 * @generated
	 */
	EClass getDocumentSettingsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentSettingsType#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentSettingsType#getSettings()
	 * @see #getDocumentSettingsType()
	 * @generated
	 */
	EReference getDocumentSettingsType_Settings();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentSettingsType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentSettingsType#getVersion()
	 * @see #getDocumentSettingsType()
	 * @generated
	 */
	EAttribute getDocumentSettingsType_Version();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType <em>Document Styles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Styles Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType
	 * @generated
	 */
	EClass getDocumentStylesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getFontFaceDecls <em>Font Face Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getFontFaceDecls()
	 * @see #getDocumentStylesType()
	 * @generated
	 */
	EReference getDocumentStylesType_FontFaceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getStyles()
	 * @see #getDocumentStylesType()
	 * @generated
	 */
	EReference getDocumentStylesType_Styles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getAutomaticStyles <em>Automatic Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automatic Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getAutomaticStyles()
	 * @see #getDocumentStylesType()
	 * @generated
	 */
	EReference getDocumentStylesType_AutomaticStyles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getMasterStyles <em>Master Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getMasterStyles()
	 * @see #getDocumentStylesType()
	 * @generated
	 */
	EReference getDocumentStylesType_MasterStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType#getVersion()
	 * @see #getDocumentStylesType()
	 * @generated
	 */
	EAttribute getDocumentStylesType_Version();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType
	 * @generated
	 */
	EClass getDocumentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getSettings()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scripts</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getScripts()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_Scripts();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getFontFaceDecls <em>Font Face Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getFontFaceDecls()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_FontFaceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getStyles()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_Styles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getAutomaticStyles <em>Automatic Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automatic Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getAutomaticStyles()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_AutomaticStyles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getMasterStyles <em>Master Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getMasterStyles()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_MasterStyles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getBody()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getMimetype()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_Mimetype();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType#getVersion()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_Version();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType <em>Drawing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawing Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType
	 * @generated
	 */
	EClass getDrawingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getVariableDecls <em>Variable Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getVariableDecls()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_VariableDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getSequenceDecls <em>Sequence Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getSequenceDecls()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_SequenceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getUserFieldDecls <em>User Field Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Field Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getUserFieldDecls()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_UserFieldDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getDdeConnectionDecls <em>Dde Connection Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Connection Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getDdeConnectionDecls()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_DdeConnectionDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alphabetical Index Auto Mark File</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getAlphabeticalIndexAutoMarkFile()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_AlphabeticalIndexAutoMarkFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getCalculationSettings <em>Calculation Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculation Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getCalculationSettings()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_CalculationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getContentValidations <em>Content Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Validations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getContentValidations()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_ContentValidations();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getLabelRanges <em>Label Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getLabelRanges()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_LabelRanges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getPage()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_Page();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getNamedExpressions <em>Named Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Expressions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getNamedExpressions()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_NamedExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getDatabaseRanges <em>Database Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getDatabaseRanges()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_DatabaseRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getDataPilotTables <em>Data Pilot Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Tables</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getDataPilotTables()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_DataPilotTables();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getConsolidation <em>Consolidation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consolidation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getConsolidation()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_Consolidation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getDdeLinks <em>Dde Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Links</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType#getDdeLinks()
	 * @see #getDrawingType()
	 * @generated
	 */
	EReference getDrawingType_DdeLinks();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType <em>Event Listeners Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Listeners Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType
	 * @generated
	 */
	EClass getEventListenersType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getGroup()
	 * @see #getEventListenersType()
	 * @generated
	 */
	EAttribute getEventListenersType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getEventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Listener</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getEventListener()
	 * @see #getEventListenersType()
	 * @generated
	 */
	EReference getEventListenersType_EventListener();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getEventListener1 <em>Event Listener1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Listener1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getEventListener1()
	 * @see #getEventListenersType()
	 * @generated
	 */
	EReference getEventListenersType_EventListener1();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType <em>Font Face Decls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Face Decls Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType
	 * @generated
	 */
	EClass getFontFaceDeclsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType#getFontFace <em>Font Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font Face</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType#getFontFace()
	 * @see #getFontFaceDeclsType()
	 * @generated
	 */
	EReference getFontFaceDeclsType_FontFace();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType <em>Forms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forms Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.FormsType
	 * @generated
	 */
	EClass getFormsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getGroup()
	 * @see #getFormsType()
	 * @generated
	 */
	EAttribute getFormsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getForm()
	 * @see #getFormsType()
	 * @generated
	 */
	EReference getFormsType_Form();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getModel()
	 * @see #getFormsType()
	 * @generated
	 */
	EReference getFormsType_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getApplyDesignMode <em>Apply Design Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply Design Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getApplyDesignMode()
	 * @see #getFormsType()
	 * @generated
	 */
	EAttribute getFormsType_ApplyDesignMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getAutomaticFocus <em>Automatic Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Focus</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getAutomaticFocus()
	 * @see #getFormsType()
	 * @generated
	 */
	EAttribute getFormsType_AutomaticFocus();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType <em>Master Styles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Styles Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType
	 * @generated
	 */
	EClass getMasterStylesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getGroup()
	 * @see #getMasterStylesType()
	 * @generated
	 */
	EAttribute getMasterStylesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getMasterPage <em>Master Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Master Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getMasterPage()
	 * @see #getMasterStylesType()
	 * @generated
	 */
	EReference getMasterStylesType_MasterPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getHandoutMaster <em>Handout Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handout Master</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getHandoutMaster()
	 * @see #getMasterStylesType()
	 * @generated
	 */
	EReference getMasterStylesType_HandoutMaster();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getLayerSet <em>Layer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layer Set</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getLayerSet()
	 * @see #getMasterStylesType()
	 * @generated
	 */
	EReference getMasterStylesType_LayerSet();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType <em>Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType
	 * @generated
	 */
	EClass getPresentationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getVariableDecls <em>Variable Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getVariableDecls()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_VariableDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getSequenceDecls <em>Sequence Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getSequenceDecls()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_SequenceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getUserFieldDecls <em>User Field Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Field Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getUserFieldDecls()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_UserFieldDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getDdeConnectionDecls <em>Dde Connection Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Connection Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getDdeConnectionDecls()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_DdeConnectionDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alphabetical Index Auto Mark File</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getAlphabeticalIndexAutoMarkFile()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_AlphabeticalIndexAutoMarkFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getCalculationSettings <em>Calculation Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculation Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getCalculationSettings()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_CalculationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getContentValidations <em>Content Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Validations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getContentValidations()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_ContentValidations();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getLabelRanges <em>Label Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getLabelRanges()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_LabelRanges();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getPresentationDeclGroup <em>Presentation Decl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Presentation Decl Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getPresentationDeclGroup()
	 * @see #getPresentationType()
	 * @generated
	 */
	EAttribute getPresentationType_PresentationDeclGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getPresentationDecl <em>Presentation Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentation Decl</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getPresentationDecl()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_PresentationDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getPage()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_Page();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getSettings()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getNamedExpressions <em>Named Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Expressions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getNamedExpressions()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_NamedExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getDatabaseRanges <em>Database Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getDatabaseRanges()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_DatabaseRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getDataPilotTables <em>Data Pilot Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Tables</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getDataPilotTables()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_DataPilotTables();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getConsolidation <em>Consolidation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consolidation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getConsolidation()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_Consolidation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getDdeLinks <em>Dde Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Links</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType#getDdeLinks()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_DdeLinks();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType <em>Scripts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripts Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType
	 * @generated
	 */
	EClass getScriptsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType#getScript()
	 * @see #getScriptsType()
	 * @generated
	 */
	EReference getScriptsType_Script();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType#getEventListeners()
	 * @see #getScriptsType()
	 * @generated
	 */
	EReference getScriptsType_EventListeners();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType
	 * @generated
	 */
	EClass getScriptType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType#getMixed()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType#getAny()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType#getLanguage()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Language();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType <em>Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType
	 * @generated
	 */
	EClass getSettingsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType#getConfigItemSet <em>Config Item Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Item Set</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType#getConfigItemSet()
	 * @see #getSettingsType()
	 * @generated
	 */
	EReference getSettingsType_ConfigItemSet();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType <em>Spreadsheet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType
	 * @generated
	 */
	EClass getSpreadsheetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getTrackedChanges <em>Tracked Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tracked Changes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getTrackedChanges()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_TrackedChanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getVariableDecls <em>Variable Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getVariableDecls()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_VariableDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getSequenceDecls <em>Sequence Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getSequenceDecls()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_SequenceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getUserFieldDecls <em>User Field Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Field Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getUserFieldDecls()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_UserFieldDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDdeConnectionDecls <em>Dde Connection Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Connection Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDdeConnectionDecls()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_DdeConnectionDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alphabetical Index Auto Mark File</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getAlphabeticalIndexAutoMarkFile()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_AlphabeticalIndexAutoMarkFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getCalculationSettings <em>Calculation Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculation Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getCalculationSettings()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_CalculationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getContentValidations <em>Content Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Validations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getContentValidations()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_ContentValidations();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getLabelRanges <em>Label Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getLabelRanges()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_LabelRanges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getTable()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_Table();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getNamedExpressions <em>Named Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Expressions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getNamedExpressions()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_NamedExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDatabaseRanges <em>Database Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDatabaseRanges()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_DatabaseRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDataPilotTables <em>Data Pilot Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Tables</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDataPilotTables()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_DataPilotTables();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getConsolidation <em>Consolidation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consolidation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getConsolidation()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_Consolidation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDdeLinks <em>Dde Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Links</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDdeLinks()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EReference getSpreadsheetType_DdeLinks();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getProtectionKey <em>Protection Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protection Key</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getProtectionKey()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EAttribute getSpreadsheetType_ProtectionKey();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getStructureProtected <em>Structure Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Protected</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getStructureProtected()
	 * @see #getSpreadsheetType()
	 * @generated
	 */
	EAttribute getSpreadsheetType_StructureProtected();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType <em>Styles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styles Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType
	 * @generated
	 */
	EClass getStylesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getGroup()
	 * @see #getStylesType()
	 * @generated
	 */
	EAttribute getStylesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getListStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_ListStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getNumberStyle <em>Number Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Number Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getNumberStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_NumberStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getCurrencyStyle <em>Currency Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getCurrencyStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_CurrencyStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getPercentageStyle <em>Percentage Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percentage Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getPercentageStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_PercentageStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getDateStyle <em>Date Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getDateStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_DateStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getTimeStyle <em>Time Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getTimeStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_TimeStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getBooleanStyle <em>Boolean Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getBooleanStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_BooleanStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getTextStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_TextStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getDefaultStyle <em>Default Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getDefaultStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_DefaultStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getOutlineStyle <em>Outline Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outline Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getOutlineStyle()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_OutlineStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getNotesConfiguration <em>Notes Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes Configuration</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getNotesConfiguration()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_NotesConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getBibliographyConfiguration <em>Bibliography Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bibliography Configuration</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getBibliographyConfiguration()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_BibliographyConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getLinenumberingConfiguration <em>Linenumbering Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linenumbering Configuration</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getLinenumberingConfiguration()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_LinenumberingConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getGradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gradient</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getGradient()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_Gradient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getLinearGradient <em>Linear Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linear Gradient</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getLinearGradient()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_LinearGradient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getRadialGradient <em>Radial Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Radial Gradient</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getRadialGradient()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_RadialGradient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getHatch <em>Hatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hatch</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getHatch()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_Hatch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getFillImage <em>Fill Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fill Image</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getFillImage()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_FillImage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marker</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getMarker()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_Marker();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getStrokeDash <em>Stroke Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stroke Dash</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getStrokeDash()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_StrokeDash();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opacity</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getOpacity()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_Opacity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getPresentationPageLayout <em>Presentation Page Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentation Page Layout</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getPresentationPageLayout()
	 * @see #getStylesType()
	 * @generated
	 */
	EReference getStylesType_PresentationPageLayout();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType
	 * @generated
	 */
	EClass getTextType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forms</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getForms()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Forms();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getTrackedChanges <em>Tracked Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tracked Changes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getTrackedChanges()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_TrackedChanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getVariableDecls <em>Variable Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getVariableDecls()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_VariableDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getSequenceDecls <em>Sequence Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getSequenceDecls()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_SequenceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getUserFieldDecls <em>User Field Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Field Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getUserFieldDecls()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_UserFieldDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getDdeConnectionDecls <em>Dde Connection Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Connection Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getDdeConnectionDecls()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_DdeConnectionDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alphabetical Index Auto Mark File</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getAlphabeticalIndexAutoMarkFile()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_AlphabeticalIndexAutoMarkFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCalculationSettings <em>Calculation Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculation Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCalculationSettings()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_CalculationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getContentValidations <em>Content Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Validations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getContentValidations()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_ContentValidations();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getLabelRanges <em>Label Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getLabelRanges()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_LabelRanges();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getOfficeTextContentMain <em>Office Text Content Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Office Text Content Main</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getOfficeTextContentMain()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_OfficeTextContentMain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getH()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_H();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getP()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getList()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getNumberedParagraph <em>Numbered Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Numbered Paragraph</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getNumberedParagraph()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_NumberedParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getTable()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getA()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getSection()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Section();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getSoftPageBreak <em>Soft Page Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Page Break</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getSoftPageBreak()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_SoftPageBreak();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getTableOfContent <em>Table Of Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Of Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getTableOfContent()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_TableOfContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getIllustrationIndex <em>Illustration Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Illustration Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getIllustrationIndex()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_IllustrationIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getTableIndex <em>Table Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getTableIndex()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_TableIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getObjectIndex <em>Object Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getObjectIndex()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_ObjectIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getUserIndex <em>User Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getUserIndex()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_UserIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getAlphabeticalIndex <em>Alphabetical Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alphabetical Index</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getAlphabeticalIndex()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_AlphabeticalIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getBibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bibliography</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getBibliography()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Bibliography();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getRect()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Rect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getLine()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPolyline()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Polyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPolygon()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getRegularPolygon()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPath()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCircle()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getEllipse()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getG()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_G();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPageThumbnail()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getFrame()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getMeasure()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCaption()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getConnector()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getControl()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getScene()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCustomShape()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_CustomShape();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getChangeMarksGroup <em>Change Marks Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Change Marks Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getChangeMarksGroup()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_ChangeMarksGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getChangeMarks <em>Change Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Marks</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getChangeMarks()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_ChangeMarks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPageSequence <em>Page Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Sequence</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPageSequence()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_PageSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getA1 <em>A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getA1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_A1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getRect1 <em>Rect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getRect1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Rect1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getLine1 <em>Line1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getLine1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Line1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPolyline1 <em>Polyline1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPolyline1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Polyline1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPolygon1 <em>Polygon1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPolygon1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Polygon1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getRegularPolygon1 <em>Regular Polygon1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getRegularPolygon1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_RegularPolygon1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPath1 <em>Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPath1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Path1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCircle1 <em>Circle1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCircle1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Circle1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getEllipse1 <em>Ellipse1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getEllipse1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Ellipse1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getG1 <em>G1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getG1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_G1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPageThumbnail1 <em>Page Thumbnail1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getPageThumbnail1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_PageThumbnail1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getFrame1 <em>Frame1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getFrame1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Frame1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getMeasure1 <em>Measure1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getMeasure1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Measure1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCaption1 <em>Caption1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCaption1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Caption1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getConnector1 <em>Connector1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getConnector1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Connector1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getControl1 <em>Control1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getControl1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Control1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getScene1 <em>Scene1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getScene1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Scene1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCustomShape1 <em>Custom Shape1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getCustomShape1()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_CustomShape1();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getNamedExpressions <em>Named Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Expressions</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getNamedExpressions()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_NamedExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getDatabaseRanges <em>Database Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Ranges</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getDatabaseRanges()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_DatabaseRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getDataPilotTables <em>Data Pilot Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Pilot Tables</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getDataPilotTables()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_DataPilotTables();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getConsolidation <em>Consolidation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consolidation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getConsolidation()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Consolidation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getDdeLinks <em>Dde Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Links</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getDdeLinks()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_DdeLinks();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getGlobal()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Global();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getUseSoftPageBreaks <em>Use Soft Page Breaks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Soft Page Breaks</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.TextType#getUseSoftPageBreaks()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_UseSoftPageBreaks();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getAutomaticStyles <em>Automatic Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automatic Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getAutomaticStyles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AutomaticStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getBinaryData <em>Binary Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Data</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getBinaryData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BinaryData();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getChangeInfo <em>Change Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Info</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getChangeInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getChart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Chart();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDdeSource <em>Dde Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dde Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDdeSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DdeSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Document();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocumentContent <em>Document Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocumentContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocumentContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocumentMeta <em>Document Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Meta</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocumentMeta()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocumentMeta();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocumentSettings <em>Document Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocumentSettings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocumentSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocumentStyles <em>Document Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDocumentStyles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocumentStyles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDrawing <em>Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drawing</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDrawing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Drawing();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listeners</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getEventListeners()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EventListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getFontFaceDecls <em>Font Face Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Face Decls</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getFontFaceDecls()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FontFaceDecls();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forms</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getForms()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Forms();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getMasterStyles <em>Master Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getMasterStyles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MasterStyles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getMeta()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Meta();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getPresentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Presentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getScript()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Script();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scripts</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getScripts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scripts();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getSettings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getSpreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spreadsheet</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getSpreadsheet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Spreadsheet();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Styles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getStyles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Styles();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getAutomaticUpdate <em>Automatic Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Update</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getAutomaticUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutomaticUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getBooleanValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getConversionMode <em>Conversion Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getConversionMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConversionMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getCurrency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDateValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DateValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDdeApplication <em>Dde Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dde Application</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDdeApplication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DdeApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDdeItem <em>Dde Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dde Item</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDdeItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DdeItem();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDdeTopic <em>Dde Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dde Topic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDdeTopic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DdeTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getDisplay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getMimetype()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mimetype();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getProcessContent <em>Process Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Content</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getProcessContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProcessContent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getServerMap <em>Server Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getServerMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServerMap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getStringValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getTargetFrame <em>Target Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getTargetFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TargetFrame();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getTargetFrameName <em>Target Frame Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getTargetFrameName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TargetFrameName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getTimeValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TimeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot#getVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Version();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType <em>Conversion Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conversion Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType
	 * @generated
	 */
	EEnum getConversionModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType <em>Value Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
	 * @generated
	 */
	EEnum getValueTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1 <em>Value Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1
	 * @generated
	 */
	EEnum getValueTypeType1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType <em>Conversion Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conversion Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType"
	 *        extendedMetaData="name='conversion-mode_._type:Object' baseType='conversion-mode_._type'"
	 * @generated
	 */
	EDataType getConversionModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType <em>Value Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType"
	 *        extendedMetaData="name='value-type_._1_._type:Object' baseType='value-type_._1_._type'"
	 * @generated
	 */
	EDataType getValueTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1 <em>Value Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Type Type Object1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1"
	 *        extendedMetaData="name='value-type_._type:Object' baseType='value-type_._type'"
	 * @generated
	 */
	EDataType getValueTypeTypeObject1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OfficeFactory getOfficeFactory();

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
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.AnnotationTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getAnnotationType()
		 * @generated
		 */
		EClass ANNOTATION_TYPE = eINSTANCE.getAnnotationType();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__CREATOR = eINSTANCE.getAnnotationType_Creator();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__DATE = eINSTANCE.getAnnotationType_Date();

		/**
		 * The meta object literal for the '<em><b>Date String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__DATE_STRING = eINSTANCE.getAnnotationType_DateString();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__GROUP = eINSTANCE.getAnnotationType_Group();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE__P = eINSTANCE.getAnnotationType_P();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE__LIST = eINSTANCE.getAnnotationType_List();

		/**
		 * The meta object literal for the '<em><b>Anchor Page Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__ANCHOR_PAGE_NUMBER = eINSTANCE.getAnnotationType_AnchorPageNumber();

		/**
		 * The meta object literal for the '<em><b>Anchor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__ANCHOR_TYPE = eINSTANCE.getAnnotationType_AnchorType();

		/**
		 * The meta object literal for the '<em><b>Caption Point X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__CAPTION_POINT_X = eINSTANCE.getAnnotationType_CaptionPointX();

		/**
		 * The meta object literal for the '<em><b>Caption Point Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__CAPTION_POINT_Y = eINSTANCE.getAnnotationType_CaptionPointY();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__CLASS_NAMES = eINSTANCE.getAnnotationType_ClassNames();

		/**
		 * The meta object literal for the '<em><b>Class Names1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__CLASS_NAMES1 = eINSTANCE.getAnnotationType_ClassNames1();

		/**
		 * The meta object literal for the '<em><b>Corner Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__CORNER_RADIUS = eINSTANCE.getAnnotationType_CornerRadius();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__DISPLAY = eINSTANCE.getAnnotationType_Display();

		/**
		 * The meta object literal for the '<em><b>End Cell Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__END_CELL_ADDRESS = eINSTANCE.getAnnotationType_EndCellAddress();

		/**
		 * The meta object literal for the '<em><b>End X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__END_X = eINSTANCE.getAnnotationType_EndX();

		/**
		 * The meta object literal for the '<em><b>End Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__END_Y = eINSTANCE.getAnnotationType_EndY();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__HEIGHT = eINSTANCE.getAnnotationType_Height();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__ID = eINSTANCE.getAnnotationType_Id();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__LAYER = eINSTANCE.getAnnotationType_Layer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__NAME = eINSTANCE.getAnnotationType_Name();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__STYLE_NAME = eINSTANCE.getAnnotationType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Style Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__STYLE_NAME1 = eINSTANCE.getAnnotationType_StyleName1();

		/**
		 * The meta object literal for the '<em><b>Table Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__TABLE_BACKGROUND = eINSTANCE.getAnnotationType_TableBackground();

		/**
		 * The meta object literal for the '<em><b>Text Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__TEXT_STYLE_NAME = eINSTANCE.getAnnotationType_TextStyleName();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__TRANSFORM = eINSTANCE.getAnnotationType_Transform();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__WIDTH = eINSTANCE.getAnnotationType_Width();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__X = eINSTANCE.getAnnotationType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__Y = eINSTANCE.getAnnotationType_Y();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__ZINDEX = eINSTANCE.getAnnotationType_ZIndex();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl <em>Automatic Styles Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getAutomaticStylesType()
		 * @generated
		 */
		EClass AUTOMATIC_STYLES_TYPE = eINSTANCE.getAutomaticStylesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_STYLES_TYPE__GROUP = eINSTANCE.getAutomaticStylesType_Group();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__STYLE = eINSTANCE.getAutomaticStylesType_Style();

		/**
		 * The meta object literal for the '<em><b>List Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__LIST_STYLE = eINSTANCE.getAutomaticStylesType_ListStyle();

		/**
		 * The meta object literal for the '<em><b>Number Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__NUMBER_STYLE = eINSTANCE.getAutomaticStylesType_NumberStyle();

		/**
		 * The meta object literal for the '<em><b>Currency Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE = eINSTANCE.getAutomaticStylesType_CurrencyStyle();

		/**
		 * The meta object literal for the '<em><b>Percentage Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE = eINSTANCE.getAutomaticStylesType_PercentageStyle();

		/**
		 * The meta object literal for the '<em><b>Date Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__DATE_STYLE = eINSTANCE.getAutomaticStylesType_DateStyle();

		/**
		 * The meta object literal for the '<em><b>Time Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__TIME_STYLE = eINSTANCE.getAutomaticStylesType_TimeStyle();

		/**
		 * The meta object literal for the '<em><b>Boolean Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE = eINSTANCE.getAutomaticStylesType_BooleanStyle();

		/**
		 * The meta object literal for the '<em><b>Text Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__TEXT_STYLE = eINSTANCE.getAutomaticStylesType_TextStyle();

		/**
		 * The meta object literal for the '<em><b>Page Layout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT = eINSTANCE.getAutomaticStylesType_PageLayout();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ChangeInfoTypeImpl <em>Change Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.ChangeInfoTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getChangeInfoType()
		 * @generated
		 */
		EClass CHANGE_INFO_TYPE = eINSTANCE.getChangeInfoType();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_INFO_TYPE__CREATOR = eINSTANCE.getChangeInfoType_Creator();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_INFO_TYPE__DATE = eINSTANCE.getChangeInfoType_Date();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_INFO_TYPE__P = eINSTANCE.getChangeInfoType_P();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ChartTypeImpl <em>Chart Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.ChartTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getChartType()
		 * @generated
		 */
		EClass CHART_TYPE = eINSTANCE.getChartType();

		/**
		 * The meta object literal for the '<em><b>Variable Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__VARIABLE_DECLS = eINSTANCE.getChartType_VariableDecls();

		/**
		 * The meta object literal for the '<em><b>Sequence Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__SEQUENCE_DECLS = eINSTANCE.getChartType_SequenceDecls();

		/**
		 * The meta object literal for the '<em><b>User Field Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__USER_FIELD_DECLS = eINSTANCE.getChartType_UserFieldDecls();

		/**
		 * The meta object literal for the '<em><b>Dde Connection Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__DDE_CONNECTION_DECLS = eINSTANCE.getChartType_DdeConnectionDecls();

		/**
		 * The meta object literal for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = eINSTANCE.getChartType_AlphabeticalIndexAutoMarkFile();

		/**
		 * The meta object literal for the '<em><b>Calculation Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__CALCULATION_SETTINGS = eINSTANCE.getChartType_CalculationSettings();

		/**
		 * The meta object literal for the '<em><b>Content Validations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__CONTENT_VALIDATIONS = eINSTANCE.getChartType_ContentValidations();

		/**
		 * The meta object literal for the '<em><b>Label Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__LABEL_RANGES = eINSTANCE.getChartType_LabelRanges();

		/**
		 * The meta object literal for the '<em><b>Office Chart Content Main Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_TYPE__OFFICE_CHART_CONTENT_MAIN_GROUP = eINSTANCE.getChartType_OfficeChartContentMainGroup();

		/**
		 * The meta object literal for the '<em><b>Office Chart Content Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__OFFICE_CHART_CONTENT_MAIN = eINSTANCE.getChartType_OfficeChartContentMain();

		/**
		 * The meta object literal for the '<em><b>Named Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__NAMED_EXPRESSIONS = eINSTANCE.getChartType_NamedExpressions();

		/**
		 * The meta object literal for the '<em><b>Database Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__DATABASE_RANGES = eINSTANCE.getChartType_DatabaseRanges();

		/**
		 * The meta object literal for the '<em><b>Data Pilot Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__DATA_PILOT_TABLES = eINSTANCE.getChartType_DataPilotTables();

		/**
		 * The meta object literal for the '<em><b>Consolidation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__CONSOLIDATION = eINSTANCE.getChartType_Consolidation();

		/**
		 * The meta object literal for the '<em><b>Dde Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_TYPE__DDE_LINKS = eINSTANCE.getChartType_DdeLinks();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl <em>Document Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentContentType()
		 * @generated
		 */
		EClass DOCUMENT_CONTENT_TYPE = eINSTANCE.getDocumentContentType();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_CONTENT_TYPE__SCRIPTS = eINSTANCE.getDocumentContentType_Scripts();

		/**
		 * The meta object literal for the '<em><b>Font Face Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS = eINSTANCE.getDocumentContentType_FontFaceDecls();

		/**
		 * The meta object literal for the '<em><b>Automatic Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES = eINSTANCE.getDocumentContentType_AutomaticStyles();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_CONTENT_TYPE__BODY = eINSTANCE.getDocumentContentType_Body();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_CONTENT_TYPE__VERSION = eINSTANCE.getDocumentContentType_Version();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentMetaTypeImpl <em>Document Meta Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentMetaTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentMetaType()
		 * @generated
		 */
		EClass DOCUMENT_META_TYPE = eINSTANCE.getDocumentMetaType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_META_TYPE__VERSION = eINSTANCE.getDocumentMetaType_Version();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentSettingsTypeImpl <em>Document Settings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentSettingsTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentSettingsType()
		 * @generated
		 */
		EClass DOCUMENT_SETTINGS_TYPE = eINSTANCE.getDocumentSettingsType();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_SETTINGS_TYPE__SETTINGS = eINSTANCE.getDocumentSettingsType_Settings();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_SETTINGS_TYPE__VERSION = eINSTANCE.getDocumentSettingsType_Version();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl <em>Document Styles Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentStylesType()
		 * @generated
		 */
		EClass DOCUMENT_STYLES_TYPE = eINSTANCE.getDocumentStylesType();

		/**
		 * The meta object literal for the '<em><b>Font Face Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS = eINSTANCE.getDocumentStylesType_FontFaceDecls();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_STYLES_TYPE__STYLES = eINSTANCE.getDocumentStylesType_Styles();

		/**
		 * The meta object literal for the '<em><b>Automatic Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES = eINSTANCE.getDocumentStylesType_AutomaticStyles();

		/**
		 * The meta object literal for the '<em><b>Master Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_STYLES_TYPE__MASTER_STYLES = eINSTANCE.getDocumentStylesType_MasterStyles();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STYLES_TYPE__VERSION = eINSTANCE.getDocumentStylesType_Version();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentTypeImpl <em>Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentType()
		 * @generated
		 */
		EClass DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__SETTINGS = eINSTANCE.getDocumentType_Settings();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__SCRIPTS = eINSTANCE.getDocumentType_Scripts();

		/**
		 * The meta object literal for the '<em><b>Font Face Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__FONT_FACE_DECLS = eINSTANCE.getDocumentType_FontFaceDecls();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__STYLES = eINSTANCE.getDocumentType_Styles();

		/**
		 * The meta object literal for the '<em><b>Automatic Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__AUTOMATIC_STYLES = eINSTANCE.getDocumentType_AutomaticStyles();

		/**
		 * The meta object literal for the '<em><b>Master Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__MASTER_STYLES = eINSTANCE.getDocumentType_MasterStyles();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__BODY = eINSTANCE.getDocumentType_Body();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__MIMETYPE = eINSTANCE.getDocumentType_Mimetype();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__VERSION = eINSTANCE.getDocumentType_Version();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DrawingTypeImpl <em>Drawing Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DrawingTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDrawingType()
		 * @generated
		 */
		EClass DRAWING_TYPE = eINSTANCE.getDrawingType();

		/**
		 * The meta object literal for the '<em><b>Variable Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__VARIABLE_DECLS = eINSTANCE.getDrawingType_VariableDecls();

		/**
		 * The meta object literal for the '<em><b>Sequence Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__SEQUENCE_DECLS = eINSTANCE.getDrawingType_SequenceDecls();

		/**
		 * The meta object literal for the '<em><b>User Field Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__USER_FIELD_DECLS = eINSTANCE.getDrawingType_UserFieldDecls();

		/**
		 * The meta object literal for the '<em><b>Dde Connection Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__DDE_CONNECTION_DECLS = eINSTANCE.getDrawingType_DdeConnectionDecls();

		/**
		 * The meta object literal for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = eINSTANCE.getDrawingType_AlphabeticalIndexAutoMarkFile();

		/**
		 * The meta object literal for the '<em><b>Calculation Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__CALCULATION_SETTINGS = eINSTANCE.getDrawingType_CalculationSettings();

		/**
		 * The meta object literal for the '<em><b>Content Validations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__CONTENT_VALIDATIONS = eINSTANCE.getDrawingType_ContentValidations();

		/**
		 * The meta object literal for the '<em><b>Label Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__LABEL_RANGES = eINSTANCE.getDrawingType_LabelRanges();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__PAGE = eINSTANCE.getDrawingType_Page();

		/**
		 * The meta object literal for the '<em><b>Named Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__NAMED_EXPRESSIONS = eINSTANCE.getDrawingType_NamedExpressions();

		/**
		 * The meta object literal for the '<em><b>Database Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__DATABASE_RANGES = eINSTANCE.getDrawingType_DatabaseRanges();

		/**
		 * The meta object literal for the '<em><b>Data Pilot Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__DATA_PILOT_TABLES = eINSTANCE.getDrawingType_DataPilotTables();

		/**
		 * The meta object literal for the '<em><b>Consolidation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__CONSOLIDATION = eINSTANCE.getDrawingType_Consolidation();

		/**
		 * The meta object literal for the '<em><b>Dde Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_TYPE__DDE_LINKS = eINSTANCE.getDrawingType_DdeLinks();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.EventListenersTypeImpl <em>Event Listeners Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.EventListenersTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getEventListenersType()
		 * @generated
		 */
		EClass EVENT_LISTENERS_TYPE = eINSTANCE.getEventListenersType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENERS_TYPE__GROUP = eINSTANCE.getEventListenersType_Group();

		/**
		 * The meta object literal for the '<em><b>Event Listener</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LISTENERS_TYPE__EVENT_LISTENER = eINSTANCE.getEventListenersType_EventListener();

		/**
		 * The meta object literal for the '<em><b>Event Listener1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LISTENERS_TYPE__EVENT_LISTENER1 = eINSTANCE.getEventListenersType_EventListener1();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FontFaceDeclsTypeImpl <em>Font Face Decls Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.FontFaceDeclsTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getFontFaceDeclsType()
		 * @generated
		 */
		EClass FONT_FACE_DECLS_TYPE = eINSTANCE.getFontFaceDeclsType();

		/**
		 * The meta object literal for the '<em><b>Font Face</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONT_FACE_DECLS_TYPE__FONT_FACE = eINSTANCE.getFontFaceDeclsType_FontFace();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl <em>Forms Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getFormsType()
		 * @generated
		 */
		EClass FORMS_TYPE = eINSTANCE.getFormsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMS_TYPE__GROUP = eINSTANCE.getFormsType_Group();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMS_TYPE__FORM = eINSTANCE.getFormsType_Form();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMS_TYPE__MODEL = eINSTANCE.getFormsType_Model();

		/**
		 * The meta object literal for the '<em><b>Apply Design Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMS_TYPE__APPLY_DESIGN_MODE = eINSTANCE.getFormsType_ApplyDesignMode();

		/**
		 * The meta object literal for the '<em><b>Automatic Focus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMS_TYPE__AUTOMATIC_FOCUS = eINSTANCE.getFormsType_AutomaticFocus();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.MasterStylesTypeImpl <em>Master Styles Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.MasterStylesTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getMasterStylesType()
		 * @generated
		 */
		EClass MASTER_STYLES_TYPE = eINSTANCE.getMasterStylesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_STYLES_TYPE__GROUP = eINSTANCE.getMasterStylesType_Group();

		/**
		 * The meta object literal for the '<em><b>Master Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_STYLES_TYPE__MASTER_PAGE = eINSTANCE.getMasterStylesType_MasterPage();

		/**
		 * The meta object literal for the '<em><b>Handout Master</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_STYLES_TYPE__HANDOUT_MASTER = eINSTANCE.getMasterStylesType_HandoutMaster();

		/**
		 * The meta object literal for the '<em><b>Layer Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_STYLES_TYPE__LAYER_SET = eINSTANCE.getMasterStylesType_LayerSet();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.PresentationTypeImpl <em>Presentation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.PresentationTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getPresentationType()
		 * @generated
		 */
		EClass PRESENTATION_TYPE = eINSTANCE.getPresentationType();

		/**
		 * The meta object literal for the '<em><b>Variable Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__VARIABLE_DECLS = eINSTANCE.getPresentationType_VariableDecls();

		/**
		 * The meta object literal for the '<em><b>Sequence Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__SEQUENCE_DECLS = eINSTANCE.getPresentationType_SequenceDecls();

		/**
		 * The meta object literal for the '<em><b>User Field Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__USER_FIELD_DECLS = eINSTANCE.getPresentationType_UserFieldDecls();

		/**
		 * The meta object literal for the '<em><b>Dde Connection Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__DDE_CONNECTION_DECLS = eINSTANCE.getPresentationType_DdeConnectionDecls();

		/**
		 * The meta object literal for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = eINSTANCE.getPresentationType_AlphabeticalIndexAutoMarkFile();

		/**
		 * The meta object literal for the '<em><b>Calculation Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__CALCULATION_SETTINGS = eINSTANCE.getPresentationType_CalculationSettings();

		/**
		 * The meta object literal for the '<em><b>Content Validations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__CONTENT_VALIDATIONS = eINSTANCE.getPresentationType_ContentValidations();

		/**
		 * The meta object literal for the '<em><b>Label Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__LABEL_RANGES = eINSTANCE.getPresentationType_LabelRanges();

		/**
		 * The meta object literal for the '<em><b>Presentation Decl Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_TYPE__PRESENTATION_DECL_GROUP = eINSTANCE.getPresentationType_PresentationDeclGroup();

		/**
		 * The meta object literal for the '<em><b>Presentation Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__PRESENTATION_DECL = eINSTANCE.getPresentationType_PresentationDecl();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__PAGE = eINSTANCE.getPresentationType_Page();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__SETTINGS = eINSTANCE.getPresentationType_Settings();

		/**
		 * The meta object literal for the '<em><b>Named Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__NAMED_EXPRESSIONS = eINSTANCE.getPresentationType_NamedExpressions();

		/**
		 * The meta object literal for the '<em><b>Database Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__DATABASE_RANGES = eINSTANCE.getPresentationType_DatabaseRanges();

		/**
		 * The meta object literal for the '<em><b>Data Pilot Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__DATA_PILOT_TABLES = eINSTANCE.getPresentationType_DataPilotTables();

		/**
		 * The meta object literal for the '<em><b>Consolidation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__CONSOLIDATION = eINSTANCE.getPresentationType_Consolidation();

		/**
		 * The meta object literal for the '<em><b>Dde Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__DDE_LINKS = eINSTANCE.getPresentationType_DdeLinks();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptsTypeImpl <em>Scripts Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptsTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getScriptsType()
		 * @generated
		 */
		EClass SCRIPTS_TYPE = eINSTANCE.getScriptsType();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTS_TYPE__SCRIPT = eINSTANCE.getScriptsType_Script();

		/**
		 * The meta object literal for the '<em><b>Event Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTS_TYPE__EVENT_LISTENERS = eINSTANCE.getScriptsType_EventListeners();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptTypeImpl <em>Script Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getScriptType()
		 * @generated
		 */
		EClass SCRIPT_TYPE = eINSTANCE.getScriptType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__MIXED = eINSTANCE.getScriptType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__ANY = eINSTANCE.getScriptType_Any();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__LANGUAGE = eINSTANCE.getScriptType_Language();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SettingsTypeImpl <em>Settings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.SettingsTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getSettingsType()
		 * @generated
		 */
		EClass SETTINGS_TYPE = eINSTANCE.getSettingsType();

		/**
		 * The meta object literal for the '<em><b>Config Item Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS_TYPE__CONFIG_ITEM_SET = eINSTANCE.getSettingsType_ConfigItemSet();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl <em>Spreadsheet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getSpreadsheetType()
		 * @generated
		 */
		EClass SPREADSHEET_TYPE = eINSTANCE.getSpreadsheetType();

		/**
		 * The meta object literal for the '<em><b>Tracked Changes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__TRACKED_CHANGES = eINSTANCE.getSpreadsheetType_TrackedChanges();

		/**
		 * The meta object literal for the '<em><b>Variable Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__VARIABLE_DECLS = eINSTANCE.getSpreadsheetType_VariableDecls();

		/**
		 * The meta object literal for the '<em><b>Sequence Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__SEQUENCE_DECLS = eINSTANCE.getSpreadsheetType_SequenceDecls();

		/**
		 * The meta object literal for the '<em><b>User Field Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__USER_FIELD_DECLS = eINSTANCE.getSpreadsheetType_UserFieldDecls();

		/**
		 * The meta object literal for the '<em><b>Dde Connection Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__DDE_CONNECTION_DECLS = eINSTANCE.getSpreadsheetType_DdeConnectionDecls();

		/**
		 * The meta object literal for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = eINSTANCE.getSpreadsheetType_AlphabeticalIndexAutoMarkFile();

		/**
		 * The meta object literal for the '<em><b>Calculation Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__CALCULATION_SETTINGS = eINSTANCE.getSpreadsheetType_CalculationSettings();

		/**
		 * The meta object literal for the '<em><b>Content Validations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__CONTENT_VALIDATIONS = eINSTANCE.getSpreadsheetType_ContentValidations();

		/**
		 * The meta object literal for the '<em><b>Label Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__LABEL_RANGES = eINSTANCE.getSpreadsheetType_LabelRanges();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__TABLE = eINSTANCE.getSpreadsheetType_Table();

		/**
		 * The meta object literal for the '<em><b>Named Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__NAMED_EXPRESSIONS = eINSTANCE.getSpreadsheetType_NamedExpressions();

		/**
		 * The meta object literal for the '<em><b>Database Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__DATABASE_RANGES = eINSTANCE.getSpreadsheetType_DatabaseRanges();

		/**
		 * The meta object literal for the '<em><b>Data Pilot Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__DATA_PILOT_TABLES = eINSTANCE.getSpreadsheetType_DataPilotTables();

		/**
		 * The meta object literal for the '<em><b>Consolidation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__CONSOLIDATION = eINSTANCE.getSpreadsheetType_Consolidation();

		/**
		 * The meta object literal for the '<em><b>Dde Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_TYPE__DDE_LINKS = eINSTANCE.getSpreadsheetType_DdeLinks();

		/**
		 * The meta object literal for the '<em><b>Protection Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_TYPE__PROTECTION_KEY = eINSTANCE.getSpreadsheetType_ProtectionKey();

		/**
		 * The meta object literal for the '<em><b>Structure Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_TYPE__STRUCTURE_PROTECTED = eINSTANCE.getSpreadsheetType_StructureProtected();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl <em>Styles Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getStylesType()
		 * @generated
		 */
		EClass STYLES_TYPE = eINSTANCE.getStylesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLES_TYPE__GROUP = eINSTANCE.getStylesType_Group();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__STYLE = eINSTANCE.getStylesType_Style();

		/**
		 * The meta object literal for the '<em><b>List Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__LIST_STYLE = eINSTANCE.getStylesType_ListStyle();

		/**
		 * The meta object literal for the '<em><b>Number Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__NUMBER_STYLE = eINSTANCE.getStylesType_NumberStyle();

		/**
		 * The meta object literal for the '<em><b>Currency Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__CURRENCY_STYLE = eINSTANCE.getStylesType_CurrencyStyle();

		/**
		 * The meta object literal for the '<em><b>Percentage Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__PERCENTAGE_STYLE = eINSTANCE.getStylesType_PercentageStyle();

		/**
		 * The meta object literal for the '<em><b>Date Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__DATE_STYLE = eINSTANCE.getStylesType_DateStyle();

		/**
		 * The meta object literal for the '<em><b>Time Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__TIME_STYLE = eINSTANCE.getStylesType_TimeStyle();

		/**
		 * The meta object literal for the '<em><b>Boolean Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__BOOLEAN_STYLE = eINSTANCE.getStylesType_BooleanStyle();

		/**
		 * The meta object literal for the '<em><b>Text Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__TEXT_STYLE = eINSTANCE.getStylesType_TextStyle();

		/**
		 * The meta object literal for the '<em><b>Default Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__DEFAULT_STYLE = eINSTANCE.getStylesType_DefaultStyle();

		/**
		 * The meta object literal for the '<em><b>Outline Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__OUTLINE_STYLE = eINSTANCE.getStylesType_OutlineStyle();

		/**
		 * The meta object literal for the '<em><b>Notes Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__NOTES_CONFIGURATION = eINSTANCE.getStylesType_NotesConfiguration();

		/**
		 * The meta object literal for the '<em><b>Bibliography Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION = eINSTANCE.getStylesType_BibliographyConfiguration();

		/**
		 * The meta object literal for the '<em><b>Linenumbering Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__LINENUMBERING_CONFIGURATION = eINSTANCE.getStylesType_LinenumberingConfiguration();

		/**
		 * The meta object literal for the '<em><b>Gradient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__GRADIENT = eINSTANCE.getStylesType_Gradient();

		/**
		 * The meta object literal for the '<em><b>Linear Gradient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__LINEAR_GRADIENT = eINSTANCE.getStylesType_LinearGradient();

		/**
		 * The meta object literal for the '<em><b>Radial Gradient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__RADIAL_GRADIENT = eINSTANCE.getStylesType_RadialGradient();

		/**
		 * The meta object literal for the '<em><b>Hatch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__HATCH = eINSTANCE.getStylesType_Hatch();

		/**
		 * The meta object literal for the '<em><b>Fill Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__FILL_IMAGE = eINSTANCE.getStylesType_FillImage();

		/**
		 * The meta object literal for the '<em><b>Marker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__MARKER = eINSTANCE.getStylesType_Marker();

		/**
		 * The meta object literal for the '<em><b>Stroke Dash</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__STROKE_DASH = eINSTANCE.getStylesType_StrokeDash();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__OPACITY = eINSTANCE.getStylesType_Opacity();

		/**
		 * The meta object literal for the '<em><b>Presentation Page Layout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_TYPE__PRESENTATION_PAGE_LAYOUT = eINSTANCE.getStylesType_PresentationPageLayout();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl <em>Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getTextType()
		 * @generated
		 */
		EClass TEXT_TYPE = eINSTANCE.getTextType();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__FORMS = eINSTANCE.getTextType_Forms();

		/**
		 * The meta object literal for the '<em><b>Tracked Changes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__TRACKED_CHANGES = eINSTANCE.getTextType_TrackedChanges();

		/**
		 * The meta object literal for the '<em><b>Variable Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__VARIABLE_DECLS = eINSTANCE.getTextType_VariableDecls();

		/**
		 * The meta object literal for the '<em><b>Sequence Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__SEQUENCE_DECLS = eINSTANCE.getTextType_SequenceDecls();

		/**
		 * The meta object literal for the '<em><b>User Field Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__USER_FIELD_DECLS = eINSTANCE.getTextType_UserFieldDecls();

		/**
		 * The meta object literal for the '<em><b>Dde Connection Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__DDE_CONNECTION_DECLS = eINSTANCE.getTextType_DdeConnectionDecls();

		/**
		 * The meta object literal for the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE = eINSTANCE.getTextType_AlphabeticalIndexAutoMarkFile();

		/**
		 * The meta object literal for the '<em><b>Calculation Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CALCULATION_SETTINGS = eINSTANCE.getTextType_CalculationSettings();

		/**
		 * The meta object literal for the '<em><b>Content Validations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CONTENT_VALIDATIONS = eINSTANCE.getTextType_ContentValidations();

		/**
		 * The meta object literal for the '<em><b>Label Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__LABEL_RANGES = eINSTANCE.getTextType_LabelRanges();

		/**
		 * The meta object literal for the '<em><b>Office Text Content Main</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN = eINSTANCE.getTextType_OfficeTextContentMain();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__H = eINSTANCE.getTextType_H();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__P = eINSTANCE.getTextType_P();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__LIST = eINSTANCE.getTextType_List();

		/**
		 * The meta object literal for the '<em><b>Numbered Paragraph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__NUMBERED_PARAGRAPH = eINSTANCE.getTextType_NumberedParagraph();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__TABLE = eINSTANCE.getTextType_Table();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__A = eINSTANCE.getTextType_A();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__SECTION = eINSTANCE.getTextType_Section();

		/**
		 * The meta object literal for the '<em><b>Soft Page Break</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__SOFT_PAGE_BREAK = eINSTANCE.getTextType_SoftPageBreak();

		/**
		 * The meta object literal for the '<em><b>Table Of Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__TABLE_OF_CONTENT = eINSTANCE.getTextType_TableOfContent();

		/**
		 * The meta object literal for the '<em><b>Illustration Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__ILLUSTRATION_INDEX = eINSTANCE.getTextType_IllustrationIndex();

		/**
		 * The meta object literal for the '<em><b>Table Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__TABLE_INDEX = eINSTANCE.getTextType_TableIndex();

		/**
		 * The meta object literal for the '<em><b>Object Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__OBJECT_INDEX = eINSTANCE.getTextType_ObjectIndex();

		/**
		 * The meta object literal for the '<em><b>User Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__USER_INDEX = eINSTANCE.getTextType_UserIndex();

		/**
		 * The meta object literal for the '<em><b>Alphabetical Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__ALPHABETICAL_INDEX = eINSTANCE.getTextType_AlphabeticalIndex();

		/**
		 * The meta object literal for the '<em><b>Bibliography</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__BIBLIOGRAPHY = eINSTANCE.getTextType_Bibliography();

		/**
		 * The meta object literal for the '<em><b>Rect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__RECT = eINSTANCE.getTextType_Rect();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__LINE = eINSTANCE.getTextType_Line();

		/**
		 * The meta object literal for the '<em><b>Polyline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__POLYLINE = eINSTANCE.getTextType_Polyline();

		/**
		 * The meta object literal for the '<em><b>Polygon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__POLYGON = eINSTANCE.getTextType_Polygon();

		/**
		 * The meta object literal for the '<em><b>Regular Polygon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__REGULAR_POLYGON = eINSTANCE.getTextType_RegularPolygon();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__PATH = eINSTANCE.getTextType_Path();

		/**
		 * The meta object literal for the '<em><b>Circle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CIRCLE = eINSTANCE.getTextType_Circle();

		/**
		 * The meta object literal for the '<em><b>Ellipse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__ELLIPSE = eINSTANCE.getTextType_Ellipse();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__G = eINSTANCE.getTextType_G();

		/**
		 * The meta object literal for the '<em><b>Page Thumbnail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__PAGE_THUMBNAIL = eINSTANCE.getTextType_PageThumbnail();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__FRAME = eINSTANCE.getTextType_Frame();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__MEASURE = eINSTANCE.getTextType_Measure();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CAPTION = eINSTANCE.getTextType_Caption();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CONNECTOR = eINSTANCE.getTextType_Connector();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CONTROL = eINSTANCE.getTextType_Control();

		/**
		 * The meta object literal for the '<em><b>Scene</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__SCENE = eINSTANCE.getTextType_Scene();

		/**
		 * The meta object literal for the '<em><b>Custom Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CUSTOM_SHAPE = eINSTANCE.getTextType_CustomShape();

		/**
		 * The meta object literal for the '<em><b>Change Marks Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__CHANGE_MARKS_GROUP = eINSTANCE.getTextType_ChangeMarksGroup();

		/**
		 * The meta object literal for the '<em><b>Change Marks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CHANGE_MARKS = eINSTANCE.getTextType_ChangeMarks();

		/**
		 * The meta object literal for the '<em><b>Page Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__PAGE_SEQUENCE = eINSTANCE.getTextType_PageSequence();

		/**
		 * The meta object literal for the '<em><b>A1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__A1 = eINSTANCE.getTextType_A1();

		/**
		 * The meta object literal for the '<em><b>Rect1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__RECT1 = eINSTANCE.getTextType_Rect1();

		/**
		 * The meta object literal for the '<em><b>Line1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__LINE1 = eINSTANCE.getTextType_Line1();

		/**
		 * The meta object literal for the '<em><b>Polyline1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__POLYLINE1 = eINSTANCE.getTextType_Polyline1();

		/**
		 * The meta object literal for the '<em><b>Polygon1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__POLYGON1 = eINSTANCE.getTextType_Polygon1();

		/**
		 * The meta object literal for the '<em><b>Regular Polygon1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__REGULAR_POLYGON1 = eINSTANCE.getTextType_RegularPolygon1();

		/**
		 * The meta object literal for the '<em><b>Path1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__PATH1 = eINSTANCE.getTextType_Path1();

		/**
		 * The meta object literal for the '<em><b>Circle1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CIRCLE1 = eINSTANCE.getTextType_Circle1();

		/**
		 * The meta object literal for the '<em><b>Ellipse1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__ELLIPSE1 = eINSTANCE.getTextType_Ellipse1();

		/**
		 * The meta object literal for the '<em><b>G1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__G1 = eINSTANCE.getTextType_G1();

		/**
		 * The meta object literal for the '<em><b>Page Thumbnail1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__PAGE_THUMBNAIL1 = eINSTANCE.getTextType_PageThumbnail1();

		/**
		 * The meta object literal for the '<em><b>Frame1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__FRAME1 = eINSTANCE.getTextType_Frame1();

		/**
		 * The meta object literal for the '<em><b>Measure1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__MEASURE1 = eINSTANCE.getTextType_Measure1();

		/**
		 * The meta object literal for the '<em><b>Caption1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CAPTION1 = eINSTANCE.getTextType_Caption1();

		/**
		 * The meta object literal for the '<em><b>Connector1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CONNECTOR1 = eINSTANCE.getTextType_Connector1();

		/**
		 * The meta object literal for the '<em><b>Control1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CONTROL1 = eINSTANCE.getTextType_Control1();

		/**
		 * The meta object literal for the '<em><b>Scene1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__SCENE1 = eINSTANCE.getTextType_Scene1();

		/**
		 * The meta object literal for the '<em><b>Custom Shape1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CUSTOM_SHAPE1 = eINSTANCE.getTextType_CustomShape1();

		/**
		 * The meta object literal for the '<em><b>Named Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__NAMED_EXPRESSIONS = eINSTANCE.getTextType_NamedExpressions();

		/**
		 * The meta object literal for the '<em><b>Database Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__DATABASE_RANGES = eINSTANCE.getTextType_DatabaseRanges();

		/**
		 * The meta object literal for the '<em><b>Data Pilot Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__DATA_PILOT_TABLES = eINSTANCE.getTextType_DataPilotTables();

		/**
		 * The meta object literal for the '<em><b>Consolidation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__CONSOLIDATION = eINSTANCE.getTextType_Consolidation();

		/**
		 * The meta object literal for the '<em><b>Dde Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__DDE_LINKS = eINSTANCE.getTextType_DdeLinks();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__GLOBAL = eINSTANCE.getTextType_Global();

		/**
		 * The meta object literal for the '<em><b>Use Soft Page Breaks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__USE_SOFT_PAGE_BREAKS = eINSTANCE.getTextType_UseSoftPageBreaks();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANNOTATION = eINSTANCE.getDocumentRoot_Annotation();

		/**
		 * The meta object literal for the '<em><b>Automatic Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTOMATIC_STYLES = eINSTANCE.getDocumentRoot_AutomaticStyles();

		/**
		 * The meta object literal for the '<em><b>Binary Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BINARY_DATA = eINSTANCE.getDocumentRoot_BinaryData();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BODY = eINSTANCE.getDocumentRoot_Body();

		/**
		 * The meta object literal for the '<em><b>Change Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_INFO = eINSTANCE.getDocumentRoot_ChangeInfo();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHART = eINSTANCE.getDocumentRoot_Chart();

		/**
		 * The meta object literal for the '<em><b>Dde Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DDE_SOURCE = eINSTANCE.getDocumentRoot_DdeSource();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT = eINSTANCE.getDocumentRoot_Document();

		/**
		 * The meta object literal for the '<em><b>Document Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT_CONTENT = eINSTANCE.getDocumentRoot_DocumentContent();

		/**
		 * The meta object literal for the '<em><b>Document Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT_META = eINSTANCE.getDocumentRoot_DocumentMeta();

		/**
		 * The meta object literal for the '<em><b>Document Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT_SETTINGS = eINSTANCE.getDocumentRoot_DocumentSettings();

		/**
		 * The meta object literal for the '<em><b>Document Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT_STYLES = eINSTANCE.getDocumentRoot_DocumentStyles();

		/**
		 * The meta object literal for the '<em><b>Drawing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DRAWING = eINSTANCE.getDocumentRoot_Drawing();

		/**
		 * The meta object literal for the '<em><b>Event Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVENT_LISTENERS = eINSTANCE.getDocumentRoot_EventListeners();

		/**
		 * The meta object literal for the '<em><b>Font Face Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FONT_FACE_DECLS = eINSTANCE.getDocumentRoot_FontFaceDecls();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORMS = eINSTANCE.getDocumentRoot_Forms();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMAGE = eINSTANCE.getDocumentRoot_Image();

		/**
		 * The meta object literal for the '<em><b>Master Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MASTER_STYLES = eINSTANCE.getDocumentRoot_MasterStyles();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__META = eINSTANCE.getDocumentRoot_Meta();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRESENTATION = eINSTANCE.getDocumentRoot_Presentation();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCRIPT = eINSTANCE.getDocumentRoot_Script();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCRIPTS = eINSTANCE.getDocumentRoot_Scripts();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SETTINGS = eINSTANCE.getDocumentRoot_Settings();

		/**
		 * The meta object literal for the '<em><b>Spreadsheet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPREADSHEET = eINSTANCE.getDocumentRoot_Spreadsheet();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STYLES = eINSTANCE.getDocumentRoot_Styles();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEXT = eINSTANCE.getDocumentRoot_Text();

		/**
		 * The meta object literal for the '<em><b>Automatic Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUTOMATIC_UPDATE = eINSTANCE.getDocumentRoot_AutomaticUpdate();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BOOLEAN_VALUE = eINSTANCE.getDocumentRoot_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Conversion Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONVERSION_MODE = eINSTANCE.getDocumentRoot_ConversionMode();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CURRENCY = eINSTANCE.getDocumentRoot_Currency();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATE_VALUE = eINSTANCE.getDocumentRoot_DateValue();

		/**
		 * The meta object literal for the '<em><b>Dde Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DDE_APPLICATION = eINSTANCE.getDocumentRoot_DdeApplication();

		/**
		 * The meta object literal for the '<em><b>Dde Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DDE_ITEM = eINSTANCE.getDocumentRoot_DdeItem();

		/**
		 * The meta object literal for the '<em><b>Dde Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DDE_TOPIC = eINSTANCE.getDocumentRoot_DdeTopic();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DISPLAY = eINSTANCE.getDocumentRoot_Display();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIMETYPE = eINSTANCE.getDocumentRoot_Mimetype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Process Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PROCESS_CONTENT = eINSTANCE.getDocumentRoot_ProcessContent();

		/**
		 * The meta object literal for the '<em><b>Server Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVER_MAP = eINSTANCE.getDocumentRoot_ServerMap();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STRING_VALUE = eINSTANCE.getDocumentRoot_StringValue();

		/**
		 * The meta object literal for the '<em><b>Target Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TARGET_FRAME = eINSTANCE.getDocumentRoot_TargetFrame();

		/**
		 * The meta object literal for the '<em><b>Target Frame Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TARGET_FRAME_NAME = eINSTANCE.getDocumentRoot_TargetFrameName();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TIME_VALUE = eINSTANCE.getDocumentRoot_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VERSION = eINSTANCE.getDocumentRoot_Version();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType <em>Conversion Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getConversionModeType()
		 * @generated
		 */
		EEnum CONVERSION_MODE_TYPE = eINSTANCE.getConversionModeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType <em>Value Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getValueTypeType()
		 * @generated
		 */
		EEnum VALUE_TYPE_TYPE = eINSTANCE.getValueTypeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1 <em>Value Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getValueTypeType1()
		 * @generated
		 */
		EEnum VALUE_TYPE_TYPE1 = eINSTANCE.getValueTypeType1();

		/**
		 * The meta object literal for the '<em>Conversion Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getConversionModeTypeObject()
		 * @generated
		 */
		EDataType CONVERSION_MODE_TYPE_OBJECT = eINSTANCE.getConversionModeTypeObject();

		/**
		 * The meta object literal for the '<em>Value Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getValueTypeTypeObject()
		 * @generated
		 */
		EDataType VALUE_TYPE_TYPE_OBJECT = eINSTANCE.getValueTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Value Type Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl#getValueTypeTypeObject1()
		 * @generated
		 */
		EDataType VALUE_TYPE_TYPE_OBJECT1 = eINSTANCE.getValueTypeTypeObject1();

	}

} //OfficePackage
