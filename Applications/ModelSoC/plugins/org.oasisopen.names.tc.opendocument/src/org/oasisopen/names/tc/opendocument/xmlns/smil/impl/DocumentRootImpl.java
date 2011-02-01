/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.smil.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getAccelerate <em>Accelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getAccumulate <em>Accumulate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getAutoReverse <em>Auto Reverse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getBy <em>By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getCalcMode <em>Calc Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getDecelerate <em>Decelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getEndsync <em>Endsync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getFillDefault <em>Fill Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getKeySplines <em>Key Splines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getKeyTimes <em>Key Times</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getRepeatDur <em>Repeat Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getRestartDefault <em>Restart Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.impl.DocumentRootImpl#getValues <em>Values</em>}</li>
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
	 * The default value of the '{@link #getAccelerate() <em>Accelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccelerate()
	 * @generated
	 * @ordered
	 */
	protected static final double ACCELERATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAccelerate() <em>Accelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccelerate()
	 * @generated
	 * @ordered
	 */
	protected double accelerate = ACCELERATE_EDEFAULT;

	/**
	 * This is true if the Accelerate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accelerateESet;

	/**
	 * The default value of the '{@link #getAccumulate() <em>Accumulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulate()
	 * @generated
	 * @ordered
	 */
	protected static final AccumulateType ACCUMULATE_EDEFAULT = AccumulateType.NONE;

	/**
	 * The cached value of the '{@link #getAccumulate() <em>Accumulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulate()
	 * @generated
	 * @ordered
	 */
	protected AccumulateType accumulate = ACCUMULATE_EDEFAULT;

	/**
	 * This is true if the Accumulate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accumulateESet;

	/**
	 * The default value of the '{@link #getAdditive() <em>Additive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditive()
	 * @generated
	 * @ordered
	 */
	protected static final AdditiveType ADDITIVE_EDEFAULT = AdditiveType.REPLACE;

	/**
	 * The cached value of the '{@link #getAdditive() <em>Additive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditive()
	 * @generated
	 * @ordered
	 */
	protected AdditiveType additive = ADDITIVE_EDEFAULT;

	/**
	 * This is true if the Additive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean additiveESet;

	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoReverse() <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoReverse()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTO_REVERSE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoReverse() <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoReverse()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean autoReverse = AUTO_REVERSE_EDEFAULT;

	/**
	 * This is true if the Auto Reverse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoReverseESet;

	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected String begin = BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBy() <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBy() <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected String by = BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalcMode() <em>Calc Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcMode()
	 * @generated
	 * @ordered
	 */
	protected static final CalcModeType CALC_MODE_EDEFAULT = CalcModeType.DISCRETE;

	/**
	 * The cached value of the '{@link #getCalcMode() <em>Calc Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcMode()
	 * @generated
	 * @ordered
	 */
	protected CalcModeType calcMode = CALC_MODE_EDEFAULT;

	/**
	 * This is true if the Calc Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calcModeESet;

	/**
	 * The default value of the '{@link #getDecelerate() <em>Decelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecelerate()
	 * @generated
	 * @ordered
	 */
	protected static final double DECELERATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDecelerate() <em>Decelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecelerate()
	 * @generated
	 * @ordered
	 */
	protected double decelerate = DECELERATE_EDEFAULT;

	/**
	 * This is true if the Decelerate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean decelerateESet;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.FORWARD;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getDur() <em>Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDur()
	 * @generated
	 * @ordered
	 */
	protected static final String DUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDur() <em>Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDur()
	 * @generated
	 * @ordered
	 */
	protected String dur = DUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndsync() <em>Endsync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndsync()
	 * @generated
	 * @ordered
	 */
	protected static final EndsyncType ENDSYNC_EDEFAULT = EndsyncType.FIRST;

	/**
	 * The cached value of the '{@link #getEndsync() <em>Endsync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndsync()
	 * @generated
	 * @ordered
	 */
	protected EndsyncType endsync = ENDSYNC_EDEFAULT;

	/**
	 * This is true if the Endsync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endsyncESet;

	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final FillType FILL_EDEFAULT = FillType.REMOVE;

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected FillType fill = FILL_EDEFAULT;

	/**
	 * This is true if the Fill attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillESet;

	/**
	 * The default value of the '{@link #getFillDefault() <em>Fill Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillDefault()
	 * @generated
	 * @ordered
	 */
	protected static final FillDefaultType FILL_DEFAULT_EDEFAULT = FillDefaultType.REMOVE;

	/**
	 * The cached value of the '{@link #getFillDefault() <em>Fill Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillDefault()
	 * @generated
	 * @ordered
	 */
	protected FillDefaultType fillDefault = FILL_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Fill Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillDefaultESet;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeySplines() <em>Key Splines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySplines()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_SPLINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeySplines() <em>Key Splines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySplines()
	 * @generated
	 * @ordered
	 */
	protected String keySplines = KEY_SPLINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyTimes() <em>Key Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyTimes()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_TIMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyTimes() <em>Key Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyTimes()
	 * @generated
	 * @ordered
	 */
	protected String keyTimes = KEY_TIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ModeType MODE_EDEFAULT = ModeType.IN;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ModeType mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected static final Object REPEAT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected Object repeatCount = REPEAT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatDur() <em>Repeat Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatDur()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEAT_DUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatDur() <em>Repeat Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatDur()
	 * @generated
	 * @ordered
	 */
	protected String repeatDur = REPEAT_DUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected static final RestartType RESTART_EDEFAULT = RestartType.NEVER;

	/**
	 * The cached value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected RestartType restart = RESTART_EDEFAULT;

	/**
	 * This is true if the Restart attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restartESet;

	/**
	 * The default value of the '{@link #getRestartDefault() <em>Restart Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartDefault()
	 * @generated
	 * @ordered
	 */
	protected static final RestartDefaultType RESTART_DEFAULT_EDEFAULT = RestartDefaultType.NEVER;

	/**
	 * The cached value of the '{@link #getRestartDefault() <em>Restart Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartDefault()
	 * @generated
	 * @ordered
	 */
	protected RestartDefaultType restartDefault = RESTART_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Restart Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restartDefaultESet;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected String targetElement = TARGET_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected String values = VALUES_EDEFAULT;

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
		return CompatiblePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CompatiblePackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CompatiblePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CompatiblePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAccelerate() {
		return accelerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccelerate(double newAccelerate) {
		double oldAccelerate = accelerate;
		accelerate = newAccelerate;
		boolean oldAccelerateESet = accelerateESet;
		accelerateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__ACCELERATE, oldAccelerate, accelerate, !oldAccelerateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccelerate() {
		double oldAccelerate = accelerate;
		boolean oldAccelerateESet = accelerateESet;
		accelerate = ACCELERATE_EDEFAULT;
		accelerateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__ACCELERATE, oldAccelerate, ACCELERATE_EDEFAULT, oldAccelerateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccelerate() {
		return accelerateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulateType getAccumulate() {
		return accumulate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccumulate(AccumulateType newAccumulate) {
		AccumulateType oldAccumulate = accumulate;
		accumulate = newAccumulate == null ? ACCUMULATE_EDEFAULT : newAccumulate;
		boolean oldAccumulateESet = accumulateESet;
		accumulateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__ACCUMULATE, oldAccumulate, accumulate, !oldAccumulateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccumulate() {
		AccumulateType oldAccumulate = accumulate;
		boolean oldAccumulateESet = accumulateESet;
		accumulate = ACCUMULATE_EDEFAULT;
		accumulateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__ACCUMULATE, oldAccumulate, ACCUMULATE_EDEFAULT, oldAccumulateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccumulate() {
		return accumulateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveType getAdditive() {
		return additive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditive(AdditiveType newAdditive) {
		AdditiveType oldAdditive = additive;
		additive = newAdditive == null ? ADDITIVE_EDEFAULT : newAdditive;
		boolean oldAdditiveESet = additiveESet;
		additiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__ADDITIVE, oldAdditive, additive, !oldAdditiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdditive() {
		AdditiveType oldAdditive = additive;
		boolean oldAdditiveESet = additiveESet;
		additive = ADDITIVE_EDEFAULT;
		additiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__ADDITIVE, oldAdditive, ADDITIVE_EDEFAULT, oldAdditiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdditive() {
		return additiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoReverse() {
		return autoReverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoReverse(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutoReverse) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoReverse = autoReverse;
		autoReverse = newAutoReverse == null ? AUTO_REVERSE_EDEFAULT : newAutoReverse;
		boolean oldAutoReverseESet = autoReverseESet;
		autoReverseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__AUTO_REVERSE, oldAutoReverse, autoReverse, !oldAutoReverseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoReverse() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoReverse = autoReverse;
		boolean oldAutoReverseESet = autoReverseESet;
		autoReverse = AUTO_REVERSE_EDEFAULT;
		autoReverseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__AUTO_REVERSE, oldAutoReverse, AUTO_REVERSE_EDEFAULT, oldAutoReverseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoReverse() {
		return autoReverseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBegin(String newBegin) {
		String oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBy() {
		return by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBy(String newBy) {
		String oldBy = by;
		by = newBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__BY, oldBy, by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcModeType getCalcMode() {
		return calcMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcMode(CalcModeType newCalcMode) {
		CalcModeType oldCalcMode = calcMode;
		calcMode = newCalcMode == null ? CALC_MODE_EDEFAULT : newCalcMode;
		boolean oldCalcModeESet = calcModeESet;
		calcModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__CALC_MODE, oldCalcMode, calcMode, !oldCalcModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCalcMode() {
		CalcModeType oldCalcMode = calcMode;
		boolean oldCalcModeESet = calcModeESet;
		calcMode = CALC_MODE_EDEFAULT;
		calcModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__CALC_MODE, oldCalcMode, CALC_MODE_EDEFAULT, oldCalcModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCalcMode() {
		return calcModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDecelerate() {
		return decelerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecelerate(double newDecelerate) {
		double oldDecelerate = decelerate;
		decelerate = newDecelerate;
		boolean oldDecelerateESet = decelerateESet;
		decelerateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__DECELERATE, oldDecelerate, decelerate, !oldDecelerateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDecelerate() {
		double oldDecelerate = decelerate;
		boolean oldDecelerateESet = decelerateESet;
		decelerate = DECELERATE_EDEFAULT;
		decelerateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__DECELERATE, oldDecelerate, DECELERATE_EDEFAULT, oldDecelerateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDecelerate() {
		return decelerateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		DirectionType oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDur() {
		return dur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDur(String newDur) {
		String oldDur = dur;
		dur = newDur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__DUR, oldDur, dur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndsyncType getEndsync() {
		return endsync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndsync(EndsyncType newEndsync) {
		EndsyncType oldEndsync = endsync;
		endsync = newEndsync == null ? ENDSYNC_EDEFAULT : newEndsync;
		boolean oldEndsyncESet = endsyncESet;
		endsyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__ENDSYNC, oldEndsync, endsync, !oldEndsyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndsync() {
		EndsyncType oldEndsync = endsync;
		boolean oldEndsyncESet = endsyncESet;
		endsync = ENDSYNC_EDEFAULT;
		endsyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__ENDSYNC, oldEndsync, ENDSYNC_EDEFAULT, oldEndsyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndsync() {
		return endsyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillType getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(FillType newFill) {
		FillType oldFill = fill;
		fill = newFill == null ? FILL_EDEFAULT : newFill;
		boolean oldFillESet = fillESet;
		fillESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__FILL, oldFill, fill, !oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFill() {
		FillType oldFill = fill;
		boolean oldFillESet = fillESet;
		fill = FILL_EDEFAULT;
		fillESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFill() {
		return fillESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillDefaultType getFillDefault() {
		return fillDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillDefault(FillDefaultType newFillDefault) {
		FillDefaultType oldFillDefault = fillDefault;
		fillDefault = newFillDefault == null ? FILL_DEFAULT_EDEFAULT : newFillDefault;
		boolean oldFillDefaultESet = fillDefaultESet;
		fillDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__FILL_DEFAULT, oldFillDefault, fillDefault, !oldFillDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillDefault() {
		FillDefaultType oldFillDefault = fillDefault;
		boolean oldFillDefaultESet = fillDefaultESet;
		fillDefault = FILL_DEFAULT_EDEFAULT;
		fillDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__FILL_DEFAULT, oldFillDefault, FILL_DEFAULT_EDEFAULT, oldFillDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillDefault() {
		return fillDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeySplines() {
		return keySplines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeySplines(String newKeySplines) {
		String oldKeySplines = keySplines;
		keySplines = newKeySplines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__KEY_SPLINES, oldKeySplines, keySplines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyTimes() {
		return keyTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyTimes(String newKeyTimes) {
		String oldKeyTimes = keyTimes;
		keyTimes = newKeyTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__KEY_TIMES, oldKeyTimes, keyTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ModeType newMode) {
		ModeType oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode() {
		ModeType oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRepeatCount() {
		return repeatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatCount(Object newRepeatCount) {
		Object oldRepeatCount = repeatCount;
		repeatCount = newRepeatCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__REPEAT_COUNT, oldRepeatCount, repeatCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeatDur() {
		return repeatDur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatDur(String newRepeatDur) {
		String oldRepeatDur = repeatDur;
		repeatDur = newRepeatDur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__REPEAT_DUR, oldRepeatDur, repeatDur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartType getRestart() {
		return restart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestart(RestartType newRestart) {
		RestartType oldRestart = restart;
		restart = newRestart == null ? RESTART_EDEFAULT : newRestart;
		boolean oldRestartESet = restartESet;
		restartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__RESTART, oldRestart, restart, !oldRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRestart() {
		RestartType oldRestart = restart;
		boolean oldRestartESet = restartESet;
		restart = RESTART_EDEFAULT;
		restartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__RESTART, oldRestart, RESTART_EDEFAULT, oldRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRestart() {
		return restartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartDefaultType getRestartDefault() {
		return restartDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartDefault(RestartDefaultType newRestartDefault) {
		RestartDefaultType oldRestartDefault = restartDefault;
		restartDefault = newRestartDefault == null ? RESTART_DEFAULT_EDEFAULT : newRestartDefault;
		boolean oldRestartDefaultESet = restartDefaultESet;
		restartDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__RESTART_DEFAULT, oldRestartDefault, restartDefault, !oldRestartDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRestartDefault() {
		RestartDefaultType oldRestartDefault = restartDefault;
		boolean oldRestartDefaultESet = restartDefaultESet;
		restartDefault = RESTART_DEFAULT_EDEFAULT;
		restartDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CompatiblePackage.DOCUMENT_ROOT__RESTART_DEFAULT, oldRestartDefault, RESTART_DEFAULT_EDEFAULT, oldRestartDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRestartDefault() {
		return restartDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(String newTargetElement) {
		String oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__TARGET_ELEMENT, oldTargetElement, targetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(String newValues) {
		String oldValues = values;
		values = newValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompatiblePackage.DOCUMENT_ROOT__VALUES, oldValues, values));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompatiblePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CompatiblePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CompatiblePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
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
			case CompatiblePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CompatiblePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CompatiblePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CompatiblePackage.DOCUMENT_ROOT__ACCELERATE:
				return new Double(getAccelerate());
			case CompatiblePackage.DOCUMENT_ROOT__ACCUMULATE:
				return getAccumulate();
			case CompatiblePackage.DOCUMENT_ROOT__ADDITIVE:
				return getAdditive();
			case CompatiblePackage.DOCUMENT_ROOT__ATTRIBUTE_NAME:
				return getAttributeName();
			case CompatiblePackage.DOCUMENT_ROOT__AUTO_REVERSE:
				return getAutoReverse();
			case CompatiblePackage.DOCUMENT_ROOT__BEGIN:
				return getBegin();
			case CompatiblePackage.DOCUMENT_ROOT__BY:
				return getBy();
			case CompatiblePackage.DOCUMENT_ROOT__CALC_MODE:
				return getCalcMode();
			case CompatiblePackage.DOCUMENT_ROOT__DECELERATE:
				return new Double(getDecelerate());
			case CompatiblePackage.DOCUMENT_ROOT__DIRECTION:
				return getDirection();
			case CompatiblePackage.DOCUMENT_ROOT__DUR:
				return getDur();
			case CompatiblePackage.DOCUMENT_ROOT__END:
				return getEnd();
			case CompatiblePackage.DOCUMENT_ROOT__ENDSYNC:
				return getEndsync();
			case CompatiblePackage.DOCUMENT_ROOT__FILL:
				return getFill();
			case CompatiblePackage.DOCUMENT_ROOT__FILL_DEFAULT:
				return getFillDefault();
			case CompatiblePackage.DOCUMENT_ROOT__FROM:
				return getFrom();
			case CompatiblePackage.DOCUMENT_ROOT__KEY_SPLINES:
				return getKeySplines();
			case CompatiblePackage.DOCUMENT_ROOT__KEY_TIMES:
				return getKeyTimes();
			case CompatiblePackage.DOCUMENT_ROOT__MODE:
				return getMode();
			case CompatiblePackage.DOCUMENT_ROOT__REPEAT_COUNT:
				return getRepeatCount();
			case CompatiblePackage.DOCUMENT_ROOT__REPEAT_DUR:
				return getRepeatDur();
			case CompatiblePackage.DOCUMENT_ROOT__RESTART:
				return getRestart();
			case CompatiblePackage.DOCUMENT_ROOT__RESTART_DEFAULT:
				return getRestartDefault();
			case CompatiblePackage.DOCUMENT_ROOT__SUBTYPE:
				return getSubtype();
			case CompatiblePackage.DOCUMENT_ROOT__TARGET_ELEMENT:
				return getTargetElement();
			case CompatiblePackage.DOCUMENT_ROOT__TO:
				return getTo();
			case CompatiblePackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case CompatiblePackage.DOCUMENT_ROOT__VALUES:
				return getValues();
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
			case CompatiblePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ACCELERATE:
				setAccelerate(((Double)newValue).doubleValue());
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ACCUMULATE:
				setAccumulate((AccumulateType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ADDITIVE:
				setAdditive((AdditiveType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__AUTO_REVERSE:
				setAutoReverse((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__BEGIN:
				setBegin((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__BY:
				setBy((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__CALC_MODE:
				setCalcMode((CalcModeType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__DECELERATE:
				setDecelerate(((Double)newValue).doubleValue());
				return;
			case CompatiblePackage.DOCUMENT_ROOT__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__DUR:
				setDur((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__END:
				setEnd((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ENDSYNC:
				setEndsync((EndsyncType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__FILL:
				setFill((FillType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__FILL_DEFAULT:
				setFillDefault((FillDefaultType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__FROM:
				setFrom((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__KEY_SPLINES:
				setKeySplines((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__KEY_TIMES:
				setKeyTimes((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__MODE:
				setMode((ModeType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__REPEAT_COUNT:
				setRepeatCount(newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__REPEAT_DUR:
				setRepeatDur((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__RESTART:
				setRestart((RestartType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__RESTART_DEFAULT:
				setRestartDefault((RestartDefaultType)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__TARGET_ELEMENT:
				setTargetElement((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__TO:
				setTo((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__TYPE:
				setType((String)newValue);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__VALUES:
				setValues((String)newValue);
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
			case CompatiblePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ACCELERATE:
				unsetAccelerate();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ACCUMULATE:
				unsetAccumulate();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ADDITIVE:
				unsetAdditive();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__AUTO_REVERSE:
				unsetAutoReverse();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__BY:
				setBy(BY_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__CALC_MODE:
				unsetCalcMode();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__DECELERATE:
				unsetDecelerate();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__DIRECTION:
				unsetDirection();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__DUR:
				setDur(DUR_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__END:
				setEnd(END_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__ENDSYNC:
				unsetEndsync();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__FILL:
				unsetFill();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__FILL_DEFAULT:
				unsetFillDefault();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__KEY_SPLINES:
				setKeySplines(KEY_SPLINES_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__KEY_TIMES:
				setKeyTimes(KEY_TIMES_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__MODE:
				unsetMode();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__REPEAT_COUNT:
				setRepeatCount(REPEAT_COUNT_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__REPEAT_DUR:
				setRepeatDur(REPEAT_DUR_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__RESTART:
				unsetRestart();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__RESTART_DEFAULT:
				unsetRestartDefault();
				return;
			case CompatiblePackage.DOCUMENT_ROOT__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__TARGET_ELEMENT:
				setTargetElement(TARGET_ELEMENT_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__TO:
				setTo(TO_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CompatiblePackage.DOCUMENT_ROOT__VALUES:
				setValues(VALUES_EDEFAULT);
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
			case CompatiblePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CompatiblePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CompatiblePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CompatiblePackage.DOCUMENT_ROOT__ACCELERATE:
				return isSetAccelerate();
			case CompatiblePackage.DOCUMENT_ROOT__ACCUMULATE:
				return isSetAccumulate();
			case CompatiblePackage.DOCUMENT_ROOT__ADDITIVE:
				return isSetAdditive();
			case CompatiblePackage.DOCUMENT_ROOT__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case CompatiblePackage.DOCUMENT_ROOT__AUTO_REVERSE:
				return isSetAutoReverse();
			case CompatiblePackage.DOCUMENT_ROOT__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case CompatiblePackage.DOCUMENT_ROOT__BY:
				return BY_EDEFAULT == null ? by != null : !BY_EDEFAULT.equals(by);
			case CompatiblePackage.DOCUMENT_ROOT__CALC_MODE:
				return isSetCalcMode();
			case CompatiblePackage.DOCUMENT_ROOT__DECELERATE:
				return isSetDecelerate();
			case CompatiblePackage.DOCUMENT_ROOT__DIRECTION:
				return isSetDirection();
			case CompatiblePackage.DOCUMENT_ROOT__DUR:
				return DUR_EDEFAULT == null ? dur != null : !DUR_EDEFAULT.equals(dur);
			case CompatiblePackage.DOCUMENT_ROOT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case CompatiblePackage.DOCUMENT_ROOT__ENDSYNC:
				return isSetEndsync();
			case CompatiblePackage.DOCUMENT_ROOT__FILL:
				return isSetFill();
			case CompatiblePackage.DOCUMENT_ROOT__FILL_DEFAULT:
				return isSetFillDefault();
			case CompatiblePackage.DOCUMENT_ROOT__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case CompatiblePackage.DOCUMENT_ROOT__KEY_SPLINES:
				return KEY_SPLINES_EDEFAULT == null ? keySplines != null : !KEY_SPLINES_EDEFAULT.equals(keySplines);
			case CompatiblePackage.DOCUMENT_ROOT__KEY_TIMES:
				return KEY_TIMES_EDEFAULT == null ? keyTimes != null : !KEY_TIMES_EDEFAULT.equals(keyTimes);
			case CompatiblePackage.DOCUMENT_ROOT__MODE:
				return isSetMode();
			case CompatiblePackage.DOCUMENT_ROOT__REPEAT_COUNT:
				return REPEAT_COUNT_EDEFAULT == null ? repeatCount != null : !REPEAT_COUNT_EDEFAULT.equals(repeatCount);
			case CompatiblePackage.DOCUMENT_ROOT__REPEAT_DUR:
				return REPEAT_DUR_EDEFAULT == null ? repeatDur != null : !REPEAT_DUR_EDEFAULT.equals(repeatDur);
			case CompatiblePackage.DOCUMENT_ROOT__RESTART:
				return isSetRestart();
			case CompatiblePackage.DOCUMENT_ROOT__RESTART_DEFAULT:
				return isSetRestartDefault();
			case CompatiblePackage.DOCUMENT_ROOT__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case CompatiblePackage.DOCUMENT_ROOT__TARGET_ELEMENT:
				return TARGET_ELEMENT_EDEFAULT == null ? targetElement != null : !TARGET_ELEMENT_EDEFAULT.equals(targetElement);
			case CompatiblePackage.DOCUMENT_ROOT__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case CompatiblePackage.DOCUMENT_ROOT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CompatiblePackage.DOCUMENT_ROOT__VALUES:
				return VALUES_EDEFAULT == null ? values != null : !VALUES_EDEFAULT.equals(values);
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
		result.append(", accelerate: ");
		if (accelerateESet) result.append(accelerate); else result.append("<unset>");
		result.append(", accumulate: ");
		if (accumulateESet) result.append(accumulate); else result.append("<unset>");
		result.append(", additive: ");
		if (additiveESet) result.append(additive); else result.append("<unset>");
		result.append(", attributeName: ");
		result.append(attributeName);
		result.append(", autoReverse: ");
		if (autoReverseESet) result.append(autoReverse); else result.append("<unset>");
		result.append(", begin: ");
		result.append(begin);
		result.append(", by: ");
		result.append(by);
		result.append(", calcMode: ");
		if (calcModeESet) result.append(calcMode); else result.append("<unset>");
		result.append(", decelerate: ");
		if (decelerateESet) result.append(decelerate); else result.append("<unset>");
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", dur: ");
		result.append(dur);
		result.append(", end: ");
		result.append(end);
		result.append(", endsync: ");
		if (endsyncESet) result.append(endsync); else result.append("<unset>");
		result.append(", fill: ");
		if (fillESet) result.append(fill); else result.append("<unset>");
		result.append(", fillDefault: ");
		if (fillDefaultESet) result.append(fillDefault); else result.append("<unset>");
		result.append(", from: ");
		result.append(from);
		result.append(", keySplines: ");
		result.append(keySplines);
		result.append(", keyTimes: ");
		result.append(keyTimes);
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", repeatCount: ");
		result.append(repeatCount);
		result.append(", repeatDur: ");
		result.append(repeatDur);
		result.append(", restart: ");
		if (restartESet) result.append(restart); else result.append("<unset>");
		result.append(", restartDefault: ");
		if (restartDefaultESet) result.append(restartDefault); else result.append("<unset>");
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", targetElement: ");
		result.append(targetElement);
		result.append(", to: ");
		result.append(to);
		result.append(", type: ");
		result.append(type);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
