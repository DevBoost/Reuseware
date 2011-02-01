/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChartType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentMetaType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentSettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FormsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType;
import org.oasisopen.names.tc.opendocument.xmlns.office.StylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.TextType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeImageContentMain;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMetaContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getAutomaticStyles <em>Automatic Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getBinaryData <em>Binary Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getChangeInfo <em>Change Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDdeSource <em>Dde Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDocumentContent <em>Document Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDocumentMeta <em>Document Meta</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDocumentSettings <em>Document Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDocumentStyles <em>Document Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDrawing <em>Drawing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getFontFaceDecls <em>Font Face Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getMasterStyles <em>Master Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getAutomaticUpdate <em>Automatic Update</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getConversionMode <em>Conversion Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDdeApplication <em>Dde Application</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDdeItem <em>Dde Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDdeTopic <em>Dde Topic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getMimetype <em>Mimetype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getProcessContent <em>Process Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getServerMap <em>Server Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getTargetFrame <em>Target Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getTargetFrameName <em>Target Frame Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentRootImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getBinaryData() <em>Binary Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BINARY_DATA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAutomaticUpdate() <em>Automatic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_UPDATE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutomaticUpdate() <em>Automatic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticUpdate()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean automaticUpdate = AUTOMATIC_UPDATE_EDEFAULT;

	/**
	 * This is true if the Automatic Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticUpdateESet;

	/**
	 * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean BOOLEAN_VALUE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

	/**
	 * This is true if the Boolean Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean booleanValueESet;

	/**
	 * The default value of the '{@link #getConversionMode() <em>Conversion Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionMode()
	 * @generated
	 * @ordered
	 */
	protected static final ConversionModeType CONVERSION_MODE_EDEFAULT = ConversionModeType.INTO_DEFAULT_STYLE_DATA_STYLE;

	/**
	 * The cached value of the '{@link #getConversionMode() <em>Conversion Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionMode()
	 * @generated
	 * @ordered
	 */
	protected ConversionModeType conversionMode = CONVERSION_MODE_EDEFAULT;

	/**
	 * This is true if the Conversion Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conversionModeESet;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateValue() <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateValue() <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateValue = DATE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDdeApplication() <em>Dde Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String DDE_APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDdeApplication() <em>Dde Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeApplication()
	 * @generated
	 * @ordered
	 */
	protected String ddeApplication = DDE_APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDdeItem() <em>Dde Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeItem()
	 * @generated
	 * @ordered
	 */
	protected static final String DDE_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDdeItem() <em>Dde Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeItem()
	 * @generated
	 * @ordered
	 */
	protected String ddeItem = DDE_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDdeTopic() <em>Dde Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String DDE_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDdeTopic() <em>Dde Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeTopic()
	 * @generated
	 * @ordered
	 */
	protected String ddeTopic = DDE_TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean display = DISPLAY_EDEFAULT;

	/**
	 * This is true if the Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayESet;

	/**
	 * The default value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected static final String MIMETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected String mimetype = MIMETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessContent() <em>Process Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContent()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROCESS_CONTENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getProcessContent() <em>Process Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContent()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean processContent = PROCESS_CONTENT_EDEFAULT;

	/**
	 * This is true if the Process Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processContentESet;

	/**
	 * The default value of the '{@link #getServerMap() <em>Server Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerMap()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SERVER_MAP_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getServerMap() <em>Server Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerMap()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean serverMap = SERVER_MAP_EDEFAULT;

	/**
	 * This is true if the Server Map attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverMapESet;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFrame() <em>Target Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrame()
	 * @generated
	 * @ordered
	 */
	protected static final Object TARGET_FRAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFrame() <em>Target Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrame()
	 * @generated
	 * @ordered
	 */
	protected Object targetFrame = TARGET_FRAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFrameName() <em>Target Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrameName()
	 * @generated
	 * @ordered
	 */
	protected static final Object TARGET_FRAME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFrameName() <em>Target Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrameName()
	 * @generated
	 * @ordered
	 */
	protected Object targetFrameName = TARGET_FRAME_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected Duration timeValue = TIME_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OfficePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OfficePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OfficePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType getAnnotation() {
		return (AnnotationType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__ANNOTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(AnnotationType newAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__ANNOTATION, newAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(AnnotationType newAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__ANNOTATION, newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomaticStylesType getAutomaticStyles() {
		return (AutomaticStylesType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__AUTOMATIC_STYLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomaticStyles(AutomaticStylesType newAutomaticStyles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__AUTOMATIC_STYLES, newAutomaticStyles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticStyles(AutomaticStylesType newAutomaticStyles) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__AUTOMATIC_STYLES, newAutomaticStyles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBinaryData() {
		return (byte[])getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__BINARY_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryData(byte[] newBinaryData) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__BINARY_DATA, newBinaryData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeBodyContent getBody() {
		return (OfficeBodyContent)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(OfficeBodyContent newBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__BODY, newBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(OfficeBodyContent newBody) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInfoType getChangeInfo() {
		return (ChangeInfoType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__CHANGE_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInfo(ChangeInfoType newChangeInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__CHANGE_INFO, newChangeInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeInfo(ChangeInfoType newChangeInfo) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__CHANGE_INFO, newChangeInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType getChart() {
		return (ChartType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__CHART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChart(ChartType newChart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__CHART, newChart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChart(ChartType newChart) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__CHART, newChart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSectionSourceDdeType getDdeSource() {
		return (TextSectionSourceDdeType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__DDE_SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeSource(TextSectionSourceDdeType newDdeSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__DDE_SOURCE, newDdeSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeSource(TextSectionSourceDdeType newDdeSource) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__DDE_SOURCE, newDdeSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType getDocument() {
		return (DocumentType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(DocumentType newDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT, newDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(DocumentType newDocument) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT, newDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentContentType getDocumentContent() {
		return (DocumentContentType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentContent(DocumentContentType newDocumentContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_CONTENT, newDocumentContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentContent(DocumentContentType newDocumentContent) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_CONTENT, newDocumentContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentMetaType getDocumentMeta() {
		return (DocumentMetaType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_META, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentMeta(DocumentMetaType newDocumentMeta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_META, newDocumentMeta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentMeta(DocumentMetaType newDocumentMeta) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_META, newDocumentMeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentSettingsType getDocumentSettings() {
		return (DocumentSettingsType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_SETTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentSettings(DocumentSettingsType newDocumentSettings, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_SETTINGS, newDocumentSettings, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentSettings(DocumentSettingsType newDocumentSettings) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_SETTINGS, newDocumentSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStylesType getDocumentStyles() {
		return (DocumentStylesType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_STYLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentStyles(DocumentStylesType newDocumentStyles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_STYLES, newDocumentStyles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentStyles(DocumentStylesType newDocumentStyles) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__DOCUMENT_STYLES, newDocumentStyles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingType getDrawing() {
		return (DrawingType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__DRAWING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrawing(DrawingType newDrawing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__DRAWING, newDrawing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawing(DrawingType newDrawing) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__DRAWING, newDrawing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenersType getEventListeners() {
		return (EventListenersType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__EVENT_LISTENERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventListeners(EventListenersType newEventListeners, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__EVENT_LISTENERS, newEventListeners, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventListeners(EventListenersType newEventListeners) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__EVENT_LISTENERS, newEventListeners);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceDeclsType getFontFaceDecls() {
		return (FontFaceDeclsType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__FONT_FACE_DECLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFaceDecls(FontFaceDeclsType newFontFaceDecls, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__FONT_FACE_DECLS, newFontFaceDecls, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFaceDecls(FontFaceDeclsType newFontFaceDecls) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__FONT_FACE_DECLS, newFontFaceDecls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsType getForms() {
		return (FormsType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__FORMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForms(FormsType newForms, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__FORMS, newForms, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForms(FormsType newForms) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__FORMS, newForms);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeImageContentMain getImage() {
		return (OfficeImageContentMain)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__IMAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(OfficeImageContentMain newImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__IMAGE, newImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(OfficeImageContentMain newImage) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterStylesType getMasterStyles() {
		return (MasterStylesType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__MASTER_STYLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterStyles(MasterStylesType newMasterStyles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__MASTER_STYLES, newMasterStyles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterStyles(MasterStylesType newMasterStyles) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__MASTER_STYLES, newMasterStyles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeMetaContent getMeta() {
		return (OfficeMetaContent)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__META, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeta(OfficeMetaContent newMeta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__META, newMeta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeta(OfficeMetaContent newMeta) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__META, newMeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationType getPresentation() {
		return (PresentationType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__PRESENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentation(PresentationType newPresentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__PRESENTATION, newPresentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(PresentationType newPresentation) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__PRESENTATION, newPresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType getScript() {
		return (ScriptType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(ScriptType newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__SCRIPT, newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(ScriptType newScript) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptsType getScripts() {
		return (ScriptsType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__SCRIPTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScripts(ScriptsType newScripts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__SCRIPTS, newScripts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScripts(ScriptsType newScripts) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__SCRIPTS, newScripts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsType getSettings() {
		return (SettingsType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__SETTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(SettingsType newSettings, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__SETTINGS, newSettings, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(SettingsType newSettings) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__SETTINGS, newSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetType getSpreadsheet() {
		return (SpreadsheetType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__SPREADSHEET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpreadsheet(SpreadsheetType newSpreadsheet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__SPREADSHEET, newSpreadsheet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadsheet(SpreadsheetType newSpreadsheet) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__SPREADSHEET, newSpreadsheet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesType getStyles() {
		return (StylesType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__STYLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyles(StylesType newStyles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__STYLES, newStyles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyles(StylesType newStyles) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__STYLES, newStyles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType getText() {
		return (TextType)getMixed().get(OfficePackage.Literals.DOCUMENT_ROOT__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(TextType newText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OfficePackage.Literals.DOCUMENT_ROOT__TEXT, newText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(TextType newText) {
		((FeatureMap.Internal)getMixed()).set(OfficePackage.Literals.DOCUMENT_ROOT__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticUpdate() {
		return automaticUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutomaticUpdate) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticUpdate = automaticUpdate;
		automaticUpdate = newAutomaticUpdate == null ? AUTOMATIC_UPDATE_EDEFAULT : newAutomaticUpdate;
		boolean oldAutomaticUpdateESet = automaticUpdateESet;
		automaticUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__AUTOMATIC_UPDATE, oldAutomaticUpdate, automaticUpdate, !oldAutomaticUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticUpdate() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticUpdate = automaticUpdate;
		boolean oldAutomaticUpdateESet = automaticUpdateESet;
		automaticUpdate = AUTOMATIC_UPDATE_EDEFAULT;
		automaticUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.DOCUMENT_ROOT__AUTOMATIC_UPDATE, oldAutomaticUpdate, AUTOMATIC_UPDATE_EDEFAULT, oldAutomaticUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticUpdate() {
		return automaticUpdateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newBooleanValue) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue == null ? BOOLEAN_VALUE_EDEFAULT : newBooleanValue;
		boolean oldBooleanValueESet = booleanValueESet;
		booleanValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__BOOLEAN_VALUE, oldBooleanValue, booleanValue, !oldBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBooleanValue() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBooleanValue = booleanValue;
		boolean oldBooleanValueESet = booleanValueESet;
		booleanValue = BOOLEAN_VALUE_EDEFAULT;
		booleanValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.DOCUMENT_ROOT__BOOLEAN_VALUE, oldBooleanValue, BOOLEAN_VALUE_EDEFAULT, oldBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBooleanValue() {
		return booleanValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionModeType getConversionMode() {
		return conversionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionMode(ConversionModeType newConversionMode) {
		ConversionModeType oldConversionMode = conversionMode;
		conversionMode = newConversionMode == null ? CONVERSION_MODE_EDEFAULT : newConversionMode;
		boolean oldConversionModeESet = conversionModeESet;
		conversionModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__CONVERSION_MODE, oldConversionMode, conversionMode, !oldConversionModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConversionMode() {
		ConversionModeType oldConversionMode = conversionMode;
		boolean oldConversionModeESet = conversionModeESet;
		conversionMode = CONVERSION_MODE_EDEFAULT;
		conversionModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.DOCUMENT_ROOT__CONVERSION_MODE, oldConversionMode, CONVERSION_MODE_EDEFAULT, oldConversionModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConversionMode() {
		return conversionModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(String newCurrency) {
		String oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateValue() {
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValue(XMLGregorianCalendar newDateValue) {
		XMLGregorianCalendar oldDateValue = dateValue;
		dateValue = newDateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__DATE_VALUE, oldDateValue, dateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDdeApplication() {
		return ddeApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeApplication(String newDdeApplication) {
		String oldDdeApplication = ddeApplication;
		ddeApplication = newDdeApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__DDE_APPLICATION, oldDdeApplication, ddeApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDdeItem() {
		return ddeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeItem(String newDdeItem) {
		String oldDdeItem = ddeItem;
		ddeItem = newDdeItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__DDE_ITEM, oldDdeItem, ddeItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDdeTopic() {
		return ddeTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeTopic(String newDdeTopic) {
		String oldDdeTopic = ddeTopic;
		ddeTopic = newDdeTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__DDE_TOPIC, oldDdeTopic, ddeTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplay) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		boolean oldDisplayESet = displayESet;
		displayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__DISPLAY, oldDisplay, display, !oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplay() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		boolean oldDisplayESet = displayESet;
		display = DISPLAY_EDEFAULT;
		displayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.DOCUMENT_ROOT__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplay() {
		return displayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimetype(String newMimetype) {
		String oldMimetype = mimetype;
		mimetype = newMimetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__MIMETYPE, oldMimetype, mimetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProcessContent() {
		return processContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProcessContent) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProcessContent = processContent;
		processContent = newProcessContent == null ? PROCESS_CONTENT_EDEFAULT : newProcessContent;
		boolean oldProcessContentESet = processContentESet;
		processContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__PROCESS_CONTENT, oldProcessContent, processContent, !oldProcessContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessContent() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProcessContent = processContent;
		boolean oldProcessContentESet = processContentESet;
		processContent = PROCESS_CONTENT_EDEFAULT;
		processContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.DOCUMENT_ROOT__PROCESS_CONTENT, oldProcessContent, PROCESS_CONTENT_EDEFAULT, oldProcessContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessContent() {
		return processContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getServerMap() {
		return serverMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerMap(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newServerMap) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldServerMap = serverMap;
		serverMap = newServerMap == null ? SERVER_MAP_EDEFAULT : newServerMap;
		boolean oldServerMapESet = serverMapESet;
		serverMapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__SERVER_MAP, oldServerMap, serverMap, !oldServerMapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerMap() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldServerMap = serverMap;
		boolean oldServerMapESet = serverMapESet;
		serverMap = SERVER_MAP_EDEFAULT;
		serverMapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.DOCUMENT_ROOT__SERVER_MAP, oldServerMap, SERVER_MAP_EDEFAULT, oldServerMapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerMap() {
		return serverMapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTargetFrame() {
		return targetFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrame(Object newTargetFrame) {
		Object oldTargetFrame = targetFrame;
		targetFrame = newTargetFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__TARGET_FRAME, oldTargetFrame, targetFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTargetFrameName() {
		return targetFrameName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrameName(Object newTargetFrameName) {
		Object oldTargetFrameName = targetFrameName;
		targetFrameName = newTargetFrameName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__TARGET_FRAME_NAME, oldTargetFrameName, targetFrameName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeValue() {
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(Duration newTimeValue) {
		Duration oldTimeValue = timeValue;
		timeValue = newTimeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__TIME_VALUE, oldTimeValue, timeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		double oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.DOCUMENT_ROOT__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_ROOT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OfficePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OfficePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case OfficePackage.DOCUMENT_ROOT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_STYLES:
				return basicSetAutomaticStyles(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__BODY:
				return basicSetBody(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__CHANGE_INFO:
				return basicSetChangeInfo(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__CHART:
				return basicSetChart(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__DDE_SOURCE:
				return basicSetDdeSource(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT:
				return basicSetDocument(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_CONTENT:
				return basicSetDocumentContent(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_META:
				return basicSetDocumentMeta(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_SETTINGS:
				return basicSetDocumentSettings(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_STYLES:
				return basicSetDocumentStyles(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__DRAWING:
				return basicSetDrawing(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__EVENT_LISTENERS:
				return basicSetEventListeners(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__FONT_FACE_DECLS:
				return basicSetFontFaceDecls(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__FORMS:
				return basicSetForms(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__IMAGE:
				return basicSetImage(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__MASTER_STYLES:
				return basicSetMasterStyles(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__META:
				return basicSetMeta(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__PRESENTATION:
				return basicSetPresentation(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__SCRIPT:
				return basicSetScript(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__SCRIPTS:
				return basicSetScripts(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__SETTINGS:
				return basicSetSettings(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__SPREADSHEET:
				return basicSetSpreadsheet(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__STYLES:
				return basicSetStyles(null, msgs);
			case OfficePackage.DOCUMENT_ROOT__TEXT:
				return basicSetText(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OfficePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OfficePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OfficePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OfficePackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation();
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_STYLES:
				return getAutomaticStyles();
			case OfficePackage.DOCUMENT_ROOT__BINARY_DATA:
				return getBinaryData();
			case OfficePackage.DOCUMENT_ROOT__BODY:
				return getBody();
			case OfficePackage.DOCUMENT_ROOT__CHANGE_INFO:
				return getChangeInfo();
			case OfficePackage.DOCUMENT_ROOT__CHART:
				return getChart();
			case OfficePackage.DOCUMENT_ROOT__DDE_SOURCE:
				return getDdeSource();
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT:
				return getDocument();
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_CONTENT:
				return getDocumentContent();
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_META:
				return getDocumentMeta();
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_SETTINGS:
				return getDocumentSettings();
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_STYLES:
				return getDocumentStyles();
			case OfficePackage.DOCUMENT_ROOT__DRAWING:
				return getDrawing();
			case OfficePackage.DOCUMENT_ROOT__EVENT_LISTENERS:
				return getEventListeners();
			case OfficePackage.DOCUMENT_ROOT__FONT_FACE_DECLS:
				return getFontFaceDecls();
			case OfficePackage.DOCUMENT_ROOT__FORMS:
				return getForms();
			case OfficePackage.DOCUMENT_ROOT__IMAGE:
				return getImage();
			case OfficePackage.DOCUMENT_ROOT__MASTER_STYLES:
				return getMasterStyles();
			case OfficePackage.DOCUMENT_ROOT__META:
				return getMeta();
			case OfficePackage.DOCUMENT_ROOT__PRESENTATION:
				return getPresentation();
			case OfficePackage.DOCUMENT_ROOT__SCRIPT:
				return getScript();
			case OfficePackage.DOCUMENT_ROOT__SCRIPTS:
				return getScripts();
			case OfficePackage.DOCUMENT_ROOT__SETTINGS:
				return getSettings();
			case OfficePackage.DOCUMENT_ROOT__SPREADSHEET:
				return getSpreadsheet();
			case OfficePackage.DOCUMENT_ROOT__STYLES:
				return getStyles();
			case OfficePackage.DOCUMENT_ROOT__TEXT:
				return getText();
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_UPDATE:
				return getAutomaticUpdate();
			case OfficePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				return getBooleanValue();
			case OfficePackage.DOCUMENT_ROOT__CONVERSION_MODE:
				return getConversionMode();
			case OfficePackage.DOCUMENT_ROOT__CURRENCY:
				return getCurrency();
			case OfficePackage.DOCUMENT_ROOT__DATE_VALUE:
				return getDateValue();
			case OfficePackage.DOCUMENT_ROOT__DDE_APPLICATION:
				return getDdeApplication();
			case OfficePackage.DOCUMENT_ROOT__DDE_ITEM:
				return getDdeItem();
			case OfficePackage.DOCUMENT_ROOT__DDE_TOPIC:
				return getDdeTopic();
			case OfficePackage.DOCUMENT_ROOT__DISPLAY:
				return getDisplay();
			case OfficePackage.DOCUMENT_ROOT__MIMETYPE:
				return getMimetype();
			case OfficePackage.DOCUMENT_ROOT__NAME:
				return getName();
			case OfficePackage.DOCUMENT_ROOT__PROCESS_CONTENT:
				return getProcessContent();
			case OfficePackage.DOCUMENT_ROOT__SERVER_MAP:
				return getServerMap();
			case OfficePackage.DOCUMENT_ROOT__STRING_VALUE:
				return getStringValue();
			case OfficePackage.DOCUMENT_ROOT__TARGET_FRAME:
				return getTargetFrame();
			case OfficePackage.DOCUMENT_ROOT__TARGET_FRAME_NAME:
				return getTargetFrameName();
			case OfficePackage.DOCUMENT_ROOT__TIME_VALUE:
				return getTimeValue();
			case OfficePackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case OfficePackage.DOCUMENT_ROOT__VALUE:
				return new Double(getValue());
			case OfficePackage.DOCUMENT_ROOT__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OfficePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((AnnotationType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_STYLES:
				setAutomaticStyles((AutomaticStylesType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__BINARY_DATA:
				setBinaryData((byte[])newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__BODY:
				setBody((OfficeBodyContent)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__CHART:
				setChart((ChartType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DDE_SOURCE:
				setDdeSource((TextSectionSourceDdeType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT:
				setDocument((DocumentType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_CONTENT:
				setDocumentContent((DocumentContentType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_META:
				setDocumentMeta((DocumentMetaType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_SETTINGS:
				setDocumentSettings((DocumentSettingsType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_STYLES:
				setDocumentStyles((DocumentStylesType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DRAWING:
				setDrawing((DrawingType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__EVENT_LISTENERS:
				setEventListeners((EventListenersType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__FONT_FACE_DECLS:
				setFontFaceDecls((FontFaceDeclsType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__FORMS:
				setForms((FormsType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__IMAGE:
				setImage((OfficeImageContentMain)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__MASTER_STYLES:
				setMasterStyles((MasterStylesType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__META:
				setMeta((OfficeMetaContent)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__PRESENTATION:
				setPresentation((PresentationType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__SCRIPTS:
				setScripts((ScriptsType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__SETTINGS:
				setSettings((SettingsType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__SPREADSHEET:
				setSpreadsheet((SpreadsheetType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__STYLES:
				setStyles((StylesType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__TEXT:
				setText((TextType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_UPDATE:
				setAutomaticUpdate((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				setBooleanValue((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__CONVERSION_MODE:
				setConversionMode((ConversionModeType)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__CURRENCY:
				setCurrency((String)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DATE_VALUE:
				setDateValue((XMLGregorianCalendar)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DDE_APPLICATION:
				setDdeApplication((String)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DDE_ITEM:
				setDdeItem((String)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DDE_TOPIC:
				setDdeTopic((String)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__DISPLAY:
				setDisplay((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__MIMETYPE:
				setMimetype((String)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__PROCESS_CONTENT:
				setProcessContent((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__SERVER_MAP:
				setServerMap((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__TARGET_FRAME:
				setTargetFrame(newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__TARGET_FRAME_NAME:
				setTargetFrameName(newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__TIME_VALUE:
				setTimeValue((Duration)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__TITLE:
				setTitle((String)newValue);
				return;
			case OfficePackage.DOCUMENT_ROOT__VALUE:
				setValue(((Double)newValue).doubleValue());
				return;
			case OfficePackage.DOCUMENT_ROOT__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OfficePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OfficePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OfficePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OfficePackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((AnnotationType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_STYLES:
				setAutomaticStyles((AutomaticStylesType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__BINARY_DATA:
				setBinaryData(BINARY_DATA_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__BODY:
				setBody((OfficeBodyContent)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__CHART:
				setChart((ChartType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__DDE_SOURCE:
				setDdeSource((TextSectionSourceDdeType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT:
				setDocument((DocumentType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_CONTENT:
				setDocumentContent((DocumentContentType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_META:
				setDocumentMeta((DocumentMetaType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_SETTINGS:
				setDocumentSettings((DocumentSettingsType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_STYLES:
				setDocumentStyles((DocumentStylesType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__DRAWING:
				setDrawing((DrawingType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__EVENT_LISTENERS:
				setEventListeners((EventListenersType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__FONT_FACE_DECLS:
				setFontFaceDecls((FontFaceDeclsType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__FORMS:
				setForms((FormsType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__IMAGE:
				setImage((OfficeImageContentMain)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__MASTER_STYLES:
				setMasterStyles((MasterStylesType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__META:
				setMeta((OfficeMetaContent)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__PRESENTATION:
				setPresentation((PresentationType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__SCRIPTS:
				setScripts((ScriptsType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__SETTINGS:
				setSettings((SettingsType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__SPREADSHEET:
				setSpreadsheet((SpreadsheetType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__STYLES:
				setStyles((StylesType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__TEXT:
				setText((TextType)null);
				return;
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_UPDATE:
				unsetAutomaticUpdate();
				return;
			case OfficePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				unsetBooleanValue();
				return;
			case OfficePackage.DOCUMENT_ROOT__CONVERSION_MODE:
				unsetConversionMode();
				return;
			case OfficePackage.DOCUMENT_ROOT__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__DATE_VALUE:
				setDateValue(DATE_VALUE_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__DDE_APPLICATION:
				setDdeApplication(DDE_APPLICATION_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__DDE_ITEM:
				setDdeItem(DDE_ITEM_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__DDE_TOPIC:
				setDdeTopic(DDE_TOPIC_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__DISPLAY:
				unsetDisplay();
				return;
			case OfficePackage.DOCUMENT_ROOT__MIMETYPE:
				setMimetype(MIMETYPE_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__PROCESS_CONTENT:
				unsetProcessContent();
				return;
			case OfficePackage.DOCUMENT_ROOT__SERVER_MAP:
				unsetServerMap();
				return;
			case OfficePackage.DOCUMENT_ROOT__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__TARGET_FRAME:
				setTargetFrame(TARGET_FRAME_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__TARGET_FRAME_NAME:
				setTargetFrameName(TARGET_FRAME_NAME_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__TIME_VALUE:
				setTimeValue(TIME_VALUE_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OfficePackage.DOCUMENT_ROOT__VALUE:
				unsetValue();
				return;
			case OfficePackage.DOCUMENT_ROOT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OfficePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OfficePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OfficePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OfficePackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation() != null;
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_STYLES:
				return getAutomaticStyles() != null;
			case OfficePackage.DOCUMENT_ROOT__BINARY_DATA:
				return BINARY_DATA_EDEFAULT == null ? getBinaryData() != null : !BINARY_DATA_EDEFAULT.equals(getBinaryData());
			case OfficePackage.DOCUMENT_ROOT__BODY:
				return getBody() != null;
			case OfficePackage.DOCUMENT_ROOT__CHANGE_INFO:
				return getChangeInfo() != null;
			case OfficePackage.DOCUMENT_ROOT__CHART:
				return getChart() != null;
			case OfficePackage.DOCUMENT_ROOT__DDE_SOURCE:
				return getDdeSource() != null;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT:
				return getDocument() != null;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_CONTENT:
				return getDocumentContent() != null;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_META:
				return getDocumentMeta() != null;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_SETTINGS:
				return getDocumentSettings() != null;
			case OfficePackage.DOCUMENT_ROOT__DOCUMENT_STYLES:
				return getDocumentStyles() != null;
			case OfficePackage.DOCUMENT_ROOT__DRAWING:
				return getDrawing() != null;
			case OfficePackage.DOCUMENT_ROOT__EVENT_LISTENERS:
				return getEventListeners() != null;
			case OfficePackage.DOCUMENT_ROOT__FONT_FACE_DECLS:
				return getFontFaceDecls() != null;
			case OfficePackage.DOCUMENT_ROOT__FORMS:
				return getForms() != null;
			case OfficePackage.DOCUMENT_ROOT__IMAGE:
				return getImage() != null;
			case OfficePackage.DOCUMENT_ROOT__MASTER_STYLES:
				return getMasterStyles() != null;
			case OfficePackage.DOCUMENT_ROOT__META:
				return getMeta() != null;
			case OfficePackage.DOCUMENT_ROOT__PRESENTATION:
				return getPresentation() != null;
			case OfficePackage.DOCUMENT_ROOT__SCRIPT:
				return getScript() != null;
			case OfficePackage.DOCUMENT_ROOT__SCRIPTS:
				return getScripts() != null;
			case OfficePackage.DOCUMENT_ROOT__SETTINGS:
				return getSettings() != null;
			case OfficePackage.DOCUMENT_ROOT__SPREADSHEET:
				return getSpreadsheet() != null;
			case OfficePackage.DOCUMENT_ROOT__STYLES:
				return getStyles() != null;
			case OfficePackage.DOCUMENT_ROOT__TEXT:
				return getText() != null;
			case OfficePackage.DOCUMENT_ROOT__AUTOMATIC_UPDATE:
				return isSetAutomaticUpdate();
			case OfficePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				return isSetBooleanValue();
			case OfficePackage.DOCUMENT_ROOT__CONVERSION_MODE:
				return isSetConversionMode();
			case OfficePackage.DOCUMENT_ROOT__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case OfficePackage.DOCUMENT_ROOT__DATE_VALUE:
				return DATE_VALUE_EDEFAULT == null ? dateValue != null : !DATE_VALUE_EDEFAULT.equals(dateValue);
			case OfficePackage.DOCUMENT_ROOT__DDE_APPLICATION:
				return DDE_APPLICATION_EDEFAULT == null ? ddeApplication != null : !DDE_APPLICATION_EDEFAULT.equals(ddeApplication);
			case OfficePackage.DOCUMENT_ROOT__DDE_ITEM:
				return DDE_ITEM_EDEFAULT == null ? ddeItem != null : !DDE_ITEM_EDEFAULT.equals(ddeItem);
			case OfficePackage.DOCUMENT_ROOT__DDE_TOPIC:
				return DDE_TOPIC_EDEFAULT == null ? ddeTopic != null : !DDE_TOPIC_EDEFAULT.equals(ddeTopic);
			case OfficePackage.DOCUMENT_ROOT__DISPLAY:
				return isSetDisplay();
			case OfficePackage.DOCUMENT_ROOT__MIMETYPE:
				return MIMETYPE_EDEFAULT == null ? mimetype != null : !MIMETYPE_EDEFAULT.equals(mimetype);
			case OfficePackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OfficePackage.DOCUMENT_ROOT__PROCESS_CONTENT:
				return isSetProcessContent();
			case OfficePackage.DOCUMENT_ROOT__SERVER_MAP:
				return isSetServerMap();
			case OfficePackage.DOCUMENT_ROOT__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case OfficePackage.DOCUMENT_ROOT__TARGET_FRAME:
				return TARGET_FRAME_EDEFAULT == null ? targetFrame != null : !TARGET_FRAME_EDEFAULT.equals(targetFrame);
			case OfficePackage.DOCUMENT_ROOT__TARGET_FRAME_NAME:
				return TARGET_FRAME_NAME_EDEFAULT == null ? targetFrameName != null : !TARGET_FRAME_NAME_EDEFAULT.equals(targetFrameName);
			case OfficePackage.DOCUMENT_ROOT__TIME_VALUE:
				return TIME_VALUE_EDEFAULT == null ? timeValue != null : !TIME_VALUE_EDEFAULT.equals(timeValue);
			case OfficePackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OfficePackage.DOCUMENT_ROOT__VALUE:
				return isSetValue();
			case OfficePackage.DOCUMENT_ROOT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", automaticUpdate: ");
		if (automaticUpdateESet) result.append(automaticUpdate); else result.append("<unset>");
		result.append(", booleanValue: ");
		if (booleanValueESet) result.append(booleanValue); else result.append("<unset>");
		result.append(", conversionMode: ");
		if (conversionModeESet) result.append(conversionMode); else result.append("<unset>");
		result.append(", currency: ");
		result.append(currency);
		result.append(", dateValue: ");
		result.append(dateValue);
		result.append(", ddeApplication: ");
		result.append(ddeApplication);
		result.append(", ddeItem: ");
		result.append(ddeItem);
		result.append(", ddeTopic: ");
		result.append(ddeTopic);
		result.append(", display: ");
		if (displayESet) result.append(display); else result.append("<unset>");
		result.append(", mimetype: ");
		result.append(mimetype);
		result.append(", name: ");
		result.append(name);
		result.append(", processContent: ");
		if (processContentESet) result.append(processContent); else result.append("<unset>");
		result.append(", serverMap: ");
		if (serverMapESet) result.append(serverMap); else result.append("<unset>");
		result.append(", stringValue: ");
		result.append(stringValue);
		result.append(", targetFrame: ");
		result.append(targetFrame);
		result.append(", targetFrameName: ");
		result.append(targetFrameName);
		result.append(", timeValue: ");
		result.append(timeValue);
		result.append(", title: ");
		result.append(title);
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
