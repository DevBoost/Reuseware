/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.smil;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatibleFactory
 * @model kind="package"
 * @generated
 */
public interface CompatiblePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smil";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfsmil";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompatiblePackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Accelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCELERATE = 3;

	/**
	 * The feature id for the '<em><b>Accumulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCUMULATE = 4;

	/**
	 * The feature id for the '<em><b>Additive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDITIVE = 5;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Auto Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTO_REVERSE = 7;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEGIN = 8;

	/**
	 * The feature id for the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BY = 9;

	/**
	 * The feature id for the '<em><b>Calc Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALC_MODE = 10;

	/**
	 * The feature id for the '<em><b>Decelerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECELERATE = 11;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIRECTION = 12;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DUR = 13;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END = 14;

	/**
	 * The feature id for the '<em><b>Endsync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDSYNC = 15;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL = 16;

	/**
	 * The feature id for the '<em><b>Fill Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL_DEFAULT = 17;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FROM = 18;

	/**
	 * The feature id for the '<em><b>Key Splines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_SPLINES = 19;

	/**
	 * The feature id for the '<em><b>Key Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY_TIMES = 20;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODE = 21;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPEAT_COUNT = 22;

	/**
	 * The feature id for the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPEAT_DUR = 23;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESTART = 24;

	/**
	 * The feature id for the '<em><b>Restart Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESTART_DEFAULT = 25;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBTYPE = 26;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TO = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 29;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUES = 30;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 31;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType <em>Accumulate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getAccumulateType()
	 * @generated
	 */
	int ACCUMULATE_TYPE = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType <em>Additive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getAdditiveType()
	 * @generated
	 */
	int ADDITIVE_TYPE = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType <em>Calc Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getCalcModeType()
	 * @generated
	 */
	int CALC_MODE_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType <em>Endsync Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getEndsyncType()
	 * @generated
	 */
	int ENDSYNC_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType <em>Fade Color Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFadeColorType()
	 * @generated
	 */
	int FADE_COLOR_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType <em>Fill Default Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFillDefaultType()
	 * @generated
	 */
	int FILL_DEFAULT_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillType <em>Fill Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFillType()
	 * @generated
	 */
	int FILL_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType <em>Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getModeType()
	 * @generated
	 */
	int MODE_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1 <em>Repeat Count Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRepeatCountTypeMember1()
	 * @generated
	 */
	int REPEAT_COUNT_TYPE_MEMBER1 = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType <em>Restart Default Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRestartDefaultType()
	 * @generated
	 */
	int RESTART_DEFAULT_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType <em>Restart Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRestartType()
	 * @generated
	 */
	int RESTART_TYPE = 12;

	/**
	 * The meta object id for the '<em>Accumulate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getAccumulateTypeObject()
	 * @generated
	 */
	int ACCUMULATE_TYPE_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Additive Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getAdditiveTypeObject()
	 * @generated
	 */
	int ADDITIVE_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Calc Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getCalcModeTypeObject()
	 * @generated
	 */
	int CALC_MODE_TYPE_OBJECT = 15;

	/**
	 * The meta object id for the '<em>Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getDirectionTypeObject()
	 * @generated
	 */
	int DIRECTION_TYPE_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Endsync Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getEndsyncTypeObject()
	 * @generated
	 */
	int ENDSYNC_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Fade Color Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFadeColorTypeObject()
	 * @generated
	 */
	int FADE_COLOR_TYPE_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Fill Default Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFillDefaultTypeObject()
	 * @generated
	 */
	int FILL_DEFAULT_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Fill Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFillTypeObject()
	 * @generated
	 */
	int FILL_TYPE_OBJECT = 20;

	/**
	 * The meta object id for the '<em>Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getModeTypeObject()
	 * @generated
	 */
	int MODE_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Repeat Count Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRepeatCountType()
	 * @generated
	 */
	int REPEAT_COUNT_TYPE = 22;

	/**
	 * The meta object id for the '<em>Repeat Count Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRepeatCountTypeMember1Object()
	 * @generated
	 */
	int REPEAT_COUNT_TYPE_MEMBER1_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Restart Default Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRestartDefaultTypeObject()
	 * @generated
	 */
	int RESTART_DEFAULT_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Restart Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRestartTypeObject()
	 * @generated
	 */
	int RESTART_TYPE_OBJECT = 25;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccelerate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Accelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccumulate <em>Accumulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccumulate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Accumulate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAdditive <em>Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAdditive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Additive();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAttributeName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAutoReverse <em>Auto Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Reverse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAutoReverse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AutoReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getBegin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_By();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getCalcMode <em>Calc Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calc Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getCalcMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CalcMode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDecelerate <em>Decelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decelerate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDecelerate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Decelerate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDur()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Dur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_End();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEndsync <em>Endsync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endsync</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEndsync()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Endsync();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFill()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFillDefault <em>Fill Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFillDefault()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FillDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_From();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getKeySplines <em>Key Splines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Splines</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getKeySplines()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeySplines();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getKeyTimes <em>Key Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Times</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getKeyTimes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeyTimes();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRepeatCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RepeatCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRepeatDur <em>Repeat Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Dur</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRepeatDur()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RepeatDur();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestartDefault <em>Restart Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Default</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestartDefault()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RestartDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getSubtype()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getTargetElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_To();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getValues()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Values();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType <em>Accumulate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accumulate Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType
	 * @generated
	 */
	EEnum getAccumulateType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType <em>Additive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Additive Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType
	 * @generated
	 */
	EEnum getAdditiveType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType <em>Calc Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calc Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType
	 * @generated
	 */
	EEnum getCalcModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType <em>Endsync Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endsync Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType
	 * @generated
	 */
	EEnum getEndsyncType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType <em>Fade Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fade Color Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType
	 * @generated
	 */
	EEnum getFadeColorType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType <em>Fill Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Default Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType
	 * @generated
	 */
	EEnum getFillDefaultType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillType <em>Fill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillType
	 * @generated
	 */
	EEnum getFillType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType
	 * @generated
	 */
	EEnum getModeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1 <em>Repeat Count Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repeat Count Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1
	 * @generated
	 */
	EEnum getRepeatCountTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType <em>Restart Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restart Default Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType
	 * @generated
	 */
	EEnum getRestartDefaultType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType <em>Restart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restart Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType
	 * @generated
	 */
	EEnum getRestartType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType <em>Accumulate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Accumulate Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType"
	 *        extendedMetaData="name='accumulate_._type:Object' baseType='accumulate_._type'"
	 * @generated
	 */
	EDataType getAccumulateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType <em>Additive Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Additive Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType"
	 *        extendedMetaData="name='additive_._type:Object' baseType='additive_._type'"
	 * @generated
	 */
	EDataType getAdditiveTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType <em>Calc Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calc Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType"
	 *        extendedMetaData="name='calcMode_._type:Object' baseType='calcMode_._type'"
	 * @generated
	 */
	EDataType getCalcModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType <em>Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direction Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType"
	 *        extendedMetaData="name='direction_._type:Object' baseType='direction_._type'"
	 * @generated
	 */
	EDataType getDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType <em>Endsync Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Endsync Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType"
	 *        extendedMetaData="name='endsync_._type:Object' baseType='endsync_._type'"
	 * @generated
	 */
	EDataType getEndsyncTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType <em>Fade Color Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fade Color Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType"
	 *        extendedMetaData="name='fadeColor_._type:Object' baseType='fadeColor_._type'"
	 * @generated
	 */
	EDataType getFadeColorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType <em>Fill Default Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Default Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType"
	 *        extendedMetaData="name='fillDefault_._type:Object' baseType='fillDefault_._type'"
	 * @generated
	 */
	EDataType getFillDefaultTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillType <em>Fill Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.FillType"
	 *        extendedMetaData="name='fill_._type:Object' baseType='fill_._type'"
	 * @generated
	 */
	EDataType getFillTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType <em>Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mode Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType"
	 *        extendedMetaData="name='mode_._type:Object' baseType='mode_._type'"
	 * @generated
	 */
	EDataType getModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Repeat Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Repeat Count Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='repeatCount_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeInteger repeatCount_._type_._member_._1'"
	 * @generated
	 */
	EDataType getRepeatCountType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1 <em>Repeat Count Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Repeat Count Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1"
	 *        extendedMetaData="name='repeatCount_._type_._member_._1:Object' baseType='repeatCount_._type_._member_._1'"
	 * @generated
	 */
	EDataType getRepeatCountTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType <em>Restart Default Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Restart Default Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType"
	 *        extendedMetaData="name='restartDefault_._type:Object' baseType='restartDefault_._type'"
	 * @generated
	 */
	EDataType getRestartDefaultTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType <em>Restart Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Restart Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType"
	 *        extendedMetaData="name='restart_._type:Object' baseType='restart_._type'"
	 * @generated
	 */
	EDataType getRestartTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompatibleFactory getCompatibleFactory();

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
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Accelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCELERATE = eINSTANCE.getDocumentRoot_Accelerate();

		/**
		 * The meta object literal for the '<em><b>Accumulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCUMULATE = eINSTANCE.getDocumentRoot_Accumulate();

		/**
		 * The meta object literal for the '<em><b>Additive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ADDITIVE = eINSTANCE.getDocumentRoot_Additive();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ATTRIBUTE_NAME = eINSTANCE.getDocumentRoot_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Auto Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUTO_REVERSE = eINSTANCE.getDocumentRoot_AutoReverse();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BEGIN = eINSTANCE.getDocumentRoot_Begin();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BY = eINSTANCE.getDocumentRoot_By();

		/**
		 * The meta object literal for the '<em><b>Calc Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CALC_MODE = eINSTANCE.getDocumentRoot_CalcMode();

		/**
		 * The meta object literal for the '<em><b>Decelerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DECELERATE = eINSTANCE.getDocumentRoot_Decelerate();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIRECTION = eINSTANCE.getDocumentRoot_Direction();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DUR = eINSTANCE.getDocumentRoot_Dur();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__END = eINSTANCE.getDocumentRoot_End();

		/**
		 * The meta object literal for the '<em><b>Endsync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ENDSYNC = eINSTANCE.getDocumentRoot_Endsync();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FILL = eINSTANCE.getDocumentRoot_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FILL_DEFAULT = eINSTANCE.getDocumentRoot_FillDefault();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FROM = eINSTANCE.getDocumentRoot_From();

		/**
		 * The meta object literal for the '<em><b>Key Splines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEY_SPLINES = eINSTANCE.getDocumentRoot_KeySplines();

		/**
		 * The meta object literal for the '<em><b>Key Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEY_TIMES = eINSTANCE.getDocumentRoot_KeyTimes();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MODE = eINSTANCE.getDocumentRoot_Mode();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REPEAT_COUNT = eINSTANCE.getDocumentRoot_RepeatCount();

		/**
		 * The meta object literal for the '<em><b>Repeat Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REPEAT_DUR = eINSTANCE.getDocumentRoot_RepeatDur();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RESTART = eINSTANCE.getDocumentRoot_Restart();

		/**
		 * The meta object literal for the '<em><b>Restart Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RESTART_DEFAULT = eINSTANCE.getDocumentRoot_RestartDefault();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SUBTYPE = eINSTANCE.getDocumentRoot_Subtype();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TARGET_ELEMENT = eINSTANCE.getDocumentRoot_TargetElement();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TO = eINSTANCE.getDocumentRoot_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALUES = eINSTANCE.getDocumentRoot_Values();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType <em>Accumulate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getAccumulateType()
		 * @generated
		 */
		EEnum ACCUMULATE_TYPE = eINSTANCE.getAccumulateType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType <em>Additive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getAdditiveType()
		 * @generated
		 */
		EEnum ADDITIVE_TYPE = eINSTANCE.getAdditiveType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType <em>Calc Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getCalcModeType()
		 * @generated
		 */
		EEnum CALC_MODE_TYPE = eINSTANCE.getCalcModeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType <em>Endsync Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getEndsyncType()
		 * @generated
		 */
		EEnum ENDSYNC_TYPE = eINSTANCE.getEndsyncType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType <em>Fade Color Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFadeColorType()
		 * @generated
		 */
		EEnum FADE_COLOR_TYPE = eINSTANCE.getFadeColorType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType <em>Fill Default Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFillDefaultType()
		 * @generated
		 */
		EEnum FILL_DEFAULT_TYPE = eINSTANCE.getFillDefaultType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillType <em>Fill Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFillType()
		 * @generated
		 */
		EEnum FILL_TYPE = eINSTANCE.getFillType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType <em>Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getModeType()
		 * @generated
		 */
		EEnum MODE_TYPE = eINSTANCE.getModeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1 <em>Repeat Count Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRepeatCountTypeMember1()
		 * @generated
		 */
		EEnum REPEAT_COUNT_TYPE_MEMBER1 = eINSTANCE.getRepeatCountTypeMember1();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType <em>Restart Default Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRestartDefaultType()
		 * @generated
		 */
		EEnum RESTART_DEFAULT_TYPE = eINSTANCE.getRestartDefaultType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType <em>Restart Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRestartType()
		 * @generated
		 */
		EEnum RESTART_TYPE = eINSTANCE.getRestartType();

		/**
		 * The meta object literal for the '<em>Accumulate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getAccumulateTypeObject()
		 * @generated
		 */
		EDataType ACCUMULATE_TYPE_OBJECT = eINSTANCE.getAccumulateTypeObject();

		/**
		 * The meta object literal for the '<em>Additive Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getAdditiveTypeObject()
		 * @generated
		 */
		EDataType ADDITIVE_TYPE_OBJECT = eINSTANCE.getAdditiveTypeObject();

		/**
		 * The meta object literal for the '<em>Calc Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getCalcModeTypeObject()
		 * @generated
		 */
		EDataType CALC_MODE_TYPE_OBJECT = eINSTANCE.getCalcModeTypeObject();

		/**
		 * The meta object literal for the '<em>Direction Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getDirectionTypeObject()
		 * @generated
		 */
		EDataType DIRECTION_TYPE_OBJECT = eINSTANCE.getDirectionTypeObject();

		/**
		 * The meta object literal for the '<em>Endsync Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getEndsyncTypeObject()
		 * @generated
		 */
		EDataType ENDSYNC_TYPE_OBJECT = eINSTANCE.getEndsyncTypeObject();

		/**
		 * The meta object literal for the '<em>Fade Color Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFadeColorTypeObject()
		 * @generated
		 */
		EDataType FADE_COLOR_TYPE_OBJECT = eINSTANCE.getFadeColorTypeObject();

		/**
		 * The meta object literal for the '<em>Fill Default Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFillDefaultTypeObject()
		 * @generated
		 */
		EDataType FILL_DEFAULT_TYPE_OBJECT = eINSTANCE.getFillDefaultTypeObject();

		/**
		 * The meta object literal for the '<em>Fill Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getFillTypeObject()
		 * @generated
		 */
		EDataType FILL_TYPE_OBJECT = eINSTANCE.getFillTypeObject();

		/**
		 * The meta object literal for the '<em>Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getModeTypeObject()
		 * @generated
		 */
		EDataType MODE_TYPE_OBJECT = eINSTANCE.getModeTypeObject();

		/**
		 * The meta object literal for the '<em>Repeat Count Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRepeatCountType()
		 * @generated
		 */
		EDataType REPEAT_COUNT_TYPE = eINSTANCE.getRepeatCountType();

		/**
		 * The meta object literal for the '<em>Repeat Count Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRepeatCountTypeMember1Object()
		 * @generated
		 */
		EDataType REPEAT_COUNT_TYPE_MEMBER1_OBJECT = eINSTANCE.getRepeatCountTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Restart Default Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRestartDefaultTypeObject()
		 * @generated
		 */
		EDataType RESTART_DEFAULT_TYPE_OBJECT = eINSTANCE.getRestartDefaultTypeObject();

		/**
		 * The meta object literal for the '<em>Restart Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl#getRestartTypeObject()
		 * @generated
		 */
		EDataType RESTART_TYPE_OBJECT = eINSTANCE.getRestartTypeObject();

	}

} //CompatiblePackage
