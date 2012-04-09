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

import javax.xml.datatype.Duration;

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
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ParType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.SetType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getAnimate <em>Animate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getAnimateColor <em>Animate Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getAnimateMotion <em>Animate Motion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getAnimateTransform <em>Animate Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getAudio <em>Audio</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getIterate <em>Iterate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getPar <em>Par</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getSeq <em>Seq</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getTransitionFilter <em>Transition Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getAudioLevel <em>Audio Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getColorInterpolation <em>Color Interpolation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getColorInterpolationDirection <em>Color Interpolation Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getCommand1 <em>Command1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getIterateInterval <em>Iterate Interval</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getIterateType <em>Iterate Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.DocumentRootImpl#getSubItem <em>Sub Item</em>}</li>
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
	 * The default value of the '{@link #getAudioLevel() <em>Audio Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double AUDIO_LEVEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAudioLevel() <em>Audio Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioLevel()
	 * @generated
	 * @ordered
	 */
	protected double audioLevel = AUDIO_LEVEL_EDEFAULT;

	/**
	 * This is true if the Audio Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean audioLevelESet;

	/**
	 * The default value of the '{@link #getColorInterpolation() <em>Color Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorInterpolation()
	 * @generated
	 * @ordered
	 */
	protected static final ColorInterpolationType COLOR_INTERPOLATION_EDEFAULT = ColorInterpolationType.RGB;

	/**
	 * The cached value of the '{@link #getColorInterpolation() <em>Color Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorInterpolation()
	 * @generated
	 * @ordered
	 */
	protected ColorInterpolationType colorInterpolation = COLOR_INTERPOLATION_EDEFAULT;

	/**
	 * This is true if the Color Interpolation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorInterpolationESet;

	/**
	 * The default value of the '{@link #getColorInterpolationDirection() <em>Color Interpolation Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorInterpolationDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ColorInterpolationDirectionType COLOR_INTERPOLATION_DIRECTION_EDEFAULT = ColorInterpolationDirectionType.CLOCKWISE;

	/**
	 * The cached value of the '{@link #getColorInterpolationDirection() <em>Color Interpolation Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorInterpolationDirection()
	 * @generated
	 * @ordered
	 */
	protected ColorInterpolationDirectionType colorInterpolationDirection = COLOR_INTERPOLATION_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Color Interpolation Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorInterpolationDirectionESet;

	/**
	 * The default value of the '{@link #getCommand1() <em>Command1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand1()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand1() <em>Command1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand1()
	 * @generated
	 * @ordered
	 */
	protected String command1 = COMMAND1_EDEFAULT;

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
	 * The default value of the '{@link #getIterateInterval() <em>Iterate Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterateInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ITERATE_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterateInterval() <em>Iterate Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterateInterval()
	 * @generated
	 * @ordered
	 */
	protected Duration iterateInterval = ITERATE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterateType() <em>Iterate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterateType()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterateType() <em>Iterate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterateType()
	 * @generated
	 * @ordered
	 */
	protected String iterateType = ITERATE_TYPE_EDEFAULT;

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
		return AnimationPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AnimationPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AnimationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AnimationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateType getAnimate() {
		return (AnimateType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimate(AnimateType newAnimate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE, newAnimate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimate(AnimateType newAnimate) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE, newAnimate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateColorType getAnimateColor() {
		return (AnimateColorType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimateColor(AnimateColorType newAnimateColor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_COLOR, newAnimateColor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimateColor(AnimateColorType newAnimateColor) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_COLOR, newAnimateColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateMotionType getAnimateMotion() {
		return (AnimateMotionType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_MOTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimateMotion(AnimateMotionType newAnimateMotion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_MOTION, newAnimateMotion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimateMotion(AnimateMotionType newAnimateMotion) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_MOTION, newAnimateMotion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateTransformType getAnimateTransform() {
		return (AnimateTransformType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_TRANSFORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimateTransform(AnimateTransformType newAnimateTransform, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_TRANSFORM, newAnimateTransform, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimateTransform(AnimateTransformType newAnimateTransform) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__ANIMATE_TRANSFORM, newAnimateTransform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioType getAudio() {
		return (AudioType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__AUDIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudio(AudioType newAudio, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__AUDIO, newAudio, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudio(AudioType newAudio) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__AUDIO, newAudio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType getCommand() {
		return (CommandType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(CommandType newCommand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__COMMAND, newCommand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(CommandType newCommand) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__COMMAND, newCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateType getIterate() {
		return (IterateType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__ITERATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIterate(IterateType newIterate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__ITERATE, newIterate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterate(IterateType newIterate) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__ITERATE, newIterate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParType getPar() {
		return (ParType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__PAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPar(ParType newPar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__PAR, newPar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPar(ParType newPar) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__PAR, newPar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType getParam() {
		return (ParamType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam(ParamType newParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__PARAM, newParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(ParamType newParam) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__PARAM, newParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqType getSeq() {
		return (SeqType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__SEQ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeq(SeqType newSeq, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__SEQ, newSeq, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeq(SeqType newSeq) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__SEQ, newSeq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType getSet() {
		return (SetType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(SetType newSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__SET, newSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(SetType newSet) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__SET, newSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionFilterType getTransitionFilter() {
		return (TransitionFilterType)getMixed().get(AnimationPackage.Literals.DOCUMENT_ROOT__TRANSITION_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionFilter(TransitionFilterType newTransitionFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AnimationPackage.Literals.DOCUMENT_ROOT__TRANSITION_FILTER, newTransitionFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionFilter(TransitionFilterType newTransitionFilter) {
		((FeatureMap.Internal)getMixed()).set(AnimationPackage.Literals.DOCUMENT_ROOT__TRANSITION_FILTER, newTransitionFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAudioLevel() {
		return audioLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioLevel(double newAudioLevel) {
		double oldAudioLevel = audioLevel;
		audioLevel = newAudioLevel;
		boolean oldAudioLevelESet = audioLevelESet;
		audioLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__AUDIO_LEVEL, oldAudioLevel, audioLevel, !oldAudioLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAudioLevel() {
		double oldAudioLevel = audioLevel;
		boolean oldAudioLevelESet = audioLevelESet;
		audioLevel = AUDIO_LEVEL_EDEFAULT;
		audioLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.DOCUMENT_ROOT__AUDIO_LEVEL, oldAudioLevel, AUDIO_LEVEL_EDEFAULT, oldAudioLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAudioLevel() {
		return audioLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorInterpolationType getColorInterpolation() {
		return colorInterpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorInterpolation(ColorInterpolationType newColorInterpolation) {
		ColorInterpolationType oldColorInterpolation = colorInterpolation;
		colorInterpolation = newColorInterpolation == null ? COLOR_INTERPOLATION_EDEFAULT : newColorInterpolation;
		boolean oldColorInterpolationESet = colorInterpolationESet;
		colorInterpolationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION, oldColorInterpolation, colorInterpolation, !oldColorInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColorInterpolation() {
		ColorInterpolationType oldColorInterpolation = colorInterpolation;
		boolean oldColorInterpolationESet = colorInterpolationESet;
		colorInterpolation = COLOR_INTERPOLATION_EDEFAULT;
		colorInterpolationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION, oldColorInterpolation, COLOR_INTERPOLATION_EDEFAULT, oldColorInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColorInterpolation() {
		return colorInterpolationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorInterpolationDirectionType getColorInterpolationDirection() {
		return colorInterpolationDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorInterpolationDirection(ColorInterpolationDirectionType newColorInterpolationDirection) {
		ColorInterpolationDirectionType oldColorInterpolationDirection = colorInterpolationDirection;
		colorInterpolationDirection = newColorInterpolationDirection == null ? COLOR_INTERPOLATION_DIRECTION_EDEFAULT : newColorInterpolationDirection;
		boolean oldColorInterpolationDirectionESet = colorInterpolationDirectionESet;
		colorInterpolationDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION, oldColorInterpolationDirection, colorInterpolationDirection, !oldColorInterpolationDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColorInterpolationDirection() {
		ColorInterpolationDirectionType oldColorInterpolationDirection = colorInterpolationDirection;
		boolean oldColorInterpolationDirectionESet = colorInterpolationDirectionESet;
		colorInterpolationDirection = COLOR_INTERPOLATION_DIRECTION_EDEFAULT;
		colorInterpolationDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION, oldColorInterpolationDirection, COLOR_INTERPOLATION_DIRECTION_EDEFAULT, oldColorInterpolationDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColorInterpolationDirection() {
		return colorInterpolationDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand1() {
		return command1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand1(String newCommand1) {
		String oldCommand1 = command1;
		command1 = newCommand1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__COMMAND1, oldCommand1, command1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__FORMULA, oldFormula, formula));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getIterateInterval() {
		return iterateInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterateInterval(Duration newIterateInterval) {
		Duration oldIterateInterval = iterateInterval;
		iterateInterval = newIterateInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__ITERATE_INTERVAL, oldIterateInterval, iterateInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIterateType() {
		return iterateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterateType(String newIterateType) {
		String oldIterateType = iterateType;
		iterateType = newIterateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__ITERATE_TYPE, oldIterateType, iterateType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.DOCUMENT_ROOT__SUB_ITEM, oldSubItem, subItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnimationPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AnimationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AnimationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE:
				return basicSetAnimate(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_COLOR:
				return basicSetAnimateColor(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_MOTION:
				return basicSetAnimateMotion(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_TRANSFORM:
				return basicSetAnimateTransform(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__AUDIO:
				return basicSetAudio(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__COMMAND:
				return basicSetCommand(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__ITERATE:
				return basicSetIterate(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__PAR:
				return basicSetPar(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__PARAM:
				return basicSetParam(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__SEQ:
				return basicSetSeq(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__SET:
				return basicSetSet(null, msgs);
			case AnimationPackage.DOCUMENT_ROOT__TRANSITION_FILTER:
				return basicSetTransitionFilter(null, msgs);
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
			case AnimationPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AnimationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AnimationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE:
				return getAnimate();
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_COLOR:
				return getAnimateColor();
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_MOTION:
				return getAnimateMotion();
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_TRANSFORM:
				return getAnimateTransform();
			case AnimationPackage.DOCUMENT_ROOT__AUDIO:
				return getAudio();
			case AnimationPackage.DOCUMENT_ROOT__COMMAND:
				return getCommand();
			case AnimationPackage.DOCUMENT_ROOT__ITERATE:
				return getIterate();
			case AnimationPackage.DOCUMENT_ROOT__PAR:
				return getPar();
			case AnimationPackage.DOCUMENT_ROOT__PARAM:
				return getParam();
			case AnimationPackage.DOCUMENT_ROOT__SEQ:
				return getSeq();
			case AnimationPackage.DOCUMENT_ROOT__SET:
				return getSet();
			case AnimationPackage.DOCUMENT_ROOT__TRANSITION_FILTER:
				return getTransitionFilter();
			case AnimationPackage.DOCUMENT_ROOT__AUDIO_LEVEL:
				return new Double(getAudioLevel());
			case AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION:
				return getColorInterpolation();
			case AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION:
				return getColorInterpolationDirection();
			case AnimationPackage.DOCUMENT_ROOT__COMMAND1:
				return getCommand1();
			case AnimationPackage.DOCUMENT_ROOT__FORMULA:
				return getFormula();
			case AnimationPackage.DOCUMENT_ROOT__ID:
				return getId();
			case AnimationPackage.DOCUMENT_ROOT__ITERATE_INTERVAL:
				return getIterateInterval();
			case AnimationPackage.DOCUMENT_ROOT__ITERATE_TYPE:
				return getIterateType();
			case AnimationPackage.DOCUMENT_ROOT__SUB_ITEM:
				return getSubItem();
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
			case AnimationPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE:
				setAnimate((AnimateType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_COLOR:
				setAnimateColor((AnimateColorType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_MOTION:
				setAnimateMotion((AnimateMotionType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_TRANSFORM:
				setAnimateTransform((AnimateTransformType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__AUDIO:
				setAudio((AudioType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__COMMAND:
				setCommand((CommandType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ITERATE:
				setIterate((IterateType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__PAR:
				setPar((ParType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__SEQ:
				setSeq((SeqType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__SET:
				setSet((SetType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__TRANSITION_FILTER:
				setTransitionFilter((TransitionFilterType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__AUDIO_LEVEL:
				setAudioLevel(((Double)newValue).doubleValue());
				return;
			case AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION:
				setColorInterpolation((ColorInterpolationType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION:
				setColorInterpolationDirection((ColorInterpolationDirectionType)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__COMMAND1:
				setCommand1((String)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__FORMULA:
				setFormula((String)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ITERATE_INTERVAL:
				setIterateInterval((Duration)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ITERATE_TYPE:
				setIterateType((String)newValue);
				return;
			case AnimationPackage.DOCUMENT_ROOT__SUB_ITEM:
				setSubItem((String)newValue);
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
			case AnimationPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AnimationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AnimationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE:
				setAnimate((AnimateType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_COLOR:
				setAnimateColor((AnimateColorType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_MOTION:
				setAnimateMotion((AnimateMotionType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_TRANSFORM:
				setAnimateTransform((AnimateTransformType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__AUDIO:
				setAudio((AudioType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__COMMAND:
				setCommand((CommandType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ITERATE:
				setIterate((IterateType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__PAR:
				setPar((ParType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__SEQ:
				setSeq((SeqType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__SET:
				setSet((SetType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__TRANSITION_FILTER:
				setTransitionFilter((TransitionFilterType)null);
				return;
			case AnimationPackage.DOCUMENT_ROOT__AUDIO_LEVEL:
				unsetAudioLevel();
				return;
			case AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION:
				unsetColorInterpolation();
				return;
			case AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION:
				unsetColorInterpolationDirection();
				return;
			case AnimationPackage.DOCUMENT_ROOT__COMMAND1:
				setCommand1(COMMAND1_EDEFAULT);
				return;
			case AnimationPackage.DOCUMENT_ROOT__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ITERATE_INTERVAL:
				setIterateInterval(ITERATE_INTERVAL_EDEFAULT);
				return;
			case AnimationPackage.DOCUMENT_ROOT__ITERATE_TYPE:
				setIterateType(ITERATE_TYPE_EDEFAULT);
				return;
			case AnimationPackage.DOCUMENT_ROOT__SUB_ITEM:
				setSubItem(SUB_ITEM_EDEFAULT);
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
			case AnimationPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AnimationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AnimationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE:
				return getAnimate() != null;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_COLOR:
				return getAnimateColor() != null;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_MOTION:
				return getAnimateMotion() != null;
			case AnimationPackage.DOCUMENT_ROOT__ANIMATE_TRANSFORM:
				return getAnimateTransform() != null;
			case AnimationPackage.DOCUMENT_ROOT__AUDIO:
				return getAudio() != null;
			case AnimationPackage.DOCUMENT_ROOT__COMMAND:
				return getCommand() != null;
			case AnimationPackage.DOCUMENT_ROOT__ITERATE:
				return getIterate() != null;
			case AnimationPackage.DOCUMENT_ROOT__PAR:
				return getPar() != null;
			case AnimationPackage.DOCUMENT_ROOT__PARAM:
				return getParam() != null;
			case AnimationPackage.DOCUMENT_ROOT__SEQ:
				return getSeq() != null;
			case AnimationPackage.DOCUMENT_ROOT__SET:
				return getSet() != null;
			case AnimationPackage.DOCUMENT_ROOT__TRANSITION_FILTER:
				return getTransitionFilter() != null;
			case AnimationPackage.DOCUMENT_ROOT__AUDIO_LEVEL:
				return isSetAudioLevel();
			case AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION:
				return isSetColorInterpolation();
			case AnimationPackage.DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION:
				return isSetColorInterpolationDirection();
			case AnimationPackage.DOCUMENT_ROOT__COMMAND1:
				return COMMAND1_EDEFAULT == null ? command1 != null : !COMMAND1_EDEFAULT.equals(command1);
			case AnimationPackage.DOCUMENT_ROOT__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case AnimationPackage.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AnimationPackage.DOCUMENT_ROOT__ITERATE_INTERVAL:
				return ITERATE_INTERVAL_EDEFAULT == null ? iterateInterval != null : !ITERATE_INTERVAL_EDEFAULT.equals(iterateInterval);
			case AnimationPackage.DOCUMENT_ROOT__ITERATE_TYPE:
				return ITERATE_TYPE_EDEFAULT == null ? iterateType != null : !ITERATE_TYPE_EDEFAULT.equals(iterateType);
			case AnimationPackage.DOCUMENT_ROOT__SUB_ITEM:
				return SUB_ITEM_EDEFAULT == null ? subItem != null : !SUB_ITEM_EDEFAULT.equals(subItem);
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
		result.append(", audioLevel: ");
		if (audioLevelESet) result.append(audioLevel); else result.append("<unset>");
		result.append(", colorInterpolation: ");
		if (colorInterpolationESet) result.append(colorInterpolation); else result.append("<unset>");
		result.append(", colorInterpolationDirection: ");
		if (colorInterpolationDirectionESet) result.append(colorInterpolationDirection); else result.append("<unset>");
		result.append(", command1: ");
		result.append(command1);
		result.append(", formula: ");
		result.append(formula);
		result.append(", id: ");
		result.append(id);
		result.append(", iterateInterval: ");
		result.append(iterateInterval);
		result.append(", iterateType: ");
		result.append(iterateType);
		result.append(", subItem: ");
		result.append(subItem);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
