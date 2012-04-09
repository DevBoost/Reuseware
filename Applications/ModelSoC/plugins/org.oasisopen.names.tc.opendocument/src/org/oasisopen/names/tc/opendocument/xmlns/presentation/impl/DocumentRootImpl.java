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
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import java.math.BigInteger;
import java.util.List;

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
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getAnimationGroup <em>Animation Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getAnimations <em>Animations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDateTimeDecl <em>Date Time Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDim <em>Dim</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getEventListener <em>Event Listener</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getFooterDecl <em>Footer Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getHeaderDecl <em>Header Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getHideShape <em>Hide Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getHideText <em>Hide Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPlay <em>Play</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getShowShape <em>Show Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getShowText <em>Show Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getSound <em>Sound</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getAnimations1 <em>Animations1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getBackgroundObjectsVisible <em>Background Objects Visible</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getBackgroundVisible <em>Background Visible</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDisplayDateTime <em>Display Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDisplayFooter <em>Display Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDisplayHeader <em>Display Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDisplayPageNumber <em>Display Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getEndless <em>Endless</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getForceManual <em>Force Manual</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getFullScreen <em>Full Screen</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getMasterElement <em>Master Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getMouseAsPen <em>Mouse As Pen</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getMouseVisible <em>Mouse Visible</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPathId <em>Path Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPause <em>Pause</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPlaceholder1 <em>Placeholder1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPlayFull <em>Play Full</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPresentationPageLayoutName <em>Presentation Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPresetClass <em>Preset Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPresetId <em>Preset Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getPresetSubType <em>Preset Sub Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getShow1 <em>Show1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getShowLogo <em>Show Logo</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getStartPage <em>Start Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getStartScale <em>Start Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getStartWithNavigator <em>Start With Navigator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getStayOnTop <em>Stay On Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getTransitionOnClick <em>Transition On Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getTransitionSpeed <em>Transition Speed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getTransitionStyle <em>Transition Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getTransitionType <em>Transition Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getUseDateTimeName <em>Use Date Time Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getUseFooterName <em>Use Footer Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getUseHeaderName <em>Use Header Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getUserTransformed <em>User Transformed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DocumentRootImpl#getVisibility <em>Visibility</em>}</li>
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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTION_EDEFAULT = ActionType.NONE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionType action = ACTION_EDEFAULT;

	/**
	 * This is true if the Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionESet;

	/**
	 * The default value of the '{@link #getAnimations1() <em>Animations1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations1()
	 * @generated
	 * @ordered
	 */
	protected static final AnimationsType ANIMATIONS1_EDEFAULT = AnimationsType.ENABLED;

	/**
	 * The cached value of the '{@link #getAnimations1() <em>Animations1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations1()
	 * @generated
	 * @ordered
	 */
	protected AnimationsType animations1 = ANIMATIONS1_EDEFAULT;

	/**
	 * This is true if the Animations1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean animations1ESet;

	/**
	 * The default value of the '{@link #getBackgroundObjectsVisible() <em>Background Objects Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundObjectsVisible()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean BACKGROUND_OBJECTS_VISIBLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBackgroundObjectsVisible() <em>Background Objects Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundObjectsVisible()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean backgroundObjectsVisible = BACKGROUND_OBJECTS_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Background Objects Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backgroundObjectsVisibleESet;

	/**
	 * The default value of the '{@link #getBackgroundVisible() <em>Background Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundVisible()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean BACKGROUND_VISIBLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBackgroundVisible() <em>Background Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundVisible()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean backgroundVisible = BACKGROUND_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Background Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backgroundVisibleESet;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationClasses CLASS_EDEFAULT = PresentationClasses.TITLE;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected PresentationClasses class_ = CLASS_EDEFAULT;

	/**
	 * This is true if the Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classESet;

	/**
	 * The default value of the '{@link #getClassNames() <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassNames() <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames()
	 * @generated
	 * @ordered
	 */
	protected List<String> classNames = CLASS_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected Duration delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationEffectDirections DIRECTION_EDEFAULT = PresentationEffectDirections.NONE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected PresentationEffectDirections direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getDisplayDateTime() <em>Display Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_DATE_TIME_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayDateTime() <em>Display Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayDateTime()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayDateTime = DISPLAY_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Display Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayDateTimeESet;

	/**
	 * The default value of the '{@link #getDisplayFooter() <em>Display Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFooter()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_FOOTER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayFooter() <em>Display Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFooter()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayFooter = DISPLAY_FOOTER_EDEFAULT;

	/**
	 * This is true if the Display Footer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayFooterESet;

	/**
	 * The default value of the '{@link #getDisplayHeader() <em>Display Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayHeader()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_HEADER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayHeader() <em>Display Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayHeader()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayHeader = DISPLAY_HEADER_EDEFAULT;

	/**
	 * This is true if the Display Header attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayHeaderESet;

	/**
	 * The default value of the '{@link #getDisplayPageNumber() <em>Display Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayPageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_PAGE_NUMBER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayPageNumber() <em>Display Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayPageNumber()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayPageNumber = DISPLAY_PAGE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Display Page Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayPageNumberESet;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationEffects EFFECT_EDEFAULT = PresentationEffects.NONE;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected PresentationEffects effect = EFFECT_EDEFAULT;

	/**
	 * This is true if the Effect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectESet;

	/**
	 * The default value of the '{@link #getEndless() <em>Endless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndless()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ENDLESS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEndless() <em>Endless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndless()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean endless = ENDLESS_EDEFAULT;

	/**
	 * This is true if the Endless attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endlessESet;

	/**
	 * The default value of the '{@link #getForceManual() <em>Force Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceManual()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FORCE_MANUAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getForceManual() <em>Force Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceManual()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean forceManual = FORCE_MANUAL_EDEFAULT;

	/**
	 * This is true if the Force Manual attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceManualESet;

	/**
	 * The default value of the '{@link #getFullScreen() <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullScreen()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FULL_SCREEN_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFullScreen() <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullScreen()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean fullScreen = FULL_SCREEN_EDEFAULT;

	/**
	 * This is true if the Full Screen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fullScreenESet;

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
	 * The default value of the '{@link #getMouseAsPen() <em>Mouse As Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouseAsPen()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MOUSE_AS_PEN_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMouseAsPen() <em>Mouse As Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouseAsPen()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mouseAsPen = MOUSE_AS_PEN_EDEFAULT;

	/**
	 * This is true if the Mouse As Pen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mouseAsPenESet;

	/**
	 * The default value of the '{@link #getMouseVisible() <em>Mouse Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouseVisible()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MOUSE_VISIBLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMouseVisible() <em>Mouse Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouseVisible()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mouseVisible = MOUSE_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Mouse Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mouseVisibleESet;

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
	 * The default value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected static final Object PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected Object pages = PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathId() <em>Path Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathId()
	 * @generated
	 * @ordered
	 */
	protected static final Object PATH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathId() <em>Path Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathId()
	 * @generated
	 * @ordered
	 */
	protected Object pathId = PATH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPause() <em>Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPause()
	 * @generated
	 * @ordered
	 */
	protected static final Duration PAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPause() <em>Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPause()
	 * @generated
	 * @ordered
	 */
	protected Duration pause = PAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholder1() <em>Placeholder1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder1()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PLACEHOLDER1_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPlaceholder1() <em>Placeholder1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder1()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean placeholder1 = PLACEHOLDER1_EDEFAULT;

	/**
	 * This is true if the Placeholder1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean placeholder1ESet;

	/**
	 * The default value of the '{@link #getPlayFull() <em>Play Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayFull()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PLAY_FULL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPlayFull() <em>Play Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayFull()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean playFull = PLAY_FULL_EDEFAULT;

	/**
	 * This is true if the Play Full attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean playFullESet;

	/**
	 * The default value of the '{@link #getPresentationPageLayoutName() <em>Presentation Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentationPageLayoutName() <em>Presentation Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected String presentationPageLayoutName = PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getShow1() <em>Show1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow1()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOW1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShow1() <em>Show1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow1()
	 * @generated
	 * @ordered
	 */
	protected String show1 = SHOW1_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowEndOfPresentationSlide() <em>Show End Of Presentation Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowEndOfPresentationSlide()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_END_OF_PRESENTATION_SLIDE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShowEndOfPresentationSlide() <em>Show End Of Presentation Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowEndOfPresentationSlide()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean showEndOfPresentationSlide = SHOW_END_OF_PRESENTATION_SLIDE_EDEFAULT;

	/**
	 * This is true if the Show End Of Presentation Slide attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showEndOfPresentationSlideESet;

	/**
	 * The default value of the '{@link #getShowLogo() <em>Show Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowLogo()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_LOGO_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShowLogo() <em>Show Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowLogo()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean showLogo = SHOW_LOGO_EDEFAULT;

	/**
	 * This is true if the Show Logo attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showLogoESet;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final SourceType SOURCE_EDEFAULT = SourceType.FIXED;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SourceType source = SOURCE_EDEFAULT;

	/**
	 * This is true if the Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceESet;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationSpeeds SPEED_EDEFAULT = PresentationSpeeds.SLOW;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected PresentationSpeeds speed = SPEED_EDEFAULT;

	/**
	 * This is true if the Speed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedESet;

	/**
	 * The default value of the '{@link #getStartPage() <em>Start Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPage()
	 * @generated
	 * @ordered
	 */
	protected static final String START_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPage() <em>Start Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPage()
	 * @generated
	 * @ordered
	 */
	protected String startPage = START_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartScale() <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartScale()
	 * @generated
	 * @ordered
	 */
	protected static final String START_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartScale() <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartScale()
	 * @generated
	 * @ordered
	 */
	protected String startScale = START_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartWithNavigator() <em>Start With Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWithNavigator()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean START_WITH_NAVIGATOR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getStartWithNavigator() <em>Start With Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWithNavigator()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean startWithNavigator = START_WITH_NAVIGATOR_EDEFAULT;

	/**
	 * This is true if the Start With Navigator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startWithNavigatorESet;

	/**
	 * The default value of the '{@link #getStayOnTop() <em>Stay On Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStayOnTop()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean STAY_ON_TOP_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getStayOnTop() <em>Stay On Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStayOnTop()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean stayOnTop = STAY_ON_TOP_EDEFAULT;

	/**
	 * This is true if the Stay On Top attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stayOnTopESet;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionOnClick() <em>Transition On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionOnClick()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionOnClickType TRANSITION_ON_CLICK_EDEFAULT = TransitionOnClickType.ENABLED;

	/**
	 * The cached value of the '{@link #getTransitionOnClick() <em>Transition On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionOnClick()
	 * @generated
	 * @ordered
	 */
	protected TransitionOnClickType transitionOnClick = TRANSITION_ON_CLICK_EDEFAULT;

	/**
	 * This is true if the Transition On Click attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transitionOnClickESet;

	/**
	 * The default value of the '{@link #getTransitionSpeed() <em>Transition Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationSpeeds TRANSITION_SPEED_EDEFAULT = PresentationSpeeds.SLOW;

	/**
	 * The cached value of the '{@link #getTransitionSpeed() <em>Transition Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionSpeed()
	 * @generated
	 * @ordered
	 */
	protected PresentationSpeeds transitionSpeed = TRANSITION_SPEED_EDEFAULT;

	/**
	 * This is true if the Transition Speed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transitionSpeedESet;

	/**
	 * The default value of the '{@link #getTransitionStyle() <em>Transition Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionStyle()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionStyleType TRANSITION_STYLE_EDEFAULT = TransitionStyleType.NONE;

	/**
	 * The cached value of the '{@link #getTransitionStyle() <em>Transition Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionStyle()
	 * @generated
	 * @ordered
	 */
	protected TransitionStyleType transitionStyle = TRANSITION_STYLE_EDEFAULT;

	/**
	 * This is true if the Transition Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transitionStyleESet;

	/**
	 * The default value of the '{@link #getTransitionType() <em>Transition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionType()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionTypeType TRANSITION_TYPE_EDEFAULT = TransitionTypeType.MANUAL;

	/**
	 * The cached value of the '{@link #getTransitionType() <em>Transition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionType()
	 * @generated
	 * @ordered
	 */
	protected TransitionTypeType transitionType = TRANSITION_TYPE_EDEFAULT;

	/**
	 * This is true if the Transition Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transitionTypeESet;

	/**
	 * The default value of the '{@link #getUseDateTimeName() <em>Use Date Time Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDateTimeName()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_DATE_TIME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseDateTimeName() <em>Use Date Time Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDateTimeName()
	 * @generated
	 * @ordered
	 */
	protected String useDateTimeName = USE_DATE_TIME_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseFooterName() <em>Use Footer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseFooterName()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_FOOTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseFooterName() <em>Use Footer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseFooterName()
	 * @generated
	 * @ordered
	 */
	protected String useFooterName = USE_FOOTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseHeaderName() <em>Use Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHeaderName()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_HEADER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseHeaderName() <em>Use Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHeaderName()
	 * @generated
	 * @ordered
	 */
	protected String useHeaderName = USE_HEADER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserTransformed() <em>User Transformed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTransformed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USER_TRANSFORMED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUserTransformed() <em>User Transformed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTransformed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean userTransformed = USER_TRANSFORMED_EDEFAULT;

	/**
	 * This is true if the User Transformed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userTransformedESet;

	/**
	 * The default value of the '{@link #getVerb() <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected BigInteger verb = VERB_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityType VISIBILITY_EDEFAULT = VisibilityType.VISIBLE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityType visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

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
		return PresentationPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, PresentationPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PresentationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PresentationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationGroupType getAnimationGroup() {
		return (AnimationGroupType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__ANIMATION_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimationGroup(AnimationGroupType newAnimationGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__ANIMATION_GROUP, newAnimationGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimationGroup(AnimationGroupType newAnimationGroup) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__ANIMATION_GROUP, newAnimationGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationsType1 getAnimations() {
		return (AnimationsType1)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__ANIMATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimations(AnimationsType1 newAnimations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__ANIMATIONS, newAnimations, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimations(AnimationsType1 newAnimations) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__ANIMATIONS, newAnimations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType getDateTime() {
		return (DateTimeType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTimeType newDateTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__DATE_TIME, newDateTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTimeType newDateTime) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__DATE_TIME, newDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeDeclType getDateTimeDecl() {
		return (DateTimeDeclType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__DATE_TIME_DECL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeDecl(DateTimeDeclType newDateTimeDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__DATE_TIME_DECL, newDateTimeDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeDecl(DateTimeDeclType newDateTimeDecl) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__DATE_TIME_DECL, newDateTimeDecl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimType getDim() {
		return (DimType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__DIM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDim(DimType newDim, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__DIM, newDim, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(DimType newDim) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__DIM, newDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenerType getEventListener() {
		return (EventListenerType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__EVENT_LISTENER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventListener(EventListenerType newEventListener, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__EVENT_LISTENER, newEventListener, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventListener(EventListenerType newEventListener) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__EVENT_LISTENER, newEventListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType getFooter() {
		return (FooterType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__FOOTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(FooterType newFooter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__FOOTER, newFooter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(FooterType newFooter) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__FOOTER, newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterDeclType getFooterDecl() {
		return (FooterDeclType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__FOOTER_DECL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooterDecl(FooterDeclType newFooterDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__FOOTER_DECL, newFooterDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterDecl(FooterDeclType newFooterDecl) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__FOOTER_DECL, newFooterDecl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader() {
		return (HeaderType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__HEADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__HEADER, newHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderDeclType getHeaderDecl() {
		return (HeaderDeclType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__HEADER_DECL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderDecl(HeaderDeclType newHeaderDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__HEADER_DECL, newHeaderDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderDecl(HeaderDeclType newHeaderDecl) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__HEADER_DECL, newHeaderDecl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HideShapeType getHideShape() {
		return (HideShapeType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__HIDE_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHideShape(HideShapeType newHideShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__HIDE_SHAPE, newHideShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideShape(HideShapeType newHideShape) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__HIDE_SHAPE, newHideShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HideTextType getHideText() {
		return (HideTextType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__HIDE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHideText(HideTextType newHideText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__HIDE_TEXT, newHideText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideText(HideTextType newHideText) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__HIDE_TEXT, newHideText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesType getNotes() {
		return (NotesType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(NotesType newNotes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__NOTES, newNotes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(NotesType newNotes) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderType getPlaceholder() {
		return (PlaceholderType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__PLACEHOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlaceholder(PlaceholderType newPlaceholder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__PLACEHOLDER, newPlaceholder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(PlaceholderType newPlaceholder) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__PLACEHOLDER, newPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayType getPlay() {
		return (PlayType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__PLAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlay(PlayType newPlay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__PLAY, newPlay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlay(PlayType newPlay) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__PLAY, newPlay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsType getSettings() {
		return (SettingsType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__SETTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(SettingsType newSettings, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__SETTINGS, newSettings, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(SettingsType newSettings) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__SETTINGS, newSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType getShow() {
		return (ShowType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShow(ShowType newShow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW, newShow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType newShow) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW, newShow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowShapeType getShowShape() {
		return (ShowShapeType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShowShape(ShowShapeType newShowShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW_SHAPE, newShowShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowShape(ShowShapeType newShowShape) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW_SHAPE, newShowShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowTextType getShowText() {
		return (ShowTextType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShowText(ShowTextType newShowText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW_TEXT, newShowText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowText(ShowTextType newShowText) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__SHOW_TEXT, newShowText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundType getSound() {
		return (SoundType)getMixed().get(PresentationPackage.Literals.DOCUMENT_ROOT__SOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSound(SoundType newSound, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PresentationPackage.Literals.DOCUMENT_ROOT__SOUND, newSound, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSound(SoundType newSound) {
		((FeatureMap.Internal)getMixed()).set(PresentationPackage.Literals.DOCUMENT_ROOT__SOUND, newSound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionType newAction) {
		ActionType oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		boolean oldActionESet = actionESet;
		actionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__ACTION, oldAction, action, !oldActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAction() {
		ActionType oldAction = action;
		boolean oldActionESet = actionESet;
		action = ACTION_EDEFAULT;
		actionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__ACTION, oldAction, ACTION_EDEFAULT, oldActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAction() {
		return actionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationsType getAnimations1() {
		return animations1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimations1(AnimationsType newAnimations1) {
		AnimationsType oldAnimations1 = animations1;
		animations1 = newAnimations1 == null ? ANIMATIONS1_EDEFAULT : newAnimations1;
		boolean oldAnimations1ESet = animations1ESet;
		animations1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__ANIMATIONS1, oldAnimations1, animations1, !oldAnimations1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnimations1() {
		AnimationsType oldAnimations1 = animations1;
		boolean oldAnimations1ESet = animations1ESet;
		animations1 = ANIMATIONS1_EDEFAULT;
		animations1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__ANIMATIONS1, oldAnimations1, ANIMATIONS1_EDEFAULT, oldAnimations1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnimations1() {
		return animations1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBackgroundObjectsVisible() {
		return backgroundObjectsVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundObjectsVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newBackgroundObjectsVisible) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBackgroundObjectsVisible = backgroundObjectsVisible;
		backgroundObjectsVisible = newBackgroundObjectsVisible == null ? BACKGROUND_OBJECTS_VISIBLE_EDEFAULT : newBackgroundObjectsVisible;
		boolean oldBackgroundObjectsVisibleESet = backgroundObjectsVisibleESet;
		backgroundObjectsVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE, oldBackgroundObjectsVisible, backgroundObjectsVisible, !oldBackgroundObjectsVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackgroundObjectsVisible() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBackgroundObjectsVisible = backgroundObjectsVisible;
		boolean oldBackgroundObjectsVisibleESet = backgroundObjectsVisibleESet;
		backgroundObjectsVisible = BACKGROUND_OBJECTS_VISIBLE_EDEFAULT;
		backgroundObjectsVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE, oldBackgroundObjectsVisible, BACKGROUND_OBJECTS_VISIBLE_EDEFAULT, oldBackgroundObjectsVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackgroundObjectsVisible() {
		return backgroundObjectsVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBackgroundVisible() {
		return backgroundVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newBackgroundVisible) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBackgroundVisible = backgroundVisible;
		backgroundVisible = newBackgroundVisible == null ? BACKGROUND_VISIBLE_EDEFAULT : newBackgroundVisible;
		boolean oldBackgroundVisibleESet = backgroundVisibleESet;
		backgroundVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__BACKGROUND_VISIBLE, oldBackgroundVisible, backgroundVisible, !oldBackgroundVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackgroundVisible() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBackgroundVisible = backgroundVisible;
		boolean oldBackgroundVisibleESet = backgroundVisibleESet;
		backgroundVisible = BACKGROUND_VISIBLE_EDEFAULT;
		backgroundVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__BACKGROUND_VISIBLE, oldBackgroundVisible, BACKGROUND_VISIBLE_EDEFAULT, oldBackgroundVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackgroundVisible() {
		return backgroundVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationClasses getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(PresentationClasses newClass) {
		PresentationClasses oldClass = class_;
		class_ = newClass == null ? CLASS_EDEFAULT : newClass;
		boolean oldClassESet = classESet;
		classESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__CLASS, oldClass, class_, !oldClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClass() {
		PresentationClasses oldClass = class_;
		boolean oldClassESet = classESet;
		class_ = CLASS_EDEFAULT;
		classESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__CLASS, oldClass, CLASS_EDEFAULT, oldClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClass() {
		return classESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getClassNames() {
		return classNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassNames(List<String> newClassNames) {
		List<String> oldClassNames = classNames;
		classNames = newClassNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__CLASS_NAMES, oldClassNames, classNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(Duration newDelay) {
		Duration oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationEffectDirections getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(PresentationEffectDirections newDirection) {
		PresentationEffectDirections oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		PresentationEffectDirections oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
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
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayDateTime() {
		return displayDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayDateTime(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayDateTime) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayDateTime = displayDateTime;
		displayDateTime = newDisplayDateTime == null ? DISPLAY_DATE_TIME_EDEFAULT : newDisplayDateTime;
		boolean oldDisplayDateTimeESet = displayDateTimeESet;
		displayDateTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__DISPLAY_DATE_TIME, oldDisplayDateTime, displayDateTime, !oldDisplayDateTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayDateTime() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayDateTime = displayDateTime;
		boolean oldDisplayDateTimeESet = displayDateTimeESet;
		displayDateTime = DISPLAY_DATE_TIME_EDEFAULT;
		displayDateTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__DISPLAY_DATE_TIME, oldDisplayDateTime, DISPLAY_DATE_TIME_EDEFAULT, oldDisplayDateTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayDateTime() {
		return displayDateTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayFooter() {
		return displayFooter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFooter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayFooter) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayFooter = displayFooter;
		displayFooter = newDisplayFooter == null ? DISPLAY_FOOTER_EDEFAULT : newDisplayFooter;
		boolean oldDisplayFooterESet = displayFooterESet;
		displayFooterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__DISPLAY_FOOTER, oldDisplayFooter, displayFooter, !oldDisplayFooterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayFooter() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayFooter = displayFooter;
		boolean oldDisplayFooterESet = displayFooterESet;
		displayFooter = DISPLAY_FOOTER_EDEFAULT;
		displayFooterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__DISPLAY_FOOTER, oldDisplayFooter, DISPLAY_FOOTER_EDEFAULT, oldDisplayFooterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayFooter() {
		return displayFooterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayHeader() {
		return displayHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayHeader) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayHeader = displayHeader;
		displayHeader = newDisplayHeader == null ? DISPLAY_HEADER_EDEFAULT : newDisplayHeader;
		boolean oldDisplayHeaderESet = displayHeaderESet;
		displayHeaderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__DISPLAY_HEADER, oldDisplayHeader, displayHeader, !oldDisplayHeaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayHeader() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayHeader = displayHeader;
		boolean oldDisplayHeaderESet = displayHeaderESet;
		displayHeader = DISPLAY_HEADER_EDEFAULT;
		displayHeaderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__DISPLAY_HEADER, oldDisplayHeader, DISPLAY_HEADER_EDEFAULT, oldDisplayHeaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayHeader() {
		return displayHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayPageNumber() {
		return displayPageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayPageNumber(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayPageNumber) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayPageNumber = displayPageNumber;
		displayPageNumber = newDisplayPageNumber == null ? DISPLAY_PAGE_NUMBER_EDEFAULT : newDisplayPageNumber;
		boolean oldDisplayPageNumberESet = displayPageNumberESet;
		displayPageNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER, oldDisplayPageNumber, displayPageNumber, !oldDisplayPageNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayPageNumber() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayPageNumber = displayPageNumber;
		boolean oldDisplayPageNumberESet = displayPageNumberESet;
		displayPageNumber = DISPLAY_PAGE_NUMBER_EDEFAULT;
		displayPageNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER, oldDisplayPageNumber, DISPLAY_PAGE_NUMBER_EDEFAULT, oldDisplayPageNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayPageNumber() {
		return displayPageNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationEffects getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(PresentationEffects newEffect) {
		PresentationEffects oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		boolean oldEffectESet = effectESet;
		effectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__EFFECT, oldEffect, effect, !oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffect() {
		PresentationEffects oldEffect = effect;
		boolean oldEffectESet = effectESet;
		effect = EFFECT_EDEFAULT;
		effectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__EFFECT, oldEffect, EFFECT_EDEFAULT, oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffect() {
		return effectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEndless() {
		return endless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newEndless) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEndless = endless;
		endless = newEndless == null ? ENDLESS_EDEFAULT : newEndless;
		boolean oldEndlessESet = endlessESet;
		endlessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__ENDLESS, oldEndless, endless, !oldEndlessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndless() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEndless = endless;
		boolean oldEndlessESet = endlessESet;
		endless = ENDLESS_EDEFAULT;
		endlessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__ENDLESS, oldEndless, ENDLESS_EDEFAULT, oldEndlessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndless() {
		return endlessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getForceManual() {
		return forceManual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newForceManual) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldForceManual = forceManual;
		forceManual = newForceManual == null ? FORCE_MANUAL_EDEFAULT : newForceManual;
		boolean oldForceManualESet = forceManualESet;
		forceManualESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__FORCE_MANUAL, oldForceManual, forceManual, !oldForceManualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceManual() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldForceManual = forceManual;
		boolean oldForceManualESet = forceManualESet;
		forceManual = FORCE_MANUAL_EDEFAULT;
		forceManualESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__FORCE_MANUAL, oldForceManual, FORCE_MANUAL_EDEFAULT, oldForceManualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceManual() {
		return forceManualESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFullScreen() {
		return fullScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFullScreen) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFullScreen = fullScreen;
		fullScreen = newFullScreen == null ? FULL_SCREEN_EDEFAULT : newFullScreen;
		boolean oldFullScreenESet = fullScreenESet;
		fullScreenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__FULL_SCREEN, oldFullScreen, fullScreen, !oldFullScreenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFullScreen() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFullScreen = fullScreen;
		boolean oldFullScreenESet = fullScreenESet;
		fullScreen = FULL_SCREEN_EDEFAULT;
		fullScreenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__FULL_SCREEN, oldFullScreen, FULL_SCREEN_EDEFAULT, oldFullScreenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFullScreen() {
		return fullScreenESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__GROUP_ID, oldGroupId, groupId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__MASTER_ELEMENT, oldMasterElement, masterElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMouseAsPen() {
		return mouseAsPen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMouseAsPen) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMouseAsPen = mouseAsPen;
		mouseAsPen = newMouseAsPen == null ? MOUSE_AS_PEN_EDEFAULT : newMouseAsPen;
		boolean oldMouseAsPenESet = mouseAsPenESet;
		mouseAsPenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__MOUSE_AS_PEN, oldMouseAsPen, mouseAsPen, !oldMouseAsPenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMouseAsPen() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMouseAsPen = mouseAsPen;
		boolean oldMouseAsPenESet = mouseAsPenESet;
		mouseAsPen = MOUSE_AS_PEN_EDEFAULT;
		mouseAsPenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__MOUSE_AS_PEN, oldMouseAsPen, MOUSE_AS_PEN_EDEFAULT, oldMouseAsPenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMouseAsPen() {
		return mouseAsPenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMouseVisible() {
		return mouseVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMouseVisible) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMouseVisible = mouseVisible;
		mouseVisible = newMouseVisible == null ? MOUSE_VISIBLE_EDEFAULT : newMouseVisible;
		boolean oldMouseVisibleESet = mouseVisibleESet;
		mouseVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__MOUSE_VISIBLE, oldMouseVisible, mouseVisible, !oldMouseVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMouseVisible() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMouseVisible = mouseVisible;
		boolean oldMouseVisibleESet = mouseVisibleESet;
		mouseVisible = MOUSE_VISIBLE_EDEFAULT;
		mouseVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__MOUSE_VISIBLE, oldMouseVisible, MOUSE_VISIBLE_EDEFAULT, oldMouseVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMouseVisible() {
		return mouseVisibleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__NODE_TYPE, oldNodeType, nodeType, !oldNodeTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__NODE_TYPE, oldNodeType, NODE_TYPE_EDEFAULT, oldNodeTypeESet));
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
	public Object getPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPages(Object newPages) {
		Object oldPages = pages;
		pages = newPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PAGES, oldPages, pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPathId() {
		return pathId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathId(Object newPathId) {
		Object oldPathId = pathId;
		pathId = newPathId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PATH_ID, oldPathId, pathId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getPause() {
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPause(Duration newPause) {
		Duration oldPause = pause;
		pause = newPause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PAUSE, oldPause, pause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPlaceholder1() {
		return placeholder1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPlaceholder1) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPlaceholder1 = placeholder1;
		placeholder1 = newPlaceholder1 == null ? PLACEHOLDER1_EDEFAULT : newPlaceholder1;
		boolean oldPlaceholder1ESet = placeholder1ESet;
		placeholder1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER1, oldPlaceholder1, placeholder1, !oldPlaceholder1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlaceholder1() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPlaceholder1 = placeholder1;
		boolean oldPlaceholder1ESet = placeholder1ESet;
		placeholder1 = PLACEHOLDER1_EDEFAULT;
		placeholder1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER1, oldPlaceholder1, PLACEHOLDER1_EDEFAULT, oldPlaceholder1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlaceholder1() {
		return placeholder1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPlayFull() {
		return playFull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayFull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPlayFull) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPlayFull = playFull;
		playFull = newPlayFull == null ? PLAY_FULL_EDEFAULT : newPlayFull;
		boolean oldPlayFullESet = playFullESet;
		playFullESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PLAY_FULL, oldPlayFull, playFull, !oldPlayFullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlayFull() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPlayFull = playFull;
		boolean oldPlayFullESet = playFullESet;
		playFull = PLAY_FULL_EDEFAULT;
		playFullESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__PLAY_FULL, oldPlayFull, PLAY_FULL_EDEFAULT, oldPlayFullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlayFull() {
		return playFullESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationPageLayoutName() {
		return presentationPageLayoutName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationPageLayoutName(String newPresentationPageLayoutName) {
		String oldPresentationPageLayoutName = presentationPageLayoutName;
		presentationPageLayoutName = newPresentationPageLayoutName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT_NAME, oldPresentationPageLayoutName, presentationPageLayoutName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PRESET_CLASS, oldPresetClass, presetClass, !oldPresetClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__PRESET_CLASS, oldPresetClass, PRESET_CLASS_EDEFAULT, oldPresetClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PRESET_ID, oldPresetId, presetId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__PRESET_SUB_TYPE, oldPresetSubType, presetSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShow1() {
		return show1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow1(String newShow1) {
		String oldShow1 = show1;
		show1 = newShow1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__SHOW1, oldShow1, show1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowEndOfPresentationSlide() {
		return showEndOfPresentationSlide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShowEndOfPresentationSlide) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowEndOfPresentationSlide = showEndOfPresentationSlide;
		showEndOfPresentationSlide = newShowEndOfPresentationSlide == null ? SHOW_END_OF_PRESENTATION_SLIDE_EDEFAULT : newShowEndOfPresentationSlide;
		boolean oldShowEndOfPresentationSlideESet = showEndOfPresentationSlideESet;
		showEndOfPresentationSlideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE, oldShowEndOfPresentationSlide, showEndOfPresentationSlide, !oldShowEndOfPresentationSlideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowEndOfPresentationSlide() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowEndOfPresentationSlide = showEndOfPresentationSlide;
		boolean oldShowEndOfPresentationSlideESet = showEndOfPresentationSlideESet;
		showEndOfPresentationSlide = SHOW_END_OF_PRESENTATION_SLIDE_EDEFAULT;
		showEndOfPresentationSlideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE, oldShowEndOfPresentationSlide, SHOW_END_OF_PRESENTATION_SLIDE_EDEFAULT, oldShowEndOfPresentationSlideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowEndOfPresentationSlide() {
		return showEndOfPresentationSlideESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowLogo() {
		return showLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShowLogo) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowLogo = showLogo;
		showLogo = newShowLogo == null ? SHOW_LOGO_EDEFAULT : newShowLogo;
		boolean oldShowLogoESet = showLogoESet;
		showLogoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__SHOW_LOGO, oldShowLogo, showLogo, !oldShowLogoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowLogo() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowLogo = showLogo;
		boolean oldShowLogoESet = showLogoESet;
		showLogo = SHOW_LOGO_EDEFAULT;
		showLogoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__SHOW_LOGO, oldShowLogo, SHOW_LOGO_EDEFAULT, oldShowLogoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowLogo() {
		return showLogoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceType newSource) {
		SourceType oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		boolean oldSourceESet = sourceESet;
		sourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__SOURCE, oldSource, source, !oldSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSource() {
		SourceType oldSource = source;
		boolean oldSourceESet = sourceESet;
		source = SOURCE_EDEFAULT;
		sourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
		return sourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSpeeds getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(PresentationSpeeds newSpeed) {
		PresentationSpeeds oldSpeed = speed;
		speed = newSpeed == null ? SPEED_EDEFAULT : newSpeed;
		boolean oldSpeedESet = speedESet;
		speedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__SPEED, oldSpeed, speed, !oldSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpeed() {
		PresentationSpeeds oldSpeed = speed;
		boolean oldSpeedESet = speedESet;
		speed = SPEED_EDEFAULT;
		speedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__SPEED, oldSpeed, SPEED_EDEFAULT, oldSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpeed() {
		return speedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartPage() {
		return startPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPage(String newStartPage) {
		String oldStartPage = startPage;
		startPage = newStartPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__START_PAGE, oldStartPage, startPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartScale() {
		return startScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartScale(String newStartScale) {
		String oldStartScale = startScale;
		startScale = newStartScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__START_SCALE, oldStartScale, startScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStartWithNavigator() {
		return startWithNavigator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newStartWithNavigator) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStartWithNavigator = startWithNavigator;
		startWithNavigator = newStartWithNavigator == null ? START_WITH_NAVIGATOR_EDEFAULT : newStartWithNavigator;
		boolean oldStartWithNavigatorESet = startWithNavigatorESet;
		startWithNavigatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__START_WITH_NAVIGATOR, oldStartWithNavigator, startWithNavigator, !oldStartWithNavigatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartWithNavigator() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStartWithNavigator = startWithNavigator;
		boolean oldStartWithNavigatorESet = startWithNavigatorESet;
		startWithNavigator = START_WITH_NAVIGATOR_EDEFAULT;
		startWithNavigatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__START_WITH_NAVIGATOR, oldStartWithNavigator, START_WITH_NAVIGATOR_EDEFAULT, oldStartWithNavigatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartWithNavigator() {
		return startWithNavigatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStayOnTop() {
		return stayOnTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newStayOnTop) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStayOnTop = stayOnTop;
		stayOnTop = newStayOnTop == null ? STAY_ON_TOP_EDEFAULT : newStayOnTop;
		boolean oldStayOnTopESet = stayOnTopESet;
		stayOnTopESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__STAY_ON_TOP, oldStayOnTop, stayOnTop, !oldStayOnTopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStayOnTop() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStayOnTop = stayOnTop;
		boolean oldStayOnTopESet = stayOnTopESet;
		stayOnTop = STAY_ON_TOP_EDEFAULT;
		stayOnTopESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__STAY_ON_TOP, oldStayOnTop, STAY_ON_TOP_EDEFAULT, oldStayOnTopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStayOnTop() {
		return stayOnTopESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionOnClickType getTransitionOnClick() {
		return transitionOnClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionOnClick(TransitionOnClickType newTransitionOnClick) {
		TransitionOnClickType oldTransitionOnClick = transitionOnClick;
		transitionOnClick = newTransitionOnClick == null ? TRANSITION_ON_CLICK_EDEFAULT : newTransitionOnClick;
		boolean oldTransitionOnClickESet = transitionOnClickESet;
		transitionOnClickESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__TRANSITION_ON_CLICK, oldTransitionOnClick, transitionOnClick, !oldTransitionOnClickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransitionOnClick() {
		TransitionOnClickType oldTransitionOnClick = transitionOnClick;
		boolean oldTransitionOnClickESet = transitionOnClickESet;
		transitionOnClick = TRANSITION_ON_CLICK_EDEFAULT;
		transitionOnClickESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__TRANSITION_ON_CLICK, oldTransitionOnClick, TRANSITION_ON_CLICK_EDEFAULT, oldTransitionOnClickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransitionOnClick() {
		return transitionOnClickESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSpeeds getTransitionSpeed() {
		return transitionSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionSpeed(PresentationSpeeds newTransitionSpeed) {
		PresentationSpeeds oldTransitionSpeed = transitionSpeed;
		transitionSpeed = newTransitionSpeed == null ? TRANSITION_SPEED_EDEFAULT : newTransitionSpeed;
		boolean oldTransitionSpeedESet = transitionSpeedESet;
		transitionSpeedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__TRANSITION_SPEED, oldTransitionSpeed, transitionSpeed, !oldTransitionSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransitionSpeed() {
		PresentationSpeeds oldTransitionSpeed = transitionSpeed;
		boolean oldTransitionSpeedESet = transitionSpeedESet;
		transitionSpeed = TRANSITION_SPEED_EDEFAULT;
		transitionSpeedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__TRANSITION_SPEED, oldTransitionSpeed, TRANSITION_SPEED_EDEFAULT, oldTransitionSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransitionSpeed() {
		return transitionSpeedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionStyleType getTransitionStyle() {
		return transitionStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionStyle(TransitionStyleType newTransitionStyle) {
		TransitionStyleType oldTransitionStyle = transitionStyle;
		transitionStyle = newTransitionStyle == null ? TRANSITION_STYLE_EDEFAULT : newTransitionStyle;
		boolean oldTransitionStyleESet = transitionStyleESet;
		transitionStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__TRANSITION_STYLE, oldTransitionStyle, transitionStyle, !oldTransitionStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransitionStyle() {
		TransitionStyleType oldTransitionStyle = transitionStyle;
		boolean oldTransitionStyleESet = transitionStyleESet;
		transitionStyle = TRANSITION_STYLE_EDEFAULT;
		transitionStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__TRANSITION_STYLE, oldTransitionStyle, TRANSITION_STYLE_EDEFAULT, oldTransitionStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransitionStyle() {
		return transitionStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionTypeType getTransitionType() {
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionType(TransitionTypeType newTransitionType) {
		TransitionTypeType oldTransitionType = transitionType;
		transitionType = newTransitionType == null ? TRANSITION_TYPE_EDEFAULT : newTransitionType;
		boolean oldTransitionTypeESet = transitionTypeESet;
		transitionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__TRANSITION_TYPE, oldTransitionType, transitionType, !oldTransitionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransitionType() {
		TransitionTypeType oldTransitionType = transitionType;
		boolean oldTransitionTypeESet = transitionTypeESet;
		transitionType = TRANSITION_TYPE_EDEFAULT;
		transitionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__TRANSITION_TYPE, oldTransitionType, TRANSITION_TYPE_EDEFAULT, oldTransitionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransitionType() {
		return transitionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseDateTimeName() {
		return useDateTimeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDateTimeName(String newUseDateTimeName) {
		String oldUseDateTimeName = useDateTimeName;
		useDateTimeName = newUseDateTimeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__USE_DATE_TIME_NAME, oldUseDateTimeName, useDateTimeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseFooterName() {
		return useFooterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFooterName(String newUseFooterName) {
		String oldUseFooterName = useFooterName;
		useFooterName = newUseFooterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__USE_FOOTER_NAME, oldUseFooterName, useFooterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseHeaderName() {
		return useHeaderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseHeaderName(String newUseHeaderName) {
		String oldUseHeaderName = useHeaderName;
		useHeaderName = newUseHeaderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__USE_HEADER_NAME, oldUseHeaderName, useHeaderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUserTransformed() {
		return userTransformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTransformed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUserTransformed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUserTransformed = userTransformed;
		userTransformed = newUserTransformed == null ? USER_TRANSFORMED_EDEFAULT : newUserTransformed;
		boolean oldUserTransformedESet = userTransformedESet;
		userTransformedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__USER_TRANSFORMED, oldUserTransformed, userTransformed, !oldUserTransformedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserTransformed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUserTransformed = userTransformed;
		boolean oldUserTransformedESet = userTransformedESet;
		userTransformed = USER_TRANSFORMED_EDEFAULT;
		userTransformedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__USER_TRANSFORMED, oldUserTransformed, USER_TRANSFORMED_EDEFAULT, oldUserTransformedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserTransformed() {
		return userTransformedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVerb() {
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(BigInteger newVerb) {
		BigInteger oldVerb = verb;
		verb = newVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__VERB, oldVerb, verb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityType newVisibility) {
		VisibilityType oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DOCUMENT_ROOT__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		VisibilityType oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.DOCUMENT_ROOT__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case PresentationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case PresentationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case PresentationPackage.DOCUMENT_ROOT__ANIMATION_GROUP:
				return basicSetAnimationGroup(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS:
				return basicSetAnimations(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME_DECL:
				return basicSetDateTimeDecl(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__DIM:
				return basicSetDim(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__EVENT_LISTENER:
				return basicSetEventListener(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__FOOTER:
				return basicSetFooter(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__FOOTER_DECL:
				return basicSetFooterDecl(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__HEADER:
				return basicSetHeader(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__HEADER_DECL:
				return basicSetHeaderDecl(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__HIDE_SHAPE:
				return basicSetHideShape(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__HIDE_TEXT:
				return basicSetHideText(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__NOTES:
				return basicSetNotes(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER:
				return basicSetPlaceholder(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__PLAY:
				return basicSetPlay(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__SETTINGS:
				return basicSetSettings(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__SHOW:
				return basicSetShow(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__SHOW_SHAPE:
				return basicSetShowShape(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__SHOW_TEXT:
				return basicSetShowText(null, msgs);
			case PresentationPackage.DOCUMENT_ROOT__SOUND:
				return basicSetSound(null, msgs);
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
			case PresentationPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case PresentationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case PresentationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case PresentationPackage.DOCUMENT_ROOT__ANIMATION_GROUP:
				return getAnimationGroup();
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS:
				return getAnimations();
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME:
				return getDateTime();
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME_DECL:
				return getDateTimeDecl();
			case PresentationPackage.DOCUMENT_ROOT__DIM:
				return getDim();
			case PresentationPackage.DOCUMENT_ROOT__EVENT_LISTENER:
				return getEventListener();
			case PresentationPackage.DOCUMENT_ROOT__FOOTER:
				return getFooter();
			case PresentationPackage.DOCUMENT_ROOT__FOOTER_DECL:
				return getFooterDecl();
			case PresentationPackage.DOCUMENT_ROOT__HEADER:
				return getHeader();
			case PresentationPackage.DOCUMENT_ROOT__HEADER_DECL:
				return getHeaderDecl();
			case PresentationPackage.DOCUMENT_ROOT__HIDE_SHAPE:
				return getHideShape();
			case PresentationPackage.DOCUMENT_ROOT__HIDE_TEXT:
				return getHideText();
			case PresentationPackage.DOCUMENT_ROOT__NOTES:
				return getNotes();
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER:
				return getPlaceholder();
			case PresentationPackage.DOCUMENT_ROOT__PLAY:
				return getPlay();
			case PresentationPackage.DOCUMENT_ROOT__SETTINGS:
				return getSettings();
			case PresentationPackage.DOCUMENT_ROOT__SHOW:
				return getShow();
			case PresentationPackage.DOCUMENT_ROOT__SHOW_SHAPE:
				return getShowShape();
			case PresentationPackage.DOCUMENT_ROOT__SHOW_TEXT:
				return getShowText();
			case PresentationPackage.DOCUMENT_ROOT__SOUND:
				return getSound();
			case PresentationPackage.DOCUMENT_ROOT__ACTION:
				return getAction();
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS1:
				return getAnimations1();
			case PresentationPackage.DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE:
				return getBackgroundObjectsVisible();
			case PresentationPackage.DOCUMENT_ROOT__BACKGROUND_VISIBLE:
				return getBackgroundVisible();
			case PresentationPackage.DOCUMENT_ROOT__CLASS:
				return getClass_();
			case PresentationPackage.DOCUMENT_ROOT__CLASS_NAMES:
				return getClassNames();
			case PresentationPackage.DOCUMENT_ROOT__DELAY:
				return getDelay();
			case PresentationPackage.DOCUMENT_ROOT__DIRECTION:
				return getDirection();
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_DATE_TIME:
				return getDisplayDateTime();
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_FOOTER:
				return getDisplayFooter();
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_HEADER:
				return getDisplayHeader();
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER:
				return getDisplayPageNumber();
			case PresentationPackage.DOCUMENT_ROOT__DURATION:
				return getDuration();
			case PresentationPackage.DOCUMENT_ROOT__EFFECT:
				return getEffect();
			case PresentationPackage.DOCUMENT_ROOT__ENDLESS:
				return getEndless();
			case PresentationPackage.DOCUMENT_ROOT__FORCE_MANUAL:
				return getForceManual();
			case PresentationPackage.DOCUMENT_ROOT__FULL_SCREEN:
				return getFullScreen();
			case PresentationPackage.DOCUMENT_ROOT__GROUP_ID:
				return getGroupId();
			case PresentationPackage.DOCUMENT_ROOT__MASTER_ELEMENT:
				return getMasterElement();
			case PresentationPackage.DOCUMENT_ROOT__MOUSE_AS_PEN:
				return getMouseAsPen();
			case PresentationPackage.DOCUMENT_ROOT__MOUSE_VISIBLE:
				return getMouseVisible();
			case PresentationPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case PresentationPackage.DOCUMENT_ROOT__NODE_TYPE:
				return getNodeType();
			case PresentationPackage.DOCUMENT_ROOT__PAGES:
				return getPages();
			case PresentationPackage.DOCUMENT_ROOT__PATH_ID:
				return getPathId();
			case PresentationPackage.DOCUMENT_ROOT__PAUSE:
				return getPause();
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER1:
				return getPlaceholder1();
			case PresentationPackage.DOCUMENT_ROOT__PLAY_FULL:
				return getPlayFull();
			case PresentationPackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT_NAME:
				return getPresentationPageLayoutName();
			case PresentationPackage.DOCUMENT_ROOT__PRESET_CLASS:
				return getPresetClass();
			case PresentationPackage.DOCUMENT_ROOT__PRESET_ID:
				return getPresetId();
			case PresentationPackage.DOCUMENT_ROOT__PRESET_SUB_TYPE:
				return getPresetSubType();
			case PresentationPackage.DOCUMENT_ROOT__SHOW1:
				return getShow1();
			case PresentationPackage.DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE:
				return getShowEndOfPresentationSlide();
			case PresentationPackage.DOCUMENT_ROOT__SHOW_LOGO:
				return getShowLogo();
			case PresentationPackage.DOCUMENT_ROOT__SOURCE:
				return getSource();
			case PresentationPackage.DOCUMENT_ROOT__SPEED:
				return getSpeed();
			case PresentationPackage.DOCUMENT_ROOT__START_PAGE:
				return getStartPage();
			case PresentationPackage.DOCUMENT_ROOT__START_SCALE:
				return getStartScale();
			case PresentationPackage.DOCUMENT_ROOT__START_WITH_NAVIGATOR:
				return getStartWithNavigator();
			case PresentationPackage.DOCUMENT_ROOT__STAY_ON_TOP:
				return getStayOnTop();
			case PresentationPackage.DOCUMENT_ROOT__STYLE_NAME:
				return getStyleName();
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_ON_CLICK:
				return getTransitionOnClick();
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_SPEED:
				return getTransitionSpeed();
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_STYLE:
				return getTransitionStyle();
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_TYPE:
				return getTransitionType();
			case PresentationPackage.DOCUMENT_ROOT__USE_DATE_TIME_NAME:
				return getUseDateTimeName();
			case PresentationPackage.DOCUMENT_ROOT__USE_FOOTER_NAME:
				return getUseFooterName();
			case PresentationPackage.DOCUMENT_ROOT__USE_HEADER_NAME:
				return getUseHeaderName();
			case PresentationPackage.DOCUMENT_ROOT__USER_TRANSFORMED:
				return getUserTransformed();
			case PresentationPackage.DOCUMENT_ROOT__VERB:
				return getVerb();
			case PresentationPackage.DOCUMENT_ROOT__VISIBILITY:
				return getVisibility();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__ANIMATION_GROUP:
				setAnimationGroup((AnimationGroupType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS:
				setAnimations((AnimationsType1)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME:
				setDateTime((DateTimeType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME_DECL:
				setDateTimeDecl((DateTimeDeclType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DIM:
				setDim((DimType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__EVENT_LISTENER:
				setEventListener((EventListenerType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__FOOTER:
				setFooter((FooterType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__FOOTER_DECL:
				setFooterDecl((FooterDeclType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__HEADER_DECL:
				setHeaderDecl((HeaderDeclType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__HIDE_SHAPE:
				setHideShape((HideShapeType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__HIDE_TEXT:
				setHideText((HideTextType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__NOTES:
				setNotes((NotesType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER:
				setPlaceholder((PlaceholderType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PLAY:
				setPlay((PlayType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SETTINGS:
				setSettings((SettingsType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW:
				setShow((ShowType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_SHAPE:
				setShowShape((ShowShapeType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_TEXT:
				setShowText((ShowTextType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SOUND:
				setSound((SoundType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__ACTION:
				setAction((ActionType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS1:
				setAnimations1((AnimationsType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE:
				setBackgroundObjectsVisible((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__BACKGROUND_VISIBLE:
				setBackgroundVisible((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__CLASS:
				setClass((PresentationClasses)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__CLASS_NAMES:
				setClassNames((List<String>)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DELAY:
				setDelay((Duration)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DIRECTION:
				setDirection((PresentationEffectDirections)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_DATE_TIME:
				setDisplayDateTime((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_FOOTER:
				setDisplayFooter((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_HEADER:
				setDisplayHeader((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER:
				setDisplayPageNumber((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DURATION:
				setDuration((Duration)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__EFFECT:
				setEffect((PresentationEffects)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__ENDLESS:
				setEndless((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__FORCE_MANUAL:
				setForceManual((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__FULL_SCREEN:
				setFullScreen((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__MASTER_ELEMENT:
				setMasterElement((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__MOUSE_AS_PEN:
				setMouseAsPen((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__MOUSE_VISIBLE:
				setMouseVisible((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__NODE_TYPE:
				setNodeType((NodeTypeType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PAGES:
				setPages(newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PATH_ID:
				setPathId(newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PAUSE:
				setPause((Duration)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER1:
				setPlaceholder1((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PLAY_FULL:
				setPlayFull((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT_NAME:
				setPresentationPageLayoutName((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PRESET_CLASS:
				setPresetClass((PresetClassType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PRESET_ID:
				setPresetId((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PRESET_SUB_TYPE:
				setPresetSubType((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW1:
				setShow1((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE:
				setShowEndOfPresentationSlide((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_LOGO:
				setShowLogo((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SOURCE:
				setSource((SourceType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SPEED:
				setSpeed((PresentationSpeeds)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__START_PAGE:
				setStartPage((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__START_SCALE:
				setStartScale((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__START_WITH_NAVIGATOR:
				setStartWithNavigator((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__STAY_ON_TOP:
				setStayOnTop((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_ON_CLICK:
				setTransitionOnClick((TransitionOnClickType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_SPEED:
				setTransitionSpeed((PresentationSpeeds)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_STYLE:
				setTransitionStyle((TransitionStyleType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_TYPE:
				setTransitionType((TransitionTypeType)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__USE_DATE_TIME_NAME:
				setUseDateTimeName((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__USE_FOOTER_NAME:
				setUseFooterName((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__USE_HEADER_NAME:
				setUseHeaderName((String)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__USER_TRANSFORMED:
				setUserTransformed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__VERB:
				setVerb((BigInteger)newValue);
				return;
			case PresentationPackage.DOCUMENT_ROOT__VISIBILITY:
				setVisibility((VisibilityType)newValue);
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
			case PresentationPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case PresentationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case PresentationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case PresentationPackage.DOCUMENT_ROOT__ANIMATION_GROUP:
				setAnimationGroup((AnimationGroupType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS:
				setAnimations((AnimationsType1)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME:
				setDateTime((DateTimeType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME_DECL:
				setDateTimeDecl((DateTimeDeclType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DIM:
				setDim((DimType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__EVENT_LISTENER:
				setEventListener((EventListenerType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__FOOTER:
				setFooter((FooterType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__FOOTER_DECL:
				setFooterDecl((FooterDeclType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__HEADER_DECL:
				setHeaderDecl((HeaderDeclType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__HIDE_SHAPE:
				setHideShape((HideShapeType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__HIDE_TEXT:
				setHideText((HideTextType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__NOTES:
				setNotes((NotesType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER:
				setPlaceholder((PlaceholderType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PLAY:
				setPlay((PlayType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SETTINGS:
				setSettings((SettingsType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW:
				setShow((ShowType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_SHAPE:
				setShowShape((ShowShapeType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_TEXT:
				setShowText((ShowTextType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SOUND:
				setSound((SoundType)null);
				return;
			case PresentationPackage.DOCUMENT_ROOT__ACTION:
				unsetAction();
				return;
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS1:
				unsetAnimations1();
				return;
			case PresentationPackage.DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE:
				unsetBackgroundObjectsVisible();
				return;
			case PresentationPackage.DOCUMENT_ROOT__BACKGROUND_VISIBLE:
				unsetBackgroundVisible();
				return;
			case PresentationPackage.DOCUMENT_ROOT__CLASS:
				unsetClass();
				return;
			case PresentationPackage.DOCUMENT_ROOT__CLASS_NAMES:
				setClassNames(CLASS_NAMES_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__DIRECTION:
				unsetDirection();
				return;
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_DATE_TIME:
				unsetDisplayDateTime();
				return;
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_FOOTER:
				unsetDisplayFooter();
				return;
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_HEADER:
				unsetDisplayHeader();
				return;
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER:
				unsetDisplayPageNumber();
				return;
			case PresentationPackage.DOCUMENT_ROOT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__EFFECT:
				unsetEffect();
				return;
			case PresentationPackage.DOCUMENT_ROOT__ENDLESS:
				unsetEndless();
				return;
			case PresentationPackage.DOCUMENT_ROOT__FORCE_MANUAL:
				unsetForceManual();
				return;
			case PresentationPackage.DOCUMENT_ROOT__FULL_SCREEN:
				unsetFullScreen();
				return;
			case PresentationPackage.DOCUMENT_ROOT__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__MASTER_ELEMENT:
				setMasterElement(MASTER_ELEMENT_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__MOUSE_AS_PEN:
				unsetMouseAsPen();
				return;
			case PresentationPackage.DOCUMENT_ROOT__MOUSE_VISIBLE:
				unsetMouseVisible();
				return;
			case PresentationPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__NODE_TYPE:
				unsetNodeType();
				return;
			case PresentationPackage.DOCUMENT_ROOT__PAGES:
				setPages(PAGES_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PATH_ID:
				setPathId(PATH_ID_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PAUSE:
				setPause(PAUSE_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER1:
				unsetPlaceholder1();
				return;
			case PresentationPackage.DOCUMENT_ROOT__PLAY_FULL:
				unsetPlayFull();
				return;
			case PresentationPackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT_NAME:
				setPresentationPageLayoutName(PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PRESET_CLASS:
				unsetPresetClass();
				return;
			case PresentationPackage.DOCUMENT_ROOT__PRESET_ID:
				setPresetId(PRESET_ID_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__PRESET_SUB_TYPE:
				setPresetSubType(PRESET_SUB_TYPE_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW1:
				setShow1(SHOW1_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE:
				unsetShowEndOfPresentationSlide();
				return;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_LOGO:
				unsetShowLogo();
				return;
			case PresentationPackage.DOCUMENT_ROOT__SOURCE:
				unsetSource();
				return;
			case PresentationPackage.DOCUMENT_ROOT__SPEED:
				unsetSpeed();
				return;
			case PresentationPackage.DOCUMENT_ROOT__START_PAGE:
				setStartPage(START_PAGE_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__START_SCALE:
				setStartScale(START_SCALE_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__START_WITH_NAVIGATOR:
				unsetStartWithNavigator();
				return;
			case PresentationPackage.DOCUMENT_ROOT__STAY_ON_TOP:
				unsetStayOnTop();
				return;
			case PresentationPackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_ON_CLICK:
				unsetTransitionOnClick();
				return;
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_SPEED:
				unsetTransitionSpeed();
				return;
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_STYLE:
				unsetTransitionStyle();
				return;
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_TYPE:
				unsetTransitionType();
				return;
			case PresentationPackage.DOCUMENT_ROOT__USE_DATE_TIME_NAME:
				setUseDateTimeName(USE_DATE_TIME_NAME_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__USE_FOOTER_NAME:
				setUseFooterName(USE_FOOTER_NAME_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__USE_HEADER_NAME:
				setUseHeaderName(USE_HEADER_NAME_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__USER_TRANSFORMED:
				unsetUserTransformed();
				return;
			case PresentationPackage.DOCUMENT_ROOT__VERB:
				setVerb(VERB_EDEFAULT);
				return;
			case PresentationPackage.DOCUMENT_ROOT__VISIBILITY:
				unsetVisibility();
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
			case PresentationPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case PresentationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case PresentationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case PresentationPackage.DOCUMENT_ROOT__ANIMATION_GROUP:
				return getAnimationGroup() != null;
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS:
				return getAnimations() != null;
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME:
				return getDateTime() != null;
			case PresentationPackage.DOCUMENT_ROOT__DATE_TIME_DECL:
				return getDateTimeDecl() != null;
			case PresentationPackage.DOCUMENT_ROOT__DIM:
				return getDim() != null;
			case PresentationPackage.DOCUMENT_ROOT__EVENT_LISTENER:
				return getEventListener() != null;
			case PresentationPackage.DOCUMENT_ROOT__FOOTER:
				return getFooter() != null;
			case PresentationPackage.DOCUMENT_ROOT__FOOTER_DECL:
				return getFooterDecl() != null;
			case PresentationPackage.DOCUMENT_ROOT__HEADER:
				return getHeader() != null;
			case PresentationPackage.DOCUMENT_ROOT__HEADER_DECL:
				return getHeaderDecl() != null;
			case PresentationPackage.DOCUMENT_ROOT__HIDE_SHAPE:
				return getHideShape() != null;
			case PresentationPackage.DOCUMENT_ROOT__HIDE_TEXT:
				return getHideText() != null;
			case PresentationPackage.DOCUMENT_ROOT__NOTES:
				return getNotes() != null;
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER:
				return getPlaceholder() != null;
			case PresentationPackage.DOCUMENT_ROOT__PLAY:
				return getPlay() != null;
			case PresentationPackage.DOCUMENT_ROOT__SETTINGS:
				return getSettings() != null;
			case PresentationPackage.DOCUMENT_ROOT__SHOW:
				return getShow() != null;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_SHAPE:
				return getShowShape() != null;
			case PresentationPackage.DOCUMENT_ROOT__SHOW_TEXT:
				return getShowText() != null;
			case PresentationPackage.DOCUMENT_ROOT__SOUND:
				return getSound() != null;
			case PresentationPackage.DOCUMENT_ROOT__ACTION:
				return isSetAction();
			case PresentationPackage.DOCUMENT_ROOT__ANIMATIONS1:
				return isSetAnimations1();
			case PresentationPackage.DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE:
				return isSetBackgroundObjectsVisible();
			case PresentationPackage.DOCUMENT_ROOT__BACKGROUND_VISIBLE:
				return isSetBackgroundVisible();
			case PresentationPackage.DOCUMENT_ROOT__CLASS:
				return isSetClass();
			case PresentationPackage.DOCUMENT_ROOT__CLASS_NAMES:
				return CLASS_NAMES_EDEFAULT == null ? classNames != null : !CLASS_NAMES_EDEFAULT.equals(classNames);
			case PresentationPackage.DOCUMENT_ROOT__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case PresentationPackage.DOCUMENT_ROOT__DIRECTION:
				return isSetDirection();
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_DATE_TIME:
				return isSetDisplayDateTime();
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_FOOTER:
				return isSetDisplayFooter();
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_HEADER:
				return isSetDisplayHeader();
			case PresentationPackage.DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER:
				return isSetDisplayPageNumber();
			case PresentationPackage.DOCUMENT_ROOT__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case PresentationPackage.DOCUMENT_ROOT__EFFECT:
				return isSetEffect();
			case PresentationPackage.DOCUMENT_ROOT__ENDLESS:
				return isSetEndless();
			case PresentationPackage.DOCUMENT_ROOT__FORCE_MANUAL:
				return isSetForceManual();
			case PresentationPackage.DOCUMENT_ROOT__FULL_SCREEN:
				return isSetFullScreen();
			case PresentationPackage.DOCUMENT_ROOT__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case PresentationPackage.DOCUMENT_ROOT__MASTER_ELEMENT:
				return MASTER_ELEMENT_EDEFAULT == null ? masterElement != null : !MASTER_ELEMENT_EDEFAULT.equals(masterElement);
			case PresentationPackage.DOCUMENT_ROOT__MOUSE_AS_PEN:
				return isSetMouseAsPen();
			case PresentationPackage.DOCUMENT_ROOT__MOUSE_VISIBLE:
				return isSetMouseVisible();
			case PresentationPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PresentationPackage.DOCUMENT_ROOT__NODE_TYPE:
				return isSetNodeType();
			case PresentationPackage.DOCUMENT_ROOT__PAGES:
				return PAGES_EDEFAULT == null ? pages != null : !PAGES_EDEFAULT.equals(pages);
			case PresentationPackage.DOCUMENT_ROOT__PATH_ID:
				return PATH_ID_EDEFAULT == null ? pathId != null : !PATH_ID_EDEFAULT.equals(pathId);
			case PresentationPackage.DOCUMENT_ROOT__PAUSE:
				return PAUSE_EDEFAULT == null ? pause != null : !PAUSE_EDEFAULT.equals(pause);
			case PresentationPackage.DOCUMENT_ROOT__PLACEHOLDER1:
				return isSetPlaceholder1();
			case PresentationPackage.DOCUMENT_ROOT__PLAY_FULL:
				return isSetPlayFull();
			case PresentationPackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT_NAME:
				return PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT == null ? presentationPageLayoutName != null : !PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT.equals(presentationPageLayoutName);
			case PresentationPackage.DOCUMENT_ROOT__PRESET_CLASS:
				return isSetPresetClass();
			case PresentationPackage.DOCUMENT_ROOT__PRESET_ID:
				return PRESET_ID_EDEFAULT == null ? presetId != null : !PRESET_ID_EDEFAULT.equals(presetId);
			case PresentationPackage.DOCUMENT_ROOT__PRESET_SUB_TYPE:
				return PRESET_SUB_TYPE_EDEFAULT == null ? presetSubType != null : !PRESET_SUB_TYPE_EDEFAULT.equals(presetSubType);
			case PresentationPackage.DOCUMENT_ROOT__SHOW1:
				return SHOW1_EDEFAULT == null ? show1 != null : !SHOW1_EDEFAULT.equals(show1);
			case PresentationPackage.DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE:
				return isSetShowEndOfPresentationSlide();
			case PresentationPackage.DOCUMENT_ROOT__SHOW_LOGO:
				return isSetShowLogo();
			case PresentationPackage.DOCUMENT_ROOT__SOURCE:
				return isSetSource();
			case PresentationPackage.DOCUMENT_ROOT__SPEED:
				return isSetSpeed();
			case PresentationPackage.DOCUMENT_ROOT__START_PAGE:
				return START_PAGE_EDEFAULT == null ? startPage != null : !START_PAGE_EDEFAULT.equals(startPage);
			case PresentationPackage.DOCUMENT_ROOT__START_SCALE:
				return START_SCALE_EDEFAULT == null ? startScale != null : !START_SCALE_EDEFAULT.equals(startScale);
			case PresentationPackage.DOCUMENT_ROOT__START_WITH_NAVIGATOR:
				return isSetStartWithNavigator();
			case PresentationPackage.DOCUMENT_ROOT__STAY_ON_TOP:
				return isSetStayOnTop();
			case PresentationPackage.DOCUMENT_ROOT__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_ON_CLICK:
				return isSetTransitionOnClick();
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_SPEED:
				return isSetTransitionSpeed();
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_STYLE:
				return isSetTransitionStyle();
			case PresentationPackage.DOCUMENT_ROOT__TRANSITION_TYPE:
				return isSetTransitionType();
			case PresentationPackage.DOCUMENT_ROOT__USE_DATE_TIME_NAME:
				return USE_DATE_TIME_NAME_EDEFAULT == null ? useDateTimeName != null : !USE_DATE_TIME_NAME_EDEFAULT.equals(useDateTimeName);
			case PresentationPackage.DOCUMENT_ROOT__USE_FOOTER_NAME:
				return USE_FOOTER_NAME_EDEFAULT == null ? useFooterName != null : !USE_FOOTER_NAME_EDEFAULT.equals(useFooterName);
			case PresentationPackage.DOCUMENT_ROOT__USE_HEADER_NAME:
				return USE_HEADER_NAME_EDEFAULT == null ? useHeaderName != null : !USE_HEADER_NAME_EDEFAULT.equals(useHeaderName);
			case PresentationPackage.DOCUMENT_ROOT__USER_TRANSFORMED:
				return isSetUserTransformed();
			case PresentationPackage.DOCUMENT_ROOT__VERB:
				return VERB_EDEFAULT == null ? verb != null : !VERB_EDEFAULT.equals(verb);
			case PresentationPackage.DOCUMENT_ROOT__VISIBILITY:
				return isSetVisibility();
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
		result.append(", action: ");
		if (actionESet) result.append(action); else result.append("<unset>");
		result.append(", animations1: ");
		if (animations1ESet) result.append(animations1); else result.append("<unset>");
		result.append(", backgroundObjectsVisible: ");
		if (backgroundObjectsVisibleESet) result.append(backgroundObjectsVisible); else result.append("<unset>");
		result.append(", backgroundVisible: ");
		if (backgroundVisibleESet) result.append(backgroundVisible); else result.append("<unset>");
		result.append(", class: ");
		if (classESet) result.append(class_); else result.append("<unset>");
		result.append(", classNames: ");
		result.append(classNames);
		result.append(", delay: ");
		result.append(delay);
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", displayDateTime: ");
		if (displayDateTimeESet) result.append(displayDateTime); else result.append("<unset>");
		result.append(", displayFooter: ");
		if (displayFooterESet) result.append(displayFooter); else result.append("<unset>");
		result.append(", displayHeader: ");
		if (displayHeaderESet) result.append(displayHeader); else result.append("<unset>");
		result.append(", displayPageNumber: ");
		if (displayPageNumberESet) result.append(displayPageNumber); else result.append("<unset>");
		result.append(", duration: ");
		result.append(duration);
		result.append(", effect: ");
		if (effectESet) result.append(effect); else result.append("<unset>");
		result.append(", endless: ");
		if (endlessESet) result.append(endless); else result.append("<unset>");
		result.append(", forceManual: ");
		if (forceManualESet) result.append(forceManual); else result.append("<unset>");
		result.append(", fullScreen: ");
		if (fullScreenESet) result.append(fullScreen); else result.append("<unset>");
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", masterElement: ");
		result.append(masterElement);
		result.append(", mouseAsPen: ");
		if (mouseAsPenESet) result.append(mouseAsPen); else result.append("<unset>");
		result.append(", mouseVisible: ");
		if (mouseVisibleESet) result.append(mouseVisible); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nodeType: ");
		if (nodeTypeESet) result.append(nodeType); else result.append("<unset>");
		result.append(", pages: ");
		result.append(pages);
		result.append(", pathId: ");
		result.append(pathId);
		result.append(", pause: ");
		result.append(pause);
		result.append(", placeholder1: ");
		if (placeholder1ESet) result.append(placeholder1); else result.append("<unset>");
		result.append(", playFull: ");
		if (playFullESet) result.append(playFull); else result.append("<unset>");
		result.append(", presentationPageLayoutName: ");
		result.append(presentationPageLayoutName);
		result.append(", presetClass: ");
		if (presetClassESet) result.append(presetClass); else result.append("<unset>");
		result.append(", presetId: ");
		result.append(presetId);
		result.append(", presetSubType: ");
		result.append(presetSubType);
		result.append(", show1: ");
		result.append(show1);
		result.append(", showEndOfPresentationSlide: ");
		if (showEndOfPresentationSlideESet) result.append(showEndOfPresentationSlide); else result.append("<unset>");
		result.append(", showLogo: ");
		if (showLogoESet) result.append(showLogo); else result.append("<unset>");
		result.append(", source: ");
		if (sourceESet) result.append(source); else result.append("<unset>");
		result.append(", speed: ");
		if (speedESet) result.append(speed); else result.append("<unset>");
		result.append(", startPage: ");
		result.append(startPage);
		result.append(", startScale: ");
		result.append(startScale);
		result.append(", startWithNavigator: ");
		if (startWithNavigatorESet) result.append(startWithNavigator); else result.append("<unset>");
		result.append(", stayOnTop: ");
		if (stayOnTopESet) result.append(stayOnTop); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", transitionOnClick: ");
		if (transitionOnClickESet) result.append(transitionOnClick); else result.append("<unset>");
		result.append(", transitionSpeed: ");
		if (transitionSpeedESet) result.append(transitionSpeed); else result.append("<unset>");
		result.append(", transitionStyle: ");
		if (transitionStyleESet) result.append(transitionStyle); else result.append("<unset>");
		result.append(", transitionType: ");
		if (transitionTypeESet) result.append(transitionType); else result.append("<unset>");
		result.append(", useDateTimeName: ");
		result.append(useDateTimeName);
		result.append(", useFooterName: ");
		result.append(useFooterName);
		result.append(", useHeaderName: ");
		result.append(useHeaderName);
		result.append(", userTransformed: ");
		if (userTransformedESet) result.append(userTransformed); else result.append("<unset>");
		result.append(", verb: ");
		result.append(verb);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
