/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.animation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getAccelerate <em>Accelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getAccumulate <em>Accumulate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getAutoReverse <em>Auto Reverse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getBy <em>By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getCalcMode <em>Calc Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getDecelerate <em>Decelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getFillDefault <em>Fill Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getKeySplines <em>Key Splines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getKeyTimes <em>Key Times</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getRepeatDur <em>Repeat Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getRestartDefault <em>Restart Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getSubItem <em>Sub Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimateTypeImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnimateTypeImpl extends EObjectImpl implements AnimateType {
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
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTO_REVERSE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

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
	protected static final RestartType RESTART_EDEFAULT = RestartType.DEFAULT;

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
	protected static final RestartDefaultType RESTART_DEFAULT_EDEFAULT = RestartDefaultType.INHERIT;

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
	 * The default value of the '{@link #getSubItem() <em>Sub Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubItem()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubItem() <em>Sub Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubItem()
	 * @generated
	 * @ordered
	 */
	protected String subItem = SUB_ITEM_EDEFAULT;

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
	protected AnimateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.ANIMATE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__ACCELERATE, oldAccelerate, accelerate, !oldAccelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__ACCELERATE, oldAccelerate, ACCELERATE_EDEFAULT, oldAccelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__ACCUMULATE, oldAccumulate, accumulate, !oldAccumulateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__ACCUMULATE, oldAccumulate, ACCUMULATE_EDEFAULT, oldAccumulateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__ADDITIVE, oldAdditive, additive, !oldAdditiveESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__ADDITIVE, oldAdditive, ADDITIVE_EDEFAULT, oldAdditiveESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__AUTO_REVERSE, oldAutoReverse, autoReverse, !oldAutoReverseESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__AUTO_REVERSE, oldAutoReverse, AUTO_REVERSE_EDEFAULT, oldAutoReverseESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__BEGIN, oldBegin, begin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__BY, oldBy, by));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__CALC_MODE, oldCalcMode, calcMode, !oldCalcModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__CALC_MODE, oldCalcMode, CALC_MODE_EDEFAULT, oldCalcModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__DECELERATE, oldDecelerate, decelerate, !oldDecelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__DECELERATE, oldDecelerate, DECELERATE_EDEFAULT, oldDecelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__DUR, oldDur, dur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__END, oldEnd, end));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__FILL, oldFill, fill, !oldFillESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__FILL_DEFAULT, oldFillDefault, fillDefault, !oldFillDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__FILL_DEFAULT, oldFillDefault, FILL_DEFAULT_EDEFAULT, oldFillDefaultESet));
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
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__FORMULA, oldFormula, formula));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__FROM, oldFrom, from));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__KEY_SPLINES, oldKeySplines, keySplines));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__KEY_TIMES, oldKeyTimes, keyTimes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__REPEAT_COUNT, oldRepeatCount, repeatCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__REPEAT_DUR, oldRepeatDur, repeatDur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__RESTART, oldRestart, restart, !oldRestartESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__RESTART, oldRestart, RESTART_EDEFAULT, oldRestartESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__RESTART_DEFAULT, oldRestartDefault, restartDefault, !oldRestartDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.ANIMATE_TYPE__RESTART_DEFAULT, oldRestartDefault, RESTART_DEFAULT_EDEFAULT, oldRestartDefaultESet));
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
	public String getSubItem() {
		return subItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubItem(String newSubItem) {
		String oldSubItem = subItem;
		subItem = newSubItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__SUB_ITEM, oldSubItem, subItem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__TARGET_ELEMENT, oldTargetElement, targetElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__TO, oldTo, to));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.ANIMATE_TYPE__VALUES, oldValues, values));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnimationPackage.ANIMATE_TYPE__ACCELERATE:
				return new Double(getAccelerate());
			case AnimationPackage.ANIMATE_TYPE__ACCUMULATE:
				return getAccumulate();
			case AnimationPackage.ANIMATE_TYPE__ADDITIVE:
				return getAdditive();
			case AnimationPackage.ANIMATE_TYPE__ATTRIBUTE_NAME:
				return getAttributeName();
			case AnimationPackage.ANIMATE_TYPE__AUTO_REVERSE:
				return getAutoReverse();
			case AnimationPackage.ANIMATE_TYPE__BEGIN:
				return getBegin();
			case AnimationPackage.ANIMATE_TYPE__BY:
				return getBy();
			case AnimationPackage.ANIMATE_TYPE__CALC_MODE:
				return getCalcMode();
			case AnimationPackage.ANIMATE_TYPE__DECELERATE:
				return new Double(getDecelerate());
			case AnimationPackage.ANIMATE_TYPE__DUR:
				return getDur();
			case AnimationPackage.ANIMATE_TYPE__END:
				return getEnd();
			case AnimationPackage.ANIMATE_TYPE__FILL:
				return getFill();
			case AnimationPackage.ANIMATE_TYPE__FILL_DEFAULT:
				return getFillDefault();
			case AnimationPackage.ANIMATE_TYPE__FORMULA:
				return getFormula();
			case AnimationPackage.ANIMATE_TYPE__FROM:
				return getFrom();
			case AnimationPackage.ANIMATE_TYPE__KEY_SPLINES:
				return getKeySplines();
			case AnimationPackage.ANIMATE_TYPE__KEY_TIMES:
				return getKeyTimes();
			case AnimationPackage.ANIMATE_TYPE__REPEAT_COUNT:
				return getRepeatCount();
			case AnimationPackage.ANIMATE_TYPE__REPEAT_DUR:
				return getRepeatDur();
			case AnimationPackage.ANIMATE_TYPE__RESTART:
				return getRestart();
			case AnimationPackage.ANIMATE_TYPE__RESTART_DEFAULT:
				return getRestartDefault();
			case AnimationPackage.ANIMATE_TYPE__SUB_ITEM:
				return getSubItem();
			case AnimationPackage.ANIMATE_TYPE__TARGET_ELEMENT:
				return getTargetElement();
			case AnimationPackage.ANIMATE_TYPE__TO:
				return getTo();
			case AnimationPackage.ANIMATE_TYPE__VALUES:
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
			case AnimationPackage.ANIMATE_TYPE__ACCELERATE:
				setAccelerate(((Double)newValue).doubleValue());
				return;
			case AnimationPackage.ANIMATE_TYPE__ACCUMULATE:
				setAccumulate((AccumulateType)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__ADDITIVE:
				setAdditive((AdditiveType)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__AUTO_REVERSE:
				setAutoReverse((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__BEGIN:
				setBegin((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__BY:
				setBy((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__CALC_MODE:
				setCalcMode((CalcModeType)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__DECELERATE:
				setDecelerate(((Double)newValue).doubleValue());
				return;
			case AnimationPackage.ANIMATE_TYPE__DUR:
				setDur((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__END:
				setEnd((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__FILL:
				setFill((FillType)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__FILL_DEFAULT:
				setFillDefault((FillDefaultType)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__FORMULA:
				setFormula((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__FROM:
				setFrom((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__KEY_SPLINES:
				setKeySplines((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__KEY_TIMES:
				setKeyTimes((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__REPEAT_COUNT:
				setRepeatCount(newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__REPEAT_DUR:
				setRepeatDur((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__RESTART:
				setRestart((RestartType)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__RESTART_DEFAULT:
				setRestartDefault((RestartDefaultType)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__SUB_ITEM:
				setSubItem((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__TARGET_ELEMENT:
				setTargetElement((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__TO:
				setTo((String)newValue);
				return;
			case AnimationPackage.ANIMATE_TYPE__VALUES:
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
			case AnimationPackage.ANIMATE_TYPE__ACCELERATE:
				unsetAccelerate();
				return;
			case AnimationPackage.ANIMATE_TYPE__ACCUMULATE:
				unsetAccumulate();
				return;
			case AnimationPackage.ANIMATE_TYPE__ADDITIVE:
				unsetAdditive();
				return;
			case AnimationPackage.ANIMATE_TYPE__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__AUTO_REVERSE:
				unsetAutoReverse();
				return;
			case AnimationPackage.ANIMATE_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__BY:
				setBy(BY_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__CALC_MODE:
				unsetCalcMode();
				return;
			case AnimationPackage.ANIMATE_TYPE__DECELERATE:
				unsetDecelerate();
				return;
			case AnimationPackage.ANIMATE_TYPE__DUR:
				setDur(DUR_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__FILL:
				unsetFill();
				return;
			case AnimationPackage.ANIMATE_TYPE__FILL_DEFAULT:
				unsetFillDefault();
				return;
			case AnimationPackage.ANIMATE_TYPE__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__KEY_SPLINES:
				setKeySplines(KEY_SPLINES_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__KEY_TIMES:
				setKeyTimes(KEY_TIMES_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__REPEAT_COUNT:
				setRepeatCount(REPEAT_COUNT_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__REPEAT_DUR:
				setRepeatDur(REPEAT_DUR_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__RESTART:
				unsetRestart();
				return;
			case AnimationPackage.ANIMATE_TYPE__RESTART_DEFAULT:
				unsetRestartDefault();
				return;
			case AnimationPackage.ANIMATE_TYPE__SUB_ITEM:
				setSubItem(SUB_ITEM_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__TARGET_ELEMENT:
				setTargetElement(TARGET_ELEMENT_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__TO:
				setTo(TO_EDEFAULT);
				return;
			case AnimationPackage.ANIMATE_TYPE__VALUES:
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
			case AnimationPackage.ANIMATE_TYPE__ACCELERATE:
				return isSetAccelerate();
			case AnimationPackage.ANIMATE_TYPE__ACCUMULATE:
				return isSetAccumulate();
			case AnimationPackage.ANIMATE_TYPE__ADDITIVE:
				return isSetAdditive();
			case AnimationPackage.ANIMATE_TYPE__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case AnimationPackage.ANIMATE_TYPE__AUTO_REVERSE:
				return isSetAutoReverse();
			case AnimationPackage.ANIMATE_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case AnimationPackage.ANIMATE_TYPE__BY:
				return BY_EDEFAULT == null ? by != null : !BY_EDEFAULT.equals(by);
			case AnimationPackage.ANIMATE_TYPE__CALC_MODE:
				return isSetCalcMode();
			case AnimationPackage.ANIMATE_TYPE__DECELERATE:
				return isSetDecelerate();
			case AnimationPackage.ANIMATE_TYPE__DUR:
				return DUR_EDEFAULT == null ? dur != null : !DUR_EDEFAULT.equals(dur);
			case AnimationPackage.ANIMATE_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case AnimationPackage.ANIMATE_TYPE__FILL:
				return isSetFill();
			case AnimationPackage.ANIMATE_TYPE__FILL_DEFAULT:
				return isSetFillDefault();
			case AnimationPackage.ANIMATE_TYPE__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case AnimationPackage.ANIMATE_TYPE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case AnimationPackage.ANIMATE_TYPE__KEY_SPLINES:
				return KEY_SPLINES_EDEFAULT == null ? keySplines != null : !KEY_SPLINES_EDEFAULT.equals(keySplines);
			case AnimationPackage.ANIMATE_TYPE__KEY_TIMES:
				return KEY_TIMES_EDEFAULT == null ? keyTimes != null : !KEY_TIMES_EDEFAULT.equals(keyTimes);
			case AnimationPackage.ANIMATE_TYPE__REPEAT_COUNT:
				return REPEAT_COUNT_EDEFAULT == null ? repeatCount != null : !REPEAT_COUNT_EDEFAULT.equals(repeatCount);
			case AnimationPackage.ANIMATE_TYPE__REPEAT_DUR:
				return REPEAT_DUR_EDEFAULT == null ? repeatDur != null : !REPEAT_DUR_EDEFAULT.equals(repeatDur);
			case AnimationPackage.ANIMATE_TYPE__RESTART:
				return isSetRestart();
			case AnimationPackage.ANIMATE_TYPE__RESTART_DEFAULT:
				return isSetRestartDefault();
			case AnimationPackage.ANIMATE_TYPE__SUB_ITEM:
				return SUB_ITEM_EDEFAULT == null ? subItem != null : !SUB_ITEM_EDEFAULT.equals(subItem);
			case AnimationPackage.ANIMATE_TYPE__TARGET_ELEMENT:
				return TARGET_ELEMENT_EDEFAULT == null ? targetElement != null : !TARGET_ELEMENT_EDEFAULT.equals(targetElement);
			case AnimationPackage.ANIMATE_TYPE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case AnimationPackage.ANIMATE_TYPE__VALUES:
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
		result.append(" (accelerate: ");
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
		result.append(", dur: ");
		result.append(dur);
		result.append(", end: ");
		result.append(end);
		result.append(", fill: ");
		if (fillESet) result.append(fill); else result.append("<unset>");
		result.append(", fillDefault: ");
		if (fillDefaultESet) result.append(fillDefault); else result.append("<unset>");
		result.append(", formula: ");
		result.append(formula);
		result.append(", from: ");
		result.append(from);
		result.append(", keySplines: ");
		result.append(keySplines);
		result.append(", keyTimes: ");
		result.append(keyTimes);
		result.append(", repeatCount: ");
		result.append(repeatCount);
		result.append(", repeatDur: ");
		result.append(repeatDur);
		result.append(", restart: ");
		if (restartESet) result.append(restart); else result.append("<unset>");
		result.append(", restartDefault: ");
		if (restartDefaultESet) result.append(restartDefault); else result.append("<unset>");
		result.append(", subItem: ");
		result.append(subItem);
		result.append(", targetElement: ");
		result.append(targetElement);
		result.append(", to: ");
		result.append(to);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //AnimateTypeImpl
