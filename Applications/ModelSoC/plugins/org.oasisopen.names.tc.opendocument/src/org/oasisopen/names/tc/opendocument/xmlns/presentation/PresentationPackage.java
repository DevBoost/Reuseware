/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationFactory
 * @model kind="package"
 * @generated
 */
public interface PresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "presentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfpresentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationGroupTypeImpl <em>Animation Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationGroupTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getAnimationGroupType()
	 * @generated
	 */
	int ANIMATION_GROUP_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Presentation Animation Elements Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Presentation Animation Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Animation Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_GROUP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationsType1Impl <em>Animations Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationsType1Impl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getAnimationsType1()
	 * @generated
	 */
	int ANIMATIONS_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATIONS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Presentation Animation Elements Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Presentation Animation Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Animation Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATIONS_TYPE1__ANIMATION_GROUP = 3;

	/**
	 * The number of structural features of the '<em>Animations Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATIONS_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DateTimeDeclTypeImpl <em>Date Time Decl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DateTimeDeclTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getDateTimeDeclType()
	 * @generated
	 */
	int DATE_TIME_DECL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DECL_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Data Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DECL_TYPE__DATA_STYLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DECL_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DECL_TYPE__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Date Time Decl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DECL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DateTimeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Date Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DimTypeImpl <em>Dim Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DimTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getDimType()
	 * @generated
	 */
	int DIM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__SOUND = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__SHAPE_ID = 2;

	/**
	 * The number of structural features of the '<em>Dim Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl <em>Event Listener Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getEventListenerType()
	 * @generated
	 */
	int EVENT_LISTENER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__SOUND = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__DIRECTION = 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__EVENT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__HREF = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__SPEED = 8;

	/**
	 * The feature id for the '<em><b>Start Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__START_SCALE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__VERB = 11;

	/**
	 * The number of structural features of the '<em>Event Listener Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.FooterDeclTypeImpl <em>Footer Decl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.FooterDeclTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getFooterDeclType()
	 * @generated
	 */
	int FOOTER_DECL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_DECL_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_DECL_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Footer Decl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_DECL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.FooterTypeImpl <em>Footer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.FooterTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getFooterType()
	 * @generated
	 */
	int FOOTER_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Footer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HeaderDeclTypeImpl <em>Header Decl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HeaderDeclTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getHeaderDeclType()
	 * @generated
	 */
	int HEADER_DECL_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DECL_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DECL_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Header Decl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DECL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HeaderTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 9;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideShapeTypeImpl <em>Hide Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideShapeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getHideShapeType()
	 * @generated
	 */
	int HIDE_SHAPE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE__SOUND = 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE__DELAY = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE__EFFECT = 3;

	/**
	 * The feature id for the '<em><b>Path Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE__PATH_ID = 4;

	/**
	 * The feature id for the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE__SHAPE_ID = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE__SPEED = 6;

	/**
	 * The feature id for the '<em><b>Start Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE__START_SCALE = 7;

	/**
	 * The number of structural features of the '<em>Hide Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_SHAPE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl <em>Hide Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getHideTextType()
	 * @generated
	 */
	int HIDE_TEXT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE__SOUND = 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE__DELAY = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE__EFFECT = 3;

	/**
	 * The feature id for the '<em><b>Path Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE__PATH_ID = 4;

	/**
	 * The feature id for the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE__SHAPE_ID = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE__SPEED = 6;

	/**
	 * The feature id for the '<em><b>Start Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE__START_SCALE = 7;

	/**
	 * The number of structural features of the '<em>Hide Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_TEXT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl <em>Notes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getNotesType()
	 * @generated
	 */
	int NOTES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__FORMS = 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__RECT = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__LINE = 3;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__POLYLINE = 4;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__POLYGON = 5;

	/**
	 * The feature id for the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__REGULAR_POLYGON = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__PATH = 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__CIRCLE = 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__ELLIPSE = 9;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__G = 10;

	/**
	 * The feature id for the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__PAGE_THUMBNAIL = 11;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__FRAME = 12;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__MEASURE = 13;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__CAPTION = 14;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__CONNECTOR = 15;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__CONTROL = 16;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__SCENE = 17;

	/**
	 * The feature id for the '<em><b>Custom Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__CUSTOM_SHAPE = 18;

	/**
	 * The feature id for the '<em><b>Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__PAGE_LAYOUT_NAME = 19;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__STYLE_NAME = 20;

	/**
	 * The feature id for the '<em><b>Use Date Time Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__USE_DATE_TIME_NAME = 21;

	/**
	 * The feature id for the '<em><b>Use Footer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__USE_FOOTER_NAME = 22;

	/**
	 * The feature id for the '<em><b>Use Header Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__USE_HEADER_NAME = 23;

	/**
	 * The number of structural features of the '<em>Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl <em>Placeholder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPlaceholderType()
	 * @generated
	 */
	int PLACEHOLDER_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_TYPE__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_TYPE__OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_TYPE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_TYPE__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_TYPE__Y = 4;

	/**
	 * The number of structural features of the '<em>Placeholder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlayTypeImpl <em>Play Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlayTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPlayType()
	 * @generated
	 */
	int PLAY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE__SHAPE_ID = 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE__SPEED = 1;

	/**
	 * The number of structural features of the '<em>Play Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl <em>Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getSettingsType()
	 * @generated
	 */
	int SETTINGS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Show</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__SHOW = 0;

	/**
	 * The feature id for the '<em><b>Animations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__ANIMATIONS = 1;

	/**
	 * The feature id for the '<em><b>Endless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__ENDLESS = 2;

	/**
	 * The feature id for the '<em><b>Force Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__FORCE_MANUAL = 3;

	/**
	 * The feature id for the '<em><b>Full Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__FULL_SCREEN = 4;

	/**
	 * The feature id for the '<em><b>Mouse As Pen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__MOUSE_AS_PEN = 5;

	/**
	 * The feature id for the '<em><b>Mouse Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__MOUSE_VISIBLE = 6;

	/**
	 * The feature id for the '<em><b>Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__PAUSE = 7;

	/**
	 * The feature id for the '<em><b>Show1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__SHOW1 = 8;

	/**
	 * The feature id for the '<em><b>Show End Of Presentation Slide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE = 9;

	/**
	 * The feature id for the '<em><b>Show Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__SHOW_LOGO = 10;

	/**
	 * The feature id for the '<em><b>Start Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__START_PAGE = 11;

	/**
	 * The feature id for the '<em><b>Start With Navigator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__START_WITH_NAVIGATOR = 12;

	/**
	 * The feature id for the '<em><b>Stay On Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__STAY_ON_TOP = 13;

	/**
	 * The feature id for the '<em><b>Transition On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE__TRANSITION_ON_CLICK = 14;

	/**
	 * The number of structural features of the '<em>Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowShapeTypeImpl <em>Show Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowShapeTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getShowShapeType()
	 * @generated
	 */
	int SHOW_SHAPE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE__SOUND = 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE__DELAY = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE__EFFECT = 3;

	/**
	 * The feature id for the '<em><b>Path Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE__PATH_ID = 4;

	/**
	 * The feature id for the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE__SHAPE_ID = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE__SPEED = 6;

	/**
	 * The feature id for the '<em><b>Start Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE__START_SCALE = 7;

	/**
	 * The number of structural features of the '<em>Show Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SHAPE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowTextTypeImpl <em>Show Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowTextTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getShowTextType()
	 * @generated
	 */
	int SHOW_TEXT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE__SOUND = 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE__DELAY = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE__EFFECT = 3;

	/**
	 * The feature id for the '<em><b>Path Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE__PATH_ID = 4;

	/**
	 * The feature id for the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE__SHAPE_ID = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE__SPEED = 6;

	/**
	 * The feature id for the '<em><b>Start Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE__START_SCALE = 7;

	/**
	 * The number of structural features of the '<em>Show Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TEXT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowTypeImpl <em>Show Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getShowType()
	 * @generated
	 */
	int SHOW_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TYPE__PAGES = 1;

	/**
	 * The number of structural features of the '<em>Show Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SoundTypeImpl <em>Sound Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SoundTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getSoundType()
	 * @generated
	 */
	int SOUND_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_TYPE__HREF = 1;

	/**
	 * The feature id for the '<em><b>Play Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_TYPE__PLAY_FULL = 2;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_TYPE__SHOW = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_TYPE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Sound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 20;

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
	 * The feature id for the '<em><b>Animation Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANIMATION_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Animations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANIMATIONS = 4;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_TIME = 5;

	/**
	 * The feature id for the '<em><b>Date Time Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_TIME_DECL = 6;

	/**
	 * The feature id for the '<em><b>Dim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIM = 7;

	/**
	 * The feature id for the '<em><b>Event Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_LISTENER = 8;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTER = 9;

	/**
	 * The feature id for the '<em><b>Footer Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTER_DECL = 10;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER = 11;

	/**
	 * The feature id for the '<em><b>Header Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER_DECL = 12;

	/**
	 * The feature id for the '<em><b>Hide Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIDE_SHAPE = 13;

	/**
	 * The feature id for the '<em><b>Hide Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIDE_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTES = 15;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACEHOLDER = 16;

	/**
	 * The feature id for the '<em><b>Play</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAY = 17;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SETTINGS = 18;

	/**
	 * The feature id for the '<em><b>Show</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW = 19;

	/**
	 * The feature id for the '<em><b>Show Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW_SHAPE = 20;

	/**
	 * The feature id for the '<em><b>Show Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW_TEXT = 21;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOUND = 22;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION = 23;

	/**
	 * The feature id for the '<em><b>Animations1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANIMATIONS1 = 24;

	/**
	 * The feature id for the '<em><b>Background Objects Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE = 25;

	/**
	 * The feature id for the '<em><b>Background Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BACKGROUND_VISIBLE = 26;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS = 27;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS_NAMES = 28;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELAY = 29;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIRECTION = 30;

	/**
	 * The feature id for the '<em><b>Display Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_DATE_TIME = 31;

	/**
	 * The feature id for the '<em><b>Display Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_FOOTER = 32;

	/**
	 * The feature id for the '<em><b>Display Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_HEADER = 33;

	/**
	 * The feature id for the '<em><b>Display Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER = 34;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DURATION = 35;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EFFECT = 36;

	/**
	 * The feature id for the '<em><b>Endless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDLESS = 37;

	/**
	 * The feature id for the '<em><b>Force Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORCE_MANUAL = 38;

	/**
	 * The feature id for the '<em><b>Full Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FULL_SCREEN = 39;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP_ID = 40;

	/**
	 * The feature id for the '<em><b>Master Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_ELEMENT = 41;

	/**
	 * The feature id for the '<em><b>Mouse As Pen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOUSE_AS_PEN = 42;

	/**
	 * The feature id for the '<em><b>Mouse Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOUSE_VISIBLE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 44;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NODE_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGES = 46;

	/**
	 * The feature id for the '<em><b>Path Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATH_ID = 47;

	/**
	 * The feature id for the '<em><b>Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAUSE = 48;

	/**
	 * The feature id for the '<em><b>Placeholder1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACEHOLDER1 = 49;

	/**
	 * The feature id for the '<em><b>Play Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAY_FULL = 50;

	/**
	 * The feature id for the '<em><b>Presentation Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT_NAME = 51;

	/**
	 * The feature id for the '<em><b>Preset Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRESET_CLASS = 52;

	/**
	 * The feature id for the '<em><b>Preset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRESET_ID = 53;

	/**
	 * The feature id for the '<em><b>Preset Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRESET_SUB_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Show1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW1 = 55;

	/**
	 * The feature id for the '<em><b>Show End Of Presentation Slide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE = 56;

	/**
	 * The feature id for the '<em><b>Show Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW_LOGO = 57;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE = 58;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPEED = 59;

	/**
	 * The feature id for the '<em><b>Start Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_PAGE = 60;

	/**
	 * The feature id for the '<em><b>Start Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_SCALE = 61;

	/**
	 * The feature id for the '<em><b>Start With Navigator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_WITH_NAVIGATOR = 62;

	/**
	 * The feature id for the '<em><b>Stay On Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STAY_ON_TOP = 63;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_NAME = 64;

	/**
	 * The feature id for the '<em><b>Transition On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION_ON_CLICK = 65;

	/**
	 * The feature id for the '<em><b>Transition Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION_SPEED = 66;

	/**
	 * The feature id for the '<em><b>Transition Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION_STYLE = 67;

	/**
	 * The feature id for the '<em><b>Transition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Use Date Time Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_DATE_TIME_NAME = 69;

	/**
	 * The feature id for the '<em><b>Use Footer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_FOOTER_NAME = 70;

	/**
	 * The feature id for the '<em><b>Use Header Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_HEADER_NAME = 71;

	/**
	 * The feature id for the '<em><b>User Transformed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_TRANSFORMED = 72;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERB = 73;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISIBILITY = 74;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 75;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType <em>Animations Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getAnimationsType()
	 * @generated
	 */
	int ANIMATIONS_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType <em>Node Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getNodeTypeType()
	 * @generated
	 */
	int NODE_TYPE_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType <em>Preset Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPresetClassType()
	 * @generated
	 */
	int PRESET_CLASS_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType <em>Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType <em>Transition On Click Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionOnClickType()
	 * @generated
	 */
	int TRANSITION_ON_CLICK_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType <em>Transition Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionStyleType()
	 * @generated
	 */
	int TRANSITION_STYLE_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType <em>Transition Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionTypeType()
	 * @generated
	 */
	int TRANSITION_TYPE_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType <em>Visibility Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getVisibilityType()
	 * @generated
	 */
	int VISIBILITY_TYPE = 29;

	/**
	 * The meta object id for the '<em>Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getActionTypeObject()
	 * @generated
	 */
	int ACTION_TYPE_OBJECT = 30;

	/**
	 * The meta object id for the '<em>Animations Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getAnimationsTypeObject()
	 * @generated
	 */
	int ANIMATIONS_TYPE_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Node Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getNodeTypeTypeObject()
	 * @generated
	 */
	int NODE_TYPE_TYPE_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Page Layout Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPresentationPageLayoutNameType()
	 * @generated
	 */
	int PRESENTATION_PAGE_LAYOUT_NAME_TYPE = 33;

	/**
	 * The meta object id for the '<em>Page Layout Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPresentationPageLayoutNameTypeMember1()
	 * @generated
	 */
	int PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1 = 34;

	/**
	 * The meta object id for the '<em>Preset Class Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPresetClassTypeObject()
	 * @generated
	 */
	int PRESET_CLASS_TYPE_OBJECT = 35;

	/**
	 * The meta object id for the '<em>Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getSourceTypeObject()
	 * @generated
	 */
	int SOURCE_TYPE_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Style Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getStyleNameType()
	 * @generated
	 */
	int STYLE_NAME_TYPE = 37;

	/**
	 * The meta object id for the '<em>Style Name Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getStyleNameTypeMember1()
	 * @generated
	 */
	int STYLE_NAME_TYPE_MEMBER1 = 38;

	/**
	 * The meta object id for the '<em>Transition On Click Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionOnClickTypeObject()
	 * @generated
	 */
	int TRANSITION_ON_CLICK_TYPE_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Transition Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionStyleTypeObject()
	 * @generated
	 */
	int TRANSITION_STYLE_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Transition Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionTypeTypeObject()
	 * @generated
	 */
	int TRANSITION_TYPE_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Visibility Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getVisibilityTypeObject()
	 * @generated
	 */
	int VISIBILITY_TYPE_OBJECT = 42;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType <em>Animation Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation Group Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType
	 * @generated
	 */
	EClass getAnimationGroupType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType#getPresentationAnimationElementsGroup <em>Presentation Animation Elements Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Presentation Animation Elements Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType#getPresentationAnimationElementsGroup()
	 * @see #getAnimationGroupType()
	 * @generated
	 */
	EAttribute getAnimationGroupType_PresentationAnimationElementsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType#getPresentationAnimationElements <em>Presentation Animation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentation Animation Elements</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType#getPresentationAnimationElements()
	 * @see #getAnimationGroupType()
	 * @generated
	 */
	EReference getAnimationGroupType_PresentationAnimationElements();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1 <em>Animations Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animations Type1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1
	 * @generated
	 */
	EClass getAnimationsType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1#getGroup()
	 * @see #getAnimationsType1()
	 * @generated
	 */
	EAttribute getAnimationsType1_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1#getPresentationAnimationElementsGroup <em>Presentation Animation Elements Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Presentation Animation Elements Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1#getPresentationAnimationElementsGroup()
	 * @see #getAnimationsType1()
	 * @generated
	 */
	EAttribute getAnimationsType1_PresentationAnimationElementsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1#getPresentationAnimationElements <em>Presentation Animation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentation Animation Elements</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1#getPresentationAnimationElements()
	 * @see #getAnimationsType1()
	 * @generated
	 */
	EReference getAnimationsType1_PresentationAnimationElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1#getAnimationGroup <em>Animation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animation Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1#getAnimationGroup()
	 * @see #getAnimationsType1()
	 * @generated
	 */
	EReference getAnimationsType1_AnimationGroup();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType <em>Date Time Decl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Decl Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType
	 * @generated
	 */
	EClass getDateTimeDeclType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType#getMixed()
	 * @see #getDateTimeDeclType()
	 * @generated
	 */
	EAttribute getDateTimeDeclType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType#getDataStyleName <em>Data Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType#getDataStyleName()
	 * @see #getDateTimeDeclType()
	 * @generated
	 */
	EAttribute getDateTimeDeclType_DataStyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType#getName()
	 * @see #getDateTimeDeclType()
	 * @generated
	 */
	EAttribute getDateTimeDeclType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType#getSource()
	 * @see #getDateTimeDeclType()
	 * @generated
	 */
	EAttribute getDateTimeDeclType_Source();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeType
	 * @generated
	 */
	EClass getDateTimeType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType <em>Dim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dim Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType
	 * @generated
	 */
	EClass getDimType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sound</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getSound()
	 * @see #getDimType()
	 * @generated
	 */
	EReference getDimType_Sound();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getColor()
	 * @see #getDimType()
	 * @generated
	 */
	EAttribute getDimType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getShapeId <em>Shape Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getShapeId()
	 * @see #getDimType()
	 * @generated
	 */
	EAttribute getDimType_ShapeId();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType <em>Event Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Listener Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType
	 * @generated
	 */
	EClass getEventListenerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sound</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSound()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EReference getEventListenerType_Sound();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getAction()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getActuate()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getDirection()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEffect()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Effect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEventName()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_EventName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getHref()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getShow()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSpeed()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getStartScale <em>Start Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getStartScale()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_StartScale();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getType()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verb</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getVerb()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Verb();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterDeclType <em>Footer Decl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer Decl Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterDeclType
	 * @generated
	 */
	EClass getFooterDeclType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterDeclType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterDeclType#getMixed()
	 * @see #getFooterDeclType()
	 * @generated
	 */
	EAttribute getFooterDeclType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterDeclType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterDeclType#getName()
	 * @see #getFooterDeclType()
	 * @generated
	 */
	EAttribute getFooterDeclType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterType <em>Footer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterType
	 * @generated
	 */
	EClass getFooterType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderDeclType <em>Header Decl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Decl Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderDeclType
	 * @generated
	 */
	EClass getHeaderDeclType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderDeclType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderDeclType#getMixed()
	 * @see #getHeaderDeclType()
	 * @generated
	 */
	EAttribute getHeaderDeclType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderDeclType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderDeclType#getName()
	 * @see #getHeaderDeclType()
	 * @generated
	 */
	EAttribute getHeaderDeclType_Name();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderType
	 * @generated
	 */
	EClass getHeaderType();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType <em>Hide Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide Shape Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType
	 * @generated
	 */
	EClass getHideShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sound</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getSound()
	 * @see #getHideShapeType()
	 * @generated
	 */
	EReference getHideShapeType_Sound();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getDelay()
	 * @see #getHideShapeType()
	 * @generated
	 */
	EAttribute getHideShapeType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getDirection()
	 * @see #getHideShapeType()
	 * @generated
	 */
	EAttribute getHideShapeType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getEffect()
	 * @see #getHideShapeType()
	 * @generated
	 */
	EAttribute getHideShapeType_Effect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getPathId <em>Path Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getPathId()
	 * @see #getHideShapeType()
	 * @generated
	 */
	EAttribute getHideShapeType_PathId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getShapeId <em>Shape Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getShapeId()
	 * @see #getHideShapeType()
	 * @generated
	 */
	EAttribute getHideShapeType_ShapeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getSpeed()
	 * @see #getHideShapeType()
	 * @generated
	 */
	EAttribute getHideShapeType_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getStartScale <em>Start Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType#getStartScale()
	 * @see #getHideShapeType()
	 * @generated
	 */
	EAttribute getHideShapeType_StartScale();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType <em>Hide Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide Text Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType
	 * @generated
	 */
	EClass getHideTextType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sound</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getSound()
	 * @see #getHideTextType()
	 * @generated
	 */
	EReference getHideTextType_Sound();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getDelay()
	 * @see #getHideTextType()
	 * @generated
	 */
	EAttribute getHideTextType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getDirection()
	 * @see #getHideTextType()
	 * @generated
	 */
	EAttribute getHideTextType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getEffect()
	 * @see #getHideTextType()
	 * @generated
	 */
	EAttribute getHideTextType_Effect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getPathId <em>Path Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getPathId()
	 * @see #getHideTextType()
	 * @generated
	 */
	EAttribute getHideTextType_PathId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getShapeId <em>Shape Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getShapeId()
	 * @see #getHideTextType()
	 * @generated
	 */
	EAttribute getHideTextType_ShapeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getSpeed()
	 * @see #getHideTextType()
	 * @generated
	 */
	EAttribute getHideTextType_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getStartScale <em>Start Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType#getStartScale()
	 * @see #getHideTextType()
	 * @generated
	 */
	EAttribute getHideTextType_StartScale();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType <em>Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notes Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType
	 * @generated
	 */
	EClass getNotesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forms</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getForms()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Forms();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getShape()
	 * @see #getNotesType()
	 * @generated
	 */
	EAttribute getNotesType_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getRect()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Rect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getLine()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polyline</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPolyline()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Polyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPolygon()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getRegularPolygon <em>Regular Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Polygon</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getRegularPolygon()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_RegularPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPath()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getCircle()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getEllipse()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>G</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getG()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_G();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPageThumbnail <em>Page Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Thumbnail</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPageThumbnail()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_PageThumbnail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getFrame()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getMeasure()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getCaption()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getConnector()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getControl()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getScene()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getCustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getCustomShape()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_CustomShape();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPageLayoutName <em>Page Layout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Layout Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getPageLayoutName()
	 * @see #getNotesType()
	 * @generated
	 */
	EAttribute getNotesType_PageLayoutName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getStyleName()
	 * @see #getNotesType()
	 * @generated
	 */
	EAttribute getNotesType_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getUseDateTimeName <em>Use Date Time Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Date Time Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getUseDateTimeName()
	 * @see #getNotesType()
	 * @generated
	 */
	EAttribute getNotesType_UseDateTimeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getUseFooterName <em>Use Footer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Footer Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getUseFooterName()
	 * @see #getNotesType()
	 * @generated
	 */
	EAttribute getNotesType_UseFooterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getUseHeaderName <em>Use Header Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Header Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType#getUseHeaderName()
	 * @see #getNotesType()
	 * @generated
	 */
	EAttribute getNotesType_UseHeaderName();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType <em>Placeholder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType
	 * @generated
	 */
	EClass getPlaceholderType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getHeight()
	 * @see #getPlaceholderType()
	 * @generated
	 */
	EAttribute getPlaceholderType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getObject()
	 * @see #getPlaceholderType()
	 * @generated
	 */
	EAttribute getPlaceholderType_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getWidth()
	 * @see #getPlaceholderType()
	 * @generated
	 */
	EAttribute getPlaceholderType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getX()
	 * @see #getPlaceholderType()
	 * @generated
	 */
	EAttribute getPlaceholderType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getY()
	 * @see #getPlaceholderType()
	 * @generated
	 */
	EAttribute getPlaceholderType_Y();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType <em>Play Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType
	 * @generated
	 */
	EClass getPlayType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType#getShapeId <em>Shape Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType#getShapeId()
	 * @see #getPlayType()
	 * @generated
	 */
	EAttribute getPlayType_ShapeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType#getSpeed()
	 * @see #getPlayType()
	 * @generated
	 */
	EAttribute getPlayType_Speed();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType <em>Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType
	 * @generated
	 */
	EClass getSettingsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShow()
	 * @see #getSettingsType()
	 * @generated
	 */
	EReference getSettingsType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getAnimations <em>Animations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getAnimations()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_Animations();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getEndless <em>Endless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endless</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getEndless()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_Endless();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getForceManual <em>Force Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Manual</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getForceManual()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_ForceManual();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getFullScreen <em>Full Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Screen</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getFullScreen()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_FullScreen();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseAsPen <em>Mouse As Pen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mouse As Pen</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseAsPen()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_MouseAsPen();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseVisible <em>Mouse Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mouse Visible</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseVisible()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_MouseVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getPause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pause</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getPause()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_Pause();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShow1 <em>Show1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShow1()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_Show1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show End Of Presentation Slide</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowEndOfPresentationSlide()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_ShowEndOfPresentationSlide();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowLogo <em>Show Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Logo</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowLogo()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_ShowLogo();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartPage <em>Start Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartPage()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_StartPage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartWithNavigator <em>Start With Navigator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start With Navigator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartWithNavigator()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_StartWithNavigator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStayOnTop <em>Stay On Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stay On Top</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStayOnTop()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_StayOnTop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getTransitionOnClick <em>Transition On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition On Click</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getTransitionOnClick()
	 * @see #getSettingsType()
	 * @generated
	 */
	EAttribute getSettingsType_TransitionOnClick();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType <em>Show Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Shape Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType
	 * @generated
	 */
	EClass getShowShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sound</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSound()
	 * @see #getShowShapeType()
	 * @generated
	 */
	EReference getShowShapeType_Sound();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDelay()
	 * @see #getShowShapeType()
	 * @generated
	 */
	EAttribute getShowShapeType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDirection()
	 * @see #getShowShapeType()
	 * @generated
	 */
	EAttribute getShowShapeType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getEffect()
	 * @see #getShowShapeType()
	 * @generated
	 */
	EAttribute getShowShapeType_Effect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getPathId <em>Path Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getPathId()
	 * @see #getShowShapeType()
	 * @generated
	 */
	EAttribute getShowShapeType_PathId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getShapeId <em>Shape Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getShapeId()
	 * @see #getShowShapeType()
	 * @generated
	 */
	EAttribute getShowShapeType_ShapeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSpeed()
	 * @see #getShowShapeType()
	 * @generated
	 */
	EAttribute getShowShapeType_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getStartScale <em>Start Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getStartScale()
	 * @see #getShowShapeType()
	 * @generated
	 */
	EAttribute getShowShapeType_StartScale();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType <em>Show Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Text Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType
	 * @generated
	 */
	EClass getShowTextType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sound</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getSound()
	 * @see #getShowTextType()
	 * @generated
	 */
	EReference getShowTextType_Sound();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getDelay()
	 * @see #getShowTextType()
	 * @generated
	 */
	EAttribute getShowTextType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getDirection()
	 * @see #getShowTextType()
	 * @generated
	 */
	EAttribute getShowTextType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getEffect()
	 * @see #getShowTextType()
	 * @generated
	 */
	EAttribute getShowTextType_Effect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getPathId <em>Path Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getPathId()
	 * @see #getShowTextType()
	 * @generated
	 */
	EAttribute getShowTextType_PathId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getShapeId <em>Shape Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getShapeId()
	 * @see #getShowTextType()
	 * @generated
	 */
	EAttribute getShowTextType_ShapeId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getSpeed()
	 * @see #getShowTextType()
	 * @generated
	 */
	EAttribute getShowTextType_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getStartScale <em>Start Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType#getStartScale()
	 * @see #getShowTextType()
	 * @generated
	 */
	EAttribute getShowTextType_StartScale();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType <em>Show Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType
	 * @generated
	 */
	EClass getShowType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType#getName()
	 * @see #getShowType()
	 * @generated
	 */
	EAttribute getShowType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType#getPages()
	 * @see #getShowType()
	 * @generated
	 */
	EAttribute getShowType_Pages();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType <em>Sound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType
	 * @generated
	 */
	EClass getSoundType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getActuate()
	 * @see #getSoundType()
	 * @generated
	 */
	EAttribute getSoundType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getHref()
	 * @see #getSoundType()
	 * @generated
	 */
	EAttribute getSoundType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getPlayFull <em>Play Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Full</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getPlayFull()
	 * @see #getSoundType()
	 * @generated
	 */
	EAttribute getSoundType_PlayFull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getShow()
	 * @see #getSoundType()
	 * @generated
	 */
	EAttribute getSoundType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType#getType()
	 * @see #getSoundType()
	 * @generated
	 */
	EAttribute getSoundType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimationGroup <em>Animation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animation Group</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimationGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AnimationGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations <em>Animations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animations</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Animations();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDateTime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDateTimeDecl <em>Date Time Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Decl</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDateTimeDecl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateTimeDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDim <em>Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dim</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDim()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dim();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listener</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEventListener()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EventListener();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFooter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Footer();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFooterDecl <em>Footer Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer Decl</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFooterDecl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FooterDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHeader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHeaderDecl <em>Header Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Decl</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHeaderDecl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HeaderDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHideShape <em>Hide Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hide Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHideShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HideShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHideText <em>Hide Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hide Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHideText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HideText();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notes</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNotes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Notes();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placeholder</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Placeholder();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Play</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Play();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSettings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Show</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Show();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowShape <em>Show Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Show Shape</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShowShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowText <em>Show Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Show Text</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShowText();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sound</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSound()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sound();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations1 <em>Animations1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animations1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Animations1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundObjectsVisible <em>Background Objects Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Objects Visible</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundObjectsVisible()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BackgroundObjectsVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundVisible <em>Background Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Visible</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundVisible()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BackgroundVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClass_()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Names</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClassNames()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDelay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDirection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayDateTime <em>Display Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Date Time</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayDateTime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayFooter <em>Display Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Footer</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayFooter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayFooter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayHeader <em>Display Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Header</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayHeader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayPageNumber <em>Display Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Page Number</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayPageNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDuration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEffect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Effect();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEndless <em>Endless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endless</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEndless()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Endless();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getForceManual <em>Force Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Manual</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getForceManual()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ForceManual();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFullScreen <em>Full Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Screen</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFullScreen()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FullScreen();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getGroupId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMasterElement <em>Master Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Element</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMasterElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MasterElement();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseAsPen <em>Mouse As Pen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mouse As Pen</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseAsPen()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MouseAsPen();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseVisible <em>Mouse Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mouse Visible</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseVisible()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MouseVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNodeType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPages()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Pages();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPathId <em>Path Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPathId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PathId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pause</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Pause();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder1 <em>Placeholder1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Placeholder1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlayFull <em>Play Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Full</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlayFull()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PlayFull();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresentationPageLayoutName <em>Presentation Page Layout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Page Layout Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresentationPageLayoutName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PresentationPageLayoutName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetClass <em>Preset Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Class</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PresetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetId <em>Preset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Id</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PresetId();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetSubType <em>Preset Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset Sub Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetSubType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PresetSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShow1 <em>Show1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShow1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Show1();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show End Of Presentation Slide</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowEndOfPresentationSlide()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShowEndOfPresentationSlide();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowLogo <em>Show Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Logo</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowLogo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShowLogo();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSpeed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartPage <em>Start Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Page</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartPage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartScale <em>Start Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Scale</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartScale();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartWithNavigator <em>Start With Navigator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start With Navigator</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartWithNavigator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartWithNavigator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStayOnTop <em>Stay On Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stay On Top</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStayOnTop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StayOnTop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStyleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionOnClick <em>Transition On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition On Click</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionOnClick()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransitionOnClick();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionSpeed <em>Transition Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Speed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionSpeed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransitionSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionStyle <em>Transition Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransitionStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransitionType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseDateTimeName <em>Use Date Time Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Date Time Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseDateTimeName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UseDateTimeName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseFooterName <em>Use Footer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Footer Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseFooterName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UseFooterName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseHeaderName <em>Use Header Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Header Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseHeaderName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UseHeaderName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUserTransformed <em>User Transformed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Transformed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUserTransformed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UserTransformed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verb</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVerb()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Verb();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVisibility()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Visibility();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType <em>Animations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Animations Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
	 * @generated
	 */
	EEnum getAnimationsType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType <em>Node Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
	 * @generated
	 */
	EEnum getNodeTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType <em>Preset Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Preset Class Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
	 * @generated
	 */
	EEnum getPresetClassType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType
	 * @generated
	 */
	EEnum getSourceType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType <em>Transition On Click Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition On Click Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
	 * @generated
	 */
	EEnum getTransitionOnClickType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType <em>Transition Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Style Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType
	 * @generated
	 */
	EEnum getTransitionStyleType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType <em>Transition Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Type Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType
	 * @generated
	 */
	EEnum getTransitionTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType
	 * @generated
	 */
	EEnum getVisibilityType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType <em>Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Action Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType"
	 *        extendedMetaData="name='action_._type:Object' baseType='action_._type'"
	 * @generated
	 */
	EDataType getActionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType <em>Animations Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Animations Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType"
	 *        extendedMetaData="name='animations_._type:Object' baseType='animations_._type'"
	 * @generated
	 */
	EDataType getAnimationsTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType <em>Node Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType"
	 *        extendedMetaData="name='node-type_._type:Object' baseType='node-type_._type'"
	 * @generated
	 */
	EDataType getNodeTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Page Layout Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Page Layout Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='presentation-page-layout-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef presentation-page-layout-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getPresentationPageLayoutNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Page Layout Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Page Layout Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='presentation-page-layout-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getPresentationPageLayoutNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType <em>Preset Class Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Preset Class Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType"
	 *        extendedMetaData="name='preset-class_._type:Object' baseType='preset-class_._type'"
	 * @generated
	 */
	EDataType getPresetClassTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType <em>Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Source Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType"
	 *        extendedMetaData="name='source_._type:Object' baseType='source_._type'"
	 * @generated
	 */
	EDataType getSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Style Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='style-name_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef style-name_._type_._member_._1'"
	 * @generated
	 */
	EDataType getStyleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Style Name Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Name Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='style-name_._type_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' length='0'"
	 * @generated
	 */
	EDataType getStyleNameTypeMember1();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType <em>Transition On Click Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transition On Click Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType"
	 *        extendedMetaData="name='transition-on-click_._type:Object' baseType='transition-on-click_._type'"
	 * @generated
	 */
	EDataType getTransitionOnClickTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType <em>Transition Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transition Style Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType"
	 *        extendedMetaData="name='transition-style_._type:Object' baseType='transition-style_._type'"
	 * @generated
	 */
	EDataType getTransitionStyleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType <em>Transition Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transition Type Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType"
	 *        extendedMetaData="name='transition-type_._type:Object' baseType='transition-type_._type'"
	 * @generated
	 */
	EDataType getTransitionTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType <em>Visibility Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Visibility Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType"
	 *        extendedMetaData="name='visibility_._type:Object' baseType='visibility_._type'"
	 * @generated
	 */
	EDataType getVisibilityTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PresentationFactory getPresentationFactory();

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
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationGroupTypeImpl <em>Animation Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationGroupTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getAnimationGroupType()
		 * @generated
		 */
		EClass ANIMATION_GROUP_TYPE = eINSTANCE.getAnimationGroupType();

		/**
		 * The meta object literal for the '<em><b>Presentation Animation Elements Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP = eINSTANCE.getAnimationGroupType_PresentationAnimationElementsGroup();

		/**
		 * The meta object literal for the '<em><b>Presentation Animation Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS = eINSTANCE.getAnimationGroupType_PresentationAnimationElements();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationsType1Impl <em>Animations Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationsType1Impl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getAnimationsType1()
		 * @generated
		 */
		EClass ANIMATIONS_TYPE1 = eINSTANCE.getAnimationsType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATIONS_TYPE1__GROUP = eINSTANCE.getAnimationsType1_Group();

		/**
		 * The meta object literal for the '<em><b>Presentation Animation Elements Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP = eINSTANCE.getAnimationsType1_PresentationAnimationElementsGroup();

		/**
		 * The meta object literal for the '<em><b>Presentation Animation Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS = eINSTANCE.getAnimationsType1_PresentationAnimationElements();

		/**
		 * The meta object literal for the '<em><b>Animation Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMATIONS_TYPE1__ANIMATION_GROUP = eINSTANCE.getAnimationsType1_AnimationGroup();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DateTimeDeclTypeImpl <em>Date Time Decl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DateTimeDeclTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getDateTimeDeclType()
		 * @generated
		 */
		EClass DATE_TIME_DECL_TYPE = eINSTANCE.getDateTimeDeclType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DECL_TYPE__MIXED = eINSTANCE.getDateTimeDeclType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Data Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DECL_TYPE__DATA_STYLE_NAME = eINSTANCE.getDateTimeDeclType_DataStyleName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DECL_TYPE__NAME = eINSTANCE.getDateTimeDeclType_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DECL_TYPE__SOURCE = eINSTANCE.getDateTimeDeclType_Source();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DateTimeTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getDateTimeType()
		 * @generated
		 */
		EClass DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DimTypeImpl <em>Dim Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DimTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getDimType()
		 * @generated
		 */
		EClass DIM_TYPE = eINSTANCE.getDimType();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIM_TYPE__SOUND = eINSTANCE.getDimType_Sound();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIM_TYPE__COLOR = eINSTANCE.getDimType_Color();

		/**
		 * The meta object literal for the '<em><b>Shape Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIM_TYPE__SHAPE_ID = eINSTANCE.getDimType_ShapeId();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl <em>Event Listener Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getEventListenerType()
		 * @generated
		 */
		EClass EVENT_LISTENER_TYPE = eINSTANCE.getEventListenerType();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LISTENER_TYPE__SOUND = eINSTANCE.getEventListenerType_Sound();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__ACTION = eINSTANCE.getEventListenerType_Action();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__ACTUATE = eINSTANCE.getEventListenerType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__DIRECTION = eINSTANCE.getEventListenerType_Direction();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__EFFECT = eINSTANCE.getEventListenerType_Effect();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__EVENT_NAME = eINSTANCE.getEventListenerType_EventName();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__HREF = eINSTANCE.getEventListenerType_Href();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__SHOW = eINSTANCE.getEventListenerType_Show();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__SPEED = eINSTANCE.getEventListenerType_Speed();

		/**
		 * The meta object literal for the '<em><b>Start Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__START_SCALE = eINSTANCE.getEventListenerType_StartScale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__TYPE = eINSTANCE.getEventListenerType_Type();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__VERB = eINSTANCE.getEventListenerType_Verb();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.FooterDeclTypeImpl <em>Footer Decl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.FooterDeclTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getFooterDeclType()
		 * @generated
		 */
		EClass FOOTER_DECL_TYPE = eINSTANCE.getFooterDeclType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER_DECL_TYPE__MIXED = eINSTANCE.getFooterDeclType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER_DECL_TYPE__NAME = eINSTANCE.getFooterDeclType_Name();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.FooterTypeImpl <em>Footer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.FooterTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getFooterType()
		 * @generated
		 */
		EClass FOOTER_TYPE = eINSTANCE.getFooterType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HeaderDeclTypeImpl <em>Header Decl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HeaderDeclTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getHeaderDeclType()
		 * @generated
		 */
		EClass HEADER_DECL_TYPE = eINSTANCE.getHeaderDeclType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_DECL_TYPE__MIXED = eINSTANCE.getHeaderDeclType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_DECL_TYPE__NAME = eINSTANCE.getHeaderDeclType_Name();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HeaderTypeImpl <em>Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HeaderTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getHeaderType()
		 * @generated
		 */
		EClass HEADER_TYPE = eINSTANCE.getHeaderType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideShapeTypeImpl <em>Hide Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideShapeTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getHideShapeType()
		 * @generated
		 */
		EClass HIDE_SHAPE_TYPE = eINSTANCE.getHideShapeType();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIDE_SHAPE_TYPE__SOUND = eINSTANCE.getHideShapeType_Sound();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_SHAPE_TYPE__DELAY = eINSTANCE.getHideShapeType_Delay();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_SHAPE_TYPE__DIRECTION = eINSTANCE.getHideShapeType_Direction();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_SHAPE_TYPE__EFFECT = eINSTANCE.getHideShapeType_Effect();

		/**
		 * The meta object literal for the '<em><b>Path Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_SHAPE_TYPE__PATH_ID = eINSTANCE.getHideShapeType_PathId();

		/**
		 * The meta object literal for the '<em><b>Shape Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_SHAPE_TYPE__SHAPE_ID = eINSTANCE.getHideShapeType_ShapeId();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_SHAPE_TYPE__SPEED = eINSTANCE.getHideShapeType_Speed();

		/**
		 * The meta object literal for the '<em><b>Start Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_SHAPE_TYPE__START_SCALE = eINSTANCE.getHideShapeType_StartScale();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl <em>Hide Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getHideTextType()
		 * @generated
		 */
		EClass HIDE_TEXT_TYPE = eINSTANCE.getHideTextType();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIDE_TEXT_TYPE__SOUND = eINSTANCE.getHideTextType_Sound();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_TEXT_TYPE__DELAY = eINSTANCE.getHideTextType_Delay();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_TEXT_TYPE__DIRECTION = eINSTANCE.getHideTextType_Direction();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_TEXT_TYPE__EFFECT = eINSTANCE.getHideTextType_Effect();

		/**
		 * The meta object literal for the '<em><b>Path Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_TEXT_TYPE__PATH_ID = eINSTANCE.getHideTextType_PathId();

		/**
		 * The meta object literal for the '<em><b>Shape Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_TEXT_TYPE__SHAPE_ID = eINSTANCE.getHideTextType_ShapeId();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_TEXT_TYPE__SPEED = eINSTANCE.getHideTextType_Speed();

		/**
		 * The meta object literal for the '<em><b>Start Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE_TEXT_TYPE__START_SCALE = eINSTANCE.getHideTextType_StartScale();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl <em>Notes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getNotesType()
		 * @generated
		 */
		EClass NOTES_TYPE = eINSTANCE.getNotesType();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__FORMS = eINSTANCE.getNotesType_Forms();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES_TYPE__SHAPE = eINSTANCE.getNotesType_Shape();

		/**
		 * The meta object literal for the '<em><b>Rect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__RECT = eINSTANCE.getNotesType_Rect();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__LINE = eINSTANCE.getNotesType_Line();

		/**
		 * The meta object literal for the '<em><b>Polyline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__POLYLINE = eINSTANCE.getNotesType_Polyline();

		/**
		 * The meta object literal for the '<em><b>Polygon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__POLYGON = eINSTANCE.getNotesType_Polygon();

		/**
		 * The meta object literal for the '<em><b>Regular Polygon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__REGULAR_POLYGON = eINSTANCE.getNotesType_RegularPolygon();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__PATH = eINSTANCE.getNotesType_Path();

		/**
		 * The meta object literal for the '<em><b>Circle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__CIRCLE = eINSTANCE.getNotesType_Circle();

		/**
		 * The meta object literal for the '<em><b>Ellipse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__ELLIPSE = eINSTANCE.getNotesType_Ellipse();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__G = eINSTANCE.getNotesType_G();

		/**
		 * The meta object literal for the '<em><b>Page Thumbnail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__PAGE_THUMBNAIL = eINSTANCE.getNotesType_PageThumbnail();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__FRAME = eINSTANCE.getNotesType_Frame();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__MEASURE = eINSTANCE.getNotesType_Measure();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__CAPTION = eINSTANCE.getNotesType_Caption();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__CONNECTOR = eINSTANCE.getNotesType_Connector();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__CONTROL = eINSTANCE.getNotesType_Control();

		/**
		 * The meta object literal for the '<em><b>Scene</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__SCENE = eINSTANCE.getNotesType_Scene();

		/**
		 * The meta object literal for the '<em><b>Custom Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTES_TYPE__CUSTOM_SHAPE = eINSTANCE.getNotesType_CustomShape();

		/**
		 * The meta object literal for the '<em><b>Page Layout Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES_TYPE__PAGE_LAYOUT_NAME = eINSTANCE.getNotesType_PageLayoutName();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES_TYPE__STYLE_NAME = eINSTANCE.getNotesType_StyleName();

		/**
		 * The meta object literal for the '<em><b>Use Date Time Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES_TYPE__USE_DATE_TIME_NAME = eINSTANCE.getNotesType_UseDateTimeName();

		/**
		 * The meta object literal for the '<em><b>Use Footer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES_TYPE__USE_FOOTER_NAME = eINSTANCE.getNotesType_UseFooterName();

		/**
		 * The meta object literal for the '<em><b>Use Header Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES_TYPE__USE_HEADER_NAME = eINSTANCE.getNotesType_UseHeaderName();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl <em>Placeholder Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPlaceholderType()
		 * @generated
		 */
		EClass PLACEHOLDER_TYPE = eINSTANCE.getPlaceholderType();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER_TYPE__HEIGHT = eINSTANCE.getPlaceholderType_Height();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER_TYPE__OBJECT = eINSTANCE.getPlaceholderType_Object();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER_TYPE__WIDTH = eINSTANCE.getPlaceholderType_Width();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER_TYPE__X = eINSTANCE.getPlaceholderType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER_TYPE__Y = eINSTANCE.getPlaceholderType_Y();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlayTypeImpl <em>Play Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlayTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPlayType()
		 * @generated
		 */
		EClass PLAY_TYPE = eINSTANCE.getPlayType();

		/**
		 * The meta object literal for the '<em><b>Shape Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAY_TYPE__SHAPE_ID = eINSTANCE.getPlayType_ShapeId();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAY_TYPE__SPEED = eINSTANCE.getPlayType_Speed();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl <em>Settings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getSettingsType()
		 * @generated
		 */
		EClass SETTINGS_TYPE = eINSTANCE.getSettingsType();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS_TYPE__SHOW = eINSTANCE.getSettingsType_Show();

		/**
		 * The meta object literal for the '<em><b>Animations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__ANIMATIONS = eINSTANCE.getSettingsType_Animations();

		/**
		 * The meta object literal for the '<em><b>Endless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__ENDLESS = eINSTANCE.getSettingsType_Endless();

		/**
		 * The meta object literal for the '<em><b>Force Manual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__FORCE_MANUAL = eINSTANCE.getSettingsType_ForceManual();

		/**
		 * The meta object literal for the '<em><b>Full Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__FULL_SCREEN = eINSTANCE.getSettingsType_FullScreen();

		/**
		 * The meta object literal for the '<em><b>Mouse As Pen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__MOUSE_AS_PEN = eINSTANCE.getSettingsType_MouseAsPen();

		/**
		 * The meta object literal for the '<em><b>Mouse Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__MOUSE_VISIBLE = eINSTANCE.getSettingsType_MouseVisible();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__PAUSE = eINSTANCE.getSettingsType_Pause();

		/**
		 * The meta object literal for the '<em><b>Show1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__SHOW1 = eINSTANCE.getSettingsType_Show1();

		/**
		 * The meta object literal for the '<em><b>Show End Of Presentation Slide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE = eINSTANCE.getSettingsType_ShowEndOfPresentationSlide();

		/**
		 * The meta object literal for the '<em><b>Show Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__SHOW_LOGO = eINSTANCE.getSettingsType_ShowLogo();

		/**
		 * The meta object literal for the '<em><b>Start Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__START_PAGE = eINSTANCE.getSettingsType_StartPage();

		/**
		 * The meta object literal for the '<em><b>Start With Navigator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__START_WITH_NAVIGATOR = eINSTANCE.getSettingsType_StartWithNavigator();

		/**
		 * The meta object literal for the '<em><b>Stay On Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__STAY_ON_TOP = eINSTANCE.getSettingsType_StayOnTop();

		/**
		 * The meta object literal for the '<em><b>Transition On Click</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS_TYPE__TRANSITION_ON_CLICK = eINSTANCE.getSettingsType_TransitionOnClick();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowShapeTypeImpl <em>Show Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowShapeTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getShowShapeType()
		 * @generated
		 */
		EClass SHOW_SHAPE_TYPE = eINSTANCE.getShowShapeType();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_SHAPE_TYPE__SOUND = eINSTANCE.getShowShapeType_Sound();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_SHAPE_TYPE__DELAY = eINSTANCE.getShowShapeType_Delay();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_SHAPE_TYPE__DIRECTION = eINSTANCE.getShowShapeType_Direction();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_SHAPE_TYPE__EFFECT = eINSTANCE.getShowShapeType_Effect();

		/**
		 * The meta object literal for the '<em><b>Path Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_SHAPE_TYPE__PATH_ID = eINSTANCE.getShowShapeType_PathId();

		/**
		 * The meta object literal for the '<em><b>Shape Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_SHAPE_TYPE__SHAPE_ID = eINSTANCE.getShowShapeType_ShapeId();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_SHAPE_TYPE__SPEED = eINSTANCE.getShowShapeType_Speed();

		/**
		 * The meta object literal for the '<em><b>Start Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_SHAPE_TYPE__START_SCALE = eINSTANCE.getShowShapeType_StartScale();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowTextTypeImpl <em>Show Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowTextTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getShowTextType()
		 * @generated
		 */
		EClass SHOW_TEXT_TYPE = eINSTANCE.getShowTextType();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_TEXT_TYPE__SOUND = eINSTANCE.getShowTextType_Sound();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TEXT_TYPE__DELAY = eINSTANCE.getShowTextType_Delay();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TEXT_TYPE__DIRECTION = eINSTANCE.getShowTextType_Direction();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TEXT_TYPE__EFFECT = eINSTANCE.getShowTextType_Effect();

		/**
		 * The meta object literal for the '<em><b>Path Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TEXT_TYPE__PATH_ID = eINSTANCE.getShowTextType_PathId();

		/**
		 * The meta object literal for the '<em><b>Shape Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TEXT_TYPE__SHAPE_ID = eINSTANCE.getShowTextType_ShapeId();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TEXT_TYPE__SPEED = eINSTANCE.getShowTextType_Speed();

		/**
		 * The meta object literal for the '<em><b>Start Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TEXT_TYPE__START_SCALE = eINSTANCE.getShowTextType_StartScale();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowTypeImpl <em>Show Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.ShowTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getShowType()
		 * @generated
		 */
		EClass SHOW_TYPE = eINSTANCE.getShowType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TYPE__NAME = eINSTANCE.getShowType_Name();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TYPE__PAGES = eINSTANCE.getShowType_Pages();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SoundTypeImpl <em>Sound Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SoundTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getSoundType()
		 * @generated
		 */
		EClass SOUND_TYPE = eINSTANCE.getSoundType();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUND_TYPE__ACTUATE = eINSTANCE.getSoundType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUND_TYPE__HREF = eINSTANCE.getSoundType_Href();

		/**
		 * The meta object literal for the '<em><b>Play Full</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUND_TYPE__PLAY_FULL = eINSTANCE.getSoundType_PlayFull();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUND_TYPE__SHOW = eINSTANCE.getSoundType_Show();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUND_TYPE__TYPE = eINSTANCE.getSoundType_Type();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Animation Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANIMATION_GROUP = eINSTANCE.getDocumentRoot_AnimationGroup();

		/**
		 * The meta object literal for the '<em><b>Animations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANIMATIONS = eINSTANCE.getDocumentRoot_Animations();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_TIME = eINSTANCE.getDocumentRoot_DateTime();

		/**
		 * The meta object literal for the '<em><b>Date Time Decl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_TIME_DECL = eINSTANCE.getDocumentRoot_DateTimeDecl();

		/**
		 * The meta object literal for the '<em><b>Dim</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIM = eINSTANCE.getDocumentRoot_Dim();

		/**
		 * The meta object literal for the '<em><b>Event Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVENT_LISTENER = eINSTANCE.getDocumentRoot_EventListener();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOOTER = eINSTANCE.getDocumentRoot_Footer();

		/**
		 * The meta object literal for the '<em><b>Footer Decl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOOTER_DECL = eINSTANCE.getDocumentRoot_FooterDecl();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HEADER = eINSTANCE.getDocumentRoot_Header();

		/**
		 * The meta object literal for the '<em><b>Header Decl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HEADER_DECL = eINSTANCE.getDocumentRoot_HeaderDecl();

		/**
		 * The meta object literal for the '<em><b>Hide Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HIDE_SHAPE = eINSTANCE.getDocumentRoot_HideShape();

		/**
		 * The meta object literal for the '<em><b>Hide Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HIDE_TEXT = eINSTANCE.getDocumentRoot_HideText();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTES = eINSTANCE.getDocumentRoot_Notes();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLACEHOLDER = eINSTANCE.getDocumentRoot_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Play</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLAY = eINSTANCE.getDocumentRoot_Play();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SETTINGS = eINSTANCE.getDocumentRoot_Settings();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHOW = eINSTANCE.getDocumentRoot_Show();

		/**
		 * The meta object literal for the '<em><b>Show Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHOW_SHAPE = eINSTANCE.getDocumentRoot_ShowShape();

		/**
		 * The meta object literal for the '<em><b>Show Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHOW_TEXT = eINSTANCE.getDocumentRoot_ShowText();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOUND = eINSTANCE.getDocumentRoot_Sound();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACTION = eINSTANCE.getDocumentRoot_Action();

		/**
		 * The meta object literal for the '<em><b>Animations1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ANIMATIONS1 = eINSTANCE.getDocumentRoot_Animations1();

		/**
		 * The meta object literal for the '<em><b>Background Objects Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE = eINSTANCE.getDocumentRoot_BackgroundObjectsVisible();

		/**
		 * The meta object literal for the '<em><b>Background Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BACKGROUND_VISIBLE = eINSTANCE.getDocumentRoot_BackgroundVisible();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CLASS = eINSTANCE.getDocumentRoot_Class();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CLASS_NAMES = eINSTANCE.getDocumentRoot_ClassNames();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DELAY = eINSTANCE.getDocumentRoot_Delay();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIRECTION = eINSTANCE.getDocumentRoot_Direction();

		/**
		 * The meta object literal for the '<em><b>Display Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DISPLAY_DATE_TIME = eINSTANCE.getDocumentRoot_DisplayDateTime();

		/**
		 * The meta object literal for the '<em><b>Display Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DISPLAY_FOOTER = eINSTANCE.getDocumentRoot_DisplayFooter();

		/**
		 * The meta object literal for the '<em><b>Display Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DISPLAY_HEADER = eINSTANCE.getDocumentRoot_DisplayHeader();

		/**
		 * The meta object literal for the '<em><b>Display Page Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER = eINSTANCE.getDocumentRoot_DisplayPageNumber();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DURATION = eINSTANCE.getDocumentRoot_Duration();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EFFECT = eINSTANCE.getDocumentRoot_Effect();

		/**
		 * The meta object literal for the '<em><b>Endless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ENDLESS = eINSTANCE.getDocumentRoot_Endless();

		/**
		 * The meta object literal for the '<em><b>Force Manual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FORCE_MANUAL = eINSTANCE.getDocumentRoot_ForceManual();

		/**
		 * The meta object literal for the '<em><b>Full Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FULL_SCREEN = eINSTANCE.getDocumentRoot_FullScreen();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GROUP_ID = eINSTANCE.getDocumentRoot_GroupId();

		/**
		 * The meta object literal for the '<em><b>Master Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MASTER_ELEMENT = eINSTANCE.getDocumentRoot_MasterElement();

		/**
		 * The meta object literal for the '<em><b>Mouse As Pen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MOUSE_AS_PEN = eINSTANCE.getDocumentRoot_MouseAsPen();

		/**
		 * The meta object literal for the '<em><b>Mouse Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MOUSE_VISIBLE = eINSTANCE.getDocumentRoot_MouseVisible();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NODE_TYPE = eINSTANCE.getDocumentRoot_NodeType();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PAGES = eINSTANCE.getDocumentRoot_Pages();

		/**
		 * The meta object literal for the '<em><b>Path Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PATH_ID = eINSTANCE.getDocumentRoot_PathId();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PAUSE = eINSTANCE.getDocumentRoot_Pause();

		/**
		 * The meta object literal for the '<em><b>Placeholder1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PLACEHOLDER1 = eINSTANCE.getDocumentRoot_Placeholder1();

		/**
		 * The meta object literal for the '<em><b>Play Full</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PLAY_FULL = eINSTANCE.getDocumentRoot_PlayFull();

		/**
		 * The meta object literal for the '<em><b>Presentation Page Layout Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT_NAME = eINSTANCE.getDocumentRoot_PresentationPageLayoutName();

		/**
		 * The meta object literal for the '<em><b>Preset Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRESET_CLASS = eINSTANCE.getDocumentRoot_PresetClass();

		/**
		 * The meta object literal for the '<em><b>Preset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRESET_ID = eINSTANCE.getDocumentRoot_PresetId();

		/**
		 * The meta object literal for the '<em><b>Preset Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRESET_SUB_TYPE = eINSTANCE.getDocumentRoot_PresetSubType();

		/**
		 * The meta object literal for the '<em><b>Show1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHOW1 = eINSTANCE.getDocumentRoot_Show1();

		/**
		 * The meta object literal for the '<em><b>Show End Of Presentation Slide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE = eINSTANCE.getDocumentRoot_ShowEndOfPresentationSlide();

		/**
		 * The meta object literal for the '<em><b>Show Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHOW_LOGO = eINSTANCE.getDocumentRoot_ShowLogo();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPEED = eINSTANCE.getDocumentRoot_Speed();

		/**
		 * The meta object literal for the '<em><b>Start Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__START_PAGE = eINSTANCE.getDocumentRoot_StartPage();

		/**
		 * The meta object literal for the '<em><b>Start Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__START_SCALE = eINSTANCE.getDocumentRoot_StartScale();

		/**
		 * The meta object literal for the '<em><b>Start With Navigator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__START_WITH_NAVIGATOR = eINSTANCE.getDocumentRoot_StartWithNavigator();

		/**
		 * The meta object literal for the '<em><b>Stay On Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STAY_ON_TOP = eINSTANCE.getDocumentRoot_StayOnTop();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STYLE_NAME = eINSTANCE.getDocumentRoot_StyleName();

		/**
		 * The meta object literal for the '<em><b>Transition On Click</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSITION_ON_CLICK = eINSTANCE.getDocumentRoot_TransitionOnClick();

		/**
		 * The meta object literal for the '<em><b>Transition Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSITION_SPEED = eINSTANCE.getDocumentRoot_TransitionSpeed();

		/**
		 * The meta object literal for the '<em><b>Transition Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSITION_STYLE = eINSTANCE.getDocumentRoot_TransitionStyle();

		/**
		 * The meta object literal for the '<em><b>Transition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSITION_TYPE = eINSTANCE.getDocumentRoot_TransitionType();

		/**
		 * The meta object literal for the '<em><b>Use Date Time Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__USE_DATE_TIME_NAME = eINSTANCE.getDocumentRoot_UseDateTimeName();

		/**
		 * The meta object literal for the '<em><b>Use Footer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__USE_FOOTER_NAME = eINSTANCE.getDocumentRoot_UseFooterName();

		/**
		 * The meta object literal for the '<em><b>Use Header Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__USE_HEADER_NAME = eINSTANCE.getDocumentRoot_UseHeaderName();

		/**
		 * The meta object literal for the '<em><b>User Transformed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__USER_TRANSFORMED = eINSTANCE.getDocumentRoot_UserTransformed();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VERB = eINSTANCE.getDocumentRoot_Verb();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VISIBILITY = eINSTANCE.getDocumentRoot_Visibility();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType <em>Animations Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getAnimationsType()
		 * @generated
		 */
		EEnum ANIMATIONS_TYPE = eINSTANCE.getAnimationsType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType <em>Node Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getNodeTypeType()
		 * @generated
		 */
		EEnum NODE_TYPE_TYPE = eINSTANCE.getNodeTypeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType <em>Preset Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPresetClassType()
		 * @generated
		 */
		EEnum PRESET_CLASS_TYPE = eINSTANCE.getPresetClassType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType <em>Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getSourceType()
		 * @generated
		 */
		EEnum SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType <em>Transition On Click Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionOnClickType()
		 * @generated
		 */
		EEnum TRANSITION_ON_CLICK_TYPE = eINSTANCE.getTransitionOnClickType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType <em>Transition Style Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionStyleType()
		 * @generated
		 */
		EEnum TRANSITION_STYLE_TYPE = eINSTANCE.getTransitionStyleType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType <em>Transition Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionTypeType()
		 * @generated
		 */
		EEnum TRANSITION_TYPE_TYPE = eINSTANCE.getTransitionTypeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType <em>Visibility Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getVisibilityType()
		 * @generated
		 */
		EEnum VISIBILITY_TYPE = eINSTANCE.getVisibilityType();

		/**
		 * The meta object literal for the '<em>Action Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getActionTypeObject()
		 * @generated
		 */
		EDataType ACTION_TYPE_OBJECT = eINSTANCE.getActionTypeObject();

		/**
		 * The meta object literal for the '<em>Animations Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getAnimationsTypeObject()
		 * @generated
		 */
		EDataType ANIMATIONS_TYPE_OBJECT = eINSTANCE.getAnimationsTypeObject();

		/**
		 * The meta object literal for the '<em>Node Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getNodeTypeTypeObject()
		 * @generated
		 */
		EDataType NODE_TYPE_TYPE_OBJECT = eINSTANCE.getNodeTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Page Layout Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPresentationPageLayoutNameType()
		 * @generated
		 */
		EDataType PRESENTATION_PAGE_LAYOUT_NAME_TYPE = eINSTANCE.getPresentationPageLayoutNameType();

		/**
		 * The meta object literal for the '<em>Page Layout Name Type Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPresentationPageLayoutNameTypeMember1()
		 * @generated
		 */
		EDataType PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1 = eINSTANCE.getPresentationPageLayoutNameTypeMember1();

		/**
		 * The meta object literal for the '<em>Preset Class Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getPresetClassTypeObject()
		 * @generated
		 */
		EDataType PRESET_CLASS_TYPE_OBJECT = eINSTANCE.getPresetClassTypeObject();

		/**
		 * The meta object literal for the '<em>Source Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getSourceTypeObject()
		 * @generated
		 */
		EDataType SOURCE_TYPE_OBJECT = eINSTANCE.getSourceTypeObject();

		/**
		 * The meta object literal for the '<em>Style Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getStyleNameType()
		 * @generated
		 */
		EDataType STYLE_NAME_TYPE = eINSTANCE.getStyleNameType();

		/**
		 * The meta object literal for the '<em>Style Name Type Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getStyleNameTypeMember1()
		 * @generated
		 */
		EDataType STYLE_NAME_TYPE_MEMBER1 = eINSTANCE.getStyleNameTypeMember1();

		/**
		 * The meta object literal for the '<em>Transition On Click Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionOnClickTypeObject()
		 * @generated
		 */
		EDataType TRANSITION_ON_CLICK_TYPE_OBJECT = eINSTANCE.getTransitionOnClickTypeObject();

		/**
		 * The meta object literal for the '<em>Transition Style Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionStyleTypeObject()
		 * @generated
		 */
		EDataType TRANSITION_STYLE_TYPE_OBJECT = eINSTANCE.getTransitionStyleTypeObject();

		/**
		 * The meta object literal for the '<em>Transition Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getTransitionTypeTypeObject()
		 * @generated
		 */
		EDataType TRANSITION_TYPE_TYPE_OBJECT = eINSTANCE.getTransitionTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Visibility Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl#getVisibilityTypeObject()
		 * @generated
		 */
		EDataType VISIBILITY_TYPE_OBJECT = eINSTANCE.getVisibilityTypeObject();

	}

} //PresentationPackage
