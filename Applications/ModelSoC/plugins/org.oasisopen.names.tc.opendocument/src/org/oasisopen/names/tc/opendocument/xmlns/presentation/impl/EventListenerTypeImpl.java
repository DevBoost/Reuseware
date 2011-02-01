/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.ShowType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Listener Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getSound <em>Sound</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getStartScale <em>Start Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.EventListenerTypeImpl#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventListenerTypeImpl extends EObjectImpl implements EventListenerType {
	/**
	 * The cached value of the '{@link #getSound() <em>Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSound()
	 * @generated
	 * @ordered
	 */
	protected SoundType sound;

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
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType1 ACTUATE_EDEFAULT = ActuateType1.ON_REQUEST;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType1 actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

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
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected String eventName = EVENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType1 SHOW_EDEFAULT = ShowType1.EMBED;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType1 show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationSpeeds SPEED_EDEFAULT = PresentationSpeeds.MEDIUM;

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
	 * The default value of the '{@link #getStartScale() <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartScale()
	 * @generated
	 * @ordered
	 */
	protected static final String START_SCALE_EDEFAULT = "100%";

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
	 * This is true if the Start Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startScaleESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventListenerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.EVENT_LISTENER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundType getSound() {
		return sound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSound(SoundType newSound, NotificationChain msgs) {
		SoundType oldSound = sound;
		sound = newSound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__SOUND, oldSound, newSound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSound(SoundType newSound) {
		if (newSound != sound) {
			NotificationChain msgs = null;
			if (sound != null)
				msgs = ((InternalEObject)sound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.EVENT_LISTENER_TYPE__SOUND, null, msgs);
			if (newSound != null)
				msgs = ((InternalEObject)newSound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.EVENT_LISTENER_TYPE__SOUND, null, msgs);
			msgs = basicSetSound(newSound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__SOUND, newSound, newSound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__ACTION, oldAction, action, !oldActionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.EVENT_LISTENER_TYPE__ACTION, oldAction, ACTION_EDEFAULT, oldActionESet));
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
	public ActuateType1 getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType1 newActuate) {
		ActuateType1 oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType1 oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.EVENT_LISTENER_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__DIRECTION, oldDirection, direction, !oldDirectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.EVENT_LISTENER_TYPE__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__EFFECT, oldEffect, effect, !oldEffectESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.EVENT_LISTENER_TYPE__EFFECT, oldEffect, EFFECT_EDEFAULT, oldEffectESet));
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
	public String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(String newEventName) {
		String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType1 getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType1 newShow) {
		ShowType1 oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		ShowType1 oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.EVENT_LISTENER_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return showESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__SPEED, oldSpeed, speed, !oldSpeedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.EVENT_LISTENER_TYPE__SPEED, oldSpeed, SPEED_EDEFAULT, oldSpeedESet));
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
		boolean oldStartScaleESet = startScaleESet;
		startScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__START_SCALE, oldStartScale, startScale, !oldStartScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartScale() {
		String oldStartScale = startScale;
		boolean oldStartScaleESet = startScaleESet;
		startScale = START_SCALE_EDEFAULT;
		startScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.EVENT_LISTENER_TYPE__START_SCALE, oldStartScale, START_SCALE_EDEFAULT, oldStartScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartScale() {
		return startScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.EVENT_LISTENER_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.EVENT_LISTENER_TYPE__VERB, oldVerb, verb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.EVENT_LISTENER_TYPE__SOUND:
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
			case PresentationPackage.EVENT_LISTENER_TYPE__SOUND:
				return getSound();
			case PresentationPackage.EVENT_LISTENER_TYPE__ACTION:
				return getAction();
			case PresentationPackage.EVENT_LISTENER_TYPE__ACTUATE:
				return getActuate();
			case PresentationPackage.EVENT_LISTENER_TYPE__DIRECTION:
				return getDirection();
			case PresentationPackage.EVENT_LISTENER_TYPE__EFFECT:
				return getEffect();
			case PresentationPackage.EVENT_LISTENER_TYPE__EVENT_NAME:
				return getEventName();
			case PresentationPackage.EVENT_LISTENER_TYPE__HREF:
				return getHref();
			case PresentationPackage.EVENT_LISTENER_TYPE__SHOW:
				return getShow();
			case PresentationPackage.EVENT_LISTENER_TYPE__SPEED:
				return getSpeed();
			case PresentationPackage.EVENT_LISTENER_TYPE__START_SCALE:
				return getStartScale();
			case PresentationPackage.EVENT_LISTENER_TYPE__TYPE:
				return getType();
			case PresentationPackage.EVENT_LISTENER_TYPE__VERB:
				return getVerb();
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
			case PresentationPackage.EVENT_LISTENER_TYPE__SOUND:
				setSound((SoundType)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__ACTION:
				setAction((ActionType)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__ACTUATE:
				setActuate((ActuateType1)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__DIRECTION:
				setDirection((PresentationEffectDirections)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__EFFECT:
				setEffect((PresentationEffects)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__HREF:
				setHref((String)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__SHOW:
				setShow((ShowType1)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__SPEED:
				setSpeed((PresentationSpeeds)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__START_SCALE:
				setStartScale((String)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__VERB:
				setVerb((BigInteger)newValue);
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
			case PresentationPackage.EVENT_LISTENER_TYPE__SOUND:
				setSound((SoundType)null);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__ACTION:
				unsetAction();
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__ACTUATE:
				unsetActuate();
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__DIRECTION:
				unsetDirection();
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__EFFECT:
				unsetEffect();
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__SHOW:
				unsetShow();
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__SPEED:
				unsetSpeed();
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__START_SCALE:
				unsetStartScale();
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__TYPE:
				unsetType();
				return;
			case PresentationPackage.EVENT_LISTENER_TYPE__VERB:
				setVerb(VERB_EDEFAULT);
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
			case PresentationPackage.EVENT_LISTENER_TYPE__SOUND:
				return sound != null;
			case PresentationPackage.EVENT_LISTENER_TYPE__ACTION:
				return isSetAction();
			case PresentationPackage.EVENT_LISTENER_TYPE__ACTUATE:
				return isSetActuate();
			case PresentationPackage.EVENT_LISTENER_TYPE__DIRECTION:
				return isSetDirection();
			case PresentationPackage.EVENT_LISTENER_TYPE__EFFECT:
				return isSetEffect();
			case PresentationPackage.EVENT_LISTENER_TYPE__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case PresentationPackage.EVENT_LISTENER_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case PresentationPackage.EVENT_LISTENER_TYPE__SHOW:
				return isSetShow();
			case PresentationPackage.EVENT_LISTENER_TYPE__SPEED:
				return isSetSpeed();
			case PresentationPackage.EVENT_LISTENER_TYPE__START_SCALE:
				return isSetStartScale();
			case PresentationPackage.EVENT_LISTENER_TYPE__TYPE:
				return isSetType();
			case PresentationPackage.EVENT_LISTENER_TYPE__VERB:
				return VERB_EDEFAULT == null ? verb != null : !VERB_EDEFAULT.equals(verb);
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
		result.append(" (action: ");
		if (actionESet) result.append(action); else result.append("<unset>");
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", effect: ");
		if (effectESet) result.append(effect); else result.append("<unset>");
		result.append(", eventName: ");
		result.append(eventName);
		result.append(", href: ");
		result.append(href);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", speed: ");
		if (speedESet) result.append(speed); else result.append("<unset>");
		result.append(", startScale: ");
		if (startScaleESet) result.append(startScale); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", verb: ");
		result.append(verb);
		result.append(')');
		return result.toString();
	}

} //EventListenerTypeImpl
