/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import java.util.Collection;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getAnimations <em>Animations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getEndless <em>Endless</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getForceManual <em>Force Manual</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getFullScreen <em>Full Screen</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getMouseAsPen <em>Mouse As Pen</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getMouseVisible <em>Mouse Visible</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getPause <em>Pause</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getShow1 <em>Show1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getShowLogo <em>Show Logo</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getStartPage <em>Start Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getStartWithNavigator <em>Start With Navigator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getStayOnTop <em>Stay On Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.SettingsTypeImpl#getTransitionOnClick <em>Transition On Click</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SettingsTypeImpl extends EObjectImpl implements SettingsType {
	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected EList<ShowType> show;

	/**
	 * The default value of the '{@link #getAnimations() <em>Animations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations()
	 * @generated
	 * @ordered
	 */
	protected static final AnimationsType ANIMATIONS_EDEFAULT = AnimationsType.ENABLED;

	/**
	 * The cached value of the '{@link #getAnimations() <em>Animations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations()
	 * @generated
	 * @ordered
	 */
	protected AnimationsType animations = ANIMATIONS_EDEFAULT;

	/**
	 * This is true if the Animations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean animationsESet;

	/**
	 * The default value of the '{@link #getEndless() <em>Endless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndless()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ENDLESS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FORCE_MANUAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getMouseAsPen() <em>Mouse As Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouseAsPen()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MOUSE_AS_PEN_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_LOGO_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getStartWithNavigator() <em>Start With Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWithNavigator()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean START_WITH_NAVIGATOR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean STAY_ON_TOP_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.SETTINGS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShowType> getShow() {
		if (show == null) {
			show = new EObjectContainmentEList<ShowType>(ShowType.class, this, PresentationPackage.SETTINGS_TYPE__SHOW);
		}
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationsType getAnimations() {
		return animations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimations(AnimationsType newAnimations) {
		AnimationsType oldAnimations = animations;
		animations = newAnimations == null ? ANIMATIONS_EDEFAULT : newAnimations;
		boolean oldAnimationsESet = animationsESet;
		animationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__ANIMATIONS, oldAnimations, animations, !oldAnimationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnimations() {
		AnimationsType oldAnimations = animations;
		boolean oldAnimationsESet = animationsESet;
		animations = ANIMATIONS_EDEFAULT;
		animationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__ANIMATIONS, oldAnimations, ANIMATIONS_EDEFAULT, oldAnimationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnimations() {
		return animationsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__ENDLESS, oldEndless, endless, !oldEndlessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__ENDLESS, oldEndless, ENDLESS_EDEFAULT, oldEndlessESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__FORCE_MANUAL, oldForceManual, forceManual, !oldForceManualESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__FORCE_MANUAL, oldForceManual, FORCE_MANUAL_EDEFAULT, oldForceManualESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__FULL_SCREEN, oldFullScreen, fullScreen, !oldFullScreenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__FULL_SCREEN, oldFullScreen, FULL_SCREEN_EDEFAULT, oldFullScreenESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__MOUSE_AS_PEN, oldMouseAsPen, mouseAsPen, !oldMouseAsPenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__MOUSE_AS_PEN, oldMouseAsPen, MOUSE_AS_PEN_EDEFAULT, oldMouseAsPenESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__MOUSE_VISIBLE, oldMouseVisible, mouseVisible, !oldMouseVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__MOUSE_VISIBLE, oldMouseVisible, MOUSE_VISIBLE_EDEFAULT, oldMouseVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__PAUSE, oldPause, pause));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__SHOW1, oldShow1, show1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE, oldShowEndOfPresentationSlide, showEndOfPresentationSlide, !oldShowEndOfPresentationSlideESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE, oldShowEndOfPresentationSlide, SHOW_END_OF_PRESENTATION_SLIDE_EDEFAULT, oldShowEndOfPresentationSlideESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__SHOW_LOGO, oldShowLogo, showLogo, !oldShowLogoESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__SHOW_LOGO, oldShowLogo, SHOW_LOGO_EDEFAULT, oldShowLogoESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__START_PAGE, oldStartPage, startPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__START_WITH_NAVIGATOR, oldStartWithNavigator, startWithNavigator, !oldStartWithNavigatorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__START_WITH_NAVIGATOR, oldStartWithNavigator, START_WITH_NAVIGATOR_EDEFAULT, oldStartWithNavigatorESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__STAY_ON_TOP, oldStayOnTop, stayOnTop, !oldStayOnTopESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__STAY_ON_TOP, oldStayOnTop, STAY_ON_TOP_EDEFAULT, oldStayOnTopESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SETTINGS_TYPE__TRANSITION_ON_CLICK, oldTransitionOnClick, transitionOnClick, !oldTransitionOnClickESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.SETTINGS_TYPE__TRANSITION_ON_CLICK, oldTransitionOnClick, TRANSITION_ON_CLICK_EDEFAULT, oldTransitionOnClickESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.SETTINGS_TYPE__SHOW:
				return ((InternalEList<?>)getShow()).basicRemove(otherEnd, msgs);
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
			case PresentationPackage.SETTINGS_TYPE__SHOW:
				return getShow();
			case PresentationPackage.SETTINGS_TYPE__ANIMATIONS:
				return getAnimations();
			case PresentationPackage.SETTINGS_TYPE__ENDLESS:
				return getEndless();
			case PresentationPackage.SETTINGS_TYPE__FORCE_MANUAL:
				return getForceManual();
			case PresentationPackage.SETTINGS_TYPE__FULL_SCREEN:
				return getFullScreen();
			case PresentationPackage.SETTINGS_TYPE__MOUSE_AS_PEN:
				return getMouseAsPen();
			case PresentationPackage.SETTINGS_TYPE__MOUSE_VISIBLE:
				return getMouseVisible();
			case PresentationPackage.SETTINGS_TYPE__PAUSE:
				return getPause();
			case PresentationPackage.SETTINGS_TYPE__SHOW1:
				return getShow1();
			case PresentationPackage.SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE:
				return getShowEndOfPresentationSlide();
			case PresentationPackage.SETTINGS_TYPE__SHOW_LOGO:
				return getShowLogo();
			case PresentationPackage.SETTINGS_TYPE__START_PAGE:
				return getStartPage();
			case PresentationPackage.SETTINGS_TYPE__START_WITH_NAVIGATOR:
				return getStartWithNavigator();
			case PresentationPackage.SETTINGS_TYPE__STAY_ON_TOP:
				return getStayOnTop();
			case PresentationPackage.SETTINGS_TYPE__TRANSITION_ON_CLICK:
				return getTransitionOnClick();
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
			case PresentationPackage.SETTINGS_TYPE__SHOW:
				getShow().clear();
				getShow().addAll((Collection<? extends ShowType>)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__ANIMATIONS:
				setAnimations((AnimationsType)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__ENDLESS:
				setEndless((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__FORCE_MANUAL:
				setForceManual((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__FULL_SCREEN:
				setFullScreen((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__MOUSE_AS_PEN:
				setMouseAsPen((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__MOUSE_VISIBLE:
				setMouseVisible((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__PAUSE:
				setPause((Duration)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__SHOW1:
				setShow1((String)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE:
				setShowEndOfPresentationSlide((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__SHOW_LOGO:
				setShowLogo((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__START_PAGE:
				setStartPage((String)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__START_WITH_NAVIGATOR:
				setStartWithNavigator((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__STAY_ON_TOP:
				setStayOnTop((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case PresentationPackage.SETTINGS_TYPE__TRANSITION_ON_CLICK:
				setTransitionOnClick((TransitionOnClickType)newValue);
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
			case PresentationPackage.SETTINGS_TYPE__SHOW:
				getShow().clear();
				return;
			case PresentationPackage.SETTINGS_TYPE__ANIMATIONS:
				unsetAnimations();
				return;
			case PresentationPackage.SETTINGS_TYPE__ENDLESS:
				unsetEndless();
				return;
			case PresentationPackage.SETTINGS_TYPE__FORCE_MANUAL:
				unsetForceManual();
				return;
			case PresentationPackage.SETTINGS_TYPE__FULL_SCREEN:
				unsetFullScreen();
				return;
			case PresentationPackage.SETTINGS_TYPE__MOUSE_AS_PEN:
				unsetMouseAsPen();
				return;
			case PresentationPackage.SETTINGS_TYPE__MOUSE_VISIBLE:
				unsetMouseVisible();
				return;
			case PresentationPackage.SETTINGS_TYPE__PAUSE:
				setPause(PAUSE_EDEFAULT);
				return;
			case PresentationPackage.SETTINGS_TYPE__SHOW1:
				setShow1(SHOW1_EDEFAULT);
				return;
			case PresentationPackage.SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE:
				unsetShowEndOfPresentationSlide();
				return;
			case PresentationPackage.SETTINGS_TYPE__SHOW_LOGO:
				unsetShowLogo();
				return;
			case PresentationPackage.SETTINGS_TYPE__START_PAGE:
				setStartPage(START_PAGE_EDEFAULT);
				return;
			case PresentationPackage.SETTINGS_TYPE__START_WITH_NAVIGATOR:
				unsetStartWithNavigator();
				return;
			case PresentationPackage.SETTINGS_TYPE__STAY_ON_TOP:
				unsetStayOnTop();
				return;
			case PresentationPackage.SETTINGS_TYPE__TRANSITION_ON_CLICK:
				unsetTransitionOnClick();
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
			case PresentationPackage.SETTINGS_TYPE__SHOW:
				return show != null && !show.isEmpty();
			case PresentationPackage.SETTINGS_TYPE__ANIMATIONS:
				return isSetAnimations();
			case PresentationPackage.SETTINGS_TYPE__ENDLESS:
				return isSetEndless();
			case PresentationPackage.SETTINGS_TYPE__FORCE_MANUAL:
				return isSetForceManual();
			case PresentationPackage.SETTINGS_TYPE__FULL_SCREEN:
				return isSetFullScreen();
			case PresentationPackage.SETTINGS_TYPE__MOUSE_AS_PEN:
				return isSetMouseAsPen();
			case PresentationPackage.SETTINGS_TYPE__MOUSE_VISIBLE:
				return isSetMouseVisible();
			case PresentationPackage.SETTINGS_TYPE__PAUSE:
				return PAUSE_EDEFAULT == null ? pause != null : !PAUSE_EDEFAULT.equals(pause);
			case PresentationPackage.SETTINGS_TYPE__SHOW1:
				return SHOW1_EDEFAULT == null ? show1 != null : !SHOW1_EDEFAULT.equals(show1);
			case PresentationPackage.SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE:
				return isSetShowEndOfPresentationSlide();
			case PresentationPackage.SETTINGS_TYPE__SHOW_LOGO:
				return isSetShowLogo();
			case PresentationPackage.SETTINGS_TYPE__START_PAGE:
				return START_PAGE_EDEFAULT == null ? startPage != null : !START_PAGE_EDEFAULT.equals(startPage);
			case PresentationPackage.SETTINGS_TYPE__START_WITH_NAVIGATOR:
				return isSetStartWithNavigator();
			case PresentationPackage.SETTINGS_TYPE__STAY_ON_TOP:
				return isSetStayOnTop();
			case PresentationPackage.SETTINGS_TYPE__TRANSITION_ON_CLICK:
				return isSetTransitionOnClick();
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
		result.append(" (animations: ");
		if (animationsESet) result.append(animations); else result.append("<unset>");
		result.append(", endless: ");
		if (endlessESet) result.append(endless); else result.append("<unset>");
		result.append(", forceManual: ");
		if (forceManualESet) result.append(forceManual); else result.append("<unset>");
		result.append(", fullScreen: ");
		if (fullScreenESet) result.append(fullScreen); else result.append("<unset>");
		result.append(", mouseAsPen: ");
		if (mouseAsPenESet) result.append(mouseAsPen); else result.append("<unset>");
		result.append(", mouseVisible: ");
		if (mouseVisibleESet) result.append(mouseVisible); else result.append("<unset>");
		result.append(", pause: ");
		result.append(pause);
		result.append(", show1: ");
		result.append(show1);
		result.append(", showEndOfPresentationSlide: ");
		if (showEndOfPresentationSlideESet) result.append(showEndOfPresentationSlide); else result.append("<unset>");
		result.append(", showLogo: ");
		if (showLogoESet) result.append(showLogo); else result.append("<unset>");
		result.append(", startPage: ");
		result.append(startPage);
		result.append(", startWithNavigator: ");
		if (startWithNavigatorESet) result.append(startWithNavigator); else result.append("<unset>");
		result.append(", stayOnTop: ");
		if (stayOnTopESet) result.append(stayOnTop); else result.append("<unset>");
		result.append(", transitionOnClick: ");
		if (transitionOnClickESet) result.append(transitionOnClick); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SettingsTypeImpl
