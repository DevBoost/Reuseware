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
package org.oasisopen.names.tc.opendocument.xmlns.animation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.SetType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getAccelerate <em>Accelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getAccumulate <em>Accumulate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getAutoReverse <em>Auto Reverse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getDecelerate <em>Decelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getFillDefault <em>Fill Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getRepeatDur <em>Repeat Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getRestartDefault <em>Restart Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getSubItem <em>Sub Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.SetTypeImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetTypeImpl extends EObjectImpl implements SetType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.SET_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__ACCELERATE, oldAccelerate, accelerate, !oldAccelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__ACCELERATE, oldAccelerate, ACCELERATE_EDEFAULT, oldAccelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__ACCUMULATE, oldAccumulate, accumulate, !oldAccumulateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__ACCUMULATE, oldAccumulate, ACCUMULATE_EDEFAULT, oldAccumulateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__ADDITIVE, oldAdditive, additive, !oldAdditiveESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__ADDITIVE, oldAdditive, ADDITIVE_EDEFAULT, oldAdditiveESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__AUTO_REVERSE, oldAutoReverse, autoReverse, !oldAutoReverseESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__AUTO_REVERSE, oldAutoReverse, AUTO_REVERSE_EDEFAULT, oldAutoReverseESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__BEGIN, oldBegin, begin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__DECELERATE, oldDecelerate, decelerate, !oldDecelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__DECELERATE, oldDecelerate, DECELERATE_EDEFAULT, oldDecelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__DUR, oldDur, dur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__END, oldEnd, end));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__FILL, oldFill, fill, !oldFillESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__FILL_DEFAULT, oldFillDefault, fillDefault, !oldFillDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__FILL_DEFAULT, oldFillDefault, FILL_DEFAULT_EDEFAULT, oldFillDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__REPEAT_COUNT, oldRepeatCount, repeatCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__REPEAT_DUR, oldRepeatDur, repeatDur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__RESTART, oldRestart, restart, !oldRestartESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__RESTART, oldRestart, RESTART_EDEFAULT, oldRestartESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__RESTART_DEFAULT, oldRestartDefault, restartDefault, !oldRestartDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.SET_TYPE__RESTART_DEFAULT, oldRestartDefault, RESTART_DEFAULT_EDEFAULT, oldRestartDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__SUB_ITEM, oldSubItem, subItem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__TARGET_ELEMENT, oldTargetElement, targetElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.SET_TYPE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnimationPackage.SET_TYPE__ACCELERATE:
				return new Double(getAccelerate());
			case AnimationPackage.SET_TYPE__ACCUMULATE:
				return getAccumulate();
			case AnimationPackage.SET_TYPE__ADDITIVE:
				return getAdditive();
			case AnimationPackage.SET_TYPE__ATTRIBUTE_NAME:
				return getAttributeName();
			case AnimationPackage.SET_TYPE__AUTO_REVERSE:
				return getAutoReverse();
			case AnimationPackage.SET_TYPE__BEGIN:
				return getBegin();
			case AnimationPackage.SET_TYPE__DECELERATE:
				return new Double(getDecelerate());
			case AnimationPackage.SET_TYPE__DUR:
				return getDur();
			case AnimationPackage.SET_TYPE__END:
				return getEnd();
			case AnimationPackage.SET_TYPE__FILL:
				return getFill();
			case AnimationPackage.SET_TYPE__FILL_DEFAULT:
				return getFillDefault();
			case AnimationPackage.SET_TYPE__REPEAT_COUNT:
				return getRepeatCount();
			case AnimationPackage.SET_TYPE__REPEAT_DUR:
				return getRepeatDur();
			case AnimationPackage.SET_TYPE__RESTART:
				return getRestart();
			case AnimationPackage.SET_TYPE__RESTART_DEFAULT:
				return getRestartDefault();
			case AnimationPackage.SET_TYPE__SUB_ITEM:
				return getSubItem();
			case AnimationPackage.SET_TYPE__TARGET_ELEMENT:
				return getTargetElement();
			case AnimationPackage.SET_TYPE__TO:
				return getTo();
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
			case AnimationPackage.SET_TYPE__ACCELERATE:
				setAccelerate(((Double)newValue).doubleValue());
				return;
			case AnimationPackage.SET_TYPE__ACCUMULATE:
				setAccumulate((AccumulateType)newValue);
				return;
			case AnimationPackage.SET_TYPE__ADDITIVE:
				setAdditive((AdditiveType)newValue);
				return;
			case AnimationPackage.SET_TYPE__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case AnimationPackage.SET_TYPE__AUTO_REVERSE:
				setAutoReverse((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case AnimationPackage.SET_TYPE__BEGIN:
				setBegin((String)newValue);
				return;
			case AnimationPackage.SET_TYPE__DECELERATE:
				setDecelerate(((Double)newValue).doubleValue());
				return;
			case AnimationPackage.SET_TYPE__DUR:
				setDur((String)newValue);
				return;
			case AnimationPackage.SET_TYPE__END:
				setEnd((String)newValue);
				return;
			case AnimationPackage.SET_TYPE__FILL:
				setFill((FillType)newValue);
				return;
			case AnimationPackage.SET_TYPE__FILL_DEFAULT:
				setFillDefault((FillDefaultType)newValue);
				return;
			case AnimationPackage.SET_TYPE__REPEAT_COUNT:
				setRepeatCount(newValue);
				return;
			case AnimationPackage.SET_TYPE__REPEAT_DUR:
				setRepeatDur((String)newValue);
				return;
			case AnimationPackage.SET_TYPE__RESTART:
				setRestart((RestartType)newValue);
				return;
			case AnimationPackage.SET_TYPE__RESTART_DEFAULT:
				setRestartDefault((RestartDefaultType)newValue);
				return;
			case AnimationPackage.SET_TYPE__SUB_ITEM:
				setSubItem((String)newValue);
				return;
			case AnimationPackage.SET_TYPE__TARGET_ELEMENT:
				setTargetElement((String)newValue);
				return;
			case AnimationPackage.SET_TYPE__TO:
				setTo((String)newValue);
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
			case AnimationPackage.SET_TYPE__ACCELERATE:
				unsetAccelerate();
				return;
			case AnimationPackage.SET_TYPE__ACCUMULATE:
				unsetAccumulate();
				return;
			case AnimationPackage.SET_TYPE__ADDITIVE:
				unsetAdditive();
				return;
			case AnimationPackage.SET_TYPE__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case AnimationPackage.SET_TYPE__AUTO_REVERSE:
				unsetAutoReverse();
				return;
			case AnimationPackage.SET_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case AnimationPackage.SET_TYPE__DECELERATE:
				unsetDecelerate();
				return;
			case AnimationPackage.SET_TYPE__DUR:
				setDur(DUR_EDEFAULT);
				return;
			case AnimationPackage.SET_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case AnimationPackage.SET_TYPE__FILL:
				unsetFill();
				return;
			case AnimationPackage.SET_TYPE__FILL_DEFAULT:
				unsetFillDefault();
				return;
			case AnimationPackage.SET_TYPE__REPEAT_COUNT:
				setRepeatCount(REPEAT_COUNT_EDEFAULT);
				return;
			case AnimationPackage.SET_TYPE__REPEAT_DUR:
				setRepeatDur(REPEAT_DUR_EDEFAULT);
				return;
			case AnimationPackage.SET_TYPE__RESTART:
				unsetRestart();
				return;
			case AnimationPackage.SET_TYPE__RESTART_DEFAULT:
				unsetRestartDefault();
				return;
			case AnimationPackage.SET_TYPE__SUB_ITEM:
				setSubItem(SUB_ITEM_EDEFAULT);
				return;
			case AnimationPackage.SET_TYPE__TARGET_ELEMENT:
				setTargetElement(TARGET_ELEMENT_EDEFAULT);
				return;
			case AnimationPackage.SET_TYPE__TO:
				setTo(TO_EDEFAULT);
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
			case AnimationPackage.SET_TYPE__ACCELERATE:
				return isSetAccelerate();
			case AnimationPackage.SET_TYPE__ACCUMULATE:
				return isSetAccumulate();
			case AnimationPackage.SET_TYPE__ADDITIVE:
				return isSetAdditive();
			case AnimationPackage.SET_TYPE__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case AnimationPackage.SET_TYPE__AUTO_REVERSE:
				return isSetAutoReverse();
			case AnimationPackage.SET_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case AnimationPackage.SET_TYPE__DECELERATE:
				return isSetDecelerate();
			case AnimationPackage.SET_TYPE__DUR:
				return DUR_EDEFAULT == null ? dur != null : !DUR_EDEFAULT.equals(dur);
			case AnimationPackage.SET_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case AnimationPackage.SET_TYPE__FILL:
				return isSetFill();
			case AnimationPackage.SET_TYPE__FILL_DEFAULT:
				return isSetFillDefault();
			case AnimationPackage.SET_TYPE__REPEAT_COUNT:
				return REPEAT_COUNT_EDEFAULT == null ? repeatCount != null : !REPEAT_COUNT_EDEFAULT.equals(repeatCount);
			case AnimationPackage.SET_TYPE__REPEAT_DUR:
				return REPEAT_DUR_EDEFAULT == null ? repeatDur != null : !REPEAT_DUR_EDEFAULT.equals(repeatDur);
			case AnimationPackage.SET_TYPE__RESTART:
				return isSetRestart();
			case AnimationPackage.SET_TYPE__RESTART_DEFAULT:
				return isSetRestartDefault();
			case AnimationPackage.SET_TYPE__SUB_ITEM:
				return SUB_ITEM_EDEFAULT == null ? subItem != null : !SUB_ITEM_EDEFAULT.equals(subItem);
			case AnimationPackage.SET_TYPE__TARGET_ELEMENT:
				return TARGET_ELEMENT_EDEFAULT == null ? targetElement != null : !TARGET_ELEMENT_EDEFAULT.equals(targetElement);
			case AnimationPackage.SET_TYPE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
		result.append(')');
		return result.toString();
	}

} //SetTypeImpl
