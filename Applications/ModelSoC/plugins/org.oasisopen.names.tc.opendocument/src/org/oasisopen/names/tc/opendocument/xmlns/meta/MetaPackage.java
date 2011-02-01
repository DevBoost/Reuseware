/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaFactory
 * @model kind="package"
 * @generated
 */
public interface MetaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "meta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfmeta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.AutoReloadTypeImpl <em>Auto Reload Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.AutoReloadTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getAutoReloadType()
	 * @generated
	 */
	int AUTO_RELOAD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_RELOAD_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_RELOAD_TYPE__DELAY = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_RELOAD_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_RELOAD_TYPE__SHOW = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_RELOAD_TYPE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Auto Reload Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_RELOAD_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Auto Reload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTO_RELOAD = 3;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Date String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_STRING = 5;

	/**
	 * The feature id for the '<em><b>Document Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_STATISTIC = 6;

	/**
	 * The feature id for the '<em><b>Editing Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EDITING_CYCLES = 7;

	/**
	 * The feature id for the '<em><b>Editing Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EDITING_DURATION = 8;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERATOR = 9;

	/**
	 * The feature id for the '<em><b>Hyperlink Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR = 10;

	/**
	 * The feature id for the '<em><b>Initial Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INITIAL_CREATOR = 11;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYWORD = 12;

	/**
	 * The feature id for the '<em><b>Print Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINT_DATE = 13;

	/**
	 * The feature id for the '<em><b>Printed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRINTED_BY = 14;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPLATE = 15;

	/**
	 * The feature id for the '<em><b>User Defined</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_DEFINED = 16;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl <em>Document Statistic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getDocumentStatisticType()
	 * @generated
	 */
	int DOCUMENT_STATISTIC_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Cell Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__CELL_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Character Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__CHARACTER_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Draw Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__DRAW_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Frame Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__FRAME_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Image Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__IMAGE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Non Whitespace Character Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__NON_WHITESPACE_CHARACTER_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Object Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__OBJECT_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Ole Object Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__OLE_OBJECT_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Page Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__PAGE_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Paragraph Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__PARAGRAPH_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Row Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__ROW_COUNT = 10;

	/**
	 * The feature id for the '<em><b>Sentence Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__SENTENCE_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Syllable Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__SYLLABLE_COUNT = 12;

	/**
	 * The feature id for the '<em><b>Table Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__TABLE_COUNT = 13;

	/**
	 * The feature id for the '<em><b>Word Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE__WORD_COUNT = 14;

	/**
	 * The number of structural features of the '<em>Document Statistic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATISTIC_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.HyperlinkBehaviourTypeImpl <em>Hyperlink Behaviour Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.HyperlinkBehaviourTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getHyperlinkBehaviourType()
	 * @generated
	 */
	int HYPERLINK_BEHAVIOUR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_BEHAVIOUR_TYPE__SHOW = 0;

	/**
	 * The feature id for the '<em><b>Target Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_BEHAVIOUR_TYPE__TARGET_FRAME_NAME = 1;

	/**
	 * The number of structural features of the '<em>Hyperlink Behaviour Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_BEHAVIOUR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.TemplateTypeImpl <em>Template Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.TemplateTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getTemplateType()
	 * @generated
	 */
	int TEMPLATE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Template Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.UserDefinedTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getUserDefinedType()
	 * @generated
	 */
	int USER_DEFINED_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE__VALUE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>User Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType <em>Value Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getValueTypeType()
	 * @generated
	 */
	int VALUE_TYPE_TYPE = 6;

	/**
	 * The meta object id for the '<em>Value Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getValueTypeTypeObject()
	 * @generated
	 */
	int VALUE_TYPE_TYPE_OBJECT = 7;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType <em>Auto Reload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Reload Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType
	 * @generated
	 */
	EClass getAutoReloadType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getActuate()
	 * @see #getAutoReloadType()
	 * @generated
	 */
	EAttribute getAutoReloadType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getDelay()
	 * @see #getAutoReloadType()
	 * @generated
	 */
	EAttribute getAutoReloadType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getHref()
	 * @see #getAutoReloadType()
	 * @generated
	 */
	EAttribute getAutoReloadType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getShow()
	 * @see #getAutoReloadType()
	 * @generated
	 */
	EAttribute getAutoReloadType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType#getType()
	 * @see #getAutoReloadType()
	 * @generated
	 */
	EAttribute getAutoReloadType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getAutoReload <em>Auto Reload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Reload</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getAutoReload()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AutoReload();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getCreationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getDateString <em>Date String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date String</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getDateString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DateString();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getDocumentStatistic <em>Document Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Statistic</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getDocumentStatistic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocumentStatistic();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getEditingCycles <em>Editing Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editing Cycles</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getEditingCycles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EditingCycles();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getEditingDuration <em>Editing Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editing Duration</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getEditingDuration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EditingDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getGenerator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Generator();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getHyperlinkBehaviour <em>Hyperlink Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hyperlink Behaviour</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getHyperlinkBehaviour()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HyperlinkBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getInitialCreator <em>Initial Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Creator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getInitialCreator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InitialCreator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getKeyword()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getPrintDate <em>Print Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Date</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getPrintDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PrintDate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getPrintedBy <em>Printed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printed By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getPrintedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PrintedBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getTemplate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Template();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getUserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Defined</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot#getUserDefined()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserDefined();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType <em>Document Statistic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Statistic Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType
	 * @generated
	 */
	EClass getDocumentStatisticType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getCellCount <em>Cell Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getCellCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_CellCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getCharacterCount <em>Character Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getCharacterCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_CharacterCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getDrawCount <em>Draw Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draw Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getDrawCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_DrawCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getFrameCount <em>Frame Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getFrameCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_FrameCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getImageCount <em>Image Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getImageCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_ImageCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getNonWhitespaceCharacterCount <em>Non Whitespace Character Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Whitespace Character Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getNonWhitespaceCharacterCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_NonWhitespaceCharacterCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getObjectCount <em>Object Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getObjectCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_ObjectCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getOleObjectCount <em>Ole Object Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ole Object Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getOleObjectCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_OleObjectCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getPageCount <em>Page Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getPageCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_PageCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getParagraphCount <em>Paragraph Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getParagraphCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_ParagraphCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getRowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getRowCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_RowCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getSentenceCount <em>Sentence Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentence Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getSentenceCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_SentenceCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getSyllableCount <em>Syllable Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syllable Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getSyllableCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_SyllableCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getTableCount <em>Table Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getTableCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_TableCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getWordCount <em>Word Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getWordCount()
	 * @see #getDocumentStatisticType()
	 * @generated
	 */
	EAttribute getDocumentStatisticType_WordCount();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType <em>Hyperlink Behaviour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyperlink Behaviour Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType
	 * @generated
	 */
	EClass getHyperlinkBehaviourType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType#getShow()
	 * @see #getHyperlinkBehaviourType()
	 * @generated
	 */
	EAttribute getHyperlinkBehaviourType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType#getTargetFrameName <em>Target Frame Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frame Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType#getTargetFrameName()
	 * @see #getHyperlinkBehaviourType()
	 * @generated
	 */
	EAttribute getHyperlinkBehaviourType_TargetFrameName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType
	 * @generated
	 */
	EClass getTemplateType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getActuate()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getDate()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getHref()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getTitle()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType#getType()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType <em>User Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType
	 * @generated
	 */
	EClass getUserDefinedType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType#getMixed()
	 * @see #getUserDefinedType()
	 * @generated
	 */
	EAttribute getUserDefinedType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType#getName()
	 * @see #getUserDefinedType()
	 * @generated
	 */
	EAttribute getUserDefinedType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType#getValueType()
	 * @see #getUserDefinedType()
	 * @generated
	 */
	EAttribute getUserDefinedType_ValueType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType <em>Value Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType
	 * @generated
	 */
	EEnum getValueTypeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType <em>Value Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType"
	 *        extendedMetaData="name='value-type_._type:Object' baseType='value-type_._type'"
	 * @generated
	 */
	EDataType getValueTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaFactory getMetaFactory();

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
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.AutoReloadTypeImpl <em>Auto Reload Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.AutoReloadTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getAutoReloadType()
		 * @generated
		 */
		EClass AUTO_RELOAD_TYPE = eINSTANCE.getAutoReloadType();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_RELOAD_TYPE__ACTUATE = eINSTANCE.getAutoReloadType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_RELOAD_TYPE__DELAY = eINSTANCE.getAutoReloadType_Delay();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_RELOAD_TYPE__HREF = eINSTANCE.getAutoReloadType_Href();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_RELOAD_TYPE__SHOW = eINSTANCE.getAutoReloadType_Show();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_RELOAD_TYPE__TYPE = eINSTANCE.getAutoReloadType_Type();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Auto Reload</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTO_RELOAD = eINSTANCE.getDocumentRoot_AutoReload();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CREATION_DATE = eINSTANCE.getDocumentRoot_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Date String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATE_STRING = eINSTANCE.getDocumentRoot_DateString();

		/**
		 * The meta object literal for the '<em><b>Document Statistic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT_STATISTIC = eINSTANCE.getDocumentRoot_DocumentStatistic();

		/**
		 * The meta object literal for the '<em><b>Editing Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EDITING_CYCLES = eINSTANCE.getDocumentRoot_EditingCycles();

		/**
		 * The meta object literal for the '<em><b>Editing Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EDITING_DURATION = eINSTANCE.getDocumentRoot_EditingDuration();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GENERATOR = eINSTANCE.getDocumentRoot_Generator();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Behaviour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR = eINSTANCE.getDocumentRoot_HyperlinkBehaviour();

		/**
		 * The meta object literal for the '<em><b>Initial Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INITIAL_CREATOR = eINSTANCE.getDocumentRoot_InitialCreator();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEYWORD = eINSTANCE.getDocumentRoot_Keyword();

		/**
		 * The meta object literal for the '<em><b>Print Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRINT_DATE = eINSTANCE.getDocumentRoot_PrintDate();

		/**
		 * The meta object literal for the '<em><b>Printed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRINTED_BY = eINSTANCE.getDocumentRoot_PrintedBy();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPLATE = eINSTANCE.getDocumentRoot_Template();

		/**
		 * The meta object literal for the '<em><b>User Defined</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_DEFINED = eINSTANCE.getDocumentRoot_UserDefined();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl <em>Document Statistic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getDocumentStatisticType()
		 * @generated
		 */
		EClass DOCUMENT_STATISTIC_TYPE = eINSTANCE.getDocumentStatisticType();

		/**
		 * The meta object literal for the '<em><b>Cell Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__CELL_COUNT = eINSTANCE.getDocumentStatisticType_CellCount();

		/**
		 * The meta object literal for the '<em><b>Character Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__CHARACTER_COUNT = eINSTANCE.getDocumentStatisticType_CharacterCount();

		/**
		 * The meta object literal for the '<em><b>Draw Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__DRAW_COUNT = eINSTANCE.getDocumentStatisticType_DrawCount();

		/**
		 * The meta object literal for the '<em><b>Frame Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__FRAME_COUNT = eINSTANCE.getDocumentStatisticType_FrameCount();

		/**
		 * The meta object literal for the '<em><b>Image Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__IMAGE_COUNT = eINSTANCE.getDocumentStatisticType_ImageCount();

		/**
		 * The meta object literal for the '<em><b>Non Whitespace Character Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__NON_WHITESPACE_CHARACTER_COUNT = eINSTANCE.getDocumentStatisticType_NonWhitespaceCharacterCount();

		/**
		 * The meta object literal for the '<em><b>Object Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__OBJECT_COUNT = eINSTANCE.getDocumentStatisticType_ObjectCount();

		/**
		 * The meta object literal for the '<em><b>Ole Object Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__OLE_OBJECT_COUNT = eINSTANCE.getDocumentStatisticType_OleObjectCount();

		/**
		 * The meta object literal for the '<em><b>Page Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__PAGE_COUNT = eINSTANCE.getDocumentStatisticType_PageCount();

		/**
		 * The meta object literal for the '<em><b>Paragraph Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__PARAGRAPH_COUNT = eINSTANCE.getDocumentStatisticType_ParagraphCount();

		/**
		 * The meta object literal for the '<em><b>Row Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__ROW_COUNT = eINSTANCE.getDocumentStatisticType_RowCount();

		/**
		 * The meta object literal for the '<em><b>Sentence Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__SENTENCE_COUNT = eINSTANCE.getDocumentStatisticType_SentenceCount();

		/**
		 * The meta object literal for the '<em><b>Syllable Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__SYLLABLE_COUNT = eINSTANCE.getDocumentStatisticType_SyllableCount();

		/**
		 * The meta object literal for the '<em><b>Table Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__TABLE_COUNT = eINSTANCE.getDocumentStatisticType_TableCount();

		/**
		 * The meta object literal for the '<em><b>Word Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_STATISTIC_TYPE__WORD_COUNT = eINSTANCE.getDocumentStatisticType_WordCount();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.HyperlinkBehaviourTypeImpl <em>Hyperlink Behaviour Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.HyperlinkBehaviourTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getHyperlinkBehaviourType()
		 * @generated
		 */
		EClass HYPERLINK_BEHAVIOUR_TYPE = eINSTANCE.getHyperlinkBehaviourType();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERLINK_BEHAVIOUR_TYPE__SHOW = eINSTANCE.getHyperlinkBehaviourType_Show();

		/**
		 * The meta object literal for the '<em><b>Target Frame Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERLINK_BEHAVIOUR_TYPE__TARGET_FRAME_NAME = eINSTANCE.getHyperlinkBehaviourType_TargetFrameName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.TemplateTypeImpl <em>Template Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.TemplateTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getTemplateType()
		 * @generated
		 */
		EClass TEMPLATE_TYPE = eINSTANCE.getTemplateType();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__ACTUATE = eINSTANCE.getTemplateType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__DATE = eINSTANCE.getTemplateType_Date();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__HREF = eINSTANCE.getTemplateType_Href();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__TITLE = eINSTANCE.getTemplateType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__TYPE = eINSTANCE.getTemplateType_Type();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.UserDefinedTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getUserDefinedType()
		 * @generated
		 */
		EClass USER_DEFINED_TYPE = eINSTANCE.getUserDefinedType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_TYPE__MIXED = eINSTANCE.getUserDefinedType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_TYPE__NAME = eINSTANCE.getUserDefinedType_Name();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_TYPE__VALUE_TYPE = eINSTANCE.getUserDefinedType_ValueType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType <em>Value Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getValueTypeType()
		 * @generated
		 */
		EEnum VALUE_TYPE_TYPE = eINSTANCE.getValueTypeType();

		/**
		 * The meta object literal for the '<em>Value Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl#getValueTypeTypeObject()
		 * @generated
		 */
		EDataType VALUE_TYPE_TYPE_OBJECT = eINSTANCE.getValueTypeTypeObject();

	}

} //MetaPackage
