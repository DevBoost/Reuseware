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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ParType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Par Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getAnimationElementGroup <em>Animation Element Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getAnimationElement <em>Animation Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getAccelerate <em>Accelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getAutoReverse <em>Auto Reverse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getDecelerate <em>Decelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getEndsync <em>Endsync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getFillDefault <em>Fill Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getMasterElement <em>Master Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getPresetClass <em>Preset Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getPresetId <em>Preset Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getPresetSubType <em>Preset Sub Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getRepeatDur <em>Repeat Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.ParTypeImpl#getRestartDefault <em>Restart Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParTypeImpl extends EObjectImpl implements ParType {
	/**
	 * The cached value of the '{@link #getAnimationElementGroup() <em>Animation Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap animationElementGroup;

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
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterElement() <em>Master Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterElement()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterElement() <em>Master Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterElement()
	 * @generated
	 * @ordered
	 */
	protected String masterElement = MASTER_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeTypeType NODE_TYPE_EDEFAULT = NodeTypeType.DEFAULT;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeTypeType nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * This is true if the Node Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeTypeESet;

	/**
	 * The default value of the '{@link #getPresetClass() <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetClass()
	 * @generated
	 * @ordered
	 */
	protected static final PresetClassType PRESET_CLASS_EDEFAULT = PresetClassType.CUSTOM;

	/**
	 * The cached value of the '{@link #getPresetClass() <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetClass()
	 * @generated
	 * @ordered
	 */
	protected PresetClassType presetClass = PRESET_CLASS_EDEFAULT;

	/**
	 * This is true if the Preset Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presetClassESet;

	/**
	 * The default value of the '{@link #getPresetId() <em>Preset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresetId() <em>Preset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetId()
	 * @generated
	 * @ordered
	 */
	protected String presetId = PRESET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresetSubType() <em>Preset Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESET_SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresetSubType() <em>Preset Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetSubType()
	 * @generated
	 * @ordered
	 */
	protected String presetSubType = PRESET_SUB_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.PAR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnimationElementGroup() {
		if (animationElementGroup == null) {
			animationElementGroup = new BasicFeatureMap(this, AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT_GROUP);
		}
		return animationElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAnimationElement() {
		return getAnimationElementGroup().list(AnimationPackage.Literals.PAR_TYPE__ANIMATION_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__ACCELERATE, oldAccelerate, accelerate, !oldAccelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__ACCELERATE, oldAccelerate, ACCELERATE_EDEFAULT, oldAccelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__AUTO_REVERSE, oldAutoReverse, autoReverse, !oldAutoReverseESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__AUTO_REVERSE, oldAutoReverse, AUTO_REVERSE_EDEFAULT, oldAutoReverseESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__BEGIN, oldBegin, begin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__DECELERATE, oldDecelerate, decelerate, !oldDecelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__DECELERATE, oldDecelerate, DECELERATE_EDEFAULT, oldDecelerateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__DUR, oldDur, dur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__END, oldEnd, end));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__ENDSYNC, oldEndsync, endsync, !oldEndsyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__ENDSYNC, oldEndsync, ENDSYNC_EDEFAULT, oldEndsyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__FILL, oldFill, fill, !oldFillESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__FILL_DEFAULT, oldFillDefault, fillDefault, !oldFillDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__FILL_DEFAULT, oldFillDefault, FILL_DEFAULT_EDEFAULT, oldFillDefaultESet));
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
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterElement() {
		return masterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterElement(String newMasterElement) {
		String oldMasterElement = masterElement;
		masterElement = newMasterElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__MASTER_ELEMENT, oldMasterElement, masterElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(NodeTypeType newNodeType) {
		NodeTypeType oldNodeType = nodeType;
		nodeType = newNodeType == null ? NODE_TYPE_EDEFAULT : newNodeType;
		boolean oldNodeTypeESet = nodeTypeESet;
		nodeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__NODE_TYPE, oldNodeType, nodeType, !oldNodeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeType() {
		NodeTypeType oldNodeType = nodeType;
		boolean oldNodeTypeESet = nodeTypeESet;
		nodeType = NODE_TYPE_EDEFAULT;
		nodeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__NODE_TYPE, oldNodeType, NODE_TYPE_EDEFAULT, oldNodeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeType() {
		return nodeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetClassType getPresetClass() {
		return presetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresetClass(PresetClassType newPresetClass) {
		PresetClassType oldPresetClass = presetClass;
		presetClass = newPresetClass == null ? PRESET_CLASS_EDEFAULT : newPresetClass;
		boolean oldPresetClassESet = presetClassESet;
		presetClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__PRESET_CLASS, oldPresetClass, presetClass, !oldPresetClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresetClass() {
		PresetClassType oldPresetClass = presetClass;
		boolean oldPresetClassESet = presetClassESet;
		presetClass = PRESET_CLASS_EDEFAULT;
		presetClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__PRESET_CLASS, oldPresetClass, PRESET_CLASS_EDEFAULT, oldPresetClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresetClass() {
		return presetClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresetId() {
		return presetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresetId(String newPresetId) {
		String oldPresetId = presetId;
		presetId = newPresetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__PRESET_ID, oldPresetId, presetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresetSubType() {
		return presetSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresetSubType(String newPresetSubType) {
		String oldPresetSubType = presetSubType;
		presetSubType = newPresetSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__PRESET_SUB_TYPE, oldPresetSubType, presetSubType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__REPEAT_COUNT, oldRepeatCount, repeatCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__REPEAT_DUR, oldRepeatDur, repeatDur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__RESTART, oldRestart, restart, !oldRestartESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__RESTART, oldRestart, RESTART_EDEFAULT, oldRestartESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.PAR_TYPE__RESTART_DEFAULT, oldRestartDefault, restartDefault, !oldRestartDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.PAR_TYPE__RESTART_DEFAULT, oldRestartDefault, RESTART_DEFAULT_EDEFAULT, oldRestartDefaultESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT_GROUP:
				return ((InternalEList<?>)getAnimationElementGroup()).basicRemove(otherEnd, msgs);
			case AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT:
				return ((InternalEList<?>)getAnimationElement()).basicRemove(otherEnd, msgs);
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
			case AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT_GROUP:
				if (coreType) return getAnimationElementGroup();
				return ((FeatureMap.Internal)getAnimationElementGroup()).getWrapper();
			case AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT:
				return getAnimationElement();
			case AnimationPackage.PAR_TYPE__ACCELERATE:
				return new Double(getAccelerate());
			case AnimationPackage.PAR_TYPE__AUTO_REVERSE:
				return getAutoReverse();
			case AnimationPackage.PAR_TYPE__BEGIN:
				return getBegin();
			case AnimationPackage.PAR_TYPE__DECELERATE:
				return new Double(getDecelerate());
			case AnimationPackage.PAR_TYPE__DUR:
				return getDur();
			case AnimationPackage.PAR_TYPE__END:
				return getEnd();
			case AnimationPackage.PAR_TYPE__ENDSYNC:
				return getEndsync();
			case AnimationPackage.PAR_TYPE__FILL:
				return getFill();
			case AnimationPackage.PAR_TYPE__FILL_DEFAULT:
				return getFillDefault();
			case AnimationPackage.PAR_TYPE__GROUP_ID:
				return getGroupId();
			case AnimationPackage.PAR_TYPE__ID:
				return getId();
			case AnimationPackage.PAR_TYPE__MASTER_ELEMENT:
				return getMasterElement();
			case AnimationPackage.PAR_TYPE__NODE_TYPE:
				return getNodeType();
			case AnimationPackage.PAR_TYPE__PRESET_CLASS:
				return getPresetClass();
			case AnimationPackage.PAR_TYPE__PRESET_ID:
				return getPresetId();
			case AnimationPackage.PAR_TYPE__PRESET_SUB_TYPE:
				return getPresetSubType();
			case AnimationPackage.PAR_TYPE__REPEAT_COUNT:
				return getRepeatCount();
			case AnimationPackage.PAR_TYPE__REPEAT_DUR:
				return getRepeatDur();
			case AnimationPackage.PAR_TYPE__RESTART:
				return getRestart();
			case AnimationPackage.PAR_TYPE__RESTART_DEFAULT:
				return getRestartDefault();
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
			case AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT_GROUP:
				((FeatureMap.Internal)getAnimationElementGroup()).set(newValue);
				return;
			case AnimationPackage.PAR_TYPE__ACCELERATE:
				setAccelerate(((Double)newValue).doubleValue());
				return;
			case AnimationPackage.PAR_TYPE__AUTO_REVERSE:
				setAutoReverse((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case AnimationPackage.PAR_TYPE__BEGIN:
				setBegin((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__DECELERATE:
				setDecelerate(((Double)newValue).doubleValue());
				return;
			case AnimationPackage.PAR_TYPE__DUR:
				setDur((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__END:
				setEnd((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__ENDSYNC:
				setEndsync((EndsyncType)newValue);
				return;
			case AnimationPackage.PAR_TYPE__FILL:
				setFill((FillType)newValue);
				return;
			case AnimationPackage.PAR_TYPE__FILL_DEFAULT:
				setFillDefault((FillDefaultType)newValue);
				return;
			case AnimationPackage.PAR_TYPE__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__ID:
				setId((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__MASTER_ELEMENT:
				setMasterElement((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__NODE_TYPE:
				setNodeType((NodeTypeType)newValue);
				return;
			case AnimationPackage.PAR_TYPE__PRESET_CLASS:
				setPresetClass((PresetClassType)newValue);
				return;
			case AnimationPackage.PAR_TYPE__PRESET_ID:
				setPresetId((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__PRESET_SUB_TYPE:
				setPresetSubType((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__REPEAT_COUNT:
				setRepeatCount(newValue);
				return;
			case AnimationPackage.PAR_TYPE__REPEAT_DUR:
				setRepeatDur((String)newValue);
				return;
			case AnimationPackage.PAR_TYPE__RESTART:
				setRestart((RestartType)newValue);
				return;
			case AnimationPackage.PAR_TYPE__RESTART_DEFAULT:
				setRestartDefault((RestartDefaultType)newValue);
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
			case AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT_GROUP:
				getAnimationElementGroup().clear();
				return;
			case AnimationPackage.PAR_TYPE__ACCELERATE:
				unsetAccelerate();
				return;
			case AnimationPackage.PAR_TYPE__AUTO_REVERSE:
				unsetAutoReverse();
				return;
			case AnimationPackage.PAR_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__DECELERATE:
				unsetDecelerate();
				return;
			case AnimationPackage.PAR_TYPE__DUR:
				setDur(DUR_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__ENDSYNC:
				unsetEndsync();
				return;
			case AnimationPackage.PAR_TYPE__FILL:
				unsetFill();
				return;
			case AnimationPackage.PAR_TYPE__FILL_DEFAULT:
				unsetFillDefault();
				return;
			case AnimationPackage.PAR_TYPE__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__MASTER_ELEMENT:
				setMasterElement(MASTER_ELEMENT_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__NODE_TYPE:
				unsetNodeType();
				return;
			case AnimationPackage.PAR_TYPE__PRESET_CLASS:
				unsetPresetClass();
				return;
			case AnimationPackage.PAR_TYPE__PRESET_ID:
				setPresetId(PRESET_ID_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__PRESET_SUB_TYPE:
				setPresetSubType(PRESET_SUB_TYPE_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__REPEAT_COUNT:
				setRepeatCount(REPEAT_COUNT_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__REPEAT_DUR:
				setRepeatDur(REPEAT_DUR_EDEFAULT);
				return;
			case AnimationPackage.PAR_TYPE__RESTART:
				unsetRestart();
				return;
			case AnimationPackage.PAR_TYPE__RESTART_DEFAULT:
				unsetRestartDefault();
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
			case AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT_GROUP:
				return animationElementGroup != null && !animationElementGroup.isEmpty();
			case AnimationPackage.PAR_TYPE__ANIMATION_ELEMENT:
				return !getAnimationElement().isEmpty();
			case AnimationPackage.PAR_TYPE__ACCELERATE:
				return isSetAccelerate();
			case AnimationPackage.PAR_TYPE__AUTO_REVERSE:
				return isSetAutoReverse();
			case AnimationPackage.PAR_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case AnimationPackage.PAR_TYPE__DECELERATE:
				return isSetDecelerate();
			case AnimationPackage.PAR_TYPE__DUR:
				return DUR_EDEFAULT == null ? dur != null : !DUR_EDEFAULT.equals(dur);
			case AnimationPackage.PAR_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case AnimationPackage.PAR_TYPE__ENDSYNC:
				return isSetEndsync();
			case AnimationPackage.PAR_TYPE__FILL:
				return isSetFill();
			case AnimationPackage.PAR_TYPE__FILL_DEFAULT:
				return isSetFillDefault();
			case AnimationPackage.PAR_TYPE__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case AnimationPackage.PAR_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AnimationPackage.PAR_TYPE__MASTER_ELEMENT:
				return MASTER_ELEMENT_EDEFAULT == null ? masterElement != null : !MASTER_ELEMENT_EDEFAULT.equals(masterElement);
			case AnimationPackage.PAR_TYPE__NODE_TYPE:
				return isSetNodeType();
			case AnimationPackage.PAR_TYPE__PRESET_CLASS:
				return isSetPresetClass();
			case AnimationPackage.PAR_TYPE__PRESET_ID:
				return PRESET_ID_EDEFAULT == null ? presetId != null : !PRESET_ID_EDEFAULT.equals(presetId);
			case AnimationPackage.PAR_TYPE__PRESET_SUB_TYPE:
				return PRESET_SUB_TYPE_EDEFAULT == null ? presetSubType != null : !PRESET_SUB_TYPE_EDEFAULT.equals(presetSubType);
			case AnimationPackage.PAR_TYPE__REPEAT_COUNT:
				return REPEAT_COUNT_EDEFAULT == null ? repeatCount != null : !REPEAT_COUNT_EDEFAULT.equals(repeatCount);
			case AnimationPackage.PAR_TYPE__REPEAT_DUR:
				return REPEAT_DUR_EDEFAULT == null ? repeatDur != null : !REPEAT_DUR_EDEFAULT.equals(repeatDur);
			case AnimationPackage.PAR_TYPE__RESTART:
				return isSetRestart();
			case AnimationPackage.PAR_TYPE__RESTART_DEFAULT:
				return isSetRestartDefault();
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
		result.append(" (animationElementGroup: ");
		result.append(animationElementGroup);
		result.append(", accelerate: ");
		if (accelerateESet) result.append(accelerate); else result.append("<unset>");
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
		result.append(", endsync: ");
		if (endsyncESet) result.append(endsync); else result.append("<unset>");
		result.append(", fill: ");
		if (fillESet) result.append(fill); else result.append("<unset>");
		result.append(", fillDefault: ");
		if (fillDefaultESet) result.append(fillDefault); else result.append("<unset>");
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", id: ");
		result.append(id);
		result.append(", masterElement: ");
		result.append(masterElement);
		result.append(", nodeType: ");
		if (nodeTypeESet) result.append(nodeType); else result.append("<unset>");
		result.append(", presetClass: ");
		if (presetClassESet) result.append(presetClass); else result.append("<unset>");
		result.append(", presetId: ");
		result.append(presetId);
		result.append(", presetSubType: ");
		result.append(presetSubType);
		result.append(", repeatCount: ");
		result.append(repeatCount);
		result.append(", repeatDur: ");
		result.append(repeatDur);
		result.append(", restart: ");
		if (restartESet) result.append(restart); else result.append("<unset>");
		result.append(", restartDefault: ");
		if (restartDefaultESet) result.append(restartDefault); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParTypeImpl
